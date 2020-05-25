package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.detail.C5070h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class UserPermissionCheckWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    Room f17628a;

    /* renamed from: b */
    String f17629b;

    /* renamed from: c */
    String f17630c;

    /* renamed from: d */
    String f17631d;

    /* renamed from: e */
    private C5070h f17632e;

    /* renamed from: f */
    private C1690c f17633f;

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
        if (this.f17633f != null && !this.f17633f.isDisposed()) {
            this.f17633f.dispose();
        }
    }

    public void onLoad(Object[] objArr) {
        this.f17628a = (Room) this.dataCenter.get("data_room");
        this.f17632e = (C5070h) this.dataCenter.get("data_room_logger");
        if (this.f17632e != null) {
            this.f17629b = this.f17632e.f13617s;
            this.f17630c = this.f17632e.f13607i;
            this.f17631d = this.f17632e.f13620v;
        }
        this.f17633f = TTLiveSDKContext.getHostService().mo10315h().mo14533d().mo6450b((C1710e<? super T>) new C6573ex<Object>(this));
    }
}
