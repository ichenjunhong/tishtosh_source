package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;

@C16299uq
final class ahw implements SensorEventListener {

    /* renamed from: a */
    final SensorManager f40516a;

    /* renamed from: b */
    Handler f40517b;

    /* renamed from: c */
    public ahy f40518c;

    /* renamed from: d */
    private final Object f40519d = new Object();

    /* renamed from: e */
    private final Display f40520e;

    /* renamed from: f */
    private final float[] f40521f = new float[9];

    /* renamed from: g */
    private final float[] f40522g = new float[9];

    /* renamed from: h */
    private float[] f40523h;

    ahw(Context context) {
        this.f40516a = (SensorManager) context.getSystemService("sensor");
        this.f40520e = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28917a() {
        if (this.f40517b != null) {
            this.f40516a.unregisterListener(this);
            this.f40517b.post(new ahx(this));
            this.f40517b = null;
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f40519d) {
                if (this.f40523h == null) {
                    this.f40523h = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f40521f, fArr);
            switch (this.f40520e.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f40521f, 2, 129, this.f40522g);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f40521f, 129, 130, this.f40522g);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f40521f, 130, 1, this.f40522g);
                    break;
                default:
                    System.arraycopy(this.f40521f, 0, this.f40522g, 0, 9);
                    break;
            }
            m32943a(1, 3);
            m32943a(2, 6);
            m32943a(5, 7);
            synchronized (this.f40519d) {
                System.arraycopy(this.f40522g, 0, this.f40523h, 0, 9);
            }
            if (this.f40518c != null) {
                this.f40518c.mo28922a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28918a(float[] fArr) {
        synchronized (this.f40519d) {
            if (this.f40523h == null) {
                return false;
            }
            System.arraycopy(this.f40523h, 0, fArr, 0, this.f40523h.length);
            return true;
        }
    }

    /* renamed from: a */
    private final void m32943a(int i, int i2) {
        float f = this.f40522g[i];
        float[] fArr = this.f40522g;
        fArr[i] = fArr[i2];
        this.f40522g[i2] = f;
    }
}
