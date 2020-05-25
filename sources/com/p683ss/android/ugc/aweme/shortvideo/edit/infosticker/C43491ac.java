package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ac */
final /* synthetic */ class C43491ac implements OnGlobalLayoutListener {

    /* renamed from: a */
    private final C43535i f109977a;

    C43491ac(C43535i iVar) {
        this.f109977a = iVar;
    }

    public final void onGlobalLayout() {
        C43535i iVar = this.f109977a;
        if (iVar.f110167j != null) {
            VESize b = iVar.f110167j.mo43037b();
            iVar.f110177t = (C43303dy.m94971b(iVar.f110160c) - b.width) >> 1;
            iVar.f110178u = (((C43303dy.m94974e(iVar.f110160c) - C22452a.m55500f()) - b.height) / 2) + C22452a.m55498d();
        }
    }
}
