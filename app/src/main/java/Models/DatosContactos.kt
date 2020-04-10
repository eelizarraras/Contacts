package Models

class DatosContactos{
    companion object {
        fun createDataSet(): ArrayList<Contacto>{
            var list = ArrayList<Contacto>()
            //Here we add all information
            //nombre: String, apellido: String, numero: String
            list.add(Contacto("Juan", "Perez", "5516203880", genColor()))
            list.add(Contacto("Edgar", "Elizarraras", "5563170823", genColor()))
            list.add(Contacto("Rodrigo", "Villa", "5591126438", genColor()))
            list.add(Contacto("Enrique", "G.", "5541368249", genColor()))
            list.add(Contacto("Emmanuel", "Avila", "1637485932", genColor()))
            list.add(Contacto("Juan", "Perez", "5516203880", genColor()))
            list.add(Contacto("Edgar", "Elizarraras", "5563170823", genColor()))
            list.add(Contacto("Rodrigo", "Villa", "5591126438", genColor()))
            list.add(Contacto("Enrique", "G.", "5541368249", genColor()))
            list.add(Contacto("Emmanuel", "Avila", "1637485932", genColor()))

            return list
        }
        private fun genColor():Int{
            return (0..255).shuffled().first()
        }
    }
}
