package com.bytedance.android.livesdk.chatroom.p306bl;

import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.g */
public final class C5012g {
    /* renamed from: a */
    public static final C2201v<C4177d<ChatResult>> m11503a(String str, long j, String str2, String str3, String str4) {
        C52711k.m112240b(str, C42311c.f106865i);
        C2201v<C4177d<ChatResult>> a = ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).sendTextMessage(m11505c(str, j, str2, str3, str4)).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
        C52711k.m112236a((Object) a, "LiveInternalService.inst…Util.rxSchedulerHelper())");
        return a;
    }

    /* renamed from: b */
    public static final C2201v<C4177d<Barrage>> m11504b(String str, long j, String str2, String str3, String str4) {
        C52711k.m112240b(str, C42311c.f106865i);
        C2201v<C4177d<Barrage>> a = ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).sendBarrage(m11505c(str, j, str2, str3, str4)).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
        C52711k.m112236a((Object) a, "LiveInternalService.inst…Util.rxSchedulerHelper())");
        return a;
    }

    /* renamed from: c */
    private static final HashMap<String, String> m11505c(String str, long j, String str2, String str3, String str4) {
        boolean z;
        Map a = C52550ab.m112050a(C52856t.m112465a(C42311c.f106865i, str), C52856t.m112465a("room_id", String.valueOf(j)), C52856t.m112465a("request_id", str2), C52856t.m112465a("common_label_list", str3), C52856t.m112465a("enter_source", str4));
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : a.entrySet()) {
            if (entry.getValue() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new HashMap<>(linkedHashMap);
    }
}
