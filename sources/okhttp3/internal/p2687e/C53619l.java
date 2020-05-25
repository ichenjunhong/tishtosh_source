package okhttp3.internal.p2687e;

import java.io.IOException;
import okio.BufferedSource;

/* renamed from: okhttp3.internal.e.l */
public interface C53619l {

    /* renamed from: a */
    public static final C53619l f132974a = new C53619l() {
        /* renamed from: a */
        public final boolean mo111486a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip((long) i2);
            return true;
        }
    };

    /* renamed from: a */
    boolean mo111486a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;
}
