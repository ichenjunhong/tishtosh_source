package com.p683ss.android.ugc.trill.setting.children;

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
import com.p683ss.android.ugc.trill.setting.children.ChildrenLanguageSettingHostFragment.C50402a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity */
public class ChildrenDisplaySettingActivity extends AmeBaseActivity implements C50402a {

    /* renamed from: a */
    AppLanguageViewModel f126371a;

    /* renamed from: b */
    private ChildrenLanguageSettingHostFragment f126372b;

    /* renamed from: c */
    private AppLanguageListFragment f126373c;
    ViewGroup rootView;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.e5;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onWindowFocusChanged", true);
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
    public final void mo98303a(Bundle bundle) {
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f126373c = (AppLanguageListFragment) supportFragmentManager.mo2224a("language_app_fragment");
        if (this.f126373c == null) {
            this.f126373c = new AppLanguageListFragment();
            this.f126373c.setArguments(bundle);
        }
        C0679r a = supportFragmentManager.mo2225a();
        a.mo2174a(R.anim.bi, 0, 0, R.anim.bt);
        a.mo2176a(R.id.ajf, this.f126373c, "language_app_fragment");
        a.mo2179a((String) null);
        a.mo2195c();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onCreate", true);
        super.onCreate(bundle);
        this.rootView.setBackgroundColor(getResources().getColor(R.color.a3i));
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f126372b = (ChildrenLanguageSettingHostFragment) supportFragmentManager.mo2222a((int) R.id.ajf);
        if (this.f126372b == null) {
            this.f126372b = new ChildrenLanguageSettingHostFragment();
            supportFragmentManager.mo2225a().mo2176a(R.id.ajf, this.f126372b, "language_setting_host_fragment").mo2195c();
            this.f126372b.f126375a = this;
        }
        this.f126371a = (AppLanguageViewModel) C0214z.m440a((FragmentActivity) this).mo359a(AppLanguageViewModel.class);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onCreate", false);
    }
}
