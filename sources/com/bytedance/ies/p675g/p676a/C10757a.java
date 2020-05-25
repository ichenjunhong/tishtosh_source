package com.bytedance.ies.p675g.p676a;

import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.C2240a;
import com.example.p906a.C13482c;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.a.a */
public class C10757a implements C10763e {

    /* renamed from: a */
    public String f28927a = "_fetchQueue";

    /* renamed from: b */
    public String f28928b = "_handleMessageFromToutiao";

    /* renamed from: c */
    public String f28929c = "javascript:ToutiaoJSBridge";

    /* renamed from: d */
    public WebView f28930d;

    /* renamed from: e */
    public List<String> f28931e;

    /* renamed from: f */
    public List<String> f28932f;

    /* renamed from: g */
    public List<String> f28933g;

    /* renamed from: h */
    public boolean f28934h;

    /* renamed from: i */
    private String f28935i;

    /* renamed from: j */
    private Map<String, C10762d> f28936j = new HashMap();

    /* renamed from: k */
    private C10764f f28937k;

    /* renamed from: l */
    private Handler f28938l = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            if (message.obj instanceof C10766h) {
                C10757a.this.mo19453a((C10766h) message.obj);
            }
        }
    };

    /* renamed from: a */
    public final void mo19455a(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            m21805a(jSONObject2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo19454a(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str2);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            WebView webView = this.f28930d;
            if (webView != null) {
                C10767i.m21829a(webView, C2240a.m6772a("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", new Object[]{str, jSONObject2.toString(), str}));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo19456a(List<String> list, C10766h hVar, JSONObject jSONObject) {
        this.f28933g = list;
        if (!TextUtils.isEmpty(hVar.f28950g)) {
            mo19454a(hVar.f28950g, hVar.f28945b, jSONObject);
        } else {
            mo19455a(hVar.f28945b, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo19452a() {
        this.f28930d = null;
        if (this.f28938l != null) {
            this.f28938l.removeCallbacksAndMessages(null);
        }
        this.f28937k = null;
        this.f28936j = null;
    }

    /* renamed from: a */
    public final C10757a mo19448a(C10764f fVar) {
        this.f28937k = fVar;
        return this;
    }

    /* renamed from: b */
    public final C10757a mo19457b(List<String> list) {
        this.f28932f = list;
        return this;
    }

    /* renamed from: c */
    public final C10757a mo19460c(List<String> list) {
        this.f28933g = list;
        return this;
    }

    /* renamed from: a */
    public static C10757a m21804a(WebView webView) {
        return new C10757a(webView);
    }

    /* renamed from: a */
    public final C10757a mo19446a(WebChromeClient webChromeClient) {
        if (this.f28930d != null) {
            this.f28930d.setWebChromeClient(webChromeClient);
        }
        return this;
    }

    /* renamed from: a */
    public final C10757a mo19447a(WebViewClient webViewClient) {
        if (this.f28930d == null) {
            return this;
        }
        if (webViewClient instanceof C10761c) {
            ((C10761c) webViewClient).f28943b = this;
        }
        this.f28930d.setWebViewClient(C13482c.m27232a(webViewClient));
        return this;
    }

    /* renamed from: a */
    private void m21805a(JSONObject jSONObject) {
        WebView webView = this.f28930d;
        if (webView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28929c);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.f28928b);
            sb.append("(");
            sb.append(jSONObject.toString());
            sb.append(")");
            C10767i.m21829a(webView, sb.toString());
        }
    }

    private C10757a(WebView webView) {
        this.f28930d = webView;
        if (this.f28930d != null) {
            if ((this.f28930d instanceof C10760b) && !((C10760b) this.f28930d).f28941a) {
                this.f28930d.setWebChromeClient(new WebChromeClient());
            }
            try {
                this.f28930d.getSettings().setJavaScriptEnabled(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final C10757a mo19449a(String str) {
        this.f28935i = str;
        return this;
    }

    /* renamed from: b */
    public final boolean mo19459b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f28935i)) {
            return false;
        }
        if (!this.f28935i.equals(Uri.parse(str).getScheme().toLowerCase()) || !mo19461c(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo19461c(String str) {
        if (str == null || !str.startsWith(this.f28935i)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28935i);
        sb.append("://dispatch_message/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f28935i);
        sb3.append("://private/setresult/");
        String sb4 = sb3.toString();
        try {
            if (str.equals(sb2)) {
                WebView webView = this.f28930d;
                if (webView != null) {
                    if (VERSION.SDK_INT >= 19) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(this.f28929c);
                        sb5.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb5.append(this.f28927a);
                        sb5.append("()");
                        webView.evaluateJavascript(sb5.toString(), new ValueCallback<String>() {
                            public final /* synthetic */ void onReceiveValue(Object obj) {
                                String str = (String) obj;
                                C10757a aVar = C10757a.this;
                                try {
                                    StringBuilder sb = new StringBuilder("{a=");
                                    sb.append(str);
                                    sb.append("}");
                                    aVar.mo19462d(new JSONObject(sb.toString()).optString("a", ""));
                                } catch (JSONException unused) {
                                }
                            }
                        });
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(this.f28929c);
                        sb6.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb6.append(this.f28927a);
                        sb6.append("()");
                        C10767i.m21829a(webView, sb6.toString());
                    }
                }
                return true;
            }
            if (str.startsWith(sb4)) {
                if (VERSION.SDK_INT < 19) {
                    int length = sb4.length();
                    int indexOf = str.indexOf(38, length);
                    if (indexOf > 0) {
                        String substring = str.substring(length, indexOf);
                        String substring2 = str.substring(indexOf + 1);
                        if (substring.equals("SCENE_FETCHQUEUE") && substring2.length() > 0) {
                            try {
                                mo19462d(new String(Base64.decode(substring2, 2)));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo19462d(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C10766h hVar = new C10766h();
                hVar.f28944a = jSONObject.getString("__msg_type");
                String str2 = null;
                hVar.f28945b = jSONObject.optString("__callback_id", null);
                hVar.f28946c = jSONObject.optString("func");
                hVar.f28947d = jSONObject.optJSONObject("params");
                hVar.f28948e = jSONObject.optInt("JSSDK");
                hVar.f28949f = jSONObject.optString("namespace");
                hVar.f28950g = jSONObject.optString("__iframe_url");
                if (!TextUtils.isEmpty(hVar.f28944a) && !TextUtils.isEmpty(hVar.f28946c)) {
                    if (this.f28937k == null || !this.f28937k.mo19496a(hVar)) {
                        Message obtain = Message.obtain();
                        obtain.obj = hVar;
                        this.f28938l.sendMessage(obtain);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        WebView webView = this.f28930d;
                        if (webView != null) {
                            str2 = webView.getUrl();
                        }
                        this.f28937k.mo19495a(hVar, jSONObject2, str2, this);
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[Catch:{ Exception -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051 A[Catch:{ Exception -> 0x0082 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19463e(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "http://"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "https://"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0082 }
            r3 = 27
            if (r0 >= r3) goto L_0x003a
            r0 = 92
            int r0 = r7.indexOf(r0)     // Catch:{ Exception -> 0x0082 }
            r3 = -1
            if (r0 == r3) goto L_0x003a
            java.lang.String r7 = r7.substring(r2, r0)     // Catch:{ Exception -> 0x0082 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r7 = r7.getHost()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0042
        L_0x003a:
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r7 = r7.getHost()     // Catch:{ Exception -> 0x0082 }
        L_0x0042:
            if (r7 == 0) goto L_0x0081
            java.util.List<java.lang.String> r0 = r6.f28931e     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0081
            java.util.List<java.lang.String> r0 = r6.f28931e     // Catch:{ Exception -> 0x0082 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0082 }
            if (r0 == 0) goto L_0x0051
            goto L_0x0081
        L_0x0051:
            r0 = 0
        L_0x0052:
            java.util.List<java.lang.String> r3 = r6.f28931e     // Catch:{ Exception -> 0x0082 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x0082 }
            if (r0 >= r3) goto L_0x0082
            java.util.List<java.lang.String> r3 = r6.f28931e     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0082 }
            boolean r4 = r7.equals(r3)     // Catch:{ Exception -> 0x0082 }
            if (r4 != 0) goto L_0x0080
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            java.lang.String r5 = "."
            r4.<init>(r5)     // Catch:{ Exception -> 0x0082 }
            r4.append(r3)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0082 }
            boolean r3 = r7.endsWith(r3)     // Catch:{ Exception -> 0x0082 }
            if (r3 == 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            int r0 = r0 + 1
            goto L_0x0052
        L_0x0080:
            return r1
        L_0x0081:
            return r2
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p675g.p676a.C10757a.mo19463e(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C10757a mo19451a(List<String> list) {
        this.f28931e = list;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r0 != false) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19453a(com.bytedance.ies.p675g.p676a.C10766h r5) {
        /*
            r4 = this;
            android.webkit.WebView r0 = r4.f28930d
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            if (r5 == 0) goto L_0x00a8
            java.lang.String r1 = "call"
            java.lang.String r2 = r5.f28944a
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0013
            goto L_0x00a8
        L_0x0013:
            java.util.Map<java.lang.String, com.bytedance.ies.g.a.d> r1 = r4.f28936j
            if (r1 == 0) goto L_0x00a7
            java.util.Map<java.lang.String, com.bytedance.ies.g.a.d> r1 = r4.f28936j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00a7
            java.lang.String r0 = r0.getUrl()
            boolean r1 = r4.f28934h
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0055
            boolean r0 = r4.mo19463e(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = r5.f28946c
            java.util.List<java.lang.String> r1 = r4.f28932f
            if (r1 == 0) goto L_0x003f
            java.util.List<java.lang.String> r1 = r4.f28932f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = r5.f28946c
            java.util.List<java.lang.String> r1 = r4.f28933g
            if (r1 == 0) goto L_0x0052
            java.util.List<java.lang.String> r1 = r4.f28933g
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            if (r2 != 0) goto L_0x007a
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "code"
            r2 = -1
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r1 = r5.f28950g     // Catch:{ JSONException -> 0x0079 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0079 }
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = r5.f28950g     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r5 = r5.f28945b     // Catch:{ JSONException -> 0x0079 }
            r4.mo19454a(r1, r5, r0)     // Catch:{ JSONException -> 0x0079 }
            goto L_0x0079
        L_0x0073:
            java.lang.String r5 = r5.f28945b     // Catch:{ JSONException -> 0x0079 }
            r4.mo19455a(r5, r0)     // Catch:{ JSONException -> 0x0079 }
            return
        L_0x0079:
            return
        L_0x007a:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Map<java.lang.String, com.bytedance.ies.g.a.d> r1 = r4.f28936j     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = r5.f28946c     // Catch:{ Exception -> 0x008e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x008e }
            com.bytedance.ies.g.a.d r1 = (com.bytedance.ies.p675g.p676a.C10762d) r1     // Catch:{ Exception -> 0x008e }
            if (r1 == 0) goto L_0x008e
            r1.call(r5, r0)     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            boolean r1 = r5.f28951h
            if (r1 == 0) goto L_0x00a7
            java.lang.String r1 = r5.f28950g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r5.f28950g
            java.lang.String r5 = r5.f28945b
            r4.mo19454a(r1, r5, r0)
            return
        L_0x00a2:
            java.lang.String r5 = r5.f28945b
            r4.mo19455a(r5, r0)
        L_0x00a7:
            return
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p675g.p676a.C10757a.mo19453a(com.bytedance.ies.g.a.h):void");
    }

    /* renamed from: b */
    public final void mo19458b(String str, JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "event");
                jSONObject2.put("__event_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                m21805a(jSONObject2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C10757a mo19450a(String str, C10762d dVar) {
        if (TextUtils.isEmpty(str) || dVar == null) {
            return this;
        }
        this.f28936j.put(str, dVar);
        return this;
    }
}
