package p2699pl.droidsonroids.gif;

import java.io.IOException;

/* renamed from: pl.droidsonroids.gif.GifIOException */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;

    /* renamed from: a */
    private final String f133489a;
    public final C53878b reason;

    public String getMessage() {
        if (this.f133489a == null) {
            return this.reason.mo113943a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.reason.mo113943a());
        sb.append(": ");
        sb.append(this.f133489a);
        return sb.toString();
    }

    GifIOException(int i, String str) {
        this.reason = C53878b.m114547a(i);
        this.f133489a = str;
    }
}
