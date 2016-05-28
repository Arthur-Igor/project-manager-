/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author mayke
 */
public class BackLogControl {
    
      private static BackLogControl controladorBacklog;
    
    //singleton
    public static BackLogControl getInstance(){
        if(controladorBacklog == null){
            controladorBacklog = new BackLogControl();
            return controladorBacklog;
        }
        return controladorBacklog;
    }
    
}
