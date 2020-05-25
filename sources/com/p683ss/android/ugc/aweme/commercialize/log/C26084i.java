package com.p683ss.android.ugc.aweme.commercialize.log;

import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25751b;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25772e;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25828l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.i */
public final class C26084i implements C25828l {

    /* renamed from: a */
    public static final C26084i f68884a = new C26084i();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.i$a */
    static final class C26085a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ boolean f68885a;

        /* renamed from: b */
        final /* synthetic */ C25751b f68886b;

        /* renamed from: c */
        final /* synthetic */ C25772e f68887c;

        /* renamed from: d */
        final /* synthetic */ String f68888d;

        C26085a(boolean z, C25751b bVar, C25772e eVar, String str) {
            this.f68885a = z;
            this.f68886b = bVar;
            this.f68887c = eVar;
            this.f68888d = str;
        }

        public final /* synthetic */ Object call() {
            try {
                boolean z = !this.f68885a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_url", this.f68886b.f68094a);
                jSONObject.put("egg_type", this.f68887c.f68148a);
                jSONObject.put("egg_id", this.f68887c.f68152e);
                jSONObject.put("creative_id", this.f68887c.f68149b);
                jSONObject.put("log_extra", this.f68887c.f68150c);
                jSONObject.put("aweme_id", this.f68887c.f68151d);
                C23569o.m57776a(this.f68888d, z ? 1 : 0, jSONObject);
            } catch (Exception unused) {
            }
            return C52860x.f131107a;
        }
    }

    private C26084i() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if ((r2 == null || r2.length() == 0) == false) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53608a(java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r9) {
        /*
            r8 = this;
            boolean r0 = m63244a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.log.C26084i.mo53608a(java.util.List):void");
    }

    /* renamed from: a */
    private static boolean m63244a() {
        if (!CommerceEggMonitorLogSetting.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53028a(C25751b bVar) {
        if (!m63244a() && bVar != null) {
            m63241a(f68884a, "preload_start", bVar.f68100g, 0, null, 12, null);
        }
    }

    /* renamed from: b */
    public final void mo53609b(List<? extends Aweme> list) {
        String str;
        String str2;
        boolean z;
        if (!m63244a() && list != null) {
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

    /* renamed from: a */
    public final void mo53607a(C26136q qVar) {
        if (!m63244a() && qVar != null) {
            C26063b bVar = new C26063b("egg", "data_received", 0, 4, null);
            C26072c.f68845b.mo53559a(bVar.mo53552e("search").mo53553f(qVar.getId()));
        }
    }

    /* renamed from: a */
    public final void mo53029a(C25751b bVar, boolean z) {
        if (!m63244a() && bVar != null) {
            m63241a(f68884a, "preload_result", bVar.f68100g, z ^ true ? 1 : 0, null, 8, null);
            m63242a("aweme_ad_egg_preload_error_rate", bVar, z);
        }
    }

    /* renamed from: a */
    private static void m63242a(String str, C25751b bVar, boolean z) {
        C25772e eVar = bVar.f68100g;
        if (eVar != null) {
            C0013i.m18a((Callable<TResult>) new C26085a<TResult>(z, bVar, eVar, str), (Executor) C26890h.m65003a());
        }
    }

    /* renamed from: a */
    public final void mo53030a(C25751b bVar, boolean z, String str) {
        if (!m63244a() && bVar != null) {
            m63243a("show_result", bVar.f68100g, z ^ true ? 1 : 0, str);
            m63242a("aweme_ad_egg_show_error_rate", bVar, z);
        }
    }

    /* renamed from: a */
    private static void m63243a(String str, C25772e eVar, int i, String str2) {
        if (eVar != null) {
            C26072c.f68845b.mo53559a(new C26063b("egg", str, i).mo53548a(eVar.f68151d).mo53549b(eVar.f68149b).mo53550c(eVar.f68150c).mo53552e(eVar.f68148a).mo53553f(eVar.f68152e).mo53551d(str2));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m63241a(C26084i iVar, String str, C25772e eVar, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        m63243a(str, eVar, i, null);
    }
}
