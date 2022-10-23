public class Principal {
    public static void main(String[] args) {
        Piloto Fernanda = new Piloto(
                "Fernanda",
                26,
                Sexo.FEMININO,
                "Ferrari"
        );
        CarroCorrida Ferrari = new CarroCorrida(
                546,
                Fernanda,
                250,
                0,
                false
        );
        imprime(Fernanda, Ferrari);
        Ferrari.ligar();
        imprime(Fernanda, Ferrari);
        Ferrari.acelerar(100);
        imprime(Fernanda, Ferrari);
        Ferrari.acelerar(200);
        imprime(Fernanda, Ferrari);
        Ferrari.frear(80);
        imprime(Fernanda, Ferrari);
        Ferrari.parar();
        imprime(Fernanda, Ferrari);
        Ferrari.desligar();
        imprime(Fernanda, Ferrari);
            }
    public static void imprime(Piloto piloto, CarroCorrida carroCorrida) {
        System.out.println(
                "Piloto: " + piloto.getNome() + "\n" +
                "Equipe: " + piloto.getEquipe() + "\n" +
                "Carro: " + carroCorrida.getNumeroCarro() + "\n" +
                "Velocidade Maxima: " + carroCorrida.getVelocidadeMaxima() + "\n" +
                "Velocidade Atual: " + carroCorrida.getVelocidadeAtual() + "\n" +
                "Carro ligado: " + carroCorrida.isLigado() + "." + "\n"
        );
    }
}
