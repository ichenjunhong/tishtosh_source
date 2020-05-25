package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.C0184k;
import com.p683ss.android.ugc.asve.p1239c.C20347c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl */
public class VEMultiEditVideoCoverGeneratorImpl extends VEVideoCoverGeneratorImpl {

    /* renamed from: a */
    public int f107580a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo86760a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = (i3 * i4) + this.f107580a;
        }
        return iArr;
    }

    public VEMultiEditVideoCoverGeneratorImpl(C20347c cVar, C0184k kVar, int i, int i2, int i3) {
        super(cVar, kVar, i, "choose_cover");
        this.f107583c = i2;
        this.f107580a = i3;
    }
}
