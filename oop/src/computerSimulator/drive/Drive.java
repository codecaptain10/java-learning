package computerSimulator.drive;

import computerSimulator.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
