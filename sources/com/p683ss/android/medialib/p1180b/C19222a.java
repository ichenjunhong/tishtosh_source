package com.p683ss.android.medialib.p1180b;

import android.opengl.GLES20;

/* renamed from: com.ss.android.medialib.b.a */
public final class C19222a {

    /* renamed from: a */
    public static final float[] f53013a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: com.ss.android.medialib.b.a$a */
    public interface C19223a {
        /* renamed from: a */
        void mo39607a();

        /* renamed from: b */
        void mo39608b();

        /* renamed from: c */
        int mo39609c();
    }

    /* renamed from: com.ss.android.medialib.b.a$b */
    public interface C19224b {
        /* renamed from: a */
        void mo39610a(int i);
    }

    /* renamed from: a */
    public static void m46852a(String str) {
        int glGetError = GLES20.glGetError();
        for (int i = 0; i < 32 && glGetError != 0; i++) {
            glGetError = GLES20.glGetError();
        }
    }
}
