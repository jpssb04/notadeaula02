public class Corrida {
    private double distancia, tarifaBase, fatorDemanda;
    private int tempoEspera;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double calcularValorCorrida (){
        return ((distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida (){
        System.out.println("Distância: " + distancia);
        System.out.println("Tempo de Espera: " + tempoEspera);
        System.out.println("Tarifa Base: " + tarifaBase);
        System.out.println("Fator de Demanda: " + fatorDemanda);
    }
}
