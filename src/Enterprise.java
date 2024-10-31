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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean getInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public void datos(){
        System.out.println("Nombre: " + this.name + "\nDireccion:" + this.direction + "\nTelefono: "
                + this.telefono + "\nInternacional:" + this.international);
    }
}
