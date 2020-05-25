package com.p683ss.android.ugc.aweme.app.services;

import com.p683ss.android.ugc.aweme.main.service.C36681c;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.d */
public final class C23155d implements C36681c {
    /* renamed from: a */
    public final void mo47871a(String str) {
        C52711k.m112240b(str, "data");
        SecApiImpl.createISecApibyMonsterPlugin().reportData(str);
    }
}
