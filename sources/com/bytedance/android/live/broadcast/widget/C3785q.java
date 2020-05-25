package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.widget.q */
final /* synthetic */ class C3785q implements OnClickListener {

    /* renamed from: a */
    private final C3781o f10700a;

    C3785q(C3781o oVar) {
        this.f10700a = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3781o oVar = this.f10700a;
        dialogInterface.dismiss();
        HashMap b = oVar.mo9155b();
        b.put("result", CustomActionPushReceiver.f104061f);
        C8049c.m15979a().mo14202a("livesdk_change_cover_window_click", b, new Object[0]);
    }
}
