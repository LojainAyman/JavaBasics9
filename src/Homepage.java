import java.time.Duration;



public class Homepage extends parameters {

	public static void main(String[] args) {

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get(URL);
		
     	CustomerLogin.click();
	
		
		
	}

}
