package com.p683ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;

/* renamed from: com.ss.android.ugc.aweme.common.l */
public final class C26913l implements SensorEventListener {

    /* renamed from: b */
    public static float f70777b = 6.0f;

    /* renamed from: a */
    public boolean f70778a = true;

    /* renamed from: c */
    C26915b f70779c;

    /* renamed from: d */
    SensorManager f70780d;

    /* renamed from: e */
    Sensor f70781e;

    /* renamed from: f */
    public boolean f70782f;

    /* renamed from: g */
    private float f70783g;

    /* renamed from: h */
    private float f70784h;

    /* renamed from: i */
    private float f70785i;

    /* renamed from: j */
    private long f70786j;

    /* renamed from: k */
    private long f70787k;

    /* renamed from: l */
    private C26914a f70788l;

    /* renamed from: com.ss.android.ugc.aweme.common.l$a */
    public interface C26914a {
        /* renamed from: a */
        void mo54821a();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.l$b */
    static class C26915b {

        /* renamed from: a */
        int f70789a;

        /* renamed from: b */
        final float[] f70790b = new float[this.f70792d];

        /* renamed from: c */
        final long[] f70791c = new long[this.f70792d];

        /* renamed from: d */
        int f70792d = 20;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo54871a() {
            this.f70789a = 0;
            for (int i = 0; i < this.f70792d; i++) {
                this.f70791c[i] = 0;
            }
        }

        C26915b(int i) {
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: a */
    public final void mo54868a() {
        this.f70786j = 0;
        this.f70779c.mo54871a();
        this.f70780d.registerListener(this, this.f70781e, 2);
        this.f70782f = true;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        boolean z2;
        int i;
        SensorEvent sensorEvent2 = sensorEvent;
        if (this.f70778a && sensorEvent2.sensor != null && sensorEvent2.sensor.getType() == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f70786j > 50) {
                this.f70786j = currentTimeMillis;
                float f = sensorEvent2.values[0];
                float f2 = sensorEvent2.values[1];
                float f3 = sensorEvent2.values[2];
                this.f70785i = this.f70784h;
                this.f70784h = (float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
                this.f70783g = (this.f70783g * 0.9f) + (this.f70784h - this.f70785i);
                C26915b bVar = this.f70779c;
                bVar.f70790b[bVar.f70789a] = this.f70783g;
                bVar.f70791c[bVar.f70789a] = currentTimeMillis;
                bVar.f70789a = (bVar.f70789a + 1) % bVar.f70792d;
                if (currentTimeMillis - this.f70787k >= 2000 && Math.abs(this.f70783g) > f70777b) {
                    C26915b bVar2 = this.f70779c;
                    int i2 = bVar2.f70789a;
                    long j = 0;
                    long j2 = 0;
                    int i3 = 0;
                    boolean z3 = true;
                    int i4 = 0;
                    while (true) {
                        if (i3 >= bVar2.f70792d) {
                            break;
                        }
                        i2--;
                        if (i2 < 0) {
                            i2 = bVar2.f70792d - 1;
                        }
                        long j3 = bVar2.f70791c[i2];
                        if (j3 <= 0 || currentTimeMillis - j3 > 2000 || ((j > 0 && j - j3 > 800) || (j2 > 0 && j2 - j3 > 500))) {
                            break;
                        }
                        float f4 = bVar2.f70790b[i2];
                        if (Math.abs(f4) >= f70777b) {
                            if (f4 > 0.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i4 == 0 || z2 != z3) {
                                i = i4 + 1;
                                j = j3;
                            } else {
                                z2 = z3;
                                i = i4;
                            }
                            if (i >= 2) {
                                z = true;
                                break;
                            }
                            i4 = i;
                            z3 = z2;
                            j2 = j3;
                        }
                        i3++;
                    }
                    z = false;
                    if (z) {
                        this.f70779c.mo54871a();
                        this.f70787k = currentTimeMillis;
                        if (this.f70788l != null) {
                            this.f70788l.mo54821a();
                        }
                    }
                }
            }
        }
    }

    public C26913l(Context context, C26914a aVar) {
        if (this.f70778a) {
            this.f70788l = aVar;
            this.f70780d = (SensorManager) context.getSystemService("sensor");
            this.f70781e = this.f70780d.getDefaultSensor(1);
            this.f70779c = new C26915b(20);
        }
        f70777b = (float) C23859b.m58575b().mo49467b(context, "shake_threshold", 6);
    }
}
