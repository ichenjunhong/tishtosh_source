package com.p683ss.android.ugc.aweme.shortvideo.edit;

import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C43302dx;
import com.p683ss.android.vesdk.C50657c;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.VEUtils;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.j */
public class C43649j extends C43322a {

    /* renamed from: b */
    public int f110550b;

    /* renamed from: c */
    public int f110551c;

    /* renamed from: d */
    public final VideoPublishEditModel f110552d;

    /* renamed from: e */
    private int f110553e;

    /* renamed from: f */
    private int f110554f;

    /* renamed from: a */
    public int mo88379a() {
        mo88989e();
        return this.f110553e;
    }

    /* renamed from: b */
    public int mo88380b() {
        mo88989e();
        return this.f110554f;
    }

    /* renamed from: c */
    public final int mo88381c() {
        mo88989e();
        if (this.f109583a) {
            return this.f110553e;
        }
        return this.f110550b;
    }

    /* renamed from: d */
    public final int mo88382d() {
        mo88989e();
        if (this.f109583a) {
            return this.f110554f;
        }
        return this.f110551c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo88989e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f110550b == 0 || this.f110551c == 0) {
            if (!this.f110552d.isFastImport) {
                this.f110550b = this.f110552d.videoWidth();
                this.f110551c = this.f110552d.videoHeight();
            } else {
                VESize calcTargetRes = VEUtils.calcTargetRes(new int[]{mo88243a(true)}, new int[]{mo88244b(true)}, new C50657c[]{C50657c.ROTATE_NONE}, this.f110552d.getPreviewInfo().getPreviewWidth());
                this.f110550b = calcTargetRes.width;
                this.f110551c = calcTargetRes.height;
            }
        }
        if (this.f110553e == 0 || this.f110554f == 0) {
            if (!this.f110552d.mIsFromDraft || !this.f110552d.hasStickers()) {
                boolean a = C43302dx.m94966a(this.f110552d.videoWidth(), this.f110552d.videoHeight());
                if (a) {
                    i = this.f110552d.videoWidth();
                } else {
                    int[] j = C40797m.m90255j();
                    if (j != null) {
                        i3 = j[0];
                    } else {
                        i3 = 720;
                    }
                    i = m95061a(C52753d.m112322d(this.f110552d.videoWidth(), i3));
                }
                this.f110553e = i;
                if (a) {
                    i2 = this.f110552d.videoHeight();
                } else {
                    double d = (double) this.f110553e;
                    Double.isNaN(d);
                    i2 = (int) (Math.ceil(d / 9.0d) * 16.0d);
                }
                this.f110554f = i2;
            } else {
                if (this.f110552d.mVideoCanvasWidth > 0) {
                    i4 = this.f110552d.mVideoCanvasWidth;
                } else {
                    i4 = this.f110552d.videoWidth();
                }
                this.f110553e = i4;
                if (this.f110552d.mVideoCanvasHeight > 0) {
                    i5 = this.f110552d.mVideoCanvasHeight;
                } else {
                    i5 = this.f110552d.videoHeight();
                }
                this.f110554f = i5;
            }
        }
    }

    public C43649j(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "editModel");
        super(videoPublishEditModel);
        this.f110552d = videoPublishEditModel;
    }
}
