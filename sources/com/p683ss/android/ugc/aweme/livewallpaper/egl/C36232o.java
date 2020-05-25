package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.o */
public class C36232o {

    /* renamed from: a */
    protected int f92747a;

    /* renamed from: b */
    protected int f92748b;

    /* renamed from: c */
    private int f92749c;

    /* renamed from: d */
    private int f92750d;

    /* renamed from: e */
    private int f92751e;

    /* renamed from: f */
    private int f92752f;

    /* renamed from: g */
    private int f92753g;

    /* renamed from: h */
    private int f92754h;

    /* renamed from: i */
    private FloatBuffer[] f92755i;

    /* renamed from: j */
    private boolean f92756j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo74987a() {
        return 3553;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float[] mo75016d() {
        return C36233p.f92761e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo74988b() {
        return new String[]{"attribute vec2 a_pos;\nattribute vec2 a_tex;\nvarying vec2 v_tex;\nuniform mat4 u_mvp;\nuniform mat4 u_tex_trans;\nvoid main() {\n   gl_Position = u_mvp * vec4(a_pos, 0.0, 1.0);\n   v_tex = (u_tex_trans * vec4(a_tex, 0.0, 1.0)).st;\n}\n", "precision mediump float;\nuniform sampler2D u_tex;\nuniform bool fmt_changed; \nvarying vec2 v_tex;\nvoid main() {\n   if (fmt_changed) {\n       gl_FragColor = vec4(texture2D(u_tex, v_tex).bgr, 1.0);\n   } else { \n       gl_FragColor = texture2D(u_tex, v_tex);\n   }\n}\n"};
    }

    /* renamed from: c */
    public void mo75015c() {
        if (this.f92749c != 0) {
            GLES20.glDeleteProgram(this.f92749c);
            this.f92749c = 0;
        }
        if (this.f92750d != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.f92750d}, 0);
            this.f92750d = 0;
        }
        if (this.f92751e != 0) {
            GLES20.glDeleteBuffers(1, new int[]{this.f92751e}, 0);
            this.f92751e = 0;
        }
        this.f92756j = false;
    }

    /* renamed from: a */
    private void m81823a(int i) {
        GLES20.glBindBuffer(34962, this.f92750d);
        GLES20.glBufferData(34962, 32, this.f92755i[i].rewind(), 35044);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, this.f92751e);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo75014a(int r7, int r8) {
        /*
            r6 = this;
            r6.f92747a = r7
            r6.f92748b = r8
            java.lang.String[] r7 = r6.mo74988b()
            r8 = 0
            r0 = r7[r8]
            r1 = 1
            r7 = r7[r1]
            r2 = 35633(0x8b31, float:4.9932E-41)
            int r0 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81794a(r2, r0)
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            r2 = 0
            goto L_0x004f
        L_0x0019:
            r2 = 35632(0x8b30, float:4.9931E-41)
            int r7 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81794a(r2, r7)
            if (r7 != 0) goto L_0x0023
            goto L_0x0017
        L_0x0023:
            int r2 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r3 = "glCreateProgram"
            com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81797a(r3)
            android.opengl.GLES20.glAttachShader(r2, r0)
            java.lang.String r0 = "glAttachShader"
            com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81797a(r0)
            android.opengl.GLES20.glAttachShader(r2, r7)
            java.lang.String r7 = "glAttachShader"
            com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81797a(r7)
            android.opengl.GLES20.glLinkProgram(r2)
            int[] r7 = new int[r1]
            r0 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r2, r0, r7, r8)
            r7 = r7[r8]
            if (r7 == r1) goto L_0x004f
            android.opengl.GLES20.glDeleteProgram(r2)
            goto L_0x0017
        L_0x004f:
            r6.f92749c = r2
            int r7 = r6.f92749c
            if (r7 == 0) goto L_0x0057
            r7 = 1
            goto L_0x0058
        L_0x0057:
            r7 = 0
        L_0x0058:
            if (r7 != 0) goto L_0x005b
            return r8
        L_0x005b:
            int r7 = r6.f92749c
            java.lang.String r0 = "a_pos"
            android.opengl.GLES20.glBindAttribLocation(r7, r8, r0)
            java.lang.String r0 = "a_tex"
            android.opengl.GLES20.glBindAttribLocation(r7, r1, r0)
            java.lang.String r0 = "u_mvp"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r7, r0)
            r6.f92752f = r0
            java.lang.String r0 = "u_tex_trans"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r7, r0)
            r6.f92753g = r0
            java.lang.String r0 = "fmt_changed"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r0)
            r6.f92754h = r7
            java.lang.String r7 = "TextureDrawer glBindAttribLocation"
            boolean r7 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81797a(r7)
            if (r7 != 0) goto L_0x0088
            return r8
        L_0x0088:
            r7 = 4
            java.nio.FloatBuffer[] r0 = new java.nio.FloatBuffer[r7]
            r6.f92755i = r0
            float[] r0 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36233p.f92757a
            int r2 = r0.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r2.order(r3)
            java.nio.FloatBuffer[] r3 = r6.f92755i
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()
            r3[r8] = r2
            java.nio.FloatBuffer[] r2 = r6.f92755i
            r2 = r2[r8]
            r2.put(r0)
            java.nio.FloatBuffer[] r0 = r6.f92755i
            r0 = r0[r8]
            r0.rewind()
            float[] r0 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36233p.f92758b
            int r2 = r0.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r2.order(r3)
            java.nio.FloatBuffer[] r3 = r6.f92755i
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()
            r3[r1] = r2
            java.nio.FloatBuffer[] r2 = r6.f92755i
            r2 = r2[r1]
            r2.put(r0)
            java.nio.FloatBuffer[] r0 = r6.f92755i
            r0 = r0[r1]
            r0.rewind()
            float[] r0 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36233p.f92759c
            int r2 = r0.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r2.order(r3)
            java.nio.FloatBuffer[] r3 = r6.f92755i
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()
            r4 = 2
            r3[r4] = r2
            java.nio.FloatBuffer[] r2 = r6.f92755i
            r2 = r2[r4]
            r2.put(r0)
            java.nio.FloatBuffer[] r0 = r6.f92755i
            r0 = r0[r4]
            r0.rewind()
            float[] r0 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36233p.f92760d
            int r2 = r0.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r2.order(r3)
            java.nio.FloatBuffer[] r3 = r6.f92755i
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()
            r5 = 3
            r3[r5] = r2
            java.nio.FloatBuffer[] r2 = r6.f92755i
            r2 = r2[r5]
            r2.put(r0)
            java.nio.FloatBuffer[] r0 = r6.f92755i
            r0 = r0[r5]
            r0.rewind()
            float[] r0 = r6.mo75016d()
            int r2 = r0.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            r7.order(r2)
            java.nio.FloatBuffer r7 = r7.asFloatBuffer()
            r7.put(r0)
            r7.rewind()
            int[] r0 = new int[r4]
            android.opengl.GLES20.glGenBuffers(r4, r0, r8)
            r2 = r0[r8]
            r6.f92750d = r2
            r0 = r0[r1]
            r6.f92751e = r0
            int r0 = r6.f92750d
            r2 = 34962(0x8892, float:4.8992E-41)
            android.opengl.GLES20.glBindBuffer(r2, r0)
            java.nio.FloatBuffer[] r0 = r6.f92755i
            r0 = r0[r8]
            java.nio.Buffer r0 = r0.rewind()
            r3 = 35044(0x88e4, float:4.9107E-41)
            r4 = 32
            android.opengl.GLES20.glBufferData(r2, r4, r0, r3)
            int r0 = r6.f92751e
            android.opengl.GLES20.glBindBuffer(r2, r0)
            android.opengl.GLES20.glBufferData(r2, r4, r7, r3)
            android.opengl.GLES20.glBindBuffer(r2, r8)
            r6.m81823a(r8)
            android.opengl.GLES20.glBindBuffer(r2, r8)
            java.lang.String r7 = "TextureDrawer setup VAO, VBOs."
            boolean r7 = com.p683ss.android.ugc.aweme.livewallpaper.egl.C36222i.m81797a(r7)
            if (r7 != 0) goto L_0x0182
            return r8
        L_0x0182:
            r6.f92756j = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.egl.C36232o.mo75014a(int, int):boolean");
    }

    /* renamed from: a */
    public final void mo75012a(int i, boolean z, int i2, float[] fArr) {
        if (this.f92756j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f92749c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(mo74987a(), i);
            m81823a(0);
            GLES20.glUniformMatrix4fv(this.f92752f, 1, false, C36222i.f92711a, 0);
            if (fArr == null) {
                fArr = C36222i.f92711a;
            }
            GLES20.glUniformMatrix4fv(this.f92753g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f92754h, 0);
            GLES20.glViewport(0, 0, this.f92747a * 2, this.f92748b * 2);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(mo74987a(), 0);
        }
    }

    /* renamed from: a */
    public final void mo75013a(int i, boolean z, int i2, float[] fArr, float[] fArr2) {
        if (this.f92756j) {
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f92749c);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(mo74987a(), i);
            m81823a(0);
            GLES20.glUniformMatrix4fv(this.f92752f, 1, false, fArr2, 0);
            if (fArr == null) {
                fArr = C36222i.f92711a;
            }
            GLES20.glUniformMatrix4fv(this.f92753g, 1, false, fArr, 0);
            GLES20.glUniform1i(this.f92754h, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(0);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindTexture(mo74987a(), 0);
        }
    }
}
