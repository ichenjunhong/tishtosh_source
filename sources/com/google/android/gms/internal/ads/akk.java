package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

@C16299uq
public final class akk {

    /* renamed from: a */
    private long f40773a;

    /* renamed from: a */
    public final long mo29083a(ByteBuffer byteBuffer) {
        adh adh;
        ach ach;
        if (this.f40773a > 0) {
            return this.f40773a;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new C16400yj(new akj(duplicate), akm.f40774a).mo30044b().iterator();
            while (true) {
                adh = null;
                if (!it.hasNext()) {
                    ach = null;
                    break;
                }
                aaf aaf = (aaf) it.next();
                if (aaf instanceof ach) {
                    ach = (ach) aaf;
                    break;
                }
            }
            Iterator it2 = ach.mo30044b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                aaf aaf2 = (aaf) it2.next();
                if (aaf2 instanceof adh) {
                    adh = (adh) aaf2;
                    break;
                }
            }
            this.f40773a = (adh.f40292b * 1000) / adh.f40291a;
            return this.f40773a;
        } catch (IOException | RuntimeException unused) {
            return 0;
        }
    }
}
