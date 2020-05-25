package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DuetControlSettingActivity */
public class DuetControlSettingActivity extends BaseControlSettingActivity {

    /* renamed from: d */
    private boolean f105694d = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableStitch();

    /* renamed from: c */
    public final String mo85586c() {
        return "duet";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DuetControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DuetControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DuetControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DuetControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DuetControlSettingActivity", "onWindowFocusChanged", true);
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
        if (this.f105694d) {
            this.mTitle.setText(getString(R.string.hiq));
        } else {
            this.mTitle.setText(getString(R.string.h3z));
        }
        if (!C20902b.m53242a().getCurUser().isSecret()) {
            mo85582a((CharSequence) getString(R.string.h3p));
        } else if (this.f105694d) {
            mo85582a((CharSequence) getString(R.string.hin));
        } else {
            mo85582a((CharSequence) getString(R.string.au7));
        }
        int i = this.f105626a;
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

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo85584b(int i) {
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().duetSupportChangeLayout()) {
            this.f105628c.mo44934a_(mo85586c(), Integer.valueOf(i), "react", Integer.valueOf(i));
            return;
        }
        super.mo85584b(i);
    }
}
