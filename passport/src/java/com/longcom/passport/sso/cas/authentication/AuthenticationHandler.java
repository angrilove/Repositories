package com.longcom.passport.sso.cas.authentication;

import org.jasig.cas.authentication.handler.AuthenticationException;
import org.jasig.cas.authentication.handler.PasswordEncoder;
import org.jasig.cas.authentication.handler.UnknownUsernameAuthenticationException;
import org.jasig.cas.authentication.handler.support.AbstractUsernamePasswordAuthenticationHandler;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;

import com.longcom.passport.user.User;
import com.longcom.passport.user.dao.UserDao;

public class AuthenticationHandler extends AbstractUsernamePasswordAuthenticationHandler {
	private UserDao userDao;

	@Override
	protected boolean authenticateUsernamePasswordInternal(UsernamePasswordCredentials credentials)
			throws AuthenticationException {
		String username = credentials.getUsername();
		User user = userDao.findUserByUsername(username);
		if (user == null) {
			throw new UnknownUsernameAuthenticationException();
		}
		PasswordEncoder passwordEncoder = this.getPasswordEncoder();
		// 对用户输入的密码加密。
		String str = new StringBuilder(credentials.getPassword()).append('{').append(user.getSalt()).append('}')
				.toString();
		String password2 = passwordEncoder.encode(str);
		return password2.equals(user.getPassword());
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
