public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();
       cliente.setEdad(25);
       cliente.setNombre("carlos");
       cliente.setTelefono(7230161);
       cliente.setCredito(500);
       System.out.println("Edad del cliente " + cliente.getEdad());
       System.out.println("Nombre del cliente " + cliente.getNombre());
        System.out.println("Telefono del cliente " + cliente.getTelefono());
        System.out.println("Credito del cliente " + cliente.getCredito());

    }
}
class Persona {
    private int Edad;
    private String Nombre;
    private int Telefono;

    public void setEdad(int ed){this.Edad=ed;}
    public void setNombre(String nom){this.Nombre=nom;}
    public void setTelefono(int tl){this.Telefono=tl;}

    public  int getEdad(){return Edad;}
    public String getNombre(){return Nombre;}
    public int getTelefono(){return Telefono;}

}

class Cliente extends Persona{
    int Credito;
    public void setCredito(int cr){this.Credito=cr;}
    public int getCredito(){return Credito;}

}
class Trabajador extends Persona{
    int Salario;

    public void setSalario(int sa){this.Salario=sa;}
    public int getSalario(){return  Salario;}
}