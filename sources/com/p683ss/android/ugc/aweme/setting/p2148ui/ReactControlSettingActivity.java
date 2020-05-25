package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity */
public class ReactControlSettingActivity extends BaseControlSettingActivity {
    /* renamed from: c */
    public final String mo85586c() {
        return "react";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ReactControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo85579a() {
        this.f105626a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    /* renamed from: d */
    public final void mo85587d() {
        this.mEveryoneItem.setTag(Integer.valueOf(0));
        this.mFriendsItem.setTag(Integer.valueOf(1));
        this.mOffItem.setTag(Integer.valueOf(3));
    }

    /* renamed from: b */
    public final void mo85583b() {
        this.mTitle.setText(getString(R.string.ff8));
        if (C20902b.m53242a().getCurUser().isSecret()) {
            mo85582a((CharSequence) getString(R.string.d3s));
        } else {
            mo85582a((CharSequence) getString(R.string.h3p));
        }
        int i = this.f105626a;
        if (i != 3) {
            switch (i) {
                case 0:
                    mo85581a(this.mEveryoneItem);
                    return;
                case 1:
                    mo85581a(this.mFriendsItem);
                    this.mFriendsItem.setLeftText(getString(R.string.clp));
                    return;
            }
        } else {
            mo85581a(this.mOffItem);
        }
    }

    /* renamed from: a */
    public final void mo85580a(int i) {
        if (i != 3) {
            switch (i) {
                case 0:
                    mo85581a(this.mEveryoneItem);
                    return;
                case 1:
                    mo85581a(this.mFriendsItem);
                    return;
            }
        } else {
            mo85581a(this.mOffItem);
        }
    }
}
