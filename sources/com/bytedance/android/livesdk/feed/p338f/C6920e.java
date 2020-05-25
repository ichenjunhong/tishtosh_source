package com.bytedance.android.livesdk.feed.p338f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.p399o.C8049c;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.feed.f.e */
final /* synthetic */ class C6920e implements OnClickListener {

    /* renamed from: a */
    private final C6915d f18943a;

    C6920e(C6915d dVar) {
        this.f18943a = dVar;
    }

    public final void onClick(View view) {
        C6915d dVar = this.f18943a;
        if (System.currentTimeMillis() - dVar.f18927B > 3000) {
            dVar.f18927B = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "live_tab");
            hashMap.put("is_login", C6856b.m14400c().mo13049k().isLogin() ? "1" : "0");
            C8049c.m15979a().mo14202a("livesdk_live_tab_take_button_click", hashMap, new Object[0]);
            C6856b.m14400c().mo13041c().enterRecorderActivity(dVar.getActivity());
        }
    }
}
