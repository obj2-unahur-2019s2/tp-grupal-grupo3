public class Banco {

    public void solicitudPrestamo(int monto){
        if (monto <= 10000){
            System.out.println("Prestamo aprobado por el ejecutivo de cuentas del banco");
        } else if(monto > 10000 && monto <= 50000 ) {
            System.out.println("Prestamo aprobado por el lider Ejecutivo del banco.");
        } else if(monto > 50000 && monto <= 100000) {
            System.out.println("Prestamo aprobado por el gerente del banco.");
        } else if(monto > 100000) {
            System.out.println("Prestamo aprobado por el director del banco");
        }
    }

}
