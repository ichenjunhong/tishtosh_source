package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity */
public class DownloadControlSettingActivity extends BaseControlSettingActivity {
    /* renamed from: c */
    public final String mo85586c() {
        return "download_setting";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.DownloadControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo85579a() {
        this.f105626a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    /* renamed from: l */
    public final void mo55288l() {
        C10691a.m21542b((Context) this, (int) R.string.cg0).mo19066a();
    }

    /* renamed from: d */
    public final void mo85587d() {
        this.mEveryoneItem.setTag(Integer.valueOf(0));
        this.mOffItem.setTag(Integer.valueOf(3));
    }

    /* renamed from: b */
    public final void mo85583b() {
        this.mTitle.setText(getString(R.string.h3m));
        this.mEveryoneItem.setLeftText(getString(R.string.clh));
        this.mOffItem.setLeftText(getString(R.string.clb));
        this.mFriendsItem.setVisibility(8);
        if (((Boolean) SharePrefCache.inst().getIsShowAllowDownloadTipSetting().mo47782d()).booleanValue()) {
            mo85582a((CharSequence) getString(R.string.hh));
        }
        int i = this.f105626a;
        if (i != 3) {
            switch (i) {
                case 0:
                    mo85581a(this.mEveryoneItem);
                    return;
                case 1:
                    mo85581a(this.mOffItem);
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

    public void onClick(View view) {
        if (view != null) {
            boolean isSecret = C20854a.m53167g().getCurUser().isSecret();
            int intValue = ((Integer) view.getTag()).intValue();
            if (!isSecret || !(intValue == 0 || intValue == 1)) {
                super.onClick(view);
            } else {
                C10691a.m21548c((Context) this, (int) R.string.cx_).mo19066a();
            }
        }
    }
}
