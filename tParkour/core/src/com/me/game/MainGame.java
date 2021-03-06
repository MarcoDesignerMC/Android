package com.me.game;

import com.badlogic.gdx.Game;
import com.me.game.screen.Splash;

public class MainGame extends Game {
	Splash splash;

	@Override
	public void create() {
		setScreen(new Splash());
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

}
