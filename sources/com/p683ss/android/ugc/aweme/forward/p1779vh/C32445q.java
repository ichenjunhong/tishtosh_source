package com.p683ss.android.ugc.aweme.forward.p1779vh;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.forward.p1776d.C32398i;
import com.p683ss.android.ugc.aweme.main.C36546c;

/* renamed from: com.ss.android.ugc.aweme.forward.vh.q */
final /* synthetic */ class C32445q implements C0199s {

    /* renamed from: a */
    private final C32436i f84482a;

    C32445q(C32436i iVar) {
        this.f84482a = iVar;
    }

    public final void onChanged(Object obj) {
        C32436i iVar = this.f84482a;
        if ("on_ear_phone_unplug".equals((String) obj)) {
            C32398i iVar2 = (C32398i) iVar.f84369M;
            if (iVar2.mo65580n().mo95257o()) {
                iVar2.mo65579m();
                iVar.mo65557a(1);
                C36546c.m82443a("play", iVar.mo65673r(), iVar.f84362F);
                return;
            }
            C36546c.m82443a("pause", iVar.mo65673r(), iVar.f84362F);
        }
    }
}
