package com.bytedance.android.livesdk.chatroom.p306bl;

import android.util.Base64;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.message.model.C7864ce;
import com.bytedance.android.livesdk.message.model.C7866cg;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.message.model.C7871cl;
import com.bytedance.android.livesdk.message.model.C8009t;
import com.bytedance.android.livesdkapi.message.C8845b;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2890d;
import com.bytedance.android.p173d.p174a.p175a.C2895g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.c */
public final class C5006c {
    /* renamed from: a */
    public static C7869cj m11496a(Barrage barrage) {
        try {
            C2888b protoDecoder = ((INetworkService) C4116c.m10249a(INetworkService.class)).getProtoDecoder(C7869cj.class);
            if (protoDecoder == null) {
                return null;
            }
            return (C7869cj) protoDecoder.decode(new C2895g().mo7515a(C2890d.m8204a(Base64.decode(barrage.getScreenChatMsg(), 0))));
        } catch (Exception e) {
            C3831a.m9716d("ttlive_msg", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static C7864ce m11494a(long j, String str) {
        C7864ce ceVar = new C7864ce();
        C8845b bVar = new C8845b();
        bVar.f24132c = j;
        bVar.f24136g = true;
        ceVar.baseMessage = bVar;
        ceVar.f21760a = str;
        return ceVar;
    }

    /* renamed from: a */
    public static C8009t m11498a(long j, boolean z) {
        C8009t tVar = new C8009t();
        C8845b bVar = new C8845b();
        bVar.f24132c = j;
        bVar.f24133d = -1;
        bVar.f24136g = true;
        tVar.baseMessage = bVar;
        tVar.f21914a = 1;
        return tVar;
    }

    /* renamed from: a */
    public static C7871cl m11497a(long j, C8851g gVar, User user) {
        if (gVar == null) {
            return null;
        }
        C8845b bVar = new C8845b();
        bVar.f24132c = j;
        bVar.f24136g = true;
        bVar.f24139j = gVar;
        C7871cl clVar = new C7871cl();
        clVar.baseMessage = bVar;
        clVar.f21796b = user;
        return clVar;
    }

    /* renamed from: a */
    public static C7866cg m11495a(long j, ImageModel imageModel, String str, int i, String str2, String str3, String str4, String str5) {
        C7866cg cgVar = new C7866cg();
        C8845b bVar = new C8845b();
        bVar.f24132c = j;
        cgVar.baseMessage = bVar;
        cgVar.f21770d = null;
        cgVar.f21769c = str;
        cgVar.f21773g = (long) i;
        cgVar.f21767a = str2;
        cgVar.f21768b = str3;
        cgVar.f21772f = str4;
        cgVar.f21771e = str5;
        return cgVar;
    }
}
