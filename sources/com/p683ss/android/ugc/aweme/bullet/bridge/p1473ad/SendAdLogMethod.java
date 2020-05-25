package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26116c;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26408az;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod */
public final class SendAdLogMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24125a f64012b = new C24125a(null);

    /* renamed from: c */
    private final String f64013c = "sendAdLog";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod$a */
    public static final class C24125a {
        private C24125a() {
        }

        public /* synthetic */ C24125a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod$b */
    static final class C24126b extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ C26116c f64014a;

        C24126b(C26116c cVar) {
            this.f64014a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                C26080b b = bVar.mo53590b(this.f64014a.f68966l);
                C52711k.m112236a((Object) b, "fill(adInfo.aweme)");
                return b;
            }
            C26080b a = bVar.mo53578a(this.f64014a.f68966l);
            C52711k.m112236a((Object) a, "adId(adInfo.aweme)");
            return a;
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64013c;
    }

    public SendAdLogMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("func");
        C26116c a = C26408az.m63874a();
        try {
            String optString2 = jSONObject.optString("tag");
            String optString3 = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParam");
            boolean z2 = false;
            boolean optBoolean = jSONObject.optBoolean("has_ad_info", false);
            C52711k.m112236a((Object) optString2, "tag");
            if (optString2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C52711k.m112236a((Object) optString3, "label");
                if (optString3.length() > 0) {
                    z2 = true;
                }
                if (z2 && a != null) {
                    C26077e.m63190a().mo53582a(optString2).mo53593b(optString3).mo53580a(Long.valueOf(a.f68955a)).mo53604i(a.f68956b).mo53592b(Long.valueOf(a.f68957c)).mo53594b(optJSONObject).mo53586a(mo18743e());
                    if (C52711k.m112239a((Object) optString2, (Object) "draw_ad") && C52711k.m112239a((Object) optString3, (Object) "click")) {
                        Aweme aweme = a.f68966l;
                        if (aweme != null) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (awemeRawAd != null) {
                                C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C24126b<Object,Object,Object>(a));
                            }
                        }
                    }
                    if (aVar != null) {
                        aVar.mo49911a((Object) null);
                    }
                    C52711k.m112236a((Object) optString, "func");
                    C25720j jVar = new C25720j(optString, jSONObject, null, null, 12, null);
                    C47718bf.m103288a(jVar);
                }
            }
            if (optBoolean) {
                String optString4 = jSONObject.optString("creative_id");
                String optString5 = jSONObject.optString("log_extra");
                String optString6 = jSONObject.optString("group_id");
                if (!TextUtils.isEmpty(optString4)) {
                    C26077e.m63190a().mo53582a(optString2).mo53593b(optString3).mo53596c(optString4).mo53604i(optString5).mo53598d(optString6).mo53594b(optJSONObject).mo53586a(mo18743e());
                    if (aVar != null) {
                        aVar.mo49911a((Object) null);
                    }
                } else if (aVar != null) {
                    aVar.mo49910a(-1, "empty creativeId");
                }
            } else if (aVar != null) {
                aVar.mo49910a(-1, "empty tag or label");
            }
        } catch (Exception e) {
            C32458a.m75143a(e);
            if (aVar != null) {
                aVar.mo49910a(-1, "unknown error");
            }
        }
        C52711k.m112236a((Object) optString, "func");
        C25720j jVar2 = new C25720j(optString, jSONObject, null, null, 12, null);
        C47718bf.m103288a(jVar2);
    }
}
