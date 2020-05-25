package com.p683ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26913l.C26914a;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.common.d */
public final class C26858d implements SensorEventListener {

    /* renamed from: h */
    public static float f70702h = ((float) C23859b.m58575b().mo49467b((Context) AwemeApplication.m56199a(), "douyidou_threshold", 7));

    /* renamed from: i */
    public static int f70703i = 3;

    /* renamed from: j */
    public static final C26859a f70704j = new C26859a(null);

    /* renamed from: a */
    public boolean f70705a = true;

    /* renamed from: b */
    public final SensorManager f70706b;

    /* renamed from: c */
    public Sensor f70707c;

    /* renamed from: d */
    public final C26860b f70708d;

    /* renamed from: e */
    public C26913l f70709e;

    /* renamed from: f */
    public boolean f70710f;

    /* renamed from: g */
    public Context f70711g;

    /* renamed from: k */
    private final Vibrator f70712k;

    /* renamed from: l */
    private long f70713l;

    /* renamed from: m */
    private long f70714m;

    /* renamed from: n */
    private final C26861c f70715n;

    /* renamed from: o */
    private float f70716o;

    /* renamed from: p */
    private float f70717p;

    /* renamed from: com.ss.android.ugc.aweme.common.d$a */
    public static final class C26859a {
        private C26859a() {
        }

        public /* synthetic */ C26859a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$b */
    public interface C26860b {
        /* renamed from: a */
        boolean mo54818a();

        /* renamed from: b */
        void mo54819b();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$c */
    public static final class C26861c {

        /* renamed from: a */
        int f70718a;

        /* renamed from: b */
        final float[] f70719b = new float[this.f70721d];

        /* renamed from: c */
        final long[] f70720c = new long[this.f70721d];

        /* renamed from: d */
        int f70721d = 20;

        public C26861c(int i) {
        }

        /* renamed from: a */
        public final void mo54820a(float f, long j) {
            this.f70719b[this.f70718a] = f;
            this.f70720c[this.f70718a] = j;
            this.f70718a = (this.f70718a + 1) % this.f70721d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$d */
    static final class C26862d implements C26914a {

        /* renamed from: a */
        final /* synthetic */ C26858d f70722a;

        C26862d(C26858d dVar) {
            this.f70722a = dVar;
        }

        /* renamed from: a */
        public final void mo54821a() {
            C26860b bVar = this.f70722a.f70708d;
            if (bVar != null && bVar.mo54818a()) {
                this.f70722a.mo54815c();
            }
            C26858d.m64945a("shake");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$e */
    static final class C26863e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C26858d f70723a;

        C26863e(C26858d dVar) {
            this.f70723a = dVar;
        }

        public final void run() {
            SensorManager sensorManager = this.f70723a.f70706b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f70723a);
            }
            C26913l lVar = this.f70723a.f70709e;
            if (lVar != null) {
                lVar.f70780d.unregisterListener(lVar);
                lVar.f70782f = false;
            }
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: b */
    public final void mo54814b() {
        if (this.f70707c != null) {
            C18842a.m45934b(new C26863e(this));
        }
    }

    /* renamed from: c */
    public final void mo54815c() {
        Vibrator vibrator = this.f70712k;
        if (vibrator != null) {
            vibrator.vibrate(500);
        }
    }

    /* renamed from: a */
    public final void mo54813a() {
        if (this.f70709e == null && C23859b.m58575b().mo49471b(AwemeApplication.m56199a(), "enable_douyidou_and_shake")) {
            this.f70709e = new C26913l(this.f70711g, new C26862d(this));
        }
    }

    /* renamed from: a */
    public static void m64945a(String str) {
        C26890h.m65011a("triger_dou", new C23089d().mo47829a("enter_from", str).f61491a);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        boolean z2;
        mo54813a();
        if (this.f70709e != null) {
            C26913l lVar = this.f70709e;
            if (lVar != null && !lVar.f70782f) {
                C26913l lVar2 = this.f70709e;
                if (lVar2 != null) {
                    lVar2.mo54868a();
                }
            }
        }
        C26913l lVar3 = this.f70709e;
        if (lVar3 != null) {
            lVar3.f70778a = this.f70705a;
        }
        if (sensorEvent != null && this.f70705a && System.currentTimeMillis() - this.f70713l > 50) {
            this.f70713l = System.currentTimeMillis();
            float f = this.f70717p;
            float f2 = sensorEvent.values[0];
            float f3 = sensorEvent.values[1];
            float f4 = sensorEvent.values[2];
            Sensor sensor = sensorEvent.sensor;
            C52711k.m112236a((Object) sensor, "event.sensor");
            if (sensor.getType() == 4) {
                this.f70717p = f3;
                this.f70716o = (this.f70716o * 0.9f) + (this.f70717p - f);
                this.f70715n.mo54820a(this.f70716o, this.f70713l);
            } else if ((Math.abs(f4) > 5.0f && Math.abs(f3) < 5.0f) || (Math.abs(f3) > 5.0f && Math.abs(f4) < 5.0f)) {
                this.f70717p = f2;
                this.f70716o = (this.f70716o * 0.9f) + (this.f70717p - f);
                this.f70715n.mo54820a(this.f70716o, this.f70713l);
            }
            if (this.f70713l - this.f70714m >= 2000) {
                if (Math.abs(this.f70716o) > f70702h / 2.0f && (this.f70714m == 0 || this.f70710f)) {
                    C26860b bVar = this.f70708d;
                    if (bVar != null) {
                        bVar.mo54819b();
                    }
                    this.f70710f = false;
                    this.f70714m = 1;
                }
                if (Math.abs(this.f70716o) > f70702h) {
                    C26861c cVar = this.f70715n;
                    int i = cVar.f70718a;
                    int i2 = cVar.f70721d;
                    int i3 = i;
                    int i4 = 0;
                    int i5 = 0;
                    boolean z3 = true;
                    while (true) {
                        if (i4 >= i2) {
                            break;
                        }
                        i3--;
                        if (i3 < 0) {
                            i3 = cVar.f70721d - 1;
                        }
                        if (cVar.f70720c[i3] <= 0) {
                            break;
                        }
                        float f5 = cVar.f70719b[i3];
                        if (Math.abs(f5) >= f70702h) {
                            if (f5 > 0.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i5 == 0 || z2 != z3) {
                                i5++;
                                z3 = z2;
                            }
                            if (i5 >= f70703i) {
                                z = true;
                                break;
                            }
                        }
                        i4++;
                    }
                    z = false;
                    if (z) {
                        C26861c cVar2 = this.f70715n;
                        cVar2.f70718a = 0;
                        int i6 = cVar2.f70721d;
                        for (int i7 = 0; i7 < i6; i7++) {
                            cVar2.f70720c[i7] = 0;
                        }
                        this.f70714m = this.f70713l;
                        C26860b bVar2 = this.f70708d;
                        if (bVar2 != null && bVar2.mo54818a()) {
                            mo54815c();
                        }
                        m64945a("dou");
                        this.f70710f = true;
                    }
                }
            }
        }
    }

    public C26858d(Context context, C26860b bVar) {
        C52711k.m112240b(context, "context");
        this.f70711g = context;
        this.f70708d = bVar;
        this.f70715n = new C26861c(20);
        Object systemService = this.f70711g.getSystemService("sensor");
        if (systemService != null) {
            this.f70706b = (SensorManager) systemService;
            Context context2 = this.f70711g;
            boolean z = false;
            if (context2 != null) {
                Object systemService2 = context2.getSystemService("sensor");
                if (systemService2 == null) {
                    throw new C52857u("null cannot be cast to non-null type android.hardware.SensorManager");
                } else if (((SensorManager) systemService2).getDefaultSensor(4) != null && Keva.getRepoFromSp(C11010c.m22280a(), "DeviceSettingSp", 0).getBoolean("support_douyidou", true)) {
                    z = true;
                }
            }
            if (z) {
                this.f70707c = this.f70706b.getDefaultSensor(4);
            } else {
                this.f70707c = this.f70706b.getDefaultSensor(1);
                f70702h = 3.0f;
                f70703i = 3;
            }
            Object systemService3 = this.f70711g.getSystemService("vibrator");
            if (systemService3 != null) {
                this.f70712k = (Vibrator) systemService3;
                mo54813a();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.os.Vibrator");
        }
        throw new C52857u("null cannot be cast to non-null type android.hardware.SensorManager");
    }
}
