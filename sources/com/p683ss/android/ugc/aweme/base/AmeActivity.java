package com.p683ss.android.ugc.aweme.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0183j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.base.component.C23504f;
import com.p683ss.android.ugc.aweme.base.p1418i.C23548d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23690e;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.lancet.I18nLancet.AmeActivityResumeRun;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1391aw.C23300a;
import com.p683ss.android.ugc.aweme.utils.C47852ej;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53755c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.AmeActivity */
public class AmeActivity extends AbsActivity implements C22582c {
    static C23369a sLoginComponentFactory;
    private Intent mCurrentIntent;
    private C23690e mDeeplinkBackView;
    public boolean mFirstResumed = true;
    private C23504f mLoginComponent;
    private ProgressDialog mProgressDialog;
    private Resources mResourcesWrapper;

    /* renamed from: com.ss.android.ugc.aweme.base.AmeActivity$a */
    public interface C23369a {
        /* renamed from: a */
        C23504f mo48435a(AbsActivity absActivity);
    }

    public static C23369a getLoginComponentFactory() {
        return sLoginComponentFactory;
    }

    public void attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Analysis getAnalysis() {
        return null;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    public void onConfigurationChanged$___twin___(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public int subscriberPriority() {
        return 0;
    }

    public void onStart() {
        super.onStart();
        this.mFirstResumed = false;
    }

    public void showLoginDialog() {
        showLoginDialogWithShowPosition("");
    }

    public boolean checkIsMainThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        C11016e.m22301a((Activity) null);
        tryRemoveDeeplinkBackView();
    }

    public ProgressDialog showProgressDialog() {
        return showProgressDialog(getString(R.string.c0f));
    }

    public void showProtocolDialog() {
        if (getLoginComponent() != null) {
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    AmeActivity.this.getLoginComponent().cu_();
                }
            });
        }
    }

    public void dismissProgressDialog() {
        if (this.mProgressDialog != null && this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent == null || SmartRouter.isSmartIntent(intent)) {
            return intent;
        }
        Intent smartIntent = SmartRouter.smartIntent(intent);
        setIntent(smartIntent);
        return smartIntent;
    }

    public void onDestroy() {
        C53755c a = C53755c.m114319a();
        if (isRegisterEventBus() && a.mo112958b((Object) this)) {
            a.mo112959c((Object) this);
        }
        super.onDestroy();
    }

    public void tryRemoveDeeplinkBackView() {
        if (this.mDeeplinkBackView != null && checkIsMainThread()) {
            ((ViewGroup) getWindow().getDecorView()).removeView(this.mDeeplinkBackView);
            this.mDeeplinkBackView = null;
        }
    }

    public C23504f getLoginComponent() {
        if (this.mLoginComponent == null) {
            if (sLoginComponentFactory == null) {
                this.mLoginComponent = C27965f.f73395a;
            } else {
                this.mLoginComponent = sLoginComponentFactory.mo48435a(this);
            }
            if (this.mLoginComponent instanceof C0183j) {
                getLifecycle().mo324a((C0183j) this.mLoginComponent);
            }
        }
        return this.mLoginComponent;
    }

    public Resources getResources() {
        if (!C23548d.m57745a(this, this.mFirstResumed)) {
            return super.getResources();
        }
        if (this.mResourcesWrapper == null) {
            this.mResourcesWrapper = new C23548d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
        }
        return this.mResourcesWrapper;
    }

    public void onResume() {
        try {
            onResume$___twin___();
            C35857a.m81001b().mo74526a(new AmeActivityResumeRun(this)).mo74527a();
            C47859eq.m103529a(this);
        } catch (Throwable th) {
            C47852ej.m103499a();
            throw th;
        }
    }

    private void addDeeplinkBackView() {
        if (getIntent() != null && checkIsMainThread()) {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            Intent intent = getIntent();
            C52711k.m112240b(intent, "intent");
            C52711k.m112240b(this, "activity");
            C23690e eVar = new C23690e(intent, this);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.setMargins(0, C23728o.m58241a(90.0d), 0, 0);
            eVar.setLayoutParams(layoutParams);
            this.mDeeplinkBackView = eVar;
            viewGroup.addView(this.mDeeplinkBackView);
        }
    }

    public void onResume$___twin___() {
        boolean z;
        boolean z2;
        this.mFirstResumed = true;
        C11016e.m22301a((Activity) this);
        super.onResume();
        Intent intent = this.mCurrentIntent;
        boolean z3 = false;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("VENDOR_BACK_URL_FOR_INTENT_KEY");
            String stringExtra2 = intent.getStringExtra("VENDOR_BTN_NAME_FOR_INTENT_KEY");
            CharSequence charSequence = stringExtra;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                CharSequence charSequence2 = stringExtra2;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            this.mCurrentIntent = null;
            addDeeplinkBackView();
        }
    }

    public static void setLoginComponentFactory(C23369a aVar) {
        sLoginComponentFactory = aVar;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mCurrentIntent = intent;
    }

    public void setContentView(int i) {
        super.setContentView(i);
        ButterKnife.bind((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C23300a.m57313a(context);
        Context b = C33102c.m76095b(context);
        C27548d.m66217a(b);
        attachBaseContext$___twin___(b);
    }

    public void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged$___twin___(configuration);
        C33106b.m76111b(this);
    }

    public void onCreate(Bundle bundle) {
        onCreate$___twin___(bundle);
        C33106b.m76111b(this);
    }

    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind((Activity) this);
    }

    public void showLoginDialogWithShowPosition(final String str) {
        if (getLoginComponent() != null) {
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    AmeActivity.this.getLoginComponent().mo48660a(str);
                }
            });
        }
    }

    private ProgressDialog getThemedProgressDialog(Context context) {
        if (VERSION.SDK_INT >= 11) {
            return new ProgressDialog(context, 3);
        }
        return new ProgressDialog(context);
    }

    public void onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder("当前页面：");
        sb.append(getClass().getSimpleName());
        C32458a.m75144a(sb.toString());
        C53755c a = C53755c.m114319a();
        if (!a.mo112958b((Object) this) && isRegisterEventBus()) {
            a.mo112955a((Object) this);
        }
        this.mCurrentIntent = getIntent();
    }

    public ProgressDialog showProgressDialog(String str) {
        if (this.mProgressDialog == null) {
            this.mProgressDialog = getThemedProgressDialog(this);
            this.mProgressDialog.setCanceledOnTouchOutside(false);
        }
        if (!this.mProgressDialog.isShowing()) {
            this.mProgressDialog.setMessage(str);
            this.mProgressDialog.show();
        }
        return this.mProgressDialog;
    }
}
