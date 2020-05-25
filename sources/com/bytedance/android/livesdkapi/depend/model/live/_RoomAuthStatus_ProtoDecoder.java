package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _RoomAuthStatus_ProtoDecoder implements C2888b<RoomAuthStatus> {
    public final RoomAuthStatus decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static RoomAuthStatus decodeStatic(C2895g gVar) throws Exception {
        RoomAuthStatus roomAuthStatus = new RoomAuthStatus();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        roomAuthStatus.enableChat = C2896h.m8230a(gVar);
                        break;
                    case 2:
                        roomAuthStatus.enableDanmaku = C2896h.m8230a(gVar);
                        break;
                    case 3:
                        roomAuthStatus.enableGift = C2896h.m8230a(gVar);
                        break;
                    case 4:
                        roomAuthStatus.enableLuckMoney = C2896h.m8230a(gVar);
                        break;
                    case 5:
                        roomAuthStatus.enableDigg = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        roomAuthStatus.enableRoomContributor = C2896h.m8230a(gVar);
                        break;
                    case 8:
                        roomAuthStatus.enableProps = C2896h.m8230a(gVar);
                        break;
                    case 12:
                        roomAuthStatus.bannerType = (int) C2896h.m8232c(gVar);
                        break;
                    case 17:
                        roomAuthStatus.messageType = (int) C2896h.m8232c(gVar);
                        break;
                    case 18:
                        roomAuthStatus.anchorGiftType = (int) C2896h.m8232c(gVar);
                        break;
                    case 20:
                        roomAuthStatus.donationSticker = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return roomAuthStatus;
            }
        }
    }
}
