package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogV3Method */
public final class SendLogV3Method extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29836a f77900a = new C29836a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogV3Method$a */
    public static final class C29836a {
        private C29836a() {
        }

        public /* synthetic */ C29836a(C52707g gVar) {
            this();
        }
    }

    public SendLogV3Method() {
        this(null, 1, null);
    }

    public SendLogV3Method(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                Iterator keys = optJSONObject.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    String optString2 = optJSONObject.optString(str);
                    keys.remove();
                    Map map = hashMap;
                    C52711k.m112236a((Object) str, "key");
                    C52711k.m112236a((Object) optString2, "value");
                    map.put(str, optString2);
                }
                C26883g.m64995a(optString, hashMap);
                if (aVar != null) {
                    aVar.mo60039a((Object) new C18085o());
                }
            } else if (aVar != null) {
                aVar.mo60038a(0, "");
            }
        } else if (aVar != null) {
            aVar.mo60038a(0, "");
        }
    }

    private /* synthetic */ SendLogV3Method(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
