package smse.service.impl;

import smse.dao.IUserDao;
import smse.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao;
	
	public int getTotalCount() {
		return userDao.getTotalCount();
	}

	// getter and setter
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
