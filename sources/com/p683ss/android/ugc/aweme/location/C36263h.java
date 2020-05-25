package com.p683ss.android.ugc.aweme.location;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.location.h */
public final class C36263h implements C36258c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f92830a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C36263h.class), "mCacheDuration", "getMCacheDuration()J"))};

    /* renamed from: b */
    private final C52668f f92831b = C52732g.m112285a(C36264a.f92832a);

    /* renamed from: com.ss.android.ugc.aweme.location.h$a */
    static final class C36264a extends C52712l implements C52670a<Long> {

        /* renamed from: a */
        public static final C36264a f92832a = new C36264a();

        C36264a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(m81878a());
        }

        /* renamed from: a */
        private static long m81878a() {
            try {
                if (!PoiServiceImpl.createIPoiServicebyMonsterPlugin().useLongCacheStrategy()) {
                    return 10;
                }
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                PoiSetting poiSetting = b.getPoiSetting();
                C52711k.m112236a((Object) poiSetting, "poiSetting");
                if (C52711k.m112230a(poiSetting.getPoiLocationCacheDuration().intValue(), 0) > 0) {
                    return (long) poiSetting.getPoiLocationCacheDuration().intValue();
                }
                return 10;
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return 10;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.location.C36282r mo75077a() {
        /*
            r9 = this;
            java.lang.String r0 = "LOCATION_REPO"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r1 = "LOCATION_CACHE"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.utils.GsonProvider r1 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()     // Catch:{ Exception -> 0x005c }
            com.google.gson.f r1 = r1.getGson()     // Catch:{ Exception -> 0x005c }
            java.lang.Class<com.ss.android.ugc.aweme.location.r> r3 = com.p683ss.android.ugc.aweme.location.C36282r.class
            java.lang.Object r0 = r1.mo34884a(r0, r3)     // Catch:{ Exception -> 0x005c }
            com.ss.android.ugc.aweme.location.r r0 = (com.p683ss.android.ugc.aweme.location.C36282r) r0     // Catch:{ Exception -> 0x005c }
            if (r0 == 0) goto L_0x0062
            long r3 = r0.getTime()     // Catch:{ Exception -> 0x005c }
            d.f r1 = r9.f92831b     // Catch:{ Exception -> 0x005c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x005c }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ Exception -> 0x005c }
            long r5 = r1.longValue()     // Catch:{ Exception -> 0x005c }
            r7 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 * r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0054
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x005c }
            java.lang.String r7 = "cal"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r7)     // Catch:{ Exception -> 0x005c }
            long r7 = r1.getTimeInMillis()     // Catch:{ Exception -> 0x005c }
            r1 = 0
            long r7 = r7 - r3
            r3 = 5000(0x1388, double:2.4703E-320)
            long r5 = r5 + r3
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r0 = r2
        L_0x0059:
            if (r0 == 0) goto L_0x0062
            return r0
        L_0x005c:
            r0 = move-exception
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r0)
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.location.C36263h.mo75077a():com.ss.android.ugc.aweme.location.r");
    }

    /* renamed from: a */
    public final void mo75078a(C36282r rVar) {
        if (rVar != null) {
            try {
                Keva.getRepo("LOCATION_REPO").storeString("LOCATION_CACHE", C47759cc.m103382a().getGson().mo34889b(rVar));
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }
}
