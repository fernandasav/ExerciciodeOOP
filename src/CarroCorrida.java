public class CarroCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        acelerar(velocidadeAtual);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado() {
        ligar();
    }

    public void acelerar(float novaVelocidade) {
        if (ligado && ((velocidadeAtual + novaVelocidade) <= velocidadeMaxima)){
            velocidadeAtual += novaVelocidade;
        } else {
            System.err.println("Não foi possivel acelerar o veiculo.");
        }
    }

    public void frear(float velocidadeFreagem) {
        if (ligado) {
            if (velocidadeFreagem > velocidadeAtual) {
                velocidadeAtual = 0;
            } else {
                velocidadeAtual -= velocidadeFreagem;
            }
        } else {
            System.err.println("Não foi possivel frear o veiculo, pois o mesmo esta desligado.");
        }
    }

    public void parar() {
        velocidadeAtual = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
        } else {
            System.out.println("Veiculo já esta ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
        } else {
            System.out.println("Veiculo já esta desligado.");
        }
    }
}