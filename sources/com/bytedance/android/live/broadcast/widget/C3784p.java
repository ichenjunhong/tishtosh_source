package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.widget.p */
final /* synthetic */ class C3784p implements OnClickListener {

    /* renamed from: a */
    private final C3781o f10699a;

    C3784p(C3781o oVar) {
        this.f10699a = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3781o oVar = this.f10699a;
        dialogInterface.dismiss();
        oVar.f10689c.mo9577a();
        oVar.f10689c.mo9580c();
        HashMap b = oVar.mo9155b();
        b.put("result", "confirm");
        C8049c.m15979a().mo14202a("livesdk_change_cover_window_click", b, new Object[0]);
    }
}
