package com.facebook.p909a.p910a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.a.a.f */
public final class C13540f implements SensorEventListener {

    /* renamed from: a */
    public C13541a f35348a;

    /* renamed from: com.facebook.a.a.f$a */
    public interface C13541a {
        /* renamed from: a */
        void mo25345a();
    }

    C13540f() {
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f35348a != null) {
            float f = sensorEvent.values[0];
            double d = (double) (f / 9.80665f);
            double d2 = (double) (sensorEvent.values[1] / 9.80665f);
            double d3 = (double) (sensorEvent.values[2] / 9.80665f);
            Double.isNaN(d);
            Double.isNaN(d);
            double d4 = d * d;
            Double.isNaN(d2);
            Double.isNaN(d2);
            double d5 = d4 + (d2 * d2);
            Double.isNaN(d3);
            Double.isNaN(d3);
            if (Math.sqrt(d5 + (d3 * d3)) > 2.299999952316284d) {
                this.f35348a.mo25345a();
            }
        }
    }
}
