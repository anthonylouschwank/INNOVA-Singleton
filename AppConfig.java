public class AppConfig{
    private static AppConfig instance;
    private int Usuarios;
    private String UrlServidor;

    private AppConfig(String UrlServidor, int Usuarios){
        this.UrlServidor = UrlServidor;
        this.Usuarios = Usuarios;
    }

    public static synchronized AppConfig getInstance(){
        if (instance == null) {
            instance = new AppConfig("defaulturl",10);
        }
        return instance;
    }

    public String getUrl(){
        return this.UrlServidor;
    }

    public void changeUrl(String NewURL){
        this.UrlServidor = NewURL;
    }

    public int getUsuarios(){
        return this.Usuarios;
    }
}