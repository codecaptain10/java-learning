package computerSimulator.drive;

import computerSimulator.File;
import computerSimulator.drive.Drive;

import java.util.Collection;
import java.util.HashMap;

public class SSDDrive implements Drive {

    HashMap<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.toString(),file);
    }

    @Override
    public void listFiles() {
        Collection<File> fileCollection = files.values();

        for(File file: fileCollection){
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }
}
