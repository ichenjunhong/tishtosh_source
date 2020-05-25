package com.bytedance.polaris.browser;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.common.p520c.C9349a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.polaris.base.BasePolarisActivity;
import com.bytedance.polaris.base.C12579a;
import com.bytedance.polaris.browser.p823a.C12611e;
import com.bytedance.polaris.p822b.C12571a;
import com.bytedance.polaris.p826d.C12640i;
import com.bytedance.polaris.p826d.C12644j;
import com.bytedance.polaris.p826d.C12648n;
import com.bytedance.polaris.p826d.C12650p;
import com.bytedance.polaris.widget.FullscreenVideoFrame;
import com.bytedance.polaris.widget.FullscreenVideoFrame.C12652a;
import com.bytedance.polaris.widget.webview.C12655a;
import com.bytedance.polaris.widget.webview.C12657b;
import com.bytedance.polaris.widget.webview.PolarisWebView;
import com.example.p906a.C13482c;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.b */
public final class C12617b extends C12579a implements C9382a, C12589a {

    /* renamed from: A */
    private boolean f33115A;

    /* renamed from: B */
    private String f33116B;

    /* renamed from: d */
    protected PolarisWebView f33117d;

    /* renamed from: e */
    public C12611e f33118e;

    /* renamed from: f */
    C12620a f33119f;

    /* renamed from: g */
    ProgressBar f33120g;

    /* renamed from: h */
    public FullscreenVideoFrame f33121h;

    /* renamed from: i */
    C9381g f33122i;

    /* renamed from: j */
    Runnable f33123j;

    /* renamed from: k */
    boolean f33124k;

    /* renamed from: l */
    public boolean f33125l;

    /* renamed from: m */
    public boolean f33126m;

    /* renamed from: n */
    public CustomViewCallback f33127n;

    /* renamed from: o */
    public View f33128o;

    /* renamed from: p */
    public boolean f33129p = true;

    /* renamed from: q */
    private JSONObject f33130q;

    /* renamed from: r */
    private FragmentActivity f33131r;

    /* renamed from: s */
    private Resources f33132s;

    /* renamed from: t */
    private boolean f33133t;

    /* renamed from: u */
    private boolean f33134u;

    /* renamed from: v */
    private String f33135v;

    /* renamed from: w */
    private long f33136w;

    /* renamed from: x */
    private C12655a f33137x;

    /* renamed from: y */
    private boolean f33138y;

    /* renamed from: z */
    private boolean f33139z;

    /* renamed from: com.bytedance.polaris.browser.b$a */
    class C12620a extends C12657b {
        public final void onGeolocationPermissionsHidePrompt() {
            C12611e eVar = C12617b.this.f33118e;
            if (eVar != null) {
                eVar.mo23664a();
            }
        }

        public final void onHideCustomView() {
            if (C12617b.this.f33128o == null) {
                C12617b.this.f33127n = null;
                return;
            }
            if (C12617b.this.getActivity() != null && (C12617b.this.getActivity() instanceof BasePolarisActivity)) {
                ((BasePolarisActivity) C12617b.this.getActivity()).mo23648o_();
            }
            C12617b.this.f33121h.setVisibility(8);
            C12617b.this.f33121h.removeView(C12617b.this.f33128o);
            C9432q.m18671a((Activity) C12617b.this.getActivity(), false);
            C12617b.this.f33128o = null;
            C12617b.this.f33127n.onCustomViewHidden();
        }

        C12620a() {
            super(C12617b.this);
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
            C12611e eVar = C12617b.this.f33118e;
            if (eVar != null) {
                eVar.mo23666a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            C12617b bVar = C12617b.this;
            bVar.f33124k = true;
            if (bVar.f33120g != null) {
                bVar.f33120g.setProgress(i);
                bVar.f33122i.removeCallbacks(bVar.f33123j);
                if (bVar.f33120g.getVisibility() != 0) {
                    bVar.f33120g.setVisibility(0);
                }
            }
            if (i >= 100) {
                C12617b bVar2 = C12617b.this;
                bVar2.f33122i.removeCallbacks(bVar2.f33123j);
                bVar2.f33122i.postDelayed(bVar2.f33123j, 500);
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (C12617b.this.f33126m && C12617b.this.getActivity() != null && !C9431p.m18664a(str)) {
                C12617b.this.getActivity().setTitle(str);
            }
        }

        public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            if (!C12617b.this.f33129p || !C12617b.this.f33125l) {
                return;
            }
            if (C12617b.this.f33128o != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            if (C12617b.this.getActivity() != null && (C12617b.this.getActivity() instanceof BasePolarisActivity)) {
                ((BasePolarisActivity) C12617b.this.getActivity()).mo23647h();
            }
            C12617b.this.f33127n = customViewCallback;
            C12617b.this.f33121h.addView(view);
            C12617b.this.f33128o = view;
            C9432q.m18671a((Activity) C12617b.this.getActivity(), true);
            C12617b.this.f33121h.setVisibility(0);
            C12617b.this.f33121h.requestFocus();
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            if (C12644j.m25402a()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" -- line ");
                sb.append(i);
            }
            try {
                C12611e eVar = C12617b.this.f33118e;
                if (eVar != null) {
                    eVar.mo23665a(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public final WebView mo23662c() {
        return this.f33117d;
    }

    /* renamed from: b */
    public final void mo23661b() {
        if (this.f33124k) {
            this.f33117d.stopLoading();
        } else {
            this.f33117d.reload();
        }
    }

    public final void onDestroy() {
        C12611e eVar = this.f33118e;
        if (eVar != null) {
            eVar.mo23673d();
        }
        super.onDestroy();
        PolarisWebView polarisWebView = this.f33117d;
        if (polarisWebView != null) {
            polarisWebView.setWebChromeClient(null);
            polarisWebView.setWebViewClient(C13482c.m27232a(null));
            ViewParent parent = polarisWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(polarisWebView);
                try {
                    polarisWebView.destroy();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r3 = this;
            super.onResume()
            boolean r0 = r3.f33139z
            r1 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r3.f33115A
            if (r0 == 0) goto L_0x0026
            com.bytedance.polaris.a.e r0 = com.bytedance.polaris.p821a.C12563i.m25225g()
            boolean r0 = r0.mo23618c()
            if (r0 != 0) goto L_0x0021
            android.support.v4.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0026
            r0.finish()
            r0 = 1
            goto L_0x0027
        L_0x0021:
            java.lang.String r0 = r3.f33135v
            r3.m25347a(r0)
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002a
            return
        L_0x002a:
            boolean r0 = r3.f33115A
            if (r0 == 0) goto L_0x0034
            boolean r0 = r3.f33139z
            if (r0 == 0) goto L_0x0034
            r3.f33139z = r1
        L_0x0034:
            com.bytedance.polaris.widget.webview.PolarisWebView r0 = r3.f33117d
            if (r0 == 0) goto L_0x004c
            com.bytedance.polaris.widget.webview.PolarisWebView r0 = r3.f33117d
            android.webkit.WebSettings r0 = r0.getSettings()
            r0.setBlockNetworkLoads(r1)
            com.bytedance.common.utility.b.g r0 = r3.f33122i
            if (r0 == 0) goto L_0x004c
            com.bytedance.common.utility.b.g r0 = r3.f33122i
            r1 = 10011(0x271b, float:1.4028E-41)
            r0.removeMessages(r1)
        L_0x004c:
            long r0 = java.lang.System.currentTimeMillis()
            r3.f33136w = r0
            com.bytedance.polaris.widget.webview.PolarisWebView r0 = r3.f33117d
            com.bytedance.common.p520c.C9349a.m18526b(r0)
            com.bytedance.polaris.widget.webview.PolarisWebView r0 = r3.f33117d
            android.content.res.Resources r1 = r3.f33132s
            r2 = 2131821691(0x7f11047b, float:1.9276132E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            boolean r0 = r3.f33134u
            if (r0 == 0) goto L_0x0074
            com.bytedance.polaris.widget.webview.PolarisWebView r0 = r3.f33117d
            android.content.res.Resources r1 = r3.f33132s
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
        L_0x0074:
            com.bytedance.polaris.browser.a.e r0 = r3.f33118e
            if (r0 == 0) goto L_0x007b
            r0.mo23668b()
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.C12617b.onResume():void");
    }

    public final void onPause() {
        super.onPause();
        this.f33115A = true;
        FragmentActivity activity = getActivity();
        C9349a.m18525a((WebView) this.f33117d);
        FragmentActivity activity2 = getActivity();
        PolarisWebView polarisWebView = this.f33117d;
        if (!(activity2 == null || polarisWebView == null || !(activity2 instanceof Activity))) {
            Activity activity3 = activity2;
            if (activity3.isFinishing()) {
                try {
                    C12640i.m25399a(polarisWebView, QuickShopBusiness.f64351b);
                    if (C12648n.f33227c > 0) {
                        View rootView = polarisWebView.getRootView();
                        if (rootView instanceof ViewGroup) {
                            View childAt = ((ViewGroup) rootView).getChildAt(0);
                            childAt.setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                            childAt.setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity3);
                            imageView.setImageBitmap(createBitmap);
                            imageView.setVisibility(0);
                            ((ViewGroup) rootView).addView(imageView, new LayoutParams(-1, -1));
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        C12611e eVar = this.f33118e;
        if (this.f33122i != null && activity != null && !activity.isFinishing() && !eVar.mo23670b(this.f33135v)) {
            this.f33122i.sendEmptyMessageDelayed(10011, 120000);
        }
        if (eVar != null) {
            eVar.mo23671c();
        }
    }

    public final void handleMsg(Message message) {
        if (message.what == 10011 && !mo23639p_() && this.f33117d != null) {
            try {
                this.f33117d.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m25347a(String str) {
        if (this.f33130q == null || this.f33130q.length() <= 0) {
            C12650p.m25418a(str, this.f33117d, this.f33116B, true);
        } else {
            HashMap hashMap = new HashMap();
            C12650p.m25421a(hashMap, (String) null, this.f33130q);
            C12650p.m25419a(str, (WebView) this.f33117d, hashMap);
        }
        m25348b(str);
    }

    /* renamed from: b */
    private static void m25348b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path) && path.contains("page/task")) {
                    C12571a.m25236c().mo23633b();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a8 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac A[Catch:{ Throwable -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6 A[Catch:{ Throwable -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onActivityCreated(r10)
            com.bytedance.common.utility.b.g r10 = new com.bytedance.common.utility.b.g
            r10.<init>(r9)
            r9.f33122i = r10
            com.bytedance.polaris.browser.b$2 r10 = new com.bytedance.polaris.browser.b$2
            r10.<init>()
            r9.f33123j = r10
            android.support.v4.app.FragmentActivity r10 = r9.getActivity()
            r9.f33131r = r10
            android.support.v4.app.FragmentActivity r10 = r9.f33131r
            android.content.res.Resources r10 = r10.getResources()
            r9.f33132s = r10
            r10 = 0
            r9.f33125l = r10
            android.os.Bundle r0 = r9.getArguments()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = "bundle_no_hw_acceleration"
            boolean r1 = r0.getBoolean(r1, r10)
            java.lang.String r2 = "bundle_enable_app_cache"
            boolean r2 = r0.getBoolean(r2, r10)
            r9.f33133t = r2
            java.lang.String r2 = "bundle_url"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0042
            java.lang.String r2 = ""
        L_0x0042:
            java.lang.String r3 = "referer"
            java.lang.String r3 = r0.getString(r3)
            r9.f33116B = r3
            java.lang.String r3 = "bundle_use_day_night"
            boolean r3 = r0.getBoolean(r3, r10)
            r9.f33134u = r3
            java.lang.String r3 = "bundle_user_webview_title"
            boolean r3 = r0.getBoolean(r3, r10)
            r9.f33126m = r3
            java.lang.String r3 = "wap_headers"
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "require_login"
            boolean r0 = r0.getBoolean(r4)
            r9.f33138y = r0
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ JSONException -> 0x0078 }
            if (r0 != 0) goto L_0x0078
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0078 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0078 }
            r9.f33130q = r0     // Catch:{ JSONException -> 0x0078 }
            goto L_0x0078
        L_0x0076:
            r2 = r1
            r1 = 0
        L_0x0078:
            r0 = 1
            android.webkit.CookieManager r3 = android.webkit.CookieManager.getInstance()     // Catch:{ Throwable -> 0x0080 }
            r3.setAcceptCookie(r0)     // Catch:{ Throwable -> 0x0080 }
        L_0x0080:
            android.support.v4.app.FragmentActivity r3 = r9.getActivity()
            com.bytedance.polaris.browser.d r4 = new com.bytedance.polaris.browser.d
            r4.<init>(r3)
            if (r1 != 0) goto L_0x008d
            r1 = 1
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            r4.f33155h = r1
            com.bytedance.polaris.widget.webview.PolarisWebView r1 = r9.f33117d
            if (r1 == 0) goto L_0x00ea
            java.lang.ref.WeakReference<android.content.Context> r3 = r4.f33148a
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L_0x009d
            goto L_0x00ea
        L_0x009d:
            android.webkit.WebSettings r3 = r1.getSettings()
            if (r3 == 0) goto L_0x00ea
            boolean r5 = r4.f33149b     // Catch:{ Exception -> 0x00a8 }
            r3.setJavaScriptEnabled(r5)     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            boolean r5 = r4.f33150c     // Catch:{ Throwable -> 0x00b9 }
            if (r5 == 0) goto L_0x00b6
            r3.setSupportZoom(r0)     // Catch:{ Throwable -> 0x00b9 }
            r3.setBuiltInZoomControls(r0)     // Catch:{ Throwable -> 0x00b9 }
            com.bytedance.common.p520c.C9349a.m18524a(r3, r10)     // Catch:{ Throwable -> 0x00b9 }
            goto L_0x00b9
        L_0x00b6:
            r3.setSupportZoom(r10)     // Catch:{ Throwable -> 0x00b9 }
        L_0x00b9:
            r3.setLoadWithOverviewMode(r0)
            boolean r5 = r4.f33151d
            r3.setUseWideViewPort(r5)
            boolean r5 = r4.f33152e
            r3.setDomStorageEnabled(r5)
            boolean r5 = r4.f33153f
            r3.setAllowFileAccess(r5)
            boolean r5 = r4.f33154g
            r5 = r5 ^ r0
            r3.setBlockNetworkImage(r5)
            boolean r3 = r4.f33155h
            if (r3 != 0) goto L_0x00d9
            r3 = 0
            android.support.p030v4.view.C1056u.m3025a(r1, r0, r3)     // Catch:{ Throwable -> 0x00d9 }
        L_0x00d9:
            android.webkit.WebSettings r3 = r1.getSettings()
            com.bytedance.common.p520c.C9351b.m18531a(r3, r0)
            android.webkit.WebSettings r3 = r1.getSettings()
            com.bytedance.common.p520c.C9363e.m18543a(r3, r10)
            com.bytedance.common.p520c.C9363e.m18544a(r1, r0)
        L_0x00ea:
            com.bytedance.polaris.a.c r10 = com.bytedance.polaris.p821a.C12563i.m25221c()
            com.bytedance.polaris.widget.webview.PolarisWebView r1 = r9.f33117d
            r10.mo23602a(r1)
            com.bytedance.polaris.widget.webview.PolarisWebView r10 = r9.f33117d
            if (r10 == 0) goto L_0x0151
            android.webkit.WebSettings r1 = r10.getSettings()
            java.lang.String r1 = r1.getUserAgentString()
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r1)
            if (r3 == 0) goto L_0x0107
            java.lang.String r1 = ""
        L_0x0107:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " PolarisVersion/tt_2.0.0.62.alpha6"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " PolarisVersionCode/"
            r3.append(r1)
            java.lang.String r1 = "203"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " HostVersion/"
            r3.append(r1)
            com.bytedance.polaris.a.e r1 = com.bytedance.polaris.p821a.C12563i.m25225g()
            java.lang.String r1 = r1.mo23617b()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.webkit.WebSettings r10 = r10.getSettings()
            r10.setUserAgentString(r1)
        L_0x0151:
            com.bytedance.polaris.browser.b$a r10 = new com.bytedance.polaris.browser.b$a
            r10.<init>()
            r9.f33119f = r10
            com.bytedance.polaris.widget.webview.PolarisWebView r10 = r9.f33117d
            com.bytedance.polaris.browser.b$a r1 = r9.f33119f
            r10.setWebChromeClient(r1)
            com.bytedance.polaris.widget.webview.PolarisWebView r10 = r9.f33117d
            android.webkit.WebSettings r10 = r10.getSettings()
            boolean r1 = r9.f33133t
            if (r1 == 0) goto L_0x016b
            r1 = 1
            goto L_0x016c
        L_0x016b:
            r1 = -1
        L_0x016c:
            r10.setCacheMode(r1)
            r9.f33135v = r2
            com.bytedance.polaris.a.e r10 = com.bytedance.polaris.p821a.C12563i.m25225g()
            boolean r10 = r10.mo23618c()
            boolean r1 = r9.f33138y
            if (r1 == 0) goto L_0x019c
            if (r10 != 0) goto L_0x019c
            r9.f33139z = r0
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r10 = "use_new"
            r7.put(r10, r0)     // Catch:{ JSONException -> 0x018b }
        L_0x018b:
            com.bytedance.polaris.a.e r2 = com.bytedance.polaris.p821a.C12563i.m25225g()
            android.support.v4.app.FragmentActivity r3 = r9.getActivity()
            java.lang.String r4 = "all"
            r5 = 0
            r6 = 0
            r8 = 0
            r2.mo23610a(r3, r4, r5, r6, r7, r8)
            return
        L_0x019c:
            java.lang.String r10 = r9.f33135v
            r9.m25347a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.C12617b.onActivityCreated(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ack, viewGroup, false);
        this.f33120g = (ProgressBar) inflate.findViewById(R.id.crf);
        this.f33117d = (PolarisWebView) inflate.findViewById(R.id.crh);
        this.f33118e = new C12611e(this, this, this.f33117d);
        this.f33137x = new C12655a(this.f33118e);
        this.f33117d.setWebViewClient(C13482c.m27232a(this.f33137x));
        this.f33117d.setScrollBarStyle(0);
        this.f33121h = (FullscreenVideoFrame) inflate.findViewById(R.id.a30);
        this.f33121h.setListener(new C12652a() {
            /* renamed from: a */
            public final void mo23715a() {
                if (C12617b.this.f33119f != null) {
                    C12617b.this.f33119f.onHideCustomView();
                }
            }
        });
        return inflate;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        if (this.f33119f != null) {
            C12620a aVar = this.f33119f;
            if (i == 2048) {
                if (i2 != 0 || !aVar.f33246c) {
                    if (VERSION.SDK_INT >= 21 && aVar.f33245b != null) {
                        Uri[] parseResult = FileChooserParams.parseResult(i2, intent);
                        if (parseResult == null) {
                            File file = new File(aVar.f33248e);
                            if (file.exists()) {
                                Uri fromFile = Uri.fromFile(file);
                                aVar.mo23786a().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile));
                                parseResult = new Uri[]{fromFile};
                            }
                        }
                        aVar.f33245b.onReceiveValue(parseResult);
                        aVar.f33245b = null;
                    } else if (aVar.f33247d != null) {
                        if (intent == null || i2 != -1) {
                            uri = null;
                        } else {
                            uri = intent.getData();
                        }
                        if (uri == null && intent == null && i2 == -1) {
                            File file2 = new File(aVar.f33248e);
                            if (file2.exists()) {
                                uri = Uri.fromFile(file2);
                                aVar.mo23786a().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                            }
                        }
                        aVar.f33247d.onReceiveValue(uri);
                        aVar.f33247d = null;
                    }
                }
                aVar.f33246c = false;
            }
        }
    }
}
