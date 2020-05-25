package com.p683ss.android.ugc.aweme.web.jsbridge.p2401a;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.api.Api.C22961d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.c */
public class C48311c implements C48310b {

    /* renamed from: a */
    public static final String f121545a = "c";

    /* renamed from: b */
    public C10757a f121546b;

    /* renamed from: c */
    public C48306a f121547c;

    /* renamed from: d */
    public C48308c f121548d;

    /* renamed from: e */
    public String f121549e;

    /* renamed from: f */
    public String f121550f;

    /* renamed from: g */
    public String f121551g;

    /* renamed from: h */
    public JSONObject f121552h;

    /* renamed from: i */
    public JSONObject f121553i;

    /* renamed from: j */
    public Exception f121554j = null;

    /* renamed from: k */
    private C10766h f121555k;

    /* renamed from: l */
    private JSONObject f121556l;

    /* renamed from: m */
    private Handler f121557m;

    /* renamed from: n */
    private C48362t f121558n;

    /* renamed from: o */
    private CommonApi f121559o = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class));

    /* renamed from: p */
    private List<C12685b> f121560p;

    /* renamed from: q */
    private String f121561q;

    /* renamed from: r */
    private Callable<JSONObject> f121562r = new Callable<JSONObject>() {
        public final /* synthetic */ Object call() throws Exception {
            return C48311c.this.mo95801e();
        }
    };

    /* renamed from: s */
    private Callable<JSONObject> f121563s = new Callable<JSONObject>() {
        public final /* synthetic */ Object call() throws Exception {
            return C48311c.this.mo95798b();
        }
    };

    /* renamed from: t */
    private Callable<JSONObject> f121564t = new Callable<JSONObject>() {
        public final /* synthetic */ Object call() throws Exception {
            return C48311c.this.mo95799c();
        }
    };

    /* renamed from: u */
    private Callable<JSONObject> f121565u = new Callable<JSONObject>() {
        public final /* synthetic */ Object call() throws Exception {
            return C48311c.this.mo95800d();
        }
    };

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        r8 = r2;
        r2 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r9.f121554j = r0;
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.put("code", 0);
        r1 = new org.json.JSONObject();
        r1.put("errCode", r0.getStatusCode());
        r1.put("message", r0.getMessage());
        r2.put("error", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[ExcHandler: b (r0v3 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:1:0x000d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo95798b() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f121550f
            org.json.JSONObject r1 = r9.f121552h
            java.lang.String r0 = r9.mo95797a(r0, r1)
            r9.f121550f = r0
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = r9.f121561q     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            r3 = 1
            if (r2 == 0) goto L_0x0022
            com.ss.android.ugc.aweme.utils.dg r2 = com.p683ss.android.ugc.aweme.utils.C47809dg.f120359a     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r4 = r9.f121550f     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            org.json.JSONObject r5 = r9.f121553i     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r6 = r9.f121561q     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.util.List<com.bytedance.retrofit2.a.b> r7 = r9.f121560p     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r2 = r2.mo95052b(r4, r5, r6, r7)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
        L_0x0020:
            r0 = r2
            goto L_0x0062
        L_0x0022:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            r2.<init>()     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            org.json.JSONObject r4 = r9.f121553i     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            if (r4 == 0) goto L_0x0049
            org.json.JSONObject r4 = r9.f121553i     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.util.Iterator r4 = r4.keys()     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
        L_0x0031:
            boolean r5 = r4.hasNext()     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            if (r5 == 0) goto L_0x0049
            java.lang.Object r5 = r4.next()     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            org.json.JSONObject r6 = r9.f121553i     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r7 = ""
            java.lang.String r6 = r6.optString(r5, r7)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            r2.put(r5, r6)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            goto L_0x0031
        L_0x0049:
            com.p683ss.android.common.applog.NetUtil.putCommonParams(r2, r3)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            com.ss.android.ugc.aweme.net.CommonApi r4 = r9.f121559o     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r5 = r9.f121550f     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            com.bytedance.retrofit2.b r2 = r4.doPost(r5, r2)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            com.bytedance.retrofit2.u r2 = r2.execute()     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            T r2 = r2.f33552b     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r0 = r9.f121550f     // Catch:{ b -> 0x009e, Exception -> 0x007c }
            com.p683ss.android.ugc.aweme.app.api.Api.m56468a(r2, r0)     // Catch:{ b -> 0x009e, Exception -> 0x007c }
            goto L_0x0020
        L_0x0062:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            r2.<init>()     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r4 = "code"
            r2.put(r4, r3)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r3 = "response"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            r4.<init>(r0)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            r2.put(r3, r4)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            java.lang.String r3 = "_raw"
            r2.put(r3, r0)     // Catch:{ b -> 0x009e, Exception -> 0x0081 }
            return r2
        L_0x007c:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0082
        L_0x0081:
            r2 = move-exception
        L_0x0082:
            r9.f121554j = r2
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r1 = "response"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009d }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x009d }
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x009d }
            java.lang.String r1 = "_raw"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x009d }
        L_0x009d:
            return r2
        L_0x009e:
            r0 = move-exception
            r9.f121554j = r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r1)     // Catch:{ JSONException -> 0x00c7 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c7 }
            r1.<init>()     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r3 = "errCode"
            int r4 = r0.getStatusCode()     // Catch:{ JSONException -> 0x00c7 }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r3 = "message"
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x00c7 }
            r1.put(r3, r0)     // Catch:{ JSONException -> 0x00c7 }
            java.lang.String r0 = "error"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00c7 }
        L_0x00c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48311c.mo95798b():org.json.JSONObject");
    }

    /* renamed from: c */
    public final JSONObject mo95799c() {
        String a;
        this.f121550f = mo95797a(this.f121550f, this.f121552h);
        String str = "";
        try {
            if (this.f121561q != null) {
                a = C47809dg.f120359a.mo95051a(this.f121550f, this.f121553i, this.f121561q, this.f121560p);
            } else {
                a = C47809dg.f120359a.mo95051a(this.f121550f, this.f121553i, "application/x-www-form-urlencoded", this.f121560p);
            }
            String str2 = a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("response", new JSONObject(str2));
            jSONObject.put("_raw", str2);
            return jSONObject;
        } catch (C19174b e) {
            this.f121554j = e;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("code", 0);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("errCode", e.getStatusCode());
                jSONObject3.put("message", e.getMessage());
                jSONObject2.put("error", jSONObject3);
            } catch (JSONException unused) {
            }
            return jSONObject2;
        } catch (Exception e2) {
            this.f121554j = e2;
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("code", 0);
                jSONObject4.put("response", new JSONObject(str));
                jSONObject4.put("_raw", str);
            } catch (JSONException unused2) {
            }
            return jSONObject4;
        }
    }

    /* renamed from: d */
    public final JSONObject mo95800d() {
        this.f121550f = mo95797a(this.f121550f, this.f121552h);
        try {
            String str = this.f121550f;
            if (C48317d.m104650a(C11010c.m22280a())) {
                ArrayList arrayList = new ArrayList();
                if (!C23715d.m58202a((Collection<T>) this.f121560p)) {
                    for (C12685b bVar : this.f121560p) {
                        arrayList.add(new C12685b(bVar.f33318a, bVar.f33319b));
                    }
                }
                String str2 = (String) Api.m56467a((String) this.f121559o.doDelete(str, 0, arrayList).execute().f33552b, C22961d.m56475a(), null, str);
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("_raw", str2);
                return jSONObject;
            }
            throw new IOException();
        } catch (C19174b e) {
            this.f121554j = e;
            JSONObject jSONObject2 = new JSONObject();
            m104642a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (C23459a e2) {
            this.f121554j = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m104642a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f121554j = e3;
            JSONObject jSONObject4 = new JSONObject();
            m104642a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* renamed from: e */
    public final JSONObject mo95801e() {
        this.f121550f = mo95797a(this.f121550f, this.f121552h);
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f121560p != null) {
                for (C12685b bVar : this.f121560p) {
                    arrayList.add(new C12685b(bVar.f33318a, bVar.f33319b));
                }
            }
            String str = (String) this.f121559o.doGet(this.f121550f, null, (List<C12685b>) arrayList).execute().f33552b;
            JSONObject jSONObject = new JSONObject(str);
            Api.m56469a(jSONObject, str, this.f121550f);
            jSONObject.put("_raw", str);
            return jSONObject;
        } catch (C19174b e) {
            this.f121554j = e;
            JSONObject jSONObject2 = new JSONObject();
            m104642a(jSONObject2, 0, e.getStatusCode(), e.getMessage(), "", "");
            return jSONObject2;
        } catch (C23459a e2) {
            this.f121554j = e2;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("_raw", e2.getResponse());
            } catch (JSONException unused) {
            }
            m104642a(jSONObject3, 0, e2.getErrorCode(), e2.getErrorMsg(), e2.getPrompt(), "");
            return jSONObject3;
        } catch (Exception e3) {
            this.f121554j = e3;
            JSONObject jSONObject4 = new JSONObject();
            m104642a(jSONObject4, 0, -408, e3.getMessage(), "", "");
            return jSONObject4;
        }
    }

    /* renamed from: a */
    public final void mo95796a() {
        C10766h hVar = this.f121555k;
        JSONObject jSONObject = this.f121556l;
        this.f121549e = hVar.f28945b;
        JSONObject jSONObject2 = hVar.f28947d;
        this.f121550f = jSONObject2.optString("url", "");
        this.f121551g = jSONObject2.optString("method", "get");
        this.f121552h = jSONObject2.optJSONObject("params");
        this.f121553i = jSONObject2.optJSONObject("data");
        JSONObject optJSONObject = jSONObject2.optJSONObject("header");
        if (optJSONObject != null) {
            this.f121560p = new ArrayList();
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                String optString = optJSONObject.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    this.f121560p.add(new C12685b(str, optString));
                    if ("content-type".equalsIgnoreCase(str)) {
                        this.f121561q = optString;
                    }
                }
            }
        }
        this.f121558n = C48347g.m104665a();
        if ("get".equalsIgnoreCase(this.f121551g)) {
            C23566n.m57766a().mo48750a(this.f121557m, this.f121562r, 25);
        } else if ("post".equalsIgnoreCase(this.f121551g)) {
            C23566n.m57766a().mo48750a(this.f121557m, this.f121563s, 32);
        } else if ("put".equalsIgnoreCase(this.f121551g)) {
            C23566n.m57766a().mo48750a(this.f121557m, this.f121564t, 33);
        } else {
            if ("delete".equalsIgnoreCase(this.f121551g)) {
                C23566n.m57766a().mo48750a(this.f121557m, this.f121565u, 34);
            }
        }
    }

    /* renamed from: a */
    private void m104640a(C18922i iVar) {
        if (this.f121558n != null) {
            Map a = this.f121558n.mo56382a();
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

    /* renamed from: a */
    public final String mo95797a(String str, JSONObject jSONObject) {
        C18922i iVar = new C18922i(str);
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                iVar.mo38778a(str2, jSONObject.optString(str2, ""));
            }
        }
        m104640a(iVar);
        m104641a(iVar, "request_tag_from", "h5");
        return iVar.mo38774a();
    }

    /* renamed from: a */
    private static void m104641a(C18922i iVar, String str, String str2) {
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

    public C48311c(C10766h hVar, JSONObject jSONObject, C10757a aVar, C48306a aVar2, C48308c cVar) {
        this.f121555k = hVar;
        this.f121556l = jSONObject;
        this.f121546b = aVar;
        this.f121547c = aVar2;
        this.f121548d = cVar;
        this.f121557m = new Handler(Looper.getMainLooper(), new Callback() {
            public final boolean handleMessage(Message message) {
                if (message.what == 25 || message.what == 32 || message.what == 33 || message.what == 34) {
                    if (message.obj == null) {
                        return true;
                    }
                    try {
                        JSONObject jSONObject = (JSONObject) message.obj;
                        if (C48311c.this.f121548d != null) {
                            C48307b bVar = new C48307b(C48311c.this.f121551g, C48311c.this.mo95797a(C48311c.this.f121550f, C48311c.this.f121552h), C48311c.this.f121553i);
                            JSONObject jSONObject2 = null;
                            if (jSONObject != null && jSONObject.has("response")) {
                                jSONObject2 = jSONObject.optJSONObject("response");
                            }
                            C48311c.this.f121548d.mo49921a(bVar, new C48309d(jSONObject2, C48311c.this.f121554j));
                        }
                        if (C48311c.this.f121546b != null && !TextUtils.isEmpty(C48311c.this.f121549e)) {
                            C48311c.this.f121546b.mo19455a(C48311c.this.f121549e, jSONObject);
                        } else if (C48311c.this.f121547c != null) {
                            C48311c.this.f121547c.mo49920a(jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    private static void m104643a(JSONObject jSONObject, int i, String str, String str2, String str3) {
        try {
            jSONObject.put("errCode", i);
            jSONObject.put("message", str);
            jSONObject.put("prompts", str2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private void m104642a(JSONObject jSONObject, int i, int i2, String str, String str2, String str3) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            m104643a(jSONObject2, i2, str, str2, str3);
            jSONObject.put("response", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
