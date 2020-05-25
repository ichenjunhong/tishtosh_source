package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.de */
final /* synthetic */ class C40322de implements C0199s {

    /* renamed from: a */
    private final ProfileMoreFragment f102927a;

    C40322de(ProfileMoreFragment profileMoreFragment) {
        this.f102927a = profileMoreFragment;
    }

    public final void onChanged(Object obj) {
        ProfileMoreFragment profileMoreFragment = this.f102927a;
        String str = (String) obj;
        C26890h.m65011a("edit_remarks", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("account_type", "click").mo47829a("to_user_id", profileMoreFragment.f102506a.getUid()).f61491a);
        if (profileMoreFragment.f102507b == null) {
            profileMoreFragment.f102507b = (RemarkApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(RemarkApi.class);
        }
        profileMoreFragment.f102507b.commitRemarkName(str, profileMoreFragment.f102506a.getUid(), profileMoreFragment.f102506a.getSecUid()).mo20a((C0011g<TResult, TContinuationResult>) new C40327dj<TResult,TContinuationResult>(profileMoreFragment), C0013i.f25b);
    }
}
