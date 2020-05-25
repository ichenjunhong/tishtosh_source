package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.ss.android.ugc.aweme.app.bd */
public final class C23048bd implements SensorEventListener {

    /* renamed from: e */
    public static volatile C23048bd f61404e;

    /* renamed from: f */
    public static final C23049a f61405f = new C23049a(null);

    /* renamed from: a */
    public final SensorManager f61406a;

    /* renamed from: b */
    public Sensor f61407b;

    /* renamed from: c */
    public Sensor f61408c;

    /* renamed from: d */
    public C23032at f61409d;

    /* renamed from: g */
    private final float[] f61410g;

    /* renamed from: h */
    private final float[] f61411h;

    /* renamed from: i */
    private final float[] f61412i;

    /* renamed from: j */
    private float f61413j;

    /* renamed from: k */
    private float f61414k;

    /* renamed from: com.ss.android.ugc.aweme.app.bd$a */
    public static final class C23049a {
        private C23049a() {
        }

        /* renamed from: a */
        private static C23048bd m56562a() {
            return C23048bd.f61404e;
        }

        public /* synthetic */ C23049a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C23048bd mo47774a(Context context) {
            C52711k.m112240b(context, "context");
            if (m56562a() == null) {
                synchronized (C52728w.m112245a(C23048bd.class)) {
                    if (m56562a() == null) {
                        C23048bd.f61404e = new C23048bd(context, null);
                    }
                }
            }
            C23048bd a = m56562a();
            if (a == null) {
                C52711k.m112234a();
            }
            return a;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private C23048bd(Context context) {
        this.f61410g = new float[3];
        this.f61411h = new float[3];
        this.f61412i = new float[9];
        Object systemService = context.getSystemService("sensor");
        if (systemService != null) {
            this.f61406a = (SensorManager) systemService;
            this.f61407b = this.f61406a.getDefaultSensor(1);
            this.f61408c = this.f61406a.getDefaultSensor(2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.hardware.SensorManager");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C23032at atVar = this.f61409d;
        if (atVar != null) {
            if (sensorEvent != null) {
                Sensor sensor = sensorEvent.sensor;
                if (sensor != null && sensor.getType() == 1) {
                    System.arraycopy(sensorEvent.values, 0, this.f61410g, 0, this.f61410g.length);
                }
            }
            if (sensorEvent != null) {
                Sensor sensor2 = sensorEvent.sensor;
                if (sensor2 != null && sensor2.getType() == 2) {
                    System.arraycopy(sensorEvent.values, 0, this.f61411h, 0, this.f61411h.length);
                }
            }
            if (SensorManager.getRotationMatrix(this.f61412i, null, this.f61410g, this.f61411h)) {
                float[] fArr = new float[3];
                SensorManager.getOrientation(this.f61412i, fArr);
                this.f61413j = (float) Math.toDegrees((double) fArr[0]);
                this.f61413j = (this.f61413j + 360.0f) % 360.0f;
                if (Math.abs(this.f61413j - this.f61414k) > 0.5f) {
                    atVar.mo47762a(this.f61413j);
                }
            }
        }
    }

    public /* synthetic */ C23048bd(Context context, C52707g gVar) {
        this(context);
    }
}
