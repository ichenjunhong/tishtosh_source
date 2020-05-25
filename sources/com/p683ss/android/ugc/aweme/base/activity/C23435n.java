package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.app.services.C23160h;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.base.activity.n */
final /* synthetic */ class C23435n implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62502a;

    /* renamed from: b */
    private final String f62503b;

    C23435n(CustomErrorActivity customErrorActivity, String str) {
        this.f62502a = customErrorActivity;
        this.f62503b = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CustomErrorActivity customErrorActivity = this.f62502a;
        String str = this.f62503b;
        String a = C23160h.m56752a(customErrorActivity).mo47873a("JENKINS_BUILD_RESULT", "");
        if (TextUtils.isEmpty(a)) {
            C9432q.m18676a((Context) customErrorActivity, "get jenkins build result failed , cannot be retrace ...");
            return;
        }
        C9432q.m18676a((Context) customErrorActivity, "begin retrace , please wait about 10s ...");
        ((CustomErrorActivityNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create(a).mo19930a(CustomErrorActivityNetworkApi.class)).getJenkinsBuildResult().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C23438q<Object>(customErrorActivity, str), (C1710e<? super Throwable>) new C23439r<Object>(customErrorActivity));
    }
}
