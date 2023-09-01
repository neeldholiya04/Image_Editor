import java.util.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class index {
    // ---------------GRAY SCALE IMAGE--------------------
    static BufferedImage convertToGrayScale(BufferedImage inputImage) {
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                outputImage.setRGB(j, i, inputImage.getRGB(j, i));
            }
        }
        return outputImage;
    }
    // ----------------GRAY SCALE IMAGE ENDS--------------------

    // ---------------------CHANGE BRIGHTNESS-------------------------
    static BufferedImage changeBrightness(BufferedImage inputImage, int increase) {
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color pixel = new Color(inputImage.getRGB(j, i));
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                red += red * increase / 100;
                green += green * increase / 100;
                blue += blue * increase / 100;
                if (red > 255) {
                    red = 255;
                }
                if (green > 255) {
                    green = 255;
                }
                if (blue > 255) {
                    blue = 255;
                }

                if (red < 0) {
                    red = 0;
                }
                if (green < 0) {
                    green = 0;
                }
                if (blue < 0) {
                    blue = 0;
                }

                Color newPixel = new Color(red, green, blue);
                outputImage.setRGB(j, i, newPixel.getRGB());
            }
        }
        return outputImage;
    }
    // ----------------CHANGE BRIGHTNESS ENDS--------------------

    //--------------------Clockwise Rotation---------------------
    static BufferedImage rotateClockwise(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(i, j, inputImage.getRGB(j, height-i-1));
            }
        }
        return outputImage;
    }
    //--------------------Clockwise Rotation Ends---------------------

    //--------------------AntiClockwise Rotation---------------------
    static BufferedImage rotateAntiClockwise(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(height, width, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(i, j, inputImage.getRGB(width-j-1, i));
            }
        }
        return outputImage;
    }
    //--------------------Clockwise Rotation Ends---------------------

    //--------------------Flip Horizontal---------------------
    static BufferedImage flipHorizontal(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(j, i, inputImage.getRGB(width-j-1, i));
            }
        }
        return outputImage;
    }   
    //--------------------Flip Horizontal Ends---------------------

    //--------------------Flip Vertical---------------------
    static BufferedImage flipVertical(BufferedImage inputImage){
        int height = inputImage.getHeight();
        int width = inputImage.getWidth();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                outputImage.setRGB(j, i, inputImage.getRGB(j, height-i-1));
            }
        }
        return outputImage;
    }
    //--------------------Flip Vertical Ends---------------------

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        File inputFile = new File("43911.jpg");
        BufferedImage outputImage = null; 
        System.out.println("TO CONVERT YOUR IMAGE INTO GRAYSCALE, ENTER 1");
        System.out.println("TO CHANGE THE BRIGHTNESS OF IMAGE, ENTER 2");
        System.out.println("TO ROTATE YOUR IMAGE CLOCKWISE, ENTER 3");
        System.out.println("TO ROTATE YOUR IMAGE ANTICLOCKWISE, ENTER 4");
        System.out.println("TO FLIP YOUR IMAGE HORIZONTALLY, ENTER 5");
        System.out.println("TO FLIP YOUR IMAGE VERTICALLY, ENTER 6");

        System.out.print("Enter the Option: ");
        int option= sc.nextInt();
        try {
            BufferedImage inputImage = ImageIO.read(inputFile);
            
            switch(option){
                case 1:
                    // --Gray Scale Image--
                    outputImage = convertToGrayScale(inputImage);
                    break;
                    // --Gray Scale Image Ends--
                case 2:
                    // --change brightness--
                    System.out.print("Enter the percentage of brightness to increase: ");
                    int increase = sc.nextInt();
                    outputImage = changeBrightness(inputImage, increase);
                    break;
                    // --change brightness ends--
                case 3:
                    // --rotate clockwise--
                    outputImage = rotateClockwise(inputImage);
                    break;
                    // --rotate clockwise ends--
                case 4:
                    // -- rotate anticlockwise --
                    outputImage = rotateAntiClockwise(inputImage);
                    break;
                    // -- rotate anticlockwise ends --
                case 5:
                    // -- flip horizontal --
                    outputImage = flipHorizontal(inputImage);
                    break;
                    // -- flip horizontal ends --
                case 6:
                    // -- flip vertical --
                    outputImage = flipVertical(inputImage);
                    break;
                    // -- flip vertical ends --
                default:
                    System.out.println("Invalid Input!");
                }
                
                
            File outputImageFile = new File("OutputImage.jpg");
            ImageIO.write(outputImage, "jpg", outputImageFile);
            //--flip vertical ends--
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();


    }
}