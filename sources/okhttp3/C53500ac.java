package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.internal.C53559c;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* renamed from: okhttp3.ac */
public abstract class C53500ac {
    public long contentLength() throws IOException {
        return -1;
    }

    public abstract C53678w contentType();

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static C53500ac create(final C53678w wVar, final ByteString byteString) {
        return new C53500ac() {
            public final C53678w contentType() {
                return wVar;
            }

            public final long contentLength() throws IOException {
                return (long) byteString.size();
            }

            public final void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(byteString);
            }
        };
    }

    public static C53500ac create(final C53678w wVar, final File file) {
        if (file != null) {
            return new C53500ac() {
                public final C53678w contentType() {
                    return wVar;
                }

                public final long contentLength() {
                    return file.length();
                }

                public final void writeTo(BufferedSink bufferedSink) throws IOException {
                    Source source = null;
                    try {
                        Source source2 = Okio.source(file);
                        try {
                            bufferedSink.writeAll(source2);
                            C53559c.m113805a((Closeable) source2);
                        } catch (Throwable th) {
                            th = th;
                            source = source2;
                            C53559c.m113805a((Closeable) source);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C53559c.m113805a((Closeable) source);
                        throw th;
                    }
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static C53500ac create(C53678w wVar, byte[] bArr) {
        return create(wVar, bArr, 0, bArr.length);
    }

    public static C53500ac create(C53678w wVar, String str) {
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
        return create(wVar, str.getBytes(charset));
    }

    public static C53500ac create(final C53678w wVar, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            C53559c.m113804a((long) bArr.length, (long) i, (long) i2);
            return new C53500ac() {
                public final long contentLength() {
                    return (long) i2;
                }

                public final C53678w contentType() {
                    return wVar;
                }

                public final void writeTo(BufferedSink bufferedSink) throws IOException {
                    bufferedSink.write(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
