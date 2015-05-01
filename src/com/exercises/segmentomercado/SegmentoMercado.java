package com.exercises.segmentomercado;

import java.util.ArrayList;
import java.util.List;

public class SegmentoMercado {

    private String[] emailsPersonas = new String[10];
    private String[] auxiliar = new String[10];
    private String[] listaProveedores = new String[10];
    private List<Double> listaCuotaMercado = new ArrayList();


    public static void main(String... args){
        SegmentoMercado sm = new SegmentoMercado();
        sm.fillEmailsPersonas();
        sm.obtainProveedores();
        sm.notDuplicates();
        sm.cuotaMercado();
        sm.print();




    }

    private void fillEmailsPersonas(){

        emailsPersonas[0]="pep@ono.es";
        emailsPersonas[1]="pepo@jazztel.es";
        emailsPersonas[2]="pepi@movistar.es";
        emailsPersonas[3]="pepa@ono.es";
        emailsPersonas[4]="pepu@ono.es";
        emailsPersonas[5]="pepee@vodafone.es";
        emailsPersonas[6]="pepaa@simyo.es";
        emailsPersonas[7]="pepiin@vodafone.es";
        emailsPersonas[8]="pep@movistar.es";
        emailsPersonas[9]="pep@movistar.es";

    }

    private void obtainProveedores(){

        for (int x = 0; x<10;x++){
            String[] email = emailsPersonas[x].split("@");
            auxiliar[x]= email[1];
        }

    }

    public void print(){
        for(int x = 0; x < listaCuotaMercado.size(); x++){
            if(listaProveedores[x]!=null){
                System.out.println(listaProveedores[x]);
                System.out.println(listaCuotaMercado.get(x) + "%");
            }
        }


    }

    public void notDuplicates(){
        int exist = 0;
        int index = 0;
        for(int x=0; x<10;x++){
            String varListaProveedor = auxiliar[x];
            for(int y=0; y<10; y++){
                if(listaProveedores[y]==null) {
                    index = y;
                    break;
                }
                else if(varListaProveedor.equalsIgnoreCase(listaProveedores[y])) {
                    exist = -1;
                }
            }

            if (exist!=-1){
                listaProveedores[index]=varListaProveedor;
            }
            exist = 0;

            }
        }
    private void cuotaMercado(){
        for(int y =0;y<10; y++){
            int i = 0;
            for(int x =0;x<10; x++){
                if(listaProveedores[y] != null && listaProveedores[y].equalsIgnoreCase(auxiliar[x]))
                    i++;
            }
            listaCuotaMercado.add((double)i*100/emailsPersonas.length);
        }
    }

}
