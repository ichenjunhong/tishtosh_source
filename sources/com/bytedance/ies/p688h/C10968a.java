package com.bytedance.ies.p688h;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.falconx.statistic.StatisticData;
import com.bytedance.ies.p688h.p690b.C10980a;
import com.bytedance.ies.p688h.p691c.C10983a.C10985b;
import com.bytedance.ies.p688h.p692d.C10987a;
import com.bytedance.ies.p688h.p692d.C10988b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.h.a */
public final class C10968a {

    /* renamed from: d */
    public static String f29454d;

    /* renamed from: e */
    public static String f29455e;

    /* renamed from: f */
    public static String f29456f;

    /* renamed from: g */
    public static Context f29457g;

    /* renamed from: a */
    public List<Pattern> f29458a;

    /* renamed from: b */
    public String[] f29459b;

    /* renamed from: c */
    public boolean f29460c = true;

    /* renamed from: h */
    private AssetManager f29461h;

    /* renamed from: i */
    private C10979b f29462i = new C10979b() {
        /* renamed from: a */
        public final boolean mo18674a(String str) {
            return true;
        }
    };

    /* renamed from: a */
    public final String mo19784a() {
        if (this.f29459b == null || this.f29459b.length == 0) {
            return null;
        }
        return this.f29459b[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01aa, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ac, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb A[Catch:{ Exception -> 0x01b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f1 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.webkit.WebResourceResponse mo19780a(final android.webkit.WebView r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            java.util.List<java.util.regex.Pattern> r1 = r13.f29458a     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r1 == 0) goto L_0x01ab
            boolean r1 = r13.f29460c     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r1 == 0) goto L_0x01ab
            java.util.List<java.util.regex.Pattern> r1 = r13.f29458a     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r1 != 0) goto L_0x01ab
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r1 == 0) goto L_0x001a
            goto L_0x01ab
        L_0x001a:
            com.bytedance.ies.h.c.a$b r1 = new com.bytedance.ies.h.c.a$b     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.<init>()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.mo19806a(r15)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r14 == 0) goto L_0x002c
            com.bytedance.ies.h.a$4 r2 = new com.bytedance.ies.h.a$4     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r2.<init>(r14, r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r14.post(r2)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x002c:
            r2 = 0
            r3 = 0
        L_0x002e:
            java.util.List<java.util.regex.Pattern> r4 = r13.f29458a     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            int r4 = r4.size()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r3 >= r4) goto L_0x0181
            java.util.List<java.util.regex.Pattern> r4 = r13.f29458a     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r4 == 0) goto L_0x017d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r5.<init>()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r6 = r4.pattern()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r5.append(r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r6 = "??"
            r5.append(r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.util.regex.Matcher r5 = r5.matcher(r15)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r6 = r5.find()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r7 = 1
            if (r6 == 0) goto L_0x00ee
            java.lang.String r6 = r4.pattern()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.f29507h = r6     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r6 = "??"
            int r6 = r15.indexOf(r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r6 <= 0) goto L_0x00ee
            int r5 = r5.end()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            int r5 = r5 + r7
            java.lang.String r5 = r15.substring(r5, r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            int r6 = r6 + 2
            java.lang.String r6 = r15.substring(r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r8 = ","
            java.lang.String[] r6 = r6.split(r8)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            int r8 = r6.length     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r8 <= r7) goto L_0x00ee
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r8.<init>()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r8.append(r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r9 = r6[r2]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r8.append(r9)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r6[r2] = r8     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r8 = r6[r2]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r8 = m22227a(r8)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r9 = 1
        L_0x00a4:
            int r10 = r6.length     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r9 >= r10) goto L_0x00c9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r10.<init>()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r10.append(r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r11 = r6[r9]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r10.append(r11)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r6[r9] = r10     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r10 = r6[r9]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r10 = m22227a(r10)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r10 = android.text.TextUtils.equals(r10, r8)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r10 == 0) goto L_0x00ee
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00c9:
            java.lang.String[] r5 = r13.m22230a(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r5 == 0) goto L_0x00ee
            int r9 = r5.length     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r10 = 0
        L_0x00d1:
            if (r10 >= r9) goto L_0x00ee
            r11 = r5[r10]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.io.InputStream r12 = r13.m22226a(r6, r11)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r12 == 0) goto L_0x00eb
            java.lang.String r5 = ""
            android.webkit.WebResourceResponse r5 = m22222a(r8, r5, r12)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r5 == 0) goto L_0x00ef
            r1.f29512m = r11     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r6 = r6[r2]     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.mo19807a(r11, r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x00ef
        L_0x00eb:
            int r10 = r10 + 1
            goto L_0x00d1
        L_0x00ee:
            r5 = r0
        L_0x00ef:
            if (r5 == 0) goto L_0x00fb
            r13.m22228a(r1, r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r2.<init>(r5, r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x018d
        L_0x00fb:
            java.util.regex.Matcher r5 = r4.matcher(r15)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            boolean r6 = r5.find()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r6 == 0) goto L_0x017d
            java.lang.String r6 = r4.pattern()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.f29507h = r6     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r6 = "?"
            int r6 = r15.indexOf(r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r8 = "#"
            int r8 = r15.indexOf(r8)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            int r9 = java.lang.Math.min(r6, r8)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r10 = -1
            if (r9 != r10) goto L_0x0122
            int r9 = java.lang.Math.max(r6, r8)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x0122:
            if (r9 == r10) goto L_0x012d
            int r5 = r5.end()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r5 = r15.substring(r5, r9)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x0135
        L_0x012d:
            int r5 = r5.end()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r5 = r15.substring(r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x0135:
            java.lang.String r6 = "/"
            boolean r6 = r5.endsWith(r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r6 == 0) goto L_0x0146
            int r6 = r5.length()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            int r6 = r6 - r7
            java.lang.String r5 = r5.substring(r2, r6)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x0146:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r6 != 0) goto L_0x017d
            java.lang.String[] r3 = r13.m22230a(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            android.webkit.WebResourceResponse r3 = r13.m22223a(r15, r5, r3, r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r3 == 0) goto L_0x016b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r4 = "path:"
            r2.<init>(r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r2.append(r5)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            com.bytedance.ies.p688h.p689a.C10977b.m22243b(r15, r2)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r13.m22228a(r1, r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x0177
        L_0x016b:
            java.lang.String r4 = "未找到本地资源"
            com.bytedance.ies.p688h.p689a.C10977b.m22242a(r15, r4)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r4 = "100"
            r1.f29508i = r4     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.mo19808a(r2)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x0177:
            android.util.Pair r2 = new android.util.Pair     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            goto L_0x018d
        L_0x017d:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x0181:
            java.lang.String r3 = "100"
            r1.f29508i = r3     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r1.mo19808a(r2)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x018d:
            java.lang.Object r1 = r2.first     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            android.webkit.WebResourceResponse r1 = (android.webkit.WebResourceResponse) r1     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r1 != 0) goto L_0x01a9
            java.lang.Object r3 = r2.second     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            com.bytedance.ies.h.c.a$b r3 = (com.bytedance.ies.p688h.p691c.C10983a.C10985b) r3     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r3.f29512m = r0     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.Object r3 = r2.second     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            com.bytedance.ies.h.c.a$b r3 = (com.bytedance.ies.p688h.p691c.C10983a.C10985b) r3     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            java.lang.String r3 = r3.f29507h     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            if (r3 == 0) goto L_0x01a9
            java.lang.Object r2 = r2.second     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            com.bytedance.ies.h.c.a$b r2 = (com.bytedance.ies.p688h.p691c.C10983a.C10985b) r2     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
            r3 = 5
            r13.mo19786a(r2, r14, r15, r3)     // Catch:{ Exception -> 0x01b0, all -> 0x01ad }
        L_0x01a9:
            monitor-exit(r13)
            return r1
        L_0x01ab:
            monitor-exit(r13)
            return r0
        L_0x01ad:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x01b0:
            monitor-exit(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p688h.C10968a.mo19780a(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public final void mo19786a(C10985b bVar, WebView webView, String str, int i) {
        if (VERSION.SDK_INT < 19 || webView == null || i < 0) {
            mo19785a(bVar);
            return;
        }
        final WebView webView2 = webView;
        final String str2 = str;
        final C10985b bVar2 = bVar;
        final int i2 = i;
        C109702 r2 = new Runnable() {
            public final void run() {
                try {
                    WebView webView = webView2;
                    StringBuilder sb = new StringBuilder("JSON.stringify(window.performance.getEntriesByName('");
                    sb.append(str2);
                    sb.append("'))");
                    webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                        public final /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                            C10968a aVar = C10968a.this;
                            C10985b bVar = bVar2;
                            WebView webView = webView2;
                            String str2 = str2;
                            int i = i2;
                            C10987a a = C10987a.m22255a();
                            C109723 r0 = new Runnable(str, bVar, webView, str2, i) {

                                /* renamed from: a */
                                final /* synthetic */ String f29470a;

                                /* renamed from: b */
                                final /* synthetic */ C10985b f29471b;

                                /* renamed from: c */
                                final /* synthetic */ WebView f29472c;

                                /* renamed from: d */
                                final /* synthetic */ String f29473d;

                                /* renamed from: e */
                                final /* synthetic */ int f29474e;

                                public final void run() {
                                    try {
                                        String replaceAll = this.f29470a.replaceAll("\\\\\"", "\"");
                                        JSONObject jSONObject = (JSONObject) new JSONArray(replaceAll.substring(1, replaceAll.length() - 1)).get(0);
                                        long j = jSONObject.getLong("startTime");
                                        long j2 = jSONObject.getLong("responseEnd");
                                        this.f29471b.f29511l = Long.valueOf(j2 - j);
                                        C10968a.this.mo19785a(this.f29471b);
                                    } catch (JSONException unused) {
                                        C10968a.this.mo19786a(this.f29471b, this.f29472c, this.f29473d, this.f29474e - 1);
                                    }
                                }

                                {
                                    this.f29470a = r2;
                                    this.f29471b = r3;
                                    this.f29472c = r4;
                                    this.f29473d = r5;
                                    this.f29474e = r6;
                                }
                            };
                            a.mo19810a(r0);
                        }
                    });
                } catch (Exception unused) {
                }
            }
        };
        webView.postDelayed(r2, 2000);
    }

    /* renamed from: a */
    public final void mo19785a(final C10985b bVar) {
        if (f29457g != null) {
            C10987a.m22255a().mo19810a(new Runnable() {
                public final void run() {
                    C10980a a = C10980a.m22245a(C10968a.f29457g);
                    String str = C10968a.f29455e;
                    String str2 = C10968a.f29456f;
                    C10985b bVar = bVar;
                    if (bVar != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                        contentValues.put("app_version", str);
                        contentValues.put("device_id", str2);
                        contentValues.put("region", Locale.getDefault().getCountry());
                        contentValues.put("resource_url", bVar.f29500a);
                        contentValues.put("access_key", bVar.f29501b);
                        contentValues.put("channel", bVar.f29502c);
                        contentValues.put("mime_type", bVar.f29503d);
                        contentValues.put("offline_status", bVar.f29504e);
                        contentValues.put("offline_duration", bVar.f29505f);
                        contentValues.put("ac", C10988b.m22257a(a.f29489a));
                        contentValues.put("offline_rule", bVar.f29507h);
                        contentValues.put("err_code", bVar.f29508i);
                        contentValues.put("err_msg", bVar.f29509j);
                        contentValues.put("online_duration", bVar.f29511l);
                        contentValues.put("res_root_dir", bVar.f29512m);
                        contentValues.put("page_url", bVar.f29515p);
                        contentValues.put("pkg_version", a.mo19794a(bVar.f29501b, bVar.f29502c));
                        try {
                            a.getWritableDatabase().insert("weboffline_statistic", null, contentValues);
                            a.mo19795a();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private String[] m22230a(Pattern pattern) {
        String a = C10986d.m22253a().mo19809a(pattern.toString());
        if (TextUtils.isEmpty(a)) {
            return this.f29459b;
        }
        return new String[]{a};
    }

    /* renamed from: a */
    private boolean m22229a(String str, String str2) {
        if (this.f29462i == null) {
            return true;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2.split("/")[0]);
            String sb2 = sb.toString();
            if (m22231b(sb2) != null) {
                return true;
            }
            return this.f29462i.mo18674a(sb2);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C10968a mo19781a(C10979b bVar) {
        this.f29462i = bVar;
        return this;
    }

    /* renamed from: a */
    public final C10968a mo19782a(List<Pattern> list) {
        this.f29458a = list;
        return this;
    }

    /* renamed from: a */
    public final C10968a mo19783a(boolean z) {
        this.f29460c = z;
        return this;
    }

    private C10968a(Context context) {
        if (context != null) {
            f29457g = context;
            this.f29461h = context.getAssets();
        }
    }

    /* renamed from: b */
    private static String m22231b(String str) {
        try {
            URI create = URI.create(str);
            if ("asset".equals(create.getScheme())) {
                String path = create.getPath();
                if (path.startsWith("/")) {
                    return path.substring(1);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m22227a(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    /* renamed from: a */
    private void m22228a(final C10985b bVar, WebResourceResponse webResourceResponse) {
        if (webResourceResponse != null) {
            InputStream data = webResourceResponse.getData();
            if (data != null) {
                webResourceResponse.setData(new C10982c(data) {
                    public final void close() throws IOException {
                        super.close();
                        bVar.mo19808a(true);
                        C10968a.this.mo19785a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo19792a(IOException iOException) {
                        super.mo19792a(iOException);
                        bVar.f29508i = StatisticData.ERROR_CODE_IO_ERROR;
                        bVar.f29509j = iOException.getMessage();
                        bVar.mo19808a(false);
                        C10968a.this.mo19785a(bVar);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private InputStream m22226a(String[] strArr, String str) {
        String str2;
        if (strArr.length <= 1) {
            return null;
        }
        for (String a : strArr) {
            if (!m22229a(str, a)) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(strArr[i]);
            String sb3 = sb2.toString();
            String b = m22231b(sb3);
            if (b != null) {
                try {
                    arrayList.add(this.f29461h.open(b));
                } catch (Exception unused) {
                    return null;
                }
            } else {
                sb.append(sb3);
                if (i != strArr.length - 1) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                try {
                    arrayList.add(new FileInputStream(new File(sb3)));
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    /* renamed from: a */
    private static WebResourceResponse m22222a(String str, String str2, InputStream inputStream) {
        WebResourceResponse webResourceResponse;
        if (inputStream != null) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (VERSION.SDK_INT < 21 || !"font/ttf".equals(str)) {
                    webResourceResponse = new WebResourceResponse(str, str2, inputStream);
                    if (VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.InputStream m22225a(java.lang.String r6, java.lang.String[] r7, com.bytedance.ies.p688h.p691c.C10983a.C10985b r8) {
        /*
            r5 = this;
            int r0 = r7.length
            r1 = 0
        L_0x0002:
            if (r1 >= r0) goto L_0x003b
            r2 = r7[r1]
            r8.f29512m = r2
            r8.mo19807a(r2, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = m22231b(r3)
            if (r4 == 0) goto L_0x0027
            android.content.res.AssetManager r2 = r5.f29461h     // Catch:{ Exception -> 0x0038 }
            java.io.InputStream r2 = r2.open(r4)     // Catch:{ Exception -> 0x0038 }
            return r2
        L_0x0027:
            boolean r2 = r5.m22229a(r2, r6)
            if (r2 == 0) goto L_0x0038
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            java.io.File r4 = new java.io.File     // Catch:{  }
            r4.<init>(r3)     // Catch:{  }
            r2.<init>(r4)     // Catch:{  }
            return r2
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x003b:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p688h.C10968a.m22225a(java.lang.String, java.lang.String[], com.bytedance.ies.h.c.a$b):java.io.InputStream");
    }

    /* renamed from: a */
    private synchronized WebResourceResponse m22223a(String str, String str2, String[] strArr, C10985b bVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && this.f29460c) {
            if (strArr != null) {
                return m22222a(m22227a(str2), "", m22225a(str2, strArr, bVar));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C10968a m22224a(Context context, String str, String str2, String... strArr) {
        C10968a aVar = new C10968a(context.getApplicationContext());
        aVar.f29459b = strArr;
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                String str3 = strArr[i];
                if (!str3.endsWith("/")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("/");
                    strArr[i] = sb.toString();
                }
            }
        }
        f29455e = str;
        f29456f = str2;
        return aVar;
    }
}
