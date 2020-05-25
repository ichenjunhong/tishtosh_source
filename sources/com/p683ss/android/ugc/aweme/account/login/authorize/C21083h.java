package com.p683ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import com.bytedance.sdk.account.p877l.C13207b;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.h */
final /* synthetic */ class C21083h implements C0011g {

    /* renamed from: a */
    private final AuthorizeActivity f57322a;

    /* renamed from: b */
    private final Intent f57323b;

    /* renamed from: c */
    private final C13207b f57324c;

    C21083h(AuthorizeActivity authorizeActivity, Intent intent, C13207b bVar) {
        this.f57322a = authorizeActivity;
        this.f57323b = intent;
        this.f57324c = bVar;
    }

    public final Object then(C0013i iVar) {
        return this.f57322a.mo45114a(this.f57323b, this.f57324c, iVar);
    }
}
