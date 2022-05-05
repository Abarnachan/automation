package com.test.Try;

import org.testng.annotations.Test;

//Execution
public class Testclass3
{
@Test(priority = 0)
public void getUrl()
{
Testclass2.url();
System.out.println("Enter 1st class");
}
}