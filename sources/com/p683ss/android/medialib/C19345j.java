package com.p683ss.android.medialib;

import android.opengl.GLES20;
import com.p683ss.android.medialib.p1180b.C19227d;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.vesdk.C50792y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.medialib.j */
public final class C19345j {

    /* renamed from: a */
    public static final float[] f53469a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: b */
    protected C19227d f53470b;

    /* renamed from: c */
    private int f53471c;

    /* renamed from: d */
    private int f53472d;

    /* renamed from: e */
    private int f53473e;

    /* renamed from: f */
    private int f53474f;

    /* renamed from: g */
    private int f53475g;

    /* renamed from: h */
    private int f53476h;

    /* renamed from: i */
    private int f53477i;

    /* renamed from: j */
    private int f53478j;

    /* renamed from: k */
    private int f53479k;

    /* renamed from: l */
    private int f53480l;

    /* renamed from: m */
    private int f53481m;

    /* renamed from: n */
    private int f53482n;

    protected C19345j() {
    }

    /* renamed from: a */
    public final void mo39880a() {
        this.f53470b.mo39612a();
        GLES20.glDeleteBuffers(1, new int[]{this.f53471c}, 0);
        this.f53470b = null;
        this.f53471c = 0;
    }

    /* renamed from: b */
    public final void mo39884b(float f) {
        this.f53470b.mo39615b();
        GLES20.glUniform1f(this.f53476h, f);
    }

    /* renamed from: a */
    public final void mo39881a(float f) {
        float cos = (float) Math.cos(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        float sin = (float) Math.sin(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        float[] fArr = {cos, sin, -sin, cos};
        this.f53470b.mo39615b();
        GLES20.glUniformMatrix2fv(this.f53472d, 1, false, fArr, 0);
    }

    /* renamed from: b */
    public final void mo39885b(float f, float f2) {
        this.f53470b.mo39615b();
        GLES20.glUniform2f(this.f53473e, 1.0f, 1.0f / f2);
    }

    /* renamed from: a */
    public static C19345j m47241a(float f, float f2) {
        C19345j jVar = new C19345j();
        jVar.f53470b = new C19227d();
        boolean z = true;
        if (!jVar.f53470b.mo39614a("attribute highp vec2 vPosition;\nvarying vec2 texCoord;\nuniform mat2 rotation;\nuniform vec2 flipScale;\nvoid main()\n{\n   gl_Position = vec4(vPosition, 0.0, 1.0);\n   texCoord = flipScale * (vPosition / 2.0 * rotation) + 0.5;\n}", "precision mediump float;\nvarying vec2 texCoord;\nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform float xPos;\nuniform float yPos;\nuniform float bottomPos;\nuniform float rightPos;\nuniform float markAlpha;\nuniform float xAdjust;\nuniform float yAdjust;\nvec4 normalBlend(vec4 c2, vec4 c1)\n{\n   vec4 outputColor;\n   outputColor.r = c1.r * markAlpha + c2.r * c2.a * (1.0 - c1.a);\n   outputColor.g = c1.g * markAlpha + c2.g * c2.a * (1.0 - c1.a);\n   outputColor.b = c1.b * markAlpha + c2.b * c2.a * (1.0 - c1.a);\n   outputColor.a = c1.a + c2.a * (1.0 - c1.a);\n   return outputColor;\n}\nvoid main()\n{\n   highp vec2 cord;\n   cord.x = texCoord.x * xAdjust- (xAdjust - 1.0) * 0.5;\n   cord.y = texCoord.y * yAdjust- (yAdjust - 1.0) * 0.5;\n   vec4 origin;\n   if(cord.x > 0.0 && cord.x < 1.0 && cord.y > 0.0 && cord.y < 1.0)\n   {\n       origin = texture2D(inputImageTexture, cord);\n   } else {\n       origin = vec4(1.0, 1.0, 1.0, 1.0);\n   }\n   vec4 markOverlay;\n   vec2 tmpCoordinate;\n   tmpCoordinate.x = cord.x;\n   tmpCoordinate.y = 1.0 - cord.y;\n   origin.a = origin.a * markAlpha;\n   if( cord.x > xPos && cord.x < bottomPos && cord.y > yPos && cord.y < rightPos )\n   {\n       tmpCoordinate.x = (cord.x - xPos) / (bottomPos - xPos);\n       tmpCoordinate.y = 1.0 - (cord.y - yPos) / (rightPos - yPos);\n       markOverlay = texture2D(inputImageTexture2, tmpCoordinate);\n       markOverlay.a = markOverlay.a * markAlpha;\n       origin = normalBlend(origin, markOverlay);\n   }\n   gl_FragColor = vec4(origin.r, origin.g, origin.b, origin.a);\n}")) {
            jVar.f53470b.mo39612a();
            jVar.f53470b = null;
            z = false;
        } else {
            jVar.f53470b.mo39615b();
            jVar.f53472d = jVar.f53470b.mo39611a("rotation");
            jVar.f53473e = jVar.f53470b.mo39611a("flipScale");
            jVar.f53474f = jVar.f53470b.mo39611a("inputImageTexture");
            jVar.f53475g = jVar.f53470b.mo39611a("inputImageTexture2");
            jVar.f53476h = jVar.f53470b.mo39611a("markAlpha");
            jVar.f53477i = jVar.f53470b.mo39611a("xPos");
            jVar.f53478j = jVar.f53470b.mo39611a("yPos");
            jVar.f53479k = jVar.f53470b.mo39611a("bottomPos");
            jVar.f53480l = jVar.f53470b.mo39611a("rightPos");
            jVar.f53481m = jVar.f53470b.mo39611a("xAdjust");
            jVar.f53482n = jVar.f53470b.mo39611a("yAdjust");
            jVar.f53470b.mo39613a("vPosition", 0);
            int[] iArr = new int[1];
            GLES20.glGenBuffers(1, iArr, 0);
            jVar.f53471c = iArr[0];
            GLES20.glBindBuffer(34962, jVar.f53471c);
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f53469a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(f53469a).position(0);
            GLES20.glBufferData(34962, 32, asFloatBuffer, 35044);
            jVar.mo39881a(0.0f);
            jVar.mo39885b(1.0f, 1.0f);
            jVar.mo39884b(1.0f);
            jVar.f53470b.mo39615b();
            GLES20.glUniform1f(jVar.f53481m, f);
            GLES20.glUniform1f(jVar.f53482n, f2);
            C50792y.m109911b("TextureDrawer", "init: success.");
        }
        if (z) {
            return jVar;
        }
        C50792y.m109914d("TextureDrawer", "TextureDrawer create failed!");
        jVar.mo39880a();
        return null;
    }

    /* renamed from: a */
    public final void mo39883a(int i, int i2, int i3) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.f53474f, 0);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f53475g, 2);
        GLES20.glBindBuffer(34962, this.f53471c);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        this.f53470b.mo39615b();
        GLES20.glDrawArrays(6, 0, 4);
    }

    /* renamed from: a */
    public final void mo39882a(float f, float f2, float f3, float f4) {
        this.f53470b.mo39615b();
        GLES20.glUniform1f(this.f53477i, f);
        GLES20.glUniform1f(this.f53478j, f2);
        GLES20.glUniform1f(this.f53479k, f3);
        GLES20.glUniform1f(this.f53480l, f4);
    }
}
