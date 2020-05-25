package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ContactsActivity_ViewBinding */
public class ContactsActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ContactsActivity f84901a;

    /* renamed from: b */
    private View f84902b;

    /* renamed from: c */
    private View f84903c;

    public void unbind() {
        ContactsActivity contactsActivity = this.f84901a;
        if (contactsActivity != null) {
            this.f84901a = null;
            contactsActivity.mListView = null;
            contactsActivity.mTitleBar = null;
            contactsActivity.mStatusView = null;
            contactsActivity.mRefreshLayout = null;
            contactsActivity.ivBindPhone = null;
            contactsActivity.enterBindRl = null;
            this.f84902b.setOnClickListener(null);
            this.f84902b = null;
            this.f84903c.setOnClickListener(null);
            this.f84903c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ContactsActivity_ViewBinding(final ContactsActivity contactsActivity, View view) {
        this.f84901a = contactsActivity;
        contactsActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
        contactsActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        contactsActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        contactsActivity.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, R.id.caw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.uh, "field 'ivBindPhone' and method 'closeBindPhoneHint'");
        contactsActivity.ivBindPhone = (ImageView) Utils.castView(findRequiredView, R.id.uh, "field 'ivBindPhone'", ImageView.class);
        this.f84902b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                contactsActivity.closeBindPhoneHint();
            }
        });
        contactsActivity.enterBindRl = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.aat, "field 'enterBindRl'", RelativeLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.aau, "method 'enterBindPhone'");
        this.f84903c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                contactsActivity.enterBindPhone();
            }
        });
    }
}
