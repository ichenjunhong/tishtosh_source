package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14423h;
import com.facebook.p982j.p984b.C14423h.C14424a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.h */
public final class C14386h {

    /* renamed from: a */
    static final C14370a<C14423h> f37383a = new C14370a<C14423h>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            C14424a aVar = new C14424a();
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
                        aVar.f37462a = jsonReader.nextInt();
                        break;
                    case 1:
                        aVar.f37463b = C14371b.f37374a.mo26576a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new C14423h(aVar.f37462a, aVar.f37463b);
        }
    };
}
