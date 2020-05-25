package com.p683ss.avframework.opengl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.AndroidRuntimeException;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p683ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.opengl.GlUtil */
public class GlUtil {
    private GlUtil() {
    }

    protected static native int nativeAttachThreadToOpenGl(long j, int i, long j2);

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    public static boolean nativeAttachThreadToOpenGl() {
        if (nativeAttachThreadToOpenGl(GLThreadManager.getNativeEGLContext(), 0, 0) != 0) {
            return true;
        }
        return false;
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }

    public static void checkAnyGLES2Error(String str) {
        if (VERSION.SDK_INT >= 17) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError != 12288) {
                StringBuilder sb = new StringBuilder("EGL error: ");
                sb.append(str);
                sb.append(" (code :");
                sb.append(eglGetError);
                sb.append(")");
                throw new AndroidRuntimeException(sb.toString());
            } else if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
                StringBuilder sb2 = new StringBuilder("Bad EGL display:");
                sb2.append(str);
                throw new AndroidRuntimeException(sb2.toString());
            } else if (EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT) {
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    StringBuilder sb3 = new StringBuilder("GLES error:");
                    sb3.append(str);
                    sb3.append(" (code :");
                    sb3.append(glGetError);
                    sb3.append(")");
                    throw new AndroidRuntimeException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder("Bad EGL context:");
                sb4.append(str);
                throw new AndroidRuntimeException(sb4.toString());
            }
        }
    }
}
