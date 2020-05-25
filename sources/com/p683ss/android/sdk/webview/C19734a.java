package com.p683ss.android.sdk.webview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10763e;
import com.bytedance.ies.p675g.p676a.C10764f;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.p675g.p677b.C10805r;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.sdk.webview.C19768o.C19770a;
import com.p683ss.android.sdk.webview.p1210b.C19739a;
import com.p683ss.android.sdk.webview.p1210b.C19739a.C19740a;
import com.p683ss.android.sdk.webview.p1210b.C19741b;
import com.p683ss.android.sdk.webview.p1210b.C19742c;
import com.p683ss.android.sdk.webview.p1210b.C19743d;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.sdk.webview.p1210b.C19747g;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.sdk.webview.a */
public abstract class C19734a implements C9382a, C10764f, C19740a, C19770a {

    /* renamed from: a */
    protected C19750e f54374a;

    /* renamed from: b */
    protected WeakReference<C11104b> f54375b;

    /* renamed from: c */
    protected WeakReference<Context> f54376c;

    /* renamed from: d */
    protected List<String> f54377d;

    /* renamed from: e */
    protected C10763e f54378e;

    /* renamed from: f */
    protected List<String> f54379f;

    /* renamed from: g */
    protected long f54380g;

    /* renamed from: h */
    protected String f54381h;

    /* renamed from: i */
    protected int f54382i;

    /* renamed from: j */
    protected String f54383j;

    /* renamed from: k */
    protected String f54384k;

    /* renamed from: l */
    public String f54385l;

    /* renamed from: m */
    public String f54386m;

    /* renamed from: n */
    public long f54387n;

    /* renamed from: o */
    protected String f54388o;

    /* renamed from: p */
    protected String f54389p;

    /* renamed from: q */
    public Boolean f54390q = Boolean.valueOf(true);

    /* renamed from: r */
    public C19743d f54391r;

    /* renamed from: s */
    private Handler f54392s = new C9381g(this);

    /* renamed from: t */
    private String f54393t;

    /* renamed from: u */
    private C10766h f54394u;

    /* renamed from: v */
    private C19772q f54395v = null;

    /* renamed from: w */
    private JSONArray f54396w = new JSONArray();

    /* renamed from: a */
    public static String m48231a() {
        return "bytedance";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo41158b(C19750e eVar, C19749d dVar);

    /* renamed from: a */
    public boolean mo41156a(String str) {
        if (this.f54374a == null) {
            return false;
        }
        C19750e eVar = this.f54374a;
        if (eVar.f54416b == null) {
            return false;
        }
        C10757a aVar = eVar.f54416b;
        if (aVar == null) {
            C52711k.m112234a();
        }
        return aVar.mo19463e(str);
    }

    /* renamed from: c */
    public List<String> mo41160c() {
        if (this.f54379f == null) {
            this.f54379f = new ArrayList();
        }
        return this.f54379f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Activity mo41161d() {
        Context context;
        if (this.f54376c != null) {
            context = (Context) this.f54376c.get();
        } else {
            context = null;
        }
        if (context != null && (context instanceof Activity)) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: e */
    public final void mo41162e() {
        C11104b bVar;
        if (this.f54375b != null) {
            bVar = (C11104b) this.f54375b.get();
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    /* renamed from: f */
    public final void mo41163f() {
        this.f54376c = null;
        if (this.f54374a != null) {
            C19750e eVar = this.f54374a;
            C10757a aVar = eVar.f54416b;
            if (aVar != null) {
                aVar.mo19452a();
            }
            C10805r rVar = eVar.f54417c;
            if (rVar != null) {
                rVar.mo19580a();
            }
            this.f54374a = null;
        }
        C19768o a = C19768o.m48296a();
        if (a.f54452d != null && !a.f54452d.isEmpty()) {
            a.f54452d.remove(this);
        }
        this.f54378e = null;
    }

    /* renamed from: b */
    public List<String> mo41157b() {
        if (this.f54377d == null) {
            this.f54377d = new ArrayList();
        }
        this.f54377d.add("openConfig");
        this.f54377d.add("config");
        this.f54377d.add("appInfo");
        this.f54377d.add("login");
        this.f54377d.add("close");
        this.f54377d.add("gallery");
        this.f54377d.add("toggleGalleryBars");
        this.f54377d.add("slideShow");
        this.f54377d.add("relatedShow");
        this.f54377d.add("toast");
        this.f54377d.add("slideDownload");
        this.f54377d.add("requestChangeOrientation");
        this.f54377d.add("adInfo");
        return this.f54377d;
    }

    /* renamed from: b */
    public final void mo41159b(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            reportLocalEvent(str);
        }
    }

    /* renamed from: c */
    private static boolean mo95779c(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public C19734a(Context context) {
        this.f54376c = new WeakReference<>(context);
        C19768o a = C19768o.m48296a();
        if (a.f54452d == null) {
            a.f54452d = new ArrayList();
        }
        if (!a.f54452d.contains(this)) {
            a.f54452d.add(this);
        }
    }

    /* renamed from: a */
    public final boolean mo19496a(C10766h hVar) {
        if (!"call".equals(hVar.f28944a) || !"config".equals(hVar.f28946c) || C9431p.m18664a(hVar.f28945b)) {
            return false;
        }
        return true;
    }

    @JavascriptInterface
    public boolean reportLocalEvent(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        boolean z = true;
        try {
            Uri parse = Uri.parse(str);
            if (!"log_event".equals(parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.f54392s.obtainMessage(1);
                obtainMessage.obj = parse;
                this.f54392s.sendMessage(obtainMessage);
            } catch (Exception unused) {
            }
            return z;
        } catch (Exception unused2) {
            z = false;
        }
    }

    public void handleMsg(Message message) {
        long j;
        long j2;
        JSONObject jSONObject;
        if (message.what == 1) {
            try {
                if (message.obj instanceof Uri) {
                    Uri uri = (Uri) message.obj;
                    if ("log_event".equals(uri.getHost())) {
                        String queryParameter = uri.getQueryParameter("category");
                        String queryParameter2 = uri.getQueryParameter("tag");
                        String queryParameter3 = uri.getQueryParameter("label");
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                            j2 = 0;
                        }
                        String queryParameter4 = uri.getQueryParameter("extra");
                        if (!C9431p.m18664a(queryParameter4)) {
                            try {
                                jSONObject = new JSONObject(queryParameter4);
                            } catch (Exception unused3) {
                            }
                            C18898c.m46012a((Context) this.f54376c.get(), queryParameter, queryParameter2, queryParameter3, j, j2, jSONObject);
                        }
                        jSONObject = null;
                        C18898c.m46012a((Context) this.f54376c.get(), queryParameter, queryParameter2, queryParameter3, j, j2, jSONObject);
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    /* renamed from: a */
    public void mo41155a(JSONObject jSONObject) throws Exception {
        int i;
        if (!TextUtils.equals(this.f54388o, "1") || TextUtils.isEmpty(this.f54389p)) {
            jSONObject.put("cid", this.f54380g);
            jSONObject.put("group_id", this.f54387n);
            jSONObject.put("ad_type", this.f54382i);
            jSONObject.put("log_extra", this.f54383j);
            jSONObject.put("download_url", this.f54384k);
            jSONObject.put("package_name", this.f54385l);
            jSONObject.put("app_name", this.f54386m);
            String str = "code";
            if (this.f54380g == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put(str, i);
        } else {
            JSONObject jSONObject2 = new JSONObject(this.f54389p);
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String str2 = (String) keys.next();
                    jSONObject.put(str2, jSONObject2.opt(str2));
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41154a(String str, JSONObject jSONObject) {
        if (this.f54374a != null) {
            C10757a aVar = this.f54374a.f54416b;
            if (aVar != null) {
                aVar.mo19458b(str, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo41151a(C19750e eVar, C19749d dVar) {
        this.f54374a = eVar;
        if (this.f54374a != null) {
            C19750e eVar2 = this.f54374a;
            this.f54391r = new C19743d(eVar2.f54416b, mo41161d());
            eVar2.mo41185a("isAppInstalled", (C10762d) new C19741b(this.f54376c)).mo41185a("open", (C10762d) new C19746f(this.f54376c)).mo41185a("login", (C10762d) this.f54391r).mo41185a("copyToClipboard", (C10762d) new C19742c(mo41161d())).mo41185a("adInfo", (C10762d) new C19739a(this)).mo41185a("openThirdApp", (C10762d) new C19747g(mo41161d()));
            mo41158b(this.f54374a, dVar);
        }
    }

    /* renamed from: a */
    public final void mo41152a(final String str, final Callback callback) {
        C11104b bVar;
        if (this.f54390q.booleanValue() && !C9431p.m18664a(str) && callback != null) {
            Activity d = mo41161d();
            if (d != null) {
                if (this.f54375b != null) {
                    bVar = (C11104b) this.f54375b.get();
                } else {
                    bVar = null;
                }
                if (bVar != null && bVar.isShowing()) {
                    bVar.dismiss();
                }
                C11105a aVar = new C11105a(d);
                aVar.mo20135a((int) R.string.b8c);
                aVar.mo20146b((CharSequence) d.getString(R.string.b8b, new Object[]{str}));
                C197351 r0 = new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == -2) {
                            callback.invoke(str, false, false);
                            dialogInterface.dismiss();
                            return;
                        }
                        if (i == -1) {
                            callback.invoke(str, true, true);
                            dialogInterface.dismiss();
                        }
                    }
                };
                aVar.mo20145b((int) R.string.b8a, (OnClickListener) r0);
                aVar.mo20136a((int) R.string.b8_, (OnClickListener) r0);
                aVar.mo20141a(false);
                this.f54375b = new WeakReference<>(aVar.mo20148b());
            }
        }
    }

    /* renamed from: a */
    public final void mo41153a(String str, C19772q qVar, String str2) {
        WebView webView;
        String str3;
        int i;
        List list;
        if (str != null && str.equals(this.f54393t) && this.f54394u != null) {
            if (this.f54374a != null) {
                webView = this.f54374a.f54420f;
            } else {
                webView = null;
            }
            if (webView != null) {
                str3 = webView.getUrl();
            } else {
                str3 = null;
            }
            if (!C9431p.m18664a(str3) && mo95779c(str3)) {
                try {
                    String host = Uri.parse(str3).getHost();
                    if (host != null && host.equals(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        String str4 = "code";
                        if (qVar != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put(str4, i);
                        if (qVar != null) {
                            list = qVar.f54459e;
                        } else {
                            list = null;
                        }
                        if (this.f54378e != null) {
                            this.f54378e.mo19456a(list, this.f54394u, jSONObject);
                        }
                        this.f54395v = qVar;
                        this.f54393t = null;
                        this.f54394u = null;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9 A[Catch:{ Exception -> 0x0102 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19495a(com.bytedance.ies.p675g.p676a.C10766h r20, org.json.JSONObject r21, java.lang.String r22, com.bytedance.ies.p675g.p676a.C10763e r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r0.f54378e = r3     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.g.a.e r3 = r0.f54378e     // Catch:{ Exception -> 0x0102 }
            if (r3 == 0) goto L_0x0101
            org.json.JSONObject r3 = r1.f28947d     // Catch:{ Exception -> 0x0102 }
            r4 = 0
            r0.f54393t = r4     // Catch:{ Exception -> 0x0102 }
            r0.f54394u = r4     // Catch:{ Exception -> 0x0102 }
            if (r3 == 0) goto L_0x002d
            java.lang.String r5 = "client_id"
            boolean r5 = r3.has(r5)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = "client_id"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Exception -> 0x0102 }
            goto L_0x002e
        L_0x0026:
            java.lang.String r5 = "clientID"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Exception -> 0x0102 }
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x0102 }
            r6 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.String r3 = "code"
            r2.put(r3, r6)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.g.a.e r3 = r0.f54378e     // Catch:{ Exception -> 0x0102 }
            r3.mo19456a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x0041:
            boolean r5 = com.bytedance.common.utility.C9431p.m18664a(r22)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x0053
            java.lang.String r3 = "code"
            r2.put(r3, r6)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.g.a.e r3 = r0.f54378e     // Catch:{ Exception -> 0x0102 }
            r3.mo19456a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x0053:
            android.net.Uri r5 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x005f }
            r7 = r5
            r5 = r22
            goto L_0x0062
        L_0x005f:
            r5 = r22
            r7 = r4
        L_0x0062:
            boolean r8 = r0.mo41156a(r5)     // Catch:{ Exception -> 0x0102 }
            r9 = 1
            if (r8 == 0) goto L_0x0075
            java.lang.String r3 = "code"
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.g.a.e r3 = r0.f54378e     // Catch:{ Exception -> 0x0102 }
            r3.mo19456a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x0075:
            boolean r5 = mo95779c(r22)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x0101
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f54376c     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00d2
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f54376c     // Catch:{ Exception -> 0x0102 }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0102 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00d2
            com.ss.android.sdk.webview.o r8 = com.p683ss.android.sdk.webview.C19768o.m48296a()     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r10 = com.p683ss.android.sdk.webview.C19772q.m48303a(r7, r3)     // Catch:{ Exception -> 0x0102 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0102 }
            if (r11 == 0) goto L_0x009d
            com.ss.android.sdk.webview.q r5 = r8.f54450b     // Catch:{ Exception -> 0x0102 }
            r11 = r5
            goto L_0x00d3
        L_0x009d:
            com.bytedance.common.utility.b.c<java.lang.String, com.ss.android.sdk.webview.q> r11 = r8.f54449a     // Catch:{ Exception -> 0x0102 }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ Exception -> 0x0102 }
            com.ss.android.sdk.webview.q r11 = (com.p683ss.android.sdk.webview.C19772q) r11     // Catch:{ Exception -> 0x0102 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0102 }
            boolean r5 = com.p683ss.android.sdk.webview.C19771p.m48302a(r5)     // Catch:{ Exception -> 0x0102 }
            if (r11 == 0) goto L_0x00cb
            long r14 = r11.f54458d     // Catch:{ Exception -> 0x0102 }
            r16 = 0
            long r14 = r12 - r14
            r16 = 600000(0x927c0, double:2.964394E-318)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 < 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00cb
            long r14 = r11.f54458d     // Catch:{ Exception -> 0x0102 }
            r16 = 0
            long r12 = r12 - r14
            r14 = 1200000(0x124f80, double:5.92879E-318)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            if (r5 == 0) goto L_0x00d2
            com.ss.android.download.a.c<java.lang.String, java.lang.String, java.lang.String, java.lang.Void, com.ss.android.sdk.webview.q> r5 = r8.f54451c     // Catch:{ Exception -> 0x0102 }
            r5.mo39005a(r10, r7, r3, r4)     // Catch:{ Exception -> 0x0102 }
        L_0x00d2:
            r11 = r4
        L_0x00d3:
            if (r11 != 0) goto L_0x00ea
            android.app.Activity r5 = r19.mo41161d()     // Catch:{ Exception -> 0x0102 }
            boolean r5 = com.p683ss.android.sdk.webview.C19738b.m48252a(r5)     // Catch:{ Exception -> 0x0102 }
            if (r5 != 0) goto L_0x00ea
            java.lang.String r3 = "code"
            r2.put(r3, r6)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.g.a.e r3 = r0.f54378e     // Catch:{ Exception -> 0x0102 }
            r3.mo19456a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x00ea:
            if (r11 == 0) goto L_0x00f9
            java.lang.String r3 = "code"
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.g.a.e r3 = r0.f54378e     // Catch:{ Exception -> 0x0102 }
            java.util.List<java.lang.String> r4 = r11.f54459e     // Catch:{ Exception -> 0x0102 }
            r3.mo19456a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x00f9:
            java.lang.String r2 = com.p683ss.android.sdk.webview.C19772q.m48303a(r7, r3)     // Catch:{ Exception -> 0x0102 }
            r0.f54393t = r2     // Catch:{ Exception -> 0x0102 }
            r0.f54394u = r1     // Catch:{ Exception -> 0x0102 }
        L_0x0101:
            return
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.sdk.webview.C19734a.mo19495a(com.bytedance.ies.g.a.h, org.json.JSONObject, java.lang.String, com.bytedance.ies.g.a.e):void");
    }

    /* renamed from: a */
    public final void mo41150a(long j, String str, int i, String str2, String str3, String str4, String str5) {
        this.f54380g = j;
        this.f54381h = str;
        this.f54382i = i;
        this.f54383j = str2;
        this.f54384k = str3;
        this.f54388o = str4;
        this.f54389p = str5;
    }
}
