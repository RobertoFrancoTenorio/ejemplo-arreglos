public class Estudiante{
    private String nombre;
    private int clave;
    public Estudiante(int claveIni,String nombreIni)
    {
        nombre=nombreIni;
        clave=claveIni;
    }
    
    public int dimeClave(){
        return clave;
    }
    
    public String dimeDetalles()
    {
        return "Clave" + clave + "Nombre"+nombre;
    }
}