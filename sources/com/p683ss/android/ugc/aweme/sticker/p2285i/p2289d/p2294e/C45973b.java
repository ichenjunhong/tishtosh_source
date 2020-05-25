package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2294e;

import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45905d;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45909g;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45915m;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b.C46030a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2178a;
import p2628d.C52668f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.e.b */
public final class C45973b implements C45915m {

    /* renamed from: a */
    private final C2178a<List<C46030a>> f116006a;

    /* renamed from: b */
    private final List<C46030a> f116007b = new ArrayList();

    /* renamed from: c */
    private final C52668f<C45909g> f116008c;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.e.b$a */
    static final class C45974a extends C52712l implements C52671b<Effect, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C45973b f116009a;

        /* renamed from: b */
        final /* synthetic */ String f116010b;

        /* renamed from: c */
        final /* synthetic */ List f116011c;

        C45974a(C45973b bVar, String str, List list) {
            this.f116009a = bVar;
            this.f116010b = str;
            this.f116011c = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "it");
            String str = this.f116010b;
            Iterable iterable = this.f116011c;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C46030a) it.next()).mo92585b(str, effect)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public final C2201v<List<C46030a>> mo92520a() {
        C2201v<List<C46030a>> e = this.f116006a.mo6542e();
        C52711k.m112236a((Object) e, "dataFilterSubject.hide()");
        return e;
    }

    public C45973b(C52668f<? extends C45909g> fVar) {
        C52711k.m112240b(fVar, "categoryProcessor");
        this.f116008c = fVar;
        C2178a<List<C46030a>> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<List<AbsStickerFilter>>()");
        this.f116006a = l;
    }

    /* renamed from: a */
    public final void mo92517a(C46030a aVar) {
        C52711k.m112240b(aVar, "filter");
        if (!this.f116007b.contains(aVar)) {
            this.f116007b.add(aVar);
            this.f116006a.onNext(this.f116007b);
        }
    }

    /* renamed from: b */
    public final void mo92519b(C46030a aVar) {
        C52711k.m112240b(aVar, "filter");
        this.f116007b.remove(aVar);
        this.f116006a.onNext(this.f116007b);
    }

    /* renamed from: a */
    public final void mo92518a(String str, List<Effect> list) {
        String str2;
        List list2;
        C52711k.m112240b(list, "target");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Collection collection = this.f116007b;
        C45905d dVar = (C45905d) ((C45909g) this.f116008c.getValue()).mo92505a().get(str);
        if (dVar != null) {
            list2 = dVar.mo92495c();
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = C52575l.m112097a();
        }
        C52575l.m112110a((List) list, (C52671b) new C45974a(this, str2, C52575l.m112133c(collection, list2)));
    }
}
