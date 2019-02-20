package anztrax.main;

import org.freedesktop.cairo.*;

import org.freedesktop.cairo.Context;
import org.gnome.gtk.*;
import org.gnome.gtk.Gtk;

import java.io.IOException;

/**
 * Java Gnome tutorial
 *
 * This program draws a simple
 * drawing with the Cairo library.
 *
 * @author jan bodnar
 * website zetcode.com
 * last modified March 2009
 */

public class MainApp extends Window {

  public MainApp() {

    setTitle("Simple drawing");
    setDefaultSize(250, 200);
    setPosition(WindowPosition.CENTER);
    showAll();

    ImageSurface surface = new ImageSurface(Format.ARGB32, 1000, 1000);
    Context cr = new Context(surface);
    cr.setSource(0.0, 0.0, 0.0);
    cr.moveTo(25.0, 25.0);
    cr.lineTo(50.0, 100.01);
    cr.stroke();

    //this is red rectangle with fill
    Context cr2 = new Context(surface);
    cr2.scale(2, 2);
//    cr2.rotate(30);
    int x = 100;
    int y = 100;
    cr2.setSource(255.0, 0.0, 0.0);
    cr2.translate(100, 100);  //will be placed at position 200, 200
    cr2.rectangle(x, y, 200, 100);
    cr2.fill();

    System.out.println("Working Directory = " + System.getProperty("user.dir"));
    try {
      surface.writeToPNG("test2.jpg");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    Gtk.init(args);
    new MainApp();
    Gtk.main();
  }
}