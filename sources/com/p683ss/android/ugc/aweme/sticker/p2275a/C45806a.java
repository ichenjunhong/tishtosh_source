package com.p683ss.android.ugc.aweme.sticker.p2275a;

import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2276a.C45812b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45817c;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45818d;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46298g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.a */
public final class C45806a implements C45814b {

    /* renamed from: a */
    final List<C45819c> f115786a = new ArrayList();

    /* renamed from: b */
    final C46354l f115787b;

    /* renamed from: c */
    private final List<C45812b> f115788c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a$a */
    public static final class C45807a implements C45874b {

        /* renamed from: a */
        final /* synthetic */ C45806a f115789a;

        /* renamed from: b */
        final /* synthetic */ C45817c f115790b;

        /* renamed from: b */
        public final void mo92254b(Effect effect) {
            C45874b bVar = this.f115790b.f115809d;
            if (bVar != null) {
                bVar.mo92254b(effect);
            }
        }

        /* renamed from: a */
        public final void mo92251a(Effect effect) {
            C45874b bVar = this.f115790b.f115809d;
            if (bVar != null) {
                bVar.mo92251a(effect);
            }
            C45806a aVar = this.f115789a;
            C45817c cVar = this.f115790b;
            C45808b bVar2 = new C45808b(aVar, cVar);
            Effect effect2 = cVar.f115806a.f115779a;
            C52711k.m112236a((Object) effect2, "request.sticker.effect");
            if (C45806a.m99618a(effect2) || !aVar.f115787b.mo92273a(cVar.f115806a)) {
                bVar2.mo92256b();
            } else {
                aVar.f115787b.mo92272a(cVar.f115806a, bVar2);
            }
        }

        C45807a(C45806a aVar, C45817c cVar) {
            this.f115789a = aVar;
            this.f115790b = cVar;
        }

        /* renamed from: a */
        public final void mo92252a(Effect effect, int i) {
            C45874b bVar = this.f115790b.f115809d;
            if (bVar != null) {
                bVar.mo92252a(effect, i);
            }
        }

        /* renamed from: a */
        public final void mo92253a(Effect effect, C48649d dVar) {
            C45874b bVar = this.f115790b.f115809d;
            if (bVar != null) {
                bVar.mo92253a(effect, dVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.a$b */
    public static final class C45808b implements C45875c {

        /* renamed from: a */
        final /* synthetic */ C45806a f115791a;

        /* renamed from: b */
        final /* synthetic */ C45817c f115792b;

        /* renamed from: a */
        public final void mo92255a() {
            C45875c cVar = this.f115792b.f115810e;
            if (cVar != null) {
                cVar.mo92255a();
            }
        }

        /* renamed from: b */
        public final void mo92256b() {
            C45875c cVar = this.f115792b.f115810e;
            if (cVar != null) {
                cVar.mo92256b();
            }
            C45806a aVar = this.f115791a;
            C45817c cVar2 = this.f115792b;
            Effect effect = cVar2.f115806a.f115779a;
            int a = cVar2.mo92260a();
            if (!aVar.mo92247a().mo93017c(effect)) {
                aVar.mo92247a().mo93012a(effect);
            } else {
                aVar.mo92247a().mo93013a(effect, a);
            }
            C52711k.m112236a((Object) effect, "effect");
            C46315a aVar2 = new C46315a(effect, a, cVar2.mo92261b(), false, cVar2.f115808c, 8, null);
            for (C45819c a2 : aVar.f115786a) {
                a2.mo91208a(aVar2);
            }
            StickerWrapper stickerWrapper = cVar2.f115807b;
            if (stickerWrapper != null) {
                aVar.f115787b.mo92271a(stickerWrapper, null);
            }
        }

        C45808b(C45806a aVar, C45817c cVar) {
            this.f115791a = aVar;
            this.f115792b = cVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C46298g mo92247a() {
        return this.f115787b.mo92989g();
    }

    public C45806a(C46354l lVar) {
        C52711k.m112240b(lVar, "stickerDataManager");
        this.f115787b = lVar;
    }

    /* renamed from: a */
    static boolean m99618a(Effect effect) {
        if (effect.getEffectType() == 1 || effect.getEffectType() == 2 || effect.getEffectType() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92248a(C45812b bVar) {
        C52711k.m112240b(bVar, "interceptor");
        if (!this.f115788c.contains(bVar)) {
            this.f115788c.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo92250a(C45819c cVar) {
        C52711k.m112240b(cVar, "listener");
        if (!this.f115786a.contains(cVar)) {
            this.f115786a.add(cVar);
        }
    }

    /* renamed from: a */
    public final <T> void mo92249a(C45816b<T> bVar) {
        C52711k.m112240b(bVar, "request");
        Iterable iterable = this.f115788c;
        boolean z = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(!((C45812b) it.next()).mo92257a(bVar))) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            if (bVar instanceof C45818d) {
                C45818d dVar = (C45818d) bVar;
                Effect effect = dVar.f115814a.f115779a;
                mo92247a().mo93012a(null);
                if (!mo92247a().mo93017c(effect)) {
                    for (C45819c cVar : this.f115786a) {
                        C46318d dVar2 = new C46318d(effect, dVar.mo92260a(), dVar.mo92261b(), false, dVar.f115815b, 8, null);
                        cVar.mo91209a(dVar2);
                    }
                }
            } else if (bVar instanceof C45817c) {
                C45817c cVar2 = (C45817c) bVar;
                C45807a aVar = new C45807a(this, cVar2);
                Effect effect2 = cVar2.f115806a.f115779a;
                C52711k.m112236a((Object) effect2, "request.sticker.effect");
                if (m99618a(effect2)) {
                    aVar.mo92251a(cVar2.f115806a.f115779a);
                    return;
                }
                this.f115787b.mo92271a(cVar2.f115806a, aVar);
            }
        }
    }
}
