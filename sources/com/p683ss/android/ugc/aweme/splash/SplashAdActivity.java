package com.p683ss.android.ugc.aweme.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.p1103ad.splash.C18756h;
import com.p683ss.android.p1103ad.splash.C18760l;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.p1103ad.splash.C18770q;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.base.p1418i.C23548d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26252s;
import com.p683ss.android.ugc.aweme.commercialize.splash.SplashFinishDelayExperiment;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1391aw.C23300a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.C47893fn;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashAdActivity */
public class SplashAdActivity extends AbsActivity implements C45690c {

    /* renamed from: a */
    public static final C45680b f115511a = new C45680b();

    /* renamed from: c */
    static volatile Object f115512c = new Object();

    /* renamed from: d */
    static volatile boolean f115513d = false;

    /* renamed from: e */
    static volatile boolean f115514e = false;

    /* renamed from: b */
    Handler f115515b = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private C18770q f115516f;

    /* renamed from: g */
    private View f115517g;

    /* renamed from: h */
    private boolean f115518h = true;

    /* renamed from: i */
    private Resources f115519i;

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdActivity$a */
    public static class C45679a implements C18756h {

        /* renamed from: a */
        SplashAdActivity f115521a;

        /* renamed from: b */
        private boolean f115522b;

        private C45679a(boolean z) {
            this.f115522b = z;
        }

        /* renamed from: a */
        public final void mo38357a(View view) {
            C47718bf.m103288a(new C45697j(0));
            SplashAdActivity splashAdActivity = this.f115521a;
            if (splashAdActivity != null) {
                splashAdActivity.finish();
            }
        }

        /* renamed from: a */
        public final void mo38356a(long j, String str) {
            C26088l.m63273a((Context) this.f115521a, j, str, System.currentTimeMillis() - C26252s.f69309d.mo53907a());
        }

        /* renamed from: a */
        public final void mo38358a(View view, C18760l lVar) {
            long j;
            SplashAdActivity splashAdActivity = this.f115521a;
            if (splashAdActivity != null) {
                C47625i.m103103a("openSplashScheme: from = SplashAdActivity");
                C26447bz.f69708a.mo54163b("点击开屏，吊起");
                C45706n.m99512a(splashAdActivity, lVar, C45694g.f115538a);
                if (this.f115522b) {
                    j = C10181b.m20511a().mo18169a(SplashFinishDelayExperiment.class, true, "splashad_finish_delay", 31744, 0);
                } else {
                    j = 0;
                }
                if (j > 0) {
                    splashAdActivity.f115515b.postDelayed(new Runnable() {
                        public final void run() {
                            SplashAdActivity.this.finish();
                            SplashAdActivity.this.overridePendingTransition(0, 0);
                        }
                    }, j);
                } else {
                    splashAdActivity.finish();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdActivity$b */
    public static class C45680b {

        /* renamed from: a */
        C18770q f115523a;

        /* renamed from: b */
        View f115524b;

        /* renamed from: c */
        C45679a f115525c;

        C45680b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo92141a() {
            this.f115523a = null;
            this.f115524b = null;
            this.f115525c = null;
        }

        /* renamed from: a */
        public final boolean mo92142a(Context context) {
            if (C23110b.m56676a()) {
                mo92141a();
                C26447bz.f69708a.mo54163b("不展示普通开屏 理由：trace功能开启");
                return false;
            } else if (context == null) {
                mo92141a();
                C26447bz.f69708a.mo54163b("不展示普通开屏 理由：context == null");
                return false;
            } else if (AwemeAppData.m47851a().f61129g) {
                mo92141a();
                AwemeAppData.m47851a().f61129g = false;
                C26447bz.f69708a.mo54163b("不展示普通开屏 理由：从通知点进来，不展示广告");
                return false;
            } else {
                C18769p a = SplashAdManagerHolder.m99458a(context.getApplicationContext());
                if (a == null) {
                    mo92141a();
                    C26447bz.f69708a.mo54163b("不展示普通开屏 理由：splashAdManager 为空");
                    return false;
                }
                C18770q d = a.mo38111d();
                C45679a a2 = SplashAdActivity.m99449a(false);
                d.mo38128a((C18756h) a2);
                C26217c.m63502a().mo53864b();
                return m99453a(context, d, d.mo38127a(context), a2);
            }
        }

        /* renamed from: a */
        private boolean m99453a(Context context, C18770q qVar, View view, C45679a aVar) {
            this.f115523a = qVar;
            this.f115524b = view;
            this.f115525c = aVar;
            if (this.f115524b == null) {
                mo92141a();
                return false;
            }
            ((MainLooperOptService) C35857a.m80997a(MainLooperOptService.class)).enable(false);
            Intent intent = new Intent(context, SplashAdActivity.class);
            if (context instanceof Activity) {
                intent.putExtra("from", context.getClass().getName());
            } else {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        }
    }

    public boolean isSplashShowing() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onStart() {
        super.onStart();
        this.f115518h = false;
    }

    public void onDestroy() {
        if (this.f115515b != null) {
            this.f115515b.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    public void finish() {
        f115513d = false;
        if (f115514e) {
            f115514e = false;
            synchronized (f115512c) {
                f115512c.notifyAll();
            }
        }
        super.finish();
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.f115518h);
        if (!C23548d.m57745a(this, this.f115518h)) {
            return super.getResources();
        }
        if (this.f115519i == null) {
            this.f115519i = new C23548d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        }
        return this.f115519i;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", true);
        this.f115518h = true;
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47893fn.m103596a(this);
        C47859eq.m103529a(this);
        String str = "splash";
        C52711k.m112240b(str, "type");
        C25593c.f67752d = str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", false);
    }

    /* renamed from: a */
    public static C45679a m99449a(boolean z) {
        return new C45679a(false);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C23300a.m57313a(context);
        Context b = C33102c.m76095b(context);
        C27548d.m66217a(b);
        super.attachBaseContext(b);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", true);
        super.onCreate(bundle);
        C22574a.m55738f().mo46914a();
        try {
            setContentView((int) R.layout.e9);
            this.f115516f = f115511a.f115523a;
            this.f115517g = f115511a.f115524b;
            C45679a aVar = f115511a.f115525c;
            if (aVar != null) {
                aVar.f115521a = this;
            }
            f115511a.mo92141a();
            if (this.f115517g != null) {
                C23729p.m58263b((Activity) this);
                this.f115517g.setBackgroundResource(R.drawable.bc0);
                ((ViewGroup) findViewById(R.id.cqq)).addView(this.f115517g);
            } else {
                if (getIntent() == null) {
                    str = null;
                } else {
                    str = getIntent().getStringExtra("from");
                }
                if (!TextUtils.equals(str, MainActivity.class.getName())) {
                    C26217c.m63502a().mo53864b();
                }
                finish();
                overridePendingTransition(0, 0);
            }
            f115513d = true;
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", false);
            return;
        } catch (RuntimeException e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", e.toString());
            C23131p.m57779a("splash_set_content_view", jSONObject);
        } catch (Throwable unused) {
        }
        f115511a.mo92141a();
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", false);
    }
}
