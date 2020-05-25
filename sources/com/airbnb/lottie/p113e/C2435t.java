package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import com.airbnb.lottie.p108c.p110b.C2365h;
import com.airbnb.lottie.p108c.p110b.C2365h.C2366a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.t */
final class C2435t {
    /* renamed from: a */
    static C2365h m7123a(JsonReader jsonReader) throws IOException {
        String str = null;
        C2366a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("mm")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    aVar = C2366a.forId(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2365h(str, aVar);
    }
}
