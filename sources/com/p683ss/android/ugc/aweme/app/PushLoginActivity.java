package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.sdk.activity.SSActivity;
import com.p683ss.android.ugc.aweme.C23291au;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.IAccountService.C20839f;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1363a.C22913i;
import com.p683ss.android.ugc.aweme.app.p1363a.C22917m;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.app.PushLoginActivity */
public class PushLoginActivity extends SSActivity {

    /* renamed from: a */
    private Long f61184a;

    /* renamed from: b */
    private Handler f61185b = new Handler(Looper.myLooper());

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f61185b.removeCallbacksAndMessages(null);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", true);
        super.onResume();
        if (!(this.f61184a == null || this.f61184a.longValue() == -1)) {
            this.f61185b.postDelayed(C23040az.f61393a, this.f61184a.longValue());
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        final Bundle bundle2;
        final Intent intent;
        final String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        final Intent intent2 = (Intent) getIntent().getParcelableExtra("next_step");
        final ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("next_steps");
        Intent intent3 = getIntent();
        Long l = null;
        if (intent3 != null) {
            bundle2 = intent3.getBundleExtra("multi_account");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            intent = (Intent) bundle2.getParcelable("push_intent");
        } else {
            intent = null;
        }
        if (intent3 != null) {
            str = intent3.getStringExtra("multi_account_push_uid");
        } else {
            str = null;
        }
        if (intent3 != null) {
            l = Long.valueOf(intent3.getLongExtra("should_pause_main", -1));
        }
        this.f61184a = l;
        final RecordConfig recordConfig = (RecordConfig) getIntent().getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
        final Intent intent4 = new Intent();
        intent4.setClassName(this, "com.ss.android.ugc.aweme.main.MainActivity");
        C228311 r3 = new C23505g() {
            /* renamed from: a */
            public final void mo46279a() {
                if (bundle2 == null || TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str) || str.equals(C20854a.m53167g().getCurUserId())) {
                        if (intent2 != null) {
                            PushLoginActivity.this.startActivity(intent2);
                        } else if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 1) {
                            PushLoginActivity.this.startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
                        }
                    }
                    if (recordConfig != null) {
                        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader() {
                            public final void onLoad(AsyncAVService asyncAVService, long j) {
                                asyncAVService.uiService().recordService().startRecord((Context) PushLoginActivity.this, recordConfig);
                            }
                        });
                    }
                    PushLoginActivity.this.finish();
                    return;
                }
                if (TextUtils.equals(str, C20854a.m53167g().getCurUserId())) {
                    bundle2.putBoolean("login_jump", true);
                    bundle2.putParcelable("push_intent", intent);
                    C23794bh.m58399m().mo56365a(bundle2);
                } else {
                    PushLoginActivity.this.startActivity(intent4);
                }
                PushLoginActivity.this.finish();
            }

            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
                PushLoginActivity.this.finish();
            }
        };
        Bundle bundle3 = new Bundle();
        if (C20854a.m53167g().isLogin()) {
            bundle3.putBoolean("force_use_default_login_method", true);
            bundle3.putBoolean("need_auto_fill_latest_login_info", false);
        }
        C23291au b = C20854a.m53162b();
        C20837d b2 = new C20837d().mo44381a((Activity) this).mo44385a("push").mo44386b("push");
        b2.f56782g = true;
        b.showLoginAndRegisterView(b2.mo44382a(bundle3).mo44383a((C20839f) new C22913i()).mo44384a((C20840g) new C22917m(r3)).mo44380a());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", false);
    }
}
