package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.e */
public final class C42662e implements Serializable {

    /* renamed from: a */
    private long f107944a = (this.f107947d + this.f107948e);

    /* renamed from: b */
    private float f107945b = 1.0f;

    /* renamed from: c */
    private int f107946c;

    /* renamed from: d */
    private long f107947d;

    /* renamed from: e */
    private long f107948e;

    /* renamed from: f */
    private long f107949f;

    public final float getSpeed() {
        return this.f107945b;
    }

    public final long getVideoDuration() {
        return this.f107949f;
    }

    public final long getVideoEnd() {
        return this.f107944a;
    }

    public final int getVideoIndex() {
        return this.f107946c;
    }

    public final long getVideoRange() {
        return this.f107948e;
    }

    public final long getVideoStart() {
        return this.f107947d;
    }

    public final C42662e clone() {
        C42662e eVar = new C42662e(this.f107946c, this.f107947d, this.f107948e, this.f107949f);
        return eVar;
    }

    public final void setSpeed(float f) {
        this.f107945b = f;
    }

    public final void setVideoDuration(long j) {
        this.f107949f = j;
    }

    public final void setVideoEnd(long j) {
        this.f107944a = j;
    }

    public final void setVideoIndex(int i) {
        this.f107946c = i;
    }

    public final void setVideoRange(long j) {
        this.f107948e = j;
    }

    public final void setVideoStart(long j) {
        this.f107947d = j;
    }

    public final void updateVideoStartTime(long j) {
        if (j > 0 && this.f107948e > 0) {
            this.f107948e = j;
            long j2 = (this.f107944a / 2) - (j / 2);
            if (j2 > 0) {
                this.f107947d = j2;
            } else {
                this.f107947d = 0;
            }
            this.f107944a = this.f107947d + j;
        }
    }

    public final void resetVideoStartTime(long j, long j2) {
        this.f107947d = j;
        this.f107948e = j2;
        this.f107944a = j + j2;
    }

    public C42662e(int i, long j, long j2, long j3) {
        this.f107946c = i;
        this.f107947d = j;
        this.f107948e = j2;
        this.f107949f = j3;
    }
}
