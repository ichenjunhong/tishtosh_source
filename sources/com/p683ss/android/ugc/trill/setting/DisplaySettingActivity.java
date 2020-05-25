package com.p683ss.android.ugc.trill.setting;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.trill.language.view.AppLanguageListFragment;
import com.p683ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.p683ss.android.ugc.trill.setting.C50393b.C50394a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.DisplaySettingActivity */
public class DisplaySettingActivity extends AmeBaseActivity implements C50394a {

    /* renamed from: a */
    AppLanguageViewModel f126339a;

    /* renamed from: b */
    private C50393b f126340b;

    /* renamed from: c */
    private AppLanguageListFragment f126341c;
    ViewGroup rootView;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bu0;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: a */
    public final void mo98285a(Bundle bundle) {
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f126341c = (AppLanguageListFragment) supportFragmentManager.mo2224a("language_app_fragment");
        if (this.f126341c == null) {
            this.f126341c = new AppLanguageListFragment();
            this.f126341c.setArguments(bundle);
        }
        if (!this.f126341c.isAdded()) {
            C0679r a = supportFragmentManager.mo2225a();
            a.mo2174a(R.anim.bi, 0, 0, R.anim.bt);
            a.mo2176a(R.id.ajf, this.f126341c, "language_app_fragment");
            a.mo2179a((String) null);
            a.mo2195c();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        this.rootView.setBackgroundColor(getResources().getColor(R.color.a3i));
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f126340b = (C50393b) supportFragmentManager.mo2224a("language_setting_host_fragment");
        if (this.f126340b == null) {
            this.f126340b = new C50393b();
            supportFragmentManager.mo2225a().mo2176a(R.id.ajf, this.f126340b, "language_setting_host_fragment").mo2195c();
            this.f126340b.f126361e = this;
        }
        this.f126339a = (AppLanguageViewModel) C0214z.m440a((FragmentActivity) this).mo359a(AppLanguageViewModel.class);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.DisplaySettingActivity", "onCreate", false);
    }
}
