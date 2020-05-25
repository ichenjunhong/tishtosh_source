package com.p904e.p905a;

import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.e.a.b */
public final class C13458b {

    /* renamed from: a */
    public static Map<C13459a, Class> f35050a;

    /* renamed from: com.e.a.b$a */
    public enum C13459a {
        VIDEO_END("org.quic.camera.recording.endOfStream");
        

        /* renamed from: a */
        private final String f35052a;

        public final String toString() {
            return this.f35052a;
        }

        public final <T> Key<T> toCaptureRequestKey() {
            return C13461d.m27127a(this.f35052a, (Class) C13458b.f35050a.get(this));
        }

        public final <T> CaptureResult.Key<T> toCaptureResultKey() {
            return C13461d.m27128b(this.f35052a, (Class) C13458b.f35050a.get(this));
        }

        private C13459a(String str) {
            this.f35052a = str;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f35050a = hashMap;
        hashMap.put(C13459a.VIDEO_END, Byte.TYPE);
    }
}
