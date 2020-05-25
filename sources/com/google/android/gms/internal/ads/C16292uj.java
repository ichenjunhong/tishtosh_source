package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.uj */
public class C16292uj extends brw<String> {

    /* renamed from: k */
    private final Object f45677k = new Object();

    /* renamed from: l */
    private bzv<String> f45678l;

    public C16292uj(int i, String str, bzv<String> bzv, byx byx) {
        super(i, str, byx);
        this.f45678l = bzv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28741a(String str) {
        bzv<String> bzv;
        synchronized (this.f45677k) {
            bzv = this.f45678l;
        }
        if (bzv != null) {
            bzv.mo28745a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bxw<String> mo28746a(bpz bpz) {
        String str;
        try {
            byte[] bArr = bpz.f43518b;
            String str2 = "ISO-8859-1";
            String str3 = (String) bpz.f43519c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bpz.f43518b);
        }
        return bxw.m36976a(str, C16107nn.m38101a(bpz));
    }
}
