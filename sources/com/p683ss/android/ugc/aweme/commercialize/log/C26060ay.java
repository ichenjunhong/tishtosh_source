package com.p683ss.android.ugc.aweme.commercialize.log;

import com.bytedance.android.p140a.p141a.C2782d;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.abtest.EnableTrackSDKExperiment;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.ay */
public final class C26060ay {

    /* renamed from: a */
    public static final C26060ay f68819a = new C26060ay();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.ay$a */
    static final class C26061a implements C26057av {

        /* renamed from: a */
        final /* synthetic */ String f68820a;

        /* renamed from: b */
        final /* synthetic */ Long f68821b;

        /* renamed from: c */
        final /* synthetic */ String f68822c;

        /* renamed from: d */
        final /* synthetic */ C52682m f68823d;

        C26061a(String str, Long l, String str2, C52682m mVar) {
            this.f68820a = str;
            this.f68821b = l;
            this.f68822c = str2;
            this.f68823d = mVar;
        }

        /* renamed from: a */
        public final void mo52818a(String str, String str2, long j) {
            C26080b a = C26077e.m63191a(str, str2, j).mo53605j("track_url").mo53582a("track_ad").mo53603h(this.f68820a).mo53580a(this.f68821b);
            String str3 = this.f68822c;
            if (str3 == null) {
                str3 = "";
            }
            C26080b i = a.mo53604i(str3);
            C52682m mVar = this.f68823d;
            if (mVar != null) {
                C52711k.m112236a((Object) i, "this");
                mVar.invoke(i, Boolean.valueOf(true));
            }
            i.mo53599d();
        }
    }

    private C26060ay() {
    }

    /* renamed from: a */
    public static boolean m63139a() {
        return C10181b.m20511a().mo18172a(EnableTrackSDKExperiment.class, true, "enable_tracker_sdk", 31744, false);
    }

    /* renamed from: a */
    private static Boolean m63137a(List<String> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Boolean.valueOf(true);
        }
        return null;
    }

    /* renamed from: a */
    private static void m63138a(List<String> list, String str, Long l, String str2, C52682m<? super C26080b, ? super Boolean, ? extends C26080b> mVar) {
        C26081f.m63237a((C26057av) new C26061a(str, l, str2, mVar), (Collection<String>) list, true);
    }

    /* renamed from: a */
    public final void mo53545a(String str, UrlModel urlModel, Long l, String str2, C52682m<? super C26080b, ? super Boolean, ? extends C26080b> mVar) {
        List list;
        C52711k.m112240b(str, "trackLabel");
        if (urlModel != null) {
            list = urlModel.getUrlList();
        } else {
            list = null;
        }
        mo53547a(str, list, l, str2, null, mVar);
    }

    /* renamed from: a */
    public final void mo53546a(String str, List<String> list, Long l, String str2, C52682m<? super C26080b, ? super Boolean, ? extends C26080b> mVar) {
        C52711k.m112240b(str, "trackLabel");
        mo53547a(str, list, l, str2, null, mVar);
    }

    /* renamed from: a */
    public final void mo53547a(String str, List<String> list, Long l, String str2, JSONObject jSONObject, C52682m<? super C26080b, ? super Boolean, ? extends C26080b> mVar) {
        long j;
        String str3 = str;
        List<String> list2 = list;
        Long l2 = l;
        C52711k.m112240b(str, "trackLabel");
        Boolean a = m63137a(list);
        if (a != null) {
            a.booleanValue();
            if (m63139a()) {
                C2782d a2 = C26066bc.f68840b.mo53556a();
                if (l2 != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                a2.mo7388a(null, str, j, list, true, -1, str2, jSONObject);
                return;
            }
            if (list2 == null) {
                C52711k.m112234a();
            }
            String str4 = str2;
            m63138a(list, str, l, str2, mVar);
        }
    }
}
