package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository;

import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.e */
public final class C45511e implements C45509c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114975a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45511e.class), "mRecentProvider", "getMRecentProvider()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/IRecentVideoCategoryProvider;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45511e.class), "mLongVideoProvider", "getMLongVideoProvider()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/ILongVideoCategoryProvider;"))};

    /* renamed from: b */
    private final C52668f f114976b = C52732g.m112306a(new C45512f(0, 1, null));

    /* renamed from: c */
    private final C52668f f114977c = C52732g.m112306a(new C45510d());

    /* renamed from: b */
    private final C45508b m99154b() {
        return (C45508b) this.f114976b.getValue();
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo91769a() {
        return ((C45495a) this.f114977c.getValue()).mo91769a();
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo91781a(int i) {
        return m99154b().mo91781a(i);
    }

    /* renamed from: a */
    public final void mo91782a(VideoCategoryParam videoCategoryParam) {
        C52711k.m112240b(videoCategoryParam, "latestCategory");
        m99154b().mo91782a(videoCategoryParam);
    }
}
