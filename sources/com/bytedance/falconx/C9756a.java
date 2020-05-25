package com.bytedance.falconx;

import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.falconx.p561a.C9762a;
import com.bytedance.falconx.p561a.C9763b;
import com.bytedance.falconx.p561a.C9764c;
import com.bytedance.falconx.p562b.C9768a;
import com.bytedance.falconx.statistic.C9769a;
import com.bytedance.falconx.statistic.C9771b;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.falconx.statistic.StatisticData;
import com.bytedance.geckox.utils.C10151a;
import com.bytedance.geckox.utils.C10162j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.falconx.a */
public final class C9756a {

    /* renamed from: a */
    C9765b f26549a;

    /* renamed from: b */
    public boolean f26550b = true;

    /* renamed from: c */
    private List<C9764c> f26551c = new ArrayList();

    /* renamed from: a */
    public final void mo17584a(InterceptorModel interceptorModel) {
        C9771b a = C9771b.m19560a(this.f26549a.f26574a);
        a.f26592d.execute(new Runnable(interceptorModel) {

            /* renamed from: a */
            final /* synthetic */ InterceptorModel f26597a;

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00c1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r8 = this;
                    com.bytedance.falconx.statistic.b r0 = com.bytedance.falconx.statistic.C9771b.this     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.a.a r0 = r0.f26593e     // Catch:{ Exception -> 0x00f3 }
                    android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r1 = "select count(*) from STATISTIC"
                    r2 = 0
                    android.database.Cursor r0 = r0.rawQuery(r1, r2)     // Catch:{ Exception -> 0x00f3 }
                    r1 = 0
                    if (r0 == 0) goto L_0x001c
                    boolean r3 = r0.moveToFirst()     // Catch:{ Exception -> 0x00f3 }
                    if (r3 == 0) goto L_0x001c
                    int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x00f3 }
                L_0x001c:
                    com.bytedance.geckox.utils.C10152b.m20476a(r0)     // Catch:{ Exception -> 0x00f3 }
                    int r1 = r1 + 1
                    r0 = 20
                    if (r1 < r0) goto L_0x00cf
                    com.bytedance.falconx.statistic.b r0 = com.bytedance.falconx.statistic.C9771b.this     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.a.a r0 = r0.f26593e     // Catch:{ Exception -> 0x00f3 }
                    java.util.List r0 = r0.mo17612a()     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.InterceptorModel r1 = r8.f26597a     // Catch:{ Exception -> 0x00f3 }
                    r0.add(r1)     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.b r1 = com.bytedance.falconx.statistic.C9771b.this     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r3 = com.bytedance.falconx.statistic.C9771b.f26589b     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r4 = com.bytedance.falconx.statistic.C9771b.f26590c     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r5 = com.bytedance.falconx.statistic.C9771b.f26588a     // Catch:{ Exception -> 0x00c1 }
                    boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00c1 }
                    if (r6 == 0) goto L_0x0042
                    goto L_0x00c1
                L_0x0042:
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r7 = "https://"
                    r6.<init>(r7)     // Catch:{ Exception -> 0x00c1 }
                    r6.append(r5)     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r5 = "/gecko/server/falcon/stats"
                    r6.append(r5)     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x00c1 }
                    com.bytedance.falconx.statistic.StatisticData r6 = new com.bytedance.falconx.statistic.StatisticData     // Catch:{ Exception -> 0x00c1 }
                    r6.<init>()     // Catch:{ Exception -> 0x00c1 }
                    r6.offline = r0     // Catch:{ Exception -> 0x00c1 }
                    com.bytedance.falconx.statistic.Common r7 = new com.bytedance.falconx.statistic.Common     // Catch:{ Exception -> 0x00c1 }
                    r7.<init>()     // Catch:{ Exception -> 0x00c1 }
                    r6.mCommon = r7     // Catch:{ Exception -> 0x00c1 }
                    com.bytedance.falconx.statistic.Common r7 = r6.mCommon     // Catch:{ Exception -> 0x00c1 }
                    r7.appVersion = r3     // Catch:{ Exception -> 0x00c1 }
                    com.bytedance.falconx.statistic.Common r3 = r6.mCommon     // Catch:{ Exception -> 0x00c1 }
                    r3.deviceId = r4     // Catch:{ Exception -> 0x00c1 }
                    java.util.UUID r3 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c1 }
                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00c1 }
                L_0x0077:
                    boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x00c1 }
                    if (r4 == 0) goto L_0x0088
                    java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x00c1 }
                    com.bytedance.falconx.statistic.InterceptorModel r4 = (com.bytedance.falconx.statistic.InterceptorModel) r4     // Catch:{ Exception -> 0x00c1 }
                    r4.startTime = r2     // Catch:{ Exception -> 0x00c1 }
                    r4.logId = r3     // Catch:{ Exception -> 0x00c1 }
                    goto L_0x0077
                L_0x0088:
                    java.lang.String r0 = "application/json; charset=utf-8"
                    okhttp3.w r0 = okhttp3.C53678w.m114225a(r0)     // Catch:{ Exception -> 0x00c1 }
                    com.google.gson.f r3 = new com.google.gson.f     // Catch:{ Exception -> 0x00c1 }
                    r3.<init>()     // Catch:{ Exception -> 0x00c1 }
                    java.lang.String r3 = r3.mo34889b(r6)     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.ac r0 = okhttp3.C53500ac.create(r0, r3)     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.ab$a r3 = new okhttp3.ab$a     // Catch:{ Exception -> 0x00c1 }
                    r3.<init>()     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.ab$a r3 = r3.mo111262a(r5)     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.ab$a r0 = r3.mo111265a(r0)     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.ab r0 = r0.mo111272c()     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.y$a r3 = new okhttp3.y$a     // Catch:{ Exception -> 0x00c1 }
                    r3.<init>()     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.y r3 = r3.mo111667a()     // Catch:{ Exception -> 0x00c1 }
                    okhttp3.e r0 = r3.mo111325a(r0)     // Catch:{ Exception -> 0x00c1 }
                    com.bytedance.falconx.statistic.b$4 r3 = new com.bytedance.falconx.statistic.b$4     // Catch:{ Exception -> 0x00c1 }
                    r3.<init>()     // Catch:{ Exception -> 0x00c1 }
                    r0.mo111246a(r3)     // Catch:{ Exception -> 0x00c1 }
                L_0x00c1:
                    com.bytedance.falconx.statistic.b r0 = com.bytedance.falconx.statistic.C9771b.this     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.a.a r0 = r0.f26593e     // Catch:{ Exception -> 0x00f3 }
                    android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r1 = "STATISTIC"
                    r0.delete(r1, r2, r2)     // Catch:{ Exception -> 0x00f3 }
                    return
                L_0x00cf:
                    com.bytedance.falconx.statistic.b r0 = com.bytedance.falconx.statistic.C9771b.this     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.a.a r0 = r0.f26593e     // Catch:{ Exception -> 0x00f3 }
                    com.bytedance.falconx.statistic.InterceptorModel r1 = r8.f26597a     // Catch:{ Exception -> 0x00f3 }
                    android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Exception -> 0x00f3 }
                    r3.<init>()     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r4 = "INFO"
                    com.bytedance.geckox.d.b r5 = com.bytedance.geckox.p599d.C10064b.m20295a()     // Catch:{ Exception -> 0x00f3 }
                    com.google.gson.f r5 = r5.f27360a     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r1 = r5.mo34889b(r1)     // Catch:{ Exception -> 0x00f3 }
                    r3.put(r4, r1)     // Catch:{ Exception -> 0x00f3 }
                    android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ Exception -> 0x00f3 }
                    java.lang.String r1 = "STATISTIC"
                    r0.insert(r1, r2, r3)     // Catch:{ Exception -> 0x00f3 }
                    return
                L_0x00f3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.falconx.statistic.C9771b.C97743.run():void");
            }

            {
                this.f26597a = r2;
            }
        });
    }

    public C9756a(C9765b bVar) {
        String str;
        if (bVar != null) {
            this.f26549a = bVar;
            C9771b.f26589b = C10151a.m20473a(bVar.f26574a);
            C9771b.f26590c = bVar.f26578e;
            for (Uri uri : this.f26549a.f26577d) {
                String scheme = uri.getScheme();
                if (scheme == null) {
                    str = "";
                } else {
                    str = scheme.toLowerCase();
                }
                if ("".equals(str) || "file".equals(str)) {
                    this.f26551c.add(new C9763b(bVar.f26574a, bVar.f26575b, new File(uri.getPath())));
                } else if ("asset".equals(str)) {
                    String path = uri.getPath();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    this.f26551c.add(new C9762a(bVar.f26574a, new File(path)));
                } else {
                    new StringBuilder("unknow scheme:").append(uri);
                }
            }
            return;
        }
        throw new IllegalArgumentException("config == null");
    }

    /* renamed from: a */
    private void m19537a(final InterceptorModel interceptorModel, WebResourceResponse webResourceResponse) {
        InputStream data = webResourceResponse.getData();
        if (data != null) {
            webResourceResponse.setData(new C9769a(data) {
                public final void close() throws IOException {
                    super.close();
                    interceptorModel.loadFinish(true);
                    C9756a.this.mo17584a(interceptorModel);
                }

                /* renamed from: a */
                public final void mo17587a(IOException iOException) {
                    super.mo17587a(iOException);
                    interceptorModel.setErrorCode(StatisticData.ERROR_CODE_IO_ERROR);
                    interceptorModel.setErrorMsg(iOException.getMessage());
                    interceptorModel.loadFinish(false);
                    C9756a.this.mo17584a(interceptorModel);
                }
            });
        }
    }

    /* renamed from: a */
    public final WebResourceResponse mo17583a(WebView webView, String str) {
        try {
            List<Pattern> list = this.f26549a.f26576c;
            if (this.f26550b && list != null && !list.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    InterceptorModel interceptorModel = new InterceptorModel();
                    interceptorModel.url = str;
                    WebResourceResponse a = m19534a(webView, str, interceptorModel);
                    if (a == null) {
                        interceptorModel.setResRootDir(null);
                        if (interceptorModel.offlineRule != null) {
                            mo17585a(interceptorModel, webView, str, 5);
                        }
                    }
                    return a;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static WebResourceResponse m19535a(String str, String str2, InputStream inputStream) {
        HashMap hashMap = new HashMap();
        hashMap.put("Access-Control-Allow-Origin", "*");
        if (VERSION.SDK_INT < 21 || !"font/ttf".equals(str)) {
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            if (VERSION.SDK_INT < 21) {
                return webResourceResponse;
            }
            webResourceResponse.setResponseHeaders(hashMap);
            return webResourceResponse;
        }
        WebResourceResponse webResourceResponse2 = new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
        return webResourceResponse2;
    }

    /* renamed from: a */
    private WebResourceResponse m19534a(final WebView webView, String str, final InterceptorModel interceptorModel) throws Exception {
        String str2;
        interceptorModel.f26585ac = C10162j.m20488a(this.f26549a.f26574a);
        interceptorModel.accessKey = this.f26549a.f26575b;
        if (webView != null) {
            webView.post(new Runnable() {
                public final void run() {
                    try {
                        interceptorModel.pageUrl = webView.getUrl();
                    } catch (Exception unused) {
                    }
                }
            });
        }
        for (Pattern pattern : this.f26549a.f26576c) {
            if (pattern != null) {
                WebResourceResponse a = m19536a(pattern, str, interceptorModel);
                if (a != null) {
                    m19537a(interceptorModel, a);
                    return a;
                }
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    interceptorModel.offlineRule = pattern.pattern();
                    int indexOf = str.indexOf("?");
                    int indexOf2 = str.indexOf("#");
                    int min = Math.min(indexOf, indexOf2);
                    if (min == -1) {
                        min = Math.max(indexOf, indexOf2);
                    }
                    if (min != -1) {
                        str2 = str.substring(matcher.end(), min);
                    } else {
                        str2 = str.substring(matcher.end());
                    }
                    if (str2.endsWith("/")) {
                        str2 = str2.substring(0, str2.length() - 1);
                    }
                    if (str2.startsWith("/")) {
                        str2 = str2.substring(1);
                    }
                    for (C9764c cVar : this.f26551c) {
                        try {
                            InputStream a2 = cVar.mo17592a(str2);
                            interceptorModel.resRootDir = cVar.mo17593a();
                            Map b = cVar.mo17594b();
                            String substring = str2.substring(0, str2.indexOf("/"));
                            interceptorModel.channel = substring;
                            interceptorModel.pkgVersion = (Long) b.get(substring);
                            WebResourceResponse a3 = m19535a("", "", a2);
                            m19537a(interceptorModel, a3);
                            return a3;
                        } catch (FileNotFoundException unused) {
                            new StringBuilder("tryLoadLocalResource:文件未找到: path:").append(str2);
                        } catch (Exception unused2) {
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        interceptorModel.setErrorCode(StatisticData.ERROR_CODE_NOT_FOUND);
        interceptorModel.loadFinish(false);
        return null;
    }

    /* renamed from: a */
    private WebResourceResponse m19536a(Pattern pattern, String str, InterceptorModel interceptorModel) {
        StringBuilder sb = new StringBuilder();
        sb.append(pattern.pattern());
        sb.append("??");
        Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        interceptorModel.offlineRule = pattern.pattern();
        int indexOf = str.indexOf("??");
        if (indexOf <= 0) {
            return null;
        }
        String substring = str.substring(matcher.end() + 1, indexOf);
        String[] split = str.substring(indexOf + 2).split(",");
        if (split.length <= 1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(substring);
        sb2.append(split[0]);
        split[0] = sb2.toString();
        String a = C9768a.m19556a(split[0]);
        for (int i = 1; i < split.length; i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(substring);
            sb3.append(split[i]);
            split[i] = sb3.toString();
            if (!TextUtils.equals(C9768a.m19556a(split[i]), a)) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            Iterator it = this.f26551c.iterator();
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9764c cVar = (C9764c) it.next();
                try {
                    InputStream a2 = cVar.mo17592a(str2);
                    try {
                        interceptorModel.resRootDir = cVar.mo17593a();
                        Map b = cVar.mo17594b();
                        interceptorModel.channel = substring;
                        interceptorModel.pkgVersion = (Long) b.get(substring);
                        obj = a2;
                        break;
                    } catch (Exception unused) {
                        obj = a2;
                    }
                } catch (Exception unused2) {
                }
            }
            if (obj == null) {
                return null;
            }
            arrayList.add(obj);
        }
        return m19535a(a, "", (InputStream) new SequenceInputStream(Collections.enumeration(arrayList)));
    }

    /* renamed from: a */
    public final void mo17585a(InterceptorModel interceptorModel, WebView webView, String str, int i) {
        if (VERSION.SDK_INT < 19 || webView == null || i < 0) {
            mo17584a(interceptorModel);
            return;
        }
        final WebView webView2 = webView;
        final String str2 = str;
        final InterceptorModel interceptorModel2 = interceptorModel;
        final int i2 = i;
        C97593 r2 = new Runnable() {
            public final void run() {
                try {
                    WebView webView = webView2;
                    StringBuilder sb = new StringBuilder("JSON.stringify(window.performance.getEntriesByName('");
                    sb.append(str2);
                    sb.append("'))");
                    webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                        public final /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                            C9756a aVar = C9756a.this;
                            InterceptorModel interceptorModel = interceptorModel2;
                            WebView webView = webView2;
                            String str2 = str2;
                            int i = i2;
                            C9771b a = C9771b.m19560a(aVar.f26549a.f26574a);
                            C97614 r0 = new Runnable(str, interceptorModel, webView, str2, i) {

                                /* renamed from: a */
                                final /* synthetic */ String f26563a;

                                /* renamed from: b */
                                final /* synthetic */ InterceptorModel f26564b;

                                /* renamed from: c */
                                final /* synthetic */ WebView f26565c;

                                /* renamed from: d */
                                final /* synthetic */ String f26566d;

                                /* renamed from: e */
                                final /* synthetic */ int f26567e;

                                public final void run() {
                                    try {
                                        String replaceAll = this.f26563a.replaceAll("\\\\\"", "\"");
                                        JSONObject jSONObject = (JSONObject) new JSONArray(replaceAll.substring(1, replaceAll.length() - 1)).get(0);
                                        long j = jSONObject.getLong("startTime");
                                        long j2 = jSONObject.getLong("responseEnd");
                                        this.f26564b.onlineDuration = Long.valueOf(j2 - j);
                                        C9756a.this.mo17584a(this.f26564b);
                                    } catch (JSONException unused) {
                                        C9756a.this.mo17585a(this.f26564b, this.f26565c, this.f26566d, this.f26567e - 1);
                                    }
                                }

                                {
                                    this.f26563a = r2;
                                    this.f26564b = r3;
                                    this.f26565c = r4;
                                    this.f26566d = r5;
                                    this.f26567e = r6;
                                }
                            };
                            a.f26592d.execute(r0);
                        }
                    });
                } catch (Exception unused) {
                }
            }
        };
        webView.postDelayed(r2, 2000);
    }
}
