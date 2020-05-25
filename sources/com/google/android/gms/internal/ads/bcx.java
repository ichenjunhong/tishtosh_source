package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class bcx implements abg, Closeable, Iterator<aaf> {

    /* renamed from: f */
    private static final aaf f41907f = new bcy("eof ");

    /* renamed from: g */
    private static bdf f41908g = bdf.m35439a(bcx.class);

    /* renamed from: a */
    protected C16371xh f41909a;

    /* renamed from: b */
    protected bcz f41910b;

    /* renamed from: c */
    long f41911c;

    /* renamed from: d */
    long f41912d;

    /* renamed from: e */
    long f41913e;

    /* renamed from: h */
    private aaf f41914h;

    /* renamed from: i */
    private List<aaf> f41915i = new ArrayList();

    /* renamed from: b */
    public final List<aaf> mo30044b() {
        if (this.f41910b == null || this.f41914h == f41907f) {
            return this.f41915i;
        }
        return new bdd(this.f41915i, this);
    }

    /* renamed from: a */
    public void mo30043a(bcz bcz, long j, C16371xh xhVar) throws IOException {
        this.f41910b = bcz;
        long b = bcz.mo29081b();
        this.f41912d = b;
        this.f41911c = b;
        bcz.mo29080a(bcz.mo29081b() + j);
        this.f41913e = bcz.mo29081b();
        this.f41909a = xhVar;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.f41914h == f41907f) {
            return false;
        }
        if (this.f41914h != null) {
            return true;
        }
        try {
            this.f41914h = (aaf) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f41914h = f41907f;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final aaf next() {
        aaf a;
        if (this.f41914h != null && this.f41914h != f41907f) {
            aaf aaf = this.f41914h;
            this.f41914h = null;
            return aaf;
        } else if (this.f41910b == null || this.f41911c >= this.f41913e) {
            this.f41914h = f41907f;
            throw new NoSuchElementException();
        } else {
            try {
                synchronized (this.f41910b) {
                    this.f41910b.mo29080a(this.f41911c);
                    a = this.f41909a.mo31436a(this.f41910b, this);
                    this.f41911c = this.f41910b.mo29081b();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f41915i.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((aaf) this.f41915i.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.f41910b.close();
    }
}
