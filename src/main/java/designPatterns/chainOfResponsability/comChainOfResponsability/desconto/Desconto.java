package designPatterns.chainOfResponsability.comChainOfResponsability.desconto;

import designPatterns.chainOfResponsability.comChainOfResponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    /**
     * Este é um template Methodo.
     * Ele é um template do que deve ser feito mas as regras aplicadas estão nos metodos separados,
     * aproveitando uma parte de código comum para evitar duplicidade de código;
     * */
    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);

    }
