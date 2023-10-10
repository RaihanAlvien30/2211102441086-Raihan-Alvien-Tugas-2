import greenfoot.*;

public class Cloud extends Actor {
    public Cloud() {
        // Inisialisasi gambar dengan menggunakan "Cloud.png"
        GreenfootImage cloudImage = new GreenfootImage("Cloud.png");

        // Memperbesar gambar cloud menjadi dua kali lipat ukuran aslinya
        int newWidth = cloudImage.getWidth() * 6;
        int newHeight = cloudImage.getHeight() * 6;
        cloudImage.scale(newWidth, newHeight);

        setImage(cloudImage);
    }

    public void act() {
        move(-2);
        if(getX() <= 0){
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));

    }
    }
}    