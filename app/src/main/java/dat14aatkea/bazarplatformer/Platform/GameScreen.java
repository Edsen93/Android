package dat14aatkea.bazarplatformer.Platform;

import android.graphics.Bitmap;
import android.util.Log;

import dat14aatkea.bazarplatformer.Game;
import dat14aatkea.bazarplatformer.Screen;

/**
 * Created by Alex on 05-04-2016.
 */
public class GameScreen extends Screen {

    Bitmap background;
    Bitmap floater;
    Bitmap player;
    int floaterPos = 430;

    public GameScreen(Game game) {
        super(game);
        background = game.loadBitmap("background.png");
        floater = game.loadBitmap("floater4.png");
        player = game.loadBitmap("droid.png");

    }



    @Override
    public void update(float deltaTime) {
    game.drawBitmap(background, 0, 0);
    game.drawBitmap(floater, 0, 410);
        game.drawBitmap(floater, floater.getWidth(), floaterPos);
        game.drawBitmap(floater, floater.getWidth()+floater.getWidth(), 410);

        game.drawBitmap(player, 0, 415-floater.getHeight());
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
