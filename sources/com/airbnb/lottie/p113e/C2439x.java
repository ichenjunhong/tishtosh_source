package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2347f;
import com.airbnb.lottie.p108c.p109a.C2354m;
import com.airbnb.lottie.p108c.p110b.C2369j;
import com.facebook.internal.C14338p;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.x */
final class C2439x {
    /* renamed from: a */
    static C2369j m7127a(JsonReader jsonReader, C2408e eVar) throws IOException {
        String str = null;
        C2354m mVar = null;
        C2347f fVar = null;
        C2343b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 112) {
                if (hashCode != 3519) {
                    switch (hashCode) {
                        case 114:
                            if (nextName.equals("r")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 115:
                            if (nextName.equals("s")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                } else if (nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals(C14338p.f37308a)) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    mVar = C2409a.m7074b(jsonReader, eVar);
                    break;
                case 2:
                    fVar = C2418d.m7089c(jsonReader, eVar);
                    break;
                case 3:
                    bVar = C2418d.m7083a(jsonReader, eVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2369j(str, mVar, fVar, bVar);
    }
}
