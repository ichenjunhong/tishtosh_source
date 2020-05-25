package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d;

import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.a */
public final class C34463a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88895a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34463a.class), "imageModelList", "getImageModelList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34463a.class), "videoModelList", "getVideoModelList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34463a.class), "innerMixModelList", "getInnerMixModelList()Ljava/util/List;"))};

    /* renamed from: d */
    public static final C34464a f88896d = new C34464a(null);

    /* renamed from: b */
    public boolean f88897b;

    /* renamed from: c */
    public final String f88898c;

    /* renamed from: e */
    private final C52668f f88899e = C52732g.m112285a(C34465b.f88902a);

    /* renamed from: f */
    private final C52668f f88900f = C52732g.m112285a(C34468e.f88904a);

    /* renamed from: g */
    private final C52668f f88901g = C52732g.m112285a(C34466c.f88903a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.a$a */
    public static final class C34464a {
        private C34464a() {
        }

        /* renamed from: a */
        public static C34463a m78402a() {
            C34463a aVar = new C34463a("#album_key_all");
            aVar.f88897b = true;
            return aVar;
        }

        public /* synthetic */ C34464a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.a$b */
    static final class C34465b extends C52712l implements C52670a<List<C34409a>> {

        /* renamed from: a */
        public static final C34465b f88902a = new C34465b();

        C34465b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.a$c */
    static final class C34466c extends C52712l implements C52670a<List<C34409a>> {

        /* renamed from: a */
        public static final C34466c f88903a = new C34466c();

        C34466c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.a$d */
    public static final class C34467d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((C34409a) t2).getDateModify()), Long.valueOf(((C34409a) t).getDateModify()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.d.a$e */
    static final class C34468e extends C52712l implements C52670a<List<C34409a>> {

        /* renamed from: a */
        public static final C34468e f88904a = new C34468e();

        C34468e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: d */
    private final List<C34409a> m78398d() {
        return (List) this.f88901g.getValue();
    }

    /* renamed from: a */
    public final List<C34409a> mo72475a() {
        return (List) this.f88899e.getValue();
    }

    /* renamed from: b */
    public final List<C34409a> mo72476b() {
        return (List) this.f88900f.getValue();
    }

    /* renamed from: c */
    public final List<C34409a> mo72477c() {
        if (m78398d().isEmpty()) {
            m78398d().addAll(mo72475a());
            m78398d().addAll(mo72476b());
            List d = m78398d();
            if (d.size() > 1) {
                C52575l.m112105a(d, new C34467d());
            }
        }
        return m78398d();
    }

    public C34463a(String str) {
        C52711k.m112240b(str, "albumKey");
        this.f88898c = str;
    }
}
