package computerSimulator;

import computerSimulator.drive.HDDDrive;
import computerSimulator.drive.SSDDrive;

public class App {
    public static void main(String[]args){
        //Computer with SSD Drive (interface instance)
        Monitor monitor = new Monitor();
        HDDDrive hddDrive = new HDDDrive();
       Computer computer = new Computer(monitor, hddDrive);

        hddDrive.addFile(new File("How to learn Java ?"));
        hddDrive.listFiles();
    }
}
