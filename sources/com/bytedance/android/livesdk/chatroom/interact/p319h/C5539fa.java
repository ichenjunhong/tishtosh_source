package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.livesdk.app.dataholder.C4639e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.fa */
final /* synthetic */ class C5539fa implements C1710e {

    /* renamed from: a */
    private final C5529ew f14595a;

    C5539fa(C5529ew ewVar) {
        this.f14595a = ewVar;
    }

    public final void accept(Object obj) {
        C5529ew ewVar = this.f14595a;
        Throwable th = (Throwable) obj;
        ewVar.f14578e = false;
        ewVar.mo11751c(th);
        if (ewVar.f14581h) {
            if (ewVar.f14583j != null) {
                ewVar.f14583j.mo11448b();
            }
            C4639e.m11122a().mo10424b();
            ewVar.mo11445l();
            return;
        }
        if (ewVar.f14583j != null) {
            ewVar.f14583j.mo11447a(th);
        }
    }
}
