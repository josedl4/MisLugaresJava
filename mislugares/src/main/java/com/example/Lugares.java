package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joselm on 3/09/16.
 */
public class Lugares {
    protected static List<Lugar> vectorLugares = ejemploLugares();

    public Lugares(){
        vectorLugares = ejemploLugares();
    }

    static  Lugar elemento(int id){
        return vectorLugares.get(id);
    }

    static void anyade(Lugar lugar){
        vectorLugares.add(lugar);
    }

    static int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }

    static void borrar(int id){
        vectorLugares.remove(id);
    }

    public static int size(){
        return vectorLugares.size();
    }

    public static ArrayList<Lugar> ejemploLugares(){
        ArrayList<Lugar> lugares = new ArrayList<Lugar>();
        lugares.add(new Lugar("Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38995656, 962849300,
                "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse",
                5, TipoLugar.EDUCACION));

        lugares.add(new Lugar("Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38995656, 962849300,
                "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse",
                5, TipoLugar.EDUCACION));

        lugares.add(new Lugar("Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38995656, 962849300,
                "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse",
                5, TipoLugar.EDUCACION));

        lugares.add(new Lugar("Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38995656, 962849300,
                "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse",
                5, TipoLugar.EDUCACION));

        lugares.add(new Lugar("Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38995656, 962849300,
                "http://www.epsg.upv.es", "Uno de los mejores lugares para formarse",
                5, TipoLugar.EDUCACION));
    }
}
