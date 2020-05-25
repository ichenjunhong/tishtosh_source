package com.p683ss.android.ugc.aweme.base.activity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.ss.android.ugc.aweme.base.activity.k */
final /* synthetic */ class C23432k implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62496a;

    /* renamed from: b */
    private final String f62497b;

    C23432k(CustomErrorActivity customErrorActivity, String str) {
        this.f62496a = customErrorActivity;
        this.f62497b = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CustomErrorActivity customErrorActivity = this.f62496a;
        String str = this.f62497b;
        ((ClipboardManager) customErrorActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("crashlog", customErrorActivity.f62483a.getText().toString()));
        String charSequence = customErrorActivity.f62483a.getText().toString();
        if (!TextUtils.isEmpty(str)) {
            ((CustomErrorActivityNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create("https://cloudapi.bytedance.net").mo19930a(CustomErrorActivityNetworkApi.class)).sendMessageToUser(new SendMessageToUserBean(str, charSequence, "copy success")).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a(C23436o.f62504a, C23437p.f62505a);
        }
        C9432q.m18672a((Context) customErrorActivity, (int) R.string.aiv);
    }
}
