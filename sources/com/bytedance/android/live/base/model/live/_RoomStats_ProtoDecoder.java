package com.bytedance.android.live.base.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _RoomStats_ProtoDecoder implements C2888b<RoomStats> {
    public final RoomStats decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static RoomStats decodeStatic(C2895g gVar) throws Exception {
        RoomStats roomStats = new RoomStats();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        roomStats.f8732id = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        roomStats.idStr = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        roomStats.ticket = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        roomStats.money = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        roomStats.totalUser = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        roomStats.giftUVCount = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        roomStats.followCount = (int) C2896h.m8232c(gVar);
                        break;
                    case 8:
                        roomStats.userComposition = _RoomStats_UserComposition_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        roomStats.watermelon = (int) C2896h.m8232c(gVar);
                        break;
                    case 11:
                        roomStats.enterCount = (int) C2896h.m8232c(gVar);
                        break;
                    case 12:
                        roomStats.douPlusPromotion = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return roomStats;
            }
        }
    }
}
