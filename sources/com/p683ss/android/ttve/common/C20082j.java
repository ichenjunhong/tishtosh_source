package com.p683ss.android.ttve.common;

import android.opengl.GLES20;
import com.p683ss.android.ttve.common.C20076f.C20077a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.common.j */
public final class C20082j {

    /* renamed from: a */
    public static final float[] f55205a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b */
    protected C20076f f55206b;

    /* renamed from: c */
    private int f55207c;

    /* renamed from: d */
    private int f55208d;

    /* renamed from: e */
    private int f55209e;

    /* renamed from: f */
    private int f55210f;

    protected C20082j() {
    }

    /* renamed from: b */
    public final void mo42184b() {
        this.f55206b.mo42171a();
        GLES20.glDeleteBuffers(1, new int[]{this.f55207c}, 0);
        this.f55206b = null;
        this.f55207c = 0;
    }

    /* renamed from: a */
    public static C20082j m49593a() {
        boolean z;
        C20082j jVar = new C20082j();
        String str = "attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}";
        String str2 = "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform int debug;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n   if (debug != 0) gl_FragColor.rg = texCoord;\n}";
        jVar.f55206b = new C20076f();
        C20076f fVar = jVar.f55206b;
        int i = fVar.f55186a;
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (fVar.f55187b != null) {
            fVar.f55187b.mo42173a();
        }
        if (fVar.f55188c != null) {
            fVar.f55188c.mo42173a();
        }
        fVar.f55187b = new C20077a(str, 35633);
        fVar.f55188c = new C20077a(str2, 35632);
        GLES20.glAttachShader(i, fVar.f55187b.f55189a);
        GLES20.glAttachShader(i, fVar.f55188c.f55189a);
        int glGetError = GLES20.glGetError();
        for (int i2 = 0; i2 < 32 && glGetError != 0; i2++) {
            glGetError = GLES20.glGetError();
        }
        GLES20.glLinkProgram(i);
        boolean z2 = true;
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        fVar.f55187b.mo42173a();
        fVar.f55188c.mo42173a();
        fVar.f55187b = null;
        fVar.f55188c = null;
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(i);
            z = false;
        } else {
            if (!(fVar.f55186a == i || fVar.f55186a == 0)) {
                GLES20.glDeleteProgram(fVar.f55186a);
            }
            fVar.f55186a = i;
            z = true;
        }
        if (!z) {
            jVar.f55206b.mo42171a();
            jVar.f55206b = null;
            z2 = false;
        } else {
            jVar.f55206b.mo42172b();
            jVar.f55208d = jVar.f55206b.mo42170a("rotation");
            jVar.f55209e = jVar.f55206b.mo42170a("flipScale");
            jVar.f55210f = jVar.f55206b.mo42170a("debug");
            GLES20.glBindAttribLocation(jVar.f55206b.f55186a, 0, "vPosition");
            int[] iArr2 = new int[1];
            GLES20.glGenBuffers(1, iArr2, 0);
            jVar.f55207c = iArr2[0];
            GLES20.glBindBuffer(34962, jVar.f55207c);
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f55205a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(f55205a).position(0);
            GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
            jVar.mo42181a(0.0f);
            jVar.mo42182a(1.0f, 1.0f);
            jVar.f55206b.mo42172b();
            GLES20.glUniform1i(jVar.f55210f, 0);
        }
        if (z2) {
            return jVar;
        }
        jVar.mo42184b();
        return null;
    }

    /* renamed from: a */
    public final void mo42181a(float f) {
        float cos = (float) Math.cos(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        float sin = (float) Math.sin(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        float[] fArr = {cos, sin, -sin, cos};
        this.f55206b.mo42172b();
        GLES20.glUniformMatrix2fv(this.f55208d, 1, false, fArr, 0);
    }

    /* renamed from: a */
    public final void mo42183a(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f55207c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f55206b.mo42172b();
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: a */
    public final void mo42182a(float f, float f2) {
        this.f55206b.mo42172b();
        GLES20.glUniform2f(this.f55209e, 1.0f, 1.0f / f2);
    }
}
