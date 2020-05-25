package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class bkt implements ble {

    /* renamed from: a */
    private final bld f42818a;

    /* renamed from: b */
    private RandomAccessFile f42819b;

    /* renamed from: c */
    private String f42820c;

    /* renamed from: d */
    private long f42821d;

    /* renamed from: e */
    private boolean f42822e;

    public bkt() {
        this(null);
    }

    public bkt(bld bld) {
        this.f42818a = null;
    }

    /* renamed from: a */
    public final long mo29003a(bkn bkn) throws bku {
        long j;
        try {
            this.f42820c = bkn.f42786a.toString();
            this.f42819b = new RandomAccessFile(bkn.f42786a.getPath(), "r");
            this.f42819b.seek(bkn.f42788c);
            if (bkn.f42789d == -1) {
                j = this.f42819b.length() - bkn.f42788c;
            } else {
                j = bkn.f42789d;
            }
            this.f42821d = j;
            if (this.f42821d >= 0) {
                this.f42822e = true;
                return this.f42821d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new bku(e);
        }
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws bku {
        if (this.f42821d == 0) {
            return -1;
        }
        try {
            int read = this.f42819b.read(bArr, i, (int) Math.min(this.f42821d, (long) i2));
            if (read > 0) {
                this.f42821d -= (long) read;
            }
            return read;
        } catch (IOException e) {
            throw new bku(e);
        }
    }

    /* renamed from: a */
    public final void mo29004a() throws bku {
        if (this.f42819b != null) {
            try {
                this.f42819b.close();
                this.f42819b = null;
                this.f42820c = null;
                if (this.f42822e) {
                    this.f42822e = false;
                    if (this.f42818a != null) {
                    }
                }
            } catch (IOException e) {
                throw new bku(e);
            } catch (Throwable th) {
                this.f42819b = null;
                this.f42820c = null;
                if (this.f42822e) {
                    this.f42822e = false;
                }
                throw th;
            }
        }
    }
}
