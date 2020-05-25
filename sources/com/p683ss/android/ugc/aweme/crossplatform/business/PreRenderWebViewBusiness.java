package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27192b;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27308i;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetWebViewInfo.C29803b;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness */
public final class PreRenderWebViewBusiness extends Business {

    /* renamed from: b */
    public static final Map<Integer, String> f71665b = C52550ab.m112050a(C52856t.m112465a(Integer.valueOf(2), "video_bottom_button"), C52856t.m112465a(Integer.valueOf(3), "video_mask_button"), C52856t.m112465a(Integer.valueOf(6), "comment_end_button"), C52856t.m112465a(Integer.valueOf(8), "profile_bottom_button"), C52856t.m112465a(Integer.valueOf(33), "ad_card"));

    /* renamed from: c */
    public static final C27167a f71666c = new C27167a(null);

    /* renamed from: a */
    public C10757a f71667a;

    /* renamed from: d */
    private int f71668d;

    /* renamed from: e */
    private String f71669e;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness$a */
    public static final class C27167a {
        private C27167a() {
        }

        public /* synthetic */ C27167a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m65569a(int i) {
            String str = (String) PreRenderWebViewBusiness.f71665b.get(Integer.valueOf(i));
            if (str == null) {
                return "others";
            }
            return str;
        }

        /* renamed from: a */
        public static PreRenderWebViewBusiness m65568a(C27149c cVar) {
            Context context;
            if (cVar != null) {
                context = cVar.getContext();
            } else {
                context = null;
            }
            if (!(context instanceof CrossPlatformActivity) && cVar != null) {
                C27182a crossPlatformParams = cVar.getCrossPlatformParams();
                if (crossPlatformParams != null) {
                    C27192b bVar = crossPlatformParams.f71719b;
                    if (bVar != null && bVar.f71767v == 7) {
                        C27177g crossPlatformBusiness = cVar.getCrossPlatformBusiness();
                        if (crossPlatformBusiness != null) {
                            return (PreRenderWebViewBusiness) crossPlatformBusiness.mo55523a(PreRenderWebViewBusiness.class);
                        }
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final PreRenderWebViewBusiness m65563a(C27149c cVar) {
        return C27167a.m65568a(cVar);
    }

    /* renamed from: a */
    public static final String m65564a(int i) {
        return C27167a.m65569a(i);
    }

    /* renamed from: a */
    public final void mo55509a() {
        this.f71668d = 0;
        C10757a aVar = this.f71667a;
        if (aVar != null) {
            aVar.mo19458b("webViewDidHide", null);
        }
    }

    public PreRenderWebViewBusiness(C27173c cVar) {
        C52711k.m112240b(cVar, "crossPlatformBusiness");
        super(cVar);
    }

    /* renamed from: a */
    public final void mo55511a(String str) {
        this.f71668d = 2;
        C10757a aVar = this.f71667a;
        if (aVar != null) {
            String str2 = "webViewDidShow";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception unused) {
            }
            aVar.mo19458b(str2, jSONObject);
        }
        this.f71669e = str;
    }

    /* renamed from: a */
    public final void mo55510a(C27298a aVar, C29803b bVar) {
        C29789a aVar2;
        C52711k.m112240b(aVar, "crossPlatformWebView");
        if (bVar != null) {
            aVar2 = bVar.f77824b;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            int i = bVar.f77823a;
            C27308i a = aVar.mo55670a(C27309j.class);
            C52711k.m112236a((Object) a, "crossPlatformWebView.get…(WebViewWrap::class.java)");
            SingleWebView a2 = ((C27309j) a).mo55729a();
            if (a2 != null && i == a2.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f71668d);
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f71669e);
                String str = this.f71633j.f71719b.f71741E;
                if (C52711k.m112239a((Object) "splash", (Object) str)) {
                    jSONObject.put("scene", 2);
                } else if (C52711k.m112239a((Object) "feedad", (Object) str)) {
                    jSONObject.put("scene", 1);
                }
                bVar.f77824b.mo60041a(jSONObject);
            }
        }
    }
}
