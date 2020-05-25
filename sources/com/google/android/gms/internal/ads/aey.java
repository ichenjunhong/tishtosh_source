package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class aey implements afb {

    /* renamed from: a */
    private final int f40395a;

    /* renamed from: b */
    private final Map f40396b;

    aey(int i, Map map) {
        this.f40395a = i;
        this.f40396b = map;
    }

    /* renamed from: a */
    public final void mo28771a(JsonWriter jsonWriter) {
        int i = this.f40395a;
        Map map = this.f40396b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        aew.m32770a(jsonWriter, map);
        jsonWriter.endObject();
    }
}
