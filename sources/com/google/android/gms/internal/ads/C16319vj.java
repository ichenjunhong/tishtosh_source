package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.vj */
public abstract class C16319vj implements C16371xh {

    /* renamed from: a */
    private static Logger f45722a = Logger.getLogger(C16319vj.class.getName());

    /* renamed from: b */
    private ThreadLocal<ByteBuffer> f45723b = new C16342wf(this);

    /* renamed from: a */
    public abstract aaf mo29085a(String str, byte[] bArr, String str2);

    /* renamed from: a */
    public final aaf mo31436a(bcz bcz, abg abg) throws IOException {
        int a;
        long j;
        bcz bcz2 = bcz;
        abg abg2 = abg;
        long b = bcz.mo29081b();
        ((ByteBuffer) this.f45723b.get()).rewind().limit(8);
        do {
            a = bcz2.mo29077a((ByteBuffer) this.f45723b.get());
            if (a == 8) {
                ((ByteBuffer) this.f45723b.get()).rewind();
                long a2 = C16425zh.m39225a((ByteBuffer) this.f45723b.get());
                byte[] bArr = null;
                if (a2 >= 8 || a2 <= 1) {
                    String f = C16425zh.m39230f((ByteBuffer) this.f45723b.get());
                    if (a2 == 1) {
                        ((ByteBuffer) this.f45723b.get()).limit(16);
                        bcz2.mo29077a((ByteBuffer) this.f45723b.get());
                        ((ByteBuffer) this.f45723b.get()).position(8);
                        j = C16425zh.m39227c((ByteBuffer) this.f45723b.get()) - 16;
                    } else {
                        j = a2 == 0 ? bcz.mo29078a() - bcz.mo29081b() : a2 - 8;
                    }
                    if ("uuid".equals(f)) {
                        ((ByteBuffer) this.f45723b.get()).limit(((ByteBuffer) this.f45723b.get()).limit() + 16);
                        bcz2.mo29077a((ByteBuffer) this.f45723b.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.f45723b.get()).position() - 16; position < ((ByteBuffer) this.f45723b.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.f45723b.get()).position() - 16)] = ((ByteBuffer) this.f45723b.get()).get(position);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    aaf a3 = mo29085a(f, bArr, abg2 instanceof aaf ? ((aaf) abg2).mo28570a() : "");
                    a3.mo28571a(abg2);
                    ((ByteBuffer) this.f45723b.get()).rewind();
                    a3.mo28572a(bcz, (ByteBuffer) this.f45723b.get(), j2, this);
                    return a3;
                }
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a2);
                sb.append("). Stop parsing!");
                f45722a.logp(Level.SEVERE, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (a >= 0);
        bcz2.mo29080a(b);
        throw new EOFException();
    }
}
