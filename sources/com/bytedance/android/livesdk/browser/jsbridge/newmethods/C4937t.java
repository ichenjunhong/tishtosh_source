package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.jsbridge.p297b.C4771a;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t */
public final class C4937t extends C10779d<JSONObject, JSONObject> {

    /* renamed from: a */
    public C1690c f13271a;

    public final void onTerminate() {
        if (this.f13271a != null) {
            this.f13271a.dispose();
        }
    }

    /* renamed from: a */
    static List<C2977g> m11434a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                arrayList.add(new C2977g(str, jSONObject.optString(str, "")));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static String m11433a(String str, JSONObject jSONObject) {
        C18922i iVar = new C18922i(str);
        for (C2977g gVar : m11434a(jSONObject)) {
            iVar.mo38778a(gVar.getName(), gVar.getValue());
        }
        return iVar.mo38774a();
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("url", "");
        String lowerCase = jSONObject.optString("method", "get").toLowerCase();
        JSONObject optJSONObject = jSONObject.optJSONObject("headers");
        C1680ad.m5961a(lowerCase).mo6155b(C2168a.m6521b()).mo6157b((C1711f<? super T, ? extends R>) new C4939u<Object,Object>(optString, jSONObject.optJSONObject("params"), optJSONObject, jSONObject.optJSONObject("data"))).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C1683ag<JSONObject>() {
            public final void onError(Throwable th) {
                C4937t.this.finishWithFailure(th);
            }

            public final void onSubscribe(C1690c cVar) {
                C4937t.this.f13271a = cVar;
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("raw", jSONObject);
                    C4937t.this.finishWithResult(jSONObject2);
                } catch (JSONException e) {
                    C4937t.this.finishWithFailure(e);
                }
            }
        });
    }

    /* renamed from: a */
    static JSONObject m11435a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws IOException, JSONException {
        String a = m11433a(str, jSONObject2);
        ArrayList<C19180e> arrayList = new ArrayList<>();
        if (jSONObject3 != null) {
            Iterator keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                arrayList.add(new C19180e(str2, jSONObject3.optString(str2, "")));
            }
        }
        String a2 = C4771a.m11338a(a);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (C19180e eVar : arrayList) {
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.write(38);
            }
            try {
                String encode = URLEncoder.encode(eVar.mo39131a(), "UTF-8");
                String encode2 = URLEncoder.encode(eVar.mo39132b(), "UTF-8");
                byteArrayOutputStream.write(encode.getBytes(Charset.forName("UTF-8")));
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(encode2.getBytes(Charset.forName("UTF-8")));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new JSONObject(new String(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).post(a2, m11434a(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).mo15805a()).f24066e));
    }
}
