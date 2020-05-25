package com.p683ss.p2568f.p2569a.p2573d;

import android.content.Context;
import android.media.AudioManager;
import com.p683ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.f.a.d.c */
public final class C51333c {

    /* renamed from: a */
    public final Context f128275a;

    /* renamed from: b */
    public MediaPlayer f128276b = null;

    /* renamed from: c */
    private float f128277c;

    /* renamed from: a */
    private float m110392a() {
        int i;
        if (this.f128275a == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) this.f128275a.getSystemService("audio");
        if (audioManager != null) {
            i = audioManager.getStreamMaxVolume(3);
        } else {
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        return (float) i;
    }

    /* renamed from: b */
    private float m110393b() {
        int i;
        if (this.f128275a == null) {
            return 0.0f;
        }
        AudioManager audioManager = (AudioManager) this.f128275a.getSystemService("audio");
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
        } else {
            i = 0;
        }
        if (i < 0) {
            i = 0;
        }
        return (float) i;
    }

    /* renamed from: a */
    public final void mo101879a(boolean z) {
        if (this.f128276b != null) {
            if (this.f128276b.isOSPlayer()) {
                float a = m110392a();
                if (a > 0.0f) {
                    this.f128277c = m110393b() / a;
                }
                if (z) {
                    this.f128276b.setVolume(0.0f, 0.0f);
                } else {
                    this.f128276b.setVolume(this.f128277c, this.f128277c);
                }
            } else {
                this.f128276b.setIsMute(z);
            }
        }
    }

    public C51333c(Context context, MediaPlayer mediaPlayer) {
        this.f128275a = context;
    }
}
