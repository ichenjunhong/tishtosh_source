package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2294e;

import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45913k;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45917o;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45919q;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.C45936b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46021b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2180b;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.e.c */
public final class C45975c implements C45917o {

    /* renamed from: a */
    public C45936b f116012a;

    /* renamed from: b */
    private final C2180b<C46021b> f116013b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.e.c$a */
    public static final class C45976a implements C48703h {

        /* renamed from: a */
        final /* synthetic */ int f116014a;

        /* renamed from: b */
        final /* synthetic */ C45936b f116015b;

        /* renamed from: c */
        final /* synthetic */ List f116016c;

        /* renamed from: d */
        final /* synthetic */ C45975c f116017d;

        /* renamed from: e */
        final /* synthetic */ C46021b f116018e;

        /* renamed from: a */
        public final void mo89462a(C48649d dVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            boolean z;
            boolean z2;
            EffectListResponse effectListResponse = (EffectListResponse) obj;
            if (effectListResponse != null) {
                List collection = effectListResponse.getCollection();
                if (collection != null) {
                    Collection collection2 = collection;
                    if (collection2 == null || collection2.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(!z2)) {
                        collection = null;
                    }
                    if (collection != null) {
                        C45936b bVar = this.f116017d.f116012a;
                        if (bVar != null) {
                            C45919q i = bVar.mo92537i();
                            if (i != null) {
                                i.mo92540a(collection);
                            }
                        }
                    }
                }
            }
            if (effectListResponse != null) {
                List data = effectListResponse.getData();
                if (data != null) {
                    Collection collection3 = data;
                    if (collection3 == null || collection3.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(true ^ z)) {
                        data = null;
                    }
                    if (data != null) {
                        List list = this.f116016c;
                        int i2 = this.f116014a;
                        Object obj2 = data.get(0);
                        C52711k.m112236a(obj2, "it[0]");
                        list.set(i2, obj2);
                    }
                }
            }
        }

        C45976a(int i, C45936b bVar, List list, C45975c cVar, C46021b bVar2) {
            this.f116014a = i;
            this.f116015b = bVar;
            this.f116016c = list;
            this.f116017d = cVar;
            this.f116018e = bVar2;
        }
    }

    public C45975c() {
        C2180b<C46021b> l = C2180b.m6534l();
        C52711k.m112236a((Object) l, "PublishSubject.create<PinStickerRequest>()");
        this.f116013b = l;
    }

    /* renamed from: a */
    public final C2201v<C46021b> mo92522a() {
        C2201v<C46021b> e = this.f116013b.mo6542e();
        C52711k.m112236a((Object) e, "pinRequestSubject.hide()");
        return e;
    }

    /* renamed from: a */
    public final void mo92523a(C45936b bVar) {
        C52711k.m112240b(bVar, "repository");
        this.f116012a = bVar;
    }

    /* renamed from: a */
    public final void mo92521a(C46021b bVar) {
        boolean z;
        boolean z2;
        String str;
        C46021b bVar2 = bVar;
        C52711k.m112240b(bVar2, "request");
        C45936b bVar3 = this.f116012a;
        if (bVar3 != null) {
            Iterable iterable = bVar2.f116145a;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                Effect effect = (Effect) next;
                CharSequence parentId = effect.getParentId();
                if (parentId == null || parentId.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = effect.getId();
                } else {
                    str = effect.getParentId();
                }
                if (hashSet.add(str)) {
                    arrayList.add(next);
                }
            }
            List e = C52575l.m112139e((Collection<? extends T>) arrayList);
            int i = bVar2.f116146b;
            int i2 = bVar2.f116147c;
            Map<String, String> map = bVar2.f116148d;
            C52711k.m112240b(e, "effects");
            C46021b bVar4 = new C46021b(e, i, i2, map);
            int i3 = 0;
            for (Object next2 : e) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C52575l.m112100b();
                }
                Effect effect2 = (Effect) next2;
                CharSequence parentId2 = effect2.getParentId();
                if (parentId2 == null || parentId2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C45913k c = bVar3.mo92531c();
                    String parentId3 = effect2.getParentId();
                    if (parentId3 == null) {
                        C52711k.m112234a();
                    }
                    List a = C52575l.m112092a(parentId3);
                    Map<String, String> map2 = bVar2.f116148d;
                    List list = a;
                    C45976a aVar = new C45976a(i3, bVar3, e, this, bVar);
                    c.mo92515a(list, map2, aVar);
                }
                i3 = i4;
            }
            this.f116013b.onNext(bVar4);
            return;
        }
        this.f116013b.onNext(bVar2);
    }
}
