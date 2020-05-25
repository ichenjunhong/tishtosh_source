package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.utils.do */
public final /* synthetic */ class C47824do implements OnClickListener {

    /* renamed from: a */
    private final Context f120377a;

    /* renamed from: b */
    private final int f120378b;

    public C47824do(Context context, int i) {
        this.f120377a = context;
        this.f120378b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f120377a;
        int i2 = this.f120378b;
        try {
            C47818dm.m103459b(context);
        } catch (Exception unused) {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        }
        C26890h.m65011a("push_pre_permission_auth", C23089d.m56640a().f61491a);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C47819dn.m103468b(i2);
    }
}
