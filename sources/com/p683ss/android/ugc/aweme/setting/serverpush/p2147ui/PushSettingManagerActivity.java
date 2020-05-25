package com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.utils.C47875fa;
import com.p683ss.android.ugc.awemepushapi.PushSettingExperiment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity */
public class PushSettingManagerActivity extends AmeSSActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C47875fa.m103569b(this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.btz);
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("FRAGMENT_PUSH_MANAGER_LIST");
        if (a == 0) {
            if (VERSION.SDK_INT < 26 || !C10181b.m20511a().mo18172a(PushSettingExperiment.class, false, "enable_notification_category", 31744, false)) {
                PushSettingManagerFragment pushSettingManagerFragment = new PushSettingManagerFragment();
                pushSettingManagerFragment.setArguments(new Bundle());
                a = pushSettingManagerFragment;
            } else {
                PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = new PushSettingManagerFragmentSecondVersion();
                pushSettingManagerFragmentSecondVersion.setArguments(new Bundle());
                a = pushSettingManagerFragmentSecondVersion;
            }
        }
        supportFragmentManager.mo2225a().mo2192b(R.id.ajf, a, "FRAGMENT_PUSH_MANAGER_LIST").mo2195c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onCreate", false);
    }
}
