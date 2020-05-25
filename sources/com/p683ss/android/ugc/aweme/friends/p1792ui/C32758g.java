package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Telephony.Sms;
import android.widget.Toast;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c.C32572b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.g */
final /* synthetic */ class C32758g implements C32572b {

    /* renamed from: a */
    private final C326263 f85316a;

    /* renamed from: b */
    private final User f85317b;

    /* renamed from: c */
    private final ContactModel f85318c;

    C32758g(C326263 r1, User user, ContactModel contactModel) {
        this.f85316a = r1;
        this.f85317b = user;
        this.f85318c = contactModel;
    }

    /* renamed from: a */
    public final void mo65900a(String str) {
        Intent intent;
        C326263 r0 = this.f85316a;
        User user = this.f85317b;
        ContactModel contactModel = this.f85318c;
        StringBuilder sb = new StringBuilder();
        sb.append(ContactsActivity.this.f84889g.mo65892a(C47915gg.m103666o(user)));
        sb.append(str);
        String sb2 = sb.toString();
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb3 = new StringBuilder("smsto:");
            sb3.append(contactModel.phoneNumber);
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb3.toString()));
            intent.putExtra("sms_body", sb2);
            intent.setPackage(Sms.getDefaultSmsPackage(ContactsActivity.this));
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("address", contactModel.phoneNumber);
            intent.putExtra("sms_body", sb2);
        }
        if (ContactsActivity.this.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            ContactsActivity.this.startActivity(intent);
            return;
        }
        Toast makeText = Toast.makeText(ContactsActivity.this.getApplicationContext(), R.string.bsz, 1);
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(makeText);
        }
        makeText.show();
    }
}
