public class Grupo{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    /**
     *Busca un estudiante por medio de su clave
     *@param claveEstudiante parametro que representa la clave del estudiante
     */
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes= new Estudiante[totalEstudiantes];
        this.nomMateria=nomMateria;
    }
    
    private int BuscarEstudiante(int claveEstudiante){
        for(int i=0;i < estudiantes.length;i++){
            if(estudiantes[i].dimeClave()==claveEstudiante){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Busca un espacio disponible
     * @return regresa la posicion nula dentro del arreglo
     */
    private int buscaEspacioDisponible(){
        for (int i=0; i<estudiantes.length;i++){
            if(estudiantes[i]==null){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Inscribe un estudiante nuevo 
     * @param unEstudiante es el objeto estudiante a incribir en el grupo
     * @return Regresa verdadero si el estudiante o falso en caso de que no
     *         no se pueda inscribir
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe=this.BuscarEstudiante(unEstudiante.dimeClave());
        if (existe!=-1){
            return false; //El estudiante esta inscrito
        }
        
        int posDisponible=this.buscaEspacioDisponible();
        if(posDisponible == -1){
            return false; //El arreglo está lleno
        }
        
        estudiantes[posDisponible]=unEstudiante;
        return true; //El estudiante fue inscrito
    }
    
    public void darBaja(int claveEstudiante){
    //Buscar el estudiante con la clave y asignarle null
        int i;
        for(i=0;i<estudiantes.length;i++){
            if(estudiantes[i].dimeClave()==claveEstudiante){
                estudiantes[i]=null;
            }
        }
    }
}