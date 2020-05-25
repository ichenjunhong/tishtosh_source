package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity */
public class CommentControlSettingActivity extends BaseControlSettingActivity {
    /* renamed from: c */
    public final String mo85586c() {
        return "comment";
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.CommentControlSettingActivity", "onWindowFocusChanged", true);
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
        this.mTitle.setText(getString(R.string.h3y));
        mo85582a((CharSequence) getString(R.string.h3p));
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

    public void onClick(View view) {
        if (view != null) {
            super.onClick(view);
            int id = view.getId();
            C23089d a = new C23089d().mo47829a("enter_from", "privacy_and_safety_settings");
            String str = "";
            if (id == R.id.aci) {
                str = "public";
            } else if (id == R.id.ajw) {
                str = "friends";
            } else if (id == R.id.bu8) {
                str = "no one";
            }
            C26890h.m65011a("disable_account_comment", a.mo47829a("to_status", str).f61491a);
        }
    }
}
