package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class bkj implements ble {

    /* renamed from: a */
    private final AssetManager f42777a;

    /* renamed from: b */
    private final bld f42778b = null;

    /* renamed from: c */
    private String f42779c;

    /* renamed from: d */
    private InputStream f42780d;

    /* renamed from: e */
    private long f42781e;

    /* renamed from: f */
    private boolean f42782f;

    public bkj(Context context, bld bld) {
        this.f42777a = context.getAssets();
    }

    /* renamed from: a */
    public final long mo29003a(bkn bkn) throws bkk {
        long j;
        try {
            this.f42779c = bkn.f42786a.toString();
            String path = bkn.f42786a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            this.f42780d = this.f42777a.open(path, 1);
            blg.m36001b(this.f42780d.skip(bkn.f42788c) == bkn.f42788c);
            if (bkn.f42789d == -1) {
                j = (long) this.f42780d.available();
            } else {
                j = bkn.f42789d;
            }
            this.f42781e = j;
            if (this.f42781e >= 0) {
                this.f42782f = true;
                return this.f42781e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new bkk(e);
        }
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws bkk {
        if (this.f42781e == 0) {
            return -1;
        }
        try {
            int read = this.f42780d.read(bArr, i, (int) Math.min(this.f42781e, (long) i2));
            if (read > 0) {
                this.f42781e -= (long) read;
            }
            return read;
        } catch (IOException e) {
            throw new bkk(e);
        }
    }

    /* renamed from: a */
    public final void mo29004a() throws bkk {
        if (this.f42780d != null) {
            try {
                this.f42780d.close();
                this.f42780d = null;
                if (this.f42782f) {
                    this.f42782f = false;
                    if (this.f42778b != null) {
                    }
                }
            } catch (IOException e) {
                throw new bkk(e);
            } catch (Throwable th) {
                this.f42780d = null;
                if (this.f42782f) {
                    this.f42782f = false;
                }
                throw th;
            }
        }
    }
}
