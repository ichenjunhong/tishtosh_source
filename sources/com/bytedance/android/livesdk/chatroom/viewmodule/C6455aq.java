package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7624q;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.aq */
final /* synthetic */ class C6455aq implements OnClickListener {

    /* renamed from: a */
    private final GiftWidget f17760a;

    C6455aq(GiftWidget giftWidget) {
        this.f17760a = giftWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GiftWidget giftWidget = this.f17760a;
        dialogInterface.dismiss();
        String str = (String) LiveSettingKeys.LIVE_MT_LOW_AGE_REPORT_URL.mo9431a();
        if (TextUtils.isEmpty(str)) {
            str = C7624q.m15619a();
        }
        ((C8260a) C4116c.m10249a(C8260a.class)).handle(giftWidget.context, str);
        if (C4116c.m10249a(C4282a.class) != null && ((C4282a) C4116c.m10249a(C4282a.class)).user() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
            C8049c.m15979a().mo14202a("livesdk_anchor_click_contact_us", hashMap, Room.class, new C8059j());
        }
    }
}
