package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import android.support.p043v7.app.C1160b;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.base.activity.i */
final /* synthetic */ class C23430i implements C1710e {

    /* renamed from: a */
    private final CustomErrorActivity f62493a;

    /* renamed from: b */
    private final C1160b f62494b;

    C23430i(CustomErrorActivity customErrorActivity, C1160b bVar) {
        this.f62493a = customErrorActivity;
        this.f62494b = bVar;
    }

    public final void accept(Object obj) {
        CustomErrorActivity customErrorActivity = this.f62493a;
        C1160b bVar = this.f62494b;
        if (((CrashCreateChatResponseBean) obj).isSuccess()) {
            C9432q.m18676a((Context) customErrorActivity, "create chat success");
            bVar.dismiss();
            return;
        }
        C9432q.m18676a((Context) customErrorActivity, "create chat failed");
    }
}
