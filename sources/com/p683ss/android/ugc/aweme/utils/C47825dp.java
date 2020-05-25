package com.p683ss.android.ugc.aweme.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47460f;

/* renamed from: com.ss.android.ugc.aweme.utils.dp */
public final /* synthetic */ class C47825dp implements OnClickListener {

    /* renamed from: a */
    private final int f120379a;

    public C47825dp(int i) {
        this.f120379a = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f120379a;
        dialogInterface.dismiss();
        C26890h.m65011a("push_pre_permission_deny", C23089d.m56640a().f61491a);
        C47718bf.m103288a(new C47460f(false));
        C47819dn.m103468b(i2);
    }
}
