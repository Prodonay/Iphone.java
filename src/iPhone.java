public class iPhone implements InternetBrowser {

    // Implementação dos métodos da interface InternetBrowser
    @Override
    public void displayPage() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void addPage() {
        System.out.println("Adicionando página...");
    }

    @Override
    public void updatePage() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();

        // Testando funcionalidades do navegador de internet
        myiPhone.displayPage();
        myiPhone.addPage();
        myiPhone.updatePage();
    }
}
