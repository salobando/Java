package LabJavaPOOAvanzado.Service;

import LabJavaPOOAvanzado.Model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    ArrayList<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva r){
        reservas.add(r);
    }

    public void eliminarReserva(int id){
        Reserva buscada = null;
        for (Reserva r : reservas) {
            if (r.getId() == id) {
                buscada = r;
                break;
            }
        }
        if (buscada != null){
            reservas.remove(buscada);
        }else {
            throw new IllegalArgumentException("no existe");
        }
    }

    public void listarReservas(){
        for (int i=0; i<reservas.toArray().length; i++){
            System.out.println(reservas.get(i));
        }
    }

    public void contarReservas(){
        int cont=0;
        for (int i=0; i<reservas.toArray().length; i++){
            cont++;
        }
        System.out.println("Total Reservas: "+cont);
    }


}
