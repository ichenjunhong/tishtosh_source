package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14413d;
import com.facebook.p982j.p984b.C14413d.C14414a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.e */
public final class C14380e {

    /* renamed from: a */
    static final C14370a<C14413d> f37380a = new C14370a<C14413d>() {
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ Object mo26577b(JsonReader jsonReader) throws IOException {
            jsonReader.beginObject();
            C14414a aVar = new C14414a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                char c = 65535;
                int hashCode = nextName.hashCode();
                if (hashCode != 314070383) {
                    if (hashCode != 506361563) {
                        if (hashCode == 1394981546 && nextName.equals("parent_group")) {
                            c = 1;
                        }
                    } else if (nextName.equals("group_id")) {
                        c = 0;
                    }
                } else if (nextName.equals("animations")) {
                    c = 2;
                }
                switch (c) {
                    case 0:
                        aVar.f37421a = jsonReader.nextInt();
                        break;
                    case 1:
                        aVar.f37422b = jsonReader.nextInt();
                        break;
                    case 2:
                        aVar.f37423c = C14376c.f37378a.mo26576a(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            return new C14413d(aVar.f37421a, aVar.f37422b, aVar.f37423c);
        }
    };
}
