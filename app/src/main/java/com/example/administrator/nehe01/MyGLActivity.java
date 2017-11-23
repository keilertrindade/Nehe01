package com.example.administrator.nehe01;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
/*
 * OpenGL Main Activity.
 */
public class MyGLActivity extends Activity {
    private GLSurfaceView glView;  // Use subclass of GLSurfaceView (NEW)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Allocate a custom subclass of GLSurfaceView (NEW)
        glView = new MyGLSurfaceView(this);
        setContentView(glView);  // Set View (NEW)
    }

    @Override
    protected void onPause() {
        super.onPause();
        glView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();
    }
}