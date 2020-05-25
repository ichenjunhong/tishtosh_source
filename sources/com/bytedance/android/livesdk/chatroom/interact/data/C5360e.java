package com.bytedance.android.livesdk.chatroom.interact.data;

import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.p683ss.video.rtc.interact.model.Config.Vendor;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.data.e */
public final class C5360e {
    /* renamed from: a */
    public static Vendor m12169a() {
        int i;
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue() == 0) {
            i = C4638d.m11114a().f12666i;
        } else {
            i = ((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo9431a()).intValue();
        }
        if (i == 4) {
            return Vendor.BYTE;
        }
        switch (i) {
            case 1:
                return Vendor.AGORA;
            case 2:
                return Vendor.ZEGO;
            default:
                return Vendor.ZEGO;
        }
    }
}
