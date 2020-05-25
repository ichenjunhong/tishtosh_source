package com.p683ss.android.ugc.aweme.discover.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26446by;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27497g;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4DetailListModel;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28651i;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.feed.param.C30668a;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity */
public class DiscoverDetailActivity extends DetailActivity {
    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo55886a(Bundle bundle) {
        C30669b a = C30668a.m71946a(this);
        if (a.getCellDetailType() != 2 || !TextUtils.isEmpty(a.getCellId())) {
            C31213v.m72896a((C26875a) new DiscoveryV4DetailListModel());
            C0654k supportFragmentManager = getSupportFragmentManager();
            this.f72256b = (C27497g) supportFragmentManager.mo2224a("detail_fragment");
            if (this.f72256b == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("feed_param", a);
                C28651i iVar = new C28651i();
                iVar.setArguments(bundle2);
                this.f72256b = iVar;
            }
            this.f72256b.setUserVisibleHint(true);
            if (bundle == null) {
                C0679r a2 = supportFragmentManager.mo2225a();
                C26446by.m63937a(getParent(), this.f72256b);
                a2.mo2192b(R.id.ajf, this.f72256b, "detail_fragment");
                a2.mo2189b();
            }
            return;
        }
        finish();
    }

    /* renamed from: a */
    public static void m66409a(Context context, int i, String str, String str2, int i2) {
        if (context != null) {
            Intent intent = new Intent(context, DiscoverDetailActivity.class);
            intent.putExtra("cell_id", str);
            intent.putExtra("type", i);
            intent.putExtra("id", str2);
            intent.putExtra("refer", "playlist");
            intent.putExtra("video_from", "from_discovery_v3");
            intent.putExtra("index", i2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m66410a(Context context, int i, String str, String str2, int i2, String str3, String str4) {
        if (context != null) {
            int g = NewDiscoverV4Experiment.m69623g();
            Intent intent = new Intent(context, DiscoverDetailActivity.class);
            int i3 = 2;
            if (g == 1 || g == 2) {
                i3 = 0;
                intent.putExtra("refer", "discovery_category");
            } else if (!NewDiscoverV4Experiment.m69620d() || !TextUtils.equals(str3, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                intent.putExtra("refer", "playlist");
                i3 = 1;
            } else if (NewDiscoverV4Experiment.m69618b()) {
                intent.putExtra("refer", "discovery_tab");
            } else {
                intent.putExtra("refer", "playlist");
            }
            intent.putExtra("video_from", "from_discovery_v4");
            intent.putExtra("detail_cell_type", i3);
            intent.putExtra("tab_name", str3);
            intent.putExtra("tab_text", str4);
            intent.putExtra("cell_id", str);
            intent.putExtra("type", i);
            intent.putExtra("id", str2);
            intent.putExtra("index", i2);
            context.startActivity(intent);
        }
    }
}
