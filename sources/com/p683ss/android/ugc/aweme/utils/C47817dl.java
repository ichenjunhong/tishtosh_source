package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.dl */
public final class C47817dl implements NotificationClickHelper {
    /* renamed from: a */
    public static NotificationClickHelper m103456a() {
        if (C27991b.f73436T == null) {
            synchronized (NotificationClickHelper.class) {
                if (C27991b.f73436T == null) {
                    C27991b.f73436T = C27628bo.m66313h();
                }
            }
        }
        return (NotificationClickHelper) C27991b.f73436T;
    }

    public final boolean handleClick(Activity activity, boolean z, boolean z2, boolean z3, String str) {
        if (activity == null) {
            return false;
        }
        if (!z) {
            return C47813dj.m103455a(activity, z2, z3, str);
        }
        new C10643a(activity).mo18885a((int) R.string.cly).mo18899b((int) R.string.clw).mo18900b((int) R.string.b_m, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo18886a((int) R.string.hb, (OnClickListener) new OnClickListener(activity, z2, z3, str) {

            /* renamed from: a */
            final /* synthetic */ Activity f120363a;

            /* renamed from: b */
            final /* synthetic */ boolean f120364b;

            /* renamed from: c */
            final /* synthetic */ boolean f120365c;

            /* renamed from: d */
            final /* synthetic */ String f120366d;

            public final void onClick(DialogInterface dialogInterface, int i) {
                C47813dj.m103455a(this.f120363a, this.f120364b, this.f120365c, this.f120366d);
                dialogInterface.dismiss();
            }

            {
                this.f120363a = r1;
                this.f120364b = r2;
                this.f120365c = r3;
                this.f120366d = r4;
            }
        }).mo18897a().mo18882b();
        return true;
    }
}
