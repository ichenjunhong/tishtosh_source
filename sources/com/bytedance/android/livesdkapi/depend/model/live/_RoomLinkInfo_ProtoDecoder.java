package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _RoomLinkInfo_ProtoDecoder implements C2888b<C8722v> {
    public final C8722v decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8722v decodeStatic(C2895g gVar) throws Exception {
        C8722v vVar = new C8722v();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        vVar.f23955a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        vVar.f23956b = _ChannelInfoInRoom_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        if (vVar.f23958d == null) {
                            vVar.f23958d = new ArrayList();
                        }
                        vVar.f23958d.add(_BattleScorePairInRoom_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 4:
                        vVar.f23957c = _BattleSettingInRoom_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return vVar;
            }
        }
    }
}
