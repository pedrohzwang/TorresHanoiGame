package estruturas;

public class Disco {

    private Integer diametro;
    private String desenho;

    public Disco(Integer diametro) {
        this.diametro = diametro;
        this.desenho = this.desenhar(diametro);
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return getDesenho();
    }

    private String desenhar(Integer diametro){
        String desenho = "";
        if (diametro < 1000){
            for (int i = 0; i <= diametro; i++){
                desenho += "=";
            }
        }
        return desenho;
    }

    public String getDesenho() {
        return desenho;
    }
}
