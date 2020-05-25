package com.p683ss.android.ugc.aweme.sticker.p2275a.p2276a;

import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45817c;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a.c */
public final class C45813c implements C45812b {

    /* renamed from: a */
    private final C46354l f115803a;

    /* renamed from: b */
    private final C45889c f115804b;

    /* renamed from: a */
    public final <T> boolean mo92257a(C45816b<T> bVar) {
        C52711k.m112240b(bVar, "request");
        if ((bVar instanceof C45817c) && bVar.mo92261b() == C45815a.UI_CLICK) {
            Effect effect = ((C45817c) bVar).f115806a.f115779a;
            C45889c cVar = this.f115804b;
            C52711k.m112236a((Object) effect, "effect");
            cVar.mo92483a(effect, C45859b.m99699a(this.f115803a, effect), FaceStickerBean.sCurPropSource, "click_main_panel", bVar.mo92260a());
        }
        return false;
    }

    public C45813c(C46354l lVar, C45889c cVar) {
        C52711k.m112240b(lVar, "stickerDataManager");
        C52711k.m112240b(cVar, "stickerMobHelper");
        this.f115803a = lVar;
        this.f115804b = cVar;
    }
}
