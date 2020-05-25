package com.bytedance.android.livesdk.chatroom.api;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.a */
public final class C4987a {
    /* renamed from: a */
    public static void m11475a(final Handler handler, long j) {
        ((EndPageRecommendRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(EndPageRecommendRetrofitApi.class)).getLive(j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C4172a<Room, C2974a>>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C4172a aVar = (C4172a) obj;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = aVar.f11365b;
                    try {
                        for (Room room : (List) obtainMessage.obj) {
                            room.setRequestId(((C2974a) aVar.f11366c).f8717g);
                            room.setLog_pb(((C2974a) aVar.f11366c).mo7693a().toString());
                        }
                    } catch (Exception unused) {
                    }
                    handler.sendMessage(obtainMessage);
                }
            }
        }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                Throwable th = (Throwable) obj;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(22);
                    obtainMessage.obj = th;
                    handler.sendMessage(obtainMessage);
                }
            }
        });
    }
}
