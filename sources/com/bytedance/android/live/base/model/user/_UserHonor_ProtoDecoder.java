package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _UserHonor_ProtoDecoder implements C2888b<C3014m> {
    public final C3014m decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3014m decodeStatic(C2895g gVar) throws Exception {
        C3014m mVar = new C3014m();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return mVar;
            } else if (b != 1001) {
                switch (b) {
                    case 1:
                        mVar.f8860f = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        mVar.f8855a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        mVar.f8859e = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        mVar.f8856b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        mVar.f8858d = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        mVar.f8868n = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        mVar.f8857c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        mVar.f8862h = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        mVar.f8861g = C2896h.m8232c(gVar);
                        break;
                    case 10:
                        mVar.f8872r = C2896h.m8232c(gVar);
                        break;
                    case 11:
                        mVar.f8871q = C2896h.m8232c(gVar);
                        break;
                    case 12:
                        mVar.f8877w = C2896h.m8232c(gVar);
                        break;
                    case 13:
                        mVar.f8870p = C2896h.m8234e(gVar);
                        break;
                    case 14:
                        if (mVar.f8869o == null) {
                            mVar.f8869o = new ArrayList();
                        }
                        mVar.f8869o.add(_GradeIcon_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 15:
                        mVar.f8880z = C2896h.m8232c(gVar);
                        break;
                    case 16:
                        mVar.f8863i = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 17:
                        mVar.f8864j = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 18:
                        mVar.f8866l = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 19:
                        mVar.f8865k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 20:
                        mVar.f8867m = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 21:
                        mVar.f8875u = C2896h.m8232c(gVar);
                        break;
                    case 22:
                        mVar.f8878x = C2896h.m8234e(gVar);
                        break;
                    case 23:
                        mVar.f8873s = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 24:
                        mVar.f8874t = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 25:
                        mVar.f8879y = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                mVar.f8876v = C2896h.m8234e(gVar);
            }
        }
    }
}
