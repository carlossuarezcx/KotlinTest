open class Ciclista(nombre:String, estatura:Float, peso:Float, edad:Int, tipo_bici:String, velocidad:String ): Deportista(nombre, estatura, peso, edad) {
    val nombre_d = nombre
    val estatura_d= estatura
    val peso_d= peso
    val tipo_bici_d=tipo_bici
    val velocidad_d= velocidad
    fun saludar(): String {
        return "Hola, soy "+ nombre_d+
                " mi estatura es: "+ estatura_d+" cm."+
                " mi peso es: "+peso_d+
                " y tengo una bici de: "+ tipo_bici_d+
                " mi velocidad es: "+ velocidad_d
    }
}