package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _FansClubData_ProtoDecoder implements C2888b<FansClubData> {
    public final FansClubData decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FansClubData decodeStatic(C2895g gVar) throws Exception {
        FansClubData fansClubData = new FansClubData();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansClubData.clubName = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        fansClubData.level = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = C2896h.m8231b(gVar);
                        break;
                    case 4:
                        fansClubData.badge = _FansClubData_UserBadge_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        if (fansClubData.availableGiftIds == null) {
                            fansClubData.availableGiftIds = new ArrayList();
                        }
                        fansClubData.availableGiftIds.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    case 6:
                        fansClubData.anchorId = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fansClubData;
            }
        }
    }
}
