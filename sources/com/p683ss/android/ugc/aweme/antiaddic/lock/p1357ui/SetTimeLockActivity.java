package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h.C22773a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22781a.C22782a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.p683ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity */
public class SetTimeLockActivity extends BaseLockActivity {

    /* renamed from: b */
    private C22781a f60936b;
    ViewGroup rootView;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo47172a() {
        return R.layout.cf;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C22731c.m56020a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47174b() {
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        this.f60936b = new C22781a();
        boolean z = false;
        this.f60936b.f61037a = getIntent().getIntExtra("SetTimeLockActivityKeyType", 0);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            C22782a aVar = new C22782a();
            aVar.f61039a = getIntent().getStringExtra("SetTimeLockActivityKeyUid");
            aVar.f61040b = getIntent().getStringExtra("SetTimeLockActivityKeyUsername");
            this.f60936b.f61038b = aVar;
        }
        ((SetLockParamViewModel) C0214z.m440a((FragmentActivity) this).mo359a(SetLockParamViewModel.class)).f61035a.setValue(this.f60936b);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            int intExtra = getIntent().getIntExtra("SetTimeLockActivityKeyLockTimeInMin", 0);
            if (intExtra > 0) {
                ((TimeLockOptionViewModel) C0214z.m440a((FragmentActivity) this).mo359a(TimeLockOptionViewModel.class)).f61036a.setValue(new C22773a(intExtra));
            }
            if (getIntent().getBooleanExtra("SetTimeLockActivityKeyParentState", false)) {
                fragment3 = C22733e.m56033c(this.f60936b.f61037a);
            } else {
                fragment3 = C22733e.m56030a(this.f60936b.f61037a);
            }
            mo47173a(fragment3);
        } else if (this.f60936b.f61037a == 0) {
            if (TimeLockRuler.isSelfTimeLockOn()) {
                fragment2 = C22733e.m56033c(this.f60936b.f61037a);
            } else {
                fragment2 = C22733e.m56030a(this.f60936b.f61037a);
            }
            mo47173a(fragment2);
        } else {
            if (TimeLockRuler.isSelfContentFilterOn() || ((Boolean) C23183v.m56778a().mo47912h().mo47782d()).booleanValue()) {
                z = true;
            }
            if (z) {
                fragment = C22733e.m56033c(this.f60936b.f61037a);
            } else {
                fragment = C22733e.m56030a(this.f60936b.f61037a);
            }
            mo47173a(fragment);
        }
        this.rootView.setBackgroundColor(getResources().getColor(R.color.a3i));
    }

    /* renamed from: a */
    public static void m56007a(Context context, int i, String str, String str2, boolean z, int i2) {
        Intent intent = new Intent(context, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("SetTimeLockActivityKeyFromParent", true);
            intent.putExtra("SetTimeLockActivityKeyUid", str);
            intent.putExtra("SetTimeLockActivityKeyUsername", str2);
            intent.putExtra("SetTimeLockActivityKeyParentState", z);
            intent.putExtra("SetTimeLockActivityKeyLockTimeInMin", i2);
        }
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
