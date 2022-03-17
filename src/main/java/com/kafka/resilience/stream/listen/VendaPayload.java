package com.kafka.resilience.stream.listen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class VendaPayload {

    public String descricao;
    public BigDecimal valor;
    public String loja;
    public BigDecimal desconto;

    @JsonProperty("valor_total")
    public BigDecimal valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getLoja() {
        return loja;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
