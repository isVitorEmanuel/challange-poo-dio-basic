package POO.Challange1;

import POO.Challange1.Central.AparelhoTelefonico;
import POO.Challange1.Central.Navegador;
import POO.Challange1.Central.ReprodutorMusical;

public class IPhone {
    private ReprodutorMusical reproducer;
    private AparelhoTelefonico tel;
    private Navegador navegador;

    public IPhone() {
        this.reproducer = new ReprodutorMusical();
        this.tel = new AparelhoTelefonico();
        this.navegador = new Navegador();
    }

    public ReprodutorMusical getReproducer() { return reproducer; }
    public AparelhoTelefonico getTel() { return tel; }
    public Navegador getNavegador() { return navegador; }

    public void setReproducer(ReprodutorMusical reproducer) { this.reproducer = reproducer; }
    public void setTel(AparelhoTelefonico tel) { this.tel = tel; }
    public void setNavegador(Navegador navegador) { this.navegador = navegador; }
}
