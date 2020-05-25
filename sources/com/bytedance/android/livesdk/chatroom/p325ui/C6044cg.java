package com.bytedance.android.livesdk.chatroom.p325ui;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.detail.C5064e;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.gift.panel.widget.C7595ao;
import com.bytedance.android.livesdk.message.model.C8009t;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.ugc.live.sdk.message.data.IMessage;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cg */
final /* synthetic */ class C6044cg implements Runnable {

    /* renamed from: a */
    private final C6025ce f16113a;

    /* renamed from: b */
    private final Room f16114b;

    C6044cg(C6025ce ceVar, Room room) {
        this.f16113a = ceVar;
        this.f16114b = room;
    }

    public final void run() {
        C6025ce ceVar = this.f16113a;
        Room room = this.f16114b;
        if (ceVar.f16069q != null) {
            C5064e eVar = ceVar.f16069q;
            while (!eVar.f13546b.isEmpty() && C4565af.m10958a() != null) {
                C4565af.m10958a().insertMessage((IMessage) eVar.f13546b.poll());
            }
        }
        if (room.getStatus() == 3) {
            C8009t a = C5006c.m11498a(ceVar.f16015a, false);
            if (C4565af.m10958a() != null) {
                C4565af.m10958a().insertMessage(a, true);
            }
        }
        if (ceVar.f16059g) {
            User user = new User();
            user.setId(ceVar.f16054b);
            ceVar.f16065m.lambda$put$1$DataCenter("data_gift_panel_type", Boolean.valueOf(true));
            ceVar.f16065m.lambda$put$1$DataCenter("cmd_send_gift", user);
            ceVar.f16059g = false;
        } else if (ceVar.f16057e) {
            User user2 = new User();
            user2.setId(ceVar.f16054b);
            ceVar.f16065m.lambda$put$1$DataCenter("cmd_send_gift", user2);
            ceVar.f16057e = false;
        }
        if (TextUtils.equals(ceVar.f16058f, "gift_panel")) {
            User user3 = new User();
            user3.setId(ceVar.f16054b);
            ceVar.f16065m.lambda$put$1$DataCenter("data_gift_panel_type", C7595ao.GIFT);
            ceVar.f16065m.lambda$put$1$DataCenter("cmd_send_gift", user3);
            ceVar.f16058f = null;
            return;
        }
        if (TextUtils.equals(ceVar.f16058f, "package_panel")) {
            User user4 = new User();
            user4.setId(ceVar.f16054b);
            ceVar.f16065m.lambda$put$1$DataCenter("data_gift_panel_type", C7595ao.PROP);
            ceVar.f16065m.lambda$put$1$DataCenter("cmd_send_gift", user4);
            ceVar.f16058f = null;
        }
    }
}
