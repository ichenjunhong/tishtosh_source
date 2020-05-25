package com.p683ss.android.ugc.aweme.feed.p1736ui.landscape;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c */
public final class C31033c {

    /* renamed from: k */
    public static final C31034a f81260k = new C31034a(null);

    /* renamed from: a */
    public SensorManager f81261a;

    /* renamed from: b */
    public boolean f81262b;

    /* renamed from: c */
    public C31036c f81263c;

    /* renamed from: d */
    public boolean f81264d;

    /* renamed from: e */
    public int f81265e = -1;

    /* renamed from: f */
    public Sensor f81266f;

    /* renamed from: g */
    public Sensor f81267g;

    /* renamed from: h */
    public boolean f81268h;

    /* renamed from: i */
    public final Handler f81269i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public final Context f81270j;

    /* renamed from: l */
    private int f81271l;

    /* renamed from: m */
    private final C31035b f81272m;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$a */
    public static final class C31034a {
        private C31034a() {
        }

        public /* synthetic */ C31034a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$b */
    public interface C31035b {
        /* renamed from: a */
        C30016ag mo62942a();

        /* renamed from: b */
        Aweme mo62943b();

        /* renamed from: c */
        String mo62944c();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$c */
    public final class C31036c implements SensorEventListener {
        public final void onAccuracyChanged(Sensor sensor, int i) {
            C52711k.m112240b(sensor, "arg0");
        }

        public C31036c() {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            ContentResolver contentResolver;
            C52711k.m112240b(sensorEvent, "event");
            C31033c.this.f81268h = true;
            try {
                Context context = C31033c.this.f81270j;
                if (context != null) {
                    contentResolver = context.getContentResolver();
                } else {
                    contentResolver = null;
                }
                int i = System.getInt(contentResolver, "accelerometer_rotation");
                if (i == 0) {
                    if (C31033c.this.f81265e == 1) {
                        C31033c.this.f81262b = false;
                        C31033c.this.mo63825a(0);
                        C31033c.this.f81265e = i;
                    }
                    return;
                }
                C31033c.this.f81265e = i;
                float[] fArr = sensorEvent.values;
                int i2 = -1;
                float f = -fArr[0];
                float f2 = -fArr[1];
                float f3 = -fArr[2];
                if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                    int round = 90 - Math.round(((float) Math.atan2((double) (-f2), (double) f)) * 57.29578f);
                    while (round >= 360) {
                        round -= 360;
                    }
                    i2 = round;
                    while (i2 < 0) {
                        i2 += 360;
                    }
                }
                if (62 <= i2 && 134 >= i2) {
                    C31033c.this.mo63825a(2);
                    C31033c.this.f81262b = true;
                } else if (136 <= i2 && 224 >= i2) {
                    C31033c.this.mo63825a(3);
                    C31033c.this.f81262b = false;
                } else if (226 <= i2 && 298 >= i2) {
                    C31033c.this.mo63825a(1);
                    C31033c.this.f81262b = true;
                } else {
                    if ((300 <= i2 && 345 >= i2) || (1 <= i2 && 45 >= i2)) {
                        C31033c.this.mo63825a(0);
                        C31033c.this.f81262b = false;
                    }
                }
            } catch (SettingNotFoundException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$d */
    public static final class C31037d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C31033c f81274a;

        public C31037d(C31033c cVar) {
            this.f81274a = cVar;
        }

        public final void run() {
            if (!this.f81274a.f81268h) {
                SensorManager sensorManager = this.f81274a.f81261a;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this.f81274a.f81263c);
                }
                if (this.f81274a.f81267g != null) {
                    SensorManager sensorManager2 = this.f81274a.f81261a;
                    if (sensorManager2 != null) {
                        sensorManager2.registerListener(this.f81274a.f81263c, this.f81274a.f81267g, 3);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63824a() {
        if (this.f81264d) {
            this.f81264d = false;
            SensorManager sensorManager = this.f81261a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f81263c);
            }
        }
    }

    /* renamed from: a */
    public final void mo63825a(int i) {
        C30016ag agVar;
        Aweme aweme;
        C31035b bVar = this.f81272m;
        String str = null;
        if (bVar != null) {
            agVar = bVar.mo62942a();
        } else {
            agVar = null;
        }
        if (C31186b.m72817e(agVar)) {
            C31035b bVar2 = this.f81272m;
            if (bVar2 != null) {
                aweme = bVar2.mo62943b();
            } else {
                aweme = null;
            }
            C31035b bVar3 = this.f81272m;
            if (bVar3 != null) {
                str = bVar3.mo62944c();
            }
            C47718bf.m103288a(new C31032b(aweme, str, i));
            this.f81271l = i;
        }
    }

    public C31033c(Context context, C31035b bVar) {
        Sensor sensor;
        this.f81270j = context;
        this.f81272m = bVar;
        Context context2 = this.f81270j;
        if (context2 != null) {
            Object systemService = context2.getSystemService("sensor");
            if (systemService != null) {
                if (systemService != null) {
                    this.f81261a = (SensorManager) systemService;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.hardware.SensorManager");
                }
            }
        }
        SensorManager sensorManager = this.f81261a;
        Sensor sensor2 = null;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        this.f81267g = sensor;
        SensorManager sensorManager2 = this.f81261a;
        if (sensorManager2 != null) {
            sensor2 = sensorManager2.getDefaultSensor(1);
        }
        this.f81266f = sensor2;
        this.f81263c = new C31036c();
    }
}
