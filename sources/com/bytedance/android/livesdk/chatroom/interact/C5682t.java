package com.bytedance.android.livesdk.chatroom.interact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.t */
final /* synthetic */ class C5682t implements OnClickListener {

    /* renamed from: a */
    private final LinkInRoomVideoGuestWidget f14904a;

    C5682t(LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget) {
        this.f14904a = linkInRoomVideoGuestWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = this.f14904a;
        dialogInterface.dismiss();
        String str = (String) LiveSettingKeys.LIVE_MT_LOW_AGE_REPORT_URL.mo9431a();
        if (TextUtils.isEmpty(str)) {
            str = ((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion() ? "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.musical.ly%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0" : "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        ((C8260a) C4116c.m10249a(C8260a.class)).handle(linkInRoomVideoGuestWidget.context, str);
        if (C4116c.m10249a(C4282a.class) != null && ((C4282a) C4116c.m10249a(C4282a.class)).user() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
            C8049c.m15979a().mo14202a("livesdk_user_click_contact_us", hashMap, Room.class, new C8059j());
        }
    }
}
