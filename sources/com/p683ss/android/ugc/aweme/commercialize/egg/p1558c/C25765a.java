package com.p683ss.android.ugc.aweme.commercialize.egg.p1558c;

import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1559d.C25771a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25776b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26063b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.log.CommerceEggMonitorLogSetting;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.c.a */
public final class C25765a implements C25771a {

    /* renamed from: a */
    public static final C25765a f68132a = new C25765a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.c.a$a */
    static final class C25766a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f68133a;

        /* renamed from: b */
        final /* synthetic */ C25773a f68134b;

        /* renamed from: c */
        final /* synthetic */ C25776b f68135c;

        /* renamed from: d */
        final /* synthetic */ String f68136d;

        C25766a(boolean z, C25773a aVar, C25776b bVar, String str) {
            this.f68133a = z;
            this.f68134b = aVar;
            this.f68135c = bVar;
            this.f68136d = str;
        }

        public final /* synthetic */ Object call() {
            try {
                boolean z = !this.f68133a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_url", this.f68134b.f68153a);
                jSONObject.put("egg_type", this.f68135c.f68178a);
                jSONObject.put("egg_id", this.f68135c.f68182e);
                jSONObject.put("creative_id", this.f68135c.f68179b);
                jSONObject.put("log_extra", this.f68135c.f68180c);
                jSONObject.put("aweme_id", this.f68135c.f68181d);
                C23569o.m57776a(this.f68136d, z ? 1 : 0, jSONObject);
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    private C25765a() {
    }

    /* renamed from: a */
    private static boolean m62365a() {
        if (!CommerceEggMonitorLogSetting.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo52962a(C25773a aVar) {
        if (!m62365a() && aVar != null) {
            m62362a(f68132a, "preload_start", aVar.f68164l, 0, null, 12, null);
        }
    }

    /* renamed from: b */
    public final void mo52966b(List<? extends Aweme> list) {
        String str;
        String str2;
        boolean z;
        if (!m62365a() && list != null) {
            Iterable iterable = list;
            Collection arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                List list2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ItemCommentEggGroup commentEggGroup = ((Aweme) next).getCommentEggGroup();
                if (commentEggGroup != null) {
                    list2 = commentEggGroup.getCommentEggData();
                }
                if (list2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (Aweme aweme : (List) arrayList) {
                C26063b bVar = new C26063b("egg", "data_received", 0, 4, null);
                C26063b a = bVar.mo53548a(aweme.getAid());
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    str = awemeRawAd.getCreativeIdStr();
                } else {
                    str = null;
                }
                C26063b b = a.mo53549b(str);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    str2 = awemeRawAd2.getLogExtra();
                } else {
                    str2 = null;
                }
                C26072c.f68845b.mo53559a(b.mo53550c(str2).mo53552e("comment"));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r2 == false) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52965a(java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            boolean r0 = m62365a()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r9 == 0) goto L_0x00b0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r9 = r9.iterator()
        L_0x0016:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r2
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r2 = r2.getCommerceAdLikeDigg()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0054
            java.lang.String r5 = r2.getFileType()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x003c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r5 = 0
            goto L_0x003d
        L_0x003c:
            r5 = 1
        L_0x003d:
            if (r5 != 0) goto L_0x0054
            java.lang.String r2 = r2.getMaterialUrl()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0050
            int r2 = r2.length()
            if (r2 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r2 = 0
            goto L_0x0051
        L_0x0050:
            r2 = 1
        L_0x0051:
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            if (r3 == 0) goto L_0x0016
            r0.add(r1)
            goto L_0x0016
        L_0x005b:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r9 = r0.iterator()
        L_0x0063:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r9.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.commercialize.log.b r7 = new com.ss.android.ugc.aweme.commercialize.log.b
            java.lang.String r2 = "egg"
            java.lang.String r3 = "data_received"
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r1 = r0.getAid()
            com.ss.android.ugc.aweme.commercialize.log.b r1 = r7.mo53548a(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            r3 = 0
            if (r2 == 0) goto L_0x0090
            java.lang.String r2 = r2.getCreativeIdStr()
            goto L_0x0091
        L_0x0090:
            r2 = r3
        L_0x0091:
            com.ss.android.ugc.aweme.commercialize.log.b r1 = r1.mo53549b(r2)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x009f
            java.lang.String r3 = r0.getLogExtra()
        L_0x009f:
            com.ss.android.ugc.aweme.commercialize.log.b r0 = r1.mo53550c(r3)
            java.lang.String r1 = "like"
            com.ss.android.ugc.aweme.commercialize.log.b r0 = r0.mo53552e(r1)
            com.ss.android.ugc.aweme.commercialize.log.c r1 = com.p683ss.android.ugc.aweme.commercialize.log.C26072c.f68845b
            r1.mo53559a(r0)
            goto L_0x0063
        L_0x00af:
            return
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.egg.p1558c.C25765a.mo52965a(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo52963a(C25773a aVar, boolean z) {
        if (!m62365a() && aVar != null) {
            m62362a(f68132a, "preload_result", aVar.f68164l, z ^ true ? 1 : 0, null, 8, null);
            m62363a("aweme_ad_egg_preload_error_rate", aVar, z);
        }
    }

    /* renamed from: a */
    private static void m62363a(String str, C25773a aVar, boolean z) {
        C25776b bVar = aVar.f68164l;
        if (bVar != null) {
            C0013i.m18a((Callable<TResult>) new C25766a<TResult>(z, aVar, bVar, str), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public final void mo52964a(C25773a aVar, boolean z, String str) {
        if (!m62365a() && aVar != null) {
            m62364a("show_result", aVar.f68164l, z ^ true ? 1 : 0, str);
            m62363a("aweme_ad_egg_show_error_rate", aVar, z);
        }
    }

    /* renamed from: a */
    private static void m62364a(String str, C25776b bVar, int i, String str2) {
        if (bVar != null) {
            C26072c.f68845b.mo53559a(new C26063b("egg", str, i).mo53548a(bVar.f68181d).mo53549b(bVar.f68179b).mo53550c(bVar.f68180c).mo53552e(bVar.f68178a).mo53553f(bVar.f68182e).mo53551d(str2));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m62362a(C25765a aVar, String str, C25776b bVar, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        m62364a(str, bVar, i, null);
    }
}
