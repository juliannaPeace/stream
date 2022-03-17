package com.kafka.resilience.stream.listen;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("vendasListener")
public class VendaConsumer implements Consumer<VendaPayload> {

    @Override
    public void accept(final VendaPayload vendaPayload) {
        System.out.println("Descrição: " + vendaPayload.descricao);
        System.out.println("Valor: " + vendaPayload.valor);
        System.out.println("Loja: " + vendaPayload.loja);
        System.out.println("Desconto: " + vendaPayload.desconto);
        System.out.println("Valor total: " + vendaPayload.valorTotal);
    }
}
