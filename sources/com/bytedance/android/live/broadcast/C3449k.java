package com.bytedance.android.live.broadcast;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.broadcast.p202d.C3161a;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.k */
final /* synthetic */ class C3449k implements OnClickListener {

    /* renamed from: a */
    private final C3134c f9865a;

    /* renamed from: b */
    private final HashMap f9866b;

    C3449k(C3134c cVar, HashMap hashMap) {
        this.f9865a = cVar;
        this.f9866b = hashMap;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3134c cVar = this.f9865a;
        C8049c.m15979a().mo14202a("anchor_close_live_confirm", this.f9866b, new C8059j().mo14213a("live_take_detail").mo14218f("click").mo14214b("live_take"), new C8060k());
        if (((Boolean) C4638d.m11114a().f12651b).booleanValue()) {
            cVar.f9134h.postDelayed(new C3451m(cVar), 1000);
        } else {
            cVar.mo8474b(1);
            cVar.mo8473b();
            C3161a.m8758a(true, 0, null);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("use_status", Boolean.TRUE.equals(cVar.f9131e.get("data_has_sticker_effective")) ? "use" : "unused");
        C8049c.m15979a().mo14202a("pm_live_sticker_use", cVar.mo8471a(hashMap), new C8059j().mo14213a("anchor_live_ending").mo14218f("other").mo14214b("live_take"), new C8060k());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("use_status", Boolean.TRUE.equals(cVar.f9131e.get("data_has_filter_effective")) ? "use" : "unused");
        C8049c.m15979a().mo14202a("pm_live_filter_use", cVar.mo8471a(hashMap2), new C8059j().mo14213a("anchor_live_ending").mo14218f("other").mo14214b("live_take"), new C8060k());
        dialogInterface.dismiss();
    }
}
