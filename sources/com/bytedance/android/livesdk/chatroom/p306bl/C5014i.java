package com.bytedance.android.livesdk.chatroom.p306bl;

import android.os.Handler;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.room.C4192k;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p661d.p662a.C10632b;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.i */
public final class C5014i implements C4192k {

    /* renamed from: b */
    private static C5014i f13428b = new C5014i();

    /* renamed from: a */
    boolean f13429a = TTLiveSDKContext.getHostService().mo10315h().mo14532c();

    /* renamed from: a */
    public static C5014i m11508a() {
        return f13428b;
    }

    /* renamed from: a */
    public final void mo10889a(Handler handler, boolean z, long j, int i, int i2) {
        C10632b a = C10632b.m21416a();
        final boolean z2 = z;
        final long j2 = j;
        final int i3 = i;
        C50151 r1 = new Callable() {
            public final Object call() throws Exception {
                return C5013h.m11506a(z2, j2, i3);
            }
        };
        a.mo18874a(handler, r1, i2);
    }

    private C5014i() {
    }

    /* renamed from: a */
    public static C2201v<C4177d<Map<String, Room>>> m11507a(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        if (jArr != null) {
            for (int i = 0; i < jArr.length; i++) {
                sb.append(jArr[i]);
                if (jArr.length - 1 != i) {
                    sb.append(",");
                }
            }
        }
        return ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getMultipleRoomInfo(sb.toString()).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
    }

    /* renamed from: a */
    public final void mo9630a(Handler handler, final String str) {
        C10632b.m21416a().mo18874a(handler, new Callable() {
            public final Object call() throws Exception {
                return NetworkUtils.executeGet(0, str, false, false, null, null, false);
            }
        }, 13);
    }

    /* renamed from: b */
    public static void m11513b(Handler handler, long j) {
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).leaveRoom(j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a(C4064k.m10188c(), C4064k.m10187b());
    }

    /* renamed from: a */
    public final void mo9629a(Handler handler, long j) {
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).unblockRoom(j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a(C4064k.m10188c(), (C1710e<? super Throwable>) new C5027s<Object>(handler));
    }

    /* renamed from: a */
    public static void m11509a(Handler handler, long j, long j2, int i) {
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getUserRankContent(j, new C4605o().mo10399a("anchor_id", String.valueOf(j2)).mo10399a("sec_anchor_id", TTLiveSDKContext.getHostService().mo10315h().mo14522a(j2)).mo10399a("room_id", String.valueOf(j)).mo10399a("rank_type", String.valueOf(i)).mo10399a("sec_user_id", TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid()).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5020l<Object>(handler, i), (C1710e<? super Throwable>) new C5021m<Object>(handler, i));
    }

    /* renamed from: a */
    public static void m11510a(Handler handler, long j, long j2, int i, int i2) {
        int i3;
        if (i == 22) {
            i3 = 1;
        } else if (i == 23) {
            i3 = 2;
        } else {
            i3 = i;
        }
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getDailyRankContent(new C4605o().mo10399a("anchor_id", String.valueOf(j)).mo10399a("sec_anchor_id", TTLiveSDKContext.getHostService().mo10315h().mo14522a(j)).mo10399a("rank_type", String.valueOf(i3)).mo10399a("room_id", String.valueOf(j2)).mo10399a("hour_info", String.valueOf(i2)).mo10399a("sec_user_id", TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid()).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5018j<Object>(handler, i, i2), (C1710e<? super Throwable>) new C5019k<Object>(handler, i, i2));
    }

    /* renamed from: a */
    public static void m11511a(Handler handler, long j, long j2, boolean z, int i) {
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).sendPlayingPing(j, z ? 1 : 0).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5003ac<Object>(handler, 7), (C1710e<? super Throwable>) new C5004ad<Object>(handler, 7));
    }

    /* renamed from: a */
    public final void mo9631a(Handler handler, String str, String str2, C8710m mVar, int i, long j, boolean z, int i2) {
        m11512a(handler, str, str2, mVar, i, j, z, 1, 0);
    }

    /* renamed from: a */
    private static void m11512a(Handler handler, String str, String str2, C8710m mVar, int i, long j, boolean z, int i2, int i3) {
        String str3;
        String str4;
        C4605o a = new C4605o().mo10399a("title", str).mo10399a("cover_uri", str2);
        String str5 = "game";
        if (j != 0) {
            str3 = String.valueOf(j);
        } else {
            str3 = "";
        }
        C4605o a2 = a.mo10399a(str5, str3);
        String str6 = C42311c.f106869m;
        if (i != -1) {
            str4 = String.valueOf(i);
        } else {
            str4 = "";
        }
        HashMap<String, String> hashMap = a2.mo10399a(str6, str4).f12568a;
        hashMap.put("live_agreement", "0");
        if (mVar == C8710m.AUDIO) {
            hashMap.put("live_audio", "1");
        } else if (mVar == C8710m.THIRD_PARTY) {
            hashMap.put("third_party", "1");
        } else if (mVar == C8710m.SCREEN_RECORD) {
            hashMap.put("screen_shot", "1");
        }
        if (z) {
            hashMap.put("has_commerce_goods", "true");
        }
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).createRoom(hashMap).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5025q<Object>(handler, i2), (C1710e<? super Throwable>) new C5034z<Object>(handler, i2));
    }
}
