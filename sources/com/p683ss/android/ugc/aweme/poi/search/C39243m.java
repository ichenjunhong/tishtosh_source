package com.p683ss.android.ugc.aweme.poi.search;

import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.poi.search.m */
final /* synthetic */ class C39243m implements C52682m {

    /* renamed from: a */
    private final C39241l f100224a;

    C39243m(C39241l lVar) {
        this.f100224a = lVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        C39241l lVar = this.f100224a;
        Integer num = (Integer) obj;
        lVar.f100202a.setText((String) obj2);
        lVar.f100203b.setCurrentItem(num.intValue());
        lVar.f100204c.dismiss();
        return C52860x.f131107a;
    }
}
