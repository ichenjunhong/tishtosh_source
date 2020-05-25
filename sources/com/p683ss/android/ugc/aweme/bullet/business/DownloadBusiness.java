package com.p683ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.bullet.p653ui.common.view.SSWebView;
import com.p683ss.android.sdk.activity.p1208a.C19724b;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.DownloadBusiness */
public final class DownloadBusiness extends Business {

    /* renamed from: a */
    public String f64317a;

    /* renamed from: b */
    public int f64318b;

    /* renamed from: c */
    public int f64319c;

    /* renamed from: d */
    private final C19724b f64320d = new C19724b();

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.DownloadBusiness$a */
    static final class C24238a implements OnClickListener {

        /* renamed from: a */
        public static final C24238a f64321a = new C24238a();

        C24238a() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.DownloadBusiness$b */
    static final class C24239b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ DownloadBusiness f64322a;

        /* renamed from: b */
        final /* synthetic */ SSWebView f64323b;

        /* renamed from: c */
        final /* synthetic */ Activity f64324c;

        /* renamed from: d */
        final /* synthetic */ C24310h f64325d;

        C24239b(DownloadBusiness downloadBusiness, SSWebView sSWebView, Activity activity, C24310h hVar) {
            this.f64322a = downloadBusiness;
            this.f64323b = sSWebView;
            this.f64324c = activity;
            this.f64325d = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onDownloadStart(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, long r12) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.bullet.business.DownloadBusiness r9 = r7.f64322a
                com.ss.android.ugc.aweme.bullet.business.a r9 = r9.f64316k
                android.app.Activity r9 = r9.mo50010a()
                android.content.Context r9 = (android.content.Context) r9
                boolean r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26540w.m64256d(r9, r8)
                if (r9 == 0) goto L_0x0011
                return
            L_0x0011:
                com.bytedance.ies.bullet.ui.common.view.SSWebView r9 = r7.f64323b
                java.lang.String r5 = r9.getUrl()
                android.app.Activity r9 = r7.f64324c
                r0 = r9
                android.content.Context r0 = (android.content.Context) r0
                com.ss.android.ugc.aweme.bullet.module.ad.h r9 = r7.f64325d
                if (r9 == 0) goto L_0x0031
                com.bytedance.ies.bullet.b.i.l r9 = r9.f64502e
                if (r9 == 0) goto L_0x0031
                java.lang.Object r9 = r9.mo18457b()
                java.lang.Long r9 = (java.lang.Long) r9
                if (r9 == 0) goto L_0x0031
                long r9 = r9.longValue()
                goto L_0x0033
            L_0x0031:
                r9 = 0
            L_0x0033:
                r1 = r9
                com.ss.android.ugc.aweme.bullet.module.ad.h r9 = r7.f64325d
                r10 = 0
                if (r9 == 0) goto L_0x003f
                java.lang.String r9 = r9.mo50065c()
                r3 = r9
                goto L_0x0040
            L_0x003f:
                r3 = r10
            L_0x0040:
                com.bytedance.ies.bullet.ui.common.view.SSWebView r9 = r7.f64323b
                java.lang.String r6 = r9.getUrl()
                r4 = r8
                com.p683ss.android.sdk.activity.C19722a.m48220a(r0, r1, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.bullet.module.ad.h r9 = r7.f64325d
                if (r9 == 0) goto L_0x0059
                com.bytedance.ies.bullet.b.i.b r9 = r9.f64484U
                if (r9 == 0) goto L_0x0059
                java.lang.Object r9 = r9.mo18457b()
                r10 = r9
                java.lang.Boolean r10 = (java.lang.Boolean) r10
            L_0x0059:
                r9 = 1
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r9)
                if (r9 != 0) goto L_0x0067
                com.bytedance.common.utility.C9431p.m18664a(r8)
            L_0x0067:
                com.ss.android.ugc.aweme.bullet.business.DownloadBusiness r9 = r7.f64322a
                r9.f64317a = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.business.DownloadBusiness.C24239b.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
        }
    }

    /* renamed from: a */
    public final void mo49981a() {
        int i;
        Activity a = this.f64316k.mo50010a();
        if (a != null) {
            if (this.f64318b == 0) {
                i = R.id.bk;
            } else {
                i = this.f64318b;
            }
            a.findViewById(i);
        }
    }

    public DownloadBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49982a(SSWebView sSWebView) {
        FrameLayout frameLayout;
        int i;
        int i2;
        int i3;
        int i4;
        Activity a = this.f64316k.mo50010a();
        C24310h hVar = null;
        if (a != null) {
            if (this.f64318b == 0) {
                i4 = R.id.bk;
            } else {
                i4 = this.f64318b;
            }
            frameLayout = (FrameLayout) a.findViewById(i4);
        } else {
            frameLayout = null;
        }
        if (a != null) {
            if (this.f64319c == 0) {
                i3 = R.id.bm;
            } else {
                i3 = this.f64319c;
            }
            a.findViewById(i3);
        }
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        C10578a b = this.f64316k.mo50019b();
        if (b instanceof C24310h) {
            hVar = b;
        }
        C24310h hVar2 = hVar;
        C19724b bVar = this.f64320d;
        if (hVar2 != null) {
            bVar.f54341a = (String) hVar2.f64485V.mo18457b();
            bVar.f54343c = hVar2.mo50126g();
            bVar.f54344d = hVar2.mo50065c();
            bVar.f54345e = (String) hVar2.f64480Q.mo18457b();
            bVar.f54347g = (String) hVar2.f64478O.mo18457b();
            bVar.f54346f = (String) hVar2.f64479P.mo18457b();
            boolean z = false;
            if (hVar2.f64489Z.mo18457b() != null) {
                i = ((Integer) hVar2.f64489Z.mo18457b()).intValue();
            } else {
                i = 0;
            }
            bVar.f54348h = i;
            bVar.f54350j = (String) hVar2.f64481R.mo18457b();
            if (hVar2.f64490aa.mo18457b() != null) {
                i2 = ((Integer) hVar2.f64490aa.mo18457b()).intValue();
            } else {
                i2 = 0;
            }
            bVar.f54353m = i2;
            if (hVar2.f64492ac.mo18457b() == Boolean.TRUE) {
                z = true;
            }
            bVar.f54354n = z;
            try {
                bVar.f54351k = new JSONObject((String) hVar2.f64493ad.mo18457b());
            } catch (Exception unused) {
            }
            bVar.f54352l = (String) hVar2.f64487X.mo18457b();
            bVar.f54349i = C19724b.m48221a(bVar.f54348h);
            try {
                bVar.f54342b = Long.parseLong(bVar.f54341a);
            } catch (Exception unused2) {
            }
        }
        if (frameLayout != null) {
            frameLayout.setOnClickListener(C24238a.f64321a);
        }
        if (sSWebView != null) {
            sSWebView.setDownloadListener(new C24239b(this, sSWebView, a, hVar2));
        }
    }
}
