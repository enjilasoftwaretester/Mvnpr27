package Second_Script;

import org.testng.annotations.Test;

public class LoginPage 
{
  @Test
  public void Username() 
  {
	  System.out.println("The username should be mobile no or mail id ");
  }
  
  @Test
  public void Password() 
  {
	  System.out.println("The paasword should be in alpha numeric combination");
  }
  
  @Test
  public void ResetPassword() 
  {
	  System.out.println("The otp should be sent on mobile no to reset the password");
  }
  
  public void WrongAttempts() 
  {
	  System.out.println("The invalid error text should be dispalyed on wrong attempt  ");
  }
}
