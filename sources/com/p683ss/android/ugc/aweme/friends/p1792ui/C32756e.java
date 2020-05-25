package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.e */
final /* synthetic */ class C32756e implements OnDismissListener {

    /* renamed from: a */
    private final ContactsActivity f85314a;

    C32756e(ContactsActivity contactsActivity) {
        this.f85314a = contactsActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ContactsActivity contactsActivity = this.f85314a;
        if (!contactsActivity.f84887e) {
            contactsActivity.mo66147c();
        }
    }
}
