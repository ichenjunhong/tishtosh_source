package com.p683ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25719i;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod.C48288b;
import com.p683ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod.C48291b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.d */
public final class C26722d extends C11079a {

    /* renamed from: e */
    public static final C26723a f70404e = new C26723a(null);

    /* renamed from: a */
    public View f70405a;

    /* renamed from: b */
    public boolean f70406b;

    /* renamed from: c */
    public boolean f70407c;

    /* renamed from: d */
    public boolean f70408d;

    /* renamed from: j */
    private CrossPlatformWebView f70409j;

    /* renamed from: k */
    private boolean f70410k;

    /* renamed from: l */
    private final C26726d f70411l = new C26726d(this);

    /* renamed from: m */
    private C26724b f70412m = new C26724b(this);

    /* renamed from: n */
    private HashMap f70413n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.d$a */
    public static final class C26723a {
        private C26723a() {
        }

        public /* synthetic */ C26723a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C0654k m64621a(Context context) {
            C52711k.m112240b(context, "context");
            C0654k supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            C52711k.m112236a((Object) supportFragmentManager, "(context as FragmentActi…y).supportFragmentManager");
            return supportFragmentManager;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.d$b */
    public static final class C26724b implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C26722d f70414a;

        C26724b(C26722d dVar) {
            this.f70414a = dVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f70414a.mo54568a();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.d$c */
    static final class C26725c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C26722d f70415a;

        C26725c(C26722d dVar) {
            this.f70415a = dVar;
        }

        public final void run() {
            View view = this.f70415a.f70405a;
            if (view == null) {
                C52711k.m112237a("mMaskView");
            }
            if (view.getVisibility() == 0) {
                C48121w.m104249M().mo95293z();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.d$d */
    public static final class C26726d implements C27235d {

        /* renamed from: a */
        final /* synthetic */ C26722d f70416a;

        /* renamed from: a */
        public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        /* renamed from: a */
        public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        /* renamed from: b */
        public final boolean mo52683b(WebView webView, String str) {
            return false;
        }

        C26726d(C26722d dVar) {
            this.f70416a = dVar;
        }

        /* renamed from: a */
        public final void mo49880a(WebView webView, String str) {
            this.f70416a.f70406b = true;
        }

        /* renamed from: a */
        public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f70416a.f70407c = true;
        }

        /* renamed from: a */
        public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
            this.f70416a.f70406b = false;
            this.f70416a.f70407c = false;
        }

        /* renamed from: a */
        public final void mo52678a(WebView webView, int i, String str, String str2) {
            this.f70416a.f70407c = true;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C47718bf.m103291d(this);
        if (this.f70413n != null) {
            this.f70413n.clear();
        }
    }

    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            View view = this.f70405a;
            if (view == null) {
                C52711k.m112237a("mMaskView");
            }
            view.postDelayed(new C26725c(this), 500);
        }
    }

    /* renamed from: a */
    public final void mo54568a() {
        Context context = getContext();
        if (context != null) {
            setUserVisibleHint(false);
            C52711k.m112236a((Object) context, "it");
            C26723a.m64621a(context).mo2225a().mo2193b(this).mo2195c();
        }
    }

    @C53771m
    public final void onDidLoadFinishEvent(C48291b bVar) {
        C52711k.m112240b(bVar, "event");
        boolean z = true;
        if (bVar.f121511a != 1) {
            z = false;
        }
        this.f70408d = z;
    }

    @C53771m
    public final void onReceiveCloseJuStickerWindowEvent(C48288b bVar) {
        C52711k.m112240b(bVar, "event");
        mo54568a();
    }

    public final void setUserVisibleHint(boolean z) {
        String str;
        super.setUserVisibleHint(z);
        if (this.f70410k != z) {
            this.f70410k = z;
            int i = 0;
            if (z) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str = arguments.getString("support_team", "");
                } else {
                    str = null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("first_support_team", str);
                CrossPlatformWebView crossPlatformWebView = this.f70409j;
                if (crossPlatformWebView == null) {
                    C52711k.m112237a("mWebView");
                }
                crossPlatformWebView.mo55677a("juStickerParams", jSONObject);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    if (activity instanceof MainActivity) {
                        ((MainActivity) activity).registerActivityOnKeyDownListener(this.f70412m);
                    } else if (activity instanceof DetailActivity) {
                        ((DetailActivity) activity).registerActivityOnKeyDownListener(this.f70412m);
                    }
                }
                View view = this.f70405a;
                if (view == null) {
                    C52711k.m112237a("mMaskView");
                }
                view.animate().alpha(0.5f).setDuration(100).start();
                if (getActivity() instanceof DetailActivity) {
                    C25719i iVar = new C25719i(true);
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        i = activity2.hashCode();
                    }
                    iVar.f68030b = i;
                    C47718bf.m103288a(iVar);
                }
            } else {
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    if (activity3 instanceof MainActivity) {
                        ((MainActivity) activity3).unRegisterActivityOnKeyDownListener(this.f70412m);
                    } else if (activity3 instanceof DetailActivity) {
                        ((DetailActivity) activity3).unRegisterActivityOnKeyDownListener(this.f70412m);
                    }
                }
                View view2 = this.f70405a;
                if (view2 == null) {
                    C52711k.m112237a("mMaskView");
                }
                view2.animate().alpha(0.0f).setDuration(100).start();
                C48021h M = C48121w.m104249M();
                C52711k.m112236a((Object) M, "PlayerManager.inst()");
                if (!M.mo95257o()) {
                    C48121w.m104249M().mo95291x();
                }
                if (getActivity() instanceof DetailActivity) {
                    C25719i iVar2 = new C25719i(false);
                    FragmentActivity activity4 = getActivity();
                    if (activity4 != null) {
                        i = activity4.hashCode();
                    }
                    iVar2.f68030b = i;
                    C47718bf.m103288a(iVar2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if (r7 == null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            super.onViewCreated(r7, r8)
            r8 = 2132020990(0x7f140efe, float:1.9680359E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.mask)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            r6.f70405a = r8
            android.view.View r8 = r6.f70405a
            if (r8 != 0) goto L_0x001f
            java.lang.String r0 = "mMaskView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x001f:
            r0 = 0
            r8.setAlpha(r0)
            r8 = 2132024711(0x7f141d87, float:1.9687906E38)
            android.view.View r7 = r7.findViewById(r8)
            java.lang.String r8 = "view.findViewById(R.id.webview)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = (com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r7
            r6.f70409j = r7
            android.support.v4.app.FragmentActivity r7 = r6.getActivity()
            if (r7 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r8 = r6.f70409j
            if (r8 != 0) goto L_0x0042
            java.lang.String r0 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0042:
            com.ss.android.ugc.aweme.crossplatform.view.a r8 = (com.p683ss.android.ugc.aweme.crossplatform.view.C27298a) r8
            com.ss.android.ugc.aweme.commercialize.views.d$d r0 = r6.f70411l
            com.ss.android.ugc.aweme.crossplatform.platform.webview.d r0 = (com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d) r0
            r1 = r6
            android.arch.lifecycle.k r1 = (android.arch.lifecycle.C0184k) r1
            android.app.Activity r7 = (android.app.Activity) r7
            android.os.Bundle r2 = r6.getArguments()
            com.p683ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper.m63705a(r8, r0, r1, r7, r2)
        L_0x0054:
            r7 = 0
            r6.setUserVisibleHint(r7)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103290c(r6)
            android.os.Bundle r7 = r6.getArguments()
            if (r7 == 0) goto L_0x006c
            java.lang.String r8 = "url"
            java.lang.String r7 = r7.getString(r8)
            if (r7 != 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r1 = r7
            goto L_0x006f
        L_0x006c:
            java.lang.String r7 = ""
            goto L_0x006a
        L_0x006f:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r6.f70409j
            if (r0 != 0) goto L_0x0078
            java.lang.String r7 = "mWebView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0078:
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.m65745a(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.C26722d.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mj, viewGroup, false);
    }
}
