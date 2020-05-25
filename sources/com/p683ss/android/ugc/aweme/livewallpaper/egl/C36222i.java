package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.i */
public final class C36222i {

    /* renamed from: a */
    public static final float[] f92711a;

    /* renamed from: b */
    private static boolean f92712b = m81798b();

    /* renamed from: a */
    public static boolean m81796a() {
        return f92712b;
    }

    /* renamed from: b */
    private static boolean m81798b() {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        try {
            EGL14.eglGetCurrentContext();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        float[] fArr = new float[16];
        f92711a = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* renamed from: a */
    public static boolean m81797a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": glError 0x");
        sb.append(Integer.toHexString(glGetError));
        return false;
    }

    /* renamed from: a */
    public static int m81794a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder sb = new StringBuilder("glCreateShader type=");
        sb.append(i);
        m81797a(sb.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: a */
    public static int m81795a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        m81797a("glGenTextures");
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, VideoPreloadSizeExperiment.DEFAULT, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        m81797a("loadImageTexture");
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        m81797a("loadImageTexture");
        return i4;
    }
}
