package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment_ViewBinding */
public class AbsPoiAwemeFeedFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AbsPoiAwemeFeedFragment f100297a;

    /* renamed from: b */
    private View f100298b;

    /* renamed from: c */
    private View f100299c;

    public void unbind() {
        AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment = this.f100297a;
        if (absPoiAwemeFeedFragment != null) {
            this.f100297a = null;
            absPoiAwemeFeedFragment.mStatusView = null;
            absPoiAwemeFeedFragment.mStartRecodeLayout = null;
            absPoiAwemeFeedFragment.mStartRecordOutRing = null;
            absPoiAwemeFeedFragment.mRecyclerView = null;
            this.f100298b.setOnClickListener(null);
            this.f100298b = null;
            this.f100299c.setOnClickListener(null);
            this.f100299c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AbsPoiAwemeFeedFragment_ViewBinding(final AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment, View view) {
        this.f100297a = absPoiAwemeFeedFragment;
        absPoiAwemeFeedFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csk, "field 'mStatusView'", DmtStatusView.class);
        absPoiAwemeFeedFragment.mStartRecodeLayout = view.findViewById(R.id.csb);
        absPoiAwemeFeedFragment.mStartRecordOutRing = view.findViewById(R.id.cse);
        absPoiAwemeFeedFragment.mRecyclerView = (NestedScrollingRecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mRecyclerView'", NestedScrollingRecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "method 'onClick'");
        this.f100298b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absPoiAwemeFeedFragment.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.cmr, "method 'onClick'");
        this.f100299c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                absPoiAwemeFeedFragment.onClick(view);
            }
        });
    }
}
