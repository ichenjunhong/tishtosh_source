package com.p683ss.android.newmedia.p1202ui.webview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Paint;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.view.C1056u;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.widget.Toast;
import com.bytedance.common.p520c.C9349a;
import com.bytedance.common.p520c.C9351b;
import com.bytedance.common.p520c.C9363e;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.p1147d.C18946h;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.utils.C47778cp;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.newmedia.ui.webview.a */
public final class C19615a {

    /* renamed from: a */
    private WeakReference<Context> f54035a;

    /* renamed from: b */
    private boolean f54036b = true;

    /* renamed from: c */
    private boolean f54037c = true;

    /* renamed from: d */
    private boolean f54038d = true;

    /* renamed from: e */
    private boolean f54039e = true;

    /* renamed from: f */
    private boolean f54040f = true;

    /* renamed from: g */
    private boolean f54041g = true;

    /* renamed from: h */
    private boolean f54042h = true;

    /* renamed from: i */
    private boolean f54043i = true;

    /* renamed from: a */
    public final C19615a mo40901a(boolean z) {
        this.f54043i = true;
        return this;
    }

    /* renamed from: a */
    public static C19615a m47963a(Context context) {
        return new C19615a(context);
    }

    private C19615a(Context context) {
        this.f54035a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo40902a(WebView webView) {
        if (webView != null && this.f54035a.get() != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(this.f54036b);
                } catch (Exception unused) {
                }
                try {
                    if (this.f54037c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                        C9349a.m18524a(settings, false);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable unused2) {
                }
                settings.setTextZoom(100);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f54038d);
                settings.setDomStorageEnabled(this.f54040f);
                settings.setAllowFileAccess(this.f54041g);
                settings.setBlockNetworkImage(!this.f54042h);
                if (!this.f54043i) {
                    try {
                        C1056u.m3025a((View) webView, 1, (Paint) null);
                    } catch (Throwable unused3) {
                    }
                }
                C9351b.m18531a(webView.getSettings(), true);
                if (!this.f54039e) {
                    webView.setOnLongClickListener(null);
                    webView.setLongClickable(false);
                } else {
                    webView.setLongClickable(true);
                    webView.setOnLongClickListener(new OnLongClickListener() {
                        public final boolean onLongClick(View view) {
                            if (!(view instanceof WebView)) {
                                return false;
                            }
                            WebView webView = (WebView) view;
                            HitTestResult hitTestResult = webView.getHitTestResult();
                            if (hitTestResult == null || webView.getSettings() == null) {
                                return false;
                            }
                            if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                                final String extra = hitTestResult.getExtra();
                                final Context context = webView.getContext();
                                if (!(extra == null || context == null || !C19547d.m47842a(extra))) {
                                    C11105a aVar = new C11105a(context);
                                    aVar.mo20142a((CharSequence[]) new String[]{context.getString(R.string.fec)}, (OnClickListener) new OnClickListener() {
                                        /* renamed from: a */
                                        public final void mo40904a() {
                                            String a = C23967a.m58772a(context);
                                            File file = new File(a);
                                            if (!file.exists()) {
                                                file.mkdirs();
                                            }
                                            C0013i.m16a((Callable<TResult>) new C19619b<TResult>(context, extra, a)).mo20a((C0011g<TResult, TContinuationResult>) new C19620c<TResult,TContinuationResult>(context), C0013i.f25b);
                                        }

                                        public final void onClick(DialogInterface dialogInterface, int i) {
                                            if (C0726c.m2090a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
                                                C23361b.m57419a(C23729p.m58248a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                                                    /* renamed from: a */
                                                    public final void mo40906a(String[] strArr, int[] iArr) {
                                                        if (iArr.length <= 0 || iArr[0] != 0) {
                                                            Toast makeText = Toast.makeText(context, R.string.e05, 1);
                                                            if (VERSION.SDK_INT == 25) {
                                                                C47905fy.m103630a(makeText);
                                                            }
                                                            makeText.show();
                                                            return;
                                                        }
                                                        C196171.this.mo40904a();
                                                    }
                                                });
                                                return;
                                            }
                                            mo40904a();
                                        }

                                        /* renamed from: a */
                                        static final /* synthetic */ Boolean m47967a(Context context, String str, String str2) throws Exception {
                                            boolean z = false;
                                            if (context != null) {
                                                String file = context.getExternalCacheDir().toString();
                                                try {
                                                    String guessFileName = URLUtil.guessFileName(str, null, "image/jpeg");
                                                    C47778cp cpVar = C47778cp.f120297a;
                                                    Context applicationContext = context.getApplicationContext();
                                                    C52711k.m112240b(applicationContext, "context");
                                                    C52711k.m112240b(str, "url");
                                                    C52711k.m112240b(str2, "dir");
                                                    C52711k.m112240b(guessFileName, LeakCanaryFileProvider.f132049i);
                                                    C52711k.m112240b(applicationContext, "context");
                                                    C52711k.m112240b(str, "url");
                                                    C52711k.m112240b(str2, "dir");
                                                    C52711k.m112240b(guessFileName, LeakCanaryFileProvider.f132049i);
                                                    List extractImageUrlList = C18946h.extractImageUrlList(str, null);
                                                    C52711k.m112236a((Object) extractImageUrlList, "ImageInfo.extractImageUrlList(url, urlList)");
                                                    boolean a = C47778cp.m103404a(applicationContext, -1, str, extractImageUrlList, str2, file, guessFileName, null, guessFileName, null);
                                                    if (a) {
                                                        try {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(str2);
                                                            sb.append(guessFileName);
                                                            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(sb.toString()))));
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append(str2);
                                                            sb2.append(guessFileName);
                                                            MediaScannerConnection.scanFile(context, new String[]{sb2.toString()}, null, null);
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                    z = a;
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            return Boolean.valueOf(z);
                                        }
                                    });
                                    aVar.mo20148b();
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                }
                C19621d.f54053a.mo40908a(webView);
                C9363e.m18543a(webView.getSettings(), 0);
                C9363e.m18544a(webView, true);
            }
        }
    }

    /* renamed from: a */
    public static String m47964a(String str, long j) {
        if (C9431p.m18664a(str) || j <= 0 || !str.contains("{{ad_id}}")) {
            return null;
        }
        String replace = str.replace("{{ad_id}}", String.valueOf(j));
        StringBuilder sb = new StringBuilder("javascript:(function () {    var JS_ACTLOG_URL = '");
        sb.append(replace);
        sb.append("';    var head = document.getElementsByTagName('head')[0];    var script = document.createElement('script');    script.type = 'text/javascript';    script.src = JS_ACTLOG_URL;    head.appendChild(script);})();");
        return sb.toString();
    }
}
