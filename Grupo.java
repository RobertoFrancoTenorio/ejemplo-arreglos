public class Grupo{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes= new Estudiante[totalEstudiantes];
        this.nomMateria=nomMateria;
    }
    
    public void inscribir(Estudiante unEstudiante)
    {
        if (estudiantes[0]==null){
            estudiantes[0]=unEstudiante;
        }
    }
    
    public void darBaja(int claveEstudiante){
    //Buscar el estudiante con la clave y asignarle null
    }
}