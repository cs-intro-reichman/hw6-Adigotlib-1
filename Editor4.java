import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
    {
        
        String sourceFile = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] sourceImage = Runigram.read(sourceFile);
        
        Runigram.setCanvas(sourceImage);
        
        Color[][] grayImage = Runigram.grayScaled(sourceImage);
        
        Runigram.morph(sourceImage, grayImage, n);
    }
}
}