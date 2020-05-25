package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38956a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.PoiContentActivity */
public class PoiContentActivity extends AmeSSActivity {

    /* renamed from: a */
    private String f100335a;

    /* renamed from: b */
    private String f100336b;

    public void setStatusBarColor() {
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C41302w.m91042a().mo83858a((Activity) this, "aweme://main");
        }
    }

    public Analysis getAnalysis() {
        long j;
        try {
            j = Long.parseLong(this.f100335a);
        } catch (Exception unused) {
            j = 0;
        }
        return new Analysis().setLabelName("poi_page").setExt_value(j);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a3i));
        this.f100335a = getIntent().getStringExtra("id");
        this.f100336b = getIntent().getStringExtra(LeakCanaryFileProvider.f132049i);
        C38956a aVar = (C38956a) getIntent().getSerializableExtra("EXTRA_POI_AWEME_POSITION");
        String stringExtra = getIntent().getStringExtra("aweme_id");
        C0679r a = getSupportFragmentManager().mo2225a();
        String str = this.f100335a;
        String str2 = this.f100336b;
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("poi_bundle", new C39129m().mo79718a(str).mo79724f(str2).mo79713a());
        bundle2.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "poi_page");
        if (aVar != null) {
            bundle2.putSerializable("EXTRA_POI_AWEME_POSITION", aVar);
        }
        bundle2.putString("aweme_id", stringExtra);
        C39408t tVar = new C39408t();
        tVar.setArguments(bundle2);
        tVar.setUserVisibleHint(true);
        a.mo2192b(R.id.yw, tVar, "poi_detail_fragment_tag");
        a.mo2189b();
    }
}
