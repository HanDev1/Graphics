package com.example.a2hanj43.graphics;

/**
 * Created by 2hanj43 on 11/04/2018.
 */
//async task - first parameter <> input, <> output, <>return
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.content.Context;

public class GraphicsView extends View implements View.OnTouchListener
{
    Paint p;
    Bitmap heroBmp;
    int counter = 0;
    float curX, curY; //x and y position of the touch event

    public GraphicsView (Context ctx)
    {
        super(ctx);

        p = new Paint();
        p.setColor(Color.RED);
        p.setTextSize(24);


        //loading in the image in our drawable folder
        heroBmp =   BitmapFactory.decodeResource(ctx.getResources(), R.drawable.hero);

        //make the view listen for touch events coming from itself.
        this.setOnTouchListener(this);
    }

    public void onDraw (Canvas canvas)
    {
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(10, 10, 110, 110, p);
        canvas.drawText("Hello Graphics World!", 0, 200, p);

        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(3);
        canvas.drawRect(10,400,410,500,p);


        //canvas.drawBitmap(heroBmp, 200, 200, null); //drawing the image onto screen

        canvas.drawBitmap(heroBmp, curX, curY, null); //drawing the image onto screen depending on where user touched
        counter ++;
        canvas.drawText("Counter is : " + counter, 0, 300, p);



    }

    //ontouch method for view.ontouchlistener
    public boolean onTouch(View v, MotionEvent event) {
        Log.d("graphics", "onTouch: " + event.getX() + " " + event.getY());
        curX = event.getX();
        curY = event.getY();
        postInvalidate();
        return true;


    }




}

