package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p683ss.android.sdk.webview.C19765l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27114h;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.C27181a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient */
public final class SingleWebChromeClient extends C27231b {

    /* renamed from: d */
    public C19765l f71844d;

    /* renamed from: e */
    public C27114h f71845e;

    /* renamed from: f */
    public final List<C27236e> f71846f = new ArrayList();

    /* renamed from: g */
    public C22521l f71847g;

    /* renamed from: h */
    public C27236e f71848h = new C27211a(this);

    /* renamed from: i */
    private C27252m f71849i;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a */
    public static final class C27211a implements C27236e {

        /* renamed from: a */
        final /* synthetic */ SingleWebChromeClient f71850a;

        /* renamed from: a */
        public final void mo55566a() {
            for (C27236e a : this.f71850a.f71846f) {
                a.mo55566a();
            }
        }

        C27211a(SingleWebChromeClient singleWebChromeClient) {
            this.f71850a = singleWebChromeClient;
        }

        /* renamed from: a */
        public final void mo55567a(View view, CustomViewCallback customViewCallback) {
            for (C27236e a : this.f71850a.f71846f) {
                a.mo55567a(view, customViewCallback);
            }
        }

        /* renamed from: a */
        public final void mo55568a(WebView webView, int i) {
            for (C27236e a : this.f71850a.f71846f) {
                a.mo55568a(webView, i);
            }
        }
    }

    public final void onGeolocationPermissionsHidePrompt() {
        C19765l lVar = this.f71844d;
        if (lVar != null) {
            lVar.mo41204e();
        }
    }

    public final void onHideCustomView() {
        super.onHideCustomView();
        this.f71848h.mo55566a();
    }

    public final Bitmap getDefaultVideoPoster() {
        C27114h hVar = this.f71845e;
        if (hVar != null) {
            C27182a crossPlatformParams = hVar.getCrossPlatformParams();
            if (crossPlatformParams != null) {
                C27181a aVar = crossPlatformParams.f71718a;
                if (aVar != null && aVar.f71717n) {
                    return Bitmap.createBitmap(1, 1, Config.ARGB_8888);
                }
            }
        }
        return super.getDefaultVideoPoster();
    }

    public final View getVideoLoadingProgressView() {
        Context context;
        C27114h hVar = this.f71845e;
        Context context2 = null;
        if (hVar != null) {
            context = hVar.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            return null;
        }
        C27114h hVar2 = this.f71845e;
        if (hVar2 != null) {
            context2 = hVar2.getContext();
        }
        if (context2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context2, "iCrossPlatformActivityContainer?.context!!");
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* renamed from: a */
    private static AppCompatActivity m65635a(Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        this.f71849i.f71905a = valueCallback;
        this.f71849i.mo55641a("", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SingleWebChromeClient(android.webkit.WebView r3) {
        /*
            r2 = this;
            java.lang.String r0 = "targetWebView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r2.f71846f = r0
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a r0 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient$a
            r0.<init>(r2)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.e r0 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27236e) r0
            r2.f71848h = r0
            android.content.Context r3 = r3.getContext()
            android.support.v7.app.AppCompatActivity r3 = m65635a(r3)
            if (r3 == 0) goto L_0x0031
            android.support.v4.app.k r0 = r3.getSupportFragmentManager()
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = "web_view_upload_file"
            android.support.v4.app.Fragment r0 = r0.mo2224a(r1)
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27252m
            if (r1 != 0) goto L_0x0058
            com.ss.android.ugc.aweme.crossplatform.platform.webview.m r0 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.m
            r0.<init>()
            r2.f71849i = r0
            if (r3 == 0) goto L_0x0057
            android.support.v4.app.k r3 = r3.getSupportFragmentManager()
            if (r3 == 0) goto L_0x0057
            android.support.v4.app.r r3 = r3.mo2225a()
            com.ss.android.ugc.aweme.crossplatform.platform.webview.m r0 = r2.f71849i
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
            java.lang.String r1 = "web_view_upload_file"
            android.support.v4.app.r r3 = r3.mo2178a(r0, r1)
            r3.mo2195c()
            goto L_0x005c
        L_0x0057:
            return
        L_0x0058:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.m r0 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27252m) r0
            r2.f71849i = r0
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient.<init>(android.webkit.WebView):void");
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        this.f71848h.mo55567a(view, customViewCallback);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        C52711k.m112240b(str, "origin");
        C52711k.m112240b(callback, "callback");
        C19765l lVar = this.f71844d;
        if (lVar != null) {
            lVar.mo41202a(str, callback);
        }
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C22521l lVar = this.f71847g;
        if (lVar != null) {
            C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
            if (nVar != null) {
                nVar.mo46854a(webView, i);
            }
        }
        this.f71848h.mo55568a(webView, i);
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        C27114h hVar = this.f71845e;
        if (hVar != null) {
            hVar.mo54143a(str, false);
        }
        C22521l lVar = this.f71847g;
        if (lVar != null) {
            C22524n nVar = (C22524n) lVar.mo46870a(C22524n.class);
            if (nVar != null) {
                nVar.mo46866d();
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        C52711k.m112240b(str, "acceptType");
        this.f71849i.f71905a = valueCallback;
        this.f71849i.mo55641a(str, "");
    }

    public final void onConsoleMessage(String str, int i, String str2) {
        try {
            C19765l lVar = this.f71844d;
            if (lVar != null) {
                lVar.mo41203b(str);
            }
            C27114h hVar = this.f71845e;
            if (hVar != null) {
                C27177g crossPlatformBusiness = hVar.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.mo55523a(AdWebStatBusiness.class);
                    if (adWebStatBusiness != null) {
                        adWebStatBusiness.mo55478a(str);
                    }
                }
            }
            C26384ak.f69607d.mo54106a(str);
        } catch (Exception unused) {
        }
    }

    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        Context context;
        Context context2;
        boolean z;
        String str;
        if (fileChooserParams == null) {
            return false;
        }
        Context context3 = null;
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (m65635a(context) == null) {
            return false;
        }
        C27252m mVar = this.f71849i;
        if (fileChooserParams != null) {
            if (webView != null) {
                context2 = webView.getContext();
            } else {
                context2 = null;
            }
            if (C47946e.m103734a(context2) == 0) {
                if (webView != null) {
                    context3 = webView.getContext();
                }
                if (C47946e.m103737c(context3) == 0) {
                    mVar.f71906b = valueCallback;
                    String[] acceptTypes = fileChooserParams.getAcceptTypes();
                    C52711k.m112236a((Object) acceptTypes, "fileChooserParams.acceptTypes");
                    if (acceptTypes.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        str = fileChooserParams.getAcceptTypes()[0];
                    } else {
                        str = "";
                    }
                    mVar.mo55641a(str, "");
                }
            }
            C23361b.m57419a(mVar.getActivity(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C27254b(mVar, valueCallback, fileChooserParams));
        }
        return true;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        C52711k.m112240b(str, "acceptType");
        C52711k.m112240b(str2, "capture");
        this.f71849i.f71905a = valueCallback;
        this.f71849i.mo55641a(str, str2);
    }
}
