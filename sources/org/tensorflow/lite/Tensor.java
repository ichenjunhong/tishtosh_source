package org.tensorflow.lite;

import com.C2240a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class Tensor {

    /* renamed from: a */
    public final C53803a f133428a;

    /* renamed from: b */
    public int[] f133429b;

    /* renamed from: c */
    private long f133430c;

    static {
        TensorFlowLite.m114461a();
    }

    private static native ByteBuffer buffer(long j);

    private static native long create(long j, int i);

    private static native void delete(long j);

    private static native int dtype(long j);

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native int numBytes(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    private static native void writeDirectBuffer(long j, ByteBuffer byteBuffer);

    private static native void writeMultiDimensionalArray(long j, Object obj);

    /* renamed from: c */
    private int m114447c() {
        return numBytes(this.f133430c);
    }

    /* renamed from: d */
    private ByteBuffer m114448d() {
        return buffer(this.f133430c).order(ByteOrder.nativeOrder());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo113436b() {
        this.f133429b = shape(this.f133430c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo113433a() {
        delete(this.f133430c);
        this.f133430c = 0;
    }

    /* renamed from: j */
    private static boolean m114455j(Object obj) {
        return obj instanceof ByteBuffer;
    }

    /* renamed from: g */
    private void m114452g(Object obj) {
        m114453h(obj);
        m114454i(obj);
    }

    /* renamed from: e */
    private static int[] m114450e(Object obj) {
        int[] iArr = new int[m114451f(obj)];
        m114446a(obj, 0, iArr);
        return iArr;
    }

    private Tensor(long j) {
        this.f133430c = j;
        this.f133428a = C53803a.m114462a(dtype(j));
        this.f133429b = shape(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int[] mo113437c(Object obj) {
        if (obj == null || m114455j(obj)) {
            return null;
        }
        m114453h(obj);
        int[] e = m114450e(obj);
        if (Arrays.equals(this.f133429b, e)) {
            return null;
        }
        return e;
    }

    /* renamed from: f */
    private static int m114451f(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return m114451f(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    /* renamed from: h */
    private void m114453h(Object obj) {
        if (!m114455j(obj)) {
            C53803a d = m114449d(obj);
            if (d != this.f133428a) {
                throw new IllegalArgumentException(C2240a.m6772a("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", new Object[]{this.f133428a, obj.getClass().getName(), d}));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Object mo113435b(Object obj) {
        if (obj != null) {
            m114452g(obj);
            if (obj instanceof ByteBuffer) {
                ((ByteBuffer) obj).put(m114448d());
                return obj;
            }
            readMultiDimensionalArray(this.f133430c, obj);
            return obj;
        } else if (hasDelegateBufferHandle(this.f133430c)) {
            return obj;
        } else {
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* renamed from: d */
    private static C53803a m114449d(Object obj) {
        if (obj != null) {
            Class cls = obj.getClass();
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                return C53803a.FLOAT32;
            }
            if (Integer.TYPE.equals(cls)) {
                return C53803a.INT32;
            }
            if (Byte.TYPE.equals(cls)) {
                return C53803a.UINT8;
            }
            if (Long.TYPE.equals(cls)) {
                return C53803a.INT64;
            }
            if (String.class.equals(cls)) {
                return C53803a.STRING;
            }
        }
        StringBuilder sb = new StringBuilder("DataType error: cannot resolve DataType of ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: i */
    private void m114454i(Object obj) {
        if (m114455j(obj)) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.capacity() != m114447c()) {
                throw new IllegalArgumentException(C2240a.m6772a("Cannot convert between a TensorFlowLite buffer with %d bytes and a ByteBuffer with %d bytes.", new Object[]{Integer.valueOf(m114447c()), Integer.valueOf(byteBuffer.capacity())}));
            }
            return;
        }
        int[] e = m114450e(obj);
        if (!Arrays.equals(e, this.f133429b)) {
            throw new IllegalArgumentException(C2240a.m6772a("Cannot copy between a TensorFlowLite tensor with shape %s and a Java object with shape %s.", new Object[]{Arrays.toString(this.f133429b), Arrays.toString(e)}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo113434a(Object obj) {
        if (obj != null) {
            m114452g(obj);
            if (m114455j(obj)) {
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()) {
                    m114448d().put(byteBuffer);
                } else {
                    writeDirectBuffer(this.f133430c, byteBuffer);
                }
            } else {
                writeMultiDimensionalArray(this.f133430c, obj);
            }
        } else if (!hasDelegateBufferHandle(this.f133430c)) {
            throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* renamed from: a */
    static Tensor m114445a(long j, int i) {
        return new Tensor(create(j, i));
    }

    /* renamed from: a */
    private static void m114446a(Object obj, int i, int[] iArr) {
        if (iArr != null && i != iArr.length) {
            int length = Array.getLength(obj);
            if (iArr[i] == 0) {
                iArr[i] = length;
            } else if (iArr[i] != length) {
                throw new IllegalArgumentException(C2240a.m6772a("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)}));
            }
            for (int i2 = 0; i2 < length; i2++) {
                m114446a(Array.get(obj, i2), i + 1, iArr);
            }
        }
    }
}
