package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TextPiece_ProtoDecoder implements C2888b<C8853i> {
    public final C8853i decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8853i decodeStatic(C2895g gVar) throws Exception {
        C8853i iVar = new C8853i();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return iVar;
            } else if (b != 11) {
                switch (b) {
                    case 1:
                        iVar.f24162a = C2896h.m8231b(gVar);
                        break;
                    case 2:
                        iVar.f24163b = _TextFormat_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        switch (b) {
                            case 21:
                                iVar.f24165d = _TextPieceUser_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 22:
                                iVar.f24166e = _TextPieceGift_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 23:
                                iVar.f24167f = _TextPieceHeart_ProtoDecoder.decodeStatic(gVar);
                                break;
                            case 24:
                                iVar.f24168g = _TextPiecePatternRef_ProtoDecoder.decodeStatic(gVar);
                                break;
                            default:
                                C2896h.m8236g(gVar);
                                break;
                        }
                }
            } else {
                iVar.f24164c = C2896h.m8234e(gVar);
            }
        }
    }
}
