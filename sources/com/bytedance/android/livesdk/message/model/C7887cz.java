package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.android.livesdk.message.model.cz */
public final class C7887cz implements C2888b<C7971g> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7971g gVar2 = new C7971g();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        gVar2.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        gVar2.f21847a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        gVar2.f21848b = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        gVar2.f21851e = C2896h.m8231b(gVar);
                        break;
                    case 8:
                        gVar2.f21852f = C2896h.m8231b(gVar);
                        break;
                    case 9:
                        if (gVar2.f21853g == null) {
                            gVar2.f21853g = new ArrayList();
                        }
                        gVar2.f21853g.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    case 10:
                        if (gVar2.f21849c == null) {
                            gVar2.f21849c = new LinkedHashMap();
                        }
                        long a2 = gVar.mo7514a();
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo7517b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        str = C2896h.m8234e(gVar);
                                        break;
                                    case 2:
                                        obj = C2896h.m8234e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a2);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    gVar2.f21849c.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 11:
                        if (gVar2.f21850d == null) {
                            gVar2.f21850d = new LinkedHashMap();
                        }
                        long a3 = gVar.mo7514a();
                        Object obj2 = null;
                        while (true) {
                            int b3 = gVar.mo7517b();
                            if (b3 != -1) {
                                switch (b3) {
                                    case 1:
                                        str = C2896h.m8234e(gVar);
                                        break;
                                    case 2:
                                        obj2 = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj2 != null) {
                                    gVar2.f21850d.put(str, obj2);
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
                return gVar2;
            }
        }
    }
}
