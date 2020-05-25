package okhttp3;

import java.io.IOException;

/* renamed from: okhttp3.z */
public enum C53685z {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    

    /* renamed from: a */
    private final String f133244a;

    public final String toString() {
        return this.f133244a;
    }

    public static C53685z get(String str) throws IOException {
        if (str.equals(HTTP_1_0.f133244a)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f133244a)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f133244a)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f133244a)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f133244a)) {
            return QUIC;
        }
        StringBuilder sb = new StringBuilder("Unexpected protocol: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    private C53685z(String str) {
        this.f133244a = str;
    }
}
