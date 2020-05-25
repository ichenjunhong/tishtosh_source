package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: com.ss.android.ugc.aweme.utils.m */
public final class C47931m {

    /* renamed from: a */
    public AudioManager f120527a;

    /* renamed from: b */
    public OnAudioFocusChangeListener f120528b = new OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
        }
    };

    public C47931m(Context context) {
        this.f120527a = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
