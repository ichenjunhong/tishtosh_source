package com.p683ss.android.ugc.effectmanager.common.p2441h;

import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.j */
public final class C48672j {

    /* renamed from: a */
    public static final C48672j f122314a = new C48672j();

    /* renamed from: b */
    private static final HashMap<String, float[]> f122315b = new HashMap<>();

    /* renamed from: c */
    private static final SparseArray<float[]> f122316c = new SparseArray<>();

    /* renamed from: d */
    private static final Pattern f122317d = Pattern.compile("\\d+$");

    /* renamed from: e */
    private static C48673a f122318e;

    /* renamed from: com.ss.android.ugc.effectmanager.common.h.j$a */
    static final class C48673a {

        /* renamed from: a */
        public String f122319a = "unknown";

        /* renamed from: b */
        public String f122320b = "unknown";

        /* renamed from: c */
        public String f122321c = "unknown";

        /* renamed from: d */
        public int f122322d;

        /* renamed from: e */
        public int f122323e;

        /* renamed from: f */
        public int f122324f = -1;

        /* renamed from: g */
        public double f122325g = -1.0d;

        /* renamed from: h */
        public String f122326h = "unknown";

        public final String toString() {
            StringBuilder sb = new StringBuilder("GPUInfo{renderer='");
            sb.append(this.f122319a);
            sb.append("', version='");
            sb.append(this.f122320b);
            sb.append("', vendor='");
            sb.append(this.f122321c);
            sb.append("', maxFreq=");
            sb.append(this.f122322d);
            sb.append(", minFreq=");
            sb.append(this.f122323e);
            sb.append(", glVer=");
            sb.append(this.f122324f);
            sb.append(", alusOrThroughput=");
            sb.append(this.f122325g);
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo96266a(String str) {
            C52711k.m112240b(str, "<set-?>");
            this.f122320b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.h.j$b */
    static final class C48674b implements FilenameFilter {

        /* renamed from: a */
        public static final C48674b f122327a = new C48674b();

        C48674b() {
        }

        public final boolean accept(File file, String str) {
            C52711k.m112236a((Object) file, "file");
            if (file.isDirectory()) {
                C52711k.m112236a((Object) str, "s");
                if (C52830p.m112456b((CharSequence) str, (CharSequence) "kgsl", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }

    private C48672j() {
    }

    static {
        f122315b.put("mali-g72", new float[]{850.0f, 850.0f, 27.2f});
        f122315b.put("mali-g71", new float[]{850.0f, 850.0f, 27.2f});
        f122315b.put("mali-t880", new float[]{850.0f, 850.0f, 13.6f});
        f122315b.put("mali-t860", new float[]{650.0f, 650.0f, 10.4f});
        f122315b.put("mali-t760", new float[]{650.0f, 650.0f, 10.4f});
        f122315b.put("mali-g51", new float[]{650.0f, 650.0f, 3.9f});
        f122315b.put("mali-t830", new float[]{650.0f, 650.0f, 2.6f});
        f122315b.put("mali-t820", new float[]{650.0f, 650.0f, 2.6f});
        f122315b.put("mali-t720", new float[]{650.0f, 650.0f, 5.2f});
        f122315b.put("mali-t470", new float[]{250.0f, 650.0f, 0.65f});
        f122315b.put("mali-t450", new float[]{270.0f, 650.0f, 5.2f});
        f122315b.put("mali-t400", new float[]{210.0f, 500.0f, 2.0f});
        f122315b.put("mali-400 mp", new float[]{210.0f, 500.0f, 2.0f});
        f122315b.put("mali-450 mp", new float[]{210.0f, 500.0f, 2.6f});
        f122316c.put(200, new float[]{200.0f, 245.0f, 8.0f});
        f122316c.put(203, new float[]{245.0f, 294.0f, 16.0f});
        f122316c.put(205, new float[]{225.0f, 245.0f, 16.0f});
        f122316c.put(220, new float[]{266.0f, 266.0f, 32.0f});
        f122316c.put(225, new float[]{400.0f, 400.0f, 32.0f});
        f122316c.put(302, new float[]{400.0f, 400.0f, 24.0f});
        f122316c.put(304, new float[]{400.0f, 400.0f, 24.0f});
        f122316c.put(305, new float[]{400.0f, 450.0f, 24.0f});
        f122316c.put(306, new float[]{400.0f, 400.0f, 24.0f});
        f122316c.put(308, new float[]{500.0f, 500.0f, 24.0f});
        f122316c.put(320, new float[]{450.0f, 450.0f, 96.0f});
        f122316c.put(330, new float[]{578.0f, 578.0f, 128.0f});
        f122316c.put(405, new float[]{550.0f, 550.0f, 48.0f});
        f122316c.put(418, new float[]{600.0f, 600.0f, 128.0f});
        f122316c.put(420, new float[]{600.0f, 600.0f, 128.0f});
        f122316c.put(430, new float[]{500.0f, 650.0f, 192.0f});
        f122316c.put(505, new float[]{450.0f, 450.0f, 48.0f});
        f122316c.put(506, new float[]{650.0f, 650.0f, 96.0f});
        f122316c.put(508, new float[]{850.0f, 850.0f, 96.0f});
        f122316c.put(510, new float[]{600.0f, 600.0f, 128.0f});
        f122316c.put(UnReadVideoExperiment.LIKE_USER_LIST, new float[]{600.0f, 850.0f, 128.0f});
        f122316c.put(530, new float[]{650.0f, 650.0f, 256.0f});
        f122316c.put(540, new float[]{710.0f, 710.0f, 256.0f});
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0170 A[Catch:{ Throwable -> 0x0218 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018e A[Catch:{ Throwable -> 0x0218 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.effectmanager.common.p2441h.C48672j.C48673a mo96265a() {
        /*
            r16 = this;
            r0 = r16
            com.ss.android.ugc.effectmanager.common.h.j$a r1 = f122318e
            if (r1 != 0) goto L_0x021a
            com.ss.android.ugc.effectmanager.common.h.j$a r1 = new com.ss.android.ugc.effectmanager.common.h.j$a
            r1.<init>()
            com.ss.android.ugc.effectmanager.common.h.d r2 = new com.ss.android.ugc.effectmanager.common.h.d     // Catch:{ Throwable -> 0x0218 }
            r2.<init>()     // Catch:{ Throwable -> 0x0218 }
            r3 = 15
            int[] r3 = new int[r3]     // Catch:{ Throwable -> 0x0218 }
            r3 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344} // fill-array     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGL r4 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ Throwable -> 0x0218 }
            boolean r5 = r4 instanceof javax.microedition.khronos.egl.EGL10     // Catch:{ Throwable -> 0x0218 }
            r10 = 0
            if (r5 != 0) goto L_0x0021
            r4 = r10
        L_0x0021:
            r11 = r4
            javax.microedition.khronos.egl.EGL10 r11 = (javax.microedition.khronos.egl.EGL10) r11     // Catch:{ Throwable -> 0x0218 }
            r12 = 2
            r13 = 1
            r14 = 0
            if (r11 != 0) goto L_0x002b
            goto L_0x009c
        L_0x002b:
            java.lang.Object r4 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r4 = r11.eglGetDisplay(r4)     // Catch:{ Throwable -> 0x0218 }
            r2.f122302b = r4     // Catch:{ Throwable -> 0x0218 }
            int[] r4 = new int[r12]     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r5 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            r11.eglInitialize(r5, r4)     // Catch:{ Throwable -> 0x0218 }
            int[] r15 = new int[r13]     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r5 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            r7 = 0
            r8 = 0
            r4 = r11
            r6 = r3
            r9 = r15
            r4.eglChooseConfig(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0218 }
            r4 = r15[r14]     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLConfig[] r9 = new javax.microedition.khronos.egl.EGLConfig[r4]     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r5 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            r8 = r15[r14]     // Catch:{ Throwable -> 0x0218 }
            r4 = r11
            r6 = r3
            r7 = r9
            r3 = r9
            r9 = r15
            r4.eglChooseConfig(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0218 }
            r3 = r3[r14]     // Catch:{ Throwable -> 0x0218 }
            r2.f122303c = r3     // Catch:{ Throwable -> 0x0218 }
            r3 = 5
            int[] r3 = new int[r3]     // Catch:{ Throwable -> 0x0218 }
            r3 = {12375, 16, 12374, 16, 12344} // fill-array     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r4 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLConfig r5 = r2.f122303c     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLSurface r3 = r11.eglCreatePbufferSurface(r4, r5, r3)     // Catch:{ Throwable -> 0x0218 }
            r2.f122304d = r3     // Catch:{ Throwable -> 0x0218 }
            r3 = 3
            int[] r3 = new int[r3]     // Catch:{ Throwable -> 0x0218 }
            r3 = {12440, 2, 12344} // fill-array     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r4 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLConfig r5 = r2.f122303c     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLContext r6 = r2.f122307g     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLContext r3 = r11.eglCreateContext(r4, r5, r6, r3)     // Catch:{ Throwable -> 0x0218 }
            r2.f122305e = r3     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r3 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLSurface r4 = r2.f122304d     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLSurface r5 = r2.f122304d     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLContext r6 = r2.f122305e     // Catch:{ Throwable -> 0x0218 }
            r11.eglMakeCurrent(r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLContext r3 = r2.f122305e     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x0090
            javax.microedition.khronos.opengles.GL r3 = r3.getGL()     // Catch:{ Throwable -> 0x0218 }
            goto L_0x0091
        L_0x0090:
            r3 = r10
        L_0x0091:
            boolean r4 = r3 instanceof javax.microedition.khronos.opengles.GL10     // Catch:{ Throwable -> 0x0218 }
            if (r4 != 0) goto L_0x0096
            r3 = r10
        L_0x0096:
            javax.microedition.khronos.opengles.GL10 r3 = (javax.microedition.khronos.opengles.GL10) r3     // Catch:{ Throwable -> 0x0218 }
            r2.f122306f = r3     // Catch:{ Throwable -> 0x0218 }
            r2.f122301a = r11     // Catch:{ Throwable -> 0x0218 }
        L_0x009c:
            javax.microedition.khronos.opengles.GL10 r3 = r2.f122306f     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x00e4
            r4 = 7936(0x1f00, float:1.1121E-41)
            java.lang.String r4 = r3.glGetString(r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r5 = "it.glGetString(GL10.GL_VENDOR)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r5 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            r1.f122321c = r4     // Catch:{ Throwable -> 0x0218 }
            r4 = 7938(0x1f02, float:1.1124E-41)
            java.lang.String r4 = r3.glGetString(r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r5 = "it.glGetString(GL10.GL_VERSION)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            r1.mo96266a(r4)     // Catch:{ Throwable -> 0x0218 }
            r4 = 7937(0x1f01, float:1.1122E-41)
            java.lang.String r4 = r3.glGetString(r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r5 = "it.glGetString(GL10.GL_RENDERER)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r5 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            r1.f122319a = r4     // Catch:{ Throwable -> 0x0218 }
            r4 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r3 = r3.glGetString(r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = "it.glGetString(GL10.GL_EXTENSIONS)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = "<set-?>"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)     // Catch:{ Throwable -> 0x0218 }
            r1.f122326h = r3     // Catch:{ Throwable -> 0x0218 }
        L_0x00e4:
            javax.microedition.khronos.egl.EGL10 r3 = r2.f122301a     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x0104
            javax.microedition.khronos.egl.EGLDisplay r4 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLSurface r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLContext r6 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ Throwable -> 0x0218 }
            r3.eglMakeCurrent(r4, r5, r5, r6)     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r4 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLSurface r5 = r2.f122304d     // Catch:{ Throwable -> 0x0218 }
            r3.eglDestroySurface(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r4 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLContext r5 = r2.f122305e     // Catch:{ Throwable -> 0x0218 }
            r3.eglDestroyContext(r4, r5)     // Catch:{ Throwable -> 0x0218 }
            javax.microedition.khronos.egl.EGLDisplay r2 = r2.f122302b     // Catch:{ Throwable -> 0x0218 }
            r3.eglTerminate(r2)     // Catch:{ Throwable -> 0x0218 }
        L_0x0104:
            java.lang.String r2 = r1.f122320b     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "OpenGL ES"
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r2, r3, r14, r12, r10)     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x01a6
            r3 = 9
            if (r2 == 0) goto L_0x019e
            java.lang.String r2 = r2.substring(r3)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Throwable -> 0x0218 }
            if (r2 == 0) goto L_0x0196
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Throwable -> 0x0218 }
            java.lang.CharSequence r2 = p2628d.p2650m.C52830p.m112447b(r2)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0218 }
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = " "
            d.m.l r5 = new d.m.l     // Catch:{ Throwable -> 0x0218 }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x0218 }
            java.util.List r3 = r5.split(r3, r14)     // Catch:{ Throwable -> 0x0218 }
            boolean r4 = r3.isEmpty()     // Catch:{ Throwable -> 0x0218 }
            if (r4 != 0) goto L_0x0168
            int r4 = r3.size()     // Catch:{ Throwable -> 0x0218 }
            java.util.ListIterator r4 = r3.listIterator(r4)     // Catch:{ Throwable -> 0x0218 }
        L_0x0143:
            boolean r5 = r4.hasPrevious()     // Catch:{ Throwable -> 0x0218 }
            if (r5 == 0) goto L_0x0168
            java.lang.Object r5 = r4.previous()     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0218 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x0218 }
            int r5 = r5.length()     // Catch:{ Throwable -> 0x0218 }
            if (r5 != 0) goto L_0x0159
            r5 = 1
            goto L_0x015a
        L_0x0159:
            r5 = 0
        L_0x015a:
            if (r5 != 0) goto L_0x0143
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ Throwable -> 0x0218 }
            int r4 = r4.nextIndex()     // Catch:{ Throwable -> 0x0218 }
            int r4 = r4 + r13
            java.util.List r3 = p2628d.p2629a.C52575l.m112129b(r3, r4)     // Catch:{ Throwable -> 0x0218 }
            goto L_0x016c
        L_0x0168:
            java.util.List r3 = p2628d.p2629a.C52575l.m112097a()     // Catch:{ Throwable -> 0x0218 }
        L_0x016c:
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x018e
            java.lang.String[] r4 = new java.lang.String[r14]     // Catch:{ Throwable -> 0x0218 }
            java.lang.Object[] r3 = r3.toArray(r4)     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x0186
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Throwable -> 0x0218 }
            int r4 = r3.length     // Catch:{ Throwable -> 0x0218 }
            if (r4 != 0) goto L_0x017f
            r4 = 1
            goto L_0x0180
        L_0x017f:
            r4 = 0
        L_0x0180:
            r4 = r4 ^ r13
            if (r4 == 0) goto L_0x01a6
            r2 = r3[r14]     // Catch:{ Throwable -> 0x0218 }
            goto L_0x01a6
        L_0x0186:
            d.u r2 = new d.u     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T>"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0218 }
            throw r2     // Catch:{ Throwable -> 0x0218 }
        L_0x018e:
            d.u r2 = new d.u     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.Collection<T>"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0218 }
            throw r2     // Catch:{ Throwable -> 0x0218 }
        L_0x0196:
            d.u r2 = new d.u     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.CharSequence"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0218 }
            throw r2     // Catch:{ Throwable -> 0x0218 }
        L_0x019e:
            d.u r2 = new d.u     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0218 }
            throw r2     // Catch:{ Throwable -> 0x0218 }
        L_0x01a6:
            r1.mo96266a(r2)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r2 = r1.f122319a     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "max"
            int r2 = r0.m105336a(r2, r3)     // Catch:{ Throwable -> 0x0218 }
            r1.f122322d = r2     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r2 = r1.f122319a     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "min"
            int r2 = r0.m105336a(r2, r3)     // Catch:{ Throwable -> 0x0218 }
            r1.f122323e = r2     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r2 = r1.f122319a     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r3 = "renderer"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)     // Catch:{ Throwable -> 0x0218 }
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0218 }
            int r3 = r3.length()     // Catch:{ Throwable -> 0x0218 }
            if (r3 <= 0) goto L_0x01ce
            goto L_0x01cf
        L_0x01ce:
            r13 = 0
        L_0x01cf:
            if (r13 == 0) goto L_0x0214
            java.lang.String r3 = r2.toLowerCase()     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = "mali"
            boolean r3 = p2628d.p2650m.C52830p.m112411b(r3, r4, r14, r12, r10)     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x01ec
            java.util.HashMap<java.lang.String, float[]> r3 = f122315b     // Catch:{ Throwable -> 0x0218 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Throwable -> 0x0218 }
            r10 = r2
            float[] r10 = (float[]) r10     // Catch:{ Throwable -> 0x0218 }
            goto L_0x020e
        L_0x01ec:
            java.lang.String r3 = r2.toLowerCase()     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)     // Catch:{ Throwable -> 0x0218 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0218 }
            java.lang.String r4 = "adreno"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x0218 }
            boolean r3 = p2628d.p2650m.C52830p.m112456b(r3, r4, r14, r12, r10)     // Catch:{ Throwable -> 0x0218 }
            if (r3 == 0) goto L_0x020e
            int r2 = m105335a(r2)     // Catch:{ Throwable -> 0x0218 }
            android.util.SparseArray<float[]> r3 = f122316c     // Catch:{ Throwable -> 0x0218 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Throwable -> 0x0218 }
            r10 = r2
            float[] r10 = (float[]) r10     // Catch:{ Throwable -> 0x0218 }
        L_0x020e:
            if (r10 == 0) goto L_0x0214
            r2 = r10[r12]     // Catch:{ Throwable -> 0x0218 }
            double r2 = (double) r2     // Catch:{ Throwable -> 0x0218 }
            goto L_0x0216
        L_0x0214:
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x0216:
            r1.f122325g = r2     // Catch:{ Throwable -> 0x0218 }
        L_0x0218:
            f122318e = r1
        L_0x021a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48672j.mo96265a():com.ss.android.ugc.effectmanager.common.h.j$a");
    }

    /* renamed from: a */
    private static int m105335a(String str) {
        Matcher matcher = f122317d.matcher(str);
        if (matcher.find()) {
            boolean z = false;
            String group = matcher.group(0);
            C52711k.m112236a((Object) group, "serial");
            if (group.length() > 0) {
                z = true;
            }
            if (z) {
                return Integer.parseInt(group);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m105337b(String str, String str2) {
        float f;
        float[] fArr = (float[]) f122315b.get(str);
        if (fArr == null) {
            return 850;
        }
        if (C52711k.m112239a((Object) "min", (Object) str2)) {
            f = fArr[0];
        } else {
            f = fArr[1];
        }
        return (int) f;
    }

    /* renamed from: a */
    private final int m105336a(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = -1;
        if (z) {
            return -1;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            if (C52830p.m112411b(lowerCase, "mali", false, 2, null)) {
                i = m105337b(str, str2);
            } else if (str != null) {
                String lowerCase2 = str.toLowerCase();
                C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (C52830p.m112411b(lowerCase2, "adreno", false, 2, null)) {
                    i = m105338c(str, str2);
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
            return i;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b2 A[SYNTHETIC, Splitter:B:50:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8 A[SYNTHETIC, Splitter:B:56:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m105338c(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            int r12 = m105335a(r12)
            r0 = 1
            if (r12 <= 0) goto L_0x0015
            android.util.SparseArray<float[]> r1 = f122316c
            java.lang.Object r1 = r1.get(r12)
            float[] r1 = (float[]) r1
            if (r1 == 0) goto L_0x0015
            r12 = r1[r0]
            int r12 = (int) r12
            return r12
        L_0x0015:
            java.lang.String r1 = "/sys/class/devfreq/"
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            com.ss.android.ugc.effectmanager.common.h.j$b r1 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48672j.C48674b.f122327a
            java.io.FilenameFilter r1 = (java.io.FilenameFilter) r1
            java.io.File[] r1 = r2.listFiles(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0032
            int r3 = r1.length
            if (r3 != 0) goto L_0x002c
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r3 = 0
            goto L_0x0033
        L_0x0032:
            r3 = 1
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            int r12 = r12 + 200
            return r12
        L_0x0038:
            int r12 = r1.length
            r3 = 0
        L_0x003a:
            if (r3 >= r12) goto L_0x00bf
            r4 = r1[r3]
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r13)
            java.lang.String r7 = "_freq"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r4, r6)
            r4 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            java.io.FileReader r7 = new java.io.FileReader     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            r7.<init>(r5)     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00b6, all -> 0x00ae }
            java.lang.String r4 = r6.readLine()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r5 = "freqStr"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            int r5 = r4.length()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            int r5 = r5 - r0
            r7 = r5
            r5 = 0
            r8 = 0
        L_0x0074:
            if (r5 > r7) goto L_0x0094
            if (r8 != 0) goto L_0x007a
            r9 = r5
            goto L_0x007b
        L_0x007a:
            r9 = r7
        L_0x007b:
            char r9 = r4.charAt(r9)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r10 = 32
            if (r9 > r10) goto L_0x0085
            r9 = 1
            goto L_0x0086
        L_0x0085:
            r9 = 0
        L_0x0086:
            if (r8 != 0) goto L_0x008f
            if (r9 != 0) goto L_0x008c
            r8 = 1
            goto L_0x0074
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x0074
        L_0x008f:
            if (r9 == 0) goto L_0x0094
            int r7 = r7 + -1
            goto L_0x0074
        L_0x0094:
            int r7 = r7 + 1
            java.lang.CharSequence r4 = r4.subSequence(r5, r7)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r5 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 / r5
            r6.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            return r4
        L_0x00aa:
            r12 = move-exception
            goto L_0x00b0
        L_0x00ac:
            r4 = r6
            goto L_0x00b6
        L_0x00ae:
            r12 = move-exception
            r6 = r4
        L_0x00b0:
            if (r6 == 0) goto L_0x00b5
            r6.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            throw r12
        L_0x00b6:
            if (r4 == 0) goto L_0x00bb
            r4.close()     // Catch:{ IOException -> 0x00bb }
        L_0x00bb:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x00bf:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48672j.m105338c(java.lang.String, java.lang.String):int");
    }
}
