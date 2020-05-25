package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.android.livesdk.message.model.er */
public final class C7935er implements C2888b<C7820ay> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7820ay ayVar = new C7820ay();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ayVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (ayVar.f21530b == null) {
                            ayVar.f21530b = new LinkedHashMap();
                        }
                        long a2 = gVar.mo7514a();
                        Long l = null;
                        Object obj = null;
                        while (true) {
                            int b2 = gVar.mo7517b();
                            if (b2 != -1) {
                                switch (b2) {
                                    case 1:
                                        l = Long.valueOf(C2896h.m8232c(gVar));
                                        break;
                                    case 2:
                                        obj = C7936es.m15895a(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a2);
                                if (l == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj != null) {
                                    ayVar.f21530b.put(l, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 3:
                        if (ayVar.f21531c == null) {
                            ayVar.f21531c = new ArrayList();
                        }
                        ayVar.f21531c.add(C7936es.m15895a(gVar));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                ayVar.mo14143a();
                return ayVar;
            }
        }
    }
}
