public class GreaterOf3 {
    public static void main(String[] args) {
        int x = 1, y = 4, z = 5;
        System.out.printf("Given values:\nX: %d, Y: %d, Z: %d", x, y, z);
        if (x > y) {
            if (x > z) {
                System.out.println("\nX is greater");
            } else {
                System.out.println("\nZ is greater");
            }
        } else {
            if (y > z) {
                System.out.println("\nY is greater");
            } else {
                System.out.println("\nZ is greater");
            }
        }
    }
}

