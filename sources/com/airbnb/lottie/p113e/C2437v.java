package com.airbnb.lottie.p113e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.v */
public final class C2437v implements C2415af<PointF> {

    /* renamed from: a */
    public static final C2437v f7537a = new C2437v();

    private C2437v() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6783a(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C2428n.m7105b(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C2428n.m7105b(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder("Cannot convert json to point. Next token is ");
        sb.append(peek);
        throw new IllegalArgumentException(sb.toString());
    }
}
