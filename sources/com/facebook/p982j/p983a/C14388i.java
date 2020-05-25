package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14428j;
import com.facebook.p982j.p984b.C14428j.C14429a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.i */
public final class C14388i {
    /* renamed from: a */
    public static C14428j m29497a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14429a aVar = new C14429a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1530780935) {
                if (hashCode == 594928386 && nextName.equals("key_values")) {
                    c = 0;
                }
            } else if (nextName.equals("timing_curves")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    aVar.f37471a = C14382f.f37381a.mo26576a(jsonReader);
                    break;
                case 1:
                    aVar.f37472b = C14371b.m29486b(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C14428j(aVar.f37471a, aVar.f37472b);
    }
}
