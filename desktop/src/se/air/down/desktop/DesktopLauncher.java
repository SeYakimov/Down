package se.air.down.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import se.air.down.Down;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Down.TITLE;
		config.width = Down.WIDTH;
		config.height = Down.HEIGHT;
		new LwjglApplication(new Down(), config);
	}
}
