package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

public final class avo implements apt {

    /* renamed from: a */
    private Mac f41433a;

    /* renamed from: b */
    private final int f41434b;

    /* renamed from: c */
    private final String f41435c;

    /* renamed from: d */
    private final Key f41436d;

    public avo(String str, Key key, int i) throws GeneralSecurityException {
        String str2;
        if (i >= 10) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if (i > 20) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 1:
                    if (i > 32) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                case 2:
                    if (i > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                    break;
                default:
                    String str3 = "unknown Hmac algorithm: ";
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        str2 = str3.concat(valueOf);
                    } else {
                        str2 = new String(str3);
                    }
                    throw new NoSuchAlgorithmException(str2);
            }
            this.f41435c = str;
            this.f41434b = i;
            this.f41436d = key;
            this.f41433a = (Mac) avd.f41421b.mo29568a(str);
            this.f41433a.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final byte[] mo29460a(byte[] bArr) throws GeneralSecurityException {
        Mac mac;
        try {
            mac = (Mac) this.f41433a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) avd.f41421b.mo29568a(this.f41435c);
            mac.init(this.f41436d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f41434b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f41434b);
        return bArr2;
    }
}
