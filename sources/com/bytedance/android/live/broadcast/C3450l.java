package com.bytedance.android.live.broadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.l */
final /* synthetic */ class C3450l implements OnClickListener {

    /* renamed from: a */
    private final C3134c f9867a;

    /* renamed from: b */
    private final HashMap f9868b;

    C3450l(C3134c cVar, HashMap hashMap) {
        this.f9867a = cVar;
        this.f9868b = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3134c cVar = this.f9867a;
        C8049c.m15979a().mo14202a("anchor_close_live_cancel", this.f9868b, new C8059j().mo14213a("live_take_detail").mo14218f("click").mo14214b("live_take"), new C8060k());
        C8068g.m16014a(cVar.getContext());
        cVar.f9129c.getId();
        dialogInterface.dismiss();
    }
}
