package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

@C16299uq
public final class aie implements OnAudioFocusChangeListener {

    /* renamed from: a */
    float f40581a = 1.0f;

    /* renamed from: b */
    private final AudioManager f40582b;

    /* renamed from: c */
    private final aif f40583c;

    /* renamed from: d */
    private boolean f40584d;

    /* renamed from: e */
    private boolean f40585e;

    /* renamed from: f */
    private boolean f40586f;

    public aie(Context context, aif aif) {
        this.f40582b = (AudioManager) context.getSystemService("audio");
        this.f40583c = aif;
    }

    /* renamed from: a */
    public final void mo28959a(boolean z) {
        this.f40586f = z;
        mo28962d();
    }

    /* renamed from: a */
    public final float mo28958a() {
        float f = this.f40586f ? 0.0f : this.f40581a;
        if (this.f40584d) {
            return f;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo28960b() {
        this.f40585e = true;
        mo28962d();
    }

    /* renamed from: c */
    public final void mo28961c() {
        this.f40585e = false;
        mo28962d();
    }

    public final void onAudioFocusChange(int i) {
        this.f40584d = i > 0;
        this.f40583c.mo28848e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo28962d() {
        boolean z = false;
        boolean z2 = this.f40585e && !this.f40586f && this.f40581a > 0.0f;
        if (!z2 || this.f40584d) {
            if (!z2 && this.f40584d) {
                if (this.f40582b != null && this.f40584d) {
                    if (this.f40582b.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.f40584d = z;
                }
                this.f40583c.mo28848e();
            }
            return;
        }
        if (this.f40582b != null && !this.f40584d) {
            if (this.f40582b.requestAudioFocus(this, 3, 2) == 1) {
                z = true;
            }
            this.f40584d = z;
        }
        this.f40583c.mo28848e();
    }
}
