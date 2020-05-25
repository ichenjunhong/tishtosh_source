package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2200d;

import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.c */
public final class C43698c {

    /* renamed from: a */
    public long f110635a;

    /* renamed from: b */
    public long f110636b;

    /* renamed from: c */
    public float f110637c;

    /* renamed from: d */
    public float f110638d;

    /* renamed from: e */
    public boolean f110639e;

    /* renamed from: f */
    public boolean f110640f;

    /* renamed from: g */
    public boolean f110641g;

    /* renamed from: h */
    public boolean f110642h;

    /* renamed from: i */
    public int f110643i = -1;

    /* renamed from: j */
    public int f110644j;

    /* renamed from: k */
    public int f110645k;

    /* renamed from: a */
    public final void mo89135a() {
        this.f110635a = 0;
        this.f110636b = 0;
        this.f110637c = 0.0f;
        this.f110638d = 0.0f;
    }

    /* renamed from: a */
    public final void mo89136a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.f110635a = multiEditVideoRecordData.startTime;
            this.f110636b = multiEditVideoRecordData.endTime;
            this.f110637c = multiEditVideoRecordData.leftSlideX;
            this.f110638d = multiEditVideoRecordData.rightSlideX;
        }
    }

    /* renamed from: b */
    public final void mo89137b(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.leftSlideX = this.f110637c;
        }
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.rightSlideX = this.f110638d;
        }
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.startTime = this.f110635a;
        }
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.endTime = this.f110636b;
        }
    }
}
