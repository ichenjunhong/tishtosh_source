package com.p683ss.android.ugc.aweme.shortvideo.senor.defult;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.b */
public final class C44512b extends C44510a {

    /* renamed from: b */
    private C20457b f112626b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float[] fArr = sensorEvent.values;
        if (f2 > 0.0f && Math.abs(f) < f2) {
            i = 0;
        } else if (f > 0.0f && Math.abs(f2) < f) {
            i = 270;
        } else if (f2 >= 0.0f || Math.abs(f) >= (-f2)) {
            i = 90;
        } else {
            i = NormalGiftView.ALPHA_180;
        }
        if (TextUtils.equals(Build.MODEL, "vivo X9")) {
            i = 0;
        }
        if (this.f112621a) {
            this.f112626b.mo43339a(0.0f, 0.0f, (float) i);
        }
    }

    C44512b(C20457b bVar, boolean z) {
        super(z);
        this.f112626b = bVar;
    }
}
