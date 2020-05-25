package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import com.p683ss.android.ugc.aweme.challenge.ChallengeDetailProvicer;
import com.p683ss.android.ugc.aweme.challenge.service.C24600b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.af */
public final class C24632af {

    /* renamed from: a */
    public static final C24632af f65187a = new C24632af();

    /* renamed from: b */
    private static final C24600b f65188b;

    private C24632af() {
    }

    /* renamed from: a */
    public static C24600b m60127a() {
        return f65188b;
    }

    static {
        C24600b createLiveChallengeDelegate = ChallengeDetailProvicer.createIChallengeDetailProviderbyMonsterPlugin().createLiveChallengeDelegate();
        C52711k.m112236a((Object) createLiveChallengeDelegate, "ServiceManager.get().get…teLiveChallengeDelegate()");
        f65188b = createLiveChallengeDelegate;
    }
}
