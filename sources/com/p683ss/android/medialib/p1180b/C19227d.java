package com.p683ss.android.medialib.p1180b;

import android.opengl.GLES20;
import com.C2240a;
import com.p683ss.android.vesdk.C50792y;

/* renamed from: com.ss.android.medialib.b.d */
public class C19227d {

    /* renamed from: a */
    public int f53022a = GLES20.glCreateProgram();

    /* renamed from: b */
    private C19228a f53023b;

    /* renamed from: c */
    private C19228a f53024c;

    /* renamed from: com.ss.android.medialib.b.d$a */
    public static class C19228a {

        /* renamed from: b */
        static final /* synthetic */ boolean f53025b = (!C19227d.class.desiredAssertionStatus());

        /* renamed from: a */
        public int f53026a;

        /* renamed from: c */
        private int f53027c;

        public C19228a() {
        }

        /* renamed from: a */
        public final void mo39616a() {
            if (this.f53026a != 0) {
                GLES20.glDeleteShader(this.f53026a);
                this.f53026a = 0;
            }
        }

        public C19228a(String str, int i) {
            this.f53027c = i;
            int glCreateShader = GLES20.glCreateShader(i);
            if (glCreateShader != 0) {
                GLES20.glShaderSource(glCreateShader, str);
                GLES20.glCompileShader(glCreateShader);
                int[] iArr = {0};
                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                if (iArr[0] != 1) {
                    C50792y.m109914d("ProgramObject", GLES20.glGetShaderInfoLog(glCreateShader));
                    GLES20.glDeleteShader(glCreateShader);
                    glCreateShader = 0;
                }
            }
            this.f53026a = glCreateShader;
            if (!f53025b && this.f53026a == 0) {
                throw new AssertionError("Shader Create Failed!");
            } else if (this.f53026a == 0) {
                C50792y.m109914d("ProgramObject", "glCreateShader Failed!...");
            }
        }
    }

    /* renamed from: b */
    public final void mo39615b() {
        GLES20.glUseProgram(this.f53022a);
    }

    /* renamed from: a */
    public final void mo39612a() {
        if (this.f53022a != 0) {
            GLES20.glDeleteProgram(this.f53022a);
            this.f53022a = 0;
        }
    }

    /* renamed from: a */
    public final int mo39611a(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f53022a, str);
        if (glGetUniformLocation < 0) {
            C50792y.m109914d("ProgramObject", C2240a.m6772a("uniform name %s does not exist", new Object[]{str}));
        }
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public final void mo39613a(String str, int i) {
        GLES20.glBindAttribLocation(this.f53022a, 0, str);
    }

    /* renamed from: a */
    public final boolean mo39614a(String str, String str2) {
        return m46862a(str, str2, this.f53022a);
    }

    /* renamed from: a */
    private boolean m46862a(String str, String str2, int i) {
        if (i == 0) {
            i = GLES20.glCreateProgram();
        }
        if (i == 0) {
            C50792y.m109914d("ProgramObject", "Invalid Program ID! Check if the context is binded!");
        }
        if (this.f53023b != null) {
            this.f53023b.mo39616a();
        }
        if (this.f53024c != null) {
            this.f53024c.mo39616a();
        }
        this.f53023b = new C19228a(str, 35633);
        this.f53024c = new C19228a(str2, 35632);
        GLES20.glAttachShader(i, this.f53023b.f53026a);
        GLES20.glAttachShader(i, this.f53024c.f53026a);
        C19222a.m46852a("AttachShaders...");
        GLES20.glLinkProgram(i);
        int[] iArr = {0};
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
        this.f53023b.mo39616a();
        this.f53024c.mo39616a();
        this.f53023b = null;
        this.f53024c = null;
        if (iArr[0] != 1) {
            C50792y.m109914d("ProgramObject", GLES20.glGetProgramInfoLog(i));
            return false;
        }
        if (!(this.f53022a == i || this.f53022a == 0)) {
            GLES20.glDeleteProgram(this.f53022a);
        }
        this.f53022a = i;
        return true;
    }
}
