package mmn;

import java.io.IOException;

import org.openqa.selenium.remote.server.handler.GetElementDisplayed;

public class fbsamp extends FB  {
	public static void main(String[] args) throws IOException {
		launchbrowser();
		launchurl("https://www.facebook.com/");
		FBlogin l=new FBlogin();
		textuser(l.getTxtuser(),datadrive(1, 0));
		textuser(l.getTxtpass(), datadrive(1, 1));
		btnclick(l.getBt());
	}
	

	

}
