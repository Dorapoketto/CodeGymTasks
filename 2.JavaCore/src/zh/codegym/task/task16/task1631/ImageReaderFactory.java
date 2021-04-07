package zh.codegym.task.task16.task1631;

import zh.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes){
        ImageReader imageReader;
        if (imageTypes == ImageTypes.JPG){
            imageReader = new JpgReader();
        }else if (imageTypes == ImageTypes.BMP){
            imageReader = new BmpReader();

        }else if (imageTypes == ImageTypes.PNG){
            imageReader = new PngReader();
        }else {
            throw new IllegalArgumentException("未知图像类型");
        }
        return imageReader;
    }
}
