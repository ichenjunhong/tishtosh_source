package com.p683ss.android.ugc.aweme.story.live;

import android.util.Log;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.story.live.f */
final /* synthetic */ class C46643f implements C1710e {

    /* renamed from: a */
    static final C1710e f117648a = new C46643f();

    private C46643f() {
    }

    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            th = new IllegalStateException("unknown error");
        }
        C32458a.m75150b("Live", Log.getStackTraceString(th));
    }
}
