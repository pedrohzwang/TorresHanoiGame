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
        if (this.diametro < 1000){
            switch (this.diametro){
                case 5:
                    desenho = "=========";
                    break;
                case 4:
                    desenho = " ======= ";
                    break;
                case 3:
                    desenho = "  =====  ";
                    break;
                case 2:
                    desenho = "   ===   ";
                    break;
                case 1:
                    desenho = "    =    ";
                    break;
            }
        }
        return desenho;
    }

    public String getDesenho() {
        return desenho;
    }
}
