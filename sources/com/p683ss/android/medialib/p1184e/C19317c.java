package com.p683ss.android.medialib.p1184e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.ss.android.medialib.e.c */
public class C19317c {

    /* renamed from: a */
    private static final String f53366a = "c";

    /* renamed from: a */
    public static Pair<Integer, Integer> m47182a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.pro");
        }
        int i = VERSION.SDK_INT;
        int i2 = UnReadVideoExperiment.BROWSE_RECORD_LIST;
        int i3 = 44100;
        if (i >= 17) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            i3 = m47181a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
            i2 = m47181a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), UnReadVideoExperiment.BROWSE_RECORD_LIST);
        }
        return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i2));
    }

    /* renamed from: a */
    private static int m47181a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
