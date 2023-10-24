public class myHeroe extends Heroe{
    String Nombre;
    String Símbolo;
    String Habilidades;
    String Enemigos;
    String Traje;
    int Edad;

    public myHeroe(int salud, int energia, String nombre, String símbolo, String habilidades, String enemigos, String traje, int edad) {
        super(salud, energia);
        Nombre = nombre;
        Símbolo = símbolo;
        Habilidades = habilidades;
        Enemigos = enemigos;
        Traje = traje;
        Edad = edad;
    }

    public void volar(){

    }
    public void veloz(){

    }
    public void fuerte(){

    }
    public void superPoder(){
        setEnergia(getEnergia() - 1);
        this.saltar();
        this.veloz();

    }

    public void superAtaque(){
        setSalud(getSalud() - 1);


    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSímbolo() {
        return Símbolo;
    }

    public void setSímbolo(String símbolo) {
        Símbolo = símbolo;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String habilidades) {
        Habilidades = habilidades;
    }

    public String getEnemigos() {
        return Enemigos;
    }

    public void setEnemigos(String enemigos) {
        Enemigos = enemigos;
    }

    public String getTraje() {
        return Traje;
    }

    public void setTraje(String traje) {
        Traje = traje;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
