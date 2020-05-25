package com.p683ss.android.ugc.aweme.share.improve.p2164d;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.share.C41978ap;
import com.p683ss.android.ugc.aweme.share.improve.C42155d;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.share.improve.p2165e.C42167a;
import com.p683ss.android.ugc.aweme.share.p2154e.C42006a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42255a;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42257b;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42259c;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42261d;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42263e;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42267g;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42269h;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42273j;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42275k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42277l;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42279m;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42281n;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42283o;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42285p;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42287q;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42289r;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42291s;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42293t;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42295u;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42297v;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42299w;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42305z;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.share.improve.d.a */
public final class C42157a {

    /* renamed from: a */
    public static final C52668f f106624a = C52732g.m112285a(C42161b.f106629a);

    /* renamed from: b */
    public static final C42158a f106625b = new C42158a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a */
    public static final class C42158a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f106626a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42158a.class), "serverControlPlatform", "getServerControlPlatform()Ljava/util/List;"))};

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a$a */
        static final class C42159a extends C52712l implements C52671b<C42307b, Boolean> {

            /* renamed from: a */
            public static final C42159a f106627a = new C42159a();

            C42159a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean z;
                C42307b bVar = (C42307b) obj;
                C52711k.m112240b(bVar, "it");
                if (C42158a.m92526a().isEmpty() || C52711k.m112239a((Object) bVar.mo86136b(), (Object) "download")) {
                    z = true;
                } else {
                    z = C42158a.m92526a().contains(bVar.mo86136b());
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$a$b */
        public static final class C42160b implements C42309a {

            /* renamed from: a */
            final /* synthetic */ Activity f106628a;

            /* renamed from: a */
            public final Activity mo60818a() {
                return this.f106628a;
            }

            C42160b(Activity activity) {
                this.f106628a = activity;
            }
        }

        private C42158a() {
        }

        /* renamed from: a */
        public static List<String> m92526a() {
            return (List) C42157a.f106624a.getValue();
        }

        public /* synthetic */ C42158a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m92528a(C42350b bVar, boolean z, Activity activity) {
            C52711k.m112240b(bVar, "builder");
            C42309a bVar2 = new C42160b(activity);
            C42350b b = bVar.mo86258a((C42307b) new C42291s()).mo86258a((C42307b) new C42271i()).mo86258a((C42307b) new C42273j()).mo86258a((C42307b) new C42261d(bVar2)).mo86258a((C42307b) new C42263e()).mo86258a((C42307b) new C42281n(bVar2)).mo86258a((C42307b) new C42283o()).mo86258a((C42307b) new C42289r()).mo86258a((C42307b) new C42295u()).mo86258a((C42307b) new C42297v()).mo86258a((C42307b) new C42299w()).mo86258a((C42307b) new C42301x()).mo86258a((C42307b) new C42303y(new C42301x().mo86131a())).mo86258a((C42307b) new C42279m()).mo86258a((C42307b) new C42255a("www.tiktokv.com")).mo86258a((C42307b) new C42257b()).mo86258a((C42307b) new C42259c()).mo86258a((C42307b) new C42267g()).mo86258a((C42307b) new C42269h()).mo86258a((C42307b) new C42275k()).mo86258a((C42307b) new C42277l()).mo86258a((C42307b) new C42285p()).mo86258a((C42307b) new C42287q()).mo86258a((C42307b) new C42305z()).mo86270b(true).mo86257a((int) R.string.di8).mo86268b((int) R.string.wf).mo86265a(true).mo86264a((Comparator<C42357g>) new C42155d<C42357g>()).mo86269b((Comparator<C42307b>) new C42167a<C42307b>(2));
            C52671b<? super C42307b, Boolean> bVar3 = C42159a.f106627a;
            C52711k.m112240b(bVar3, "filter");
            b.f106967h = bVar3;
            if (z) {
                bVar.mo86263a("instagram").mo86263a("instagram_story").mo86263a("snapchat").mo86263a("whatsapp_status");
            }
            if (!C23794bh.m58394h().mo70344b()) {
                bVar.mo86263a("chat_merge");
            }
            if (!z) {
                bVar.mo86258a((C42307b) new C42134b());
            }
            String string = C42150c.m92517a().getString(R.string.bd4);
            C52711k.m112236a((Object) string, "chaosContext().getString…string.i18n_share_system)");
            bVar.mo86258a((C42307b) new C42293t(string));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.d.a$b */
    static final class C42161b extends C52712l implements C52670a<List<? extends String>> {

        /* renamed from: a */
        public static final C42161b f106629a = new C42161b();

        C42161b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C42006a a = C42006a.m91978a();
            C52711k.m112236a((Object) a, "I18nShareOrderUtil.getInstance()");
            List<C41978ap> list = a.f106326a;
            if (list == null) {
                return C52575l.m112097a();
            }
            Iterable<C41978ap> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C41978ap apVar : iterable) {
                C52711k.m112236a((Object) apVar, "it");
                arrayList.add(apVar.f106248a);
            }
            return (List) arrayList;
        }
    }
}
