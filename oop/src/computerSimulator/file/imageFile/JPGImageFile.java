package computerSimulator.file.imageFile;

import computerSimulator.file.File;
import computerSimulator.file.FileType;

public class JPGImageFile extends AbstractImageFile {

    int compression;

    public JPGImageFile(String name, int size,int compression) {
      super(name,size);
      this.compression = compression;

    }
    
    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Displaying JPG");
    }
}
