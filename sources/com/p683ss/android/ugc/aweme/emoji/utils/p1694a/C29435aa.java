package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29450n.C29451a;
import java.io.IOException;
import java.util.zip.CRC32;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.aa */
public abstract class C29435aa {

    /* renamed from: a */
    static final byte[] f77071a = C29468x.m69518a(8448);

    /* renamed from: a */
    static byte[] m69418a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* renamed from: b */
    private static boolean m69419b(C29459u uVar) {
        if (!uVar.f77130e.f77087c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m69416a(C29459u uVar) throws C29450n {
        if (!m69419b(uVar)) {
            throw new C29450n(C29451a.ENCRYPTION, uVar);
        } else if (!m69420c(uVar)) {
            throw new C29450n(C29451a.METHOD, uVar);
        }
    }

    /* renamed from: c */
    private static boolean m69420c(C29459u uVar) {
        if (uVar.getMethod() == 0 || uVar.getMethod() == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m69415a(C29434a aVar, byte[] bArr) {
        byte[] bArr2;
        if (aVar != null) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (crc32.getValue() == aVar.f77068a) {
                try {
                    C29456s sVar = C29457t.f77119a;
                    if (aVar.f77069b != null) {
                        bArr2 = new byte[aVar.f77069b.length];
                        System.arraycopy(aVar.f77069b, 0, bArr2, 0, bArr2.length);
                    } else {
                        bArr2 = null;
                    }
                    return sVar.mo59514a(bArr2);
                } catch (IOException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static void m69417a(C29459u uVar, byte[] bArr, byte[] bArr2) {
        C29447k kVar = (C29447k) uVar.mo59539b(C29447k.f77099c);
        String name = uVar.getName();
        String a = m69415a(kVar, bArr);
        if (a != null && !name.equals(a)) {
            uVar.mo59536a(a);
        }
        if (bArr2 != null && bArr2.length > 0) {
            String a2 = m69415a((C29446j) uVar.mo59539b(C29446j.f77098c), bArr2);
            if (a2 != null) {
                uVar.setComment(a2);
            }
        }
    }
}
