package com.facebook.p982j.p983a;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.j.a.a */
public abstract class C14370a<T> {
    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo26577b(JsonReader jsonReader) throws IOException;

    /* renamed from: a */
    public final List<T> mo26576a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(mo26577b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
