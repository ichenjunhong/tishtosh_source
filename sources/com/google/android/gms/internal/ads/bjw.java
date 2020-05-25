package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Stack;

final class bjw implements bka {

    /* renamed from: a */
    private final byte[] f42716a = new byte[8];

    /* renamed from: b */
    private final Stack<bjz> f42717b = new Stack<>();

    /* renamed from: c */
    private final bkc f42718c = new bkc();

    /* renamed from: d */
    private bkb f42719d;

    /* renamed from: e */
    private int f42720e;

    /* renamed from: f */
    private int f42721f;

    /* renamed from: g */
    private long f42722g;

    bjw() {
    }

    /* renamed from: a */
    public final void mo30294a(bkb bkb) {
        this.f42719d = bkb;
    }

    /* renamed from: a */
    public final void mo30293a() {
        this.f42720e = 0;
        this.f42717b.clear();
        this.f42718c.mo30305a();
    }

    /* renamed from: a */
    public final boolean mo30295a(bja bja) throws IOException, InterruptedException {
        double d;
        blg.m36001b(this.f42719d != null);
        while (true) {
            if (this.f42717b.isEmpty() || bja.mo30255a() < ((bjz) this.f42717b.peek()).f42725b) {
                if (this.f42720e == 0) {
                    long a = this.f42718c.mo30304a(bja, true, false);
                    if (a == -1) {
                        return false;
                    }
                    this.f42721f = (int) a;
                    this.f42720e = 1;
                }
                if (this.f42720e == 1) {
                    this.f42722g = this.f42718c.mo30304a(bja, false, true);
                    this.f42720e = 2;
                }
                int a2 = this.f42719d.mo30297a(this.f42721f);
                switch (a2) {
                    case 0:
                        bja.mo30256a((int) this.f42722g);
                        this.f42720e = 0;
                    case 1:
                        long a3 = bja.mo30255a();
                        this.f42717b.add(new bjz(this.f42721f, this.f42722g + a3));
                        this.f42719d.mo30301a(this.f42721f, a3, this.f42722g);
                        this.f42720e = 0;
                        return true;
                    case 2:
                        if (this.f42722g <= 8) {
                            this.f42719d.mo30300a(this.f42721f, m35915a(bja, (int) this.f42722g));
                            this.f42720e = 0;
                            return true;
                        }
                        long j = this.f42722g;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j);
                        throw new IllegalStateException(sb.toString());
                    case 3:
                        if (this.f42722g <= 2147483647L) {
                            bkb bkb = this.f42719d;
                            int i = this.f42721f;
                            int i2 = (int) this.f42722g;
                            byte[] bArr = new byte[i2];
                            bja.mo30257a(bArr, 0, i2);
                            bkb.mo30302a(i, new String(bArr, Charset.forName("UTF-8")));
                            this.f42720e = 0;
                            return true;
                        }
                        long j2 = this.f42722g;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j2);
                        throw new IllegalStateException(sb2.toString());
                    case 4:
                        this.f42719d.mo30299a(this.f42721f, (int) this.f42722g, bja);
                        this.f42720e = 0;
                        return true;
                    case 5:
                        if (this.f42722g == 4 || this.f42722g == 8) {
                            bkb bkb2 = this.f42719d;
                            int i3 = this.f42721f;
                            int i4 = (int) this.f42722g;
                            long a4 = m35915a(bja, i4);
                            if (i4 == 4) {
                                d = (double) Float.intBitsToFloat((int) a4);
                            } else {
                                d = Double.longBitsToDouble(a4);
                            }
                            bkb2.mo30298a(i3, d);
                            this.f42720e = 0;
                            return true;
                        }
                        long j3 = this.f42722g;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j3);
                        throw new IllegalStateException(sb3.toString());
                    default:
                        StringBuilder sb4 = new StringBuilder(32);
                        sb4.append("Invalid element type ");
                        sb4.append(a2);
                        throw new IllegalStateException(sb4.toString());
                }
            } else {
                this.f42719d.mo30303b(((bjz) this.f42717b.pop()).f42724a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m35915a(bja bja, int i) throws IOException, InterruptedException {
        bja.mo30257a(this.f42716a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f42716a[i2] & 255));
        }
        return j;
    }
}
