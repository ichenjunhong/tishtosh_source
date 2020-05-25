package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.android.live.base.p192sp.C3018a;
import com.bytedance.p753k.C12103a;
import com.p683ss.android.ugc.aweme.live.C36093g;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.q */
final /* synthetic */ class C36126q implements OnClickListener {

    /* renamed from: a */
    private final Context f92528a;

    /* renamed from: b */
    private final long f92529b;

    /* renamed from: c */
    private final Bundle f92530c;

    C36126q(Context context, long j, Bundle bundle) {
        this.f92528a = context;
        this.f92529b = j;
        this.f92530c = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f92528a;
        long j = this.f92529b;
        Bundle bundle = this.f92530c;
        C3018a.m8456a(context);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        ((C36093g) C12103a.m24530b(C36093g.class)).mo74847c().mo22887a(context, j, bundle);
    }
}
