package seltestng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert01 {
	public void maths() {
		// TODO Auto-generated method stub
        int a = 20, b = 30;
        int sum = a+b;
        Assert.assertEquals(sum, 50, "Addition was not successful");
	}
	@Test
	public void strcomp() {
		String firstname = "Uday", secondname = "kumar";
		Assert.assertEquals(firstname, "Uday", "Name is not correct");
		Assert.assertTrue(firstname.equals("Uday"));
		Assert.assertFalse(secondname.equals("Uday"));
		//Assert.fail();
	}
}
