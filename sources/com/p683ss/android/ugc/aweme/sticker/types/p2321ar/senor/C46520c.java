package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.c */
public final class C46520c extends C44510a {

    /* renamed from: b */
    private C20489b f117379b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        double a = m97398a(sensorEvent);
        if (this.f112621a) {
            this.f117379b.mo43488b((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], a);
        }
    }

    public C46520c(C20489b bVar, boolean z) {
        super(z);
        this.f117379b = bVar;
    }
}
