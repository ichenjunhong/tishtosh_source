package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.user.C3009i.C3010a;
import com.bytedance.android.live.base.model.user.C3013l;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4550a;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p279af.C4610t;
import com.bytedance.android.livesdkapi.C8830k;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ex */
final /* synthetic */ class C6573ex implements C1710e {

    /* renamed from: a */
    private final UserPermissionCheckWidget f17907a;

    C6573ex(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f17907a = userPermissionCheckWidget;
    }

    public final void accept(Object obj) {
        UserPermissionCheckWidget userPermissionCheckWidget = this.f17907a;
        C3013l lVar = (C3013l) obj;
        if (lVar != null && lVar.f8853a == C3010a.Login && userPermissionCheckWidget.f17628a != null) {
            long j = 0;
            if (userPermissionCheckWidget.f17628a.getId() > 0) {
                long id = userPermissionCheckWidget.f17628a.getId();
                String requestId = userPermissionCheckWidget.f17628a.getRequestId();
                String str = userPermissionCheckWidget.f17629b;
                String str2 = userPermissionCheckWidget.f17630c;
                String str3 = userPermissionCheckWidget.f17631d;
                if ("draw".equals(str) && "live_detail-hourly_rank".equals(str3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(str);
                    str3 = sb.toString();
                }
                HashMap<String, String> hashMap = new C4605o().mo10399a("common_label_list", str2).mo10399a("enter_source", str3).mo10399a("request_id", requestId).mo10399a("enter_type", str).f12568a;
                C4610t.m11071b(C8830k.m17329c(), C4550a.CMAF);
                if (TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                    j = 1;
                }
                ((C4002ac) ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).enterRoom(id, 1, j, hashMap).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) userPermissionCheckWidget.autoDispose())).mo9406a(C6574ey.f17908a, new C6575ez(userPermissionCheckWidget));
            }
        }
    }
}
