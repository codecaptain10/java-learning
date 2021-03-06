package computerSimulator.drive;

import computerSimulator.file.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
