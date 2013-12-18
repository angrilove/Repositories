package com.longcom.passport.user.dao;

import com.longcom.passport.user.User;

public interface UserDao {
	/**
	 * 添加用户。
	 * @param user 用户
	 */
	public void addUser(User user);

	/**
	 * 根据用户名获取用户。
	 * @param username 用户名
	 * @return 用户
	 */
	public User findUserByUsername(String username);

	/**
	 * 修改用户的密码。
	 * @param username 用户名
	 * @param newPassword 新密码
	 */
	public void updatePassword(String username, String newPassword);
}
