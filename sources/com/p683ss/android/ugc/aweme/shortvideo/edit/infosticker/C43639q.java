package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.p038f.C0794k;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.q */
final /* synthetic */ class C43639q implements C0199s {

    /* renamed from: a */
    private final C43535i f110537a;

    C43639q(C43535i iVar) {
        this.f110537a = iVar;
    }

    public final void onChanged(Object obj) {
        C43535i iVar = this.f110537a;
        Void voidR = (Void) obj;
        if (iVar.f110135D) {
            C0794k playBoundary = iVar.f110163f.getPlayBoundary();
            iVar.f110168k.mo88489a().setValue(C53030y.m112773a((long) iVar.f110167j.mo43088s(((Long) playBoundary.f2712b).intValue())));
            iVar.mo88620a(Math.max(((Long) playBoundary.f2711a).intValue() - 30, 0), Math.min(((Long) playBoundary.f2712b).intValue() + NormalGiftView.MASK_TRANSLATE_VALUE, iVar.f110167j.mo43071k()));
        }
    }
}
