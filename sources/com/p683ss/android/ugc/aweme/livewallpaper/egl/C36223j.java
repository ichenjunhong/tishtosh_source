package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.j */
public final class C36223j implements OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    public Object f92713a = null;

    /* renamed from: b */
    Object f92714b;

    /* renamed from: c */
    C36219f f92715c;

    /* renamed from: d */
    C36234q f92716d;

    /* renamed from: e */
    C36236s f92717e;

    /* renamed from: f */
    C36236s f92718f;

    /* renamed from: g */
    int f92719g;

    /* renamed from: h */
    int f92720h;

    /* renamed from: i */
    public int f92721i;

    /* renamed from: j */
    float[] f92722j;

    /* renamed from: k */
    public Pair<Float, Float> f92723k = new Pair<>(Float.valueOf(1.0f), Float.valueOf(1.0f));

    /* renamed from: l */
    private C36217d f92724l;

    /* renamed from: m */
    private C36218e f92725m;

    /* renamed from: n */
    private Thread f92726n = new Thread(this);

    /* renamed from: o */
    private Handler f92727o;

    /* renamed from: p */
    private List<C36225k> f92728p = new ArrayList();

    /* renamed from: q */
    private List<C36225k> f92729q = new ArrayList();

    /* renamed from: r */
    private float[] f92730r;

    /* renamed from: s */
    private boolean f92731s;

    /* renamed from: t */
    private Object f92732t = new Object();

    /* renamed from: u */
    private int f92733u = 8;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.j$a */
    static class C36224a extends Handler {

        /* renamed from: a */
        private WeakReference<C36223j> f92734a;

        C36224a(C36223j jVar) {
            this.f92734a = new WeakReference<>(jVar);
        }

        public final void handleMessage(Message message) {
            C36223j jVar = (C36223j) this.f92734a.get();
            if (jVar != null) {
                switch (message.what) {
                    case 1:
                        jVar.mo74997b(message.obj);
                        return;
                    case 2:
                        jVar.mo74995a(message.obj);
                        return;
                    case 3:
                        Message message2 = (Message) message.obj;
                        int i = message.arg1;
                        int i2 = message.arg2;
                        C36221h hVar = null;
                        if (i == 0 && i2 == 0 && jVar.f92718f != null) {
                            hVar = jVar.f92718f.mo75017a(1000);
                        } else if (jVar.f92717e != null) {
                            hVar = jVar.f92717e.mo75017a(1000);
                        }
                        message2.obj = hVar;
                        synchronized (message2) {
                            message2.arg1 = 0;
                            message2.notify();
                        }
                        break;
                    case 4:
                        jVar.mo74996b();
                        return;
                    case 5:
                        jVar.mo74998c();
                        return;
                    case 6:
                        if (jVar.f92721i == 4) {
                            jVar.f92721i = 2;
                        }
                        return;
                    case 7:
                        if (jVar.f92721i == 2) {
                            jVar.f92721i = 4;
                        }
                        return;
                    case 8:
                        jVar.mo74993a();
                        return;
                    case 9:
                    case 11:
                        Surface surface = (Surface) message.obj;
                        jVar.f92714b = surface;
                        if (surface != null) {
                            jVar.mo74999d();
                        }
                        return;
                    case 10:
                        int i3 = message.arg1;
                        int i4 = message.arg2;
                        jVar.f92720h = i3;
                        jVar.f92719g = i4;
                        if (jVar.f92716d != null) {
                            jVar.f92716d.mo75015c();
                            jVar.f92716d.mo75014a(jVar.f92720h, jVar.f92719g);
                        }
                        if (jVar.f92715c != null) {
                            jVar.f92715c.mo75015c();
                            jVar.f92715c.mo75014a(jVar.f92720h, jVar.f92719g);
                        }
                        return;
                    default:
                        super.handleMessage(message);
                        break;
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo75001f() {
        this.f92727o.sendEmptyMessage(5);
    }

    /* renamed from: a */
    public final void mo74993a() {
        mo74996b();
        Looper.myLooper().quit();
        this.f92721i = 5;
    }

    /* renamed from: b */
    public final void mo74996b() {
        if (this.f92721i != 3) {
            m81800h();
            this.f92721i = 3;
        }
    }

    /* renamed from: e */
    public final void mo75000e() {
        this.f92727o.sendEmptyMessage(8);
        m81802j();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:13:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m81801i() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f92732t
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.f92731s     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x000f
            java.lang.Object r1 = r4.f92732t     // Catch:{ InterruptedException -> 0x0003 }
            r2 = 10
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.egl.C36223j.m81801i():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:13:0x0003, LOOP_START, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m81802j() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f92732t
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.f92731s     // Catch:{ all -> 0x0011 }
            if (r1 == 0) goto L_0x000f
            java.lang.Object r1 = r4.f92732t     // Catch:{ InterruptedException -> 0x0003 }
            r2 = 10
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.egl.C36223j.m81802j():void");
    }

    /* renamed from: c */
    public final void mo74998c() {
        try {
            mo74997b(this.f92713a);
            this.f92721i = 4;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    public final C36225k mo75002g() {
        C36221h b = m81799b(0, 0);
        if (b == null) {
            return null;
        }
        C36225k kVar = new C36225k(b);
        b.mo74990b();
        kVar.setOnFrameAvailableListener(this);
        return kVar;
    }

    /* renamed from: h */
    private void m81800h() {
        if (this.f92717e != null) {
            this.f92717e.mo75018a();
        }
        if (this.f92718f != null) {
            this.f92718f.mo75018a();
        }
        if (this.f92715c != null) {
            this.f92715c.mo75015c();
            this.f92715c = null;
        }
        if (this.f92716d != null) {
            this.f92716d.mo75015c();
            this.f92716d = null;
        }
        if (this.f92725m != null) {
            this.f92725m.mo74984c();
            this.f92725m = null;
        }
        if (this.f92724l != null) {
            this.f92724l.mo74977a();
            this.f92724l = null;
        }
    }

    public final void run() {
        Looper.prepare();
        this.f92727o = new C36224a(this);
        synchronized (this.f92732t) {
            this.f92731s = true;
            this.f92732t.notify();
        }
        Looper.loop();
        synchronized (this.f92732t) {
            this.f92731s = false;
            this.f92732t.notify();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo74999d() {
        if (this.f92725m != null) {
            this.f92725m.mo74984c();
        }
        if (this.f92714b == null) {
            this.f92725m = new C36226l(this.f92724l, 1, 1);
        } else if (this.f92714b instanceof Surface) {
            this.f92725m = new C36238t(this.f92724l, (Surface) this.f92714b, true);
        } else if (this.f92714b instanceof SurfaceTexture) {
            this.f92725m = new C36238t(this.f92724l, (SurfaceTexture) this.f92714b);
        } else {
            throw new AndroidRuntimeException("UnsupportedOperation");
        }
        this.f92720h = this.f92725m.mo74979a();
        this.f92719g = this.f92725m.mo74983b();
        this.f92725m.mo74985d();
        this.f92713a = C36217d.m81777b();
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f92728p) {
            this.f92728p.add((C36225k) surfaceTexture);
        }
        if (this.f92721i == 4) {
            Message obtainMessage = this.f92727o.obtainMessage(2);
            obtainMessage.obj = null;
            this.f92727o.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74997b(Object obj) {
        m81800h();
        this.f92724l = new C36217d(obj, 0);
        mo74999d();
        this.f92717e = new C36236s(this.f92733u, this.f92720h, this.f92719g, false);
        this.f92717e.f92770c = "MusMediaRender.TexQueue";
        this.f92718f = new C36236s(this.f92733u, 0, 0, false);
        this.f92718f.f92770c = "MusMediaRender.OESQueue";
    }

    /* renamed from: a */
    public final void mo74995a(Object obj) {
        if (obj != null) {
            C36221h hVar = (C36221h) obj;
            if (this.f92721i == 4) {
                if (this.f92716d == null) {
                    this.f92716d = new C36234q();
                    if (!this.f92716d.mo75014a(this.f92720h, this.f92719g)) {
                        mo74996b();
                    }
                }
                if (!(this.f92716d == null || hVar == null || this.f92714b == null)) {
                    Matrix.setIdentityM(this.f92722j, 0);
                    this.f92716d.mo75012a(hVar.mo74991c(), false, 0, this.f92722j);
                    hVar.mo74992d();
                    this.f92725m.mo74981a(System.nanoTime());
                    this.f92725m.mo74986e();
                }
            }
            hVar.mo74990b();
            return;
        }
        synchronized (this.f92728p) {
            while (!this.f92728p.isEmpty()) {
                C36225k kVar = (C36225k) this.f92728p.remove(0);
                if (this.f92721i == 4) {
                    if (this.f92715c == null) {
                        this.f92715c = new C36219f();
                        if (!this.f92715c.mo75014a(this.f92720h, this.f92719g)) {
                            mo74996b();
                        }
                        this.f92730r = new float[16];
                    }
                    if (this.f92715c == null) {
                        continue;
                    } else if (kVar != null) {
                        if (this.f92714b != null) {
                            synchronized (kVar) {
                                if (!kVar.f92737c) {
                                    kVar.updateTexImage();
                                    long timestamp = kVar.getTimestamp();
                                    if (kVar.f92736b) {
                                        C36221h hVar2 = kVar.f92735a;
                                        kVar.getTransformMatrix(this.f92730r);
                                        Matrix.setIdentityM(this.f92722j, 0);
                                        Matrix.scaleM(this.f92722j, 0, ((Float) this.f92723k.first).floatValue(), ((Float) this.f92723k.second).floatValue(), 1.0f);
                                        GLES20.glViewport(0, 0, this.f92720h, this.f92719g);
                                        this.f92715c.mo75013a(hVar2.mo74991c(), false, 0, this.f92730r, this.f92722j);
                                        hVar2.mo74992d();
                                        this.f92725m.mo74981a(timestamp);
                                        this.f92725m.mo74986e();
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo74994a(int i, int i2) {
        Message obtainMessage = this.f92727o.obtainMessage(10);
        obtainMessage.arg1 = i;
        obtainMessage.arg2 = i2;
        this.f92727o.sendMessage(obtainMessage);
    }

    /* renamed from: b */
    private C36221h m81799b(int i, int i2) {
        Message obtainMessage = this.f92727o.obtainMessage(3);
        Message message = new Message();
        message.arg1 = 1;
        obtainMessage.arg1 = 0;
        obtainMessage.arg2 = 0;
        obtainMessage.obj = message;
        this.f92727o.sendMessage(obtainMessage);
        try {
            synchronized (message) {
                while (message.arg1 != 0) {
                    message.wait(10);
                }
            }
            return (C36221h) message.obj;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public C36223j(Object obj, Object obj2) {
        this.f92714b = obj;
        this.f92731s = false;
        this.f92721i = 3;
        this.f92726n.start();
        m81801i();
        this.f92722j = new float[16];
    }
}
