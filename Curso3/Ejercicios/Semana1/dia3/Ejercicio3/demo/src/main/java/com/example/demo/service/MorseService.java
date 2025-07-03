package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MorseService implements MorseServiceInterface {

    private static Map<Character, String> morse = new HashMap<>();

    static {
        morse.put('A', "· -");
        morse.put('B', "- · · ·");
        morse.put('C', "- · - ·");
        morse.put('D', "- · ·");
        morse.put('E', "·");
        morse.put('F', "· · - ·");
        morse.put('G', "- - ·");
        morse.put('H', "· · · ·");
        morse.put('I', "· ·");
        morse.put('J', "· - - -");
        morse.put('K', "- · -");
        morse.put('L', "· - · ·");
        morse.put('M', "- -");
        morse.put('N', "- ·");
        morse.put('O', "- - -");
        morse.put('P', "· - - ·");
        morse.put('Q', "- - · -");
        morse.put('R', "· - ·");
        morse.put('S', "· · ·");
        morse.put('T', "-");
        morse.put('U', "· · -");
        morse.put('V', "· · · -");
        morse.put('W', "· - -");
        morse.put('X', "- · · -");
        morse.put('Y', "- · - -");
        morse.put('Z', "- - · ·");

        morse.put('0', "- - - - -");
        morse.put('1', "· - - - -");
        morse.put('2', "· · - - -");
        morse.put('3', "· · · - -");
        morse.put('4', "· · · · -");
        morse.put('5', "· · · · ·");
        morse.put('6', "- · · · ·");
        morse.put('7', "- - · · ·");
        morse.put('8', "- - - · ·");
        morse.put('9', "- - - - ·");
    }

    @Override
    public String palabraAMorse(String texto) {
        if (texto == null || texto.isBlank()) {
            throw new IllegalArgumentException("El texto no puede estar vacía");
        }

        StringBuilder resultado = new StringBuilder();
        String[] palabras = texto.trim().toUpperCase().split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            for (char c : palabra.toUpperCase().toCharArray()) {
                if (!morse.containsKey(c)) {
                    throw new IllegalArgumentException("Carácter inválido: '" + c + "'. Solo se permiten letras y números.");
                }
                String codigo = morse.get(c);
                if (codigo != null) {
                    resultado.append(codigo).append(" ");
                }
            }
            if(i< palabras.length-1){
                resultado.append("  ");
            }
        }
        return resultado.toString().trim();
    }
}