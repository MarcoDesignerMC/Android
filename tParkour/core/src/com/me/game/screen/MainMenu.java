package com.me.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class MainMenu implements Screen {

	TextureAtlas buttonAtlas;
	SpriteBatch batch;
	Sprite background, prova;
	Stage stage;

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		background.draw(batch);
		batch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		batch = new SpriteBatch();

		// BG
		Texture img = new Texture(Gdx.files.internal("Menu.png"));
		background = new Sprite(img);
		background.setSize(img.getWidth(), img.getHeight());
		background.setCenter(Gdx.graphics.getWidth() / 2,
				Gdx.graphics.getHeight() / 2);

		// BUTTON
		Skin skinLibgdx = new Skin(Gdx.files.internal("Button.png"));
		TextureAtlas ta = new TextureAtlas(
				Gdx.files.internal("assets/Button.pack"));

		skinLibgdx.addRegions(ta);

	}

	@Override
	public void hide() {
		dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		batch.dispose();
		stage.dispose();
	}

}
