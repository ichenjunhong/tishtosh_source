package okhttp3.internal.p2687e;

/* renamed from: okhttp3.internal.e.b */
public enum C53586b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    public static C53586b fromHttp2(int i) {
        C53586b[] values;
        for (C53586b bVar : values()) {
            if (bVar.httpCode == i) {
                return bVar;
            }
        }
        return null;
    }

    private C53586b(int i) {
        this.httpCode = i;
    }
}
