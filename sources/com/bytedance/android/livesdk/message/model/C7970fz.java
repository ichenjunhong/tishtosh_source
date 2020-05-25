package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.android.livesdk.message.model.fz */
public final class C7970fz implements C2888b<C7860ca> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15906a(gVar);
    }

    /* renamed from: a */
    public static C7860ca m15906a(C2895g gVar) throws Exception {
        C7860ca caVar = new C7860ca();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        if (caVar.f21732a == null) {
                            caVar.f21732a = new LinkedHashMap();
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
                                    caVar.f21732a.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 2:
                        if (caVar.f21733b == null) {
                            caVar.f21733b = new LinkedHashMap();
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
                                    caVar.f21733b.put(str, obj2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 3:
                        caVar.f21734c = C2896h.m8231b(gVar);
                        break;
                    case 4:
                        caVar.f21735d = C2896h.m8231b(gVar);
                        break;
                    case 5:
                        if (caVar.f21736e == null) {
                            caVar.f21736e = new ArrayList();
                        }
                        caVar.f21736e.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return caVar;
            }
        }
    }
}
