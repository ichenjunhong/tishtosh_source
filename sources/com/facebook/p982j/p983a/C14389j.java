package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14426i;
import com.facebook.p982j.p984b.C14426i.C14427a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.j */
public final class C14389j {

    /* renamed from: a */
    static final C14370a<C14426i> f37384a = new C14370a<C14426i>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            return C14389j.m29498a(jsonReader);
        }
    };

    /* renamed from: a */
    public static C14426i m29498a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14427a aVar = new C14427a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 1324875910) {
                if (hashCode == 1981251071 && nextName.equals("color_end")) {
                    c = 1;
                }
            } else if (nextName.equals("color_start")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    aVar.f37467a = C14388i.m29497a(jsonReader);
                    break;
                case 1:
                    aVar.f37468b = C14388i.m29497a(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo26589a();
    }
}
