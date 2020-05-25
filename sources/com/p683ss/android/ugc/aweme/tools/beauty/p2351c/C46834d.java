package com.p683ss.android.ugc.aweme.tools.beauty.p2351c;

import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;
import com.p683ss.android.ugc.aweme.tools.beauty.C46821b;
import com.p683ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.Comparator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.d */
public final class C46834d {

    /* renamed from: c */
    public static final Keva f118315c;

    /* renamed from: d */
    public static final C46835a f118316d = new C46835a(null);

    /* renamed from: a */
    public C46869h<C46821b> f118317a = new C46869h<>();

    /* renamed from: b */
    public C46814a f118318b = C46814a.FEMALE;

    /* renamed from: e */
    private final BeautyFilterConfig f118319e;

    /* renamed from: f */
    private final C17971f f118320f;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.d$a */
    public static final class C46835a {
        private C46835a() {
        }

        public /* synthetic */ C46835a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.d$b */
    public static final class C46836b extends C17956a<List<C46821b>> {
        C46836b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.d$c */
    static final class C46837c<T> implements Comparator<ComposerBeauty> {

        /* renamed from: a */
        final /* synthetic */ C46834d f118321a;

        C46837c(C46834d dVar) {
            this.f118321a = dVar;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            ComposerBeauty composerBeauty2 = (ComposerBeauty) obj2;
            C46869h<C46821b> hVar = this.f118321a.f118317a;
            String effectId = composerBeauty.getEffect().getEffectId();
            C52711k.m112236a((Object) effectId, "o1.effect.effectId");
            int indexOf = hVar.indexOf(new C46821b(effectId, 0, 2, null));
            C46869h<C46821b> hVar2 = this.f118321a.f118317a;
            String effectId2 = composerBeauty2.getEffect().getEffectId();
            C52711k.m112236a((Object) effectId2, "o2.effect.effectId");
            return indexOf - hVar2.indexOf(new C46821b(effectId2, 0, 2, null));
        }
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        f118315c = repo;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo94078a() {
        f118315c.storeString(m101690c(), this.f118320f.mo34889b(this.f118317a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final List<C46821b> mo94080b() {
        try {
            return (List) this.f118320f.mo34885a(f118315c.getString(m101690c(), null), new C46836b().f49843c);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private final String m101690c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118319e.getSequenceKey());
        sb.append(this.f118318b.getFlag());
        sb.append("_key_beauty_sequence");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo94079a(C46814a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f118318b = aVar;
    }

    public C46834d(BeautyFilterConfig beautyFilterConfig, C17971f fVar) {
        C52711k.m112240b(beautyFilterConfig, "beautyFilterConfig");
        C52711k.m112240b(fVar, "gson");
        this.f118319e = beautyFilterConfig;
        this.f118320f = fVar;
    }
}
