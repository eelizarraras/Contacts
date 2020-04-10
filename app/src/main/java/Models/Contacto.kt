package Models

class Contacto (nombre: String, apellido: String, numero: String, color: Int) {
    private var nombre: String = ""
    private var apellido: String = ""
    private var numero: String = ""
    private var imageURL: String = ""
    private var color: Int = 0

    init {
        this.nombre = nombre
        this.apellido = apellido
        this.numero = numero
        this.color = color
    }

    public fun getFulName(): String {
        return nombre + " "+ apellido
    }

    public fun getNumber(): String{
        return numero
    }

    public fun getColor(): Int{
        return color
    }

    public fun setColor(newColor: Int){
        this.color = newColor
    }

}