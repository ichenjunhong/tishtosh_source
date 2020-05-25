package android.arch.p011c.p012a;

/* renamed from: android.arch.c.a.a */
public final class C0109a implements C0125e {

    /* renamed from: a */
    private final String f272a;

    /* renamed from: b */
    private final Object[] f273b;

    /* renamed from: a */
    public final String mo172a() {
        return this.f272a;
    }

    public C0109a(String str) {
        this(str, null);
    }

    /* renamed from: a */
    public final void mo173a(C0124d dVar) {
        long j;
        Object[] objArr = this.f273b;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    dVar.mo198a(i);
                } else if (obj instanceof byte[]) {
                    dVar.mo202a(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    dVar.mo199a(i, (double) ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    dVar.mo199a(i, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    dVar.mo200a(i, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    dVar.mo200a(i, (long) ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    dVar.mo200a(i, (long) ((Short) obj).shortValue());
                } else if (obj instanceof Byte) {
                    dVar.mo200a(i, (long) ((Byte) obj).byteValue());
                } else if (obj instanceof String) {
                    dVar.mo201a(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    dVar.mo200a(i, j);
                } else {
                    StringBuilder sb = new StringBuilder("Cannot bind ");
                    sb.append(obj);
                    sb.append(" at index ");
                    sb.append(i);
                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public C0109a(String str, Object[] objArr) {
        this.f272a = str;
        this.f273b = objArr;
    }
}
