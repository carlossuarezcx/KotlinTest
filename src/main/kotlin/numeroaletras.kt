fun main() {
    var n : Int = 830
    if (n > 999){
        print("Número muy grande.")
    }else{
        digitos(n)
        println()
    }
    /*for(i in (0 .. 10)){
        n = rand(0,999)
        if (n > 999){
            print("Número muy grande.")
        }else{
            digitos(n)
            println()
        }
    }*/
}
fun rand(start: Int, end: Int): Int {
    require(start <= end) { "Illegal Argument" }
    return (start..end).random()
}
fun digitos(n:Int){
    var unidad: Int=(n % 10)
    var decena: Int = (n % 100 - unidad) / 10
    var centena: Int = (n % 1000 - unidad - decena) / 100
    numeroaletra(unidad,decena,centena)
}

fun numeroaletra(unidad:Int, decena: Int, centena:Int){

    if (unidad == 0 &&
        decena == 0 &&
        centena == 0 ){
        print("Cero")
    }else{

        var cadena : String = ""
        if(centena != 0 || decena != 0 || unidad != 0){
            if (centena == 1){
                if(decena == 0 && unidad ==0 ){
                    cadena="$cadena"+"CIEN "
                }else{
                    cadena="$cadena"+"CIENTO "
                    if(decena==1){
                        cadena="$cadena"+esp(unidad);
                    }else if (decena==2){
                        cadena="$cadena"+esp2(unidad);
                    }else{
                        if(decena==0 || unidad==0){
                            cadena="$cadena "+imprimirdecenas(decena)+" "+imprimirunidades(unidad);
                        }else{
                            cadena="$cadena "+imprimirdecenas(decena)+" Y "+imprimirunidades(unidad);
                        }

                    }
                }
            }else{
                cadena="$cadena "+imprimircentenas(centena)
                if(decena==1){
                    cadena="$cadena "+esp(unidad)
                }else if (decena==2){
                    cadena="$cadena "+esp2(unidad)
                }else{
                    if(decena==0 || unidad==0){
                        cadena="$cadena "+imprimirdecenas(decena)+" "+imprimirunidades(unidad);
                    }else{
                        cadena="$cadena "+imprimirdecenas(decena)+" Y "+imprimirunidades(unidad);
                    }
                }
            }
            cadena="$cadena";

        }
        //$cadena = str_replace('  ', ' ', $cadena);
        print (cadena.replace("  ", " "));
    }



}

fun imprimircentenas(numero:Int): String{
    when(numero){
        1->
        return "CIENTO";
        2 ->
        return "DOSCIENTOS";
        3->
        return "TRESCIENTOS";
        4->
        return "CUATROCIENTOS";
        5->
        return "QUINIENTOS";
        6->
        return "SEISCIENTOS";
        7->
        return "SETECIENTOS ";
        8->
        return "OCHOCIENTOS";
        9->
        return "NOVECIENTOS";
    }
    return ""
}
fun imprimirdecenas(numero:Int) : String{
    when(numero){
        1->
            return "DIEZ";
        2->
            return "VEINTE";
        3->
            return "TREINTA";
        4->
            return "CUARENTA";
        5->
            return "CINCUENTA";
        6->
            return "SESENTA";
        7->
            return "SETENTA";
        8->
            return "OCHENTA";
        9->
            return "NOVENTA";
    }
    return ""
}
fun imprimirunidades(numero:Int): String{
    when(numero){
        1->
            return "UN";
        2->
            return "DOS";
        3 ->
            return "TRES";
        4->
            return "CUATRO";
        5->
            return "CINCO";
        6->
            return "SEIS";
        7->
            return "SIETE";
        8->
            return "OCHO";
        9->
            return "NUEVE";
    }
    return ""
}
fun esp(numero: Int) : String{
    when(numero){
        0->
            return "DIEZ";
        1->
            return "ONCE";
        2->
            return "DOCE";
        3->
            return "TRECE";
        4->
            return "CATORCE";
        5->
            return "QUINCE";
        6->
            return "DIECISEIS";
        7->
            return "DIECISIETE";
        8->
            return "DIECIOCHO";
        9 ->
            return "DIECINUEVE";
    }

    return ""
}
fun esp2(numero : Int) : String{
    when(numero){
        0->
            return "VEINTE";
        1->
            return "VEINTIUNO";
        2->
            return "VEINTIDOS";
        3->
            return "VEINTITRES";
        4->
            return "VEINTICUATRO";
        5->
            return "VEINTICINCO";
        6->
            return "VEINTISEIS";
        7->
            return "VEINTISIETE";
        8->
            return "VEINTIOCHO";
        9 ->
            return "VEINTINUEVE";
    }
    return ""
}
