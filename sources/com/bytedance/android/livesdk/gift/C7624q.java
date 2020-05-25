package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;

/* renamed from: com.bytedance.android.livesdk.gift.q */
public final class C7624q {
    /* renamed from: a */
    public static String m15619a() {
        if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
            return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.musical.ly%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        return "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
    }

    /* renamed from: b */
    public static boolean m15620b(Room room, boolean z) {
        boolean z2;
        Boolean bool = (Boolean) LiveSettingKeys.SHOW_PROP_PACKET.mo9431a();
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2 || room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableProps()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m15618a(Room room, boolean z) {
        boolean z2;
        boolean z3;
        long b = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b();
        boolean z4 = true;
        if (room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableGift()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (room == null || room.mRoomAuthStatus == null || !room.mRoomAuthStatus.isEnableProps()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z) {
            if (!z2) {
                return 2;
            }
            return 0;
        } else if (!z2) {
            return 1;
        } else {
            Boolean bool = (Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo9431a();
            if (bool == null || !bool.booleanValue()) {
                z4 = false;
            }
            if (z4 || b > 0 || !z3) {
                return 0;
            }
            return 3;
        }
    }
}
