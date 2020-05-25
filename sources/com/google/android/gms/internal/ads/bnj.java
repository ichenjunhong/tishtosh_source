package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

final class bnj extends bni {

    /* renamed from: b */
    private final AudioTimestamp f43088b = new AudioTimestamp();

    /* renamed from: c */
    private long f43089c;

    /* renamed from: d */
    private long f43090d;

    /* renamed from: e */
    private long f43091e;

    public bnj() {
        super(null);
    }

    /* renamed from: a */
    public final void mo30454a(AudioTrack audioTrack, boolean z) {
        super.mo30454a(audioTrack, z);
        this.f43089c = 0;
        this.f43090d = 0;
        this.f43091e = 0;
    }

    /* renamed from: d */
    public final boolean mo30457d() {
        boolean timestamp = this.f43079a.getTimestamp(this.f43088b);
        if (timestamp) {
            long j = this.f43088b.framePosition;
            if (this.f43090d > j) {
                this.f43089c++;
            }
            this.f43090d = j;
            this.f43091e = j + (this.f43089c << 32);
        }
        return timestamp;
    }

    /* renamed from: e */
    public final long mo30458e() {
        return this.f43088b.nanoTime;
    }

    /* renamed from: f */
    public final long mo30459f() {
        return this.f43091e;
    }
}
