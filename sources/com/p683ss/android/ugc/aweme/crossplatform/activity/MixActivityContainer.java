package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Space;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.sdk.p1207a.C19717a;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.activity.C23448w;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.C27198d;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27146a;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27149c;
import com.p683ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g;
import com.p683ss.android.ugc.aweme.crossplatform.business.C27177g.C27178a;
import com.p683ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness.C27158a;
import com.p683ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27094a;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27098d;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c;
import com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a.C27183a;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27187c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27234c;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27235d;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p683ss.android.ugc.aweme.crossplatform.prefetch.C27271c;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27298a;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27303e;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27304f;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27308i;
import com.p683ss.android.ugc.aweme.crossplatform.view.C27309j;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.C27281a;
import com.p683ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseMethod.C29793b;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetWebViewInfo.C29803b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47806dd;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47887fi;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer */
public class MixActivityContainer extends AbsActivityContainer implements C27304f {

    /* renamed from: a */
    public final Activity f71487a;

    /* renamed from: b */
    public C27182a f71488b;

    /* renamed from: c */
    public Bundle f71489c;

    /* renamed from: d */
    protected final C27177g f71490d;

    /* renamed from: e */
    public Runnable f71491e;

    /* renamed from: f */
    public C27235d f71492f;

    /* renamed from: g */
    OpenURLHintLayout f71493g;

    /* renamed from: h */
    public String f71494h;

    /* renamed from: i */
    public C27117k f71495i;

    /* renamed from: j */
    public CrossPlatformTitleBar f71496j;

    /* renamed from: k */
    public Space f71497k;

    /* renamed from: l */
    private C27298a f71498l;

    /* renamed from: m */
    private C27111f f71499m;

    /* renamed from: n */
    private C27235d f71500n;

    /* renamed from: o */
    private String f71501o;

    /* renamed from: p */
    private long f71502p;

    /* renamed from: q */
    private boolean f71503q;

    /* renamed from: r */
    private ImmersionBar f71504r;

    /* renamed from: s */
    private GradualChangeLinearLayout f71505s;

    /* renamed from: t */
    private long f71506t;

    /* renamed from: u */
    private final Set<C23423b> f71507u = new HashSet();

    /* renamed from: d */
    public final C27235d mo54148d() {
        return this.f71500n;
    }

    /* renamed from: e */
    public final C27298a mo54149e() {
        return this.f71498l;
    }

    public /* bridge */ /* synthetic */ Context getContext() {
        return this.f71487a;
    }

    public final C27177g getCrossPlatformBusiness() {
        return this.f71490d;
    }

    public final C27182a getCrossPlatformParams() {
        return this.f71488b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo55389m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo55390n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo55391o() {
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        this.f71503q = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo55392p() {
    }

    /* renamed from: q */
    public void mo55393q() {
    }

    /* renamed from: a */
    public final boolean mo55370a(String str, int i) {
        return C41302w.m91042a().mo83859a(this.f71487a, str, i);
    }

    /* renamed from: F */
    private int m65356F() {
        return C27148b.m65498b(this.f71487a);
    }

    /* renamed from: f */
    public final void mo54150f() {
        this.f71498l.mo54150f();
    }

    /* renamed from: g */
    public final boolean mo54151g() {
        return this.f71498l.mo54151g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo55374j() {
        C40884a.m90455a(this.f71487a);
    }

    /* renamed from: l */
    public final void mo55376l() {
        this.f71487a.finish();
    }

    /* renamed from: B */
    private void m65352B() {
        this.f71499m = new C27111f(this.f71487a, this);
        this.f71499m.mo55421a();
    }

    /* renamed from: G */
    private void m65357G() {
        mo54149e().setFullScreen(new C27234c() {

            /* renamed from: b */
            private int f71511b = 1;

            /* renamed from: a */
            public final void mo55417a() {
                MixActivityContainer.this.mo55409u();
                if (MixActivityContainer.this.f71487a != null) {
                    if (MixActivityContainer.this.f71487a.getRequestedOrientation() != this.f71511b) {
                        MixActivityContainer.this.f71487a.setRequestedOrientation(this.f71511b);
                        if (!C27146a.m65495a(MixActivityContainer.this.f71488b, MixActivityContainer.this.f71487a)) {
                            MixActivityContainer.this.f71487a.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
                        } else {
                            MixActivityContainer.this.mo54145b();
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) MixActivityContainer.this.f71487a.findViewById(R.id.f88);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.setVisibility(8);
                    }
                }
            }

            /* renamed from: a */
            public final boolean mo55418a(View view, CustomViewCallback customViewCallback) {
                MixActivityContainer.this.mo54147c();
                if (MixActivityContainer.this.f71487a == null || view == null || !MixActivityContainer.this.f71488b.f71721d.f71792D) {
                    return false;
                }
                this.f71511b = MixActivityContainer.this.f71487a.getRequestedOrientation();
                if (VERSION.SDK_INT >= 18) {
                    MixActivityContainer.this.f71487a.setRequestedOrientation(11);
                } else {
                    MixActivityContainer.this.f71487a.setRequestedOrientation(0);
                }
                C47888fj.m103586a(MixActivityContainer.this.f71487a);
                ViewGroup viewGroup = (ViewGroup) MixActivityContainer.this.f71487a.findViewById(R.id.f88);
                if (viewGroup == null) {
                    viewGroup = new FrameLayout(MixActivityContainer.this.f71487a);
                    viewGroup.setId(R.id.f88);
                    MixActivityContainer.this.f71487a.addContentView(viewGroup, new LayoutParams(-1, -1));
                }
                viewGroup.setVisibility(0);
                viewGroup.addView(view, new LayoutParams(-1, -1));
                return true;
            }
        });
    }

    /* renamed from: c */
    public final void mo54147c() {
        this.f71496j.setVisibility(8);
        this.f71497k.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo55373i() {
        mo54149e().mo55682b(this.f71487a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo55375k() {
        m65363y();
        mo54149e().mo55672a(this.f71487a);
        m65355E();
    }

    /* renamed from: v */
    public final void mo55410v() {
        if (!mo54149e().mo55681a()) {
            m65359I();
        }
    }

    /* renamed from: D */
    private void m65354D() {
        if (getCrossPlatformParams().f71721d.f71805k) {
            this.f71495i.mo55430a("copylink", 4);
        }
    }

    /* renamed from: J */
    private static boolean m65360J() {
        try {
            return C32816h.m75716b().getAdLandingPageConfig().getEnableDynamicNavbar().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: C */
    private void m65353C() {
        this.f71496j = (CrossPlatformTitleBar) m65361a((int) R.id.a2l);
        this.f71497k = (Space) m65361a((int) R.id.bpy);
        this.f71496j.setCrossPlatformParams(getCrossPlatformParams());
        this.f71496j.setTitleWrap(new C27281a() {
            /* renamed from: c */
            public final void mo55415c() {
                MixActivityContainer.this.mo55390n();
            }

            /* renamed from: a */
            public final void mo55412a() {
                MixActivityContainer.this.f71494h = "click_button";
                MixActivityContainer.this.mo55410v();
            }

            /* renamed from: d */
            public final void mo55416d() {
                if (MixActivityContainer.this.f71491e != null) {
                    MixActivityContainer.this.f71491e.run();
                }
            }

            /* renamed from: b */
            public final void mo55414b() {
                ((ReportBusinessProxy) MixActivityContainer.this.f71490d.mo55523a(ReportBusinessProxy.class)).mo55530a(MixActivityContainer.this.f71487a);
            }

            /* renamed from: a */
            public final void mo55413a(View view) {
                boolean z;
                C27117k kVar = MixActivityContainer.this.f71495i;
                boolean z2 = true;
                if (kVar.f71536d == null || kVar.f71536d.isEmpty()) {
                    kVar.f71533a.setVisibility(0);
                    kVar.f71534b.setVisibility(0);
                    kVar.f71535c.setVisibility(0);
                } else {
                    if (kVar.f71536d.contains(Integer.valueOf(C27187c.refresh.f71729id))) {
                        C23729p.m58257a(kVar.f71533a, 8);
                        z = false;
                    } else {
                        C23729p.m58257a(kVar.f71533a, 0);
                        z = true;
                    }
                    if (kVar.f71536d.contains(Integer.valueOf(C27187c.copylink.f71729id))) {
                        kVar.f71534b.setVisibility(8);
                    } else {
                        kVar.f71534b.setVisibility(0);
                        z = true;
                    }
                    if (kVar.f71536d.contains(Integer.valueOf(C27187c.openwithbrowser.f71729id))) {
                        kVar.f71535c.setVisibility(8);
                        z2 = z;
                    } else {
                        kVar.f71535c.setVisibility(0);
                    }
                }
                if (z2) {
                    MixActivityContainer.this.f71495i.mo55429a().showAsDropDown(view, 0, -12);
                }
            }
        });
        this.f71496j.post(new C27116j(this));
    }

    /* renamed from: H */
    private void m65358H() {
        this.f71501o = "3";
        if (getCrossPlatformParams().f71721d.f71812r) {
            mo54147c();
            return;
        }
        ((GradualChangeLinearLayout) m65361a((int) R.id.bfi)).setGradualChangeMode(false);
        this.f71497k.setVisibility(0);
        this.f71496j.mo55656b();
    }

    /* renamed from: I */
    private void m65359I() {
        String str = getCrossPlatformParams().f71718a.f71716m;
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) getCrossPlatformBusiness().mo55523a(QuickShopBusiness.class);
        if (quickShopBusiness != null) {
            quickShopBusiness.mo55513a(str);
        }
        C23089d a = C23089d.m56640a();
        a.mo47829a("method", this.f71494h);
        C26890h.m65011a("h5_leave_detail", a.f61491a);
        if (this.f71491e != null) {
            this.f71491e.run();
        }
    }

    /* renamed from: y */
    private void m65363y() {
        this.f71498l = (C27298a) m65361a((int) R.id.a2j);
        this.f71498l.setCrossPlatformActivityContainer(this);
        m65364z();
        m65351A();
        mo54149e().getViewStatusRegistry().mo55742a((C27304f) this);
        m65352B();
    }

    /* renamed from: z */
    private void m65364z() {
        this.f71500n = new C27235d() {
            /* renamed from: b */
            public final boolean mo52683b(WebView webView, String str) {
                if (MixActivityContainer.this.f71492f != null) {
                    return MixActivityContainer.this.f71492f.mo52683b(webView, str);
                }
                return false;
            }

            /* renamed from: a */
            public final void mo49880a(WebView webView, String str) {
                if (MixActivityContainer.this.f71492f != null) {
                    MixActivityContainer.this.f71492f.mo49880a(webView, str);
                }
            }

            /* renamed from: a */
            public final void mo52679a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (MixActivityContainer.this.f71492f != null) {
                    MixActivityContainer.this.f71492f.mo52679a(webView, sslErrorHandler, sslError);
                }
            }

            /* renamed from: a */
            public final void mo52681a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (MixActivityContainer.this.f71492f != null) {
                    MixActivityContainer.this.f71492f.mo52681a(webView, webResourceRequest, webResourceResponse);
                }
            }

            /* renamed from: a */
            public final void mo52680a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && MixActivityContainer.this.getCrossPlatformParams().f71721d.f71812r) {
                    if (!MixActivityContainer.this.f71488b.f71721d.f71808n) {
                        MixActivityContainer.this.mo55408t();
                        return;
                    } else {
                        MixActivityContainer.this.f71496j.setVisibility(0);
                        MixActivityContainer.this.f71497k.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f71492f != null) {
                    MixActivityContainer.this.f71492f.mo52680a(webView, webResourceRequest, webResourceError);
                }
            }

            /* renamed from: a */
            public final void mo52682a(WebView webView, String str, Bitmap bitmap) {
                if (MixActivityContainer.this.f71492f != null) {
                    MixActivityContainer.this.f71492f.mo52682a(webView, str, bitmap);
                }
            }

            /* renamed from: a */
            public final void mo52678a(WebView webView, int i, String str, String str2) {
                if (MixActivityContainer.this.getCrossPlatformParams().f71721d.f71812r) {
                    if (!MixActivityContainer.this.f71488b.f71721d.f71808n) {
                        MixActivityContainer.this.mo55408t();
                        return;
                    } else {
                        MixActivityContainer.this.f71496j.setVisibility(0);
                        MixActivityContainer.this.f71497k.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f71492f != null) {
                    MixActivityContainer.this.f71492f.mo52678a(webView, i, str, str2);
                }
            }
        };
        if (TextUtils.equals("1", this.f71488b.f71722e.f71821a)) {
            ((C27309j) mo54149e().mo55670a(C27309j.class)).mo55729a().setLoadNoCache();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo55372h() {
        if (getCrossPlatformParams().f71718a.f71704a.intValue() == 1) {
            this.f71494h = "phone_press";
            mo55410v();
            return;
        }
        if (!mo54149e().mo55681a() && this.f71491e != null) {
            this.f71491e.run();
        }
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f71502p = System.currentTimeMillis();
        C47718bf.m103290c(this);
        QuickShopBusiness quickShopBusiness = (QuickShopBusiness) getCrossPlatformBusiness().mo55523a(QuickShopBusiness.class);
        if (quickShopBusiness != null && quickShopBusiness.mo55512a().booleanValue()) {
            quickShopBusiness.f71670a = false;
            quickShopBusiness.f71671b = false;
            quickShopBusiness.f71672c = false;
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f71504r != null) {
            this.f71504r.destroy();
        }
        if (this.f71498l != null) {
            this.f71498l.mo55690g(this.f71487a);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f71490d.mo55523a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            if (passBackWebInfoBusiness.mo55502e()) {
                C0013i.m16a((Callable<TResult>) new C27158a<TResult>(passBackWebInfoBusiness));
            }
            passBackWebInfoBusiness.mo55496a().removeCallbacksAndMessages(null);
        }
        C27170a.m65585b();
        C47718bf.m103291d(this);
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        mo54149e().mo55685c(this.f71487a);
        this.f71490d.mo55524a();
        this.f71506t = System.currentTimeMillis();
        mo55392p();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f71490d.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55473a();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f71490d.mo55523a(PlayableBusiness.class);
        if (playableBusiness != null && !playableBusiness.f71663a) {
            playableBusiness.mo55508a(false, true);
        }
        this.f71503q = true;
    }

    /* renamed from: r */
    public final void mo55406r() {
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f71490d.mo55523a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.f71663a = false;
            playableBusiness.mo55508a(false, true);
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.m65563a((C27149c) this);
        if (a != null) {
            a.mo55511a((String) null);
        }
        if (this.f71487a != null) {
            C23729p.m58269c(this.f71487a);
        }
    }

    /* renamed from: t */
    public final void mo55408t() {
        this.f71501o = "1";
        this.f71497k.setVisibility(8);
        ((GradualChangeLinearLayout) m65361a((int) R.id.bfi)).setGradualChangeMode(false);
        this.f71496j.mo55655a();
        this.f71496j.setVisibility(0);
    }

    /* renamed from: u */
    public final void mo55409u() {
        if (!this.f71488b.f71721d.f71808n) {
            this.f71496j.setVisibility(0);
            mo55408t();
        } else if (!getCrossPlatformParams().f71721d.f71812r) {
            this.f71496j.setVisibility(0);
            this.f71497k.setVisibility(0);
        }
    }

    /* renamed from: E */
    private void m65355E() {
        if (!getCrossPlatformParams().f71718a.f71714k) {
            if (getCrossPlatformParams().f71718a.f71704a.intValue() == 2) {
                ((C27303e) mo54149e().mo55670a(C27303e.class)).mo55728a(getCrossPlatformParams());
                return;
            }
            ((C27309j) mo54149e().mo55670a(C27309j.class)).mo55730a(C27148b.m65490a(getCrossPlatformParams().f71718a.f71706c, m65356F()));
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        mo54149e().mo55687d(this.f71487a);
        long currentTimeMillis = System.currentTimeMillis() - this.f71506t;
        this.f71506t = 0;
        C23089d a = C23089d.m56640a();
        a.mo47827a("duration", currentTimeMillis);
        C26890h.m65011a("h5_stay_time", a.f61491a);
        mo55391o();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f71490d.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55480a(false);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f71490d.mo55523a(PlayableBusiness.class);
        if (playableBusiness != null && !playableBusiness.f71663a) {
            playableBusiness.mo55508a(true, false);
        }
    }

    /* renamed from: s */
    public final void mo55407s() {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f71490d.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55480a(true);
        }
        C27170a.m65585b();
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f71490d.mo55523a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.f71663a = true;
            playableBusiness.mo55508a(true, false);
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.m65563a((C27149c) this);
        if (a != null) {
            a.mo55509a();
        }
        if (this.f71487a != null && VERSION.SDK_INT >= 23) {
            this.f71487a.getWindow().getDecorView().setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: w */
    public final void mo55411w() {
        if (!this.f71487a.isFinishing()) {
            this.f71505s.setBackgroundColor(this.f71488b.f71721d.f71820z);
            if (((C27309j) mo54149e().mo55670a(C27309j.class)).mo55729a().canGoBack()) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) this.f71496j.mo55654a(R.id.ug);
                C52711k.m112236a((Object) autoRTLImageView, "close_all_webpage");
                autoRTLImageView.setVisibility(0);
                return;
            }
            this.f71496j.mo55657c();
        }
    }

    /* renamed from: x */
    private boolean m65362x() {
        JSONObject jSONObject;
        if (getCrossPlatformParams().f71718a.f71704a.intValue() == 1) {
            if (getCrossPlatformParams().f71718a.f71712i) {
                C18898c.m46009a(this.f71487a, C23060d.f61428b, "push");
            }
            if (!C9431p.m18664a(getCrossPlatformParams().f71719b.f71755j)) {
                if (!C9431p.m18664a(getCrossPlatformParams().f71719b.f71756k)) {
                    try {
                        jSONObject = new JSONObject(getCrossPlatformParams().f71719b.f71756k);
                    } catch (Exception unused) {
                    }
                    C18898c.m46012a(this.f71487a.getApplicationContext(), "wap_stat", "wap_enter", getCrossPlatformParams().f71719b.f71755j, 0, 0, jSONObject);
                }
                jSONObject = null;
                C18898c.m46012a(this.f71487a.getApplicationContext(), "wap_stat", "wap_enter", getCrossPlatformParams().f71719b.f71755j, 0, 0, jSONObject);
            }
            if (TextUtils.isEmpty(getCrossPlatformParams().f71718a.f71706c)) {
                return false;
            }
            return C19547d.m47842a(getCrossPlatformParams().f71718a.f71706c);
        } else if (getCrossPlatformParams().f71720c.f71783j != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final void mo54145b() {
        ImmersionBar immersionBar = null;
        if (this.f71504r != null) {
            this.f71504r.destroy();
            this.f71504r = null;
        }
        C27182a crossPlatformParams = getCrossPlatformParams();
        Activity activity = this.f71487a;
        if (C47888fj.m103588a()) {
            if (crossPlatformParams.f71718a.f71704a.intValue() != 2) {
                activity.findViewById(R.id.a2k).setPadding(0, C47888fj.m103589b(), 0, 0);
            }
            Window window = activity.getWindow();
            boolean z = true;
            if (window != null && VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            immersionBar = ImmersionBar.with(activity).keyboardEnable(true, 32);
            immersionBar.init();
            if (crossPlatformParams.f71721d.f71811q) {
                C27146a.m65492a(activity);
                if (!crossPlatformParams.f71721d.f71793E) {
                    crossPlatformParams.f71721d.f71812r = true;
                }
            } else {
                z = false;
            }
            if (crossPlatformParams.f71721d.f71812r) {
                C47888fj.m103587a(activity, 0);
            }
            C47887fi.f120483a.mo95098a(activity, activity.getWindow(), crossPlatformParams.f71721d.f71796b);
            if (C27146a.m65495a(crossPlatformParams, activity)) {
                if (!z) {
                    C27146a.m65492a(activity);
                }
                C47888fj.m103586a(activity);
                if (VERSION.SDK_INT >= 21) {
                    crossPlatformParams.f71721d.f71814t = activity.getWindow().getStatusBarColor();
                }
            } else if (!crossPlatformParams.f71721d.f71811q) {
                if (crossPlatformParams.f71721d.f71814t != -2) {
                    C47888fj.m103587a(activity, crossPlatformParams.f71721d.f71814t);
                } else if (VERSION.SDK_INT >= 21) {
                    crossPlatformParams.f71721d.f71814t = activity.getWindow().getStatusBarColor();
                }
            }
        }
        this.f71504r = immersionBar;
        if (C27198d.m65618a()) {
            C47806dd.m103441a(this.f71487a, this.f71487a.getResources().getColor(R.color.a1v));
        }
    }

    /* renamed from: A */
    private void m65351A() {
        this.f71493g = (OpenURLHintLayout) m65361a((int) R.id.a2k);
        this.f71505s = (GradualChangeLinearLayout) m65361a((int) R.id.bfi);
        if (this.f71488b.f71721d.f71801g != -2) {
            this.f71505s.setBackgroundColor(this.f71488b.f71721d.f71801g);
        } else {
            this.f71505s.setBackgroundColor(this.f71487a.getResources().getColor(R.color.a2j));
        }
        if (this.f71488b.f71721d.f71807m != -2) {
            this.f71493g.setBackgroundColor(this.f71488b.f71721d.f71807m);
            this.f71487a.getWindow().setBackgroundDrawableResource(17170445);
            C23448w.m57574b(this.f71487a);
        }
        m65353C();
        this.f71495i = new C27117k(this.f71487a, this);
        new C27119m(this.f71487a, this).mo55432a();
        mo55389m();
        if (this.f71488b.f71721d.f71816v) {
            C10643a aVar = new C10643a(this.f71487a);
            aVar.mo18899b((int) R.string.cip).mo18900b((int) R.string.ahf, C27115i.f71531a);
            aVar.mo18897a().mo18882b();
        }
        m65354D();
        this.f71490d.mo55523a(OpenUrlHintBusiness.class);
        OpenUrlHintBusiness.m65549a(this.f71493g, this.f71488b.f71718a.f71713j);
        m65357G();
        if (getCrossPlatformParams().f71721d.f71812r) {
            mo54147c();
        }
        if (!this.f71488b.f71721d.f71808n) {
            mo55408t();
        } else {
            m65358H();
        }
        if (getCrossPlatformParams().f71721d.f71810p) {
            m65361a((int) R.id.a2k).setPadding(0, C47888fj.m103589b(), 0, 0);
        }
        if (getCrossPlatformParams().f71721d.f71793E) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f71496j.getLayoutParams();
            int i = getCrossPlatformParams().f71721d.f71794F;
            if (i < 0) {
                i = C47888fj.m103589b();
            }
            layoutParams.setMargins(0, i, 0, 0);
            this.f71496j.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo55369a() {
        if (TextUtils.isEmpty(this.f71488b.f71718a.f71706c)) {
            return false;
        }
        boolean x = m65362x();
        this.f71490d.mo55525a(this.f71488b);
        return x;
    }

    /* renamed from: a */
    public final void mo55368a(Runnable runnable) {
        this.f71491e = runnable;
    }

    /* renamed from: a */
    private <T extends View> T m65361a(int i) {
        return this.f71487a.findViewById(i);
    }

    /* renamed from: a */
    public final <T extends C27308i> T mo55364a(Class<T> cls) {
        return mo54149e().mo55670a(cls);
    }

    /* renamed from: b */
    public final void mo55371b(C23423b bVar) {
        synchronized (this.f71507u) {
            this.f71507u.remove(bVar);
        }
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        if (this.f71503q && aVar != null && aVar.f62554a != null && aVar.f62554a.contains("/aweme/v1/poi/aweme/?")) {
            C47718bf.m103293f(aVar);
            mo54149e().mo55673a(aVar);
        }
    }

    @C53771m
    public final void onEvent(C35471h hVar) {
        if (TextUtils.equals("web", hVar.itemType)) {
            C47881fd.m103578a(this.f71487a, this.f71496j, hVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo55366a(Configuration configuration) {
        if (!this.f71488b.f71721d.f71792D) {
            this.f71493g.setLayoutParams(new FrameLayout.LayoutParams(Double.valueOf((double) C9432q.m18687b((Context) this.f71487a, (float) configuration.screenWidthDp)).intValue(), Double.valueOf((double) C9432q.m18687b((Context) this.f71487a, (float) configuration.screenHeightDp)).intValue()));
        }
    }

    @C53771m
    public final void onEvent(C27094a aVar) {
        if (aVar != null && aVar.f71463a != null && m65360J()) {
            String str = aVar.f71463a;
            char c = 65535;
            if (str.hashCode() == 51 && str.equals("3")) {
                c = 0;
            }
            if (c == 0 && "1".equals(this.f71501o)) {
                m65358H();
            }
        }
    }

    /* renamed from: a */
    public final void mo55367a(C23423b bVar) {
        synchronized (this.f71507u) {
            this.f71507u.add(bVar);
        }
    }

    /* renamed from: b */
    public final void mo54146b(String str) {
        if (this.f71489c != null && !TextUtils.equals(str, this.f71489c.getString("url"))) {
            this.f71489c.putString("url", str);
            this.f71488b = C27183a.m65605a(this.f71489c);
            m65351A();
        }
        ((C27309j) mo54149e().mo55670a(C27309j.class)).mo55730a(str);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f71490d.mo55523a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo55473a();
        }
    }

    @C53771m
    public void onEvent(C27098d dVar) {
        if (this.f71499m != null) {
            C27111f fVar = this.f71499m;
            if (!C9376b.m18558a((Collection<T>) C27108c.m65414a())) {
                if (fVar.f71526d == null) {
                    fVar.mo55423b();
                    return;
                }
                C27105a aVar = fVar.f71526d;
                LinkedList<C27112g> a = C27108c.m65414a();
                C52711k.m112240b(a, "list");
                aVar.f71512a = a;
                aVar.notifyDataSetChanged();
            }
        }
    }

    @C53771m
    public final void invokeRenderTimeEvent(C29906l lVar) {
        C22528r rVar;
        if (this.f71503q && lVar.f78045b != null) {
            if (TextUtils.equals("goods_rn_page_monitor", lVar.f78045b.optString("eventName"))) {
                try {
                    JSONObject jSONObject = lVar.f78045b.getJSONObject("data");
                    C25560e eVar = new C25560e();
                    eVar.f67583p = Long.valueOf(Long.valueOf(jSONObject.optString("interact_render_ts")).longValue() - this.f71502p);
                    eVar.f67585r = jSONObject.optString("page_id");
                    eVar.f67582o = Long.valueOf(Long.valueOf(jSONObject.optString("ender_render_ts")).longValue() - this.f71502p);
                    eVar.f67584q = jSONObject.optString("session_id");
                    C25539a.m62079a().logCommerceEvents("commerce_page_render_time", eVar);
                } catch (Exception unused) {
                }
            } else if (TextUtils.equals("hybrid_prefetch_duration_monitor", lVar.f78045b.optString("eventName"))) {
                C27271c cVar = new C27271c();
                try {
                    JSONObject jSONObject2 = lVar.f78045b.getJSONObject("data");
                    cVar.f71945b.put("duration", Long.valueOf(jSONObject2.optString("duration")).longValue());
                    cVar.f71944a.put("duration_type", jSONObject2.optString("duration_type"));
                    cVar.f71944a.put("is_cache", jSONObject2.optString("is_cache"));
                    cVar.f71944a.put("page_id", jSONObject2.optString("page_id"));
                    if (this.f71498l != null) {
                        cVar.f71947d = this.f71498l.getMonitorSession();
                    }
                    C27132a.m65458a();
                    C22521l lVar2 = cVar.f71947d;
                    if (lVar2 != null) {
                        rVar = (C22528r) lVar2.mo46870a(C22528r.class);
                    } else {
                        rVar = null;
                    }
                    C27131c.m65448a(rVar, "hybrid_prefetch_duration_monitor", "invoke_render_event", cVar.f71944a, cVar.f71945b, cVar.f71946c);
                } catch (Exception unused2) {
                }
            }
        }
    }

    @C53771m
    public void onEvent(C29793b bVar) {
        if (bVar != null && bVar.f77802a != 0) {
            C27298a e = mo54149e();
            if (e != null) {
                C27309j jVar = (C27309j) e.mo55670a(C27309j.class);
                if (jVar != null) {
                    SingleWebView a = jVar.mo55729a();
                    if (!(a == null || this.f71491e == null || a.hashCode() != bVar.f77802a)) {
                        this.f71491e.run();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54144a(String str) {
        mo54143a((CharSequence) str, true);
    }

    @C53771m
    public void onEvent(C29803b bVar) {
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.m65563a((C27149c) this);
        if (a != null) {
            a.mo55510a(mo54149e(), bVar);
        } else if (bVar != null && bVar.f77824b != null && bVar.f77823a != 0) {
            SingleWebView a2 = ((C27309j) mo54149e().mo55670a(C27309j.class)).mo55729a();
            if (a2 != null && a2.hashCode() == bVar.f77823a) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 1);
                    jSONObject.put("preloadType", 0);
                    String str = this.f71488b.f71719b.f71741E;
                    if ("splash".equals(str)) {
                        jSONObject.put("scene", 2);
                    } else if ("feedad".equals(str)) {
                        jSONObject.put("scene", 1);
                    }
                } catch (JSONException unused) {
                }
                bVar.f77824b.mo60041a(jSONObject);
            }
        }
    }

    MixActivityContainer(Activity activity, C27182a aVar) {
        this.f71487a = activity;
        this.f71488b = aVar;
        this.f71490d = C27178a.m65596a(this);
    }

    /* renamed from: a */
    public final void mo55365a(int i, Intent intent) {
        this.f71487a.setResult(50000, intent);
    }

    /* renamed from: a */
    public final void mo54143a(CharSequence charSequence, boolean z) {
        if (this.f71496j != null) {
            if ((TextUtils.isEmpty(charSequence) || !C27148b.m65496a(charSequence)) && this.f71488b.f71718a.f71704a != null && this.f71488b.f71718a.f71704a.intValue() == 1 && (this.f71488b.f71721d.f71817w || z)) {
                this.f71496j.setTitle(charSequence);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo48596a(int i, int i2, Intent intent) {
        this.f71490d.mo55523a(WalletBusiness.class);
        String currentUrl = mo54149e().getCurrentUrl();
        if (currentUrl != null && currentUrl.contains("wallet/home")) {
            C47718bf.m103288a(new C19717a().mo41119a(i).mo41121b(i2).mo41120a(intent));
        }
        HashSet<C23423b> hashSet = new HashSet<>();
        synchronized (this.f71507u) {
            hashSet.addAll(this.f71507u);
        }
        if (!hashSet.isEmpty()) {
            for (C23423b a : hashSet) {
                a.mo48596a(i, i2, intent);
            }
        }
        return false;
    }
}
