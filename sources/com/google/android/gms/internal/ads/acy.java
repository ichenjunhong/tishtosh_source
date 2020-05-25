package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@C16299uq
public final class acy {

    /* renamed from: a */
    private boolean f40268a;

    /* renamed from: b */
    private float f40269b = 1.0f;

    /* renamed from: a */
    public final synchronized void mo28701a(float f) {
        this.f40269b = f;
    }

    /* renamed from: a */
    public final synchronized float mo28700a() {
        if (!m32673c()) {
            return 1.0f;
        }
        return this.f40269b;
    }

    /* renamed from: a */
    public final synchronized void mo28702a(boolean z) {
        this.f40268a = z;
    }

    /* renamed from: b */
    public final synchronized boolean mo28703b() {
        return this.f40268a;
    }

    /* renamed from: c */
    private final synchronized boolean m32673c() {
        return this.f40269b >= 0.0f;
    }

    /* renamed from: a */
    public static float m32672a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }
}
