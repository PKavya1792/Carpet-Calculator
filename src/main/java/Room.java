public class Room {

    // Data members//

    private float width;
    private float length;
    private float area;

    //Constructors

    public Room(float width, float length) {
        this.width = width;
        this.length = length;
    }

    //Accessors

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public float getArea() {
        area = this.width * this.length;
        return area;
    }

}
