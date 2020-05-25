package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.d */
public final class C42661d {

    /* renamed from: a */
    public long f107940a;

    /* renamed from: b */
    public long f107941b;

    /* renamed from: c */
    public int f107942c;

    /* renamed from: d */
    public float f107943d = 1.0f;

    /* renamed from: a */
    public final void mo86966a() {
        this.f107940a = 0;
        this.f107941b = 0;
        this.f107942c = 0;
        this.f107943d = 1.0f;
    }

    public C42661d(VideoSegment videoSegment) {
        this.f107940a = videoSegment.mo86952f();
        this.f107941b = videoSegment.mo86953g();
        this.f107942c = videoSegment.f107912k;
        this.f107943d = videoSegment.mo86954h();
        if (videoSegment.mo86955i()) {
            this.f107940a = videoSegment.f107917p.getVideoStart();
            this.f107941b = videoSegment.f107917p.getVideoEnd();
        }
    }

    /* renamed from: a */
    public final void mo86967a(VideoSegment videoSegment) {
        this.f107940a = videoSegment.mo86952f();
        this.f107941b = videoSegment.mo86953g();
        this.f107942c = videoSegment.f107912k;
        this.f107943d = videoSegment.mo86954h();
        if (videoSegment.mo86955i()) {
            this.f107940a = videoSegment.f107917p.getVideoStart();
            this.f107941b = videoSegment.f107917p.getVideoEnd();
        }
    }
}
