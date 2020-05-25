package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.C53559c;
import okio.Buffer;
import okio.BufferedSource;

/* renamed from: okhttp3.ae */
public abstract class C53506ae implements Closeable {
    private Reader reader;

    /* renamed from: okhttp3.ae$a */
    static final class C53508a extends Reader {

        /* renamed from: a */
        private final BufferedSource f132426a;

        /* renamed from: b */
        private final Charset f132427b;

        /* renamed from: c */
        private boolean f132428c;

        /* renamed from: d */
        private Reader f132429d;

        public final void close() throws IOException {
            this.f132428c = true;
            if (this.f132429d != null) {
                this.f132429d.close();
            } else {
                this.f132426a.close();
            }
        }

        C53508a(BufferedSource bufferedSource, Charset charset) {
            this.f132426a = bufferedSource;
            this.f132427b = charset;
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f132428c) {
                Reader reader = this.f132429d;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.f132426a.inputStream(), C53559c.m113800a(this.f132426a, this.f132427b));
                    this.f132429d = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long contentLength();

    public abstract C53678w contentType();

    public abstract BufferedSource source();

    public void close() {
        C53559c.m113805a((Closeable) source());
    }

    private Charset charset() {
        C53678w contentType = contentType();
        if (contentType != null) {
            return contentType.mo111641a(C53559c.f132737e);
        }
        return C53559c.f132737e;
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        C53508a aVar = new C53508a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            return source.readString(C53559c.m113800a(source, charset()));
        } finally {
            C53559c.m113805a((Closeable) source);
        }
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                byte[] readByteArray = source.readByteArray();
                C53559c.m113805a((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) readByteArray.length)) {
                    return readByteArray;
                }
                StringBuilder sb = new StringBuilder("Content-Length (");
                sb.append(contentLength);
                sb.append(") and stream length (");
                sb.append(readByteArray.length);
                sb.append(") disagree");
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                C53559c.m113805a((Closeable) source);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot buffer entire body for content length: ");
            sb2.append(contentLength);
            throw new IOException(sb2.toString());
        }
    }

    public static C53506ae create(C53678w wVar, byte[] bArr) {
        return create(wVar, (long) bArr.length, new Buffer().write(bArr));
    }

    public static C53506ae create(C53678w wVar, String str) {
        Charset charset = C53559c.f132737e;
        if (wVar != null) {
            charset = wVar.mo111640a();
            if (charset == null) {
                charset = C53559c.f132737e;
                StringBuilder sb = new StringBuilder();
                sb.append(wVar);
                sb.append("; charset=utf-8");
                wVar = C53678w.m114225a(sb.toString());
            }
        }
        Buffer writeString = new Buffer().writeString(str, charset);
        return create(wVar, writeString.size(), writeString);
    }

    public static C53506ae create(final C53678w wVar, final long j, final BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C53506ae() {
                public final long contentLength() {
                    return j;
                }

                public final C53678w contentType() {
                    return wVar;
                }

                public final BufferedSource source() {
                    return bufferedSource;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
