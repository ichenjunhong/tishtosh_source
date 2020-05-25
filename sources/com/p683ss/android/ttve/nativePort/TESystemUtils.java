package com.p683ss.android.ttve.nativePort;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.util.Pair;
import com.p683ss.android.vesdk.runtime.VERuntime;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ttve.nativePort.TESystemUtils */
public class TESystemUtils {
    public static boolean hasLowLatencyFeature() {
        Context context = VERuntime.m109853a().f127473a;
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static Pair<Integer, Integer> getSuggestedOutputProperty() {
        Context context = VERuntime.m109853a().f127473a;
        if (context != null && VERSION.SDK_INT >= 17) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            String property2 = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
            try {
                return new Pair<>(Integer.valueOf(Integer.parseInt(property)), Integer.valueOf(Integer.parseInt(property2)));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static int getOutputLatency(int i) {
        try {
            Class cls = Class.forName("android.media.AudioSystem");
            if (cls == null) {
                return 0;
            }
            Method declaredMethod = cls.getDeclaredMethod("getOutputLatency", new Class[]{Integer.TYPE});
            if (declaredMethod == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, new Object[]{Integer.valueOf(i)})).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
