package computerSimulator;

import java.util.ArrayList;

public class HDDDrive implements Drive{
    ArrayList<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        files.forEach(System.out::println);
    }

    @Override
    public File findFile(String name){
        return null;
    }
}
