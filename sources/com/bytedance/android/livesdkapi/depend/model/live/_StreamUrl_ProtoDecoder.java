package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class _StreamUrl_ProtoDecoder implements C2888b<StreamUrl> {
    public final StreamUrl decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static StreamUrl decodeStatic(C2895g gVar) throws Exception {
        StreamUrl streamUrl = new StreamUrl();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                String str = null;
                switch (b) {
                    case 1:
                        streamUrl.f23775c = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        streamUrl.f23773a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        streamUrl.f23774b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        if (streamUrl.f23780h == null) {
                            streamUrl.f23780h = new LinkedHashMap();
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
                                    streamUrl.f23780h.put(str, obj);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 5:
                        streamUrl.f23783k = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        streamUrl.f23784l = _StreamUrlExtra_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        streamUrl.f23776d = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        streamUrl.f23778f = C2896h.m8234e(gVar);
                        break;
                    case 9:
                        if (streamUrl.f23779g == null) {
                            streamUrl.f23779g = new LinkedHashMap();
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
                                        obj2 = C2896h.m8234e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a3);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj2 != null) {
                                    streamUrl.f23779g.put(str, obj2);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 10:
                        if (streamUrl.f23782j == null) {
                            streamUrl.f23782j = new ArrayList();
                        }
                        streamUrl.f23782j.add(C2896h.m8234e(gVar));
                        break;
                    case 13:
                        streamUrl.f23785m = C2896h.m8234e(gVar);
                        break;
                    case 14:
                        if (streamUrl.f23781i == null) {
                            streamUrl.f23781i = new LinkedHashMap();
                        }
                        long a4 = gVar.mo7514a();
                        Object obj3 = null;
                        while (true) {
                            int b4 = gVar.mo7517b();
                            if (b4 != -1) {
                                switch (b4) {
                                    case 1:
                                        str = C2896h.m8234e(gVar);
                                        break;
                                    case 2:
                                        obj3 = C2896h.m8234e(gVar);
                                        break;
                                }
                            } else {
                                gVar.mo7516a(a4);
                                if (str == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (obj3 != null) {
                                    streamUrl.f23781i.put(str, obj3);
                                    break;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            }
                        }
                        break;
                    case 15:
                        streamUrl.f23786n = C2896h.m8234e(gVar);
                        break;
                    case 16:
                        if (streamUrl.f23777e == null) {
                            streamUrl.f23777e = new ArrayList();
                        }
                        streamUrl.f23777e.add(C2896h.m8234e(gVar));
                        break;
                    case 17:
                        streamUrl.f23787o = _LiveCoreSDKData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return streamUrl;
            }
        }
    }
}
