package com.p683ss.android.ugc.aweme.bullet.bridge.p1473ad;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod */
public final class AdThirdTrackMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24119a f63998b = new C24119a(null);

    /* renamed from: c */
    private final String f63999c = "sendThirdTrack";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod$a */
    public static final class C24119a {
        private C24119a() {
        }

        public /* synthetic */ C24119a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod$b */
    static final class C24120b extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ String f64000a;

        /* renamed from: b */
        final /* synthetic */ String f64001b;

        C24120b(String str, String str2) {
            this.f64000a = str;
            this.f64001b = str2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                return bVar.mo53598d(this.f64000a);
            }
            String str = this.f64001b;
            C52711k.m112236a((Object) str, "adId");
            return bVar.mo53595c(C52830p.m112396d(str));
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f63999c;
    }

    public AdThirdTrackMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        String optString = jSONObject.optString("track_label");
        String optString2 = jSONObject.optString("creative_id");
        String optString3 = jSONObject.optString("log_extra");
        String optString4 = jSONObject.optString("ad_id");
        String optString5 = jSONObject.optString("group_id");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            aVar.mo49910a(-1, "empty track_url_list");
        } else if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            aVar.mo49910a(-1, "empty trackLabel or creativeId");
        } else {
            List arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString6 = optJSONArray.optString(i);
                C52711k.m112236a((Object) optString6, "trackUrlListArr.optString(i)");
                arrayList.add(optString6);
            }
            C26060ay ayVar = C26060ay.f68819a;
            C52711k.m112236a((Object) optString, "trackLabel");
            C52711k.m112236a((Object) optString2, "creativeId");
            ayVar.mo53546a(optString, arrayList, C52830p.m112396d(optString2), optString3, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C24120b<Object,Object,Object>(optString5, optString4));
            aVar.mo49911a((Object) null);
        }
    }
}
