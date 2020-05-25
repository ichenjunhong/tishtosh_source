package com.p683ss.android.ugc.aweme.p1308ad.p1320f;

import com.bytedance.keva.Keva;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.ad.f.a */
public final class C22408a implements C22412b {

    /* renamed from: d */
    public static final C22408a f60347d = C22410b.f60356a;

    /* renamed from: e */
    public static final C22409a f60348e = new C22409a(null);

    /* renamed from: a */
    public final String f60349a = "preload_land_page_analytics";

    /* renamed from: b */
    public String f60350b = "";

    /* renamed from: c */
    public final Keva f60351c = Keva.getRepo(this.f60355i);

    /* renamed from: f */
    private final String f60352f = "orange";

    /* renamed from: g */
    private final String f60353g = "third";

    /* renamed from: h */
    private final String f60354h = "\"/** adInfo **/\"";

    /* renamed from: i */
    private final String f60355i = "commercial_preload_land_page_name";

    /* renamed from: com.ss.android.ugc.aweme.ad.f.a$a */
    public static final class C22409a {
        private C22409a() {
        }

        public /* synthetic */ C22409a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.f.a$b */
    static final class C22410b {

        /* renamed from: a */
        static final C22408a f60356a = new C22408a();

        /* renamed from: b */
        public static final C22410b f60357b = new C22410b();

        private C22410b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.f.a$c */
    static final class C22411c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C22408a f60358a;

        /* renamed from: b */
        final /* synthetic */ String f60359b;

        C22411c(C22408a aVar, String str) {
            this.f60358a = aVar;
            this.f60359b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r3 = this;
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.createIRetrofitFactorybyMonsterPlugin()
                com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r0
                if (r0 == 0) goto L_0x0031
                java.lang.String r1 = com.p683ss.android.p1140c.C18845b.f52040e
                com.bytedance.ies.ugc.aweme.network.e r0 = r0.createBuilder(r1)
                if (r0 == 0) goto L_0x0031
                com.bytedance.ies.ugc.aweme.network.f r0 = r0.mo19925a()
                java.lang.Class<com.ss.android.ugc.aweme.ad.network.CommonApi> r1 = com.p683ss.android.ugc.aweme.p1308ad.network.CommonApi.class
                java.lang.Object r0 = r0.mo19930a(r1)
                com.ss.android.ugc.aweme.ad.network.CommonApi r0 = (com.p683ss.android.ugc.aweme.p1308ad.network.CommonApi) r0
                if (r0 == 0) goto L_0x0031
                java.lang.String r1 = r3.f60359b
                com.bytedance.retrofit2.b r0 = r0.doGet(r1)
                if (r0 == 0) goto L_0x0031
                com.bytedance.retrofit2.u r0 = r0.execute()
                if (r0 == 0) goto L_0x0031
                T r0 = r0.f33552b
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0032
            L_0x0031:
                r0 = 0
            L_0x0032:
                boolean r1 = com.bytedance.p879t.p882c.C13248c.m26638a(r0)
                if (r1 != 0) goto L_0x0047
                com.ss.android.ugc.aweme.ad.f.a r1 = r3.f60358a
                r1.f60350b = r0
                com.ss.android.ugc.aweme.ad.f.a r1 = r3.f60358a
                com.bytedance.keva.Keva r1 = r1.f60351c
                com.ss.android.ugc.aweme.ad.f.a r2 = r3.f60358a
                java.lang.String r2 = r2.f60349a
                r1.storeString(r2, r0)
            L_0x0047:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22408a.C22411c.call():java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo46653a(Long l) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j > 0) {
            this.f60351c.erase(String.valueOf(l));
        }
    }

    /* renamed from: b */
    public final String mo46655b(Long l) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j <= 0) {
            return null;
        }
        return this.f60351c.getString(String.valueOf(l), "");
    }

    /* renamed from: a */
    public final int mo46651a(String str) {
        if (str != null && C52830p.m112456b((CharSequence) str, (CharSequence) this.f60352f, false, 2, (Object) null)) {
            return 1;
        }
        if (str == null || !C52830p.m112456b((CharSequence) str, (CharSequence) this.f60353g, false, 2, (Object) null)) {
            return 0;
        }
        return 2;
    }

    /* renamed from: c */
    public final void mo46657c(String str) {
        if (C13248c.m26638a(str)) {
            this.f60351c.storeString(this.f60349a, "");
        } else if (C13248c.m26638a(this.f60350b)) {
            C0013i.m16a((Callable<TResult>) new C22411c<TResult>(this, str));
        }
    }

    /* renamed from: d */
    public final String mo46658d(String str) {
        String str2;
        C52711k.m112240b(str, "adInfo");
        if (C13248c.m26638a(this.f60350b)) {
            str2 = this.f60351c.getString(this.f60349a, "");
        } else {
            str2 = this.f60350b;
            if (str2 == null) {
                C52711k.m112234a();
            }
        }
        if (C13248c.m26638a(str2)) {
            C52711k.m112236a((Object) str2, "localPreloadAnalyticsString");
            return str2;
        }
        C52711k.m112236a((Object) str2, "localPreloadAnalyticsString");
        return C52830p.m112400a(str2, this.f60354h, str, true);
    }

    /* renamed from: e */
    public final String mo46659e(String str) {
        C52711k.m112240b(str, "scene");
        int hashCode = str.hashCode();
        if (hashCode != -895866265) {
            if (hashCode != 3138974) {
                if (hashCode == 862628038 && str.equals("lynx_feed")) {
                    return "";
                }
            } else if (str.equals(C22858c.f61207c)) {
                return "a1a15b782e3ee8a25247561a91a99835";
            }
        } else if (str.equals("splash")) {
            return "cca47107bfcbdb211d88f3385aeede40";
        }
        return null;
    }

    /* renamed from: b */
    public final String mo46656b(String str) {
        if ((str != null && C52830p.m112456b((CharSequence) str, (CharSequence) "feed_orange_", false, 2, (Object) null)) || (str != null && C52830p.m112456b((CharSequence) str, (CharSequence) "feed_third_", false, 2, (Object) null))) {
            return C22858c.f61207c;
        }
        if ((str == null || !C52830p.m112456b((CharSequence) str, (CharSequence) "splash_orange_", false, 2, (Object) null)) && (str == null || !C52830p.m112456b((CharSequence) str, (CharSequence) "splash_third_", false, 2, (Object) null))) {
            return "";
        }
        return "splash";
    }

    /* renamed from: a */
    public final void mo46654a(Long l, String str) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j > 0 && !C13248c.m26638a(str)) {
            this.f60351c.storeString(String.valueOf(l), str);
        }
    }

    /* renamed from: a */
    public final String mo46652a(String str, Long l, Long l2, String str2) {
        C52711k.m112240b(str2, "scene");
        int hashCode = str2.hashCode();
        if (hashCode != -895866265) {
            if (hashCode == 3138974 && str2.equals(C22858c.f61207c)) {
                if (!C13248c.m26638a(str)) {
                    StringBuilder sb = new StringBuilder("feed_orange_");
                    sb.append(str);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder("feed_third_");
                sb2.append(l);
                return sb2.toString();
            }
        } else if (str2.equals("splash")) {
            if (!C13248c.m26638a(str)) {
                StringBuilder sb3 = new StringBuilder("splash_orange_");
                sb3.append(str);
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder("splash_third_");
            sb4.append(l2);
            return sb4.toString();
        }
        return "";
    }
}
