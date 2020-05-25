package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class bio extends bin {

    /* renamed from: b */
    private final AudioTimestamp f42531b = new AudioTimestamp();

    /* renamed from: c */
    private long f42532c;

    /* renamed from: d */
    private long f42533d;

    /* renamed from: e */
    private long f42534e;

    public bio() {
        super(null);
    }

    /* renamed from: a */
    public final void mo30243a(AudioTrack audioTrack, boolean z) {
        super.mo30243a(audioTrack, z);
        this.f42532c = 0;
        this.f42533d = 0;
        this.f42534e = 0;
    }

    /* renamed from: d */
    public final boolean mo30247d() {
        boolean timestamp = this.f42525a.getTimestamp(this.f42531b);
        if (timestamp) {
            long j = this.f42531b.framePosition;
            if (this.f42533d > j) {
                this.f42532c++;
            }
            this.f42533d = j;
            this.f42534e = j + (this.f42532c << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo30248e() {
        return this.f42531b.nanoTime;
    }

    /* renamed from: f */
    public final long mo30249f() {
        return this.f42534e;
    }
}
