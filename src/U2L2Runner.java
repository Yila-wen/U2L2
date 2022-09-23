public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();

        rect1.setWidth(125);
        rect2.setWidth(125);
        rect2.setLength(125);
        rect3.setWidth(125);

        rect1.calculatePerimeter();
        rect2.calculatePerimeter();
        rect3.calculatePerimeter();

        System.out.println("You need a total fencing of " + (rect1.calculatePerimeter() + rect2.calculatePerimeter() + rect3.calculatePerimeter()) + "feet");
        System.out.println("There is " + (rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea()) + " square feet that needs seeding.");
    }}
