package Third_Script;

import org.testng.annotations.Test;

public class HomePage 
{
  @Test
  public void SearchBar() 
  {
	 System.out.println("The search bar should allow space and symbol along with alphanumeric data"); 
  }
  
  @Test
  public void Electronics() 
  {
	 System.out.println("The Electronic product should be displayed on clicking Electronic Tab"); 
  }
  
  @Test
  public void ProductImage() 
  {
	 System.out.println("The product image should be clearly visible on homepage"); 
  }
}
