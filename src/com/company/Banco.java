package com.company;

public class Banco implements Aprobador {
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
       EjecutivoDeCuenta ejecutivoDeCuenta = new EjecutivoDeCuenta();
       this.setNextAprobador(ejecutivoDeCuenta);

       LiderTeamEjecutivo liderTeamEjecutivo = new LiderTeamEjecutivo();
       this.setNextAprobador(liderTeamEjecutivo);

       Gerente gerente = new Gerente();
       this.setNextAprobador(gerente);

       next.solicitudDePrestamo(monto);
    }
}
