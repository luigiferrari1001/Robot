/**
 * Un Robot evoluto
 * 
 * @author IS Italo Calvino Genova
 * @version 1.0 del 27.12.2016
 */
public class Robot {
    
    /** Crea un robot assegnandogli un nome. 
     *  Il robot è nella posizione (0,0) e orientato ad est 
     */
    public Robot(String nome){}
   
    /** 
     * Ruota il robot a destra, senza spostarlo.
     * Non agisce se il robot è esploso.
     */
    public void right(){}

    public void left(){}
    
    public void forward(){}
    
    public void forward(int n){}
    
    public void backward(){}
    
    public void backward(int n){}
    
    public void explode(){}
    
    public int getX(){return 1;}
    
    public int getY(){return 2;}
    
    /**
     * 0 = est,, 1 = nord, 2 =ovest, 3=sud
     */
    public int getDirection(){return 3;}      
    
    public boolean isExploded(){ return false;}
    
    /**
     *  "Robot <nome> in (4, -2) direction: Ovest"
     *  se esploso si aggiunge la dicitura EXPLODED in fondo.
     */
    public String toString(){
      return "Not yet implemented!"; 
    }   
    
    // Fase 2 
    public void addCommand(String name, String sequence){}
    
    public void execute(String command){}
    
    public String getProgram(){return "X";}
    
    public String getCommand(String name){return "Unknown";}
    
    public String[] commandList(){ 
        String[] s = {"flip", "flop"};
        return s;
    }
}
