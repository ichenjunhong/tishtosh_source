package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.C15512c;
import java.util.Map;

final /* synthetic */ class aex implements afb {

    /* renamed from: a */
    private final String f40391a;

    /* renamed from: b */
    private final String f40392b;

    /* renamed from: c */
    private final Map f40393c;

    /* renamed from: d */
    private final byte[] f40394d;

    aex(String str, String str2, Map map, byte[] bArr) {
        this.f40391a = str;
        this.f40392b = str2;
        this.f40393c = map;
        this.f40394d = bArr;
    }

    /* renamed from: a */
    public final void mo28771a(JsonWriter jsonWriter) {
        String str = this.f40391a;
        String str2 = this.f40392b;
        Map map = this.f40393c;
        byte[] bArr = this.f40394d;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        aew.m32770a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C15512c.m32268a(bArr));
        }
        jsonWriter.endObject();
    }
}
