package com.kafka.resilience.stream.listen;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

@Component("vendasListener")
public class VendaConsumer implements Consumer<Message<VendaPayload>> {

    @Override
    public void accept(final Message<VendaPayload> vendaPayload) {

        System.out.println("Descrição: " + vendaPayload.getPayload().descricao);
        System.out.println("Valor: " + vendaPayload.getPayload().valor);
        System.out.println("Loja: " + vendaPayload.getPayload().loja);
        System.out.println("Desconto: " + vendaPayload.getPayload().desconto);
        System.out.println("Valor total: " + vendaPayload.getPayload().valorTotal);
        System.out.println("-------------- Headers -------------------");
        System.out.println("service name: " + new String((byte[]) vendaPayload.getHeaders().get("service_name"), StandardCharsets.UTF_8));
        System.out.println("correlation id: " + new String((byte[]) vendaPayload.getHeaders().get("correlation_id"), StandardCharsets.UTF_8));
        System.out.println("id: " + vendaPayload.getHeaders().getId());
        System.out.println("offset: " + vendaPayload.getHeaders().get("kafka_offset"));

    }
}
