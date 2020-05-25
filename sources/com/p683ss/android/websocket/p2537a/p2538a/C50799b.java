package com.p683ss.android.websocket.p2537a.p2538a;

import java.net.ProtocolException;

/* renamed from: com.ss.android.websocket.a.a.b */
public final class C50799b {
    /* renamed from: a */
    static void m109935a(int i, boolean z) throws ProtocolException {
        String str;
        if (i < 1000 || i >= 5000) {
            StringBuilder sb = new StringBuilder("Code must be in range [1000,5000): ");
            sb.append(i);
            str = sb.toString();
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            str = null;
        } else {
            StringBuilder sb2 = new StringBuilder("Code ");
            sb2.append(i);
            sb2.append(" is reserved and may not be used.");
            str = sb2.toString();
        }
        if (str == null) {
            return;
        }
        if (z) {
            throw new IllegalArgumentException(str);
        }
        throw new ProtocolException(str);
    }

    /* renamed from: a */
    static void m109936a(byte[] bArr, long j, byte[] bArr2, long j2) {
        int length = bArr2.length;
        int i = 0;
        while (((long) i) < j) {
            int i2 = (int) (j2 % ((long) length));
            bArr[i] = (byte) (bArr2[i2] ^ bArr[i]);
            i++;
            j2++;
        }
    }
}
