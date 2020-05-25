package com.p683ss.android.ugc.aweme.account.login.sms;

import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15179g;
import com.p683ss.android.ugc.aweme.account.utils.C22297d;

/* renamed from: com.ss.android.ugc.aweme.account.login.sms.f */
final /* synthetic */ class C21465f implements C15175c {

    /* renamed from: a */
    private final C21464e f58238a;

    C21465f(C21464e eVar) {
        this.f58238a = eVar;
    }

    /* renamed from: a */
    public final void mo26975a(C15179g gVar) {
        C21464e eVar = this.f58238a;
        if (!gVar.mo28000b()) {
            StringBuilder sb = new StringBuilder("Failed to start SMS Retriever, exception: ");
            sb.append(gVar.mo28003e() != null ? C22297d.m55181a(gVar.mo28003e()) : "");
            C21464e.m54098a(false, sb.toString(), eVar.f58232c, eVar.f58233d);
        } else if (C21464e.f58230a) {
        }
    }
}
