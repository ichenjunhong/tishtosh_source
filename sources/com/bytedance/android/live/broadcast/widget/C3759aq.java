package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.widget.aq */
final /* synthetic */ class C3759aq implements Runnable {

    /* renamed from: a */
    private final C37359 f10627a;

    /* renamed from: b */
    private final String f10628b;

    C3759aq(C37359 r1, String str) {
        this.f10627a = r1;
        this.f10628b = str;
    }

    public final void run() {
        C37359 r0 = this.f10627a;
        String str = this.f10628b;
        if (VideoWidget2.this.f10581t != null) {
            VideoWidget2.this.f10581t.add(str);
        }
        VideoWidget2.this.f10585x = true;
        HashMap hashMap = new HashMap();
        hashMap.put("beauty_type", str);
        C8049c.m15979a().mo14202a("livesdk_live_take_beauty_effective_use", hashMap, new C8059j().mo14213a("live_take_detail"), Room.class);
    }
}
