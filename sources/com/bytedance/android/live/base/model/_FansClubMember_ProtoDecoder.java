package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.model.user._FansClubData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.LinkedHashMap;

public final class _FansClubMember_ProtoDecoder implements C2888b<FansClubMember> {
    public final FansClubMember decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FansClubMember decodeStatic(C2895g gVar) throws Exception {
        FansClubMember fansClubMember = new FansClubMember();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansClubMember.data = _FansClubData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (fansClubMember.preferData == null) {
                            fansClubMember.preferData = new LinkedHashMap();
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
                                        obj = _FansClubData_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a2);
                                if (num == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    fansClubMember.preferData.put(num, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fansClubMember;
            }
        }
    }
}
