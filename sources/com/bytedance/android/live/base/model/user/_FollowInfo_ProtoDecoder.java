package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _FollowInfo_ProtoDecoder implements C2888b<FollowInfo> {
    public final FollowInfo decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FollowInfo decodeStatic(C2895g gVar) throws Exception {
        FollowInfo followInfo = new FollowInfo();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        followInfo.followingCount = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        followInfo.followerCount = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        followInfo.followStatus = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        followInfo.pushStatus = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return followInfo;
            }
        }
    }
}
