package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import android.support.p043v7.app.C1160b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.services.C23160h;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.base.activity.h */
final /* synthetic */ class C23429h implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62489a;

    /* renamed from: b */
    private final EditText f62490b;

    /* renamed from: c */
    private final String f62491c;

    /* renamed from: d */
    private final C1160b f62492d;

    C23429h(CustomErrorActivity customErrorActivity, EditText editText, String str, C1160b bVar) {
        this.f62489a = customErrorActivity;
        this.f62490b = editText;
        this.f62491c = str;
        this.f62492d = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CustomErrorActivity customErrorActivity = this.f62489a;
        EditText editText = this.f62490b;
        String str = this.f62491c;
        C1160b bVar = this.f62492d;
        String obj = editText.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            C9432q.m18676a((Context) customErrorActivity, "input user email prefix must not be null");
            return;
        }
        C23859b.m58575b().mo49465a(C11010c.m22280a(), "local_test_lark_user_email", obj);
        String serverDeviceId = AppLog.getServerDeviceId();
        CustomErrorActivityNetworkApi customErrorActivityNetworkApi = (CustomErrorActivityNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create("https://cloudapi.bytedance.net").mo19930a(CustomErrorActivityNetworkApi.class);
        CrashCreateChatRequestBean crashCreateChatRequestBean = new CrashCreateChatRequestBean(str, obj, C23018b.f61359a, C11010c.m22295p(), C23160h.m56752a(customErrorActivity).mo47873a("JENKINS_BUILD_RESULT", ""), "release", C11010c.m22291l(), serverDeviceId);
        customErrorActivityNetworkApi.crashCreateChat(crashCreateChatRequestBean).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C23430i<Object>(customErrorActivity, bVar), (C1710e<? super Throwable>) new C23431j<Object>(customErrorActivity));
    }
}
