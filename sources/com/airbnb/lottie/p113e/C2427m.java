package com.airbnb.lottie.p113e;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.e.m */
public final class C2427m implements C2415af<Integer> {

    /* renamed from: a */
    public static final C2427m f7532a = new C2427m();

    private C2427m() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6783a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C2428n.m7104b(jsonReader) * f));
    }
}
