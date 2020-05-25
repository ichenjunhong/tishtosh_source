package com.p683ss.android.ugc.aweme.optimize;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1397az.p1400c.C23338a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity */
public final class LayerInfoSettingActivity extends AppCompatActivity {

    /* renamed from: a */
    public SharedPreferences f98009a;

    /* renamed from: b */
    private HashMap f98010b;

    /* renamed from: com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity$a */
    static final class C38528a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LayerInfoSettingActivity f98011a;

        /* renamed from: b */
        final /* synthetic */ SettingItemSwitch f98012b;

        /* renamed from: c */
        final /* synthetic */ String f98013c;

        C38528a(LayerInfoSettingActivity layerInfoSettingActivity, SettingItemSwitch settingItemSwitch, String str) {
            this.f98011a = layerInfoSettingActivity;
            this.f98012b = settingItemSwitch;
            this.f98013c = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98012b.toggle();
            SharedPreferences sharedPreferences = this.f98011a.f98009a;
            if (sharedPreferences == null) {
                C52711k.m112237a("sp");
            }
            sharedPreferences.edit().putBoolean(this.f98013c, this.f98012b.isChecked()).apply();
        }
    }

    /* renamed from: a */
    private View m85870a(int i) {
        if (this.f98010b == null) {
            this.f98010b = new HashMap();
        }
        View view = (View) this.f98010b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98010b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C23338a.m57402a(this);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c0);
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "LayerInfoTest", 0);
        C52711k.m112236a((Object) a, "AppContextManager.getApp…t\", Context.MODE_PRIVATE)");
        this.f98009a = a;
        SettingItemSwitch settingItemSwitch = (SettingItemSwitch) m85870a(R.id.cp0);
        C52711k.m112236a((Object) settingItemSwitch, "sis_open");
        m85871a(settingItemSwitch, "Open", false);
        SettingItemSwitch settingItemSwitch2 = (SettingItemSwitch) m85870a(R.id.cos);
        C52711k.m112236a((Object) settingItemSwitch2, "sis_filter_no_bg");
        m85871a(settingItemSwitch2, "FNoBg", true);
        SettingItemSwitch settingItemSwitch3 = (SettingItemSwitch) m85870a(R.id.cot);
        C52711k.m112236a((Object) settingItemSwitch3, "sis_filter_not_in_frame");
        m85871a(settingItemSwitch3, "FNoInFrame", true);
        SettingItemSwitch settingItemSwitch4 = (SettingItemSwitch) m85870a(R.id.cou);
        C52711k.m112236a((Object) settingItemSwitch4, "sis_filter_size_100");
        m85871a(settingItemSwitch4, "FSize100", true);
        SettingItemSwitch settingItemSwitch5 = (SettingItemSwitch) m85870a(R.id.cov);
        C52711k.m112236a((Object) settingItemSwitch5, "sis_filter_tv");
        m85871a(settingItemSwitch5, "FTv", true);
        SettingItemSwitch settingItemSwitch6 = (SettingItemSwitch) m85870a(R.id.cox);
        C52711k.m112236a((Object) settingItemSwitch6, "sis_lighter_overdraw");
        m85871a(settingItemSwitch6, "LOverdraw", true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.optimize.LayerInfoSettingActivity", "onCreate", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m85871a(SettingItemSwitch settingItemSwitch, String str, boolean z) {
        C52711k.m112240b(settingItemSwitch, "$this$bind");
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        SharedPreferences sharedPreferences = this.f98009a;
        if (sharedPreferences == null) {
            C52711k.m112237a("sp");
        }
        settingItemSwitch.setChecked(sharedPreferences.getBoolean(str, z));
        settingItemSwitch.setOnClickListener(new C38528a(this, settingItemSwitch, str));
    }
}
