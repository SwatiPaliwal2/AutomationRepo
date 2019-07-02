package testing;

import configuration.Config;

public class TestLogic {

	public static void main(String[] args)
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(Config.chromeDriverpath);
		System.out.println(Config.testDataPath);

	}

}
