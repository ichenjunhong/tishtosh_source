package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class aei extends bcu {

    /* renamed from: a */
    private ByteBuffer f40355a;

    public aei(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo28715a(ByteBuffer byteBuffer) {
        this.f40355a = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
