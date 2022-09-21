fun main (x: Array<String>)
{
    var i = 0
    var nombre = "Carlos"
    println("Primer programa en kotlin, soy "+nombre)
    /*do {
        println(i)
        i++
    }while (i<10)
    while (i>=0){
        println(i)
        i--
    }*/
    val menu = setOf (
        setOf("Chiles en nogada","enchiladas queretanas","pozole","Tamales","Tacos","Pambazos"),
        setOf("350","100","120","20","15"),
        setOf("Chile, Granada", "Salsa verde","Maiz, Carne de puerco","Verde, Rojo", "Pastor, Bistec", "Papas, Carnitas, Salsa")
    )
    for (k in menu) {
        println(k)
    }
}