package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8061l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.h */
public final class C5873h {

    /* renamed from: a */
    public final Handler f15376a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public boolean f15377b = false;

    /* renamed from: a */
    public final void mo11755a() {
        if (this.f15377b) {
            this.f15377b = false;
            this.f15376a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public static boolean m12790a(Room room) {
        if (room == null || room.getOwner() == null || room.getUserCount() >= 3500) {
            return false;
        }
        if (TTLiveSDKContext.getHostService().mo10315h().mo14532c() && room.getOwner().isFollowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m12789a(C7862cc ccVar, Map<String, String> map) {
        C8061l lVar = new C8061l();
        if (ccVar != null) {
            lVar.f22028a = ccVar.f21750e;
        }
        C8049c.m15979a().mo14202a("audience_live_message", map, lVar, Room.class, new C8059j().mo14213a("live_detail").mo14215c("comment"));
    }
}
