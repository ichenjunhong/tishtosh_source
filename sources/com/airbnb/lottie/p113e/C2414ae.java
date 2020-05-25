package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p110b.C2379q;
import com.airbnb.lottie.p108c.p110b.C2379q.C2380a;
import com.facebook.p909a.C13594o;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.ae */
final class C2414ae {
    /* renamed from: a */
    static C2379q m7079a(JsonReader jsonReader, C2408e eVar) throws IOException {
        String str = null;
        C2380a aVar = null;
        C2343b bVar = null;
        C2343b bVar2 = null;
        C2343b bVar3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 101) {
                if (hashCode != 109) {
                    if (hashCode != 111) {
                        if (hashCode != 115) {
                            if (hashCode == 3519 && nextName.equals("nm")) {
                                c = 3;
                            }
                        } else if (nextName.equals("s")) {
                            c = 0;
                        }
                    } else if (nextName.equals(C13594o.f35460a)) {
                        c = 2;
                    }
                } else if (nextName.equals("m")) {
                    c = 4;
                }
            } else if (nextName.equals("e")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    bVar = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 1:
                    bVar2 = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 2:
                    bVar3 = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    aVar = C2380a.forId(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        C2379q qVar = new C2379q(str, aVar, bVar, bVar2, bVar3);
        return qVar;
    }
}
