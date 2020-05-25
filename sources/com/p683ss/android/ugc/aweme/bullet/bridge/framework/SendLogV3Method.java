package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.common.C26883g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method */
public final class SendLogV3Method extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24212a f64243b = new C24212a(null);

    /* renamed from: c */
    private final String f64244c = "sendLogV3";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method$a */
    public static final class C24212a {
        private C24212a() {
        }

        public /* synthetic */ C24212a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64244c;
    }

    public SendLogV3Method(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        if (jSONObject == null) {
            aVar.mo49910a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
            aVar.mo49910a(0, "");
            return;
        }
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
        aVar.mo49911a((Object) new C18085o());
    }
}
