package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p115g.C2471d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.z */
public final class C2441z implements C2415af<C2471d> {

    /* renamed from: a */
    public static final C2441z f7538a = new C2441z();

    private C2441z() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6783a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C2471d((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
