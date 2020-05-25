package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Space;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p521a.C9369a;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.bullet.kit.p644rn.p646c.C10460c;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.C10528k;
import com.bytedance.ies.bullet.kit.web.C10529l;
import com.bytedance.ies.bullet.kit.web.p648a.C10484a;
import com.bytedance.ies.bullet.kit.web.p648a.C10488e;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10423r;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10564a;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10575d;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.sdk.activity.p1208a.C19723a;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.bullet.business.DownloadBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.ReportBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24326a;
import com.p683ss.android.ugc.aweme.bullet.module.base.p1479a.C24330b;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24296b;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24302c;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24303d;
import com.p683ss.android.ugc.aweme.bullet.p1470a.C24099a;
import com.p683ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.p683ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.C24350a;
import com.p683ss.android.ugc.aweme.commerce.service.p1543i.C25551b.C25552a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26529n;
import com.p683ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.C27111f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseMethod.C29793b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a */
public abstract class C24316a extends C24099a {

    /* renamed from: z */
    public static final C24317a f64535z = new C24317a(null);

    /* renamed from: A */
    private C24326a f64536A;

    /* renamed from: a */
    private C27111f f64537a;

    /* renamed from: b */
    private DmtStatusView f64538b;

    /* renamed from: c */
    private Callable<C24336d> f64539c;

    /* renamed from: d */
    protected View f64540d;

    /* renamed from: e */
    public BulletCommonTitleBar f64541e;

    /* renamed from: f */
    public Space f64542f;

    /* renamed from: g */
    public OpenURLHintLayout f64543g;

    /* renamed from: h */
    public SSWebView f64544h;

    /* renamed from: i */
    public C10290i f64545i;

    /* renamed from: j */
    public C24336d f64546j;

    /* renamed from: k */
    public C10460c f64547k;

    /* renamed from: l */
    public C24302c f64548l;

    /* renamed from: m */
    public String f64549m;

    /* renamed from: n */
    public C24330b f64550n;

    /* renamed from: o */
    public OnClickListener f64551o;

    /* renamed from: p */
    public Runnable f64552p = new C24318b(this);

    /* renamed from: q */
    public Activity f64553q;

    /* renamed from: r */
    public boolean f64554r;

    /* renamed from: s */
    List<String> f64555s;

    /* renamed from: t */
    public long f64556t;

    /* renamed from: u */
    public String f64557u;

    /* renamed from: v */
    public String f64558v = "";

    /* renamed from: w */
    public C10488e f64559w;

    /* renamed from: x */
    public final C10326b f64560x;

    /* renamed from: y */
    public final C24254b f64561y;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$a */
    public static final class C24317a {
        private C24317a() {
        }

        public /* synthetic */ C24317a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$b */
    static final class C24318b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24316a f64562a;

        C24318b(C24316a aVar) {
            this.f64562a = aVar;
        }

        public final void run() {
            Activity activity = this.f64562a.f64553q;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$c */
    static final class C24319c<V> implements Callable<C24336d> {

        /* renamed from: a */
        final /* synthetic */ C10423r f64563a;

        C24319c(C10423r rVar) {
            this.f64563a = rVar;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return (C24336d) this.f64563a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$d */
    static final class C24320d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24316a f64564a;

        C24320d(C24316a aVar) {
            this.f64564a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SSWebView sSWebView = this.f64564a.f64544h;
            if (sSWebView != null) {
                sSWebView.reload();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$e */
    public static final class C24321e implements C24350a {

        /* renamed from: a */
        final /* synthetic */ C24316a f64565a;

        /* renamed from: d */
        public final void mo50114d() {
            this.f64565a.f64552p.run();
        }

        /* renamed from: b */
        public final void mo50112b() {
            String str;
            if (((ReportBusiness) this.f64565a.f64561y.mo50011a(ReportBusiness.class)) != null) {
                Activity activity = this.f64565a.f64553q;
                C24336d dVar = this.f64565a.f64546j;
                if (dVar != null) {
                    str = dVar.mo50124e();
                } else {
                    str = null;
                }
                ReportBusiness.m59365a(activity, str);
            }
        }

        /* renamed from: c */
        public final void mo50113c() {
            if (this.f64565a.f64554r) {
                if (((ShareBusiness) this.f64565a.f64561y.mo50011a(ShareBusiness.class)) != null) {
                    WebView webView = this.f64565a.f64544h;
                    if (webView != null) {
                        String str = "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());";
                        C18984e.m46161a(str);
                        webView.loadUrl(str);
                    }
                }
                return;
            }
            ShareBusiness shareBusiness = (ShareBusiness) this.f64565a.f64561y.mo50011a(ShareBusiness.class);
            if (shareBusiness != null) {
                shareBusiness.mo49966b();
            }
        }

        /* renamed from: a */
        public final void mo50110a() {
            String str;
            this.f64565a.f64557u = "click_button";
            C24316a aVar = this.f64565a;
            SSWebView sSWebView = aVar.f64544h;
            if (sSWebView == null || !sSWebView.mo18793b()) {
                QuickShopBusiness quickShopBusiness = (QuickShopBusiness) aVar.f64561y.mo50011a(QuickShopBusiness.class);
                if (quickShopBusiness != null) {
                    C24336d dVar = aVar.f64546j;
                    if (dVar != null) {
                        str = dVar.mo50132m();
                    } else {
                        str = null;
                    }
                    quickShopBusiness.mo50006a(str);
                }
                C23089d a = C23089d.m56640a();
                a.mo47829a("method", aVar.f64557u);
                C26890h.m65011a("h5_leave_detail", a.f61491a);
                aVar.f64552p.run();
            } else {
                SSWebView sSWebView2 = aVar.f64544h;
                if (sSWebView2 != null) {
                    sSWebView2.goBack();
                }
            }
        }

        C24321e(C24316a aVar) {
            this.f64565a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50111a(android.view.View r8) {
            /*
                r7 = this;
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                com.ss.android.ugc.aweme.bullet.module.base.a r0 = r7.f64565a
                com.ss.android.ugc.aweme.bullet.module.base.a.b r0 = r0.f64550n
                if (r0 == 0) goto L_0x009a
                java.util.List<java.lang.Integer> r1 = r0.f64591e
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0071
                java.util.List<java.lang.Integer> r1 = r0.f64591e
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x001a
                goto L_0x0071
            L_0x001a:
                java.util.List<java.lang.Integer> r1 = r0.f64591e
                com.ss.android.ugc.aweme.crossplatform.c.a.c r4 = com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27187c.refresh
                int r4 = r4.f71729id
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                boolean r1 = r1.contains(r4)
                r4 = 8
                if (r1 == 0) goto L_0x0033
                android.view.View r1 = r0.f64588b
                com.p683ss.android.ugc.aweme.base.utils.C23729p.m58257a(r1, r4)
                r1 = 0
                goto L_0x0039
            L_0x0033:
                android.view.View r1 = r0.f64588b
                com.p683ss.android.ugc.aweme.base.utils.C23729p.m58257a(r1, r3)
                r1 = 1
            L_0x0039:
                java.util.List<java.lang.Integer> r5 = r0.f64591e
                com.ss.android.ugc.aweme.crossplatform.c.a.c r6 = com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27187c.copylink
                int r6 = r6.f71729id
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r5 = r5.contains(r6)
                if (r5 == 0) goto L_0x004f
                android.view.View r5 = r0.f64589c
                r5.setVisibility(r4)
                goto L_0x0055
            L_0x004f:
                android.view.View r1 = r0.f64589c
                r1.setVisibility(r3)
                r1 = 1
            L_0x0055:
                java.util.List<java.lang.Integer> r5 = r0.f64591e
                com.ss.android.ugc.aweme.crossplatform.c.a.c r6 = com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27187c.openwithbrowser
                int r6 = r6.f71729id
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r5 = r5.contains(r6)
                if (r5 == 0) goto L_0x006b
                android.view.View r0 = r0.f64590d
                r0.setVisibility(r4)
                goto L_0x0081
            L_0x006b:
                android.view.View r0 = r0.f64590d
                r0.setVisibility(r3)
                goto L_0x0080
            L_0x0071:
                android.view.View r1 = r0.f64588b
                r1.setVisibility(r3)
                android.view.View r1 = r0.f64589c
                r1.setVisibility(r3)
                android.view.View r0 = r0.f64590d
                r0.setVisibility(r3)
            L_0x0080:
                r1 = 1
            L_0x0081:
                if (r1 != r2) goto L_0x0099
                com.ss.android.ugc.aweme.bullet.module.base.a r0 = r7.f64565a
                com.ss.android.ugc.aweme.bullet.module.base.a.b r0 = r0.f64550n
                if (r0 == 0) goto L_0x0099
                com.ss.android.ugc.aweme.bullet.module.base.a r1 = r7.f64565a
                android.view.View$OnClickListener r1 = r1.f64551o
                android.widget.PopupWindow r0 = r0.mo50122a(r1)
                if (r0 == 0) goto L_0x0099
                r1 = -12
                r0.showAsDropDown(r8, r3, r1)
                return
            L_0x0099:
                return
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24316a.C24321e.mo50111a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$f */
    static final class C24322f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24316a f64566a;

        /* renamed from: b */
        final /* synthetic */ Activity f64567b;

        C24322f(C24316a aVar, Activity activity) {
            this.f64566a = aVar;
            this.f64567b = activity;
        }

        public final void onClick(View view) {
            Integer num;
            ClickInstrumentation.onClick(view);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            C24330b bVar = this.f64566a.f64550n;
            if (!(bVar == null || bVar.f64587a == null)) {
                bVar.f64587a.dismiss();
            }
            if (!TextUtils.isEmpty(this.f64566a.f64549m)) {
                if (num != null && num.intValue() == R.id.buz) {
                    Activity activity = this.f64567b;
                    String str = this.f64566a.f64549m;
                    if (!C9431p.m18664a(str)) {
                        try {
                            Intent intent = new Intent();
                            intent.setData(Uri.parse(str));
                            intent.setAction("android.intent.action.VIEW");
                            if (activity != null) {
                                activity.startActivity(intent);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else if (num != null && num.intValue() == R.id.a0m) {
                    Activity activity2 = this.f64567b;
                    String str2 = this.f64566a.f64549m;
                    if (!C9431p.m18664a(str2)) {
                        Context context = activity2;
                        C9369a.m18549a(context, "", str2);
                        C9432q.m18673a(context, 2131952872, (int) R.string.e0n);
                    }
                } else if (num != null && num.intValue() == R.id.f133595cat) {
                    SSWebView sSWebView = this.f64566a.f64544h;
                    if (sSWebView != null) {
                        sSWebView.reload();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$g */
    static final class C24323g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C24323g f64568a = new C24323g();

        C24323g() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$h */
    public static final class C24324h extends C10484a {

        /* renamed from: a */
        final /* synthetic */ C24316a f64569a;

        /* renamed from: b */
        private View f64570b;

        C24324h(C24316a aVar) {
            this.f64569a = aVar;
        }

        /* renamed from: c */
        public final void mo18588c(C10524g gVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            ((ViewGroup) this.f64569a.mo50101j().findViewById(R.id.e11)).removeView(this.f64570b);
            this.f64570b = null;
            this.f64569a.mo50103m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
            if (r0 == null) goto L_0x0011;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo18580a(com.bytedance.ies.bullet.kit.web.C10524g r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "kitContainerApi"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.bullet.module.base.a r7 = r6.f64569a
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                if (r8 == 0) goto L_0x0011
                java.lang.String r0 = r8.toString()
                if (r0 != 0) goto L_0x0013
            L_0x0011:
                java.lang.String r0 = ""
            L_0x0013:
                java.lang.String r1 = "http"
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r1 = p2628d.p2650m.C52830p.m112411b(r0, r1, r4, r3, r2)
                r5 = 1
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = "https"
                boolean r1 = p2628d.p2650m.C52830p.m112411b(r0, r1, r4, r3, r2)
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = "about:"
                boolean r0 = p2628d.p2650m.C52830p.m112411b(r0, r1, r4, r3, r2)
                if (r0 == 0) goto L_0x0030
                goto L_0x0032
            L_0x0030:
                r0 = 0
                goto L_0x0033
            L_0x0032:
                r0 = 1
            L_0x0033:
                if (r0 != 0) goto L_0x005d
                com.ss.android.ugc.aweme.bullet.module.base.d r0 = r7.f64546j
                if (r0 == 0) goto L_0x005c
                com.bytedance.ies.bullet.b.i.b r0 = r0.f64615an
                java.lang.Object r0 = r0.mo18457b()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r0 == 0) goto L_0x0047
                boolean r4 = r0.booleanValue()
            L_0x0047:
                if (r4 != r5) goto L_0x005d
                boolean r0 = android.text.TextUtils.isEmpty(r8)
                if (r0 != 0) goto L_0x005d
                com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar r7 = r7.f64541e
                if (r7 == 0) goto L_0x005d
                if (r8 != 0) goto L_0x0058
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0058:
                r7.setTitle(r8)
                return
            L_0x005c:
                return
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24316a.C24324h.mo18580a(com.bytedance.ies.bullet.kit.web.g, java.lang.String):void");
        }

        /* renamed from: a */
        public final void mo18578a(C10524g gVar, View view, CustomViewCallback customViewCallback) {
            C52711k.m112240b(gVar, "kitContainerApi");
            this.f64570b = view;
            ((ViewGroup) this.f64569a.mo50101j().findViewById(R.id.e11)).addView(this.f64570b);
            this.f64569a.mo50102l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$i */
    public static final class C24325i extends C10488e {

        /* renamed from: a */
        final /* synthetic */ C24316a f64571a;

        C24325i(C24316a aVar) {
            this.f64571a = aVar;
        }

        /* renamed from: a */
        public final void mo18607a(C10524g gVar, String str) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64571a.f64559w;
            if (eVar != null) {
                eVar.mo18607a(gVar, str);
            }
            C24316a aVar = this.f64571a;
            C52711k.m112240b(gVar, "kitContainerApi");
            ShareBusiness shareBusiness = (ShareBusiness) aVar.f64561y.mo50011a(ShareBusiness.class);
            if (shareBusiness != null) {
                shareBusiness.f64302e = true;
            }
        }

        /* renamed from: a */
        public final void mo18604a(C10524g gVar, SslErrorHandler sslErrorHandler, SslError sslError) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64571a.f64559w;
            if (eVar != null) {
                eVar.mo18604a(gVar, sslErrorHandler, sslError);
            }
        }

        /* renamed from: a */
        public final void mo18605a(C10524g gVar, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64571a.f64559w;
            if (eVar != null) {
                eVar.mo18605a(gVar, webResourceRequest, webResourceResponse);
            }
        }

        /* renamed from: a */
        public final void mo18606a(C10524g gVar, C10529l lVar, C10528k kVar) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64571a.f64559w;
            if (eVar != null) {
                eVar.mo18606a(gVar, lVar, kVar);
            }
        }

        /* renamed from: a */
        public final void mo18608a(C10524g gVar, String str, Bitmap bitmap) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64571a.f64559w;
            if (eVar != null) {
                eVar.mo18608a(gVar, str, bitmap);
            }
            C24316a aVar = this.f64571a;
            C52711k.m112240b(gVar, "kitContainerApi");
            ShareBusiness shareBusiness = (ShareBusiness) aVar.f64561y.mo50011a(ShareBusiness.class);
            if (shareBusiness != null) {
                shareBusiness.f64302e = false;
            }
        }

        /* renamed from: a */
        public final void mo18602a(C10524g gVar, int i, String str, String str2) {
            C52711k.m112240b(gVar, "kitContainerApi");
            C10488e eVar = this.f64571a.f64559w;
            if (eVar != null) {
                eVar.mo18602a(gVar, i, str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50036a(Activity activity) {
        C52711k.m112240b(activity, "activity");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50037a(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50098a(C24336d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo50040e() {
        return R.layout.b5j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo50043h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50099a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f64558v = str;
    }

    /* renamed from: a */
    public final void mo18699a(List<? extends C10575d<? extends View>> list, Uri uri, C10290i iVar, boolean z) {
        C52711k.m112240b(list, "viewComponents");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        if (iVar instanceof C10524g) {
            C10524g gVar = (C10524g) iVar;
            WebView m_ = gVar.mo18665m_();
            if (this.f64544h == null && (m_ instanceof SSWebView)) {
                boolean z2 = false;
                m_.setBackgroundColor(0);
                this.f64544h = (SSWebView) m_;
                SSWebView sSWebView = this.f64544h;
                if (sSWebView != null) {
                    C24326a aVar = new C24326a(sSWebView, false, false, null, 14, null);
                    this.f64536A = aVar;
                    C24326a aVar2 = this.f64536A;
                    if (aVar2 != null) {
                        sSWebView.setWebViewEventDelegate(aVar2);
                    }
                }
                ShareBusiness shareBusiness = (ShareBusiness) this.f64561y.mo50011a(ShareBusiness.class);
                if (shareBusiness != null) {
                    shareBusiness.f64356l = this.f64544h;
                }
                DownloadBusiness downloadBusiness = (DownloadBusiness) this.f64561y.mo50011a(DownloadBusiness.class);
                if (downloadBusiness != null) {
                    downloadBusiness.mo49982a(this.f64544h);
                }
                SSWebView sSWebView2 = this.f64544h;
                if (sSWebView2 != null) {
                    C19723a a = C26529n.m64186a();
                    if (a != null) {
                        sSWebView2.setTimeInterval(a.getAutoJumpInterval());
                        this.f64555s = a.getPauseList();
                    }
                    C24336d dVar = this.f64546j;
                    if (dVar != null) {
                        Boolean bool = (Boolean) dVar.f28106k.mo18457b();
                        if (bool != null ? bool.booleanValue() : false) {
                            sSWebView2.setLayerType(1, null);
                        }
                        Boolean bool2 = (Boolean) dVar.f64613al.mo18457b();
                        if (bool2 != null) {
                            z2 = bool2.booleanValue();
                        }
                        if (z2 && VERSION.SDK_INT >= 17) {
                            try {
                                WebSettings settings = sSWebView2.getSettings();
                                C52711k.m112236a((Object) settings, "settings");
                                IESSettingsProxy b = C32816h.m75716b();
                                C52711k.m112236a((Object) b, "SettingsReader.get()");
                                settings.setMediaPlaybackRequiresUserGesture(!b.getEnableAudioAutoPlay().booleanValue());
                            } catch (Exception unused) {
                                WebSettings settings2 = sSWebView2.getSettings();
                                C52711k.m112236a((Object) settings2, "settings");
                                settings2.setMediaPlaybackRequiresUserGesture(true);
                            }
                        }
                    }
                }
            }
            this.f64561y.mo50013a(m_);
            this.f64561y.mo50015a(gVar.mo18664j());
            this.f64561y.mo50014a(iVar.mo18349g());
        }
    }

    /* renamed from: a */
    public void mo18698a(C10290i iVar, Uri uri, C10423r rVar) {
        Object obj;
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(rVar, "paramsBundle");
        this.f64545i = iVar;
        if (rVar instanceof C10578a) {
            if (rVar instanceof C24336d) {
                this.f64546j = (C24336d) rVar;
            } else if (rVar instanceof C10460c) {
                this.f64547k = (C10460c) rVar;
            }
            this.f64548l = (C24302c) iVar.mo18341a(C24302c.class);
            C24303d.f64458a.mo50053a(this.f64560x, iVar, this.f64548l);
            if (!(this instanceof C24296b) || this.f64546j == null || mo50041f()) {
                C10578a aVar = (C10578a) rVar;
                this.f64561y.mo50016a(aVar);
                this.f64561y.mo50017a(this.f64548l);
                Activity activity = this.f64553q;
                if (activity != null) {
                    if (this.f64551o == null) {
                        this.f64551o = new C24322f(this, activity);
                    }
                    this.f64550n = new C24330b(activity, this.f64551o);
                }
                Boolean bool = null;
                if (TextUtils.isEmpty((CharSequence) aVar.f28119x.mo18457b())) {
                    C10385f<String> fVar = aVar.f28119x;
                    C24336d dVar = this.f64546j;
                    if (dVar != null) {
                        C10385f<String> fVar2 = dVar.f64616ao;
                        if (fVar2 != null) {
                            obj = (String) fVar2.mo18457b();
                            fVar.mo18456a(obj);
                        }
                    }
                    obj = null;
                    fVar.mo18456a(obj);
                }
                C24336d dVar2 = this.f64546j;
                if (dVar2 != null) {
                    C10385f<Boolean> fVar3 = dVar2.f27975b;
                    if (fVar3 != null) {
                        bool = (Boolean) fVar3.mo18457b();
                    }
                }
                boolean z = false;
                if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                    aVar.f28100G.mo18456a(Boolean.valueOf(false));
                }
                m59604a(aVar);
                C24336d dVar3 = this.f64546j;
                if (dVar3 != null) {
                    Boolean bool2 = (Boolean) dVar3.f64611aj.mo18457b();
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                    }
                    if (z) {
                        C10643a aVar2 = new C10643a(this.f64553q);
                        aVar2.mo18899b((int) R.string.cip).mo18900b((int) R.string.ahf, (DialogInterface.OnClickListener) C24323g.f64568a);
                        aVar2.mo18897a().mo18882b();
                    }
                    mo50098a(dVar3);
                }
                if (C52711k.m112239a((Object) (Boolean) aVar.f28114s.mo18457b(), (Object) Boolean.valueOf(true))) {
                    C20141b.m49698a((View) this.f64541e, 8);
                    C20141b.m49698a((View) this.f64542f, 8);
                }
            }
        }
    }

    /* renamed from: b */
    public final C10564a mo18750b() {
        return new BaseCommonBizRootContainer$provideActivityDelegate$1(this);
    }

    /* renamed from: c */
    public final C10484a mo49857c() {
        return new C24324h(this);
    }

    /* renamed from: d */
    public final C10488e mo49858d() {
        return new C24325i(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final View mo50101j() {
        View view = this.f64540d;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        return view;
    }

    /* renamed from: a */
    public final ViewGroup mo18746a() {
        View view = this.f64540d;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        View findViewById = view.findViewById(R.id.e11);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.….bullet_container_layout)");
        return (ViewGroup) findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo50041f() {
        String str;
        mo50042g();
        C24336d dVar = this.f64546j;
        if (dVar != null) {
            str = dVar.mo50130k();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo50102l() {
        C20141b.m49698a((View) this.f64541e, 8);
        C20141b.m49698a((View) this.f64542f, 8);
    }

    /* renamed from: k */
    protected static boolean m59605k() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            AdLandingPageConfig adLandingPageConfig = b.getAdLandingPageConfig();
            C52711k.m112236a((Object) adLandingPageConfig, "SettingsReader.get().adLandingPageConfig");
            Boolean enableDynamicNavbar = adLandingPageConfig.getEnableDynamicNavbar();
            if (enableDynamicNavbar == null) {
                C52711k.m112234a();
            }
            return enableDynamicNavbar.booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo50042g() {
        boolean z;
        C24336d dVar = this.f64546j;
        if (dVar != null) {
            Boolean bool = (Boolean) dVar.f64612ak.mo18457b();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                C18898c.m46009a(C11010c.m22280a(), C23060d.f61428b, "push");
            }
            if (C52830p.m112413c(dVar.mo50130k(), "pay", false, 2, null) && ((WalletBusiness) this.f64561y.mo50011a(WalletBusiness.class)) != null) {
                IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
                if (provideWalletService_Monster != null) {
                    provideWalletService_Monster.syncWallet();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50103m() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.bullet.module.base.d r0 = r4.f64546j
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.bytedance.ies.bullet.b.i.b r0 = r0.f28100G
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.mo18457b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0021
            r4.mo50044i()
            return
        L_0x0021:
            com.ss.android.ugc.aweme.bullet.module.base.d r0 = r4.f64546j
            if (r0 == 0) goto L_0x0030
            com.bytedance.ies.bullet.b.i.f<java.lang.Boolean> r0 = r0.f28114s
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r0.mo18457b()
            r1 = r0
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0030:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r0)
            if (r0 == 0) goto L_0x003b
            return
        L_0x003b:
            com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar r0 = r4.f64541e
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            com.p683ss.android.ttve.utils.C20141b.m49698a(r0, r1)
            android.widget.Space r0 = r4.f64542f
            android.view.View r0 = (android.view.View) r0
            com.p683ss.android.ttve.utils.C20141b.m49698a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24316a.mo50103m():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo50044i() {
        this.f64558v = "1";
        C20141b.m49698a((View) this.f64542f, 8);
        BulletCommonTitleBar bulletCommonTitleBar = this.f64541e;
        if (bulletCommonTitleBar != null) {
            bulletCommonTitleBar.setBackgroundColor(0);
            View a = bulletCommonTitleBar.mo50149a((int) R.id.jz);
            C52711k.m112236a((Object) a, "bg_browser_title");
            a.setVisibility(0);
            DmtTextView dmtTextView = (DmtTextView) bulletCommonTitleBar.mo50149a((int) R.id.title);
            C52711k.m112236a((Object) dmtTextView, "title");
            dmtTextView.setVisibility(8);
            ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.uj)).setImageResource(R.drawable.cti);
            ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.ug)).setImageResource(R.drawable.ctl);
            ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.p5)).setImageResource(R.drawable.ctr);
            ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.cbl)).setImageResource(R.drawable.ctp);
            ((AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.ccm)).setImageResource(R.drawable.ctn);
        }
    }

    @C53771m
    public final void onJsBroadcast(C29906l lVar) {
        C52711k.m112240b(lVar, "event");
        C24326a aVar = this.f64536A;
        if (aVar != null) {
            aVar.mo50117a(lVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50038b(Activity activity) {
        C52711k.m112240b(activity, "activity");
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.f64561y.mo50011a(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.mo49981a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo50039c(Activity activity) {
        C52711k.m112240b(activity, "activity");
        DownloadBusiness downloadBusiness = (DownloadBusiness) this.f64561y.mo50011a(DownloadBusiness.class);
        if (downloadBusiness != null) {
            downloadBusiness.mo49982a(this.f64544h);
        }
    }

    @C53771m
    public final void onEvent(C35471h hVar) {
        String str;
        CharSequence charSequence = "web";
        if (hVar != null) {
            str = hVar.itemType;
        } else {
            str = null;
        }
        if (TextUtils.equals(charSequence, str)) {
            C47881fd.m103578a(this.f64553q, this.f64541e, hVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r3.mo50052g() == true) goto L_0x002a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m59604a(com.bytedance.ies.bullet.p653ui.common.p657d.C10578a r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar r0 = r2.f64541e
            if (r0 == 0) goto L_0x0007
            r0.mo50150a(r3)
        L_0x0007:
            com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar r3 = r2.f64541e
            if (r3 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.bullet.module.base.a$e r0 = new com.ss.android.ugc.aweme.bullet.module.base.a$e
            r0.<init>(r2)
            com.ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar$a r0 = (com.p683ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.C24350a) r0
            r3.setTitleWrap(r0)
        L_0x0015:
            com.ss.android.ugc.aweme.bullet.module.base.d r3 = r2.f64546j
            r0 = 1
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.mo50131l()
            if (r3 == r0) goto L_0x002a
        L_0x0020:
            com.ss.android.ugc.aweme.bullet.module.ad.c r3 = r2.f64548l
            if (r3 == 0) goto L_0x0038
            boolean r3 = r3.mo50052g()
            if (r3 != r0) goto L_0x0037
        L_0x002a:
            com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout r3 = r2.f64543g
            if (r3 == 0) goto L_0x0037
            int r0 = com.p683ss.android.ugc.aweme.utils.C47888fj.m103589b()
            r1 = 0
            r3.setPadding(r1, r0, r1, r1)
            return
        L_0x0037:
            return
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24316a.m59604a(com.bytedance.ies.bullet.ui.common.d.a):void");
    }

    /* renamed from: a */
    public final void mo18695a(Uri uri) {
        C52711k.m112240b(uri, "uri");
        this.f64554r = false;
        this.f64549m = uri.toString();
        C27111f fVar = this.f64537a;
        if (fVar != null) {
            fVar.mo55422a(this.f64549m);
        }
        ShareBusiness shareBusiness = (ShareBusiness) this.f64561y.mo50011a(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.mo49965a(this.f64549m);
        }
    }

    /* renamed from: b */
    public final void mo50100b(String str) {
        String str2;
        String str3;
        String str4 = "bullet_container";
        C23089d a = C23089d.m56640a();
        String str5 = "platform";
        if (this.f64546j != null) {
            str2 = C23060d.f61427a;
        } else if (this.f64547k != null) {
            str2 = "react-native";
        } else {
            str2 = "unknown";
        }
        C23089d a2 = a.mo47829a(str5, str2).mo47829a("status", str);
        String str6 = "module_name";
        C10460c cVar = this.f64547k;
        if (cVar != null) {
            C10385f<String> fVar = cVar.f27863e;
            if (fVar != null) {
                str3 = (String) fVar.mo18457b();
                C26890h.m65011a(str4, a2.mo47829a(str6, str3).mo47829a("url", this.f64549m).f61491a);
            }
        }
        str3 = null;
        C26890h.m65011a(str4, a2.mo47829a(str6, str3).mo47829a("url", this.f64549m).f61491a);
    }

    @C53771m
    public final void onEvent(C29793b bVar) {
        C10254a aVar;
        C10290i iVar = this.f64545i;
        if (iVar != null) {
            aVar = iVar.mo18345c();
        } else {
            aVar = null;
        }
        if (aVar == C10254a.LYNX) {
            if (bVar != null && bVar.f77802a != 0) {
                C10290i iVar2 = this.f64545i;
                if (iVar2 != null && iVar2.hashCode() == bVar.f77802a) {
                    this.f64552p.run();
                }
            }
        } else if (bVar != null && bVar.f77802a != 0) {
            SSWebView sSWebView = this.f64544h;
            if (sSWebView != null && sSWebView.hashCode() == bVar.f77802a) {
                this.f64552p.run();
            }
        }
    }

    /* renamed from: a */
    public ViewGroup mo18747a(Context context) {
        C10578a aVar;
        C52711k.m112240b(context, "context");
        Activity activity = (Activity) context;
        this.f64553q = activity;
        View inflate = View.inflate(context, mo50040e(), null);
        C52711k.m112236a((Object) inflate, "View.inflate(context, ge…tContainerLayout(), null)");
        this.f64540d = inflate;
        View view = this.f64540d;
        if (view == null) {
            C52711k.m112237a("rootView");
        }
        this.f64538b = (DmtStatusView) view.findViewById(R.id.abc);
        Context context2 = activity;
        C10722c cVar = new C10723a(context2).mo19277a((int) R.drawable.b0q).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new C24320d(this)).f28711a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(context2);
        dmtDefaultView.setStatus(cVar);
        if (C10675b.m21498b(context2)) {
            dmtDefaultView.setBackgroundColor(C25552a.m62085a(context2, R.color.aq4));
        } else {
            dmtDefaultView.setBackgroundColor(C25552a.m62085a(context2, R.color.aq3));
        }
        DmtStatusView dmtStatusView = this.f64538b;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a(context2).mo19234c((View) dmtDefaultView));
        }
        View view2 = this.f64540d;
        if (view2 == null) {
            C52711k.m112237a("rootView");
        }
        this.f64541e = (BulletCommonTitleBar) view2.findViewById(R.id.e14);
        View view3 = this.f64540d;
        if (view3 == null) {
            C52711k.m112237a("rootView");
        }
        this.f64542f = (Space) view3.findViewById(R.id.bpy);
        View view4 = this.f64540d;
        if (view4 == null) {
            C52711k.m112237a("rootView");
        }
        this.f64543g = (OpenURLHintLayout) view4.findViewById(R.id.e13);
        try {
            Callable<C24336d> callable = this.f64539c;
            if (callable != null) {
                aVar = (C24336d) callable.call();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                C52711k.m112234a();
            }
            m59604a(aVar);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f64539c = null;
            throw th;
        }
        this.f64539c = null;
        View view5 = this.f64540d;
        if (view5 == null) {
            C52711k.m112237a("rootView");
        }
        if (view5 != null) {
            return (ViewGroup) view5;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C24316a(C10326b bVar, C24254b bVar2) {
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(bVar2, "bulletBusiness");
        this.f64560x = bVar;
        this.f64561y = bVar2;
    }

    /* renamed from: a */
    public final void mo18696a(Uri uri, Throwable th) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(th, "e");
        DmtStatusView dmtStatusView = this.f64538b;
        if (dmtStatusView != null) {
            dmtStatusView.mo19204a(false);
        }
        DmtStatusView dmtStatusView2 = this.f64538b;
        if (dmtStatusView2 != null) {
            dmtStatusView2.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo18748a(Uri uri, Bundle bundle, C10423r rVar) {
        C52711k.m112240b(rVar, "param");
        if (rVar instanceof C24336d) {
            C24336d dVar = (C24336d) rVar;
            if (TextUtils.isEmpty((CharSequence) dVar.f28119x.mo18457b())) {
                dVar.f28119x.mo18456a(dVar.f64616ao.mo18457b());
            }
            this.f64539c = new C24319c(rVar);
        }
    }

    /* renamed from: a */
    public void mo18697a(View view, Uri uri, C10290i iVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(iVar, "instance");
        this.f64554r = true;
        this.f64549m = uri.toString();
        C27111f fVar = this.f64537a;
        if (fVar != null) {
            fVar.mo55422a(this.f64549m);
        }
        ShareBusiness shareBusiness = (ShareBusiness) this.f64561y.mo50011a(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.f64301d = this.f64549m;
        }
        SSWebView sSWebView = this.f64544h;
        if (sSWebView == null || !sSWebView.canGoBack()) {
            BulletCommonTitleBar bulletCommonTitleBar = this.f64541e;
            if (bulletCommonTitleBar != null) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) bulletCommonTitleBar.mo50149a((int) R.id.ug);
                C52711k.m112236a((Object) autoRTLImageView, "close_all_webpage");
                autoRTLImageView.setVisibility(8);
            }
        } else {
            BulletCommonTitleBar bulletCommonTitleBar2 = this.f64541e;
            if (bulletCommonTitleBar2 != null) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) bulletCommonTitleBar2.mo50149a((int) R.id.ug);
                C52711k.m112236a((Object) autoRTLImageView2, "close_all_webpage");
                autoRTLImageView2.setVisibility(0);
            }
        }
    }
}
