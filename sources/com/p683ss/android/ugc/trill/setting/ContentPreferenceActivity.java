package com.p683ss.android.ugc.trill.setting;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.trill.language.view.LanguageListFragment;
import com.p683ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.p683ss.android.ugc.trill.setting.C50385a.C50386a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceActivity */
public final class ContentPreferenceActivity extends AmeBaseActivity implements C50386a {

    /* renamed from: a */
    public ContentPreferenceViewModel f126334a;

    /* renamed from: b */
    private C50385a f126335b;

    /* renamed from: c */
    private LanguageListFragment f126336c;

    /* renamed from: d */
    private C50395c f126337d;

    /* renamed from: e */
    private HashMap f126338e;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.e5;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        ImmersionBar.with((Activity) this).destroy();
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: c */
    public final void mo98282c() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f126336c = (LanguageListFragment) supportFragmentManager.mo2224a("language_content_fragment");
        if (this.f126336c == null) {
            this.f126336c = new LanguageListFragment();
        }
        LanguageListFragment languageListFragment = this.f126336c;
        if (languageListFragment == null) {
            C52711k.m112234a();
        }
        if (!languageListFragment.isAdded()) {
            C0679r a = supportFragmentManager.mo2225a();
            C52711k.m112236a((Object) a, "fragmentManager.beginTransaction()");
            a.mo2174a(R.anim.bi, 0, 0, R.anim.bt);
            LanguageListFragment languageListFragment2 = this.f126336c;
            if (languageListFragment2 == null) {
                C52711k.m112234a();
            }
            a.mo2176a(R.id.ajf, languageListFragment2, "language_content_fragment");
            a.mo2179a((String) null);
            a.mo2195c();
        }
    }

    /* renamed from: d */
    public final void mo98283d() {
        if (!C40869c.m90382l()) {
            C23131p.m56692a("vpa_show_in_error_region", "", null);
        }
        if (C47915gg.m103651b() || TimeLockRuler.isInTeenagerModeNewVersion()) {
            C23131p.m56692a("vpa_setting_button_clicked_in_child_mode", "", null);
        }
        C0654k supportFragmentManager = getSupportFragmentManager();
        this.f126337d = (C50395c) supportFragmentManager.mo2224a("vpa_choice_fragment");
        if (this.f126337d == null) {
            this.f126337d = new C50395c();
        }
        C50395c cVar = this.f126337d;
        if (cVar == null) {
            C52711k.m112234a();
        }
        if (!cVar.isAdded()) {
            C0679r a = supportFragmentManager.mo2225a();
            C52711k.m112236a((Object) a, "fragmentManager.beginTransaction()");
            a.mo2174a(R.anim.bi, 0, 0, R.anim.bt);
            C50395c cVar2 = this.f126337d;
            if (cVar2 == null) {
                C52711k.m112234a();
            }
            a.mo2176a(R.id.ajf, cVar2, "vpa_choice_fragment");
            a.mo2179a((String) null);
            a.mo2195c();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", true);
        super.onCreate(bundle);
        if (this.f126338e == null) {
            this.f126338e = new HashMap();
        }
        View view = (View) this.f126338e.get(Integer.valueOf(R.id.cfc));
        if (view == null) {
            view = findViewById(R.id.cfc);
            this.f126338e.put(Integer.valueOf(R.id.cfc), view);
        }
        ((RelativeLayout) view).setBackgroundColor(getResources().getColor(R.color.a3i));
        this.f126335b = (C50385a) getSupportFragmentManager().mo2224a("content_setting_host_fragment");
        if (this.f126335b == null) {
            this.f126335b = new C50385a();
            C0679r a = getSupportFragmentManager().mo2225a();
            C50385a aVar = this.f126335b;
            if (aVar == null) {
                C52711k.m112234a();
            }
            a.mo2176a(R.id.ajf, aVar, "content_setting_host_fragment").mo2195c();
            C50385a aVar2 = this.f126335b;
            if (aVar2 == null) {
                C52711k.m112234a();
            }
            C50386a aVar3 = this;
            C52711k.m112240b(aVar3, "listener");
            aVar2.f126348c = aVar3;
        }
        C0209x a2 = C0214z.m440a((FragmentActivity) this).mo359a(ContentPreferenceViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(th…nceViewModel::class.java)");
        this.f126334a = (ContentPreferenceViewModel) a2;
        ContentPreferenceViewModel contentPreferenceViewModel = this.f126334a;
        if (contentPreferenceViewModel == null) {
            C52711k.m112237a("mViewModel");
        }
        contentPreferenceViewModel.mo98277f();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", false);
    }
}
