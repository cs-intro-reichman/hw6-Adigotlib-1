import java.awt.Color;

public class Editor4 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Editor4 <sourceImage> <n>");
            return;
        }

        String sourceFile = args[0];  
        int n = Integer.parseInt(args[1]);  

        Color[][] sourceImage = Runigram.read(sourceFile);
        
        Runigram.setCanvas(sourceImage);
        
        Color[][] grayImage = Runigram.grayScaled(sourceImage);
        
        Runigram.morph(sourceImage, grayImage, n);
    }
}
