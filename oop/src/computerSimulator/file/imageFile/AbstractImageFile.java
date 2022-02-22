package computerSimulator.file.imageFile;

import computerSimulator.file.File;
import computerSimulator.file.FileType;

public abstract class AbstractImageFile implements File {
    protected String name;
    protected int size;

    public AbstractImageFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }

}
