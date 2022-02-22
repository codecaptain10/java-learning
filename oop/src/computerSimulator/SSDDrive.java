package computerSimulator;

import java.util.HashMap;

public class SSDDrive implements Drive{

    HashMap<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.toString(),file);
    }

    @Override
    public void listFiles() {
        
    }

    @Override
    public File findFile(String name) {
        return null;
    }
}
