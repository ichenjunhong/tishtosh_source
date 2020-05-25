package com.p683ss.android.ugc.aweme.splash;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.newmedia.C19556g;
import com.p683ss.android.p1103ad.splash.C18756h;
import com.p683ss.android.p1103ad.splash.C18760l;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.p1103ad.splash.C18770q;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C23111k;
import com.p683ss.android.ugc.aweme.app.C23128m;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.C23137q;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.base.p1418i.C23548d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26252s;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26426bk;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask;
import com.p683ss.android.ugc.aweme.legoImp.task.LogLaunchModeTask;
import com.p683ss.android.ugc.aweme.legoImp.task.MobLaunchEventTask;
import com.p683ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask;
import com.p683ss.android.ugc.aweme.legoImp.task.UploadSysStatusTask;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1391aw.C23300a;
import com.p683ss.android.ugc.aweme.preinstall.PreinstallUtils;
import com.p683ss.android.ugc.aweme.setting.C41556av;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.C47893fn;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashActivity */
public class SplashActivity extends FragmentActivity implements C9382a, C45690c {
    private static final long COLD_START_DELAY = 30000;
    static final boolean DEBUG_MEMORY = false;
    public static final String FROM_WIDGET_PROVIDER = "from_widget_provider";
    private static final String LAUNCH_METHOD = "click_open_share";
    protected static final int MSG_WHAT_GO_MAIN = 100;
    public static final String SPLASH_OPEN_URL_EXTRA = "splash_open_url_extra";
    public static final String SPLASH_TO_SHOW_SUPER_ENTRANCE = "splash_to_show_super_entrance";
    public static final String TAG = "SplashActivity";
    public static C19556g sConfirmWelcomeType = C19556g.FULL_SCREEN_WELCOME;
    public static boolean sShowWelcomeCheckBox;
    public boolean isFirstShow;
    protected volatile boolean mAlive = true;
    protected boolean mAllowAd = true;
    private Dialog mDialog = null;
    public boolean mDirectlyGoMain;
    protected boolean mFirstResume = true;
    protected boolean mFirstResumed = true;
    protected final Handler mHandler = new C9381g(this);
    protected boolean mInited;
    protected boolean mJumped;
    private Resources mResourcesWrapper;
    private C45705a mSubmitPreloadHelper = new C45705a();
    protected boolean mTrackSession;
    private C18770q splashAdNative;

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashActivity$a */
    static class C45677a implements C18756h {

        /* renamed from: a */
        private final WeakReference<SplashActivity> f115510a;

        C45677a(SplashActivity splashActivity) {
            this.f115510a = new WeakReference<>(splashActivity);
        }

        /* renamed from: a */
        public final void mo38357a(View view) {
            SplashActivity splashActivity = (SplashActivity) this.f115510a.get();
            if (splashActivity != null) {
                if (C26217c.m63502a().f69231h) {
                    Intent intent = new Intent(splashActivity, TransitActivity.class);
                    intent.putExtra("main", splashActivity.getMainIntent());
                    splashActivity.startActivity(intent);
                    if (!splashActivity.isFinishing()) {
                        splashActivity.finish();
                        splashActivity.overridePendingTransition(0, 0);
                    }
                    return;
                }
                splashActivity.goMainActivity();
            }
        }

        /* renamed from: a */
        public final void mo38356a(long j, String str) {
            if (((SplashActivity) this.f115510a.get()) != null) {
                C26088l.m63273a((Context) this.f115510a.get(), j, str, System.currentTimeMillis() - C26252s.f69309d.mo53907a());
            }
        }

        /* renamed from: a */
        public final void mo38358a(View view, C18760l lVar) {
            SplashActivity splashActivity = (SplashActivity) this.f115510a.get();
            if (splashActivity != null) {
                if (!splashActivity.tryOpenByScheme(lVar, new C45693f(splashActivity))) {
                    splashActivity.mHandler.sendEmptyMessage(100);
                }
                splashActivity.mDirectlyGoMain = true;
            }
        }

        /* renamed from: a */
        static final /* synthetic */ void m99445a(SplashActivity splashActivity, Context context, String str) {
            Message message = new Message();
            message.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(SplashActivity.SPLASH_OPEN_URL_EXTRA, str);
            message.setData(bundle);
            splashActivity.mHandler.sendMessage(message);
        }
    }

    private void submitPreload() {
    }

    /* access modifiers changed from: protected */
    public void doInit() {
    }

    public boolean isSplashShowing() {
        return true;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onDialogShowOrDismiss(DialogInterface dialogInterface, boolean z) {
    }

    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public boolean quickLaunch() {
        return false;
    }

    public void goMainActivity() {
        goMainActivity(null);
    }

    public void onStart() {
        super.onStart();
        this.mFirstResumed = false;
    }

    private static boolean enableSplashLaunchFix() {
        try {
            return C32816h.m75716b().getEnableSplashLaunchFix().booleanValue();
        } catch (C10174a unused) {
            return true;
        }
    }

    private void hotStartIntercept() {
        if (isHotStart()) {
            C41556av.m91389a().mo85341b();
        }
    }

    /* access modifiers changed from: protected */
    public void tryInit() {
        if (!this.mInited) {
            doInit();
            this.mInited = true;
        }
    }

    public void onDestroy() {
        if (this.mDialog != null) {
            this.mDialog.dismiss();
        }
        this.mHandler.removeMessages(100);
        this.mAlive = false;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void tryShowShortCutDlg() {
        C22574a.m55738f().mo46917a("method_splash_try_show_ad_duration", false);
        tryShowAdAndGoNext();
        C22574a.m55738f().mo46921b("method_splash_try_show_ad_duration", false);
    }

    private boolean isHotStart() {
        Intent intent = getIntent();
        if (!isTaskRoot() || intent == null || !intent.hasCategory("android.intent.category.LAUNCHER") || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return false;
        }
        return true;
    }

    private void reportLaunchTime() {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis() - C22574a.m55738f().f60707h;
        int a = C23128m.m56685a();
        int c = AwemeAppData.m47851a().mo40805c();
        if (a != c) {
            z = true;
        } else {
            z = false;
        }
        if (C23111k.m56679a().f61536a) {
            C35857a.m81001b().mo74526a(new MobLaunchEventTask(z, currentTimeMillis)).mo74527a();
        }
        if (a == 0) {
            C23128m.m56686a(c);
        }
    }

    /* access modifiers changed from: protected */
    public Intent getMainIntent() {
        Intent intent = getIntent();
        Intent intent2 = new Intent(this, AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getApplicationService().mo74158d());
        intent2.setFlags(335544320);
        if (intent != null) {
            intent2.setAction(intent.getAction());
        }
        C26426bk.m63899a(intent, intent2);
        if (!(intent == null || intent.getExtras() == null)) {
            intent2.putExtras(intent.getExtras());
        }
        return intent2;
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        if (!C23548d.m57745a(this, this.mFirstResumed)) {
            return super.getResources();
        }
        if (this.mResourcesWrapper == null) {
            this.mResourcesWrapper = new C23548d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        }
        return this.mResourcesWrapper;
    }

    private void mobLaunchMob() {
        String str = "";
        try {
            Intent intent = getIntent();
            Uri uri = null;
            String str2 = "";
            if (intent != null) {
                uri = intent.getData();
                boolean booleanExtra = getIntent().getBooleanExtra("from_notification", false);
                if (uri != null) {
                    str = uri.getQueryParameter("gd_label");
                }
                if (booleanExtra || str != null) {
                    C35857a.m81001b().mo74526a(new LogLaunchModeTask(uri, str2)).mo74527a();
                    C23111k.m56679a().f61537b = false;
                    return;
                }
            }
            C26890h.onEvent(MobClick.obtain().setEventName("launch_app").setLabelName("enter_launch"));
            C35857a.m81001b().mo74526a(new LogLaunchModeTask(uri, str2)).mo74527a();
            C23111k.m56679a().f61537b = false;
        } catch (Exception unused) {
        }
    }

    public void onResume() {
        this.mFirstResumed = true;
        C22574a.m55738f().mo46914a();
        if (!C47859eq.m103531b(this)) {
            super.onResume();
            if (this.mDirectlyGoMain) {
                goMainActivity();
                return;
            }
            Intent intent = getIntent();
            if (this.mFirstResume && !this.mJumped) {
                this.mFirstResume = false;
                if (intent != null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.getBoolean("from_notification")) {
                        C18898c.m46009a(this, "more_tab", "notify_click");
                        C18898c.m46009a(this, "apn", "recall");
                    }
                }
                if (quickLaunch()) {
                    goMainActivity();
                }
                C47893fn.m103596a(this);
                C47859eq.m103529a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void tryShowAdAndGoNext() {
        C18769p a = SplashAdManagerHolder.m99458a(getApplicationContext());
        if (a == null) {
            goMainActivity();
            return;
        }
        boolean i = a.mo38125i();
        boolean e = a.mo38115e();
        C26237e.m63579b().mo53890c();
        if ((!i || !e) && C26237e.m63579b().mo53891d()) {
            goMainActivity();
            C18559a f = SplashAdManagerHolder.m99458a(getApplicationContext()).mo38116f();
            C26237e.m63579b();
            C26237e.m63578a(f);
        } else if (!e || !showSplashAd()) {
            goMainActivity();
        } else {
            if (C47915gg.m103651b()) {
                C23131p.m56692a("ftc_show_splash_ad", "", null);
            }
            submitPreload();
        }
    }

    private boolean showSplashAd() {
        if (!this.mAllowAd || this.splashAdNative == null) {
            return false;
        }
        C26217c.m63502a().mo53864b();
        C26217c.m63502a().f69235l = true;
        final ViewGroup a = this.splashAdNative.mo38127a((Context) this);
        C26217c.m63502a().f69235l = false;
        if (a == null) {
            return false;
        }
        C22574a.m55738f().mo46914a();
        if (C23110b.m56676a() || TimeLockRuler.isTeenModeON()) {
            return false;
        }
        C23729p.m58263b((Activity) this);
        a.setBackgroundResource(R.drawable.bc0);
        int a2 = C10181b.m20511a().mo18168a(NormalSplashDelayExperiment.class, true, "normal_splash_ad_delay_millis", 31744, 0);
        if (a2 > 0) {
            try {
                Thread.sleep((long) a2);
            } catch (InterruptedException unused) {
            }
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        try {
            setContentView(relativeLayout);
            relativeLayout.addView(a);
            a.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    if (!SplashActivity.this.isFirstShow) {
                        SplashActivity.this.isFirstShow = true;
                        a.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
            return true;
        } catch (RuntimeException e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", e.toString());
            C23131p.m57779a("splash_set_content_view", jSONObject);
        } catch (Throwable unused2) {
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C23300a.m57313a(context);
        Context b = C33102c.m76095b(context);
        C27548d.m66217a(b);
        attachBaseContext$___twin___(b);
    }

    public void attachBaseContext$___twin___(Context context) {
        if (!PreinstallUtils.m88376a(this)) {
            C30163b.m70779f();
        }
        super.attachBaseContext(context);
    }

    public void handleMsg(Message message) {
        if (this.mAlive && message.what == 100) {
            goMainActivity(message.getData());
        }
    }

    public void goMainActivity(Bundle bundle) {
        submitPreload();
        this.mHandler.removeMessages(100);
        if (!this.mJumped) {
            this.mJumped = true;
            if (this.mAlive) {
                Intent mainIntent = getMainIntent();
                if (bundle != null) {
                    mainIntent.putExtra("extra_splash_data", bundle);
                }
                startActivity(mainIntent);
                if (!isFinishing()) {
                    finish();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PreinstallUtils.m88376a(this)) {
            super.onCreate(bundle);
            PreinstallUtils.m88377b(this);
            finish();
            Process.killProcess(Process.myPid());
            return;
        }
        C22574a.m55738f().mo46921b("cold_boot_application_to_splash", true);
        C22574a.m55738f().mo46917a("cold_boot_splash_duration", true);
        C23300a.m57313a(this);
        C22574a.m55738f().mo46917a("method_splash_super_duration", false);
        setTheme(R.style.my);
        super.onCreate(bundle);
        C22574a.m55738f().mo46921b("method_splash_super_duration", false);
        C26217c.m63502a().f69232i = true;
        C26217c.m63502a().mo53859a(getIntent());
        C26237e.m63579b().f69280g = true;
        C26237e.m63579b().mo53889a(getIntent());
        if (getIntent() != null && TextUtils.equals(getIntent().getAction(), "android.intent.action.MAIN") && getIntent().getCategories() != null && getIntent().getCategories().size() > 0 && getIntent().getCategories().contains("android.intent.category.LAUNCHER") && !isTaskRoot() && C23137q.m56698a().mo47855c() && enableSplashLaunchFix()) {
            C32458a.m75141a(4, TAG, "finish SplashActivity directly");
            finish();
        } else if (!isTaskRoot()) {
            goMainActivity();
        } else {
            this.mAlive = true;
            this.mFirstResume = true;
            this.mJumped = false;
            reportLaunchTime();
            mobLaunchMob();
            C23111k.m56679a().f61536a = false;
            C35857a.m81001b().mo74526a(new UploadInstallEventTask()).mo74527a();
            if (sConfirmWelcomeType == C19556g.NO_WELCOME) {
                this.mTrackSession = true;
                tryInit();
            }
            hotStartIntercept();
            if (!this.mJumped) {
                tryInit();
                if (!quickLaunch()) {
                    this.splashAdNative = SplashAdManagerHolder.m99458a(getApplicationContext()).mo38111d();
                    this.splashAdNative.mo38128a((C18756h) new C45677a(this));
                    tryShowShortCutDlg();
                }
            }
            C35857a.m81001b().mo74526a(new AntispamApiUploadTask()).mo74527a();
            C35857a.m81001b().mo74526a(new UploadSysStatusTask()).mo74527a();
            C22574a.m55738f().mo46921b("cold_boot_splash_duration", true);
            C22574a.m55738f().mo46917a("cold_boot_splash_to_main", true);
        }
    }

    public boolean tryOpenByScheme(C18760l lVar, C45696i iVar) {
        C47625i.m103103a("openSplashScheme: from = SplashActivity");
        return C45706n.m99512a(this, lVar, iVar);
    }
}
