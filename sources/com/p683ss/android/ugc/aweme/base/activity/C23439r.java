package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Context;
import com.bytedance.common.utility.C9432q;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.base.activity.r */
final /* synthetic */ class C23439r implements C1710e {

    /* renamed from: a */
    private final CustomErrorActivity f62508a;

    C23439r(CustomErrorActivity customErrorActivity) {
        this.f62508a = customErrorActivity;
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        C9432q.m18676a((Context) this.f62508a, "get mapping url failed , cannot be retrace ...");
    }
}
