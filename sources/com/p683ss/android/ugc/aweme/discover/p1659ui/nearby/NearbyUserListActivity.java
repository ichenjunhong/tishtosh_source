package com.p683ss.android.ugc.aweme.discover.p1659ui.nearby;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28570bk;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.nearby.NearbyUserListActivity */
public final class NearbyUserListActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C28657a f75225a = new C28657a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.nearby.NearbyUserListActivity$a */
    public static final class C28657a {
        private C28657a() {
        }

        public /* synthetic */ C28657a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.nearby.NearbyUserListActivity$b */
    static final class C28658b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NearbyUserListActivity f75226a;

        C28658b(NearbyUserListActivity nearbyUserListActivity) {
            this.f75226a = nearbyUserListActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f75226a.finish();
        }
    }

    public final void setStatusBarColor() {
        super.setStatusBarColor();
        C11065a.m22394b(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.btf);
        C26894c.m65022a(findViewById(R.id.aka));
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) C28570bk.m67782a((C41440e) getIntent().getSerializableExtra("search_param"), getIntent().getIntExtra("search_type", C28608ca.f75136d))).mo2189b();
        findViewById(R.id.eb9).setOnClickListener(new C28658b(this));
    }
}
