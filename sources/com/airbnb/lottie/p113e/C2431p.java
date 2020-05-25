package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.p115g.C2468a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.p */
final class C2431p {
    /* renamed from: a */
    public static void m7115a(List<? extends C2468a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C2468a aVar = (C2468a) list.get(i2);
            i2++;
            aVar.f7613f = Float.valueOf(((C2468a) list.get(i2)).f7612e);
        }
        C2468a aVar2 = (C2468a) list.get(i);
        if (aVar2.f7609b == null) {
            list.remove(aVar2);
        }
    }

    /* renamed from: a */
    static <T> List<C2468a<T>> m7114a(JsonReader jsonReader, C2408e eVar, float f, C2415af<T> afVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            eVar.mo6779a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            if (nextName.hashCode() == 107 && nextName.equals(C43882k.f111137a)) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C2430o.m7110a(jsonReader, eVar, f, afVar, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C2430o.m7110a(jsonReader, eVar, f, afVar, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C2430o.m7110a(jsonReader, eVar, f, afVar, false));
            }
        }
        jsonReader.endObject();
        m7115a(arrayList);
        return arrayList;
    }
}
