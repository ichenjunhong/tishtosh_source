package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import p064c.p065a.C1680ad;

/* renamed from: com.bytedance.android.livesdk.chatroom.api.b */
public final class C4992b {
    /* renamed from: a */
    static <T, R> void m11477a(C4177d<R> dVar, C4176c<T> cVar) {
        cVar.f11364a = dVar.statusCode;
        cVar.f11366c = dVar.extra;
        cVar.f11367d = dVar.error;
    }

    /* renamed from: a */
    public static C1680ad<C4176c<C5696e>> m11476a(LinkApi linkApi, long j, int i) {
        return linkApi.getList(j, i).mo6157b(C4993c.f13376a);
    }
}
