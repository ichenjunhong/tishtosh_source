package com.p683ss.android.ugc.aweme.challenge.api;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.router.interceptor.IInterceptor;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService */
public interface IChallengeDetailService {
    C26875a createChallengeAwemeModel();

    ChallengeAwemeList getChallengeAwemeList(String str, long j, int i, int i2, boolean z, String str2, String str3) throws Exception;

    IInterceptor getChallengeUrlInterceptor();

    void mobRefreshInChallengeAweme(C26875a aVar, List<Aweme> list);

    void startDialogStyleChallenge(FragmentActivity fragmentActivity, ChallengeDetailParam challengeDetailParam);
}
