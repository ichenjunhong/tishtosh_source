package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.PublishPermissionFragment;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity */
public class PublishPermissionActivity extends AmeActivity {
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.db, R.anim.da);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dm);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("extra.TYPE", 0);
        int intExtra2 = intent.getIntExtra("extra.PERMISSION", 0);
        int intExtra3 = intent.getIntExtra("extra.Private.DESCRIPTION", 0);
        int intExtra4 = intent.getIntExtra("extra.Friend.DESCRIPTION", 0);
        C0654k supportFragmentManager = getSupportFragmentManager();
        if (((PublishPermissionFragment) supportFragmentManager.mo2222a((int) R.id.ajf)) == null) {
            PublishPermissionFragment publishPermissionFragment = new PublishPermissionFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("extra.TYPE", intExtra);
            bundle2.putInt("extra.PERMISSION", intExtra2);
            bundle2.putInt("extra.Private.DESCRIPTION", intExtra3);
            bundle2.putInt("extra.Friend.DESCRIPTION", intExtra4);
            publishPermissionFragment.setArguments(bundle2);
            supportFragmentManager.mo2225a().mo2175a((int) R.id.ajf, (Fragment) publishPermissionFragment).mo2189b();
        }
        findViewById(R.id.f07).setOnClickListener(new C43215di(this, intExtra2));
        C52711k.m112240b(this, "publishPermissionActivity");
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a0_).fitsSystemWindows(true).statusBarDarkFont(true).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m93012a(Fragment fragment, int i, int i2, int i3, int i4, int i5) {
        Intent intent = new Intent(fragment.getActivity(), PublishPermissionActivity.class);
        intent.putExtra("extra.TYPE", i);
        intent.putExtra("extra.PERMISSION", i2);
        intent.putExtra("extra.Private.DESCRIPTION", i3);
        intent.putExtra("extra.Friend.DESCRIPTION", i4);
        fragment.startActivityForResult(intent, 2);
        fragment.getActivity().overridePendingTransition(R.anim.dc, R.anim.db);
    }
}
