package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.an */
final /* synthetic */ class C6452an implements OnClickListener {

    /* renamed from: a */
    private final FullVideoButtonWidget f17756a;

    C6452an(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f17756a = fullVideoButtonWidget;
    }

    public final void onClick(View view) {
        FullVideoButtonWidget fullVideoButtonWidget = this.f17756a;
        C4495a.m10823a().mo10301a((Object) new C8745a(2));
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(fullVideoButtonWidget.f16988a));
        hashMap.put("type", "portrait_to_landscape");
        C8049c.m15979a().mo14202a("screen_rotate", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("live_detail"));
    }
}
