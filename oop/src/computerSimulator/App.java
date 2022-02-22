package computerSimulator;

import computerSimulator.drive.HDDDrive;
import computerSimulator.drive.SSDDrive;
import computerSimulator.file.imageFile.GIFImageFile;
import computerSimulator.file.imageFile.JPGImageFile;
import computerSimulator.file.musicfile.MP3MusicFile;
import computerSimulator.usbdevice.MemoryStick;
import computerSimulator.usbdevice.Mouse;

public class App {
    public static void main(String[]args){
      GIFImageFile gif1 = new GIFImageFile("nazwa1.gif",100);
      JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg",200, 80);
      MP3MusicFile mp3file = new MP3MusicFile("plik.mp3",400,"ACDC", "Thunderstack",100);

      SSDDrive ssdDrive = new SSDDrive();
      ssdDrive.addFile(gif1);
      ssdDrive.addFile(jpg1);
      ssdDrive.addFile(mp3file);

        ssdDrive.listFiles();
        ssdDrive.findFile("plik.mp3");
        System.out.println(mp3file.getSize());

    }
}
