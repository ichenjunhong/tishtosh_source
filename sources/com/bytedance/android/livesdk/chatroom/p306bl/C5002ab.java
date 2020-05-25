package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.p180b.p181a.p182a.C2947c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C5748f;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8764l;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.ab */
public final /* synthetic */ class C5002ab implements C1710e {

    /* renamed from: a */
    private final C5014i f13406a;

    /* renamed from: b */
    private final Handler f13407b;

    /* renamed from: c */
    private final long f13408c;

    public C5002ab(C5014i iVar, Handler handler, long j) {
        this.f13406a = iVar;
        this.f13407b = handler;
        this.f13408c = j;
    }

    public final void accept(Object obj) {
        C5014i iVar = this.f13406a;
        Handler handler = this.f13407b;
        long j = this.f13408c;
        Throwable th = (Throwable) obj;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(4);
            Room a = C8764l.m17249a().mo15420a(j);
            if (!(th instanceof C2947c) || a == null) {
                obtainMessage.obj = th;
            } else {
                C2947c cVar = (C2947c) th;
                if (cVar.getResponse() == null || cVar.getResponse().extra == null || cVar.getResponse().statusCode != 0) {
                    obtainMessage.obj = th;
                } else {
                    C5748f fVar = new C5748f();
                    C4175b response = cVar.getResponse();
                    fVar.f15110a = a;
                    fVar.f15111b = (EnterRoomExtra) response.extra;
                    if (fVar.f15110a != null) {
                        fVar.f15110a.nowTime = ((EnterRoomExtra) response.extra).now / 1000;
                    }
                    iVar.f13429a = TTLiveSDKContext.getHostService().mo10315h().mo14532c();
                    obtainMessage.obj = fVar;
                }
            }
            handler.sendMessage(obtainMessage);
        }
    }
}
