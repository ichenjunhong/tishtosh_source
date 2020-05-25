package com.facebook.p982j.p983a;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* renamed from: com.facebook.j.a.b */
public final class C14371b {

    /* renamed from: a */
    public static final C14370a<String> f37374a = new C14370a<String>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            return jsonReader.nextString();
        }
    };

    /* renamed from: b */
    public static final C14370a<Float> f37375b = new C14370a<Float>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    };

    /* renamed from: c */
    public static final C14370a<List<Float>> f37376c = new C14370a<List<Float>>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            return C14371b.f37375b.mo26576a(jsonReader);
        }
    };

    /* renamed from: d */
    private static final C14370a<List<List<Float>>> f37377d = new C14370a<List<List<Float>>>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            return C14371b.f37376c.mo26576a(jsonReader);
        }
    };

    /* renamed from: a */
    public static float[] m29484a(JsonReader jsonReader) throws IOException {
        return m29485a(f37375b.mo26576a(jsonReader));
    }

    /* renamed from: a */
    private static float[] m29485a(List<Float> list) {
        float[] fArr = new float[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) list.get(i)).floatValue();
        }
        return fArr;
    }

    /* renamed from: b */
    public static float[][][] m29486b(JsonReader jsonReader) throws IOException {
        List a = f37377d.mo26576a(jsonReader);
        float[][][] fArr = new float[a.size()][][];
        int size = a.size();
        for (int i = 0; i < size; i++) {
            float[][] fArr2 = new float[((List) a.get(0)).size()][];
            int length = fArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = m29485a((List) ((List) a.get(i)).get(i2));
            }
            fArr[i] = fArr2;
        }
        return fArr;
    }
}
