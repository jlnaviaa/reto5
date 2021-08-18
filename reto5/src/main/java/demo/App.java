package demo;

import demo.view.*;
import java.awt.EventQueue;

public class App 
{
    public static void main( String[] args ){
        
        EventQueue.invokeLater(new Runnable(){
            
            @Override
            public void run(){
                
                try {
                    VistaRequerimientosReto4 frame = new VistaRequerimientosReto4();
                    frame.setVisible(true);
                    
                }catch (Exception e){
                                    
                }
            }
        });
        


    }
}
