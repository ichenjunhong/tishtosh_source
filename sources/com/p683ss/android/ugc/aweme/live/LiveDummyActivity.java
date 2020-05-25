package com.p683ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.p431c.C8609a;
import com.bytedance.android.livesdkapi.p431c.C8610b;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.p753k.C12103a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23424c;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.live.LiveDummyActivity */
public class LiveDummyActivity extends AmeActivity implements C8609a {

    /* renamed from: a */
    private C8610b f92247a;

    static {
        C12103a.m24529a();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (this.f92247a != null) {
            this.f92247a.mo10555b();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", true);
        super.onCreate(bundle);
        C23424c.m57556a(this, 0);
        setContentView((int) R.layout.bla);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(R.color.a2j));
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("intent_type", 0);
        if (intExtra == 1) {
            Bundle extras = intent.getExtras();
            C8862e d = C8830k.m17330d();
            if (d != null) {
                C47865ew.m103536a().mo95076a(extras.getString("url"));
                this.f92247a = d.mo15047b(extras);
                Fragment c = this.f92247a.mo10556c();
                c.setArguments(extras);
                getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, c).mo2195c();
            }
        } else if (intExtra == 2) {
            Bundle extras2 = intent.getExtras();
            C8862e d2 = C8830k.m17330d();
            if (d2 != null) {
                Fragment a = d2.mo15024a((Context) this, extras2);
                a.setArguments(extras2);
                getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, a).mo2189b();
            }
        } else if (intExtra == 3) {
            Bundle extras3 = intent.getExtras();
            C8862e d3 = C8830k.m17330d();
            if (d3 != null) {
                getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, d3.mo15046b(this, extras3)).mo2189b();
            }
        } else {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
