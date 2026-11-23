public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.description();
        Rectangle rectangle2 = new Rectangle(4, 40);
        Rectangle rectangle3 = new Rectangle(3.5, 35.9);
        rectangle2.description();
        rectangle3.description();

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        stock1.getChangePercent();

    }
}
