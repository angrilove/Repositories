package springexample.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import springexample.commands.LoginCommand;
import springexample.services.AccountService;
import springexample.services.AuthenticationService;

/**
 * 第一种配置SPRING MVC的方式
 * 参考：http://www.ibm.com/developerworks/cn/java/wa-spring3/index.html#resources
 * 
 * @author Anshen
 *
 */
public class LoginBankController extends SimpleFormController {
	
	public ModelAndView onSubmit(Object command) throws Exception {
		LoginCommand loginCommand = (LoginCommand) command;
		
		// authenticationService.authenticate(loginCommand);
		// AccountDetail accountdetail = accountService.getAccountSummary(loginCommand.getUserId());
		
		// return new ModelAndView(getSuccessView(), "accountdetail", accountdetail);
	}
	
	private AuthenticationService authenticationService;
	private AccountService accountService;
	
	public AuthenticationService getAuthenticationService() {
		return authenticationService;
	}
	public void setAuthenticationService(AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}
	public AccountService getAccountService() {
		return accountService;
	}
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
}
