package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.C5741bc;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gh */
public final class C7979gh implements C2888b<RoomNotifyMessageExtra> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15910a(gVar);
    }

    /* renamed from: a */
    public static RoomNotifyMessageExtra m15910a(C2895g gVar) throws Exception {
        RoomNotifyMessageExtra roomNotifyMessageExtra = new RoomNotifyMessageExtra();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        roomNotifyMessageExtra.f21425d = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        roomNotifyMessageExtra.f21423b = C7978gg.m15909a(gVar);
                        break;
                    case 3:
                        roomNotifyMessageExtra.f21424c = C5741bc.m12621a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return roomNotifyMessageExtra;
            }
        }
    }
}
