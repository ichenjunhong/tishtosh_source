package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.profile.C39715aa;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity */
public class ProfileEditActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    private C40391s f102366b;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C39715aa.m88419a((Activity) this);
    }

    public void onBackPressed() {
        this.f102366b.mo82305b();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.bk, R.anim.dq);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f102366b.mo82304a(motionEvent) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b3p);
        C0679r a = getSupportFragmentManager().mo2225a();
        this.f102366b = (C40391s) getSupportFragmentManager().mo2224a("user_profile_edit_fragment");
        if (this.f102366b == null) {
            this.f102366b = C40010c.f101950a.mo82029c();
            C40391s sVar = this.f102366b;
            Bundle bundle2 = new Bundle();
            if (getIntent() != null) {
                bundle2.putInt("jump_school_edit", getIntent().getIntExtra("jump_school_edit", 0));
                if (TextUtils.equals(getIntent().getStringExtra("enter_from"), "message")) {
                    bundle2.putInt("need_focus_id_input", 3);
                } else {
                    bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                }
                bundle2.putInt("need_focus_id_input", getIntent().getIntExtra("need_focus_id_input", 0));
                bundle2.putString("enter_from", getIntent().getStringExtra("enter_from"));
                bundle2.putString("enter_method", getIntent().getStringExtra("enter_method"));
            }
            sVar.setArguments(bundle2);
            a.mo2192b(R.id.ajf, this.f102366b, "user_profile_edit_fragment");
        }
        a.mo2189b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m89261a(Activity activity, Bundle bundle) {
        if (activity != null) {
            if (bundle == null) {
                activity.startActivity(new Intent(activity, ProfileEditActivity.class));
                return;
            }
            Intent intent = new Intent(activity, ProfileEditActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f102366b.onActivityResult(i, i2, intent);
    }
}
