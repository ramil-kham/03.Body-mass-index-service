public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        double index = service.calculate(65,174);
        System.out.println(index);
    }
}
