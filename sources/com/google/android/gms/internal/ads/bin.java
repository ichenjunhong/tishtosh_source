package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

class bin {

    /* renamed from: a */
    protected AudioTrack f42525a;

    /* renamed from: b */
    private boolean f42526b;

    /* renamed from: c */
    private int f42527c;

    /* renamed from: d */
    private long f42528d;

    /* renamed from: e */
    private long f42529e;

    /* renamed from: f */
    private long f42530f;

    private bin() {
    }

    /* renamed from: d */
    public boolean mo30247d() {
        return false;
    }

    /* renamed from: a */
    public void mo30243a(AudioTrack audioTrack, boolean z) {
        this.f42525a = audioTrack;
        this.f42526b = z;
        this.f42528d = 0;
        this.f42529e = 0;
        this.f42530f = 0;
        if (audioTrack != null) {
            this.f42527c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: a */
    public final boolean mo30244a() {
        return blp.f42854a <= 22 && this.f42526b && this.f42525a.getPlayState() == 2 && this.f42525a.getPlaybackHeadPosition() == 0;
    }

    /* renamed from: b */
    public final long mo30245b() {
        long playbackHeadPosition = ((long) this.f42525a.getPlaybackHeadPosition()) & 4294967295L;
        if (blp.f42854a <= 22 && this.f42526b) {
            if (this.f42525a.getPlayState() == 1) {
                this.f42528d = playbackHeadPosition;
            } else if (this.f42525a.getPlayState() == 2 && playbackHeadPosition == 0) {
                this.f42530f = this.f42528d;
            }
            playbackHeadPosition += this.f42530f;
        }
        if (this.f42528d > playbackHeadPosition) {
            this.f42529e++;
        }
        this.f42528d = playbackHeadPosition;
        return playbackHeadPosition + (this.f42529e << 32);
    }

    /* renamed from: c */
    public final long mo30246c() {
        return (mo30245b() * 1000000) / ((long) this.f42527c);
    }

    /* renamed from: e */
    public long mo30248e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public long mo30249f() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ bin(bim bim) {
        this();
    }
}
