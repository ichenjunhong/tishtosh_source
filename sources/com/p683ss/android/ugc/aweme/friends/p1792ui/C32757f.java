package com.p683ss.android.ugc.aweme.friends.p1792ui;

import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.f */
final /* synthetic */ class C32757f implements C23596b {

    /* renamed from: a */
    private final ContactsActivity f85315a;

    C32757f(ContactsActivity contactsActivity) {
        this.f85315a = contactsActivity;
    }

    /* renamed from: a */
    public final void mo47048a() {
        ContactsActivity contactsActivity = this.f85315a;
        if (contactsActivity.f84884b != null) {
            contactsActivity.f84884b.mo44934a_(Integer.valueOf(1));
            return;
        }
        contactsActivity.mRefreshLayout.setRefreshing(false);
    }
}
