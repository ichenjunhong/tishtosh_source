package com.p683ss.android.medialib.image;

import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.image.a */
public final class C19339a {

    /* renamed from: i */
    private static final float[] f53437i = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: j */
    private static final float[] f53438j = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    int f53439a;

    /* renamed from: b */
    int f53440b;

    /* renamed from: c */
    int f53441c;

    /* renamed from: d */
    int f53442d;

    /* renamed from: e */
    int f53443e;

    /* renamed from: f */
    public float[] f53444f = new float[16];

    /* renamed from: g */
    FloatBuffer f53445g;

    /* renamed from: h */
    FloatBuffer f53446h;

    public C19339a() {
        Matrix.setIdentityM(this.f53444f, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(f53437i.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f53445g = allocateDirect.asFloatBuffer();
        this.f53445g.put(f53437i);
        this.f53445g.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(f53438j.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.f53446h = allocateDirect2.asFloatBuffer();
        this.f53446h.put(f53438j);
        this.f53446h.position(0);
    }
}
