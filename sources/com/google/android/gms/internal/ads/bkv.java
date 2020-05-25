package com.google.android.gms.internal.ads;

import java.io.IOException;

public class bkv extends IOException {

    /* renamed from: a */
    private final bkn f42823a;

    public bkv(String str, bkn bkn) {
        super(str);
        this.f42823a = bkn;
    }

    public bkv(IOException iOException, bkn bkn) {
        super(iOException);
        this.f42823a = bkn;
    }

    public bkv(String str, IOException iOException, bkn bkn) {
        super(str, iOException);
        this.f42823a = bkn;
    }
}
