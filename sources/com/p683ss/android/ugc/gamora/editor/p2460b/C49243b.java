package com.p683ss.android.ugc.gamora.editor.p2460b;

import android.arch.lifecycle.C0199s;
import dmt.p2652av.video.C52904aa;

/* renamed from: com.ss.android.ugc.gamora.editor.b.b */
final /* synthetic */ class C49243b implements C0199s {

    /* renamed from: a */
    private final C49231a f123694a;

    C49243b(C49231a aVar) {
        this.f123694a = aVar;
    }

    public final void onChanged(Object obj) {
        C49231a aVar = this.f123694a;
        C52904aa aaVar = (C52904aa) obj;
        if (aaVar.f131237h == 1) {
            aVar.mo97211a(false, aaVar.f131238i, aaVar.f131232c, aaVar.f131233d, aaVar.f131234e, aaVar.f131230a, aaVar.f131231b, false);
        } else if (aaVar.f131237h == 0) {
            aVar.mo97211a(true, aaVar.f131238i, aaVar.f131232c, aaVar.f131233d, aaVar.f131234e, aaVar.f131230a, aaVar.f131231b, aaVar.f131235f);
        }
        if (aVar.f123646l != null) {
            aVar.f123646l.mo97160a(aaVar);
        }
    }
}
