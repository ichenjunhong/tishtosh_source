package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.widgets.KVData;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.do */
final /* synthetic */ class C6534do implements C0199s {

    /* renamed from: a */
    private final LiveShareWidget f17858a;

    C6534do(LiveShareWidget liveShareWidget) {
        this.f17858a = liveShareWidget;
    }

    public final void onChanged(Object obj) {
        LiveShareWidget liveShareWidget = this.f17858a;
        KVData kVData = (KVData) obj;
        if (liveShareWidget.isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1741164106) {
                if (hashCode == 239745881 && key.equals("cmd_wanna_share_live")) {
                    c = 0;
                }
            } else if (key.equals("data_user_in_room")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    liveShareWidget.mo12457a();
                    return;
                case 1:
                    Object data = kVData.getData();
                    if (data instanceof User) {
                        liveShareWidget.f17309c = (User) data;
                        break;
                    }
                    break;
            }
        }
    }
}
