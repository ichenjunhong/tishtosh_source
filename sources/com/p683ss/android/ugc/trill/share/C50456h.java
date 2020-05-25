package com.p683ss.android.ugc.trill.share;

import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12316a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;

/* renamed from: com.ss.android.ugc.trill.share.h */
final /* synthetic */ class C50456h implements C12316a {

    /* renamed from: a */
    private final SyncShareView f126512a;

    C50456h(SyncShareView syncShareView) {
        this.f126512a = syncShareView;
    }

    /* renamed from: a */
    public final void mo23306a(AuthResult authResult) {
        SyncShareView syncShareView = this.f126512a;
        if (authResult.f32453a) {
            String str = authResult.f32458f;
            String str2 = authResult.f32459g;
            SyncShareView.m108695a(syncShareView.mBtnTwitter, true);
            C20902b.m53242a().updateHasTwitterToken(true);
            C20902b.m53242a().updateTwExpireTime();
            SharePrefCache.inst().getTwitterAccessToken().mo47776a(str);
            SharePrefCache.inst().getTwitterSecret().mo47776a(str2);
            SharePrefCache.inst().getAutoSendTwitter().mo47776a(Boolean.valueOf(true));
            C50310a.m108579b(str, str2);
        }
    }
}
