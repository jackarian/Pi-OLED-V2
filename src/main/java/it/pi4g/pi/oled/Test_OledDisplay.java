package it.pi4g.pi.oled;

public class Test_OledDisplay {

	/**
	 * 
	 */
	public Test_OledDisplay() {
		super();
		
	}
	public static void main(String args[]) {
		System.out.println("Test Oled Lcd");
		Test_OledDisplay app = new Test_OledDisplay();
		app.run();
		System.out.println("Finish test Oled Lcd");
		System.exit(0);
		
	}

	public void run() {
		
		try {
			System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "DEBUG");
			OLEDDisplay display  = new OLEDDisplay();
			
			display.drawStringCentered("Ciao World!", Font.FONT_5X8, 25, true);
			display.update();
			Thread.sleep(20000);
			display.shutdown();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
