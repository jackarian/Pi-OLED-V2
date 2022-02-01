Pi OLED Display based on library pi4j (https://pi4j.com)
========================================================

A Java library to drive the popular monochrome 128x64 pixel OLED display (SSD1306)
from a Raspberry Pi. The display can be bought from Adafruit or from a lot of ebay
vendors.

This is basically a rough port of Adafruit's SSD1306 library for Arduino which
can be found here: https://github.com/adafruit/Adafruit_SSD1306

how to use?
============

The hardware should be connected to the i2c bus. Where the i2c bus pins
are located can be looked up e.g. here:
http://elinux.org/RPi_Low-level_peripherals#General_Purpose_Input.2FOutput_.28GPIO.29

The entire project is build with maven. Just clone the master branch, change to the cloned directory and run maven like this:

    mvn install

This should build everything correctly.

Then you can run the  class:

Test_OledDisplay

Note that you always need to call update() after you changed the content of the display
to actually get the content displayed on the hardware.

Also note that the default constructor assumes you have connected the display to
i2c port 1 and the display's i2c address is 0x3C. If this is not the case you
can use one of the constructors with more parameters.

