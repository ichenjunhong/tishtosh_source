package com.p683ss.android.ugc.aweme.detail.operators;

import com.p683ss.android.ugc.aweme.feed.param.C30669b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.r */
final class C27467r extends C27428c {
    public final int getPageType(int i) {
        return i + 4000;
    }

    C27467r(String str) {
        super(str);
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72185a.f72146a = bVar.getPageType();
        super.request(i, bVar, i2, z);
    }
}
