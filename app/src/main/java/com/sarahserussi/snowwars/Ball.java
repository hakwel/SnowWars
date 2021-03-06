package com.sarahserussi.snowwars;

import android.graphics.Bitmap;
import android.graphics.Rect;

/**
 * Created by sarahserussi on 12.03.15.
 */
public class Ball {

    private int ballPositionX;
    private int ballPositionY;
    private int ballSpeedX;
    private int ballSpeedY;
    private Speed speed;
    private Player player;
    private Bitmap bitmap;
    private int width, height, spriteWidth, spriteHeight;
    private Rect sourceRect;

    /* constructor */
    public Ball (Bitmap bitmap, int ballPositionX, int ballPositionY, int width, int height ){
        this.bitmap = bitmap;
        this.ballPositionX = ballPositionX;
        this.ballPositionY = ballPositionY;
        this.spriteWidth = width;
        this.spriteHeight = height;
        spriteWidth = bitmap.getWidth();
        spriteHeight= bitmap.getHeight();
        sourceRect = new Rect(0,0,spriteWidth,spriteHeight);
    }

    public int getBallPositionX() {
        return ballPositionX;
    }

    public void setBallPositionX(int ballPositionX) {
        this.ballPositionX = ballPositionX;
    }

    public int getBallPositionY() {
        return ballPositionY;
    }

    public void setBallPositionY(int ballPositionY) {
        this.ballPositionY = ballPositionY;
    }

    public Speed getSpeed() { return speed; }

    public void setSpeed(Speed speed) { this.speed = speed; }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setServePositionToPlayer1(){
        /* need to get screenWidth & screenHeight */
        this.setBallPositionX(200);
        this.setBallPositionY(200);
    }

    public void setServePositionToPlayer2(){
        /* need to get screenWidth & screenHeight */
        this.setBallPositionX(400);
        this.setBallPositionY(400);
    }

    /* checks if the ball touches the player, needs editing (bitmapRect) */
    public boolean touchesPlayer(Player player){
        if(this.getBallPositionX() == player.getPositionX()
                && this.getBallPositionY() == player.getPositionY()){
            return true;
        } else {
            return false;
        }
    }

}
