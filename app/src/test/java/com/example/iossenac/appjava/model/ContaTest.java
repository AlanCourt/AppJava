package com.example.iossenac.appjava.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iossenac on 29/04/17.
 */
public class ContaTest {
    @Test
    public void depositarSucesso() {
        float valorEsperado = 300;
        float valorDepositado = 300;

        Conta conta = new Conta("A", "a", "a", 100);
        conta.depositar(valorDepositado);

        assertEquals(valorEsperado, conta.getSaldo(), 0);

    }

    @Test
    public void sacarSucesso() {

        float saldoEsperado = 100;
        float valorSacado = 100;

        Conta conta = new Conta("a", "a", "a", 200, 100);

        try {
            conta.sacar(valorSacado);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(saldoEsperado, conta.getSaldo(), 0);

    }

    @Test
    public void sacarErroSaldoInsuficiente() {

    }

    @Test
    public void transferirSucesso() {

    }

    @Test
    public void transferirErroValorMaior() {

    }

}