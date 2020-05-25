package com.facebook.p982j.p983a;

import android.util.JsonReader;
import com.facebook.p982j.p984b.C14430k;
import com.facebook.p982j.p984b.C14430k.C14432a;
import java.io.IOException;

/* renamed from: com.facebook.j.a.k */
public final class C14391k {
    /* renamed from: a */
    public static C14430k m29500a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C14432a aVar = new C14432a();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1872643448:
                    if (nextName.equals("canvas_size")) {
                        c = 4;
                        break;
                    }
                    break;
                case -290659267:
                    if (nextName.equals("features")) {
                        c = 2;
                        break;
                    }
                    break;
                case -270583694:
                    if (nextName.equals("frame_rate")) {
                        c = 0;
                        break;
                    }
                    break;
                case 106079:
                    if (nextName.equals("key")) {
                        c = 5;
                        break;
                    }
                    break;
                case 511278831:
                    if (nextName.equals("animation_groups")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1301359490:
                    if (nextName.equals("animation_frame_count")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar.f37479a = jsonReader.nextInt();
                    break;
                case 1:
                    aVar.f37480b = jsonReader.nextInt();
                    break;
                case 2:
                    aVar.f37481c = C14384g.f37382a.mo26576a(jsonReader);
                    break;
                case 3:
                    aVar.f37482d = C14380e.f37380a.mo26576a(jsonReader);
                    break;
                case 4:
                    aVar.f37483e = C14371b.m29484a(jsonReader);
                    break;
                case 5:
                    aVar.f37484f = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        C14430k kVar = new C14430k(aVar.f37479a, aVar.f37480b, aVar.f37481c, aVar.f37482d, aVar.f37483e, aVar.f37484f);
        return kVar;
    }
}
