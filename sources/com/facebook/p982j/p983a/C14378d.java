package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14410c;
import com.facebook.p982j.p984b.C14410c.C14412a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.d */
public final class C14378d {

    /* renamed from: a */
    static final C14370a<C14410c> f37379a = new C14370a<C14410c>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            C14412a aVar = new C14412a();
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
                        aVar.f37415a = jsonReader.nextInt();
                        break;
                    case 1:
                        aVar.f37416b = C14371b.m29484a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new C14410c(aVar.f37415a, aVar.f37416b);
        }
    };
}
