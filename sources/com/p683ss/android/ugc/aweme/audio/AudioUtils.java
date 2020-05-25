package com.p683ss.android.ugc.aweme.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.audio.AudioUtils */
public final class AudioUtils {

    /* renamed from: a */
    public static AudioManager f62279a = null;

    /* renamed from: b */
    public static int f62280b = -1;

    /* renamed from: c */
    private static final boolean f62281c = false;

    /* renamed from: d */
    private static int f62282d = -1;

    /* renamed from: e */
    private static boolean f62283e;

    /* renamed from: f */
    private static OnVolumeChangeListener f62284f;

    /* renamed from: com.ss.android.ugc.aweme.audio.AudioUtils$OnVolumeChangeListener */
    public static class OnVolumeChangeListener extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<AudioManager> f62285a;

        public OnVolumeChangeListener(AudioManager audioManager) {
            this.f62285a = new WeakReference<>(audioManager);
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.f62285a.get() != null) {
                    int streamVolume = ((AudioManager) this.f62285a.get()).getStreamVolume(3);
                    if (streamVolume >= 0) {
                        AudioUtils.f62280b = streamVolume;
                    }
                }
            } catch (Exception unused) {
                AudioUtils.f62280b = -1;
            }
        }
    }

    /* renamed from: a */
    public static double m57293a() {
        double d;
        boolean d2 = m57299d(C11010c.m22280a());
        double d3 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        if (d2) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        try {
            if (f62282d < 0) {
                f62282d = m57294a(C11010c.m22280a());
            }
            if (f62280b < 0 || !f62283e) {
                f62280b = m57295a(C11010c.m22280a(), 3);
            }
            double d4 = (double) f62280b;
            Double.isNaN(d4);
            double d5 = d4 * 1.0d;
            double d6 = (double) f62282d;
            Double.isNaN(d6);
            d3 = d5 / d6;
            d = new BigDecimal(d3).setScale(2, 4).doubleValue();
        } catch (Exception unused) {
            d = d3;
        }
        return d;
    }

    /* renamed from: b */
    public static int m57297b(Context context) {
        return m57295a(context, 3);
    }

    /* renamed from: a */
    public static int m57294a(Context context) {
        if (m57299d(context)) {
            return -1;
        }
        if (f62282d < 0) {
            f62282d = f62279a.getStreamMaxVolume(3);
        }
        return f62282d;
    }

    /* renamed from: d */
    public static boolean m57299d(Context context) {
        if (f62279a == null) {
            try {
                f62279a = (AudioManager) context.getApplicationContext().getSystemService("audio");
            } catch (Exception unused) {
            }
        }
        if (f62279a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static void m57301f(Context context) {
        if (f62283e) {
            try {
                context.unregisterReceiver(f62284f);
                f62284f = null;
                f62283e = false;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static void m57300e(Context context) {
        if (!f62283e) {
            try {
                if (!m57299d(context)) {
                    f62284f = new OnVolumeChangeListener(f62279a);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    context.registerReceiver(f62284f, intentFilter);
                    f62283e = true;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m57298c(Context context) {
        if (m57299d(context)) {
            return false;
        }
        if (VERSION.SDK_INT >= 23) {
            AudioDeviceInfo[] devices = f62279a.getDevices(2);
            if (devices == null) {
                return false;
            }
            for (AudioDeviceInfo type : devices) {
                int type2 = type.getType();
                if (type2 == 3 || type2 == 4 || type2 == 7 || type2 == 8) {
                    return true;
                }
            }
            return false;
        } else if (f62279a.isWiredHeadsetOn() || f62279a.isBluetoothScoOn() || f62279a.isBluetoothA2dpOn()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static int m57295a(Context context, int i) {
        if (m57299d(context)) {
            return -1;
        }
        try {
            return f62279a.getStreamVolume(3);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m57296a(Context context, int i, int i2) {
        if (m57299d(context)) {
            return false;
        }
        try {
            f62279a.setStreamVolume(3, i, i2);
            return true;
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return false;
        }
    }
}
