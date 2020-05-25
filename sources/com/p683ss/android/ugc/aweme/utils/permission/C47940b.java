package com.p683ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.app.C1160b;
import android.support.p043v7.app.C1160b.C1161a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.b */
public final class C47940b {

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.b$a */
    public interface C47943a {
        /* renamed from: a */
        void mo66302a();
    }

    /* renamed from: a */
    public static void m103728a(int i, int i2, Activity activity) {
        m103729a(i, i2, activity, null);
    }

    /* renamed from: a */
    public static void m103729a(int i, int i2, final Activity activity, final C47943a aVar) {
        C1160b b = new C1161a(activity, R.style.mp).mo3758a(i).mo3768b(i2).mo3769b((int) R.string.wf, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (C32616c.f84865a.isContactsActivityOrInviteFriendsActivity(activity)) {
                    activity.finish();
                }
            }
        }).mo3759a((int) R.string.ah2, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C47720bh.m103294a(activity);
                if (aVar != null) {
                    aVar.mo66302a();
                }
            }
        }).mo3772b();
        try {
            b.setCancelable(false);
            b.setCanceledOnTouchOutside(false);
            b.show();
        } catch (Exception unused) {
        }
    }
}
