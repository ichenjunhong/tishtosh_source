package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.design.widget.AppBarLayout;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity_ViewBinding */
public class IAddFriendsActivity_ViewBinding extends BaseAddFriendsActivity_ViewBinding {

    /* renamed from: a */
    private IAddFriendsActivity f84944a;

    /* renamed from: b */
    private View f84945b;

    /* renamed from: c */
    private View f84946c;

    public void unbind() {
        IAddFriendsActivity iAddFriendsActivity = this.f84944a;
        if (iAddFriendsActivity != null) {
            this.f84944a = null;
            iAddFriendsActivity.mRefreshLayout = null;
            iAddFriendsActivity.mRecyclerView = null;
            iAddFriendsActivity.mStatusView = null;
            iAddFriendsActivity.mSearchLayout = null;
            iAddFriendsActivity.mAppBarLayout = null;
            iAddFriendsActivity.mEditSearch = null;
            iAddFriendsActivity.mTvSearchHit = null;
            iAddFriendsActivity.mTvSearchBtn = null;
            iAddFriendsActivity.mBtnSearchClear = null;
            this.f84945b.setOnClickListener(null);
            this.f84945b = null;
            this.f84946c.setOnClickListener(null);
            this.f84946c = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public IAddFriendsActivity_ViewBinding(final IAddFriendsActivity iAddFriendsActivity, View view) {
        super(iAddFriendsActivity, view);
        this.f84944a = iAddFriendsActivity;
        iAddFriendsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.c9z, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        iAddFriendsActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.c_1, "field 'mRecyclerView'", RecyclerView.class);
        iAddFriendsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        iAddFriendsActivity.mSearchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.b9i, "field 'mSearchLayout'", LinearLayout.class);
        iAddFriendsActivity.mAppBarLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, R.id.fr, "field 'mAppBarLayout'", AppBarLayout.class);
        iAddFriendsActivity.mEditSearch = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.ac_, "field 'mEditSearch'", DmtEditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.dfi, "field 'mTvSearchHit' and method 'searchUser'");
        iAddFriendsActivity.mTvSearchHit = (DmtTextView) Utils.castView(findRequiredView, R.id.dfi, "field 'mTvSearchHit'", DmtTextView.class);
        this.f84945b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                iAddFriendsActivity.searchUser();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dfe, "field 'mTvSearchBtn' and method 'searchUser'");
        iAddFriendsActivity.mTvSearchBtn = (DmtTextView) Utils.castView(findRequiredView2, R.id.dfe, "field 'mTvSearchBtn'", DmtTextView.class);
        this.f84946c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                iAddFriendsActivity.searchUser();
            }
        });
        iAddFriendsActivity.mBtnSearchClear = (ImageButton) Utils.findRequiredViewAsType(view, R.id.nh, "field 'mBtnSearchClear'", ImageButton.class);
        iAddFriendsActivity.mSearchHitString = view.getContext().getResources().getString(R.string.db4);
    }
}
