package basica;

public class Processos {

    private long pid;
    private String conteudo;
    
    public Processos() {
    }

    public Processos(int pid, String conteudo) {
        this.pid = pid;
        this.conteudo = conteudo;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Processos: pid=" + pid + ", conteudo=" + conteudo + "]";
    } 

    
    
}
