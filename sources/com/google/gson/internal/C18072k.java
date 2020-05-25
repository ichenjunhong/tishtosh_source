package com.google.gson.internal;

import com.google.gson.C18082l;
import com.google.gson.internal.bind.C18012j;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.internal.k */
public final class C18072k {

    /* renamed from: com.google.gson.internal.k$a */
    static final class C18073a extends Writer {

        /* renamed from: a */
        private final Appendable f50136a;

        /* renamed from: b */
        private final C18074a f50137b = new C18074a();

        /* renamed from: com.google.gson.internal.k$a$a */
        static class C18074a implements CharSequence {

            /* renamed from: a */
            char[] f50138a;

            C18074a() {
            }

            public final int length() {
                return this.f50138a.length;
            }

            public final char charAt(int i) {
                return this.f50138a[i];
            }

            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f50138a, i, i2 - i);
            }
        }

        public final void close() {
        }

        public final void flush() {
        }

        public final void write(int i) throws IOException {
            this.f50136a.append((char) i);
        }

        C18073a(Appendable appendable) {
            this.f50136a = appendable;
        }

        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.f50137b.f50138a = cArr;
            this.f50136a.append(this.f50137b, i, i2 + i);
        }
    }

    /* renamed from: a */
    public static Writer m44266a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new C18073a(appendable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.C18083m((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.C18091u((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C18084n.f50144a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.C18091u((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.C18091u((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' com.google.gson.c.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C18082l m44265a(com.google.gson.p1078c.C17958a r2) throws com.google.gson.C18086p {
        /*
            r2.mo34843f()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.w<com.google.gson.l> r1 = com.google.gson.internal.bind.C18012j.f50049X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.read(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.l r2 = (com.google.gson.C18082l) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.u r0 = new com.google.gson.u
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.m r0 = new com.google.gson.m
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.u r0 = new com.google.gson.u
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.n r2 = com.google.gson.C18084n.f50144a
            return r2
        L_0x002b:
            com.google.gson.u r0 = new com.google.gson.u
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C18072k.m44265a(com.google.gson.c.a):com.google.gson.l");
    }

    /* renamed from: a */
    public static void m44267a(C18082l lVar, C17961c cVar) throws IOException {
        C18012j.f50049X.write(cVar, lVar);
    }
}
