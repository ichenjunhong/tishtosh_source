package com.p683ss.android.ugc.aweme.opensdk;

import android.content.Context;
import com.p683ss.android.ugc.aweme.opensdk.share.C38520b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52723a;

/* renamed from: com.ss.android.ugc.aweme.opensdk.d */
public final class C38505d {

    /* renamed from: c */
    public static final C38506a f97976c = new C38506a(null);

    /* renamed from: a */
    public final C38513g f97977a;

    /* renamed from: b */
    final Context f97978b;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.d$a */
    public static final class C38506a {
        private C38506a() {
        }

        public /* synthetic */ C38506a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.d$b */
    static final class C38507b extends C52712l implements C52682m<String, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38520b f97979a;

        C38507b(C38520b bVar) {
            this.f97979a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            C52711k.m112240b(str, "checkType");
            this.f97979a.mo78405a(true);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.d$c */
    static final class C38508c extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38520b f97980a;

        C38508c(C38520b bVar) {
            this.f97980a = bVar;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            int intValue = ((Number) obj3).intValue();
            String str2 = (String) obj4;
            C52711k.m112240b(str, "checkType");
            C52711k.m112240b(str2, "errorMsg");
            this.f97980a.mo78404a(intValue, "");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.d$d */
    static final class C38509d extends C52712l implements C52682m<String, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38505d f97981a;

        /* renamed from: b */
        final /* synthetic */ C38520b f97982b;

        /* renamed from: c */
        final /* synthetic */ int f97983c;

        C38509d(C38505d dVar, C38520b bVar, int i) {
            this.f97981a = dVar;
            this.f97982b = bVar;
            this.f97983c = i;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            C52711k.m112240b(str, "checkType");
            C38520b bVar = this.f97982b;
            boolean z = true;
            if (this.f97983c != this.f97981a.f97977a.f97993b.size() - 1) {
                z = false;
            }
            bVar.mo78405a(z);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.d$e */
    static final class C38510e extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52723a f97984a;

        /* renamed from: b */
        final /* synthetic */ C38520b f97985b;

        C38510e(C52723a aVar, C38520b bVar) {
            this.f97984a = aVar;
            this.f97985b = bVar;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            int intValue = ((Number) obj3).intValue();
            String str2 = (String) obj4;
            C52711k.m112240b(str, "checkType");
            C52711k.m112240b(str2, "errorMsg");
            this.f97984a.element = true;
            this.f97985b.mo78404a(intValue, "");
            return C52860x.f131107a;
        }
    }

    public C38505d(C38513g gVar, Context context) {
        C52711k.m112240b(gVar, "shareContext");
        C52711k.m112240b(context, "activityContext");
        this.f97977a = gVar;
        this.f97978b = context;
    }
}
