package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

class bni {

    /* renamed from: a */
    protected AudioTrack f43079a;

    /* renamed from: b */
    private boolean f43080b;

    /* renamed from: c */
    private int f43081c;

    /* renamed from: d */
    private long f43082d;

    /* renamed from: e */
    private long f43083e;

    /* renamed from: f */
    private long f43084f;

    /* renamed from: g */
    private long f43085g;

    /* renamed from: h */
    private long f43086h;

    /* renamed from: i */
    private long f43087i;

    private bni() {
    }

    /* renamed from: d */
    public boolean mo30457d() {
        return false;
    }

    /* renamed from: a */
    public void mo30454a(AudioTrack audioTrack, boolean z) {
        this.f43079a = audioTrack;
        this.f43080b = z;
        this.f43085g = -9223372036854775807L;
        this.f43082d = 0;
        this.f43083e = 0;
        this.f43084f = 0;
        if (audioTrack != null) {
            this.f43081c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: a */
    public final void mo30453a(long j) {
        this.f43086h = mo30455b();
        this.f43085g = SystemClock.elapsedRealtime() * 1000;
        this.f43087i = j;
        this.f43079a.stop();
    }

    /* renamed from: a */
    public final void mo30452a() {
        if (this.f43085g == -9223372036854775807L) {
            this.f43079a.pause();
        }
    }

    /* renamed from: b */
    public final long mo30455b() {
        if (this.f43085g != -9223372036854775807L) {
            return Math.min(this.f43087i, this.f43086h + ((((SystemClock.elapsedRealtime() * 1000) - this.f43085g) * ((long) this.f43081c)) / 1000000));
        }
        int playState = this.f43079a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) this.f43079a.getPlaybackHeadPosition());
        if (this.f43080b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f43084f = this.f43082d;
            }
            playbackHeadPosition += this.f43084f;
        }
        if (this.f43082d > playbackHeadPosition) {
            this.f43083e++;
        }
        this.f43082d = playbackHeadPosition;
        return playbackHeadPosition + (this.f43083e << 32);
    }

    /* renamed from: c */
    public final long mo30456c() {
        return (mo30455b() * 1000000) / ((long) this.f43081c);
    }

    /* renamed from: e */
    public long mo30458e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo30459f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ bni(bnh bnh) {
        this();
    }
}
