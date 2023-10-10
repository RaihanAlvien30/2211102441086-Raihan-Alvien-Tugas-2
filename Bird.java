import greenfoot.*;
import java.util.Random;

public class Bird extends Actor {
    private GreenfootImage image1;
    private GreenfootImage image2;    
    private int frame = 1;
    private int animationDelay = 10;
    private int speed = 2; // Kecepatan gerakan Burung

    public void act() {
        animate();
        
        // Menggerakkan objek Bird
        move(speed);
        
        // Jika objek mencapai tepi dunia, maka berputar secara acak
        if (isAtEdge()) {
            Random rand = new Random();
            setRotation(rand.nextInt(360)); // Putar objek ke arah acak
        }
    }

    public Bird()
    {
        image1 = new GreenfootImage("1.png");
        image2 = new GreenfootImage("2.png");

        image1.scale(image1.getWidth() / 9, image1.getHeight() / 9);
        image2.scale(image2.getWidth() / 9, image2.getHeight() / 9);

        setImage(image1);
    }

    private void animate()
    {
        if (frame == animationDelay)
        {
            switchImage();
            frame = 1;
        }
        else
        {
            frame++;
        }
    }

    private void switchImage()
    {
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
}