package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15464q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.bq */
final class C16573bq {

    /* renamed from: a */
    public int f46572a;

    /* renamed from: b */
    private ByteArrayOutputStream f46573b = new ByteArrayOutputStream();

    /* renamed from: c */
    private final /* synthetic */ C16571bo f46574c;

    public C16573bq(C16571bo boVar) {
        this.f46574c = boVar;
    }

    /* renamed from: a */
    public final boolean mo31837a(C16564bh bhVar) {
        C15464q.m32123a(bhVar);
        if (this.f46572a + 1 > C16550au.m39485g()) {
            return false;
        }
        String a = this.f46574c.mo31834a(bhVar, false);
        if (a == null) {
            this.f46574c.mo32507h().mo31826a(bhVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = a.getBytes();
        int length = bytes.length;
        if (length > C16550au.m39481c()) {
            this.f46574c.mo32507h().mo31826a(bhVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f46573b.size() > 0) {
            length++;
        }
        if (this.f46573b.size() + length > ((Integer) C16559bc.f46540t.f46547a).intValue()) {
            return false;
        }
        try {
            if (this.f46573b.size() > 0) {
                this.f46573b.write(C16571bo.f46569a);
            }
            this.f46573b.write(bytes);
            this.f46572a++;
            return true;
        } catch (IOException e) {
            this.f46574c.mo32501d("Failed to write payload when batching hits", e);
            return true;
        }
    }

    /* renamed from: a */
    public final byte[] mo31838a() {
        return this.f46573b.toByteArray();
    }
}
