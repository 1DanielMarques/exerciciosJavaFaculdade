public class ex04 {

    public static void main(String[] args) {
        double habitantesA = 80000, habitantesB = 200000;
        int anos = 0;
        do {
            habitantesA = habitantesA + (habitantesA * 0.03);
            habitantesB = habitantesB + (habitantesB * 0.015);
            anos++;
        } while (habitantesA < habitantesB);
        System.out.println("Anos: " + anos);
    }
}
