/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srpg;

import com.golden.gamedev.object.AnimatedSprite;
import java.awt.event.KeyEvent;
import com.golden.gamedev.engine.input.AWTInput$InputListener;


/**
 *
 * @author sam
 */
public class character extends AnimatedSprite {

    AWTInput$InputListener listener;
    public void control(KeyEvent d,KeyEvent u, KeyEvent l, KeyEvent r){
        if (this.isOnScreen(0,0,0,-56)){
            if (keyPressed(d)){
                this.move(0, 16);
                this.setAnimationFrame(0, 0);
            }
           }
        if (this.isOnScreen(0,-32,0,0)){
            if (listener.keyPressed(u)){
                this.move(0,-16);
                this.setAnimationFrame( 0, 0);
            }
        }
        if (this.isOnScreen(-64,0,0,0)){
            if (keyPressed(l)){
                this.move(-16, 0);
                this.setAnimationFrame(2, 2);
            }
        }
        if (this.isOnScreen(0,0,-64,0)){
            if (keyPressed(r)){
                this.move(16, 0);
                this.setAnimationFrame(3,3);
            }
        }
        
}
    
}
