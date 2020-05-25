package com.p683ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity */
public class DraftBoxActivity extends AmeSSActivity {

    /* renamed from: a */
    private C47001k f118632a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onBackPressed() {
        if (this.f118632a != null) {
            C47001k kVar = this.f118632a;
            kVar.mo94288e();
            if (kVar.f118722o) {
                kVar.f118722o = false;
                kVar.mo94293j();
                kVar.mo94292i();
            } else {
                kVar.mo94294k();
            }
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo94253a() {
        this.f118632a = (C47001k) getSupportFragmentManager().mo2222a((int) R.id.ajf);
        if (this.f118632a == null) {
            this.f118632a = new C47001k();
            if (getIntent() != null) {
                this.f118632a.setArguments(getIntent().getExtras());
            }
            getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) this.f118632a).mo2195c();
        }
    }

    /* renamed from: a */
    public static void m101985a(Context context) {
        if (context != null) {
            context.startActivity(new Intent(context, DraftBoxActivity.class));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cz);
        if (C39629l.m88232a().mo58572c().mo49434a(this) == 0) {
            mo94253a();
        } else {
            C39629l.m88232a().mo58572c().mo49436a(this, new C47000j(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a0_).fitsSystemWindows(true).statusBarDarkFont(true).init();
        TTUploaderService.m93071a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m101986a(Context context, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, DraftBoxActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }
    }
}
