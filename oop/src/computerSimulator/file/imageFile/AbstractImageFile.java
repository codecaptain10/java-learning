package computerSimulator.file.imageFile;

import computerSimulator.file.AbstractFile;
import computerSimulator.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {


    public AbstractImageFile(String name, int size) {
       super(name,size);
    }



    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }

}
