package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDao;
import pojo.LoginInfo;

public class LoginAction extends ActionSupport{

	String userName;
	String password;
	
	
	@Override
	public String execute() throws Exception {
		String statusCode = "";
		boolean isUserValid = LoginDao.isValidUser(new LoginInfo(userName, password));
		
		if(isUserValid)
		{
			statusCode="success";
		}else{
			statusCode="input";
		} 
		return statusCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
}
