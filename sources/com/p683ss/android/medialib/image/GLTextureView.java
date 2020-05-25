package com.p683ss.android.medialib.image;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.ss.android.medialib.image.GLTextureView */
public class GLTextureView extends TextureView implements SurfaceTextureListener {

    /* renamed from: b */
    public static final C19332j f53371b = new C19332j();

    /* renamed from: a */
    SurfaceTexture f53372a;

    /* renamed from: c */
    C19331i f53373c;

    /* renamed from: d */
    public Renderer f53374d;

    /* renamed from: e */
    public C19327e f53375e;

    /* renamed from: f */
    public C19328f f53376f;

    /* renamed from: g */
    public C19329g f53377g;

    /* renamed from: h */
    public C19333k f53378h;

    /* renamed from: i */
    public int f53379i;

    /* renamed from: j */
    public int f53380j;

    /* renamed from: k */
    public boolean f53381k;

    /* renamed from: l */
    private final WeakReference<GLTextureView> f53382l = new WeakReference<>(this);

    /* renamed from: m */
    private boolean f53383m;

    /* renamed from: com.ss.android.medialib.image.GLTextureView$a */
    abstract class C19323a implements C19327e {

        /* renamed from: a */
        protected int[] f53384a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract EGLConfig mo39840a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        public C19323a(int[] iArr) {
            if (GLTextureView.this.f53380j == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f53384a = iArr;
        }

        /* renamed from: a */
        public final EGLConfig mo39839a(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f53384a, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f53384a, eGLConfigArr, i, iArr)) {
                        EGLConfig a = mo39840a(egl10, eGLDisplay, eGLConfigArr);
                        if (a != null) {
                            return a;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$b */
    class C19324b extends C19323a {

        /* renamed from: c */
        protected int f53386c = 8;

        /* renamed from: d */
        protected int f53387d = 8;

        /* renamed from: e */
        protected int f53388e = 8;

        /* renamed from: f */
        protected int f53389f = 0;

        /* renamed from: g */
        protected int f53390g;

        /* renamed from: h */
        protected int f53391h;

        /* renamed from: j */
        private int[] f53393j = new int[1];

        /* renamed from: a */
        public final EGLConfig mo39840a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                int a = m47195a(egl102, eGLDisplay2, eGLConfig2, 12325, 0);
                int a2 = m47195a(egl102, eGLDisplay2, eGLConfig2, 12326, 0);
                if (a >= this.f53390g && a2 >= this.f53391h) {
                    EGL10 egl103 = egl10;
                    EGLDisplay eGLDisplay3 = eGLDisplay;
                    EGLConfig eGLConfig3 = eGLConfig;
                    int a3 = m47195a(egl103, eGLDisplay3, eGLConfig3, 12324, 0);
                    int a4 = m47195a(egl103, eGLDisplay3, eGLConfig3, 12323, 0);
                    int a5 = m47195a(egl103, eGLDisplay3, eGLConfig3, 12322, 0);
                    int a6 = m47195a(egl103, eGLDisplay3, eGLConfig3, 12321, 0);
                    if (a3 == this.f53386c && a4 == this.f53387d && a5 == this.f53388e && a6 == this.f53389f) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m47195a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f53393j)) {
                return this.f53393j[0];
            }
            return 0;
        }

        public C19324b(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, i5, 12326, 0, 12344});
            this.f53390g = i5;
            this.f53391h = 0;
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$c */
    class C19325c implements C19328f {

        /* renamed from: b */
        private int f53395b;

        private C19325c() {
            this.f53395b = 12440;
        }

        /* renamed from: a */
        public final void mo39842a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                C19330h.m47206a("eglDestroyContex", egl10.eglGetError());
            }
        }

        /* renamed from: a */
        public final EGLContext mo39841a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f53395b, GLTextureView.this.f53380j, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.f53380j == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$d */
    static class C19326d implements C19329g {
        private C19326d() {
        }

        /* renamed from: a */
        public final void mo39844a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        /* renamed from: a */
        public final EGLSurface mo39843a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$e */
    public interface C19327e {
        /* renamed from: a */
        EGLConfig mo39839a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$f */
    public interface C19328f {
        /* renamed from: a */
        EGLContext mo39841a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        /* renamed from: a */
        void mo39842a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$g */
    public interface C19329g {
        /* renamed from: a */
        EGLSurface mo39843a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        /* renamed from: a */
        void mo39844a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$h */
    static class C19330h {

        /* renamed from: a */
        WeakReference<GLTextureView> f53396a;

        /* renamed from: b */
        EGL10 f53397b;

        /* renamed from: c */
        EGLDisplay f53398c;

        /* renamed from: d */
        EGLSurface f53399d;

        /* renamed from: e */
        EGLConfig f53400e;

        /* renamed from: f */
        EGLContext f53401f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo39845a() {
            if (this.f53399d != null && this.f53399d != EGL10.EGL_NO_SURFACE) {
                EGL10 egl10 = this.f53397b;
                EGLDisplay eGLDisplay = this.f53398c;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = (GLTextureView) this.f53396a.get();
                if (gLTextureView != null) {
                    gLTextureView.f53377g.mo39844a(this.f53397b, this.f53398c, this.f53399d);
                }
                this.f53399d = null;
            }
        }

        /* renamed from: b */
        public final void mo39846b() {
            if (this.f53401f != null) {
                GLTextureView gLTextureView = (GLTextureView) this.f53396a.get();
                if (gLTextureView != null) {
                    gLTextureView.f53376f.mo39842a(this.f53397b, this.f53398c, this.f53401f);
                }
                this.f53401f = null;
            }
            if (this.f53398c != null) {
                this.f53397b.eglTerminate(this.f53398c);
                this.f53398c = null;
            }
        }

        public C19330h(WeakReference<GLTextureView> weakReference) {
            this.f53396a = weakReference;
        }

        /* renamed from: a */
        public static void m47206a(String str, int i) {
            throw new RuntimeException(m47207b(str, i));
        }

        /* renamed from: b */
        private static String m47207b(String str, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" failed");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$i */
    static class C19331i extends Thread {

        /* renamed from: a */
        public boolean f53402a;

        /* renamed from: b */
        boolean f53403b;

        /* renamed from: c */
        boolean f53404c;

        /* renamed from: d */
        boolean f53405d;

        /* renamed from: e */
        boolean f53406e;

        /* renamed from: f */
        boolean f53407f = true;

        /* renamed from: g */
        boolean f53408g;

        /* renamed from: h */
        ArrayList<Runnable> f53409h = new ArrayList<>();

        /* renamed from: i */
        private boolean f53410i;

        /* renamed from: j */
        private boolean f53411j;

        /* renamed from: k */
        private boolean f53412k;

        /* renamed from: l */
        private boolean f53413l;

        /* renamed from: m */
        private boolean f53414m;

        /* renamed from: n */
        private boolean f53415n;

        /* renamed from: o */
        private int f53416o = 0;

        /* renamed from: p */
        private int f53417p = 0;

        /* renamed from: q */
        private int f53418q = 1;

        /* renamed from: r */
        private boolean f53419r = true;

        /* renamed from: s */
        private C19330h f53420s;

        /* renamed from: t */
        private WeakReference<GLTextureView> f53421t;

        /* renamed from: d */
        private void m47210d() {
            if (this.f53413l) {
                this.f53413l = false;
                this.f53420s.mo39845a();
            }
        }

        /* renamed from: a */
        public final int mo39847a() {
            int i;
            synchronized (GLTextureView.f53371b) {
                i = this.f53418q;
            }
            return i;
        }

        /* renamed from: e */
        private void m47211e() {
            if (this.f53412k) {
                this.f53420s.mo39846b();
                this.f53412k = false;
                GLTextureView.f53371b.mo39856b(this);
            }
        }

        /* renamed from: g */
        private boolean m47213g() {
            if (!this.f53412k || !this.f53413l || !m47214h()) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        private boolean m47214h() {
            if (this.f53404c || !this.f53405d || this.f53411j || this.f53416o <= 0 || this.f53417p <= 0 || (!this.f53407f && this.f53418q != 1)) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x000e, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39850b() {
            /*
                r2 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b
                monitor-enter(r0)
                r1 = 1
                r2.f53405d = r1     // Catch:{ all -> 0x002a }
                r1 = 0
                r2.f53414m = r1     // Catch:{ all -> 0x002a }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x002a }
                r1.notifyAll()     // Catch:{ all -> 0x002a }
            L_0x000e:
                boolean r1 = r2.f53406e     // Catch:{ all -> 0x002a }
                if (r1 == 0) goto L_0x0028
                boolean r1 = r2.f53414m     // Catch:{ all -> 0x002a }
                if (r1 != 0) goto L_0x0028
                boolean r1 = r2.f53402a     // Catch:{ all -> 0x002a }
                if (r1 != 0) goto L_0x0028
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ InterruptedException -> 0x0020 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0020 }
                goto L_0x000e
            L_0x0020:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
                r1.interrupt()     // Catch:{ all -> 0x002a }
                goto L_0x000e
            L_0x0028:
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                return
            L_0x002a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.C19331i.mo39850b():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39851c() {
            /*
                r2 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b
                monitor-enter(r0)
                r1 = 1
                r2.f53410i = r1     // Catch:{ all -> 0x001f }
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x001f }
                r1.notifyAll()     // Catch:{ all -> 0x001f }
            L_0x000b:
                boolean r1 = r2.f53402a     // Catch:{ all -> 0x001f }
                if (r1 != 0) goto L_0x001d
                com.ss.android.medialib.image.GLTextureView$j r1 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ InterruptedException -> 0x0015 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0015 }
                goto L_0x000b
            L_0x0015:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x001f }
                r1.interrupt()     // Catch:{ all -> 0x001f }
                goto L_0x000b
            L_0x001d:
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.C19331i.mo39851c():void");
        }

        public final void run() {
            StringBuilder sb = new StringBuilder("GLThread ");
            sb.append(getId());
            setName(sb.toString());
            try {
                m47212f();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.f53371b.mo39853a(this);
                throw th;
            }
            GLTextureView.f53371b.mo39853a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e8, code lost:
            if (r14 == null) goto L_0x01f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f0, code lost:
            if (r6 == false) goto L_0x029b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x01f2, code lost:
            r0 = r1.f53420s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f6, code lost:
            if (r0.f53397b == null) goto L_0x0293;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x01fa, code lost:
            if (r0.f53398c == null) goto L_0x028b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x01fe, code lost:
            if (r0.f53400e == null) goto L_0x0283;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0200, code lost:
            r0.mo39845a();
            r15 = (com.p683ss.android.medialib.image.GLTextureView) r0.f53396a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x020b, code lost:
            if (r15 == null) goto L_0x0227;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x020d, code lost:
            r18 = r3;
            r19 = r4;
            r20 = r5;
            r0.f53399d = r15.f53377g.mo39843a(r0.f53397b, r0.f53398c, r0.f53400e, r15.getSurfaceTexture());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0227, code lost:
            r18 = r3;
            r19 = r4;
            r20 = r5;
            r0.f53399d = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0232, code lost:
            if (r0.f53399d == null) goto L_0x0253;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0238, code lost:
            if (r0.f53399d != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x023b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0249, code lost:
            if (r0.f53397b.eglMakeCurrent(r0.f53398c, r0.f53399d, r0.f53399d, r0.f53401f) != false) goto L_0x0251;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x024b, code lost:
            r0.f53397b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0251, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0253, code lost:
            r0.f53397b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0258, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0259, code lost:
            if (r0 == false) goto L_0x026c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x025b, code lost:
            r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x025d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
            r1.f53414m = true;
            com.p683ss.android.medialib.image.GLTextureView.f53371b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0266, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0267, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x026c, code lost:
            r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x026e, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
            r1.f53414m = true;
            r1.f53411j = true;
            com.p683ss.android.medialib.image.GLTextureView.f53371b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x0279, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x027a, code lost:
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x027c, code lost:
            r4 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x028a, code lost:
            throw new java.lang.RuntimeException("mEglConfig not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0292, code lost:
            throw new java.lang.RuntimeException("eglDisplay not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x029a, code lost:
            throw new java.lang.RuntimeException("egl not initialized");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x029b, code lost:
            r18 = r3;
            r19 = r4;
            r20 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x02a1, code lost:
            if (r7 == false) goto L_0x02e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x02a3, code lost:
            r0 = r1.f53420s;
            r2 = r0.f53401f.getGL();
            r0 = (com.p683ss.android.medialib.image.GLTextureView) r0.f53396a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x02b3, code lost:
            if (r0 == null) goto L_0x02df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x02b7, code lost:
            if (r0.f53378h == null) goto L_0x02bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x02b9, code lost:
            r2 = r0.f53378h.mo39859a(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x02c3, code lost:
            if ((r0.f53379i & 3) == 0) goto L_0x02df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x02c9, code lost:
            if ((r0.f53379i & 1) == 0) goto L_0x02cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x02cb, code lost:
            r3 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x02cd, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x02d2, code lost:
            if ((r0.f53379i & 2) == 0) goto L_0x02da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x02d4, code lost:
            r0 = new com.p683ss.android.medialib.image.GLTextureView.C19334l();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x02da, code lost:
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x02db, code lost:
            r2 = android.opengl.GLDebugHelper.wrap(r2, r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x02df, code lost:
            r2 = (javax.microedition.khronos.opengles.GL10) r2;
            com.p683ss.android.medialib.image.GLTextureView.f53371b.mo39854a(r2);
            r8 = r2;
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x02e8, code lost:
            if (r13 == false) goto L_0x02fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x02ea, code lost:
            r0 = (com.p683ss.android.medialib.image.GLTextureView) r1.f53421t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x02f2, code lost:
            if (r0 == null) goto L_0x02fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x02f4, code lost:
            r0.f53374d.onSurfaceCreated(r8, r1.f53420s.f53400e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x02fd, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x02fe, code lost:
            if (r9 == false) goto L_0x0310;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0300, code lost:
            r0 = (com.p683ss.android.medialib.image.GLTextureView) r1.f53421t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0308, code lost:
            if (r0 == null) goto L_0x030f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x030a, code lost:
            r0.f53374d.onSurfaceChanged(r8, r11, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x030f, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0310, code lost:
            r0 = (com.p683ss.android.medialib.image.GLTextureView) r1.f53421t.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x0318, code lost:
            if (r0 == null) goto L_0x031f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x031a, code lost:
            r0.f53374d.onDrawFrame(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x031f, code lost:
            r0 = r1.f53420s;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x032d, code lost:
            if (r0.f53397b.eglSwapBuffers(r0.f53398c, r0.f53399d) != false) goto L_0x0336;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x032f, code lost:
            r0 = r0.f53397b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0336, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0338, code lost:
            if (r0 == 12288) goto L_0x0351;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x033c, code lost:
            if (r0 == 12302) goto L_0x034e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x033e, code lost:
            r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0340, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
            r1.f53411j = true;
            com.p683ss.android.medialib.image.GLTextureView.f53371b.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0349, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x034e, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x0352, code lost:
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0354, code lost:
            if (r10 == false) goto L_0x027c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0356, code lost:
            r4 = true;
         */
        /* JADX WARNING: Removed duplicated region for block: B:242:0x035c  */
        /* JADX WARNING: Removed duplicated region for block: B:269:0x01cb A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x011e A[SYNTHETIC, Splitter:B:86:0x011e] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m47212f() throws java.lang.InterruptedException {
            /*
                r21 = this;
                r1 = r21
                com.ss.android.medialib.image.GLTextureView$h r0 = new com.ss.android.medialib.image.GLTextureView$h
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r2 = r1.f53421t
                r0.<init>(r2)
                r1.f53420s = r0
                r0 = 0
                r1.f53412k = r0
                r1.f53413l = r0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
            L_0x001b:
                r14 = 0
            L_0x001c:
                com.ss.android.medialib.image.GLTextureView$j r15 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0371 }
                monitor-enter(r15)     // Catch:{ all -> 0x0371 }
            L_0x001f:
                boolean r2 = r1.f53410i     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x0032
                monitor-exit(r15)     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b
                monitor-enter(r2)
                r21.m47210d()     // Catch:{ all -> 0x002f }
                r21.m47211e()     // Catch:{ all -> 0x002f }
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x0032:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f53409h     // Catch:{ all -> 0x036e }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x036e }
                if (r2 != 0) goto L_0x0047
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f53409h     // Catch:{ all -> 0x036e }
                r14 = 0
                java.lang.Object r2 = r2.remove(r14)     // Catch:{ all -> 0x036e }
                java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x036e }
                r14 = r2
                r2 = 0
                goto L_0x01e7
            L_0x0047:
                boolean r2 = r1.f53404c     // Catch:{ all -> 0x036e }
                boolean r0 = r1.f53403b     // Catch:{ all -> 0x036e }
                if (r2 == r0) goto L_0x0059
                boolean r0 = r1.f53403b     // Catch:{ all -> 0x036e }
                boolean r2 = r1.f53403b     // Catch:{ all -> 0x036e }
                r1.f53404c = r2     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r2.notifyAll()     // Catch:{ all -> 0x036e }
                goto L_0x005a
            L_0x0059:
                r0 = 0
            L_0x005a:
                boolean r2 = r1.f53415n     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x0068
                r21.m47210d()     // Catch:{ all -> 0x036e }
                r21.m47211e()     // Catch:{ all -> 0x036e }
                r2 = 0
                r1.f53415n = r2     // Catch:{ all -> 0x036e }
                r5 = 1
            L_0x0068:
                if (r3 == 0) goto L_0x0071
                r21.m47210d()     // Catch:{ all -> 0x036e }
                r21.m47211e()     // Catch:{ all -> 0x036e }
                r3 = 0
            L_0x0071:
                if (r0 == 0) goto L_0x007a
                boolean r2 = r1.f53413l     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x007a
                r21.m47210d()     // Catch:{ all -> 0x036e }
            L_0x007a:
                if (r0 == 0) goto L_0x009b
                boolean r2 = r1.f53412k     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x009b
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r2 = r1.f53421t     // Catch:{ all -> 0x036e }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView r2 = (com.p683ss.android.medialib.image.GLTextureView) r2     // Catch:{ all -> 0x036e }
                if (r2 != 0) goto L_0x008c
                r2 = 0
                goto L_0x008e
            L_0x008c:
                boolean r2 = r2.f53381k     // Catch:{ all -> 0x036e }
            L_0x008e:
                if (r2 == 0) goto L_0x0098
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                boolean r2 = r2.mo39855a()     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x009b
            L_0x0098:
                r21.m47211e()     // Catch:{ all -> 0x036e }
            L_0x009b:
                if (r0 == 0) goto L_0x00aa
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                boolean r0 = r0.mo39857b()     // Catch:{ all -> 0x036e }
                if (r0 == 0) goto L_0x00aa
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53420s     // Catch:{ all -> 0x036e }
                r0.mo39846b()     // Catch:{ all -> 0x036e }
            L_0x00aa:
                boolean r0 = r1.f53405d     // Catch:{ all -> 0x036e }
                if (r0 != 0) goto L_0x00c4
                boolean r0 = r1.f53406e     // Catch:{ all -> 0x036e }
                if (r0 != 0) goto L_0x00c4
                boolean r0 = r1.f53413l     // Catch:{ all -> 0x036e }
                if (r0 == 0) goto L_0x00b9
                r21.m47210d()     // Catch:{ all -> 0x036e }
            L_0x00b9:
                r0 = 1
                r1.f53406e = r0     // Catch:{ all -> 0x036e }
                r0 = 0
                r1.f53411j = r0     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r0.notifyAll()     // Catch:{ all -> 0x036e }
            L_0x00c4:
                boolean r0 = r1.f53405d     // Catch:{ all -> 0x036e }
                if (r0 == 0) goto L_0x00d4
                boolean r0 = r1.f53406e     // Catch:{ all -> 0x036e }
                if (r0 == 0) goto L_0x00d4
                r0 = 0
                r1.f53406e = r0     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r0.notifyAll()     // Catch:{ all -> 0x036e }
            L_0x00d4:
                if (r4 == 0) goto L_0x00e0
                r0 = 1
                r1.f53408g = r0     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r0.notifyAll()     // Catch:{ all -> 0x036e }
                r4 = 0
                r10 = 0
            L_0x00e0:
                boolean r0 = r21.m47214h()     // Catch:{ all -> 0x036e }
                if (r0 == 0) goto L_0x035e
                boolean r0 = r1.f53412k     // Catch:{ all -> 0x036e }
                if (r0 != 0) goto L_0x01b3
                if (r5 == 0) goto L_0x00f3
                r16 = r3
                r17 = r4
                r5 = 0
                goto L_0x01b7
            L_0x00f3:
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$i r2 = r0.f53424b     // Catch:{ all -> 0x036e }
                if (r2 == r1) goto L_0x0116
                com.ss.android.medialib.image.GLTextureView$i r2 = r0.f53424b     // Catch:{ all -> 0x036e }
                if (r2 != 0) goto L_0x00fe
                goto L_0x0116
            L_0x00fe:
                r0.mo39858c()     // Catch:{ all -> 0x036e }
                boolean r2 = r0.f53423a     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x0106
                goto L_0x011b
            L_0x0106:
                com.ss.android.medialib.image.GLTextureView$i r2 = r0.f53424b     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x0114
                com.ss.android.medialib.image.GLTextureView$i r0 = r0.f53424b     // Catch:{ all -> 0x036e }
                r2 = 1
                r0.f53415n = r2     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r0.notifyAll()     // Catch:{ all -> 0x036e }
            L_0x0114:
                r0 = 0
                goto L_0x011c
            L_0x0116:
                r0.f53424b = r1     // Catch:{ all -> 0x036e }
                r0.notifyAll()     // Catch:{ all -> 0x036e }
            L_0x011b:
                r0 = 1
            L_0x011c:
                if (r0 == 0) goto L_0x01b3
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53420s     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL r2 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL10 r2 = (javax.microedition.khronos.egl.EGL10) r2     // Catch:{ RuntimeException -> 0x01ac }
                r0.f53397b = r2     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f53397b     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.Object r13 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLDisplay r2 = r2.eglGetDisplay(r13)     // Catch:{ RuntimeException -> 0x01ac }
                r0.f53398c = r2     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLDisplay r2 = r0.f53398c     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLDisplay r13 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 == r13) goto L_0x01a4
                r2 = 2
                int[] r13 = new int[r2]     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f53397b     // Catch:{ RuntimeException -> 0x01ac }
                r16 = r3
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f53398c     // Catch:{ RuntimeException -> 0x01ac }
                boolean r2 = r2.eglInitialize(r3, r13)     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 == 0) goto L_0x019c
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r2 = r0.f53396a     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.Object r2 = r2.get()     // Catch:{ RuntimeException -> 0x01ac }
                com.ss.android.medialib.image.GLTextureView r2 = (com.p683ss.android.medialib.image.GLTextureView) r2     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 != 0) goto L_0x0159
                r3 = 0
                r0.f53400e = r3     // Catch:{ RuntimeException -> 0x01ac }
                r0.f53401f = r3     // Catch:{ RuntimeException -> 0x01ac }
                r17 = r4
                goto L_0x0175
            L_0x0159:
                com.ss.android.medialib.image.GLTextureView$e r3 = r2.f53375e     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL10 r13 = r0.f53397b     // Catch:{ RuntimeException -> 0x01ac }
                r17 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f53398c     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLConfig r3 = r3.mo39839a(r13, r4)     // Catch:{ RuntimeException -> 0x01ac }
                r0.f53400e = r3     // Catch:{ RuntimeException -> 0x01ac }
                com.ss.android.medialib.image.GLTextureView$f r2 = r2.f53376f     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGL10 r3 = r0.f53397b     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f53398c     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLConfig r13 = r0.f53400e     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLContext r2 = r2.mo39841a(r3, r4, r13)     // Catch:{ RuntimeException -> 0x01ac }
                r0.f53401f = r2     // Catch:{ RuntimeException -> 0x01ac }
            L_0x0175:
                javax.microedition.khronos.egl.EGLContext r2 = r0.f53401f     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 == 0) goto L_0x0182
                javax.microedition.khronos.egl.EGLContext r2 = r0.f53401f     // Catch:{ RuntimeException -> 0x01ac }
                javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ RuntimeException -> 0x01ac }
                if (r2 != r3) goto L_0x0180
                goto L_0x0182
            L_0x0180:
                r2 = 0
                goto L_0x0190
            L_0x0182:
                r2 = 0
                r0.f53401f = r2     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.String r3 = "createContext"
                javax.microedition.khronos.egl.EGL10 r4 = r0.f53397b     // Catch:{ RuntimeException -> 0x01ac }
                int r4 = r4.eglGetError()     // Catch:{ RuntimeException -> 0x01ac }
                com.p683ss.android.medialib.image.GLTextureView.C19330h.m47206a(r3, r4)     // Catch:{ RuntimeException -> 0x01ac }
            L_0x0190:
                r0.f53399d = r2     // Catch:{ RuntimeException -> 0x01ac }
                r0 = 1
                r1.f53412k = r0     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r0.notifyAll()     // Catch:{ all -> 0x036e }
                r13 = 1
                goto L_0x01b7
            L_0x019c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.String r2 = "eglInitialize failed"
                r0.<init>(r2)     // Catch:{ RuntimeException -> 0x01ac }
                throw r0     // Catch:{ RuntimeException -> 0x01ac }
            L_0x01a4:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x01ac }
                java.lang.String r2 = "eglGetDisplay failed"
                r0.<init>(r2)     // Catch:{ RuntimeException -> 0x01ac }
                throw r0     // Catch:{ RuntimeException -> 0x01ac }
            L_0x01ac:
                r0 = move-exception
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r2.mo39856b(r1)     // Catch:{ all -> 0x036e }
                throw r0     // Catch:{ all -> 0x036e }
            L_0x01b3:
                r16 = r3
                r17 = r4
            L_0x01b7:
                boolean r0 = r1.f53412k     // Catch:{ all -> 0x036e }
                if (r0 == 0) goto L_0x01c6
                boolean r0 = r1.f53413l     // Catch:{ all -> 0x036e }
                if (r0 != 0) goto L_0x01c6
                r0 = 1
                r1.f53413l = r0     // Catch:{ all -> 0x036e }
                r0 = 1
                r7 = 1
                r9 = 1
                goto L_0x01c7
            L_0x01c6:
                r0 = r6
            L_0x01c7:
                boolean r2 = r1.f53413l     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x035c
                boolean r2 = r1.f53419r     // Catch:{ all -> 0x036e }
                if (r2 == 0) goto L_0x01da
                int r11 = r1.f53416o     // Catch:{ all -> 0x036e }
                int r12 = r1.f53417p     // Catch:{ all -> 0x036e }
                r2 = 0
                r1.f53419r = r2     // Catch:{ all -> 0x036e }
                r0 = 1
                r9 = 1
                r10 = 1
                goto L_0x01db
            L_0x01da:
                r2 = 0
            L_0x01db:
                r1.f53407f = r2     // Catch:{ all -> 0x036e }
                com.ss.android.medialib.image.GLTextureView$j r3 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r3.notifyAll()     // Catch:{ all -> 0x036e }
                r6 = r0
                r3 = r16
                r4 = r17
            L_0x01e7:
                monitor-exit(r15)     // Catch:{ all -> 0x036e }
                if (r14 == 0) goto L_0x01f0
                r14.run()     // Catch:{ all -> 0x0371 }
                r0 = 0
                goto L_0x001b
            L_0x01f0:
                if (r6 == 0) goto L_0x029b
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53420s     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGL10 r15 = r0.f53397b     // Catch:{ all -> 0x0371 }
                if (r15 == 0) goto L_0x0293
                javax.microedition.khronos.egl.EGLDisplay r15 = r0.f53398c     // Catch:{ all -> 0x0371 }
                if (r15 == 0) goto L_0x028b
                javax.microedition.khronos.egl.EGLConfig r15 = r0.f53400e     // Catch:{ all -> 0x0371 }
                if (r15 == 0) goto L_0x0283
                r0.mo39845a()     // Catch:{ all -> 0x0371 }
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r15 = r0.f53396a     // Catch:{ all -> 0x0371 }
                java.lang.Object r15 = r15.get()     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView r15 = (com.p683ss.android.medialib.image.GLTextureView) r15     // Catch:{ all -> 0x0371 }
                if (r15 == 0) goto L_0x0227
                com.ss.android.medialib.image.GLTextureView$g r2 = r15.f53377g     // Catch:{ all -> 0x0371 }
                r18 = r3
                javax.microedition.khronos.egl.EGL10 r3 = r0.f53397b     // Catch:{ all -> 0x0371 }
                r19 = r4
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f53398c     // Catch:{ all -> 0x0371 }
                r20 = r5
                javax.microedition.khronos.egl.EGLConfig r5 = r0.f53400e     // Catch:{ all -> 0x0371 }
                android.graphics.SurfaceTexture r15 = r15.getSurfaceTexture()     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLSurface r2 = r2.mo39843a(r3, r4, r5, r15)     // Catch:{ all -> 0x0371 }
                r0.f53399d = r2     // Catch:{ all -> 0x0371 }
                r3 = 0
                goto L_0x0230
            L_0x0227:
                r18 = r3
                r19 = r4
                r20 = r5
                r3 = 0
                r0.f53399d = r3     // Catch:{ all -> 0x0371 }
            L_0x0230:
                javax.microedition.khronos.egl.EGLSurface r2 = r0.f53399d     // Catch:{ all -> 0x0371 }
                if (r2 == 0) goto L_0x0253
                javax.microedition.khronos.egl.EGLSurface r2 = r0.f53399d     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLSurface r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x0371 }
                if (r2 != r4) goto L_0x023b
                goto L_0x0253
            L_0x023b:
                javax.microedition.khronos.egl.EGL10 r2 = r0.f53397b     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLDisplay r4 = r0.f53398c     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLSurface r5 = r0.f53399d     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLSurface r15 = r0.f53399d     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLContext r3 = r0.f53401f     // Catch:{ all -> 0x0371 }
                boolean r2 = r2.eglMakeCurrent(r4, r5, r15, r3)     // Catch:{ all -> 0x0371 }
                if (r2 != 0) goto L_0x0251
                javax.microedition.khronos.egl.EGL10 r0 = r0.f53397b     // Catch:{ all -> 0x0371 }
                r0.eglGetError()     // Catch:{ all -> 0x0371 }
                goto L_0x0258
            L_0x0251:
                r0 = 1
                goto L_0x0259
            L_0x0253:
                javax.microedition.khronos.egl.EGL10 r0 = r0.f53397b     // Catch:{ all -> 0x0371 }
                r0.eglGetError()     // Catch:{ all -> 0x0371 }
            L_0x0258:
                r0 = 0
            L_0x0259:
                if (r0 == 0) goto L_0x026c
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0371 }
                monitor-enter(r2)     // Catch:{ all -> 0x0371 }
                r0 = 1
                r1.f53414m = r0     // Catch:{ all -> 0x0269 }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0269 }
                r0.notifyAll()     // Catch:{ all -> 0x0269 }
                monitor-exit(r2)     // Catch:{ all -> 0x0269 }
                r6 = 0
                goto L_0x02a1
            L_0x0269:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0269 }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x026c:
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0371 }
                monitor-enter(r2)     // Catch:{ all -> 0x0371 }
                r0 = 1
                r1.f53414m = r0     // Catch:{ all -> 0x0280 }
                r1.f53411j = r0     // Catch:{ all -> 0x0280 }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0280 }
                r0.notifyAll()     // Catch:{ all -> 0x0280 }
                monitor-exit(r2)     // Catch:{ all -> 0x0280 }
                r3 = r18
            L_0x027c:
                r4 = r19
                goto L_0x0357
            L_0x0280:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0280 }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x0283:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0371 }
                java.lang.String r2 = "mEglConfig not initialized"
                r0.<init>(r2)     // Catch:{ all -> 0x0371 }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x028b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0371 }
                java.lang.String r2 = "eglDisplay not initialized"
                r0.<init>(r2)     // Catch:{ all -> 0x0371 }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x0293:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0371 }
                java.lang.String r2 = "egl not initialized"
                r0.<init>(r2)     // Catch:{ all -> 0x0371 }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x029b:
                r18 = r3
                r19 = r4
                r20 = r5
            L_0x02a1:
                if (r7 == 0) goto L_0x02e8
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53420s     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLContext r2 = r0.f53401f     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.opengles.GL r2 = r2.getGL()     // Catch:{ all -> 0x0371 }
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r0.f53396a     // Catch:{ all -> 0x0371 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p683ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x0371 }
                if (r0 == 0) goto L_0x02df
                com.ss.android.medialib.image.GLTextureView$k r3 = r0.f53378h     // Catch:{ all -> 0x0371 }
                if (r3 == 0) goto L_0x02bf
                com.ss.android.medialib.image.GLTextureView$k r3 = r0.f53378h     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.opengles.GL r2 = r3.mo39859a(r2)     // Catch:{ all -> 0x0371 }
            L_0x02bf:
                int r3 = r0.f53379i     // Catch:{ all -> 0x0371 }
                r3 = r3 & 3
                if (r3 == 0) goto L_0x02df
                int r3 = r0.f53379i     // Catch:{ all -> 0x0371 }
                r4 = 1
                r3 = r3 & r4
                if (r3 == 0) goto L_0x02cd
                r3 = 1
                goto L_0x02ce
            L_0x02cd:
                r3 = 0
            L_0x02ce:
                int r0 = r0.f53379i     // Catch:{ all -> 0x0371 }
                r4 = 2
                r0 = r0 & r4
                if (r0 == 0) goto L_0x02da
                com.ss.android.medialib.image.GLTextureView$l r0 = new com.ss.android.medialib.image.GLTextureView$l     // Catch:{ all -> 0x0371 }
                r0.<init>()     // Catch:{ all -> 0x0371 }
                goto L_0x02db
            L_0x02da:
                r0 = 0
            L_0x02db:
                javax.microedition.khronos.opengles.GL r2 = android.opengl.GLDebugHelper.wrap(r2, r3, r0)     // Catch:{ all -> 0x0371 }
            L_0x02df:
                javax.microedition.khronos.opengles.GL10 r2 = (javax.microedition.khronos.opengles.GL10) r2     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0371 }
                r0.mo39854a(r2)     // Catch:{ all -> 0x0371 }
                r8 = r2
                r7 = 0
            L_0x02e8:
                if (r13 == 0) goto L_0x02fe
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r1.f53421t     // Catch:{ all -> 0x0371 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p683ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x0371 }
                if (r0 == 0) goto L_0x02fd
                android.opengl.GLSurfaceView$Renderer r0 = r0.f53374d     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView$h r2 = r1.f53420s     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLConfig r2 = r2.f53400e     // Catch:{ all -> 0x0371 }
                r0.onSurfaceCreated(r8, r2)     // Catch:{ all -> 0x0371 }
            L_0x02fd:
                r13 = 0
            L_0x02fe:
                if (r9 == 0) goto L_0x0310
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r1.f53421t     // Catch:{ all -> 0x0371 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p683ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x0371 }
                if (r0 == 0) goto L_0x030f
                android.opengl.GLSurfaceView$Renderer r0 = r0.f53374d     // Catch:{ all -> 0x0371 }
                r0.onSurfaceChanged(r8, r11, r12)     // Catch:{ all -> 0x0371 }
            L_0x030f:
                r9 = 0
            L_0x0310:
                java.lang.ref.WeakReference<com.ss.android.medialib.image.GLTextureView> r0 = r1.f53421t     // Catch:{ all -> 0x0371 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0371 }
                com.ss.android.medialib.image.GLTextureView r0 = (com.p683ss.android.medialib.image.GLTextureView) r0     // Catch:{ all -> 0x0371 }
                if (r0 == 0) goto L_0x031f
                android.opengl.GLSurfaceView$Renderer r0 = r0.f53374d     // Catch:{ all -> 0x0371 }
                r0.onDrawFrame(r8)     // Catch:{ all -> 0x0371 }
            L_0x031f:
                com.ss.android.medialib.image.GLTextureView$h r0 = r1.f53420s     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGL10 r2 = r0.f53397b     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLDisplay r3 = r0.f53398c     // Catch:{ all -> 0x0371 }
                javax.microedition.khronos.egl.EGLSurface r4 = r0.f53399d     // Catch:{ all -> 0x0371 }
                boolean r2 = r2.eglSwapBuffers(r3, r4)     // Catch:{ all -> 0x0371 }
                r3 = 12288(0x3000, float:1.7219E-41)
                if (r2 != 0) goto L_0x0336
                javax.microedition.khronos.egl.EGL10 r0 = r0.f53397b     // Catch:{ all -> 0x0371 }
                int r0 = r0.eglGetError()     // Catch:{ all -> 0x0371 }
                goto L_0x0338
            L_0x0336:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x0338:
                if (r0 == r3) goto L_0x0351
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x034e
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0371 }
                monitor-enter(r2)     // Catch:{ all -> 0x0371 }
                r0 = 1
                r1.f53411j = r0     // Catch:{ all -> 0x034b }
                com.ss.android.medialib.image.GLTextureView$j r3 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x034b }
                r3.notifyAll()     // Catch:{ all -> 0x034b }
                monitor-exit(r2)     // Catch:{ all -> 0x034b }
                goto L_0x0352
            L_0x034b:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x034b }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x034e:
                r0 = 1
                r3 = 1
                goto L_0x0354
            L_0x0351:
                r0 = 1
            L_0x0352:
                r3 = r18
            L_0x0354:
                if (r10 == 0) goto L_0x027c
                r4 = 1
            L_0x0357:
                r5 = r20
                r0 = 0
                goto L_0x001c
            L_0x035c:
                r6 = r0
                goto L_0x0362
            L_0x035e:
                r16 = r3
                r17 = r4
            L_0x0362:
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x036e }
                r0.wait()     // Catch:{ all -> 0x036e }
                r3 = r16
                r4 = r17
                r0 = 0
                goto L_0x001f
            L_0x036e:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x036e }
                throw r0     // Catch:{ all -> 0x0371 }
            L_0x0371:
                r0 = move-exception
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b
                monitor-enter(r2)
                r21.m47210d()     // Catch:{ all -> 0x037d }
                r21.m47211e()     // Catch:{ all -> 0x037d }
                monitor-exit(r2)     // Catch:{ all -> 0x037d }
                throw r0
            L_0x037d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x037d }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.C19331i.m47212f():void");
        }

        C19331i(WeakReference<GLTextureView> weakReference) {
            this.f53421t = weakReference;
        }

        /* renamed from: a */
        public final void mo39848a(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (GLTextureView.f53371b) {
                this.f53418q = i;
                GLTextureView.f53371b.notifyAll();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|27|21|4) */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0014, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo39849a(int r2, int r3) {
            /*
                r1 = this;
                com.ss.android.medialib.image.GLTextureView$j r0 = com.p683ss.android.medialib.image.GLTextureView.f53371b
                monitor-enter(r0)
                r1.f53416o = r2     // Catch:{ all -> 0x0036 }
                r1.f53417p = r3     // Catch:{ all -> 0x0036 }
                r2 = 1
                r1.f53419r = r2     // Catch:{ all -> 0x0036 }
                r1.f53407f = r2     // Catch:{ all -> 0x0036 }
                r2 = 0
                r1.f53408g = r2     // Catch:{ all -> 0x0036 }
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ all -> 0x0036 }
                r2.notifyAll()     // Catch:{ all -> 0x0036 }
            L_0x0014:
                boolean r2 = r1.f53402a     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0034
                boolean r2 = r1.f53404c     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0034
                boolean r2 = r1.f53408g     // Catch:{ all -> 0x0036 }
                if (r2 != 0) goto L_0x0034
                boolean r2 = r1.m47213g()     // Catch:{ all -> 0x0036 }
                if (r2 == 0) goto L_0x0034
                com.ss.android.medialib.image.GLTextureView$j r2 = com.p683ss.android.medialib.image.GLTextureView.f53371b     // Catch:{ InterruptedException -> 0x002c }
                r2.wait()     // Catch:{ InterruptedException -> 0x002c }
                goto L_0x0014
            L_0x002c:
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0036 }
                r2.interrupt()     // Catch:{ all -> 0x0036 }
                goto L_0x0014
            L_0x0034:
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                return
            L_0x0036:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.C19331i.mo39849a(int, int):void");
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$j */
    static class C19332j {

        /* renamed from: c */
        private static String f53422c = "GLThreadManager";

        /* renamed from: a */
        boolean f53423a;

        /* renamed from: b */
        C19331i f53424b;

        /* renamed from: d */
        private boolean f53425d;

        /* renamed from: e */
        private int f53426e;

        /* renamed from: f */
        private boolean f53427f;

        /* renamed from: g */
        private boolean f53428g;

        private C19332j() {
        }

        /* renamed from: a */
        public final synchronized boolean mo39855a() {
            return this.f53428g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo39858c() {
            if (!this.f53425d) {
                this.f53423a = true;
                this.f53425d = true;
            }
        }

        /* renamed from: b */
        public final synchronized boolean mo39857b() {
            boolean z;
            mo39858c();
            if (!this.f53423a) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }

        /* renamed from: b */
        public final void mo39856b(C19331i iVar) {
            if (this.f53424b == iVar) {
                this.f53424b = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized void mo39853a(C19331i iVar) {
            iVar.f53402a = true;
            if (this.f53424b == iVar) {
                this.f53424b = null;
            }
            notifyAll();
        }

        /* renamed from: a */
        public final synchronized void mo39854a(GL10 gl10) {
            if (!this.f53427f) {
                mo39858c();
                String glGetString = gl10.glGetString(7937);
                if (this.f53426e < 131072) {
                    this.f53423a = !glGetString.startsWith("Q3Dimension MSM7500 ");
                    notifyAll();
                }
                this.f53428g = !this.f53423a;
                this.f53427f = true;
            }
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$k */
    public interface C19333k {
        /* renamed from: a */
        GL mo39859a(GL gl);
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$l */
    static class C19334l extends Writer {

        /* renamed from: a */
        private StringBuilder f53429a = new StringBuilder();

        public final void close() {
            m47227a();
        }

        public final void flush() {
            m47227a();
        }

        C19334l() {
        }

        /* renamed from: a */
        private void m47227a() {
            if (this.f53429a.length() > 0) {
                this.f53429a.delete(0, this.f53429a.length());
            }
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    m47227a();
                } else {
                    this.f53429a.append(c);
                }
            }
        }
    }

    /* renamed from: com.ss.android.medialib.image.GLTextureView$m */
    class C19335m extends C19324b {
        public C19335m(boolean z) {
            int i;
            if (z) {
                i = 16;
            } else {
                i = 0;
            }
            super(8, 8, 8, 0, i, 0);
        }
    }

    /* renamed from: d */
    private void m47188d() {
        setSurfaceTextureListener(this);
    }

    public int getDebugFlags() {
        return this.f53379i;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f53381k;
    }

    public int getRenderMode() {
        return this.f53373c.mo39847a();
    }

    /* renamed from: e */
    private void m47189e() {
        if (this.f53373c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.f53373c != null) {
            this.f53373c.mo39851c();
        }
        this.f53383m = true;
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo39815a() {
        C19331i iVar = this.f53373c;
        synchronized (f53371b) {
            iVar.f53407f = true;
            f53371b.notifyAll();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.f53373c != null) {
                this.f53373c.mo39851c();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39816b() {
        /*
            r3 = this;
            com.ss.android.medialib.image.GLTextureView$i r0 = r3.f53373c
            com.ss.android.medialib.image.GLTextureView$j r1 = f53371b
            monitor-enter(r1)
            r2 = 1
            r0.f53403b = r2     // Catch:{ all -> 0x0025 }
            com.ss.android.medialib.image.GLTextureView$j r2 = f53371b     // Catch:{ all -> 0x0025 }
            r2.notifyAll()     // Catch:{ all -> 0x0025 }
        L_0x000d:
            boolean r2 = r0.f53402a     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0023
            boolean r2 = r0.f53404c     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0023
            com.ss.android.medialib.image.GLTextureView$j r2 = f53371b     // Catch:{ InterruptedException -> 0x001b }
            r2.wait()     // Catch:{ InterruptedException -> 0x001b }
            goto L_0x000d
        L_0x001b:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0025 }
            r2.interrupt()     // Catch:{ all -> 0x0025 }
            goto L_0x000d
        L_0x0023:
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.mo39816b():void");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f53383m && this.f53374d != null) {
            if (this.f53373c != null) {
                i = this.f53373c.mo39847a();
            } else {
                i = 1;
            }
            this.f53373c = new C19331i(this.f53382l);
            if (i != 1) {
                this.f53373c.mo39848a(i);
            }
            this.f53373c.start();
        }
        this.f53383m = false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:18|19|20|21|32|27|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x002e, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0040 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39817c() {
        /*
            r4 = this;
            android.graphics.SurfaceTexture r0 = r4.f53372a
            if (r0 == 0) goto L_0x001c
            android.graphics.SurfaceTexture r0 = r4.getSurfaceTexture()
            android.graphics.SurfaceTexture r1 = r4.f53372a
            if (r0 == r1) goto L_0x001c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x001c
            android.graphics.SurfaceTexture r0 = r4.f53372a
            r4.setSurfaceTexture(r0)
            com.ss.android.medialib.image.GLTextureView$i r0 = r4.f53373c
            r0.mo39850b()
        L_0x001c:
            com.ss.android.medialib.image.GLTextureView$i r0 = r4.f53373c
            com.ss.android.medialib.image.GLTextureView$j r1 = f53371b
            monitor-enter(r1)
            r2 = 0
            r0.f53403b = r2     // Catch:{ all -> 0x004a }
            r3 = 1
            r0.f53407f = r3     // Catch:{ all -> 0x004a }
            r0.f53408g = r2     // Catch:{ all -> 0x004a }
            com.ss.android.medialib.image.GLTextureView$j r2 = f53371b     // Catch:{ all -> 0x004a }
            r2.notifyAll()     // Catch:{ all -> 0x004a }
        L_0x002e:
            boolean r2 = r0.f53402a     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            boolean r2 = r0.f53404c     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0048
            boolean r2 = r0.f53408g     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x0048
            com.ss.android.medialib.image.GLTextureView$j r2 = f53371b     // Catch:{ InterruptedException -> 0x0040 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0040 }
            goto L_0x002e
        L_0x0040:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004a }
            r2.interrupt()     // Catch:{ all -> 0x004a }
            goto L_0x002e
        L_0x0048:
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.mo39817c():void");
    }

    public void setDebugFlags(int i) {
        this.f53379i = i;
    }

    public void setGLWrapper(C19333k kVar) {
        this.f53378h = kVar;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f53381k = z;
    }

    public void setEGLConfigChooser(C19327e eVar) {
        m47189e();
        this.f53375e = eVar;
    }

    public void setEGLContextClientVersion(int i) {
        m47189e();
        this.f53380j = i;
    }

    public void setEGLContextFactory(C19328f fVar) {
        m47189e();
        this.f53376f = fVar;
    }

    public void setEGLWindowSurfaceFactory(C19329g gVar) {
        m47189e();
        this.f53377g = gVar;
    }

    public void setRenderMode(int i) {
        this.f53373c.mo39848a(i);
    }

    public GLTextureView(Context context) {
        super(context);
        m47188d();
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (getRenderMode() != 0) {
            mo39815a();
        }
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser((C19327e) new C19335m(z));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|22|18|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r4) {
        /*
            r3 = this;
            com.ss.android.medialib.image.GLTextureView$i r4 = r3.f53373c
            com.ss.android.medialib.image.GLTextureView$j r0 = f53371b
            monitor-enter(r0)
            r1 = 0
            r4.f53405d = r1     // Catch:{ all -> 0x0025 }
            com.ss.android.medialib.image.GLTextureView$j r2 = f53371b     // Catch:{ all -> 0x0025 }
            r2.notifyAll()     // Catch:{ all -> 0x0025 }
        L_0x000d:
            boolean r2 = r4.f53406e     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0023
            boolean r2 = r4.f53402a     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0023
            com.ss.android.medialib.image.GLTextureView$j r2 = f53371b     // Catch:{ InterruptedException -> 0x001b }
            r2.wait()     // Catch:{ InterruptedException -> 0x001b }
            goto L_0x000d
        L_0x001b:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0025 }
            r2.interrupt()     // Catch:{ all -> 0x0025 }
            goto L_0x000d
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0025:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.GLTextureView.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    public void setRenderer(Renderer renderer) {
        m47189e();
        if (this.f53375e == null) {
            this.f53375e = new C19335m(true);
        }
        if (this.f53376f == null) {
            this.f53376f = new C19325c();
        }
        if (this.f53377g == null) {
            this.f53377g = new C19326d();
        }
        this.f53374d = renderer;
        this.f53373c = new C19331i(this.f53382l);
        this.f53373c.start();
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47188d();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f53372a = surfaceTexture;
        this.f53373c.mo39850b();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f53373c.mo39849a(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f53373c.mo39849a(i, i2);
    }
}
