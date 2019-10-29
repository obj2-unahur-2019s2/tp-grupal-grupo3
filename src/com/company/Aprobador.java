package com.company;

public interface Aprobador {

    void setNextAprobador(Aprobador aprobador);
    Aprobador getNextAprobador();
    void solicitudDePrestamo(int monto);
}
