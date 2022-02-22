package computerSimulator;

import computerSimulator.drive.HDDDrive;
import computerSimulator.drive.SSDDrive;
import computerSimulator.usbdevice.MemoryStick;
import computerSimulator.usbdevice.Mouse;

public class App {
    public static void main(String[]args){
        //Computer with SSD Drive (interface instance)
        Monitor monitor = new Monitor();
        HDDDrive hddDrive = new HDDDrive();
       Computer computer = new Computer(monitor, hddDrive);

        //hddDrive.addFile(new File("How to learn Java ?"));
        //hddDrive.listFiles();

        MemoryStick memoryStick = new MemoryStick("Pendrive Stick");
        Mouse mouse = new Mouse("Mouse");

        computer.addUsbDevice(memoryStick);
        computer.addUsbDevice(mouse);
        computer.removeUsbDevice(memoryStick);
        computer.removeUsbDevice(mouse);
    }
}
