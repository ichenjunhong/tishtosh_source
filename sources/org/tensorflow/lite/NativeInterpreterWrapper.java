package org.tensorflow.lite;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.tensorflow.lite.C53806c.C53807a;

final class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: a */
    private long f133417a;

    /* renamed from: b */
    private long f133418b;

    /* renamed from: c */
    private long f133419c;

    /* renamed from: d */
    private long f133420d = -1;

    /* renamed from: e */
    private ByteBuffer f133421e;

    /* renamed from: f */
    private Map<String, Integer> f133422f;

    /* renamed from: g */
    private Map<String, Integer> f133423g;

    /* renamed from: h */
    private Tensor[] f133424h;

    /* renamed from: i */
    private Tensor[] f133425i;

    /* renamed from: j */
    private boolean f133426j;

    /* renamed from: k */
    private final List<C53805b> f133427k = new ArrayList();

    static {
        TensorFlowLite.m114461a();
    }

    private static native long allocateTensors(long j, long j2);

    private static native void allowBufferHandleOutput(long j, boolean z);

    private static native void allowFp16PrecisionForFp32(long j, boolean z);

    private static native void applyDelegate(long j, long j2, long j3);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native int getInputCount(long j);

    private static native String[] getInputNames(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputDataType(long j, int i);

    private static native String[] getOutputNames(long j);

    private static native float getOutputQuantizationScale(long j, int i);

    private static native int getOutputQuantizationZeroPoint(long j, int i);

    private static native int getOutputTensorIndex(long j, int i);

    private static native void numThreads(long j, int i);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr);

    private static native void run(long j, long j2);

    private static native void useNNAPI(long j, boolean z);

    public final void close() {
        for (int i = 0; i < this.f133424h.length; i++) {
            if (this.f133424h[i] != null) {
                this.f133424h[i].mo113433a();
                this.f133424h[i] = null;
            }
        }
        for (int i2 = 0; i2 < this.f133425i.length; i2++) {
            if (this.f133425i[i2] != null) {
                this.f133425i[i2].mo113433a();
                this.f133425i[i2] = null;
            }
        }
        delete(this.f133417a, this.f133419c, this.f133418b);
        this.f133417a = 0;
        this.f133419c = 0;
        this.f133418b = 0;
        this.f133421e = null;
        this.f133422f = null;
        this.f133423g = null;
        this.f133426j = false;
        this.f133427k.clear();
    }

    /* renamed from: a */
    private Tensor m114440a(int i) {
        if (i < 0 || i >= this.f133424h.length) {
            StringBuilder sb = new StringBuilder("Invalid input Tensor index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        Tensor tensor = this.f133424h[i];
        if (tensor != null) {
            return tensor;
        }
        Tensor[] tensorArr = this.f133424h;
        Tensor a = Tensor.m114445a(this.f133418b, getInputTensorIndex(this.f133418b, i));
        tensorArr[i] = a;
        return a;
    }

    /* renamed from: b */
    private Tensor m114443b(int i) {
        if (i < 0 || i >= this.f133425i.length) {
            StringBuilder sb = new StringBuilder("Invalid output Tensor index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        Tensor tensor = this.f133425i[i];
        if (tensor != null) {
            return tensor;
        }
        Tensor[] tensorArr = this.f133425i;
        Tensor a = Tensor.m114445a(this.f133418b, getOutputTensorIndex(this.f133418b, i));
        tensorArr[i] = a;
        return a;
    }

    /* renamed from: a */
    private void m114441a(int i, int[] iArr) {
        if (resizeInput(this.f133418b, this.f133417a, i, iArr)) {
            this.f133426j = false;
            if (this.f133424h[i] != null) {
                this.f133424h[i].mo113436b();
            }
        }
    }

    NativeInterpreterWrapper(ByteBuffer byteBuffer, C53807a aVar) {
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f133421e = byteBuffer;
        long createErrorReporter = createErrorReporter(UnReadVideoExperiment.LIKE_USER_LIST);
        m114442a(createErrorReporter, createModelWithBuffer(this.f133421e, createErrorReporter), aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo113431a(Object[] objArr, Map<Integer, Object> map) {
        this.f133420d = -1;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        } else if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Outputs should not be null or empty.");
        } else {
            for (int i = 0; i < objArr.length; i++) {
                int[] c = m114440a(i).mo113437c(objArr[i]);
                if (c != null) {
                    m114441a(i, c);
                }
            }
            boolean z = !this.f133426j;
            if (z) {
                allocateTensors(this.f133418b, this.f133417a);
                this.f133426j = true;
            }
            for (int i2 = 0; i2 < objArr.length; i2++) {
                m114440a(i2).mo113434a(objArr[i2]);
            }
            long nanoTime = System.nanoTime();
            run(this.f133418b, this.f133417a);
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (z) {
                for (int i3 = 0; i3 < this.f133425i.length; i3++) {
                    if (this.f133425i[i3] != null) {
                        this.f133425i[i3].mo113436b();
                    }
                }
            }
            for (Entry entry : map.entrySet()) {
                m114443b(((Integer) entry.getKey()).intValue()).mo113435b(entry.getValue());
            }
            this.f133420d = nanoTime2;
        }
    }

    /* renamed from: a */
    private void m114442a(long j, long j2, C53807a aVar) {
        if (aVar == null) {
            aVar = new C53807a();
        }
        this.f133417a = j;
        this.f133419c = j2;
        this.f133418b = createInterpreter(j2, j, aVar.f133435a);
        this.f133424h = new Tensor[getInputCount(this.f133418b)];
        this.f133425i = new Tensor[getOutputCount(this.f133418b)];
        if (aVar.f133436b != null) {
            useNNAPI(this.f133418b, aVar.f133436b.booleanValue());
        }
        if (aVar.f133437c != null) {
            allowFp16PrecisionForFp32(this.f133418b, aVar.f133437c.booleanValue());
        }
        if (aVar.f133438d != null) {
            allowBufferHandleOutput(this.f133418b, aVar.f133438d.booleanValue());
        }
        for (C53805b bVar : aVar.f133439e) {
            applyDelegate(this.f133418b, j, bVar.mo113439a());
            this.f133427k.add(bVar);
        }
        allocateTensors(this.f133418b, j);
        this.f133426j = true;
    }
}
