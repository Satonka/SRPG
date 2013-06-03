/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srpg;

import com.golden.gamedev.Game;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.object.AnimatedSprite;
import com.golden.gamedev.object.Sprite;
import com.golden.gamedev.object.background.ImageBackground;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;


/**
 *
 * @author sam
 */
public class Main extends Game {
    AnimatedSprite thingy;
    ImageBackground back;
    {distribute = true;}
        @Override
    public void initResources() {
            BufferedImage[] character = getImages("res/character sprite1.png", 1, 4);
            BufferedImage ground = getImage("res/map.png");
            
            back= new ImageBackground(ground);
            thingy= new AnimatedSprite(character, 32, 16);
            thingy.setBackground(back);
            
            
    }

    @Override
    public void update(long elapsedTime) {
        back.update(elapsedTime);
        thingy.update(elapsedTime);
        
        if (thingy.isOnScreen(0, 0, 0,-56)){
            if (keyPressed(KeyEvent.VK_DOWN)){
              thingy.move(0, 16);
              thingy.setAnimationFrame(0, 0);
            }
           }
        if (thingy.isOnScreen(0, -32, 0, 0)){
            if (keyPressed(KeyEvent.VK_UP)){
                thingy.move(0,-16);
                thingy.setAnimationFrame(1, 1);
            }
        }
        if (thingy.isOnScreen(-64, 0,0,0)){
            if (keyPressed(KeyEvent.VK_LEFT)){
                thingy.move(-16, 0);
                thingy.setAnimationFrame(2, 2);
            }
        }
        if (thingy.isOnScreen(0, 0,-64,0)){
            if (keyPressed(KeyEvent.VK_RIGHT)){
                thingy.move(16, 0);
                thingy.setAnimationFrame(3,3);
            }
        }
    }

    @Override
    public void render(Graphics2D g) {
        back.render(g);
        thingy.render(g);
        
    }

    public static void main (String[] args){
        GameLoader game = new GameLoader();
        game.setup(new Main(), new Dimension(320, 320), false);
        game.start();
    }
}
