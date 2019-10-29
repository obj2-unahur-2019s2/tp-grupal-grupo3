package com.company;

public class Gerente implements Aprobador {
    private Aprobador next;

    @Override
    public void setNextAprobador(Aprobador aprobador) {
        this.next = aprobador;
    }

    @Override
    public Aprobador getNextAprobador() {
        return next;
    }

    @Override
    public void solicitudDePrestamo(int monto) {
        if (monto > 50000 && monto <= 100000){
            System.out.println("Lo manejo yo, el gerente");
        }else{
            next.solicitudDePrestamo(monto);
        }
    }

}
