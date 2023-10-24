import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Heroe implements Action{
    private int salud;
    private int energia;

    public Heroe(int salud, int energia) {
        this.salud = salud;
        this.energia = energia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEnergia() {

        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Heroe() {
        super();
    }

    @Override
    public void usarManos() {
        System.out.println("usando manos");
    }

    @Override
    public void usarPies() {
        System.out.println("usando pies");
    }

    @Override
    public void usarBoca() {
        System.out.println("usando boca");
    }

    @Override
    public void moverse() {
        System.out.println("moviendome");
    }

    @Override
    public void saltar() {
        System.out.println("saltando");
    }

    @Override
    public void hablar() {
        System.out.println("hablando");
    }
}
