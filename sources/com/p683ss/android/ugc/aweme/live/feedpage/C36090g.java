package com.p683ss.android.ugc.aweme.live.feedpage;

import android.util.Log;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.g */
final /* synthetic */ class C36090g implements C1710e {

    /* renamed from: a */
    private final C36086a f92472a;

    C36090g(C36086a aVar) {
        this.f92472a = aVar;
    }

    public final void accept(Object obj) {
        C36086a aVar = this.f92472a;
        Throwable th = (Throwable) obj;
        StringBuilder sb = new StringBuilder("refresh net:");
        sb.append(Log.getStackTraceString(th));
        C32458a.m75150b("LiveStateManager", sb.toString());
        aVar.f92459a = false;
        C36084c.this.mo74838b();
    }
}
