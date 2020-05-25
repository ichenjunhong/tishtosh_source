package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.util.Base64;
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

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.v */
public final class C4940v extends C10779d<JSONObject, JSONObject> {

    /* renamed from: a */
    public C1690c f13277a;

    public final void onTerminate() {
        if (this.f13277a != null) {
            this.f13277a.dispose();
        }
    }

    /* renamed from: a */
    static List<C2977g> m11438a(JSONObject jSONObject) {
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
    static String m11436a(String str, JSONObject jSONObject) {
        C18922i iVar = new C18922i(str);
        for (C2977g gVar : m11438a(jSONObject)) {
            iVar.mo38778a(gVar.getName(), gVar.getValue());
        }
        return iVar.mo38774a();
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        String optString = jSONObject.optString("url", "");
        C1680ad.m5961a(jSONObject.optString("method", "get").toLowerCase()).mo6155b(C2168a.m6521b()).mo6157b((C1711f<? super T, ? extends R>) new C4942w<Object,Object>(optString, jSONObject.optJSONObject("headers"), jSONObject.optJSONObject("params"), jSONObject.optJSONObject("data"))).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C1683ag<String>() {
            public final void onError(Throwable th) {
                C4940v.this.finishWithFailure(th);
            }

            public final void onSubscribe(C1690c cVar) {
                C4940v.this.f13277a = cVar;
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                String str = (String) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw", str);
                    C4940v.this.finishWithResult(jSONObject);
                } catch (JSONException e) {
                    C4940v.this.finishWithFailure(e);
                }
            }
        });
    }

    /* renamed from: a */
    static String m11437a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws IOException, JSONException {
        String a = m11436a(str, jSONObject2);
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
        return Base64.encodeToString(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).post(a2, m11438a(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).mo15805a()).f24066e, 2);
    }
}
