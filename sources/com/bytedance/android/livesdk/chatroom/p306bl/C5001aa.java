package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C5748f;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8764l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.aa */
public final /* synthetic */ class C5001aa implements C1710e {

    /* renamed from: a */
    private final C5014i f13403a;

    /* renamed from: b */
    private final Handler f13404b;

    /* renamed from: c */
    private final long f13405c;

    public C5001aa(C5014i iVar, Handler handler, long j) {
        this.f13403a = iVar;
        this.f13404b = handler;
        this.f13405c = j;
    }

    public final void accept(Object obj) {
        C5014i iVar = this.f13403a;
        Handler handler = this.f13404b;
        long j = this.f13405c;
        C4175b bVar = (C4175b) obj;
        if (handler != null) {
            C5748f fVar = new C5748f();
            fVar.f15110a = (Room) bVar.data;
            if (fVar.f15110a == null || fVar.f15110a.getId() == 0) {
                fVar.f15110a = C8764l.m17249a().mo15420a(j);
            }
            fVar.f15111b = (EnterRoomExtra) bVar.extra;
            if (fVar.f15110a != null) {
                fVar.f15110a.nowTime = ((EnterRoomExtra) bVar.extra).now / 1000;
            }
            iVar.f13429a = TTLiveSDKContext.getHostService().mo10315h().mo14532c();
            Message obtainMessage = handler.obtainMessage(4);
            obtainMessage.obj = fVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
