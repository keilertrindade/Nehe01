package com.example.administrator.nehe01;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.LinearLayout;
/*
 * OpenGL Main Activity.
 */
public class MyGLActivity extends Activity {
    private GLSurfaceView glView;  // Use subclass of GLSurfaceView (NEW)
    private LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_gl);
        // Allocate a custom subclass of GLSurfaceView (NEW)
        l = (LinearLayout) findViewById (R.id.visualizer);
        glView = new MyGLSurfaceView(this);

        //setContentView(glView);  // Set View (NEW)
        l.addView(glView,0);
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