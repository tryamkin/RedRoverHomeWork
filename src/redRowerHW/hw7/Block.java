package redRowerHW.hw7;

public class Block {
    /*`getWidth()` return the width of the `Block`

           `getLength()` return the length of the `Block`

           `getHeight()` return the height of the `Block`

           `getVolume()` return the volume of the `Block`

           `getSurfaceArea()` return the surface area of the `Block`*/

     private    int widh;
     private    int lenght;
     private    int height;
     private    int volume;

     private    int surface_area;


        public Block (int [] args) {
            widh = args[0];
            lenght = args[1];
            height=args[2];

        }
        public int getWidth() {
            return widh;
        }
        public int getLength(){
            return lenght;
        }
        public int getHeight() {
            return height;
        }

        public int getVolume() {
            System.out.println(widh * lenght * height);
            return volume = widh * lenght * height;
        }

        public int getSurfaceArea(){
            return   surface_area = 2 * (widh * lenght + widh * height + lenght * height);
        }
}
