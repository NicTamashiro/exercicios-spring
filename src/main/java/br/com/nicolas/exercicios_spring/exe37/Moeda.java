package br.com.nicolas.exercicios_spring.exe37;

public enum Moeda {
    DOLAR(5.11),
    EURO(5.85),
    REAIS(1.00);

    private final double valor;

    Moeda(double valor) {
        this.valor = valor;
    }

    public double converterPara(double valorEmReias){
        return valorEmReias / valor;
    }
}
