package p2628d.p2638e;

import java.io.InputStream;
import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.e.b */
public final class C52646b {
    /* renamed from: a */
    public static final long m112188a(InputStream inputStream, OutputStream outputStream, int i) {
        C52711k.m112240b(inputStream, "$this$copyTo");
        C52711k.m112240b(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
