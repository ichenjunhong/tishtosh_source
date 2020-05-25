package com.p683ss.android.ugc.aweme.crossplatform.prefetch;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.settings.DataPrefetchWhiteList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.e */
public final class C27274e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71950a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27274e.class), "whiteList", "getWhiteList()Ljava/util/List;"))};

    /* renamed from: c */
    public static final C52668f f71951c = C52732g.m112285a(C27276b.f71955a);

    /* renamed from: d */
    public static final C27275a f71952d = new C27275a(null);

    /* renamed from: b */
    public final C52668f f71953b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.e$a */
    public static final class C27275a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71954a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27275a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/prefetch/PrefetchEnabler;"))};

        private C27275a() {
        }

        public /* synthetic */ C27275a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.e$b */
    static final class C27276b extends C52712l implements C52670a<C27274e> {

        /* renamed from: a */
        public static final C27276b f71955a = new C27276b();

        C27276b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27274e(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.e$c */
    static final class C27277c extends C52712l implements C52670a<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C27274e f71956a;

        C27277c(C27274e eVar) {
            this.f71956a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String[] strArr = (String[]) C10193n.m20607a().mo18202a(DataPrefetchWhiteList.class, "aweme_data_prefetch_white_list", C10181b.m20511a().mo18175c().getAwemeDataPrefetchWhiteList(), "java.lang.String[]", String[].class);
            if (strArr != null) {
                List e = C52568f.m112084e(strArr);
                if (e != null) {
                    return e;
                }
            }
            return C52575l.m112097a();
        }
    }

    private C27274e() {
        this.f71953b = C52732g.m112285a(new C27277c(this));
    }

    public /* synthetic */ C27274e(C52707g gVar) {
        this();
    }
}
