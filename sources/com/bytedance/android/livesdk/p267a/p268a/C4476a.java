package com.bytedance.android.livesdk.p267a.p268a;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.C2977g;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.browser.jsbridge.p297b.C4771a;
import com.bytedance.android.livesdk.p267a.C4487b;
import com.bytedance.android.livesdk.p267a.C4488c;
import com.bytedance.android.livesdk.p267a.C4489d;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.p455i.C8815e;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.ss.android.ugc.trill.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

@C4488c(mo10289a = "webcast_inroom_fetch")
/* renamed from: com.bytedance.android.livesdk.a.a.a */
public final class C4476a extends C4489d<JSONObject> {

    /* renamed from: b */
    public C1690c f12241b;

    /* renamed from: b */
    private static List<C2977g> m10794b(JSONObject jSONObject) {
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
    private static void m10793a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            try {
                jSONObject.put("room_id", String.valueOf(currentRoom.getId()));
                jSONObject.put("anchor_id", String.valueOf(currentRoom.getOwnerUserId()));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo10286a(Map<String, Object> map) throws Exception {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String valueOf = String.valueOf(map.get("url"));
        Object obj = map.get("method");
        if (obj != null) {
            str = obj.toString().toLowerCase();
        } else {
            str = "post";
        }
        Object obj2 = map.get("headers");
        if (obj2 != null) {
            jSONObject = new JSONObject(obj2.toString());
        } else {
            jSONObject = null;
        }
        Object obj3 = map.get("params");
        if (obj3 != null) {
            jSONObject2 = new JSONObject(obj3.toString());
        } else {
            jSONObject2 = null;
        }
        Object obj4 = map.get("data");
        if (obj4 != null) {
            jSONObject3 = new JSONObject(obj4.toString());
        } else {
            jSONObject3 = null;
        }
        C1680ad b = C1680ad.m5961a(str).mo6155b(C2168a.m6521b());
        C4478b bVar = new C4478b(this, jSONObject2, valueOf, jSONObject3, jSONObject);
        b.mo6157b((C1711f<? super T, ? extends R>) bVar).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C1683ag<JSONObject>() {
            public final void onSubscribe(C1690c cVar) {
                C4476a.this.f12241b = cVar;
            }

            public final void onError(Throwable th) {
                C4575an.m10987a(C3922z.m9903a((int) R.string.ewu));
                C4476a.this.mo10293a(th);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject.getInt("status_code") == 0) {
                        C4487b.m10802a().mo10287a(jSONObject2.getString("schema"));
                    } else {
                        C4575an.m10987a(jSONObject2.getString("prompts"));
                    }
                    C4476a.this.mo10291a(jSONObject);
                } catch (JSONException e) {
                    C4476a.this.mo10293a((Throwable) e);
                }
            }
        });
    }

    /* renamed from: a */
    private static String m10791a(String str, JSONObject jSONObject) {
        C18922i iVar = new C18922i(str);
        for (C2977g gVar : m10794b(jSONObject)) {
            iVar.mo38778a(gVar.getName(), gVar.getValue());
        }
        return iVar.mo38774a();
    }

    /* renamed from: a */
    private static JSONObject m10792a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws IOException, JSONException {
        String a = m10791a(str, jSONObject2);
        ArrayList<C19180e> arrayList = new ArrayList<>();
        if (jSONObject3 != null) {
            Iterator keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                arrayList.add(new C19180e(str2, jSONObject3.optString(str2, "")));
            }
        }
        String a2 = C4771a.m11338a(a);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(((IHostNetwork) C4116c.m10249a(IHostNetwork.class)).getHostDomain());
        sb.append(a2);
        String sb2 = sb.toString();
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
        return new JSONObject(new String(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).post(sb2, m10794b(jSONObject), "application/x-www-form-urlencoded; charset=UTF-8", byteArrayOutputStream.toByteArray()).mo15805a()).f24066e));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ JSONObject mo10285a(JSONObject jSONObject, String str, JSONObject jSONObject2, JSONObject jSONObject3, String str2) throws Exception {
        if (TextUtils.equals(str2, "post")) {
            m10793a(jSONObject2);
            return m10792a(str, jSONObject3, jSONObject, jSONObject2);
        }
        m10793a(jSONObject);
        String a = m10791a(str, jSONObject);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(((IHostNetwork) C4116c.m10249a(IHostNetwork.class)).getHostDomain());
        sb.append(a);
        return new JSONObject(new String(((C8815e) ((INetworkService) C4116c.m10249a(INetworkService.class)).get(sb.toString(), m10794b(jSONObject3)).mo15805a()).f24066e));
    }
}
