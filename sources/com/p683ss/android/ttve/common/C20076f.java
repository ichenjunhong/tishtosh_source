package com.p683ss.android.ttve.common;

import android.opengl.GLES20;
import com.p683ss.android.vesdk.C50792y;

/* renamed from: com.ss.android.ttve.common.f */
public final class C20076f {

    /* renamed from: a */
    public int f55186a = GLES20.glCreateProgram();

    /* renamed from: b */
    C20077a f55187b;

    /* renamed from: c */
    C20077a f55188c;

    /* renamed from: com.ss.android.ttve.common.f$a */
    public static class C20077a {

        /* renamed from: a */
        public int f55189a;

        /* renamed from: b */
        private int f55190b;

        public C20077a() {
        }

        /* renamed from: a */
        public final void mo42173a() {
            if (this.f55189a != 0) {
                GLES20.glDeleteShader(this.f55189a);
                this.f55189a = 0;
            }
        }

        public C20077a(String str, int i) {
            this.f55190b = i;
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                StringBuilder sb = new StringBuilder("before glCreateShader, glError: ");
                sb.append(glGetError);
                C50792y.m109914d("TEProgramObject", sb.toString());
            }
            int glCreateShader = GLES20.glCreateShader(i);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 != 0) {
                StringBuilder sb2 = new StringBuilder("after glCreateShader, glError: ");
                sb2.append(glGetError2);
                C50792y.m109914d("TEProgramObject", sb2.toString());
            }
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    StringBuilder sb3 = new StringBuilder("after glCompileShader, glError: ");
                    sb3.append(glGetError3);
                    C50792y.m109914d("TEProgramObject", sb3.toString());
                }
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C50792y.m109914d("TEProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f55189a = glCreateShader;
            if (this.f55189a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (this.f55189a == 0) {
                C50792y.m109914d("TEProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    /* renamed from: b */
    public final void mo42172b() {
        GLES20.glUseProgram(this.f55186a);
    }

    /* renamed from: a */
    public final void mo42171a() {
        if (this.f55186a != 0) {
            GLES20.glDeleteProgram(this.f55186a);
            this.f55186a = 0;
        }
    }

    /* renamed from: a */
    public final int mo42170a(String str) {
        return GLES20.glGetUniformLocation(this.f55186a, str);
    }
}
