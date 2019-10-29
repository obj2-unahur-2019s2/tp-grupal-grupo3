

public class Banco {

    public boolean solicitudPrestamo(int monto){
        if (monto <= 10000){
            System.out.println("Prestamo aprobado por el ejecutivo de cuentas del banco");
            return true;
        }else
        if(monto > 10000 && monto <= 50000 ) {
            System.out.println("Prestamo aprobado por el lider Ejecutivo del banco.");
            return true;
        }else
        if(monto > 50000 && monto <= 100000) {
            System.out.println("Prestamo aprobado por el gerente del banco.");
            return true;
        }else
        if(monto > 100000) {
            System.out.println("Prestamo aprobado por el director del banco");
            return true;
        }
        else{
            System.out.println("Prestamo no aprobado");
            return false;
        }
    }




}
