package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod */
public final class AdThirdTrackMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C48284a f121501a = new C48284a(null);

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod$a */
    public static final class C48284a {
        private C48284a() {
        }

        public /* synthetic */ C48284a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod$b */
    static final class C48285b extends C52712l implements C52682m<C26080b, Boolean, C26080b> {

        /* renamed from: a */
        final /* synthetic */ String f121502a;

        /* renamed from: b */
        final /* synthetic */ String f121503b;

        C48285b(String str, String str2) {
            this.f121502a = str;
            this.f121503b = str2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C26080b bVar = (C26080b) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(bVar, "$receiver");
            if (booleanValue) {
                return bVar.mo53598d(this.f121502a);
            }
            String str = this.f121503b;
            C52711k.m112236a((Object) str, "adId");
            return bVar.mo53595c(C52830p.m112396d(str));
        }
    }

    public AdThirdTrackMethod() {
        this(null, 1, null);
    }

    public AdThirdTrackMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
            String optString = jSONObject.optString("track_label");
            String optString2 = jSONObject.optString("creative_id");
            String optString3 = jSONObject.optString("log_extra");
            String optString4 = jSONObject.optString("ad_id");
            String optString5 = jSONObject.optString("group_id");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                aVar.mo60038a(-1, "empty track_url_list");
            } else if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                aVar.mo60038a(-1, "empty trackLabel or creativeId");
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
                ayVar.mo53546a(optString, arrayList, C52830p.m112396d(optString2), optString3, (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C48285b<Object,Object,Object>(optString5, optString4));
                aVar.mo60039a((Object) null);
            }
        }
    }

    private /* synthetic */ AdThirdTrackMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
