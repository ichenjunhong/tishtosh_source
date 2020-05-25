package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.zr */
final class C16435zr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Bitmap f46056a;

    /* renamed from: b */
    private final /* synthetic */ C16432zo f46057b;

    C16435zr(C16432zo zoVar, Bitmap bitmap) {
        this.f46057b = zoVar;
        this.f46056a = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f46056a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f46057b.f46040a) {
            this.f46057b.f46041d.f41853i = new bcr();
            this.f46057b.f46041d.f41853i.f41876e = byteArrayOutputStream.toByteArray();
            this.f46057b.f46041d.f41853i.f41875d = "image/png";
            this.f46057b.f46041d.f41853i.f41874c = Integer.valueOf(1);
        }
    }
}
