package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.base.activity.j */
final /* synthetic */ class C23431j implements C1710e {

    /* renamed from: a */
    private final CustomErrorActivity f62495a;

    C23431j(CustomErrorActivity customErrorActivity) {
        this.f62495a = customErrorActivity;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        C9432q.m18676a((Context) this.f62495a, "create chat failed");
    }
}
