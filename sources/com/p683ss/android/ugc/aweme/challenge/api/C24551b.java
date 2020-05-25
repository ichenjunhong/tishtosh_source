package com.p683ss.android.ugc.aweme.challenge.api;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.b */
public final class C24551b implements IChallengeDetailService {

    /* renamed from: a */
    public static final C24551b f65004a = new C24551b();

    /* renamed from: b */
    private final /* synthetic */ IChallengeDetailService f65005b;

    public final C26875a<Object, Object> createChallengeAwemeModel() {
        return this.f65005b.createChallengeAwemeModel();
    }

    public final ChallengeAwemeList getChallengeAwemeList(String str, long j, int i, int i2, boolean z, String str2, String str3) {
        return this.f65005b.getChallengeAwemeList(str, j, i, i2, z, str2, str3);
    }

    public final IInterceptor getChallengeUrlInterceptor() {
        return this.f65005b.getChallengeUrlInterceptor();
    }

    public final void mobRefreshInChallengeAweme(C26875a<Object, Object> aVar, List<Aweme> list) {
        this.f65005b.mobRefreshInChallengeAweme(aVar, list);
    }

    public final void startDialogStyleChallenge(FragmentActivity fragmentActivity, ChallengeDetailParam challengeDetailParam) {
        this.f65005b.startDialogStyleChallenge(fragmentActivity, challengeDetailParam);
    }

    private C24551b() {
        IChallengeDetailService createIChallengeDetailServicebyMonsterPlugin = ChallengeDetailServiceImpl.createIChallengeDetailServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIChallengeDetailServicebyMonsterPlugin, "ServiceManager.get().get…etailService::class.java)");
        this.f65005b = createIChallengeDetailServicebyMonsterPlugin;
    }
}
