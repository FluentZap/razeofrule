package com.example.toad.razeofrule;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Toad on 7/18/2016.
 */
public class GLRender extends AppCompatActivity implements GLSurfaceView.Renderer {


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GLES20.glClearColor(0.2f, 0.2f, 0.6f, 1.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }
}