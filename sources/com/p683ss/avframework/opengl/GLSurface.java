package com.p683ss.avframework.opengl;

import android.view.Surface;
import com.p683ss.avframework.engine.NativeObject;
import com.p683ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.opengl.GLSurface */
public class GLSurface extends NativeObject {
    public native boolean nativeDoneCurrent();

    public native boolean nativeMakeCurrent();

    public native boolean nativeMakeDefaultCurrent();

    public native boolean nativeSurfaceChanged(int i, int i2, int i3);

    public native boolean nativeSurfaceCreate(int i, int i2, Surface surface);

    public native boolean nativeSurfaceDestroy();

    public native void nativeSwapBuffers();
}
