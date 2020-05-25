package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.FansClubData.UserBadge;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.LinkedHashMap;

public final class _FansClubData_UserBadge_ProtoDecoder implements C2888b<UserBadge> {
    public final UserBadge decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static UserBadge decodeStatic(C2895g gVar) throws Exception {
        UserBadge userBadge = new UserBadge();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (userBadge.icons == null) {
                            userBadge.icons = new LinkedHashMap();
                        }
                        long a2 = gVar.mo7514a();
                        Integer num = null;
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo7517b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        num = Integer.valueOf(C2896h.m8231b(gVar));
                                        break;
                                    case 2:
                                        obj = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a2);
                                if (num == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    userBadge.icons.put(num, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 2:
                        userBadge.title = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return userBadge;
            }
        }
    }
}
