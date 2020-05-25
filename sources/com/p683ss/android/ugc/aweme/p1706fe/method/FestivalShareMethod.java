package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.FestivalShareMethod */
public final class FestivalShareMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29801a f77821a = new C29801a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.FestivalShareMethod$a */
    public static final class C29801a {
        private C29801a() {
        }

        public /* synthetic */ C29801a(C52707g gVar) {
            this();
        }
    }

    public FestivalShareMethod() {
        this(null, 1, null);
    }

    public FestivalShareMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        if (this.f77793e.get() != null) {
            if (jSONObject != null) {
                str = jSONObject.optString("item_id");
            } else {
                str = null;
            }
            if (str != null) {
                IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
                Object obj = this.f77793e.get();
                if (obj == null) {
                    C52711k.m112234a();
                }
                bridgeService_Monster.festivalShareFromH5((Context) obj, str, aVar);
            }
        }
    }

    private /* synthetic */ FestivalShareMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
