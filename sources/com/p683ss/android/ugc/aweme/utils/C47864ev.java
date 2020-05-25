package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.utils.C47865ew.C47867a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ev */
public final class C47864ev implements ISecUidDependService {

    /* renamed from: a */
    public static final C47864ev f120425a = new C47864ev();

    /* renamed from: b */
    private final /* synthetic */ ISecUidDependService f120426b;

    public final void checkLarkEmail(String str, C47867a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f120426b.checkLarkEmail(str, aVar);
    }

    public final void reportToChat(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f120426b.reportToChat(str, str2, str3, str4, str5, str6);
    }

    private C47864ev() {
        ISecUidDependService createISecUidDependServicebyMonsterPlugin = SecUidDependServiceImpl.createISecUidDependServicebyMonsterPlugin();
        C52711k.m112236a((Object) createISecUidDependServicebyMonsterPlugin, "ServiceManager.get().get…ependService::class.java)");
        this.f120426b = createISecUidDependServicebyMonsterPlugin;
    }
}
