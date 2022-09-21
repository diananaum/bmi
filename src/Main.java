public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        System.out.println();
        System.out.println("BMI:");
        System.out.println(service.calculate(1.90, 100));

        System.out.println();
        System.out.println("BMI:");
        System.out.println(service.calculate(1.75, 60));
    }
}
