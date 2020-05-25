package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.d */
public final class C46521d extends C44510a {

    /* renamed from: b */
    private SensorManager f117380b;

    /* renamed from: c */
    private final C20489b f117381c;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        double a = m97398a(sensorEvent);
        if (this.f112621a) {
            float[] fArr = new float[9];
            if (this.f117380b != null) {
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            }
            double[] dArr = new double[9];
            for (int i = 0; i < 9; i++) {
                dArr[i] = (double) fArr[i];
            }
            this.f117381c.mo43482a(dArr, a);
        }
    }

    public C46521d(SensorManager sensorManager, C20489b bVar, boolean z) {
        super(z);
        this.f117381c = bVar;
        this.f117380b = sensorManager;
    }
}
