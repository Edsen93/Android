package dat14aatkea.bazarplatformer.Platform;

import android.graphics.Bitmap;
import android.util.Log;

import dat14aatkea.bazarplatformer.Game;
import dat14aatkea.bazarplatformer.Screen;

/**
 * Created by Alexander on 04-04-2016.
 */
public class MainMenu extends Screen {

    Bitmap mainmenu;
    Bitmap levelmanager;
    Bitmap exit;
    Bitmap logo;

    public MainMenu(Game game) {
        super(game);

        mainmenu = game.loadBitmap("background.png");
        levelmanager = game.loadBitmap("button_play.png");
        exit = game.loadBitmap("quit_button.png");
        logo = game.loadBitmap("lille_logo.png");
    }


    @Override
    public void update(float deltaTime) {



        game.drawBitmap(mainmenu, 0, 0);
        game.drawBitmap(logo, 160-200/2, 80);
        game.drawBitmap(levelmanager, (160 - 160/2), 220);
        game.drawBitmap(exit, 160-160/2, 320);





        if (game.isTouchDown(0) /*&& game.getTouchX(0) < levelmanager.getWidth() && game.getTouchY(0) < levelmanager.getHeight()*/){
            Log.d("Knapper","Jeg virker " + game.getTouchX(0) + game.getTouchY(0));
            game.setScreen(new LevelScreen(game));
            return;
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
