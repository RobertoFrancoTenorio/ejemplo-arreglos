public class Estudiante{
    private String nombre;
    private int clave;
    
    /**
     * Metodo encargado de registrar a cada estudiante
     * @param recibe la informacion de cada alumno 
     */
    public Estudiante(int claveIni,String nombreIni)
    {
        nombre=nombreIni;
        clave=claveIni;
    }
    
    /**
     * Metodo para mostrar la clave de el alumno
     * @return Nos regresa la clave de el estudiante
     */
    public int dimeClave(){
        return clave;
    }
    
    /**
     * Metodo para mostrar la informacion de el estudiante
     * @return Se encarga de regresar la info. de el estudiante
     */
    public String dimeDetalles()
    {
        return "Clave" + clave + "Nombre"+nombre;
    }
}