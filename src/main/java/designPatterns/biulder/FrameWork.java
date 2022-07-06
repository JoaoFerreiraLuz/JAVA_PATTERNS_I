package designPatterns.biulder;


//Utilizando como exemplo para Bulder vou criar a classe FrameWork
public class FrameWork {

    private String name;
    private String bancoDados;
    private String dbUser;
    private String dbPassword;
    private String dbHost;
    private Boolean tests;
    private Boolean webPack;
    private Boolean full;

    public FrameWork(String name, String bancoDados, String dbUser, String dbPassword, String dbHost, Boolean tests, Boolean webPack, Boolean full) {
        this.name = name;
        this.bancoDados = bancoDados;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
        this.dbHost = dbHost;
        this.tests = tests;
        this.webPack = webPack;
        this.full = full;
    }

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getBancoDados() { return bancoDados;}

    public void setBancoDados(String bancoDados) {this.bancoDados = bancoDados;}

    public String getDbUser() {return dbUser;}

    public void setDbUser(String dbUser) {this.dbUser = dbUser;}

    public String getDbPassword() {return dbPassword; }

    public void setDbPassword(String dbPassword) { this.dbPassword = dbPassword; }

    public String getDbHost() { return dbHost; }

    public void setDbHost(String dbHost) { this.dbHost = dbHost;}

    public Boolean getTests() {return tests; }

    public void setTests(Boolean tests) {  this.tests = tests; }

    public Boolean getWebPack() { return webPack; }

    public void setWebPack(Boolean webPack) {this.webPack = webPack; }

    public Boolean getFull() { return full;}

    public void setFull(Boolean full) { this.full = full; }
}
