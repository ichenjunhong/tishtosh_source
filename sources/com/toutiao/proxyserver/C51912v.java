package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.toutiao.proxyserver.v */
final class C51912v {

    /* renamed from: a */
    private final RandomAccessFile f129545a;

    /* renamed from: com.toutiao.proxyserver.v$a */
    static class C51913a extends Exception {
        C51913a() {
        }

        C51913a(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107425a() {
        C51838d.m111176a(this.f129545a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo107424a(byte[] bArr) throws C51913a {
        try {
            return this.f129545a.read(bArr);
        } catch (IOException e) {
            throw new C51913a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107426a(long j) throws C51913a {
        try {
            this.f129545a.seek(j);
        } catch (IOException e) {
            throw new C51913a(e);
        }
    }

    C51912v(File file, String str) throws C51913a {
        try {
            this.f129545a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C51913a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107427a(byte[] bArr, int i, int i2) throws C51913a {
        try {
            this.f129545a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C51913a(e);
        }
    }
}
