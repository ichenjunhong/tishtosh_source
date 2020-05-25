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

/* renamed from: com.ss.android.ugc.aweme.friends.ui.z */
final /* synthetic */ class C32779z implements C32572b {

    /* renamed from: a */
    private final InviteFriendsActivity f85359a;

    /* renamed from: b */
    private final User f85360b;

    /* renamed from: c */
    private final ContactModel f85361c;

    C32779z(InviteFriendsActivity inviteFriendsActivity, User user, ContactModel contactModel) {
        this.f85359a = inviteFriendsActivity;
        this.f85360b = user;
        this.f85361c = contactModel;
    }

    /* renamed from: a */
    public final void mo65900a(String str) {
        Intent intent;
        InviteFriendsActivity inviteFriendsActivity = this.f85359a;
        User user = this.f85360b;
        ContactModel contactModel = this.f85361c;
        StringBuilder sb = new StringBuilder();
        sb.append(inviteFriendsActivity.f84983e.mo65892a(C47915gg.m103666o(user)));
        sb.append(str);
        String sb2 = sb.toString();
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb3 = new StringBuilder("smsto:");
            sb3.append(contactModel.phoneNumber);
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb3.toString()));
            intent.putExtra("sms_body", sb2);
            intent.setPackage(Sms.getDefaultSmsPackage(inviteFriendsActivity));
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("address", contactModel.phoneNumber);
            intent.putExtra("sms_body", sb2);
        }
        try {
            if (inviteFriendsActivity.getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                inviteFriendsActivity.startActivity(intent);
                return;
            }
            Toast makeText = Toast.makeText(inviteFriendsActivity.getApplicationContext(), R.string.bsz, 1);
            if (VERSION.SDK_INT == 25) {
                C47905fy.m103630a(makeText);
            }
            makeText.show();
        } catch (Exception unused) {
        }
    }
}
