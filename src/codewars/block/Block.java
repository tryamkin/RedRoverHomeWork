package codewars.block;

public class Block {
   // int [width, length, height]
    int width;
    int length;
    int height;
    public Block(int [] arr  ) {
        this.width = arr[0];
        this.length=arr[1];
        this.height=arr[2];
    }
public  int getWidth() {
        return width;
}

public  int getLength() {
        return length;
}

public int getHeight(){
        return height;
}

public int getVolume() {
        return width*height*length;
}

    public int getSurfaceArea() {
        return (width * length + length * height + height * width)*2;
    }
/*`getWidth()` return the width of the `Block`
            `getLength()` return the length of the `Block`
            `getHeight()` return the height of the `Block`
            `getVolume()` return the volume of the `Block`
            `getSurfaceArea()` return the surface area of the `Block`*/
}
