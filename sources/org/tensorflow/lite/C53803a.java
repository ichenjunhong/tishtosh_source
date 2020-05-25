package org.tensorflow.lite;

/* renamed from: org.tensorflow.lite.a */
public enum C53803a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5);
    

    /* renamed from: a */
    private static final C53803a[] f133431a = null;
    public final int value;

    public final int byteSize() {
        switch (this) {
            case FLOAT32:
                return 4;
            case INT32:
                return 4;
            case UINT8:
                return 1;
            case INT64:
                return 8;
            case STRING:
                return -1;
            default:
                StringBuilder sb = new StringBuilder("DataType error: DataType ");
                sb.append(this);
                sb.append(" is not supported yet");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        f133431a = values();
    }

    /* renamed from: a */
    static C53803a m114462a(int i) {
        C53803a[] aVarArr;
        for (C53803a aVar : f133431a) {
            if (aVar.value == i) {
                return aVar;
            }
        }
        StringBuilder sb = new StringBuilder("DataType error: DataType ");
        sb.append(i);
        sb.append(" is not recognized in Java (version ");
        sb.append(TensorFlowLite.runtimeVersion());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    private C53803a(int i) {
        this.value = i;
    }
}
