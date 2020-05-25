package com.p683ss.android.medialib.p1180b;

import android.opengl.GLES20;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.vesdk.C50792y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.b.e */
public final class C19229e {

    /* renamed from: a */
    public static final float[] f53028a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C19227d f53029b;

    /* renamed from: c */
    private int f53030c;

    /* renamed from: d */
    private int f53031d;

    /* renamed from: e */
    private int f53032e;

    protected C19229e() {
    }

    /* renamed from: b */
    public final void mo39620b() {
        this.f53029b.mo39612a();
        GLES20.glDeleteBuffers(1, new int[]{this.f53030c}, 0);
        this.f53029b = null;
        this.f53030c = 0;
    }

    /* renamed from: a */
    public static C19229e m46869a() {
        C19229e eVar = new C19229e();
        eVar.f53029b = new C19227d();
        boolean z = true;
        if (!eVar.f53029b.mo39614a("attribute vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, texCoord);\n}")) {
            eVar.f53029b.mo39612a();
            eVar.f53029b = null;
            z = false;
        } else {
            eVar.f53029b.mo39615b();
            eVar.f53031d = eVar.f53029b.mo39611a("rotation");
            eVar.f53032e = eVar.f53029b.mo39611a("flipScale");
            eVar.f53029b.mo39613a("vPosition", 0);
            int[] iArr = new int[1];
            GLES20.glGenBuffers(1, iArr, 0);
            eVar.f53030c = iArr[0];
            GLES20.glBindBuffer(34962, eVar.f53030c);
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f53028a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(f53028a).position(0);
            GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
            eVar.mo39617a(0.0f);
            eVar.mo39618a(1.0f, 1.0f);
            C50792y.m109911b("TextureDrawer", "init: success.");
        }
        if (z) {
            return eVar;
        }
        C50792y.m109914d("TextureDrawer", "TextureDrawer create failed!");
        eVar.mo39620b();
        return null;
    }

    /* renamed from: a */
    public final void mo39617a(float f) {
        float cos = (float) Math.cos(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        float sin = (float) Math.sin(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        float[] fArr = {cos, sin, -sin, cos};
        this.f53029b.mo39615b();
        GLES20.glUniformMatrix2fv(this.f53031d, 1, false, fArr, 0);
    }

    /* renamed from: a */
    public final void mo39618a(float f, float f2) {
        this.f53029b.mo39615b();
        GLES20.glUniform2f(this.f53032e, 1.0f, 1.0f / f2);
    }

    /* renamed from: a */
    public final void mo39619a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glBindBuffer(34962, this.f53030c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f53029b.mo39615b();
        GLES20.glDrawArrays(6, 0, 4);
    }
}
