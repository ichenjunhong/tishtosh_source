package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.d */
final /* synthetic */ class C32755d implements OnClickListener {

    /* renamed from: a */
    private final ContactsActivity f85313a;

    C32755d(ContactsActivity contactsActivity) {
        this.f85313a = contactsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactsActivity contactsActivity = this.f85313a;
        C26890h.m65011a("phone_bundling_click", C23089d.m56640a().mo47829a("enter_from", "contact").f61491a);
        contactsActivity.f84887e = true;
        C20854a.m53165e().bindMobile(contactsActivity, "contact", null, null);
    }
}
