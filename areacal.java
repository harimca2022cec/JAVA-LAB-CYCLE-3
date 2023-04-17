class areacal {
    public static void main(String[] args) {
        System.out.println("Rectangle area: " + calculateArea(10.0, 5.0));
        System.out.println("Circle area: " + calculateArea(7.0));
        System.out.println("Square area: " + calculateArea(8));
    }
    
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static int calculateArea(int side) {
        return side * side;
    }
}

