package com.bytedance.android.live.broadcast.bgbroadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.h */
final /* synthetic */ class C3127h implements OnClickListener {

    /* renamed from: a */
    private final HashMap f9109a;

    C3127h(HashMap hashMap) {
        this.f9109a = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C8049c.m15979a().mo14202a("anchor_close_live_cancel", this.f9109a, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
        dialogInterface.dismiss();
        C4525b.f12361ad.mo10346a(Boolean.valueOf(false));
    }
}
