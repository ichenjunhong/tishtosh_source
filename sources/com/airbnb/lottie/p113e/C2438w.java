package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p108c.p109a.C2343b;
import com.airbnb.lottie.p108c.p109a.C2354m;
import com.airbnb.lottie.p108c.p110b.C2367i;
import com.airbnb.lottie.p108c.p110b.C2367i.C2368a;
import com.facebook.internal.C14338p;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46485a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.w */
final class C2438w {
    /* renamed from: a */
    static C2367i m7126a(JsonReader jsonReader, C2408e eVar) throws IOException {
        String str = null;
        C2368a aVar = null;
        C2343b bVar = null;
        C2354m mVar = null;
        C2343b bVar2 = null;
        C2343b bVar3 = null;
        C2343b bVar4 = null;
        C2343b bVar5 = null;
        C2343b bVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals(C14338p.f37308a)) {
                        c = 3;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c = 8;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals(C46485a.f117298d)) {
                        c = 5;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = C2368a.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    bVar = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 3:
                    mVar = C2409a.m7074b(jsonReader, eVar);
                    break;
                case 4:
                    bVar2 = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 5:
                    bVar4 = C2418d.m7083a(jsonReader, eVar);
                    break;
                case 6:
                    bVar6 = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                case 7:
                    bVar3 = C2418d.m7083a(jsonReader, eVar);
                    break;
                case 8:
                    bVar5 = C2418d.m7084a(jsonReader, eVar, false);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        C2367i iVar = new C2367i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6);
        return iVar;
    }
}
