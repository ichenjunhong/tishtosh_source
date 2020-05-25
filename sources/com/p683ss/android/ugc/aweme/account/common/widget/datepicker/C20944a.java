package com.p683ss.android.ugc.aweme.account.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.a */
public final class C20944a {

    /* renamed from: a */
    private SoundPool f57035a;

    /* renamed from: b */
    private AudioManager f57036b;

    /* renamed from: c */
    private float f57037c;

    /* renamed from: d */
    private int f57038d;

    /* renamed from: a */
    public final void mo44958a() {
        this.f57037c = (float) this.f57036b.getStreamVolume(1);
        if (this.f57038d > 0) {
            this.f57035a.play(this.f57038d, this.f57037c, this.f57037c, 0, 0, 1.0f);
        } else {
            this.f57036b.playSoundEffect(0, this.f57037c);
        }
    }
}
