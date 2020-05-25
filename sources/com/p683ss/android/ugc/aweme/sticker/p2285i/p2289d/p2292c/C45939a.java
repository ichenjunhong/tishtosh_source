package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2292c;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p727b.C11562b;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p733f.C11597d;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.bytedance.jedi.p725a.p740j.C11699c.C11700a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45903b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45908f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2287b.C45926b;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.C45929a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.a */
public final class C45939a extends C11698b implements C45908f, C45929a {

    /* renamed from: a */
    public final C45926b<FetchFavoriteListResponse> f115933a = new C45926b<>();

    /* renamed from: b */
    public final C0198r<C37721a<FetchFavoriteListResponse>> f115934b = new C0198r<>();

    /* renamed from: c */
    private final C0198r<C45903b> f115935c = new C0198r<>();

    /* renamed from: d */
    private final C0198r<Boolean> f115936d = new C0198r<>();

    /* renamed from: e */
    private final C11587b<C52860x, C45951d, C45951d, List<String>> f115937e;

    /* renamed from: f */
    private final C11597d<C52860x, FetchFavoriteListResponse> f115938f;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.a$a */
    static final class C45940a<T> implements C1710e<C1690c> {

        /* renamed from: a */
        final /* synthetic */ C45939a f115939a;

        /* renamed from: b */
        final /* synthetic */ Effect f115940b;

        /* renamed from: c */
        final /* synthetic */ boolean f115941c;

        C45940a(C45939a aVar, Effect effect, boolean z) {
            this.f115939a = aVar;
            this.f115940b = effect;
            this.f115941c = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            C1690c cVar = (C1690c) obj;
            this.f115939a.mo92556b(this.f115940b, !this.f115941c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.a$b */
    static final class C45941b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C45939a f115942a;

        /* renamed from: b */
        final /* synthetic */ Effect f115943b;

        /* renamed from: c */
        final /* synthetic */ boolean f115944c;

        C45941b(C45939a aVar, Effect effect, boolean z) {
            this.f115942a = aVar;
            this.f115943b = effect;
            this.f115944c = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f115942a.mo92556b(this.f115943b, this.f115944c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.a$c */
    static final class C45942c<T> implements C1710e<FetchFavoriteListResponse> {

        /* renamed from: a */
        final /* synthetic */ C45939a f115945a;

        C45942c(C45939a aVar) {
            this.f115945a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) obj;
            this.f115945a.f115933a.mo22280a(C52860x.f131107a, fetchFavoriteListResponse);
            this.f115945a.f115934b.setValue(C37721a.m84218a(C37722a.SUCCESS, fetchFavoriteListResponse));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.a$d */
    static final class C45943d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C45939a f115946a;

        C45943d(C45939a aVar) {
            this.f115946a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f115946a.f115934b.setValue(C37721a.m84220a(C37722a.ERROR, (Throwable) obj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.a$e */
    static final class C45944e extends C52712l implements C52682m<C2201v<FetchFavoriteListResponse>, C2201v<FetchFavoriteListResponse>, C2201v<FetchFavoriteListResponse>> {

        /* renamed from: a */
        public static final C45944e f115947a = new C45944e();

        C45944e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C2201v vVar = (C2201v) obj;
            C2201v vVar2 = (C2201v) obj2;
            C52711k.m112240b(vVar, "fetcher");
            C52711k.m112240b(vVar2, "cache");
            C2201v c = vVar2.mo6537c((C2206z<? extends T>) vVar);
            C52711k.m112236a((Object) c, "cache.switchIfEmpty(fetcher)");
            return c;
        }
    }

    /* renamed from: a */
    public final C45908f mo92500a() {
        return this;
    }

    /* renamed from: d */
    public final void mo92550d() {
        aZ_();
    }

    /* renamed from: b */
    public final LiveData<C37721a<FetchFavoriteListResponse>> mo92503b() {
        return this.f115934b;
    }

    /* renamed from: c */
    public final LiveData<Boolean> mo92504c() {
        return this.f115936d;
    }

    /* renamed from: b */
    public final void mo92502b(boolean z) {
        this.f115936d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final C1680ad<FetchFavoriteListResponse> mo92499a(boolean z) {
        C11587b bVar;
        if (z) {
            bVar = this.f115938f;
        } else {
            bVar = C11562b.m23668a(this.f115938f, this.f115933a, C11563a.f30948a).mo22307a(C45944e.f115947a);
        }
        C1680ad<FetchFavoriteListResponse> c = C1680ad.m5960a((C2206z<? extends T>) bVar.mo22318c(C52860x.f131107a)).mo6156b((C1710e<? super T>) new C45942c<Object>(this)).mo6160c(new C45943d(this));
        C52711k.m112236a((Object) c, "Single.fromObservable(fe…OR, it)\n                }");
        return c;
    }

    /* renamed from: a */
    public final boolean mo92501a(String str) {
        boolean z = false;
        if (str != null) {
            FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) this.f115933a.mo92548c(C52860x.f131107a);
            Object obj = null;
            if (fetchFavoriteListResponse != null) {
                List effects = fetchFavoriteListResponse.getEffects();
                if (effects != null) {
                    Iterator it = effects.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        Effect effect = (Effect) next;
                        C52711k.m112236a((Object) effect, "it");
                        if (C52711k.m112239a((Object) effect.getEffectId(), (Object) str)) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (Effect) obj;
                }
            }
            if (obj == null) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final C1680ad<List<String>> mo92498a(Effect effect, boolean z) {
        C52711k.m112240b(effect, "favorite");
        C1680ad<List<String>> c = C1680ad.m5960a((C2206z<? extends T>) this.f115937e.mo22318c(new C45951d(effect, !z))).mo6150a((C1710e<? super C1690c>) new C45940a<Object>(this, effect, z)).mo6160c(new C45941b(this, effect, z));
        C52711k.m112236a((Object) c, "Single.fromObservable(fa…vorite)\n                }");
        return c;
    }

    public C45939a(C11587b<C52860x, C45951d, C45951d, List<String>> bVar, C11597d<C52860x, FetchFavoriteListResponse> dVar) {
        C52711k.m112240b(bVar, "favoriteModifyFetcher");
        C52711k.m112240b(dVar, "favoriteListFetcher");
        this.f115937e = bVar;
        this.f115938f = dVar;
        C11587b bVar2 = this.f115938f;
        C11536c cVar = this.f115933a;
        C52671b bVar3 = C11700a.INSTANCE;
        C52711k.m112240b(bVar2, "$this$keySyncTo");
        C52711k.m112240b(cVar, "to");
        C52711k.m112240b(bVar3, "block");
        C11574e a = C11571b.m23675a(bVar2);
        C11574e a2 = C11571b.m23673a(cVar);
        C11689c cVar2 = new C11689c(null, null, 3, null);
        bVar3.invoke(cVar2);
        mo22478a(a, a2, (C11682a<K, V, K1, V1>) cVar2);
    }

    /* renamed from: b */
    public final void mo92556b(Effect effect, boolean z) {
        this.f115935c.setValue(new C45903b(z, effect));
        FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) this.f115933a.mo92548c(C52860x.f131107a);
        if (fetchFavoriteListResponse != null) {
            List effects = fetchFavoriteListResponse.getEffects();
            if (effects == null) {
                effects = new ArrayList();
            }
            if (z) {
                effects.add(0, effect);
            } else {
                effects.remove(effect);
            }
            fetchFavoriteListResponse.setEffects(effects);
            this.f115933a.mo22280a(C52860x.f131107a, fetchFavoriteListResponse);
            this.f115934b.setValue(C37721a.m84218a(C37722a.SUCCESS, fetchFavoriteListResponse));
        }
    }
}
