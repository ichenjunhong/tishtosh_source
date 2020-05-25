package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p108c.p109a.C2342a;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2344c;
import com.airbnb.lottie.p108c.p109a.C2345d;
import com.airbnb.lottie.p108c.p109a.C2347f;
import com.airbnb.lottie.p108c.p109a.C2349h;
import com.airbnb.lottie.p114f.C2454f;
import com.airbnb.lottie.p115g.C2468a;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.d */
public final class C2418d {
    /* renamed from: a */
    public static C2343b m7083a(JsonReader jsonReader, C2408e eVar) throws IOException {
        return m7084a(jsonReader, eVar, true);
    }

    /* renamed from: b */
    static C2345d m7088b(JsonReader jsonReader, C2408e eVar) throws IOException {
        return new C2345d(m7087a(jsonReader, eVar, (C2415af<T>) C2427m.f7532a));
    }

    /* renamed from: c */
    static C2347f m7089c(JsonReader jsonReader, C2408e eVar) throws IOException {
        return new C2347f(m7086a(jsonReader, C2454f.m7176a(), eVar, C2437v.f7537a));
    }

    /* renamed from: d */
    static C2349h m7090d(JsonReader jsonReader, C2408e eVar) throws IOException {
        return new C2349h(m7086a(jsonReader, C2454f.m7176a(), eVar, C2410aa.f7527a));
    }

    /* renamed from: e */
    static C2342a m7091e(JsonReader jsonReader, C2408e eVar) throws IOException {
        return new C2342a(m7087a(jsonReader, eVar, (C2415af<T>) C2420f.f7528a));
    }

    /* renamed from: a */
    static C2344c m7085a(JsonReader jsonReader, C2408e eVar, int i) throws IOException {
        return new C2344c(m7087a(jsonReader, eVar, (C2415af<T>) new C2424j<T>(i)));
    }

    /* renamed from: a */
    public static C2343b m7084a(JsonReader jsonReader, C2408e eVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = C2454f.m7176a();
        } else {
            f = 1.0f;
        }
        return new C2343b(m7086a(jsonReader, f, eVar, C2423i.f7530a));
    }

    /* renamed from: a */
    static <T> List<C2468a<T>> m7087a(JsonReader jsonReader, C2408e eVar, C2415af<T> afVar) throws IOException {
        return C2431p.m7114a(jsonReader, eVar, 1.0f, afVar);
    }

    /* renamed from: a */
    private static <T> List<C2468a<T>> m7086a(JsonReader jsonReader, float f, C2408e eVar, C2415af<T> afVar) throws IOException {
        return C2431p.m7114a(jsonReader, eVar, f, afVar);
    }
}
