package com.p683ss.android.medialib.camera;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19268f.C19270b;
import com.p683ss.android.medialib.camera.C19268f.C19272d;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.medialib.camera.p1182a.C19243b;
import com.p683ss.android.medialib.camera.p1182a.C19243b.C19244a;
import com.p683ss.android.medialib.camera.p1182a.C19245c;
import com.p683ss.android.medialib.camera.p1182a.C19248d;
import com.p683ss.android.medialib.log.C19349b;
import com.p683ss.android.medialib.p1180b.C19222a.C19223a;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.medialib.presenter.C19359b;
import com.p683ss.android.medialib.presenter.C19360c;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.ttve.monitor.TEMonitorInvoker;
import com.p683ss.android.vesdk.C50792y;
import com.p904e.p905a.C13456a;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.medialib.camera.g */
public final class C19274g {

    /* renamed from: a */
    public static LinkedList<Pair<Integer, Integer>> f53185a = null;

    /* renamed from: l */
    public static boolean f53186l = true;

    /* renamed from: y */
    private static C19274g f53187y;

    /* renamed from: A */
    private int f53188A = -1;

    /* renamed from: B */
    private C19223a f53189B = new C19223a() {
        /* renamed from: b */
        public final void mo39608b() {
            C50792y.m109911b("IESCameraManager", "onOpenGLDestroy...");
            if (C19274g.this.f53209u != null) {
                C19274g.this.f53209u.mo39608b();
            }
        }

        /* renamed from: a */
        public final void mo39607a() {
            C50792y.m109911b("IESCameraManager", "onOpenGLCreate...");
            if (C19274g.this.f53195f == null || C19274g.this.f53209u == null) {
                C50792y.m109914d("IESCameraManager", "presenter or camera provider is null!");
                return;
            }
            C19274g.this.f53209u.mo39607a();
            C19274g.this.f53209u.mo39676a((C19244a) new C19244a() {
                /* renamed from: a */
                public final void mo39679a() {
                    if (C19274g.this.f53199j != null) {
                        C19274g.this.f53199j.mo39748a();
                    }
                    C19274g.this.f53203o++;
                    if (C19274g.this.f53203o == 30) {
                        C19274g.this.f53204p = System.currentTimeMillis();
                        float f = 30000.0f / ((float) (C19274g.this.f53204p - C19274g.this.f53205q));
                        StringBuilder sb = new StringBuilder("Render FPS = ");
                        sb.append(f);
                        C50792y.m109911b("IESCameraManager", sb.toString());
                        C19274g.this.f53205q = C19274g.this.f53204p;
                        C19274g.this.f53203o = 0;
                    }
                }
            });
            C19274g.this.f53209u.mo39678d();
            C19274g.this.f53203o = 0;
            C19274g gVar = C19274g.this;
            C19274g gVar2 = C19274g.this;
            long currentTimeMillis = System.currentTimeMillis();
            gVar2.f53205q = currentTimeMillis;
            gVar.f53204p = currentTimeMillis;
        }

        /* renamed from: c */
        public final int mo39609c() {
            int i;
            if (C19274g.this.f53210v.getAndSet(false) && C19274g.this.f53200k.f53164b != null) {
                C19274g.this.mo39735b(C19274g.this.f53200k.f53164b);
            }
            if (C19274g.this.f53209u != null) {
                i = C19274g.this.f53209u.mo39609c();
            } else {
                i = 0;
            }
            if (i < 0) {
                return i;
            }
            if (C19274g.this.f53191b != null && C19274g.this.f53191b.mo39667n()) {
                return -3;
            }
            if (C19274g.this.f53208t) {
                return -4;
            }
            return 0;
        }
    };

    /* renamed from: C */
    private int[] f53190C = new int[2];

    /* renamed from: b */
    public C19268f f53191b;

    /* renamed from: c */
    public C19359b f53192c;

    /* renamed from: d */
    public C19358a f53193d;

    /* renamed from: e */
    public C19273e f53194e;

    /* renamed from: f */
    public C19360c f53195f;

    /* renamed from: g */
    public int f53196g;

    /* renamed from: h */
    public volatile boolean f53197h;

    /* renamed from: i */
    public boolean f53198i;

    /* renamed from: j */
    public C19279a f53199j;

    /* renamed from: k */
    public C19264d f53200k;

    /* renamed from: m */
    public boolean f53201m;

    /* renamed from: n */
    public int f53202n;

    /* renamed from: o */
    public int f53203o;

    /* renamed from: p */
    public long f53204p;

    /* renamed from: q */
    public long f53205q;

    /* renamed from: r */
    public final Object f53206r = new Object();

    /* renamed from: s */
    public long f53207s = 0;

    /* renamed from: t */
    public boolean f53208t = false;

    /* renamed from: u */
    public C19243b f53209u;

    /* renamed from: v */
    public AtomicBoolean f53210v = new AtomicBoolean(false);

    /* renamed from: w */
    public C19263c f53211w;

    /* renamed from: x */
    C19263c f53212x;

    /* renamed from: z */
    private C19272d f53213z;

    /* renamed from: com.ss.android.medialib.camera.g$a */
    public interface C19279a {
        /* renamed from: a */
        void mo39748a();
    }

    /* renamed from: a */
    public final synchronized void mo39727a(C19273e eVar) {
        this.f53194e = eVar;
        if (this.f53191b != null) {
            this.f53191b.mo39644a(eVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39729a(boolean z) {
        synchronized (this.f53206r) {
            if (this.f53191b != null) {
                this.f53191b.mo39645a(z);
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo39730a(int i) {
        boolean a;
        synchronized (this.f53206r) {
            a = this.f53191b.mo39647a(i);
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo39731a(int i, int i2, float f, float[] fArr, int i3) {
        boolean a;
        synchronized (this.f53206r) {
            a = this.f53191b.mo39648a(i, i2, f, fArr, i3);
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo39732a(final int i, C19263c cVar) {
        boolean a;
        String str = "IESCameraManager";
        StringBuilder sb = new StringBuilder("open: thread id = ");
        sb.append(Thread.currentThread().getId());
        C50792y.m109909a(str, sb.toString());
        C19349b.f53485a = System.currentTimeMillis();
        C20114g.m49645a(0, "te_record_camera_direction", (long) i);
        this.f53211w = cVar;
        this.f53212x = new C19263c() {
            /* renamed from: a */
            public final void mo39670a(int i) {
                StringBuilder sb = new StringBuilder("Open camera ");
                sb.append(i);
                sb.append(" succeed, thread id = ");
                sb.append(Thread.currentThread().getId());
                C50792y.m109909a("IESCameraManager", sb.toString());
                C19274g gVar = C19274g.this;
                if (gVar.f53200k.f53177o == 1) {
                    gVar.f53209u = new C19248d(gVar.f53191b);
                } else {
                    gVar.f53209u = new C19245c(gVar.f53191b);
                }
                gVar.f53209u.mo39677a(gVar.f53195f);
                if (C19274g.this.f53211w != null) {
                    C19274g.this.f53211w.mo39670a(i);
                } else {
                    C50792y.m109914d("IESCameraManager", "mClientListener is null!");
                }
            }

            /* renamed from: a */
            public final void mo39671a(int i, int i2, String str) {
                StringBuilder sb = new StringBuilder("Open camera ");
                sb.append(i);
                sb.append(" failed, errorCodec = ");
                sb.append(i2);
                sb.append(", info: ");
                sb.append(str);
                C50792y.m109914d("IESCameraManager", sb.toString());
                if (i == 2 && C19274g.this.f53200k.f53181s) {
                    C50792y.m109913c("IESCameraManager", "Switch to camera1 api!");
                    synchronized (C19274g.this.f53206r) {
                        if (C19274g.this.f53191b != null) {
                            C19274g.this.f53191b.mo39651b();
                        }
                        C19274g.this.f53200k.f53165c = 1;
                        C19274g.this.f53191b = new C19236a();
                        C19274g.this.f53191b.mo39640a(C19274g.this.f53200k);
                        C19274g.this.f53191b.mo39644a(C19274g.this.f53194e);
                        C19274g.this.f53191b.mo39649a(i, C19274g.this.f53212x);
                    }
                } else if (C19274g.this.f53211w != null) {
                    C19274g.this.f53211w.mo39671a(i, i2, str);
                }
            }
        };
        synchronized (this.f53206r) {
            a = this.f53191b.mo39649a(i, this.f53212x);
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo39728a(C19360c cVar) {
        this.f53195f = cVar;
        this.f53195f.mo40244a(this.f53189B);
        if (this.f53209u != null) {
            this.f53209u.mo39677a(this.f53195f);
        } else {
            C50792y.m109914d("IESCameraManager", "attach::CameraProvider is null!");
        }
    }

    /* renamed from: c */
    public final int mo39737c() {
        return this.f53190C[0];
    }

    /* renamed from: d */
    public final int mo39739d() {
        return this.f53190C[1];
    }

    /* renamed from: i */
    public final int[] mo39745i() {
        return this.f53191b.mo39664k();
    }

    /* renamed from: a */
    public final int mo39719a() {
        if (this.f53200k != null) {
            return this.f53200k.f53165c;
        }
        return 1;
    }

    /* renamed from: k */
    public final int mo39747k() {
        if (this.f53191b == null) {
            return -1;
        }
        return this.f53191b.mo39666m();
    }

    /* renamed from: b */
    public static C19274g m47034b() {
        if (f53187y == null) {
            synchronized (C19274g.class) {
                if (f53187y == null) {
                    f53187y = new C19274g();
                }
            }
        }
        return f53187y;
    }

    /* renamed from: e */
    public final synchronized void mo39741e() {
        synchronized (this.f53206r) {
            if (this.f53191b != null) {
                this.f53191b.mo39651b();
            }
        }
        this.f53201m = false;
        this.f53202n = 0;
        this.f53211w = null;
    }

    /* renamed from: f */
    public final synchronized float mo39742f() {
        float i;
        i = this.f53191b.mo39662i();
        C20114g.m49644a(0, "te_preview_camera_zoom", (double) i);
        return i;
    }

    /* renamed from: g */
    public final synchronized boolean mo39743g() {
        if (this.f53188A == -1 && this.f53191b != null) {
            this.f53188A = this.f53191b.mo39646a() ? 1 : 0;
        }
        if (this.f53188A == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final synchronized boolean mo39744h() {
        boolean z;
        synchronized (this.f53206r) {
            if (this.f53191b == null || !this.f53191b.mo39663j()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final synchronized void mo39746j() {
        mo39741e();
        if (this.f53209u != null) {
            this.f53209u.mo39677a((C19360c) null);
        }
        this.f53195f = null;
    }

    private C19274g() {
    }

    /* renamed from: b */
    public final synchronized void mo39734b(int i) {
    }

    /* renamed from: c */
    public final synchronized void mo39738c(boolean z) {
    }

    /* renamed from: a */
    public final void mo39725a(C19269a aVar) {
        this.f53191b.mo39641a(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo39736b(boolean z) {
        this.f53208t = z;
    }

    /* renamed from: b */
    public final synchronized void mo39733b(float f) {
        this.f53191b.mo39652b(f);
    }

    /* renamed from: a */
    public final synchronized void mo39720a(float f) {
        synchronized (this.f53206r) {
            this.f53191b.mo39637a(f);
        }
    }

    /* renamed from: d */
    public final void mo39740d(boolean z) {
        if ((this.f53191b instanceof C19280h) || (this.f53191b instanceof C19293i)) {
            this.f53191b.mo39654b(z);
        }
    }

    /* renamed from: b */
    public final synchronized void mo39735b(Context context) {
        int b;
        int i = 0;
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 0:
                break;
            case 1:
                i = 90;
                break;
            case 2:
                i = NormalGiftView.ALPHA_180;
                break;
            case 3:
                i = 270;
                break;
        }
        synchronized (this.f53206r) {
            b = this.f53191b.mo39650b(i);
        }
        this.f53196g = b;
        if (this.f53192c != null) {
            StringBuilder sb = new StringBuilder("摄像头偏转角度: ");
            sb.append(b);
            C50792y.m109909a("IESCameraManager", sb.toString());
            this.f53192c.mo40236k_(b);
        }
    }

    /* renamed from: a */
    public final synchronized void mo39722a(Context context) {
        C50792y.m109911b("IESCameraManager", "start: ");
        C20114g.m49645a(0, "te_record_camera_type", (long) this.f53200k.f53165c);
        mo39735b(context);
        synchronized (this.f53206r) {
            this.f53190C = this.f53191b.mo39661h();
        }
        if (f53185a == null) {
            List<int[]> l = this.f53191b.mo39665l();
            f53185a = new LinkedList<>();
            for (int[] iArr : l) {
                f53185a.add(new Pair(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1])));
            }
        }
        if (this.f53193d != null) {
            this.f53193d.mo40235b(this.f53190C[0], this.f53190C[1]);
        } else {
            C50792y.m109914d("IESCameraManager", "mCameraPreviewSizeInterface is null!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53190C[0]);
        sb.append("*");
        sb.append(this.f53190C[1]);
        C20114g.m49646a(0, "te_preview_camera_resolution", sb.toString());
    }

    /* renamed from: a */
    public final synchronized void mo39724a(C19264d dVar) {
        if (this.f53191b != null) {
            this.f53191b.mo39656c();
        }
        if (dVar.f53177o == 4 && dVar.f53165c != 1) {
            dVar.f53177o = 1;
        }
        this.f53200k = dVar;
        if (dVar.f53165c == 4 && VERSION.SDK_INT >= 23) {
            this.f53191b = new C19280h();
            dVar.f53165c = 4;
        } else if (VERSION.SDK_INT > 27 && dVar.f53165c == 5) {
            this.f53191b = new C19293i();
        } else if (dVar.f53165c != 2 || VERSION.SDK_INT < 24) {
            this.f53191b = new C19236a();
            dVar.f53165c = 1;
        } else {
            this.f53191b = new C19250b();
            dVar.f53165c = 2;
        }
        synchronized (this.f53206r) {
            this.f53191b.mo39640a(dVar);
        }
        this.f53198i = true;
    }

    /* renamed from: a */
    public final synchronized void mo39726a(C19272d dVar) {
        this.f53213z = dVar;
        if (this.f53191b != null) {
            this.f53191b.mo39643a(dVar);
        }
    }

    /* renamed from: a */
    public static boolean m47033a(Context context, int i) {
        if (i != 3 && i == 4 && VERSION.SDK_INT >= 23) {
            if (!"0".equals(C13456a.m27122a(21))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo39721a(int i, int i2, C19270b bVar) {
        this.f53191b.mo39638a(i, i2, bVar);
    }

    /* renamed from: a */
    public final synchronized void mo39723a(Context context, int i, C19263c cVar) {
        String str = "IESCameraManager";
        StringBuilder sb = new StringBuilder("changeCamera: ");
        sb.append(i);
        C50792y.m109909a(str, sb.toString());
        if (this.f53197h) {
            C50792y.m109909a("IESCameraManager", "changeCamera: return");
            return;
        }
        this.f53197h = true;
        final long currentTimeMillis = System.currentTimeMillis();
        C19349b.f53486b = currentTimeMillis;
        synchronized (this.f53206r) {
            C19268f fVar = this.f53191b;
            final Context context2 = context;
            final C19263c cVar2 = cVar;
            C192772 r1 = new C19263c() {
                /* renamed from: a */
                public final void mo39670a(int i) {
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    String str = "iesve_record_switch_camera_time";
                    float f = (float) currentTimeMillis;
                    if (TextUtils.isEmpty(str)) {
                        C50792y.m109913c("TEMonitor", "perfLong: key is null");
                    } else {
                        TEMonitorInvoker.nativePerfRational(str, 1.0f, f);
                    }
                    C20114g.m49645a(0, "te_record_switch_camera_time", currentTimeMillis);
                    C19274g.this.mo39722a(context2);
                    if (C19274g.this.f53209u != null) {
                        C19274g.this.f53209u.mo39678d();
                    }
                    if (cVar2 != null) {
                        cVar2.mo39670a(i);
                    }
                    C19274g.this.f53197h = false;
                    C19274g.this.f53207s = System.currentTimeMillis();
                }

                /* renamed from: a */
                public final void mo39671a(int i, int i2, String str) {
                    if (cVar2 != null) {
                        cVar2.mo39671a(i, i2, str);
                    }
                    C19274g.this.f53197h = false;
                    C19274g.this.f53207s = System.currentTimeMillis();
                }
            };
            if (!fVar.mo39655b(i, r1)) {
                this.f53197h = false;
            }
        }
    }
}
