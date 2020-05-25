package okhttp3.internal.p2687e;

import java.io.IOException;

/* renamed from: okhttp3.internal.e.n */
public final class C53622n extends IOException {
    public final C53586b errorCode;

    public C53622n(C53586b bVar) {
        StringBuilder sb = new StringBuilder("stream was reset: ");
        sb.append(bVar);
        super(sb.toString());
        this.errorCode = bVar;
    }
}
