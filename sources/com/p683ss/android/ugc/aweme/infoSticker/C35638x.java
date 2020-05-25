package com.p683ss.android.ugc.aweme.infoSticker;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.x */
public final class C35638x extends C0678q {

    /* renamed from: a */
    ViewPager f91595a;

    /* renamed from: b */
    public boolean f91596b;

    /* renamed from: c */
    public boolean f91597c;

    /* renamed from: d */
    C35584av f91598d;

    public final int getCount() {
        return 2;
    }

    public final Fragment getItem(int i) {
        C35620p pVar;
        if (i == 1) {
            pVar = C35614k.m80429a(this.f91598d);
        } else {
            pVar = C35620p.m80442b(this.f91598d);
        }
        pVar.f91544i = this.f91596b;
        pVar.f91545j = this.f91597c;
        return pVar;
    }

    public C35638x(C0654k kVar, ViewPager viewPager, C35584av avVar) {
        super(kVar);
        this.f91595a = viewPager;
        this.f91598d = avVar;
    }
}
