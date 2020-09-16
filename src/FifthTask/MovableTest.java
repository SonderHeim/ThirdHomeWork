package FifthTask;

public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle r = new MovableRectangle(1,2,3,4, 5,5);

        System.out.println(r);
        r.moveUp();
        System.out.println(r);
    }
}