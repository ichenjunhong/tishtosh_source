package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

final /* synthetic */ class afa implements afb {

    /* renamed from: a */
    private final String f40398a;

    afa(String str) {
        this.f40398a = str;
    }

    /* renamed from: a */
    public final void mo28771a(JsonWriter jsonWriter) {
        String str = this.f40398a;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
