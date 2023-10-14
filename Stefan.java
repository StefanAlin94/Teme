public class Stefan {

    public static void main(String[] args) {

        System.out.println("stefam");

        Masina masina = new Masina();
        masina.setCuloare("negru");
        masina.setDimensiune(20);
        masina.setRoti("17");

        masina = null;

        Exception(masina);




        System.out.println(masina);
    }

    public static void Exception (Masina masina) {
        throw new RuntimeException("nu are campurile completate");
    }

}
