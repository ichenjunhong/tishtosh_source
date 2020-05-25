package com.p683ss.android.ugc.aweme.sticker.p2280d;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45816b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46254o;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46086b;
import com.p683ss.android.ugc.aweme.sticker.panel.p2302a.C46090f;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.d */
public final class C45861d {

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.d$a */
    static final class C45862a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46297f f115883a;

        /* renamed from: b */
        final /* synthetic */ Effect f115884b;

        C45862a(C46297f fVar, Effect effect) {
            this.f115883a = fVar;
            this.f115884b = effect;
        }

        public final void run() {
            if (this.f115884b == null) {
                C45861d.m99706a(this.f115883a, (C45816b<?>) C45858a.m99693a());
            } else {
                C45861d.m99706a(this.f115883a, (C45816b<?>) C45858a.m99692a(this.f115884b, -1, C45815a.MANUAL_SET, (StickerWrapper) null, (Bundle) null, (C45874b) null, (C45875c) null, 60, (Object) null));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.d$b */
    public static final class C45863b extends C52712l implements C52671b<C46340k, Boolean> {
        public static final C45863b INSTANCE = new C45863b();

        C45863b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C46340k kVar = (C46340k) obj;
            C52711k.m112240b(kVar, "it");
            return Boolean.valueOf(kVar instanceof LegacyGameStickerHandler);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.d$c */
    public static final class C45864c implements C48703h {

        /* renamed from: a */
        final /* synthetic */ C46297f f115885a;

        /* renamed from: b */
        final /* synthetic */ Map f115886b;

        /* renamed from: c */
        final /* synthetic */ Effect f115887c;

        /* renamed from: d */
        final /* synthetic */ C45874b f115888d;

        /* renamed from: a */
        public final void mo89462a(C48649d dVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectListResponse effectListResponse = (EffectListResponse) obj;
            if (effectListResponse != null) {
                List data = effectListResponse.getData();
                if (data != null) {
                    Effect effect = (Effect) C52575l.m112140f(data);
                    if (effect != null) {
                        this.f115885a.mo93023h().mo92977a(this.f115887c);
                        this.f115885a.mo93024i().mo92249a((C45816b<T>) C45858a.m99692a(effect, -1, C45815a.MANUAL_SET, (StickerWrapper) null, (Bundle) null, this.f115888d, (C45875c) null, 44, (Object) null));
                    }
                }
            }
        }

        C45864c(C46297f fVar, Map map, Effect effect, C45874b bVar) {
            this.f115885a = fVar;
            this.f115886b = map;
            this.f115887c = effect;
            this.f115888d = bVar;
        }
    }

    /* renamed from: a */
    public static final Effect m99705a(C46297f fVar) {
        C52711k.m112240b(fVar, "$this$currentEffect");
        return fVar.mo93023h().mo92985c();
    }

    /* renamed from: b */
    public static final void m99710b(C46297f fVar) {
        C52711k.m112240b(fVar, "$this$cancelStickerViewSelected");
        fVar.mo93024i().mo92249a((C45816b<T>) C45858a.m99693a());
    }

    /* renamed from: c */
    public static final boolean m99711c(C46297f fVar) {
        C52711k.m112240b(fVar, "$this$isStickerViewShowing");
        C46254o c = fVar.mo93006c();
        if (c == null || !c.mo92776c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m99706a(C46297f fVar, C45816b<?> bVar) {
        C52711k.m112240b(fVar, "$this$submitEffectRequest");
        C52711k.m112240b(bVar, "request");
        fVar.mo93024i().mo92249a(bVar);
    }

    /* renamed from: a */
    public static final void m99707a(C46297f fVar, Effect effect) {
        C52711k.m112240b(fVar, "$this$currentEffect");
        fVar.mo93007d().post(new C45862a(fVar, effect));
    }

    /* renamed from: a */
    public static final void m99708a(C46297f fVar, List<String> list, Map<String, String> map, C48703h hVar) {
        C52711k.m112240b(fVar, "$this$fetchEffectList2");
        C52711k.m112240b(list, "effectIds");
        fVar.mo93023h().mo92981a(list, map, hVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m99709a(C46297f fVar, List list, boolean z, boolean z2, Map map, C45874b bVar, int i, int i2, Object obj) {
        Map map2;
        int i3;
        C46297f fVar2 = fVar;
        List list2 = list;
        C45874b bVar2 = null;
        if ((i2 & 8) != 0) {
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i2 & 16) == 0) {
            bVar2 = bVar;
        }
        if ((i2 & 32) != 0) {
            C46354l h = fVar.mo93023h();
            C52711k.m112240b(h, "$this$getPinIndex");
            i3 = C45859b.m99695a(h);
        } else {
            i3 = i;
        }
        C52711k.m112240b(fVar, "$this$pinStickers");
        C52711k.m112240b(list, "effects");
        if (!list.isEmpty()) {
            if (z) {
                fVar.mo93023h().mo92975a(i3, list);
            }
            if (z2) {
                boolean z3 = false;
                Effect effect = (Effect) list.get(0);
                C46254o c = fVar.mo93006c();
                if (c != null) {
                    C46086b b = c.mo92775b();
                    if (b != null) {
                        b.mo92785a(new C46090f(i3, effect));
                    }
                }
                fVar.mo93023h().mo92974a(i3);
                if (C46059g.m100069a(effect)) {
                    List children = effect.getChildren();
                    if (children != null) {
                        String str = (String) C52575l.m112140f(children);
                        if (str != null) {
                            m99708a(fVar, C52575l.m112092a(str), map2, new C45864c(fVar, map2, effect, bVar2));
                        }
                    }
                    return;
                }
                CharSequence parentId = effect.getParentId();
                if (parentId == null || parentId.length() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    fVar.mo93023h().mo92977a(effect);
                }
                fVar.mo93024i().mo92249a((C45816b<T>) C45858a.m99692a(effect, -1, C45815a.MANUAL_SET, (StickerWrapper) null, (Bundle) null, bVar2, (C45875c) null, 44, (Object) null));
            }
        }
    }
}
