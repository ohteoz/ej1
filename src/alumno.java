public class alumno {
    public String nombre;
    public String apellidos;
    public int edad;
    public String dni;
    public Clase clase;

    public alumno (String nombre, String apellidos, int edad, String dni, Clase clase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    @Override public String toString() {
        return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nedad: " + edad + "\ndni: " + dni + "\n" + clase;
    }
}