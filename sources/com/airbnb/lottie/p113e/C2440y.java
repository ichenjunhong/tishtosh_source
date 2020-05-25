package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2353l;
import com.airbnb.lottie.p108c.p110b.C2370k;
import com.facebook.p909a.C13594o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.y */
final class C2440y {
    /* renamed from: a */
    static C2370k m7128a(JsonReader jsonReader, C2408e eVar) throws IOException {
        String str = null;
        C2343b bVar = null;
        C2343b bVar2 = null;
        C2353l lVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 99) {
                if (hashCode != 111) {
                    if (hashCode != 3519) {
                        if (hashCode == 3710 && nextName.equals("tr")) {
                            c = 3;
                        }
                    } else if (nextName.equals("nm")) {
                        c = 0;
                    }
                } else if (nextName.equals(C13594o.f35460a)) {
                    c = 2;
                }
            } else if (nextName.equals("c")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    bVar = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 2:
                    bVar2 = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 3:
                    lVar = C2417c.m7082a(jsonReader, eVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2370k(str, bVar, bVar2, lVar);
    }
}
