package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BoardRenderer {
	private Board board;
    private SpriteBatch batch;
    private Texture wallImage;
    
    public BoardRenderer(SpriteBatch batch, Board board) {
        this.board = board;
        this.batch = batch;
    }
 
    public void render() {
    	wallImage = new Texture("wall.png");
        batch.begin();
        for(int r = 0; r < board.getHeight(); r++) {
            for(int c = 0; c < board.getWidth(); c++) {
                int x = c * 40;
                int y = TripleFrog.HEIGHT - (r * 40) - 40;
 
                if(board.hasWallAt(r, c)) {
                    batch.draw(wallImage, x, y);
                } else if(board.hasDotAt(r, c)) {
                }
            }
        }
        batch.end();
    }
}
