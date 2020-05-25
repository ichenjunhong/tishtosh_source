package com.p683ss.android.ugc.aweme.external;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47951r;
import com.p683ss.android.ugc.tools.utils.C50203g;
import dmt.p2652av.video.C52884a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.external.a */
public final class C29511a implements ICrashReportService {

    /* renamed from: com.ss.android.ugc.aweme.external.a$a */
    static final class C29512a extends C52712l implements C52671b<Integer, String> {

        /* renamed from: a */
        public static final C29512a f77297a = new C29512a();

        C29512a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m69653a(((Number) obj).intValue());
        }

        /* renamed from: a */
        public static String m69653a(int i) {
            switch (i) {
                case 1:
                    return "oom_detected";
                case 2:
                    return "native_crash_detected";
                case 3:
                    return "java_crash_detected";
                default:
                    throw new Exception("Unknown error type");
            }
        }
    }

    public final HashMap<String, String> retrieveUserData(Context context) {
        C52711k.m112240b(context, "context");
        return C47951r.m103759a(context);
    }

    public final void report(int i) {
        C52884a aVar = C52884a.f131168b;
        HashMap hashMap = (HashMap) C52884a.f131167a.get(i);
        Map map = null;
        if (hashMap != null) {
            if (hashMap != null) {
                Map map2 = hashMap;
                map = new LinkedHashMap();
                for (Entry entry : map2.entrySet()) {
                    Object value = entry.getValue();
                    boolean z = false;
                    if (value != null) {
                        String obj = value.toString();
                        if (obj != null && obj.length() > 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map != null) {
                map = (HashMap) map;
            } else {
                throw new C52857u("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            }
        }
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C29512a.m69653a(i));
            sb.append(": ");
            sb.append(map);
            C50203g.m108361b(sb.toString());
            C47702b bVar = C47702b.f120193a;
            String a = C29512a.m69653a(i);
            C42438az a2 = C42438az.m93209a();
            Map map3 = map;
            if (map3 != null) {
                a2.f107329a.putAll(map3);
            }
            bVar.mo94984a(a, a2.f107329a);
        }
    }
}
