package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: org.tensorflow.lite.c */
public final class C53806c implements AutoCloseable {

    /* renamed from: a */
    NativeInterpreterWrapper f133434a;

    /* renamed from: org.tensorflow.lite.c$a */
    public static class C53807a {

        /* renamed from: a */
        public int f133435a = -1;

        /* renamed from: b */
        public Boolean f133436b;

        /* renamed from: c */
        Boolean f133437c;

        /* renamed from: d */
        Boolean f133438d;

        /* renamed from: e */
        final List<C53805b> f133439e = new ArrayList();
    }

    /* renamed from: a */
    private void m114464a() {
        if (this.f133434a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public final void close() {
        if (this.f133434a != null) {
            this.f133434a.close();
            this.f133434a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public C53806c(ByteBuffer byteBuffer, C53807a aVar) {
        this.f133434a = new NativeInterpreterWrapper(byteBuffer, aVar);
    }

    /* renamed from: a */
    private void m114465a(Object[] objArr, Map<Integer, Object> map) {
        m114464a();
        this.f133434a.mo113431a(objArr, map);
    }

    /* renamed from: a */
    public final void mo113440a(Object obj, Object obj2) {
        Object[] objArr = {obj};
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), obj2);
        m114465a(objArr, (Map<Integer, Object>) hashMap);
    }
}
