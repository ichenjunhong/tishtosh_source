package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.TimeLineViewHolder_ViewBinding */
public class TimeLineViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TimeLineViewHolder f78268a;

    public void unbind() {
        TimeLineViewHolder timeLineViewHolder = this.f78268a;
        if (timeLineViewHolder != null) {
            this.f78268a = null;
            timeLineViewHolder.mDescribeView = null;
            timeLineViewHolder.mAvHeadView = null;
            timeLineViewHolder.mTvLocation = null;
            timeLineViewHolder.txtDistance = null;
            timeLineViewHolder.mTvName = null;
            timeLineViewHolder.tagLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TimeLineViewHolder_ViewBinding(TimeLineViewHolder timeLineViewHolder, View view) {
        this.f78268a = timeLineViewHolder;
        timeLineViewHolder.mDescribeView = (TextView) Utils.findRequiredViewAsType(view, R.id.bo8, "field 'mDescribeView'", TextView.class);
        timeLineViewHolder.mAvHeadView = (SmartAvatarImageView) Utils.findRequiredViewAsType(view, R.id.hi, "field 'mAvHeadView'", SmartAvatarImageView.class);
        timeLineViewHolder.mTvLocation = (TextView) Utils.findRequiredViewAsType(view, R.id.bi7, "field 'mTvLocation'", TextView.class);
        timeLineViewHolder.txtDistance = (TextView) Utils.findRequiredViewAsType(view, R.id.dkc, "field 'txtDistance'", TextView.class);
        timeLineViewHolder.mTvName = (TextView) Utils.findRequiredViewAsType(view, R.id.aw5, "field 'mTvName'", TextView.class);
        timeLineViewHolder.tagLayout = (TagLayout) Utils.findRequiredViewAsType(view, R.id.cxc, "field 'tagLayout'", TagLayout.class);
    }
}
