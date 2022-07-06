package designPatterns;

public class InfoRetun {

    private String tipo;
    private String menssagem;
    private Object obj;

    public InfoRetun() {}

    public String getTipo() {return tipo; }
    public void setTipo(String tipo) {this.tipo = tipo; }
    public String getMenssagem() { return menssagem; }
    public void setMenssagem(String menssagem) {this.menssagem = menssagem;}
    public Object getObj() { return obj;}
    public void setObj(Object obj) { this.obj = obj;}
}
