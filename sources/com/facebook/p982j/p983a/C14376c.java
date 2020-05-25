package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14406b;
import com.facebook.p982j.p984b.C14406b.C14408a;
import com.facebook.p982j.p984b.C14406b.C14409b;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.facebook.j.a.c */
public final class C14376c {

    /* renamed from: a */
    static final C14370a<C14406b> f37378a = new C14370a<C14406b>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            C14408a aVar = new C14408a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != -1530780935) {
                    if (hashCode != -1413299531) {
                        if (hashCode != -993141291) {
                            if (hashCode == 594928386 && nextName.equals("key_values")) {
                                c = 1;
                            }
                        } else if (nextName.equals("property")) {
                            c = 0;
                        }
                    } else if (nextName.equals("anchor")) {
                        c = 3;
                    }
                } else if (nextName.equals("timing_curves")) {
                    c = 2;
                }
                switch (c) {
                    case 0:
                        aVar.f37407a = C14409b.valueOf(jsonReader.nextString().toUpperCase(Locale.US));
                        break;
                    case 1:
                        aVar.f37408b = C14378d.f37379a.mo26576a(jsonReader);
                        break;
                    case 2:
                        aVar.f37409c = C14371b.m29486b(jsonReader);
                        break;
                    case 3:
                        aVar.f37410d = C14371b.m29484a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new C14406b(aVar.f37407a, aVar.f37408b, aVar.f37409c, aVar.f37410d);
        }
    };
}
