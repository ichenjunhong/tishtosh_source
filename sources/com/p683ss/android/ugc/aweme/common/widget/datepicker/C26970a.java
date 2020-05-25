package com.p683ss.android.ugc.aweme.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;

/* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.a */
public final class C26970a {

    /* renamed from: a */
    private SoundPool f71114a;

    /* renamed from: b */
    private AudioManager f71115b;

    /* renamed from: c */
    private float f71116c;

    /* renamed from: d */
    private int f71117d;

    /* renamed from: a */
    public final void mo55097a() {
        this.f71116c = (float) this.f71115b.getStreamVolume(1);
        if (this.f71117d > 0) {
            this.f71114a.play(this.f71117d, this.f71116c, this.f71116c, 0, 0, 1.0f);
        } else {
            this.f71115b.playSoundEffect(0, this.f71116c);
        }
    }
}
