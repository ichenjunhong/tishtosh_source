package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.base.C11081c.C11082a;
import com.bytedance.ies.uikit.base.C11081c.C11084c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.newmedia.redbadge.C19592b;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1163f.C19158d;
import com.p683ss.android.p1163f.p1166c.C19156b;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26443bw;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.p1960b.C36940a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity;
import com.p683ss.android.ugc.aweme.requestcombine.C41211a;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41255e;
import com.p683ss.android.ugc.aweme.splash.SplashActivity;
import com.p683ss.android.ugc.aweme.splash.SplashAdActivity;
import com.p683ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import com.p683ss.android.ugc.aweme.web.C48380q;
import com.p683ss.android.ugc.trill.openauthorize.AwemeAuthorizedActivity;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.AwemeAppData */
public final class AwemeAppData extends C19555f implements C11082a, C11084c {

    /* renamed from: e */
    public boolean f61127e;

    /* renamed from: f */
    public boolean f61128f;

    /* renamed from: g */
    public boolean f61129g;

    /* renamed from: h */
    public String f61130h;

    /* renamed from: i */
    public boolean f61131i;

    /* renamed from: j */
    public boolean f61132j;

    /* renamed from: k */
    public boolean f61133k;

    /* renamed from: l */
    public boolean f61134l;

    /* renamed from: m */
    public boolean f61135m;

    /* renamed from: n */
    public long f61136n;

    /* renamed from: com.ss.android.ugc.aweme.app.AwemeAppData$RedPointTask */
    class RedPointTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private RedPointTask() {
        }

        public void run(Context context) {
            if (!C9431p.m18664a(AppLog.getServerDeviceId())) {
                C38064h.m85136d().mo77611f();
            }
            C38046d.m85101a(true, 4);
        }
    }

    /* renamed from: f */
    public final C19767n mo40808f() {
        return C48380q.m104672e();
    }

    /* renamed from: a */
    public final void mo20107a(boolean z) {
        this.f61132j = z;
        if (z) {
            SplashAdManagerHolder.m99464b(this.f53936b).mo38104b();
            this.f61127e = true;
            return;
        }
        if (SplashAdManagerHolder.m99462a()) {
            if (C18642g.m45250w() == null) {
                SplashAdManagerHolder.m99458a(this.f53936b);
            }
            SplashAdManagerHolder.m99464b(this.f53936b).mo38101a();
        }
    }

    /* renamed from: b */
    public final void mo20105b(Activity activity) {
        C19592b.m47911a((Context) activity).mo40831b();
        C52711k.m112240b(activity, "activity");
        C19158d a = C19158d.m46704a();
        Context context = activity;
        if (a.mo39108b()) {
            for (C19156b b : a.f52795b.f52793a) {
                b.mo39103b(context);
            }
        }
    }

    /* renamed from: a */
    public final void mo20104a(Activity activity) {
        boolean z;
        boolean z2;
        boolean z3 = activity instanceof MainActivity;
        if (z3) {
            C35857a.m81001b().mo74526a(new RedPointTask()).mo74527a();
        }
        C52711k.m112240b(activity, "activity");
        C19158d a = C19158d.m46704a();
        Context context = activity;
        if (a.mo39108b()) {
            for (C19156b a2 : a.f52795b.f52793a) {
                a2.mo39102a(context);
            }
        }
        this.f61133k = false;
        this.f61134l = false;
        this.f61135m = z3;
        boolean z4 = true;
        if (!(activity == null && activity.getIntent() == null)) {
            Intent intent = activity.getIntent();
            this.f61133k = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || !(data == null || data.getQueryParameter("gd_label") == null || !data.getQueryParameter("gd_label").startsWith("click_wap"))) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f61134l = z2;
        }
        if (!this.f61127e || this.f61131i) {
            m47851a().f61129g = false;
            this.f61128f = false;
        } else {
            Activity g = C11016e.m22312g();
            if (g != null) {
                if (this.f61136n != 0 && System.currentTimeMillis() - this.f61136n <= 1500) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !(g instanceof SplashAdActivity) && !(g instanceof SplashActivity)) {
                    if (!(g instanceof AwemeAuthorizedActivity) && !(g instanceof AwemeAuthorizeLoginActivity)) {
                        z4 = false;
                    }
                    if (!z4) {
                        boolean e = SplashAdManagerHolder.m99458a((Context) g).mo38115e();
                        if (!C26443bw.m63933a((Context) g, e) && e) {
                            this.f61128f = SplashAdActivity.f115511a.mo92142a(g);
                        }
                    }
                }
            }
            this.f61127e = false;
        }
        if (this.f61131i) {
            this.f61131i = false;
        }
        if (!C41211a.f104656d.mo83705b()) {
            C35857a.m81005d().mo74519a(new C41255e()).mo74520a();
        }
        C36983a.m83185b().f94463d = new C36940a() {
            /* renamed from: a */
            public final void mo47295a() {
                AwemeAppData.this.f61136n = System.currentTimeMillis();
            }
        };
    }
}
