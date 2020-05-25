package com.bytedance.android.livesdk.gift.dialog.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.b */
final /* synthetic */ class C7260b implements OnClickListener {

    /* renamed from: a */
    private final LiveBaseGiftPanelWidget f19748a;

    C7260b(LiveBaseGiftPanelWidget liveBaseGiftPanelWidget) {
        this.f19748a = liveBaseGiftPanelWidget;
    }

    public final void onClick(View view) {
        LiveBaseGiftPanelWidget liveBaseGiftPanelWidget = this.f19748a;
        if (liveBaseGiftPanelWidget.f19680c) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
            C8049c.m15979a().mo14202a("livesdk_doodling_gift_click", hashMap, Room.class, new C8059j());
            liveBaseGiftPanelWidget.f19681d = true;
            liveBaseGiftPanelWidget.f19679b.setVisibility(8);
            liveBaseGiftPanelWidget.f19679b.post(new C7261c(liveBaseGiftPanelWidget));
        }
    }
}
