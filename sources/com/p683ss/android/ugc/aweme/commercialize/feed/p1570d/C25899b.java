package com.p683ss.android.ugc.aweme.commercialize.feed.p1570d;

import android.util.Pair;
import com.bytedance.geckox.C10026a;
import com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.p681c.C10879a;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25884ap.C25885a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.web.C48277g;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.b */
public final class C25899b implements C25898a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68429a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25899b.class), "commonChannel", "getCommonChannel()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25899b.class), "cardCommonChannel", "getCardCommonChannel()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C25899b f68430b = new C25899b();

    /* renamed from: c */
    private static final C52668f f68431c = C52732g.m112285a(C25902c.f68436a);

    /* renamed from: d */
    private static final C52668f f68432d = C52732g.m112285a(C25900a.f68435a);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final ConcurrentHashMap<String, C25907e> f68433e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final HashMap<String, C25905c> f68434f = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.b$a */
    static final class C25900a extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        public static final C25900a f68435a = new C25900a();

        C25900a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m62852a();
        }

        /* renamed from: a */
        private static List<String> m62852a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                AdLandingPageConfig adLandingPageConfig = b.getAdLandingPageConfig();
                C52711k.m112236a((Object) adLandingPageConfig, "SettingsReader.get().adLandingPageConfig");
                List<String> adCardPreloadCommonChannel = adLandingPageConfig.getAdCardPreloadCommonChannel();
                if (adCardPreloadCommonChannel == null) {
                    return new ArrayList<>();
                }
                return adCardPreloadCommonChannel;
            } catch (C10174a unused) {
                return new ArrayList<>();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.b$b */
    public static final class C25901b implements C10879a {
        C25901b() {
        }

        /* renamed from: a */
        public final void mo19645a() {
        }

        /* renamed from: a */
        public final void mo19646a(String str, Exception exc) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.b$c */
    static final class C25902c extends C52712l implements C52670a<List<String>> {

        /* renamed from: a */
        public static final C25902c f68436a = new C25902c();

        C25902c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m62855a();
        }

        /* renamed from: a */
        private static List<String> m62855a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                AdLandingPageConfig adLandingPageConfig = b.getAdLandingPageConfig();
                C52711k.m112236a((Object) adLandingPageConfig, "SettingsReader.get().adLandingPageConfig");
                List<String> adLandingPagePreloadCommonChannel = adLandingPageConfig.getAdLandingPagePreloadCommonChannel();
                if (adLandingPagePreloadCommonChannel == null) {
                    return new ArrayList<>();
                }
                return adLandingPagePreloadCommonChannel;
            } catch (C10174a unused) {
                return new ArrayList<>();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.b$d */
    static final class C25903d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f68437a;

        C25903d(List list) {
            this.f68437a = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0006 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r12 = this;
                java.util.List r0 = r12.f68437a
                java.util.Iterator r0 = r0.iterator()
            L_0x0006:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00d5
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
                if (r1 == 0) goto L_0x0006
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
                if (r1 == 0) goto L_0x0006
                java.lang.String r2 = "rawAd"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                int r2 = r1.getPreloadWeb()
                r3 = 4
                r4 = 0
                if (r2 != r3) goto L_0x0091
                com.ss.android.ugc.aweme.ad.services.IAdService r2 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r2 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r2
                if (r2 == 0) goto L_0x0050
                com.ss.android.ugc.aweme.ad.f.b r5 = r2.getAdLandPagePreloadService()
                if (r5 == 0) goto L_0x0050
                com.ss.android.ugc.aweme.commercialize.feed.d.d r2 = r1.getPreloadData()
                if (r2 == 0) goto L_0x0041
                java.lang.String r2 = r2.getSiteId()
                r6 = r2
                goto L_0x0042
            L_0x0041:
                r6 = r4
            L_0x0042:
                java.lang.Long r7 = r1.getAdId()
                r8 = 0
                java.lang.String r9 = "feed"
                r10 = 4
                r11 = 0
                java.lang.String r2 = com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b.C22413a.m55437a(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0051
            L_0x0050:
                r2 = r4
            L_0x0051:
                com.ss.android.ugc.aweme.commercialize.feed.d.b r3 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68430b
                com.ss.android.ugc.aweme.ad.services.IAdService r5 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r5 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r5
                if (r5 == 0) goto L_0x0067
                com.ss.android.ugc.aweme.ad.f.b r5 = r5.getAdLandPagePreloadService()
                if (r5 == 0) goto L_0x0067
                java.lang.String r4 = "feed"
                java.lang.String r4 = r5.mo46659e(r4)
            L_0x0067:
                java.lang.String r5 = "feed"
                r3.mo53228a(r2, r4, r5)
                if (r2 == 0) goto L_0x0006
                com.ss.android.ugc.aweme.commercialize.feed.d.b r3 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68430b
                java.util.concurrent.ConcurrentHashMap r3 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68433e
                java.util.Map r3 = (java.util.Map) r3
                com.ss.android.ugc.aweme.commercialize.feed.d.e r4 = new com.ss.android.ugc.aweme.commercialize.feed.d.e
                java.lang.Long r5 = r1.getCreativeId()
                java.lang.String r6 = "rawAd.creativeId"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
                long r5 = r5.longValue()
                java.lang.String r1 = r1.getLogExtra()
                r4.<init>(r5, r1)
                r3.put(r2, r4)
                goto L_0x0006
            L_0x0091:
                int r2 = r1.getPreloadWeb()
                r3 = 9
                if (r2 != r3) goto L_0x0006
                com.ss.android.ugc.aweme.commercialize.model.w r1 = r1.getNativeSiteConfig()
                if (r1 == 0) goto L_0x0006
                java.util.List r1 = r1.getGeckoChannel()
                if (r1 == 0) goto L_0x0006
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x00ab:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0006
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                com.ss.android.ugc.aweme.commercialize.feed.d.b r3 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68430b
                com.ss.android.ugc.aweme.ad.services.IAdService r5 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r5 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r5
                if (r5 == 0) goto L_0x00ce
                com.ss.android.ugc.aweme.ad.f.b r5 = r5.getAdLandPagePreloadService()
                if (r5 == 0) goto L_0x00ce
                java.lang.String r6 = "lynx_feed"
                java.lang.String r5 = r5.mo46659e(r6)
                goto L_0x00cf
            L_0x00ce:
                r5 = r4
            L_0x00cf:
                java.lang.String r6 = "lynx_feed"
                r3.mo53228a(r2, r5, r6)
                goto L_0x00ab
            L_0x00d5:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.C25903d.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.d.b$e */
    public static final class C25904e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f68438a;

        public C25904e(List list) {
            this.f68438a = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0008 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r11 = this;
                java.util.List r0 = r11.f68438a
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0008:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00ac
                java.lang.Object r1 = r0.next()
                com.ss.android.ad.splash.c.a r1 = (com.p683ss.android.p1103ad.splash.p1111c.C18559a) r1
                int r2 = r1.mo37858I()
                r3 = 4
                if (r2 != r3) goto L_0x0091
                com.ss.android.ugc.aweme.ad.services.IAdService r2 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r2 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r2
                r3 = 0
                if (r2 == 0) goto L_0x0040
                com.ss.android.ugc.aweme.ad.f.b r4 = r2.getAdLandPagePreloadService()
                if (r4 == 0) goto L_0x0040
                java.lang.String r5 = r1.mo37861M()
                r6 = 0
                long r7 = r1.mo37863p()
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                java.lang.String r8 = "splash"
                r9 = 2
                r10 = 0
                java.lang.String r2 = com.p683ss.android.ugc.aweme.p1308ad.p1320f.C22412b.C22413a.m55437a(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x0041
            L_0x0040:
                r2 = r3
            L_0x0041:
                com.ss.android.ugc.aweme.commercialize.feed.d.b r4 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68430b
                com.ss.android.ugc.aweme.ad.services.IAdService r5 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r5 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r5
                if (r5 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.ad.f.b r5 = r5.getAdLandPagePreloadService()
                if (r5 == 0) goto L_0x0057
                java.lang.String r3 = "splash"
                java.lang.String r3 = r5.mo46659e(r3)
            L_0x0057:
                java.lang.String r5 = "splash"
                r4.mo53228a(r2, r3, r5)
                if (r2 == 0) goto L_0x0076
                com.ss.android.ugc.aweme.commercialize.feed.d.b r3 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68430b
                java.util.concurrent.ConcurrentHashMap r3 = com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.f68433e
                java.util.Map r3 = (java.util.Map) r3
                com.ss.android.ugc.aweme.commercialize.feed.d.e r4 = new com.ss.android.ugc.aweme.commercialize.feed.d.e
                long r5 = r1.mo37863p()
                java.lang.String r7 = r1.mo37864r()
                r4.<init>(r5, r7)
                r3.put(r2, r4)
            L_0x0076:
                com.ss.android.ugc.aweme.ad.services.IAdService r3 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r3 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r3
                if (r3 == 0) goto L_0x0008
                com.ss.android.ugc.aweme.ad.f.b r3 = r3.getAdLandPagePreloadService()
                if (r3 == 0) goto L_0x0008
                long r4 = r1.mo37863p()
                java.lang.Long r1 = java.lang.Long.valueOf(r4)
                r3.mo46654a(r1, r2)
                goto L_0x0008
            L_0x0091:
                com.ss.android.ugc.aweme.ad.services.IAdService r2 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.ad.services.IAdService r2 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r2
                if (r2 == 0) goto L_0x0008
                com.ss.android.ugc.aweme.ad.f.b r2 = r2.getAdLandPagePreloadService()
                if (r2 == 0) goto L_0x0008
                long r3 = r1.mo37863p()
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r2.mo46653a(r1)
                goto L_0x0008
            L_0x00ac:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.C25904e.call():java.lang.Object");
        }
    }

    private C25899b() {
    }

    /* renamed from: a */
    private static int m62834a(long j, boolean z) {
        if (z) {
            return 1;
        }
        return j == 0 ? 0 : 2;
    }

    /* renamed from: a */
    private final List<String> m62835a() {
        return (List) f68431c.getValue();
    }

    /* renamed from: b */
    private final List<String> m62837b() {
        return (List) f68432d.getValue();
    }

    /* renamed from: a */
    public final void mo53228a(String str, String str2, String str3) {
        if (!C47731bq.m103352f()) {
            C10885e d = m62839d(str3);
            if (d != null) {
                d.mo19663a(str, 5000, (C10879a) new C25901b());
            }
        } else if (!C47731bq.m103354g()) {
            C10026a d2 = C47731bq.m103344d(str2);
            if (d2 != null) {
                d2.mo18003a(C52575l.m112092a(str), (C10105a) new C48277g());
            }
        } else {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            TargetChannel targetChannel = new TargetChannel();
            targetChannel.channelName = str;
            arrayList.add(targetChannel);
            if (str2 != null) {
                Map map = hashMap;
                map.put(str2, arrayList);
                C10026a c = C47731bq.m103340c(str2);
                if (c != null) {
                    c.mo18004a(map, (C10105a) new C48277g());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53225a(List<? extends Pair<String, Long>> list, boolean z) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            for (Pair pair : list) {
                if (m62835a().contains(pair.first)) {
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("channel_name", "common");
                    Object obj = pair.second;
                    C52711k.m112236a(obj, "pair.second");
                    map.put("response_status", Integer.valueOf(m62834a(((Number) obj).longValue(), z)));
                    C26077e.m63190a().mo53593b("ad_landing_channel_query").mo53582a("ad_wap_stat").mo53581a((Object) hashMap).mo53587b().mo53597c();
                    return;
                }
                C25907e eVar = (C25907e) f68433e.get(pair.first);
                if (eVar != null) {
                    HashMap hashMap2 = new HashMap();
                    Map map2 = hashMap2;
                    Object obj2 = pair.first;
                    C52711k.m112236a(obj2, "pair.first");
                    map2.put("channel_name", obj2);
                    IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                    if (createIAdServicebyMonsterPlugin != null) {
                        C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                        if (adLandPagePreloadService != null) {
                            map2.put("landing_type", Integer.valueOf(adLandPagePreloadService.mo46651a((String) pair.first)));
                        }
                    }
                    Object obj3 = pair.second;
                    C52711k.m112236a(obj3, "pair.second");
                    map2.put("response_status", Integer.valueOf(m62834a(((Number) obj3).longValue(), z)));
                    C26077e.m63190a().mo53593b("ad_landing_channel_query").mo53582a("ad_wap_stat").mo53580a(Long.valueOf(eVar.f68444c)).mo53604i(eVar.f68445d).mo53581a((Object) hashMap2).mo53587b().mo53597c();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53223a(String str, boolean z) {
        if (str != null) {
            if (m62835a().contains(str)) {
                C25907e eVar = new C25907e(0, null, 3, null);
                eVar.f68442a = System.currentTimeMillis();
                f68433e.put(str, eVar);
                HashMap hashMap = new HashMap();
                eVar.f68443b = z;
                Map map = hashMap;
                map.put("is_diff", Integer.valueOf(eVar.f68443b));
                map.put("channel_name", "common");
                C26077e.m63190a().mo53593b("ad_landing_common_download_start").mo53582a("ad_wap_stat").mo53581a((Object) hashMap).mo53587b().mo53597c();
            } else if (m62837b().contains(str)) {
                C25907e eVar2 = new C25907e(0, null, 3, null);
                eVar2.f68442a = System.currentTimeMillis();
                f68433e.put(str, eVar2);
                HashMap hashMap2 = new HashMap();
                eVar2.f68443b = z;
                Map map2 = hashMap2;
                map2.put("is_diff", Integer.valueOf(eVar2.f68443b));
                map2.put("channel", str);
                C26077e.m63190a().mo53582a("draw_ad").mo53593b("download_start").mo53602g("card_common").mo53581a((Object) hashMap2).mo53587b().mo53597c();
            } else {
                C25907e eVar3 = (C25907e) f68433e.get(str);
                if (eVar3 != null) {
                    eVar3.f68442a = System.currentTimeMillis();
                    HashMap hashMap3 = new HashMap();
                    eVar3.f68443b = z ? 1 : 0;
                    Map map3 = hashMap3;
                    map3.put("is_diff", Integer.valueOf(eVar3.f68443b));
                    map3.put("channel_name", str);
                    IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                    if (createIAdServicebyMonsterPlugin != null) {
                        C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                        if (adLandPagePreloadService != null) {
                            map3.put("landing_type", Integer.valueOf(adLandPagePreloadService.mo46651a(str)));
                        }
                    }
                    C26077e.m63190a().mo53593b("ad_landing_channel_download_start").mo53582a("ad_wap_stat").mo53580a(Long.valueOf(eVar3.f68444c)).mo53604i(eVar3.f68445d).mo53581a((Object) hashMap3).mo53587b().mo53597c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53222a(String str, int i, int i2, String str2, String str3) {
        CharSequence charSequence = str;
        int i3 = 0;
        if (!(charSequence == null || charSequence.length() == 0)) {
            HashMap hashMap = new HashMap();
            if (i2 == 1) {
                Map map = hashMap;
                map.put("channel_name", str);
                IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                if (createIAdServicebyMonsterPlugin != null) {
                    C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                    if (adLandPagePreloadService != null) {
                        map.put("landing_type", Integer.valueOf(adLandPagePreloadService.mo46651a(str)));
                    }
                }
                String str4 = "preload_status";
                if (i == 4) {
                    i3 = mo53226b(str);
                }
                map.put(str4, Integer.valueOf(i3));
            }
            C25905c cVar = (C25905c) f68434f.get(str);
            if (cVar != null) {
                hashMap.put("webview_init_duration", Long.valueOf(System.currentTimeMillis() - cVar.f68440b));
            }
            hashMap.put("is_web_url", Integer.valueOf(i2));
            C26077e.m63190a().mo53593b("ad_landing_webview_init").mo53582a("ad_wap_stat").mo53604i(str2).mo53596c(str3).mo53581a((Object) hashMap).mo53597c();
        }
    }

    /* renamed from: c */
    private static C10885e m62838c() {
        return C47731bq.m103348e();
    }

    /* renamed from: d */
    private static C10885e m62839d(String str) {
        return C47731bq.m103355h(str);
    }

    /* renamed from: c */
    public final void mo53227c(String str) {
        if (str != null) {
            f68434f.put(str, new C25905c(str, System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo53224a(List<? extends Aweme> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C0013i.m16a((Callable<TResult>) new C25903d<TResult>(list));
            C52711k.m112240b(list, "list");
            if (!collection.isEmpty()) {
                C0013i.m18a((Callable<TResult>) new C25885a<TResult>(list), (Executor) C0013i.f24a);
            }
        }
    }

    /* renamed from: b */
    public final int mo53226b(String str) {
        boolean z;
        if (C47731bq.m103352f()) {
            C48380q e = C48380q.m104672e();
            C52711k.m112236a((Object) e, "WebOfflineConfig.getInstance()");
            boolean c = C47731bq.m103343c(e.mo41210d(), "shadow_landing");
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin != null) {
                C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                if (adLandPagePreloadService != null) {
                    String b = adLandPagePreloadService.mo46656b(str);
                    if (adLandPagePreloadService.mo46651a(str) == 2) {
                        c = false;
                    }
                    boolean c2 = C47731bq.m103343c(adLandPagePreloadService.mo46659e(b), str);
                    if (c && c2) {
                        return 3;
                    }
                    if (c && !c2) {
                        return 1;
                    }
                    if (c || !c2) {
                        return 0;
                    }
                    return 2;
                }
            }
        } else {
            C10885e c3 = m62838c();
            if (c3 != null) {
                z = c3.mo19666b("shadow_landing");
            } else {
                z = false;
            }
            IAdService createIAdServicebyMonsterPlugin2 = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin2 != null) {
                C22412b adLandPagePreloadService2 = createIAdServicebyMonsterPlugin2.getAdLandPagePreloadService();
                if (adLandPagePreloadService2 != null && adLandPagePreloadService2.mo46651a(str) == 2) {
                    z = false;
                }
            }
            IAdService createIAdServicebyMonsterPlugin3 = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin3 != null) {
                C22412b adLandPagePreloadService3 = createIAdServicebyMonsterPlugin3.getAdLandPagePreloadService();
                if (adLandPagePreloadService3 != null) {
                    C10885e d = m62839d(adLandPagePreloadService3.mo46656b(str));
                    if (d != null) {
                        boolean b2 = d.mo19666b(str);
                        if (z && b2) {
                            return 3;
                        }
                        if (z && !b2) {
                            return 1;
                        }
                        if (z || !b2) {
                            return 0;
                        }
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo53221a(String str) {
        if (str != null) {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put("channel_name", str);
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin != null) {
                C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                if (adLandPagePreloadService != null) {
                    map.put("landing_type", Integer.valueOf(adLandPagePreloadService.mo46651a(str)));
                }
            }
            C26077e.m63190a().mo53593b("ad_landing_cache_clear").mo53582a("ad_wap_stat").mo53581a((Object) hashMap).mo53587b().mo53597c();
        }
    }

    /* renamed from: a */
    public final void mo53217a(long j, String str) {
        if (str != null && m62837b().contains(str)) {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put("active_status", Integer.valueOf(1));
            map.put("channel", str);
            C26077e.m63190a().mo53582a("draw_ad").mo53593b("active_finish").mo53602g("card_common").mo53581a((Object) hashMap).mo53587b().mo53597c();
            f68433e.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r6 == null) goto L_0x002e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53220a(long r3, java.lang.String r5, java.lang.Throwable r6) {
        /*
            r2 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List r3 = r2.m62837b()
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0059
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "active_status"
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r0, r1)
            java.lang.String r0 = "channel"
            r4.put(r0, r5)
            java.lang.String r0 = "fail_reason"
            if (r6 == 0) goto L_0x002e
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L_0x0030
        L_0x002e:
            java.lang.String r6 = ""
        L_0x0030:
            r4.put(r0, r6)
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r6 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r4.mo53582a(r6)
            java.lang.String r6 = "active_finish"
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r4.mo53593b(r6)
            java.lang.String r6 = "card_common"
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = r4.mo53602g(r6)
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r4.mo53581a(r3)
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53587b()
            r3.mo53597c()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r3 = f68433e
            r3.remove(r5)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.mo53220a(long, java.lang.String, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo53218a(long j, String str, long j2) {
        if (str != null) {
            if (m62835a().contains(str)) {
                C25907e eVar = (C25907e) f68433e.get(str);
                if (eVar != null) {
                    C52711k.m112236a((Object) eVar, "downloadMsgMap[channel] ?: return");
                    HashMap hashMap = new HashMap();
                    Map map = hashMap;
                    map.put("download_status", Integer.valueOf(1));
                    map.put("is_diff", Integer.valueOf(eVar.f68443b));
                    map.put("download_duration", Long.valueOf(System.currentTimeMillis() - eVar.f68442a));
                    map.put("download_size", Long.valueOf(j2));
                    map.put("package_id", Long.valueOf(j));
                    map.put("channel_name", "common");
                    C26077e.m63190a().mo53593b("ad_landing_common_download_finish").mo53582a("ad_wap_stat").mo53581a((Object) hashMap).mo53587b().mo53597c();
                    f68433e.remove(str);
                }
            } else if (m62837b().contains(str)) {
                C25907e eVar2 = (C25907e) f68433e.get(str);
                if (eVar2 != null) {
                    C52711k.m112236a((Object) eVar2, "downloadMsgMap[channel] ?: return");
                    HashMap hashMap2 = new HashMap();
                    Map map2 = hashMap2;
                    map2.put("download_status", Integer.valueOf(1));
                    map2.put("is_diff", Integer.valueOf(eVar2.f68443b));
                    map2.put("download_duration", Long.valueOf(System.currentTimeMillis() - eVar2.f68442a));
                    map2.put("download_size", Long.valueOf(j2));
                    map2.put("package_id", Long.valueOf(j));
                    map2.put("channel", str);
                    C26077e.m63190a().mo53582a("draw_ad").mo53593b("download_finish").mo53602g("card_common").mo53581a((Object) hashMap2).mo53587b().mo53597c();
                    f68433e.remove(str);
                }
            } else {
                C25907e eVar3 = (C25907e) f68433e.get(str);
                if (eVar3 != null) {
                    HashMap hashMap3 = new HashMap();
                    Map map3 = hashMap3;
                    map3.put("download_status", Integer.valueOf(1));
                    map3.put("is_diff", Integer.valueOf(eVar3.f68443b));
                    map3.put("channel_name", str);
                    IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
                    if (createIAdServicebyMonsterPlugin != null) {
                        C22412b adLandPagePreloadService = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService();
                        if (adLandPagePreloadService != null) {
                            map3.put("landing_type", Integer.valueOf(adLandPagePreloadService.mo46651a(str)));
                        }
                    }
                    map3.put("download_duration", Long.valueOf(System.currentTimeMillis() - eVar3.f68442a));
                    map3.put("download_size", Long.valueOf(j2));
                    map3.put("package_id", Long.valueOf(j));
                    C26077e.m63190a().mo53593b("ad_landing_channel_download_finish").mo53582a("ad_wap_stat").mo53580a(Long.valueOf(eVar3.f68444c)).mo53604i(eVar3.f68445d).mo53587b().mo53581a((Object) hashMap3).mo53597c();
                    f68433e.remove(str);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r13 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f1, code lost:
        if (r10 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0186, code lost:
        if (r13 == null) goto L_0x0188;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53219a(long r9, java.lang.String r11, long r12, java.lang.Throwable r14) {
        /*
            r8 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.List r0 = r8.m62835a()
            boolean r0 = r0.contains(r11)
            r1 = 0
            if (r0 == 0) goto L_0x008c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r0 = f68433e
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.commercialize.feed.d.e r0 = (com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25907e) r0
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.String r2 = "downloadMsgMap[channel] ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "download_status"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r1)
            java.lang.String r1 = "is_diff"
            int r4 = r0.f68443b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "download_duration"
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f68442a
            long r4 = r4 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.put(r1, r0)
            java.lang.String r0 = "download_size"
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r3.put(r0, r12)
            java.lang.String r12 = "download_fail_reason"
            if (r14 == 0) goto L_0x005d
            java.lang.String r13 = r14.getMessage()
            if (r13 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r13 = ""
        L_0x005f:
            r3.put(r12, r13)
            java.lang.String r12 = "package_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3.put(r12, r9)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r10 = "ad_landing_common_download_finish"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53593b(r10)
            java.lang.String r10 = "ad_wap_stat"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53582a(r10)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53581a(r2)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53587b()
            r9.mo53597c()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r9 = f68433e
            r9.remove(r11)
            return
        L_0x008c:
            java.util.List r0 = r8.m62837b()
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x011f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r0 = f68433e
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.commercialize.feed.d.e r0 = (com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25907e) r0
            if (r0 != 0) goto L_0x00a1
            return
        L_0x00a1:
            java.lang.String r2 = "downloadMsgMap[channel] ?: return"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "download_status"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r1)
            java.lang.String r1 = "is_diff"
            int r4 = r0.f68443b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "download_duration"
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f68442a
            long r4 = r4 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.put(r1, r0)
            java.lang.String r0 = "download_size"
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r3.put(r0, r12)
            java.lang.String r12 = "package_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3.put(r12, r9)
            java.lang.String r9 = "channel"
            r3.put(r9, r11)
            java.lang.String r9 = "fail_reason"
            if (r14 == 0) goto L_0x00f3
            java.lang.String r10 = r14.getMessage()
            if (r10 != 0) goto L_0x00f5
        L_0x00f3:
            java.lang.String r10 = ""
        L_0x00f5:
            r3.put(r9, r10)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r10 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53582a(r10)
            java.lang.String r10 = "download_finish"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53593b(r10)
            java.lang.String r10 = "card_common"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53602g(r10)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53581a(r2)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53587b()
            r9.mo53597c()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r9 = f68433e
            r9.remove(r11)
            return
        L_0x011f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r0 = f68433e
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.commercialize.feed.d.e r0 = (com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25907e) r0
            if (r0 == 0) goto L_0x01c7
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "download_status"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r1)
            java.lang.String r1 = "is_diff"
            int r4 = r0.f68443b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "channel_name"
            r3.put(r1, r11)
            com.ss.android.ugc.aweme.ad.services.IAdService r1 = com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl.createIAdServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.ad.services.IAdService r1 = (com.p683ss.android.ugc.aweme.p1308ad.services.IAdService) r1
            if (r1 == 0) goto L_0x0165
            com.ss.android.ugc.aweme.ad.f.b r1 = r1.getAdLandPagePreloadService()
            if (r1 == 0) goto L_0x0165
            int r1 = r1.mo46651a(r11)
            java.lang.String r4 = "landing_type"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r4, r1)
        L_0x0165:
            java.lang.String r1 = "download_duration"
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.f68442a
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.put(r1, r4)
            java.lang.String r1 = "download_size"
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r3.put(r1, r12)
            java.lang.String r12 = "download_fail_reason"
            if (r14 == 0) goto L_0x0188
            java.lang.String r13 = r14.getMessage()
            if (r13 != 0) goto L_0x018a
        L_0x0188:
            java.lang.String r13 = ""
        L_0x018a:
            r3.put(r12, r13)
            java.lang.String r12 = "package_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3.put(r12, r9)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            java.lang.String r10 = "ad_landing_channel_download_finish"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53593b(r10)
            java.lang.String r10 = "ad_wap_stat"
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53582a(r10)
            long r12 = r0.f68444c
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53580a(r10)
            java.lang.String r10 = r0.f68445d
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53604i(r10)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53581a(r2)
            com.ss.android.ugc.aweme.commercialize.log.e$b r9 = r9.mo53587b()
            r9.mo53597c()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.commercialize.feed.d.e> r9 = f68433e
            r9.remove(r11)
            return
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25899b.mo53219a(long, java.lang.String, long, java.lang.Throwable):void");
    }
}
