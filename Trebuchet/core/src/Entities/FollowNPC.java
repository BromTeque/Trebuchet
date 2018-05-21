package Entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Dead;
import world.gamemap;

public class FollowNPC extends Entity {

    private static final int SPEED = 20;
    int move = 0;

    public static Texture image;

    public FollowNPC(float x, float y, gamemap map){
        super(x, y, EntityType.FollowNPC, map);
        image = new Texture("FollowNPCLeft.png");
    }

    @Override
    public void update(float deltaTime, float gravity){
        super.update(deltaTime, gravity);

        if (Player.getx > (pos.x-64) && Player.getx < (pos.x)) {
            image = new Texture("FollowNPCLeft.png");
            moveX(-SPEED * deltaTime);
        }
        if (Player.getx > (pos.x) && Player.getx < (pos.x+64)) {
            image = new Texture("FollowNPCRight.png");
            moveX(SPEED * deltaTime);
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(image, pos.x, pos.y, getWidth(), getHeight());
        for(float i = 0;i<31;i++){
            if (Player.getx + i > pos.x && Player.getx + i < pos.x+26 && Player.gety + i > pos.y && Player.gety + i < pos.y+13){
                Dead.setDead(true);
            }}
    }
}