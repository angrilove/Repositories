package com.longcom.passport.user;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {
	private static final long serialVersionUID = -4122305052323742376L;

	private Integer id;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 创建时间
	private Date createdTime;
	// 加密盐（片断）
	private String saltStr;
	// 状态
	private int status;

	private static final boolean enabled = true;
	private static final boolean accountNonExpired = true;
	private static final boolean accountNonLocked = true;
	private static final boolean credentialsNonExpired = true;

	// private Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

	/**
	 * 获取加密盐。
	 * 
	 * @return 加密盐
	 */
	public String getSalt() {
		return new StringBuilder(username).append('!').append(saltStr).toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getSaltStr() {
		return saltStr;
	}

	public void setSaltStr(String saltStr) {
		this.saltStr = saltStr;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
