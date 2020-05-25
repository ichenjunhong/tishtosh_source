package com.p683ss.android.ugc.aweme.shortvideo.edit;

import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c */
public final class C43453c extends C43322a {

    /* renamed from: b */
    public final VideoPublishEditModel f109840b;

    /* renamed from: c */
    private int f109841c;

    /* renamed from: d */
    private int f109842d;

    /* renamed from: a */
    public final int mo88379a() {
        if (this.f109841c == 0) {
            m95245e();
        }
        return this.f109841c;
    }

    /* renamed from: b */
    public final int mo88380b() {
        if (this.f109842d == 0) {
            m95245e();
        }
        return this.f109842d;
    }

    /* renamed from: c */
    public final int mo88381c() {
        if (this.f109583a) {
            return mo88379a();
        }
        return this.f109840b.videoWidth();
    }

    /* renamed from: d */
    public final int mo88382d() {
        if (this.f109583a) {
            return mo88380b();
        }
        return this.f109840b.videoHeight();
    }

    /* renamed from: e */
    private final void m95245e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.f109840b.mIsFromDraft || !this.f109840b.hasStickers()) {
            boolean a = C43302dx.m94966a(this.f109840b.videoWidth(), this.f109840b.videoHeight());
            if (a) {
                i = this.f109840b.videoWidth();
            } else {
                int[] j = C40797m.m90255j();
                if (j != null) {
                    i3 = j[0];
                } else {
                    i3 = 720;
                }
                i = m95061a(C52753d.m112322d(this.f109840b.videoWidth(), i3));
            }
            this.f109841c = i;
            if (a) {
                i2 = this.f109840b.videoHeight();
            } else {
                double d = (double) this.f109841c;
                Double.isNaN(d);
                i2 = (int) (Math.ceil(d / 9.0d) * 16.0d);
            }
            this.f109842d = i2;
            return;
        }
        if (this.f109840b.mVideoCanvasWidth > 0) {
            i4 = this.f109840b.mVideoCanvasWidth;
        } else {
            i4 = this.f109840b.videoWidth();
        }
        this.f109841c = i4;
        if (this.f109840b.mVideoCanvasHeight > 0) {
            i5 = this.f109840b.mVideoCanvasHeight;
        } else {
            i5 = this.f109840b.videoHeight();
        }
        this.f109842d = i5;
    }

    public C43453c(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "editModel");
        super(videoPublishEditModel);
        this.f109840b = videoPublishEditModel;
    }
}
