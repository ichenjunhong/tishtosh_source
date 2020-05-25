package com.facebook.p982j.p983a;

import android.graphics.Color;
import android.util.JsonReader;
import com.facebook.p982j.p984b.C14415e;
import com.facebook.p982j.p984b.C14415e.C14417a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.f */
public final class C14382f {

    /* renamed from: a */
    static final C14370a<C14415e> f37381a = new C14370a<C14415e>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            C14417a aVar = new C14417a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1535541424) {
                    if (hashCode == 3076010 && nextName.equals("data")) {
                        c = 1;
                    }
                } else if (nextName.equals("start_frame")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        aVar.f37426a = jsonReader.nextInt();
                        break;
                    case 1:
                        aVar.f37427b = Color.parseColor(jsonReader.nextString());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new C14415e(aVar.f37426a, aVar.f37427b);
        }
    };
}
