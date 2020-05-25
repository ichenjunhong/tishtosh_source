package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.g */
public final class C43674g {

    /* renamed from: a */
    private final int f110593a;

    /* renamed from: b */
    private final int f110594b;

    /* renamed from: c */
    private final long f110595c;

    /* renamed from: d */
    private final long f110596d;

    public C43674g() {
        this(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo89103a(EditVideoSegment editVideoSegment) {
        C52711k.m112240b(editVideoSegment, "data");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(C52575l.m112101c(editVideoSegment), this.f110593a, this.f110594b, this.f110595c, this.f110596d, C43668b.m95936a());
        return editPreviewInfo;
    }

    private C43674g(int i, int i2, long j, long j2) {
        this.f110593a = i;
        this.f110594b = i2;
        this.f110595c = j;
        this.f110596d = j2;
    }

    public /* synthetic */ C43674g(int i, int i2, long j, long j2, int i3, C52707g gVar) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        this(i4, i5, 0, 0);
    }
}
