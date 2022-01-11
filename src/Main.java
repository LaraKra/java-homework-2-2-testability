public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float imt = service.calculate(170, 70);
        //height в см
        System.out.println(imt);

    }
}