package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.e */
public final class C43672e {

    /* renamed from: a */
    private final int f110587a;

    /* renamed from: b */
    private final int f110588b;

    /* renamed from: c */
    private final long f110589c;

    /* renamed from: d */
    private final long f110590d;

    public C43672e() {
        this(0, 0, 0, 0, 15, null);
    }

    public C43672e(int i, int i2) {
        this(i, i2, 0, 0, 12, null);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo89102a(List<? extends EditVideoSegment> list) {
        C52711k.m112240b(list, "data");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(new ArrayList(), this.f110587a, this.f110588b, this.f110589c, this.f110590d, C43668b.m95936a());
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            editPreviewInfo.getVideoList().addAll(list);
            return editPreviewInfo;
        }
        throw new IllegalArgumentException("segments must not be NullOrEmpty");
    }

    public C43672e(int i, int i2, long j, long j2) {
        this.f110587a = i;
        this.f110588b = i2;
        this.f110589c = j;
        this.f110590d = j2;
    }

    public /* synthetic */ C43672e(int i, int i2, long j, long j2, int i3, C52707g gVar) {
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
