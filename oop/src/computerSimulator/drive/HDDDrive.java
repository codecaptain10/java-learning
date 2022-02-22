package computerSimulator.drive;

import computerSimulator.File;
import computerSimulator.drive.Drive;

import java.util.ArrayList;
import java.util.Optional;

public class HDDDrive implements Drive {
    ArrayList<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
       for(File file : files){
           System.out.println(file.getName());
       }
    }

    @Override
    public File findFile(String name){

       Optional<File> foundFile =  files.stream()
               .filter(file -> file.getName().equals(name))
               .findFirst();

       return foundFile.orElseThrow();
    }
}
