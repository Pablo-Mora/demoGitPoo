public class Main {
    public static void main(String[] args) {

        System.out.println("Estamos practicando el SCV");
        String Name = "Pepito Perez";
        boolean status = true;

        // New enterprise

        Enterprise enter1 = new Enterprise("calle 44 #50-20","1cero1",30215697,
                true);

        enter1.datos();

        // New employed

        Employed em1 = new Employed("1cero1", "calle 44 # 50-20",30215697,true,
                "Junito Perez",515522055,"Masculino",2000000);

        em1.datos();
        em1.employed();
    }
}