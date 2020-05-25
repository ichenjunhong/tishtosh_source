package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.base.activity.q */
final /* synthetic */ class C23438q implements C1710e {

    /* renamed from: a */
    private final CustomErrorActivity f62506a;

    /* renamed from: b */
    private final String f62507b;

    C23438q(CustomErrorActivity customErrorActivity, String str) {
        this.f62506a = customErrorActivity;
        this.f62507b = str;
    }

    public final void accept(Object obj) {
        CustomErrorActivity customErrorActivity = this.f62506a;
        String str = this.f62507b;
        JenkinsBuildResult jenkinsBuildResult = (JenkinsBuildResult) obj;
        if (jenkinsBuildResult == null || TextUtils.isEmpty(jenkinsBuildResult.getMappingUrl())) {
            C9432q.m18676a((Context) customErrorActivity, "get mapping url failed , cannot be retrace ...");
        } else {
            ((CustomErrorActivityNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create("https://cloudapi.bytedance.net").mo19930a(CustomErrorActivityNetworkApi.class)).retrace(new RetraceRequestBean(str, jenkinsBuildResult.getMappingUrl())).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C23427f<Object>(customErrorActivity), (C1710e<? super Throwable>) new C23428g<Object>(customErrorActivity));
        }
    }
}
