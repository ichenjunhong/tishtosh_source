package com.p683ss.android.ugc.aweme.shortvideo.senor.defult;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.c */
public final class C44513c extends C44510a {

    /* renamed from: b */
    private C20457b f112627b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f112621a) {
            this.f112627b.mo43351a(sensorEvent.values, m97398a(sensorEvent));
        }
    }

    C44513c(C20457b bVar, boolean z) {
        super(z);
        this.f112627b = bVar;
    }
}
