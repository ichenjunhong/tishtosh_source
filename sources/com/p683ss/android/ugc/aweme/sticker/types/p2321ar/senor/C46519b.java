package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.b */
public final class C46519b extends C44510a {

    /* renamed from: b */
    private C20489b f117378b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f112621a) {
            this.f117378b.mo43501c((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], m97398a(sensorEvent));
        }
    }

    public C46519b(C20489b bVar, boolean z) {
        super(z);
        this.f117378b = bVar;
    }
}
