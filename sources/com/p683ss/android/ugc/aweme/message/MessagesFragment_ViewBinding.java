package com.p683ss.android.ugc.aweme.message;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.message.widget.PagerIndicator;
import com.p683ss.android.ugc.aweme.views.RtlViewPager;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.message.MessagesFragment_ViewBinding */
public class MessagesFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MessagesFragment f93978a;

    /* renamed from: b */
    private View f93979b;

    /* renamed from: c */
    private View f93980c;

    public void unbind() {
        MessagesFragment messagesFragment = this.f93978a;
        if (messagesFragment != null) {
            this.f93978a = null;
            messagesFragment.mStatusBarView = null;
            messagesFragment.mTvNoticeAdd = null;
            messagesFragment.mViewPager = null;
            messagesFragment.pagerIndicator = null;
            messagesFragment.mAddFriendIv = null;
            this.f93979b.setOnClickListener(null);
            this.f93979b = null;
            this.f93980c.setOnClickListener(null);
            this.f93980c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MessagesFragment_ViewBinding(final MessagesFragment messagesFragment, View view) {
        this.f93978a = messagesFragment;
        messagesFragment.mStatusBarView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBarView'");
        View findRequiredView = Utils.findRequiredView(view, R.id.cyu, "field 'mTvNoticeAdd' and method 'noticeViewClick'");
        messagesFragment.mTvNoticeAdd = (TextView) Utils.castView(findRequiredView, R.id.cyu, "field 'mTvNoticeAdd'", TextView.class);
        this.f93979b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                messagesFragment.noticeViewClick();
            }
        });
        messagesFragment.mViewPager = (RtlViewPager) Utils.findRequiredViewAsType(view, R.id.ds4, "field 'mViewPager'", RtlViewPager.class);
        messagesFragment.pagerIndicator = (PagerIndicator) Utils.findRequiredViewAsType(view, R.id.e, "field 'pagerIndicator'", PagerIndicator.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.dg, "field 'mAddFriendIv' and method 'addFriendViewClick'");
        messagesFragment.mAddFriendIv = (ImageView) Utils.castView(findRequiredView2, R.id.dg, "field 'mAddFriendIv'", ImageView.class);
        this.f93980c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                messagesFragment.addFriendViewClick();
            }
        });
    }
}
