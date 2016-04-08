package dat14aatkea.bazarplatformer.Platform;

import android.graphics.Bitmap;

import dat14aatkea.bazarplatformer.Game;
import dat14aatkea.bazarplatformer.Screen;

/**
 * Created by Alex on 04-04-2016.
 */
public class LevelScreen extends Screen {

    Bitmap background;
    Bitmap levels;
    Bitmap text;



    public LevelScreen(Game game) {
        super(game);
         background = game.loadBitmap("background.png");
         levels = game.loadBitmap("o.png");
         text = game.loadBitmap("levelText.png");
       //game.loadBitmap("");


    }

    @Override
    public void update(float deltaTime) {
        game.drawBitmap(background, 0 , 0);
        game.drawBitmap(text, 160-111/2, 80);
        game.drawBitmap(levels, 160 - 230 / 2, 150, 5, 5 , 230, 167);

        if(game.isTouchDown(0)){
            game.setScreen(new GameScreen(game));
        }

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
