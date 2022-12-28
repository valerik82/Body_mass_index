public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 62; // person's weight in kilograms
        double height = 1.56; // person's height in metres

        int massIndex = (int) (service.calculate(weight, height)); //body mass index

        System.out.println(massIndex);
    }
}