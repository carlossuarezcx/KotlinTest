open class Ciclista: Deportista() {
    var tipo_bici:String = ""
        get() = field
        set(value){
            field=value
        }
    var velocidad:String = ""
        get() = field
        set(value){
            field=value
        }

    fun saludar(): String {
        return "Hola, soy "+ this.nombre+" y tengo una bici de: "+ this.tipo_bici+" mi velocidad es "+ this.velocidad
    }
}