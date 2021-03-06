package com.sarahserussi.snowwars;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import android.view.SurfaceView;

/**
 * Created by sarahserussi on 12.03.15.
 */
public class GameState extends SurfaceView {

    private Player player1, player2;
    private Ball ball;

    float eX, eY;
    /* Where the touch methods go */
     /* init */
    public GameState (Context context) {
        super(context);
        //create player and load bitmap
        player1 = new Player(BitmapFactory.decodeResource(getResources(), R.drawable.playerright),
                200,200, //set player position
                64,64); //set size of bitmap

        player2 = new Player(BitmapFactory.decodeResource(getResources(), R.drawable.playerleft),
                600,200, //set player position
                64,64); //set size of bitmap

        //create ball and load bitmap
        ball = new Ball(BitmapFactory.decodeResource(getResources(), R.drawable.aquaball),
                300,300, //set ball position
                20,20);

        //make the game focusable so it can handle events
        setFocusable(true);
        //set servePos
        //add background
        //set new score

    }

    /* handles the player's movement
     * if the player is pressed, set touched to true and move the player where it's dragged
     * if the player is released, set touched to false and drop the player */
    public boolean onTouchEvent(MotionEvent event){
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            player1.handleActionDown((int) event.getX(), (int) event.getY());

            if (player1.isTouched()){
                player1.setPositionX((int) event.getX());
                player1.setPositionY((int) event.getY());
            }
        }

        if (event.getAction() == MotionEvent.ACTION_UP){
            if (player1.isTouched()){
                player1.setTouched(false);
            }
        }
        return true;
    }

     /* Control the player with your finger
    public boolean onTouchMove(MotionEvent event){
        player1.setPositionX((int) event.getX());
        player1.setPositionY((int) event.getY());

        /*
        player2.setPositionX((int) event.getX());
        player2.setPositionY((int) event.getY());
        return true;
    }

    /* When finger is released from player - drop the player
    public boolean onTouchUp(MotionEvent event){
        player1.setPositionX((int) event.getX());
        player1.setPositionY((int) event.getY());
        return true;
    }*/
}
