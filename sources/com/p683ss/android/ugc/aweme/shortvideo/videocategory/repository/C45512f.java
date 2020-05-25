package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2258a.C45499b;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2258a.C45500c;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.f */
public final class C45512f implements C45508b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114978a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45512f.class), "mRecentRepo", "getMRecentRepo()Lcom/bytedance/keva/Keva;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45512f.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/cache/lru/ILruCache;"))};

    /* renamed from: b */
    public static final C45513a f114979b = new C45513a(null);

    /* renamed from: c */
    private final C52668f f114980c;

    /* renamed from: d */
    private final C52668f f114981d;

    /* renamed from: e */
    private final int f114982e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.f$a */
    public static final class C45513a {
        private C45513a() {
        }

        public /* synthetic */ C45513a(C52707g gVar) {
            this();
        }
    }

    public C45512f() {
        this(0, 1, null);
    }

    /* renamed from: a */
    private final Keva m99158a() {
        return (Keva) this.f114980c.getValue();
    }

    /* renamed from: b */
    private final C45499b<VideoCategoryParam> m99159b() {
        return (C45499b) this.f114981d.getValue();
    }

    /* renamed from: a */
    public final void mo91782a(VideoCategoryParam videoCategoryParam) {
        C52711k.m112240b(videoCategoryParam, "latestCategory");
        m99159b().mo91773a(videoCategoryParam);
    }

    private C45512f(int i) {
        this.f114982e = i;
        this.f114980c = C52732g.m112306a(Keva.getRepoFromSp(C11010c.m22280a(), "RecentUsedVideoCategory", 0));
        this.f114981d = C52732g.m112306a(new C45500c("RecentUsedVideoCategory", this.f114982e, VideoCategoryParam.class));
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo91781a(int i) {
        if (!(!C52711k.m112239a((Object) C39629l.m88232a().mo58593x().mo74283c(), (Object) m99158a().getString("key_stored_userid", "")))) {
            return m99159b().mo91777c();
        }
        m99159b().mo91778d();
        m99158a().storeString("key_stored_userid", C39629l.m88232a().mo58593x().mo74283c());
        return C52575l.m112097a();
    }

    public /* synthetic */ C45512f(int i, int i2, C52707g gVar) {
        this(3);
    }
}
