package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BlackListActivity_ViewBinding */
public class BlackListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BlackListActivity f105635a;

    /* renamed from: b */
    private View f105636b;

    public void unbind() {
        BlackListActivity blackListActivity = this.f105635a;
        if (blackListActivity != null) {
            this.f105635a = null;
            blackListActivity.mTitle = null;
            blackListActivity.mBack = null;
            blackListActivity.mStatusView = null;
            blackListActivity.mRecyclerView = null;
            this.f105636b.setOnClickListener(null);
            this.f105636b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BlackListActivity_ViewBinding(final BlackListActivity blackListActivity, View view) {
        this.f105635a = blackListActivity;
        blackListActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "field 'mBack' and method 'back'");
        blackListActivity.mBack = (ImageView) Utils.castView(findRequiredView, R.id.ik, "field 'mBack'", ImageView.class);
        this.f105636b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                blackListActivity.back();
            }
        });
        blackListActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.l6, "field 'mStatusView'", DmtStatusView.class);
        blackListActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.l5, "field 'mRecyclerView'", RecyclerView.class);
    }
}
