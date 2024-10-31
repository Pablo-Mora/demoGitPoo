public class Employed extends Enterprise {
    private String nameE;
    private int telefonoE;
    private String sexo;
    private float salary;

    public Employed(String name, String direction, int telefono, boolean international, String nameE, int telefonoE, String sexo, float salary)
    {
        super(direction, name, telefono, international);
        this.nameE = nameE;
        this.telefonoE = telefonoE;
        this.sexo = sexo;
        this.salary = salary;
    }

    public void employed(){
        System.out.println("Se contrato al empleado:" + this.nameE);
    }
}
