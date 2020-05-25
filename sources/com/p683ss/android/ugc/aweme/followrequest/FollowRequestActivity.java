package com.p683ss.android.ugc.aweme.followrequest;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.followrequest.p1771a.C32363a;
import com.p683ss.android.ugc.aweme.followrequest.p1772b.C32371a;
import com.p683ss.android.ugc.aweme.followrequest.p1772b.C32372b;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39974j;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.followrequest.FollowRequestActivity */
public class FollowRequestActivity extends AmeBaseActivity implements C26846a, C32370b, C32372b {

    /* renamed from: a */
    C32371a f84232a;

    /* renamed from: b */
    private C32363a f84233b;
    DmtStatusView mListStatusView;
    RecyclerView mRecyclerView;
    View mStatusView;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bc;
    }

    public void back() {
        finish();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void ar_() {
        this.f84232a.mo65501f();
    }

    /* renamed from: c */
    public final void mo65490c() {
        if (this.f84233b.f70699x) {
            this.f84233b.mo54798c(false);
            this.f84233b.notifyDataSetChanged();
            this.f84233b.an_();
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.mo19213g();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onResume", true);
        super.onResume();
        this.f84232a.mo65500e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onResume", false);
    }

    /* renamed from: a */
    public final void mo65488a(boolean z) {
        if (z) {
            this.f84233b.am_();
            return;
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.mo19212f();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onCreate", true);
        super.onCreate(bundle);
        this.mTitleBar.setTitle((int) R.string.b4z);
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                FollowRequestActivity.this.finish();
            }
        });
        C11065a.m22394b(this);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, DynamicTabYellowPointVersion.DEFAULT);
        }
        this.f84233b = new C32363a(this);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
        this.mRecyclerView.setAdapter(this.f84233b);
        this.f84233b.mo54788a((C26846a) this);
        this.f84233b.mo54798c(true);
        this.mListStatusView.setBuilder(C10719a.m21676a((Context) this).mo19225a(R.string.cxn, R.string.cxm).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C32362a(this)));
        this.mListStatusView.mo19212f();
        this.f84232a = new C32371a();
        this.f84232a.mo54799a(new C39974j());
        this.f84232a.mo54800a(this);
        if (VERSION.SDK_INT >= 19) {
            this.mStatusView.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo65486a(Exception exc, boolean z) {
        if (z) {
            this.f84233b.co_();
            return;
        }
        if (this.f84233b.f70699x) {
            this.f84233b.mo54798c(false);
            this.f84233b.notifyDataSetChanged();
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.mo19214h();
        }
    }

    /* renamed from: a */
    public final void mo65487a(List<User> list, boolean z, boolean z2) {
        if (z) {
            if (list == null || list.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                this.f84233b.an_();
            } else {
                this.f84233b.ao_();
            }
            this.f84233b.mo50304b(list);
            return;
        }
        this.f84233b.mo54798c(true);
        if (!z2) {
            this.f84233b.an_();
        } else {
            this.f84233b.ao_();
        }
        this.f84233b.mo50303a(list);
        if (this.mListStatusView != null) {
            this.mListStatusView.mo19209d();
        }
    }
}
