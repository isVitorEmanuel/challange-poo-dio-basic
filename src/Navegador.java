package POO.Challange1.Central;

public class Navegador {
    public Navegador() { }

    public void showPage(String url) {
        if (url.isBlank()) {
            System.out.println("Show page from url" + url);
        }
    }

    public void updatePage(String url) {
        if (url.isBlank()) {
            System.out.println("Update page from url" + url);
        }
    }

    public void addAba() {
        System.out.println("New aba");
    }
}
