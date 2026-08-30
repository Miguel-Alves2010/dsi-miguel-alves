// Prof, vou ser SINCERÃO. Eu usei praticamente tudo dessa atividade como exemplo do Rafael Leite, estava morrendo de sono e tudo que eu lia naquele tutorial APAGAVA DA MENTE.
// Eu lembrava de você ter pedido para alterar o nome "greetings" (As vezes minha memória é falha), então, alterei os comentários e o nome por "Numsei.java", "NumseiController.java" etc...
// Ainda pretendo ler o tutorial com mais clareza, mas, precisei pegar da atividade do leite porque, entre fazer e não fazer, preferi entregar pronto assim como o senhor pediu 🫡.
package com.api.aula08;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumseiController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/numsei")
    public Numsei greeting(@RequestParam(defaultValue = "Broski") String name) {
        return new Numsei(counter.incrementAndGet(), template.formatted(name));
    }
}