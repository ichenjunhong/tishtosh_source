package com.p683ss.android.ugc.aweme.challenge;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.router.C41278g;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl */
public class ChallengeDetailServiceImpl implements IChallengeDetailService {
    public C26875a createChallengeAwemeModel() {
        return new C24559a();
    }

    public IInterceptor getChallengeUrlInterceptor() {
        return new C41278g();
    }

    public static IChallengeDetailService createIChallengeDetailServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IChallengeDetailService.class);
        if (a != null) {
            return (IChallengeDetailService) a;
        }
        if (C27991b.f73448aE == null) {
            synchronized (IChallengeDetailService.class) {
                if (C27991b.f73448aE == null) {
                    C27991b.f73448aE = new ChallengeDetailServiceImpl();
                }
            }
        }
        return (ChallengeDetailServiceImpl) C27991b.f73448aE;
    }

    public void startDialogStyleChallenge(FragmentActivity fragmentActivity, ChallengeDetailParam challengeDetailParam) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(challengeDetailParam, "param");
    }

    public void mobRefreshInChallengeAweme(C26875a aVar, List<Aweme> list) {
        if (aVar instanceof C24559a) {
            C24559a aVar2 = (C24559a) aVar;
            aVar2.setItems(new ArrayList(list));
            ((ChallengeAwemeList) aVar2.mData).cursor = (long) list.size();
        }
    }

    public ChallengeAwemeList getChallengeAwemeList(String str, long j, int i, int i2, boolean z, String str2, String str3) throws Exception {
        return ChallengeApi.m59965a(str, j, i, i2, z, str2, str3);
    }
}
