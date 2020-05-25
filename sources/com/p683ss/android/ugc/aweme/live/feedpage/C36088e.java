package com.p683ss.android.ugc.aweme.live.feedpage;

import android.util.Log;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.e */
final /* synthetic */ class C36088e implements C1710e {

    /* renamed from: a */
    static final C1710e f92469a = new C36088e();

    private C36088e() {
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder("onResult:");
        sb.append(Log.getStackTraceString(th));
        C32458a.m75150b("LiveStateManager", sb.toString());
    }
}
