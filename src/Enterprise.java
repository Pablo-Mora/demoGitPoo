public class Enterprise {
    private String direction;
    private String name;
    private int telefono;
    private boolean international;

    public Enterprise(String direction, String name, int telefono, boolean international) {
        this.direction = direction;
        this.name = name;
        this.telefono = telefono;
        this.international = international;
    }

    public void datos(){
        System.out.println("Nombre: " + this.name + "\nDireccion:" + this.direction + "\nTelefono: "
                + this.telefono + "\nInternacional:" + this.international);
    }
}
