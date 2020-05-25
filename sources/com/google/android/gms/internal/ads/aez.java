package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.C15512c;

final /* synthetic */ class aez implements afb {

    /* renamed from: a */
    private final byte[] f40397a;

    aez(byte[] bArr) {
        this.f40397a = bArr;
    }

    /* renamed from: a */
    public final void mo28771a(JsonWriter jsonWriter) {
        byte[] bArr = this.f40397a;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C15512c.m32268a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a);
        } else {
            String a2 = aes.m32751a(a);
            if (a2 != null) {
                jsonWriter.name("bodydigest").value(a2);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
