package com.p683ss.android.ugc.aweme.web.jsbridge.p2401a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.api.Api.C22961d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47809dg;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48347g;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48362t;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48306a;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48307b;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48308c;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48309d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.e */
public class C48318e implements C48310b {

    /* renamed from: a */
    public static final String f121571a = "e";

    /* renamed from: b */
    private C10766h f121572b;

    /* renamed from: c */
    private JSONObject f121573c;

    /* renamed from: d */
    private Handler f121574d;

    /* renamed from: e */
    private C10757a f121575e;

    /* renamed from: f */
    private C48306a f121576f;

    /* renamed from: g */
    private C48308c f121577g;

    /* renamed from: h */
    private C48362t f121578h;

    /* renamed from: i */
    private String f121579i;

    /* renamed from: j */
    private String f121580j;

    /* renamed from: k */
    private String f121581k;

    /* renamed from: l */
    private JSONObject f121582l;

    /* renamed from: m */
    private JSONObject f121583m;

    /* renamed from: n */
    private List<C12685b> f121584n;

    /* renamed from: o */
    private String f121585o;

    /* renamed from: p */
    private Exception f121586p;

    /* renamed from: q */
    private Callable<JSONObject> f121587q = new C48319f(this);

    /* renamed from: r */
    private Callable<JSONObject> f121588r = new C48320g(this);

    /* renamed from: s */
    private Callable<JSONObject> f121589s = new C48321h(this);

    /* renamed from: t */
    private Callable<JSONObject> f121590t = new C48322i(this);

    /* renamed from: u */
    private CommonApi f121591u = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class));

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public JSONObject mo95809c() {
        String a;
        this.f121580j = m104651a(this.f121580j, this.f121582l);
        String str = "";
        try {
            if (this.f121585o != null) {
                a = C47809dg.f120359a.mo95051a(this.f121580j, this.f121583m, this.f121585o, this.f121584n);
            } else {
                a = C47809dg.f120359a.mo95051a(this.f121580j, this.f121583m, "application/x-www-form-urlencoded", this.f121584n);
            }
            String str2 = a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str2));
            jSONObject.put("_raw", str2);
            return jSONObject;
        } catch (Exception e) {
            this.f121586p = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put("response", new JSONObject(str));
                jSONObject2.put("_raw", str);
            } catch (JSONException unused) {
            }
            return jSONObject2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public JSONObject mo95808b() {
        String str;
        this.f121580j = m104651a(this.f121580j, this.f121582l);
        String str2 = "";
        try {
            if (this.f121585o != null) {
                str = C47809dg.f120359a.mo95052b(this.f121580j, this.f121583m, this.f121585o, this.f121584n);
            } else {
                HashMap hashMap = new HashMap();
                if (this.f121583m != null) {
                    Iterator keys = this.f121583m.keys();
                    while (keys.hasNext()) {
                        String str3 = (String) keys.next();
                        hashMap.put(str3, this.f121583m.optString(str3, ""));
                    }
                }
                NetUtil.putCommonParams(hashMap, true);
                str = (String) this.f121591u.doPost(this.f121580j, 0, (Map<String, String>) hashMap).execute().f33552b;
                try {
                    Api.m56468a(str, this.f121580j);
                } catch (Exception e) {
                    String str4 = str;
                    e = e;
                    str2 = str4;
                }
            }
            str2 = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str2));
            jSONObject.put("_raw", str2);
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            this.f121586p = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put("response", new JSONObject(str2));
                jSONObject2.put("_raw", str2);
            } catch (JSONException unused) {
            }
            return jSONObject2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public JSONObject mo95810d() {
        this.f121580j = m104651a(this.f121580j, this.f121582l);
        try {
            String str = this.f121580j;
            if (C48324k.m104662a(C11010c.m22280a())) {
                String str2 = (String) Api.m56467a((String) this.f121591u.doDelete(str, this.f121584n).execute().f33552b, C22961d.m56475a(), null, str);
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("_raw", str2);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str2));
                return jSONObject;
            }
            throw new IOException();
        } catch (C19174b e) {
            this.f121586p = e;
            JSONObject jSONObject2 = new JSONObject();
            m104654a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (C23459a e2) {
            this.f121586p = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m104654a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f121586p = e3;
            JSONObject jSONObject4 = new JSONObject();
            m104654a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public JSONObject mo95811e() {
        this.f121580j = m104651a(this.f121580j, this.f121582l);
        try {
            String str = (String) this.f121591u.doGet(this.f121580j, null, this.f121584n).execute().f33552b;
            JSONObject jSONObject = new JSONObject(str);
            Api.m56469a(jSONObject, str, this.f121580j);
            jSONObject.put("_raw", str);
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str));
            return jSONObject;
        } catch (C19174b e) {
            this.f121586p = e;
            JSONObject jSONObject2 = new JSONObject();
            m104654a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (C23459a e2) {
            this.f121586p = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m104654a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f121586p = e3;
            JSONObject jSONObject4 = new JSONObject();
            m104654a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* renamed from: a */
    public final void mo95796a() {
        C10766h hVar = this.f121572b;
        JSONObject jSONObject = this.f121573c;
        this.f121579i = hVar.f28945b;
        JSONObject jSONObject2 = hVar.f28947d;
        this.f121580j = jSONObject2.optString("url", "");
        this.f121581k = jSONObject2.optString("method", "get");
        this.f121582l = jSONObject2.optJSONObject("params");
        this.f121583m = jSONObject2.optJSONObject("data");
        JSONObject optJSONObject = jSONObject2.optJSONObject("header");
        if (optJSONObject != null) {
            this.f121584n = new ArrayList();
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String optString = optJSONObject.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    this.f121584n.add(new C12685b(str, optString));
                    if ("content-type".equalsIgnoreCase(str)) {
                        this.f121585o = optString;
                    }
                }
            }
        }
        this.f121578h = C48347g.m104665a();
        if ("get".equalsIgnoreCase(this.f121581k)) {
            C23566n.m57766a().mo48750a(this.f121574d, this.f121587q, 25);
        } else if ("post".equalsIgnoreCase(this.f121581k)) {
            C23566n.m57766a().mo48750a(this.f121574d, this.f121588r, 32);
        } else if ("put".equalsIgnoreCase(this.f121581k)) {
            C23566n.m57766a().mo48750a(this.f121574d, this.f121589s, 33);
        } else {
            if ("delete".equalsIgnoreCase(this.f121581k)) {
                C23566n.m57766a().mo48750a(this.f121574d, this.f121590t, 34);
            }
        }
    }

    /* renamed from: a */
    private void m104652a(C18922i iVar) {
        if (this.f121578h != null) {
            Map a = this.f121578h.mo56382a();
            if (!a.isEmpty()) {
                for (Entry entry : a.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        iVar.mo38778a(str, str2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo95807a(Message message) {
        if (message.what == 25 || message.what == 32 || message.what == 33 || message.what == 34) {
            if (message.obj == null) {
                return true;
            }
            try {
                JSONObject jSONObject = (JSONObject) message.obj;
                if (this.f121577g != null) {
                    C48307b bVar = new C48307b(this.f121581k, m104651a(this.f121580j, this.f121582l), this.f121583m);
                    JSONObject jSONObject2 = null;
                    if (jSONObject != null && jSONObject.has("response")) {
                        jSONObject2 = jSONObject.optJSONObject("response");
                    }
                    this.f121577g.mo49921a(bVar, new C48309d(jSONObject2, this.f121586p));
                }
                if (this.f121575e != null && !TextUtils.isEmpty(this.f121579i)) {
                    this.f121575e.mo19455a(this.f121579i, jSONObject);
                } else if (this.f121576f != null) {
                    this.f121576f.mo49920a(jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private String m104651a(String str, JSONObject jSONObject) {
        C18922i iVar = new C18922i(str);
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                iVar.mo38778a(str2, jSONObject.optString(str2, ""));
            }
        }
        m104652a(iVar);
        m104653a(iVar, "request_tag_from", "h5");
        return iVar.mo38774a();
    }

    /* renamed from: a */
    private static void m104653a(C18922i iVar, String str, String str2) {
        boolean z;
        List<C19180e> list = iVar.f52131a;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.equalsIgnoreCase(((C19180e) it.next()).mo39131a())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            iVar.mo38778a(str, str2);
        }
    }

    public C48318e(C10766h hVar, JSONObject jSONObject, C10757a aVar, C48306a aVar2, C48308c cVar) {
        this.f121572b = hVar;
        this.f121573c = jSONObject;
        this.f121575e = aVar;
        this.f121576f = aVar2;
        this.f121577g = cVar;
        this.f121574d = new Handler(Looper.getMainLooper(), new C48323j(this));
    }

    /* renamed from: a */
    private static void m104655a(JSONObject jSONObject, int i, String str, String str2, String str3) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m104654a(JSONObject jSONObject, int i, int i2, String str, String str2, String str3) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m104655a(jSONObject2, i2, str, str2, str3);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
