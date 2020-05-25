package com.p683ss.android.ugc.aweme.commercialize.log;

import com.p683ss.android.ugc.aweme.commercialize.feed.C25875ag;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.settings.EnableSendV3AppLog;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52555ag;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.c */
public final class C26072c implements C25875ag {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68844a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26072c.class), "TIME_MAP", "getTIME_MAP()Ljava/util/HashMap;"))};

    /* renamed from: b */
    public static final C26072c f68845b = new C26072c();

    /* renamed from: c */
    private static final C52668f f68846c = C52732g.m112285a(C26073a.f68848a);

    /* renamed from: d */
    private static final Set<String> f68847d = C52555ag.m112063a("card", "link", "egg");

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.c$a */
    static final class C26073a extends C52712l implements C52670a<HashMap<String, Long>> {

        /* renamed from: a */
        public static final C26073a f68848a = new C26073a();

        C26073a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.c$b */
    static final class C26074b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C26063b f68849a;

        /* renamed from: b */
        final /* synthetic */ String f68850b;

        /* renamed from: c */
        final /* synthetic */ HashMap f68851c;

        C26074b(C26063b bVar, String str, HashMap hashMap) {
            this.f68849a = bVar;
            this.f68850b = str;
            this.f68851c = hashMap;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            String str;
            String str2;
            C26080b g = C26077e.m63190a().mo53582a("component_monitor").mo53593b(this.f68849a.f68832i).mo53602g(this.f68849a.f68831h);
            CharSequence charSequence = this.f68850b;
            boolean z2 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "-1";
            } else {
                str = this.f68850b;
            }
            C26080b c = g.mo53596c(str);
            String str3 = this.f68849a.f68824a;
            if (str3 == null) {
                str3 = "-1";
            }
            C26080b a = c.mo53598d(str3).mo53604i(this.f68849a.f68826c).mo53581a((Object) this.f68851c);
            if (C26072c.m63173a(this.f68849a.f68831h)) {
                a.mo53606k("1");
            }
            a.mo53597c();
            if (C26072c.m63173a(this.f68849a.f68831h)) {
                C26080b g2 = C26077e.m63190a().mo53605j(this.f68849a.f68832i).mo53582a("component_monitor").mo53602g(this.f68849a.f68831h);
                CharSequence charSequence2 = this.f68850b;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str2 = "-1";
                } else {
                    str2 = this.f68850b;
                }
                C26080b c2 = g2.mo53596c(str2);
                String str4 = this.f68849a.f68824a;
                if (str4 == null) {
                    str4 = "-1";
                }
                c2.mo53598d(str4).mo53604i(this.f68849a.f68826c).mo53581a((Object) this.f68851c).mo53606k("3").mo53599d();
            }
            return C52860x.f131107a;
        }
    }

    private C26072c() {
    }

    /* renamed from: a */
    private final HashMap<String, Long> m63166a() {
        return (HashMap) f68846c.getValue();
    }

    /* renamed from: a */
    public final void mo53560a(String str, String str2, String str3, String str4, String str5, int i) {
        C52711k.m112240b(str, "refer");
        C52711k.m112240b(str2, "label");
        mo53559a(new C26063b(str, str2, i).mo53548a(str5).mo53549b(str3).mo53550c(str4));
    }

    /* renamed from: a */
    public final void mo53559a(C26063b bVar) {
        C52711k.m112240b(bVar, "param");
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        if (b.getEnablePreloadComponent().booleanValue()) {
            String str = bVar.f68831h;
            String str2 = bVar.f68832i;
            String str3 = bVar.f68824a;
            if (str3 == null) {
                str3 = "-1";
            }
            HashMap a = m63167a(str, str2, str3, bVar.f68833j);
            String str4 = bVar.f68827d;
            CharSequence charSequence = str4;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                a.put("reason", str4);
            }
            String str5 = bVar.f68828e;
            CharSequence charSequence2 = str5;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                a.put("type", str5);
            }
            String str6 = bVar.f68829f;
            CharSequence charSequence3 = str6;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z = true;
            }
            if (!z) {
                a.put("extra_id", str6);
            }
            HashMap<String, String> hashMap = bVar.f68830g;
            if (hashMap != null) {
                a.put("play_fun_data", hashMap);
            }
            C0013i.m18a((Callable<TResult>) new C26074b<TResult>(bVar, bVar.f68825b, a), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public static boolean m63173a(String str) {
        return EnableSendV3AppLog.getEnableV3() && f68847d.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0010 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53187a(java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x0079
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            boolean r5 = r4.isAd()
            if (r5 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            if (r4 == 0) goto L_0x002e
            java.util.Map r3 = r4.getCardInfos()
        L_0x002e:
            if (r3 == 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0010
            r1.add(r2)
            goto L_0x0010
        L_0x0039:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x0041:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.aweme.commercialize.log.c r4 = f68845b
            java.lang.String r5 = "card"
            java.lang.String r6 = "data_received"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r1.getAwemeRawAd()
            if (r2 == 0) goto L_0x005f
            java.lang.Long r2 = r2.getCreativeId()
            r7 = r2
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r1.getAwemeRawAd()
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r2.getLogExtra()
            r8 = r2
            goto L_0x006d
        L_0x006c:
            r8 = r3
        L_0x006d:
            java.lang.String r9 = r1.getAid()
            r10 = 0
            r11 = 32
            r12 = 0
            r4.m63172a(r5, r6, r7, r8, r9, -1)
            goto L_0x0041
        L_0x0079:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.egg.C25823j.f68267a
            if (r0 != 0) goto L_0x0088
            com.ss.android.ugc.aweme.commercialize.log.i r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26084i.f68884a
            r0.mo53608a(r14)
            com.ss.android.ugc.aweme.commercialize.log.i r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26084i.f68884a
            r0.mo53609b(r14)
            goto L_0x0092
        L_0x0088:
            com.ss.android.ugc.aweme.commercialize.egg.c.a r0 = com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25765a.f68132a
            r0.mo52965a(r14)
            com.ss.android.ugc.aweme.commercialize.egg.c.a r0 = com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25765a.f68132a
            r0.mo52966b(r14)
        L_0x0092:
            com.ss.android.ugc.aweme.commercialize.playfun.c r0 = com.p683ss.android.ugc.aweme.commercialize.playfun.C26169c.f69100a
            r0.mo53794a(r14)
            m63177b(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.log.C26072c.mo53187a(java.util.List):void");
    }

    /* renamed from: b */
    public static void m63175b(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f68845b.m63172a("redpacket", "show_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), 0);
            }
        }
    }

    /* renamed from: b */
    private static void m63177b(List<? extends Aweme> list) {
        Long l;
        if (list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (C26512f.m64108J((Aweme) next)) {
                    arrayList.add(next);
                }
            }
            for (Aweme aweme : (List) arrayList) {
                C26072c cVar = f68845b;
                String str = "redpacket";
                String str2 = "data_received";
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                String str3 = null;
                if (awemeRawAd != null) {
                    l = awemeRawAd.getCreativeId();
                } else {
                    l = null;
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str3 = awemeRawAd2.getLogExtra();
                }
                cVar.m63172a(str, str2, l, str3, aweme.getAid(), -1);
            }
        }
    }

    /* renamed from: a */
    public static void m63170a(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f68845b.m63172a("redpacket", "preload_start", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), -1);
            }
        }
    }

    /* renamed from: c */
    public static void m63179c(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f68845b.m63172a("redpacket", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
            }
        }
    }

    /* renamed from: b */
    public static void m63176b(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f68845b.m63172a("card", "show_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
            }
        }
    }

    /* renamed from: a */
    public static void m63171a(Aweme aweme, int i) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                f68845b.m63172a("card", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
            }
        }
    }

    /* renamed from: b */
    private final int m63174b(String str, String str2, String str3) {
        if (m63166a().get(m63178c(str, str2, str3)) == null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    private static String m63178c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        sb.append('_');
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    private final long m63165a(String str, String str2, String str3) {
        String str4;
        m63166a().put(m63178c(str, str2, str3), Long.valueOf(System.currentTimeMillis()));
        int hashCode = str2.hashCode();
        if (hashCode == -1942410580) {
            if (str2.equals("preload_start")) {
                str4 = "data_received";
            }
            return 0;
        } else if (hashCode != -127128813) {
            if (hashCode == 497550239 && str2.equals("show_result")) {
                str4 = "preload_result";
            }
            return 0;
        } else {
            if (str2.equals("preload_result")) {
                str4 = "preload_start";
            }
            return 0;
        }
        Long l = (Long) m63166a().get(m63178c(str, str4, str3));
        if (l == null) {
            return -1;
        }
        return System.currentTimeMillis() - l.longValue();
    }

    /* renamed from: a */
    private final HashMap<String, Object> m63167a(String str, String str2, String str3, int i) {
        long j;
        HashMap<String, Object> hashMap = new HashMap<>();
        int b = m63174b(str, str2, str3);
        Map map = hashMap;
        map.put("is_first", Integer.valueOf(b));
        String str4 = "time_interval";
        if (b == 1) {
            j = m63165a(str, str2, str3);
        } else {
            j = 0;
        }
        map.put(str4, Long.valueOf(j));
        if (i != -1) {
            map.put("result", Integer.valueOf(i));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r10 == null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m63172a(java.lang.String r8, java.lang.String r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x000f
            long r0 = r10.longValue()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            if (r10 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r3 = r10
            goto L_0x0012
        L_0x000f:
            java.lang.String r10 = "-1"
            goto L_0x000d
        L_0x0012:
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.mo53560a(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.log.C26072c.m63172a(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, int):void");
    }
}
