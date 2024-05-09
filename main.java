public class main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.changeUrl("Salutations");
        System.out.println("La url del servidor es: " + config.getUrl() + " conteniendo a " + config.getUsuarios() + " usuarios.");
    }
}
