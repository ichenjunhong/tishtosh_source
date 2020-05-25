package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

final class bra {

    /* renamed from: a */
    bok f43644a;

    /* renamed from: b */
    private final bok[] f43645b;

    /* renamed from: c */
    private final bom f43646c;

    public bra(bok[] bokArr, bom bom) {
        this.f43645b = bokArr;
        this.f43646c = bom;
    }

    /* renamed from: a */
    public final bok mo30594a(bol bol, Uri uri) throws IOException, InterruptedException {
        if (this.f43644a != null) {
            return this.f43644a;
        }
        bok[] bokArr = this.f43645b;
        int length = bokArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            bok bok = bokArr[i];
            try {
                if (bok.mo30509a(bol)) {
                    this.f43644a = bok;
                    bol.mo30498a();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                bol.mo30498a();
            }
        }
        if (this.f43644a != null) {
            this.f43644a.mo30508a(this.f43646c);
            return this.f43644a;
        }
        String a = btw.m36759a((Object[]) this.f43645b);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(a);
        sb.append(") could read the stream.");
        throw new bry(sb.toString(), uri);
    }
}
