package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.t */
public abstract class C29457t {

    /* renamed from: a */
    static final C29456s f77119a = new C29440e("UTF8");

    /* renamed from: b */
    private static final Map<String, C29458a> f77120b;

    /* renamed from: c */
    private static final byte[] f77121c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.t$a */
    static class C29458a {

        /* renamed from: a */
        private final char[] f77122a;

        /* renamed from: b */
        private C29444i f77123b;

        /* renamed from: a */
        public final synchronized C29444i mo59532a() {
            if (this.f77123b == null) {
                this.f77123b = new C29444i(this.f77122a);
            }
            return this.f77123b;
        }

        C29458a(char[] cArr) {
            this.f77122a = cArr;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        C29458a aVar = new C29458a(new char[]{199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, 162, 163, 165, 8359, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 8976, 172, 189, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 9569, 9570, 9558, 9557, 9571, 9553, 9559, 9565, 9564, 9563, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 9566, 9567, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 9575, 9576, 9572, 9573, 9561, 9560, 9554, 9555, 9579, 9578, 9496, 9484, 9608, 9604, 9612, 9616, 9600, 945, 223, 915, 960, 931, 963, 181, 964, 934, 920, 937, 948, 8734, 966, 949, 8745, 8801, 177, 8805, 8804, 8992, 8993, 247, 8776, 176, 8729, 183, 8730, 8319, 178, 9632, 160});
        hashMap.put("CP437", aVar);
        hashMap.put("Cp437", aVar);
        hashMap.put("cp437", aVar);
        hashMap.put("IBM437", aVar);
        hashMap.put("ibm437", aVar);
        C29458a aVar2 = new C29458a(new char[]{199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, 248, 163, 216, 215, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 174, 172, 189, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 193, 194, 192, 169, 9571, 9553, 9559, 9565, 162, 165, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 227, 195, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 164, 240, 208, 202, 203, 200, 305, 205, 206, 207, 9496, 9484, 9608, 9604, 166, 204, 9600, 211, 223, 212, 210, 245, 213, 181, 254, 222, 218, 219, 217, 253, 221, 175, 180, 173, 177, 8215, 190, 182, 167, 247, 184, 176, 168, 183, 185, 179, 178, 9632, 160});
        hashMap.put("CP850", aVar2);
        hashMap.put("Cp850", aVar2);
        hashMap.put("cp850", aVar2);
        hashMap.put("IBM850", aVar2);
        hashMap.put("ibm850", aVar2);
        f77120b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static C29456s m69484a(String str) {
        String str2;
        boolean z;
        if (str == null) {
            str2 = System.getProperty("file.encoding");
        } else {
            str2 = str;
        }
        if ("UTF8".equalsIgnoreCase(str2) || "utf-8".equalsIgnoreCase(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f77119a;
        }
        if (str == null) {
            return new C29440e();
        }
        C29458a aVar = (C29458a) f77120b.get(str);
        if (aVar != null) {
            return aVar.mo59532a();
        }
        try {
            return new C29443h(Charset.forName(str));
        } catch (UnsupportedCharsetException unused) {
            return new C29440e(str);
        }
    }

    /* renamed from: a */
    static ByteBuffer m69485a(ByteBuffer byteBuffer, int i) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        int capacity = byteBuffer.capacity() * 2;
        if (capacity >= i) {
            i = capacity;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.put(byteBuffer);
        return allocate;
    }

    /* renamed from: a */
    static void m69486a(ByteBuffer byteBuffer, char c) {
        byteBuffer.put(37);
        byteBuffer.put(85);
        byteBuffer.put(f77121c[(c >> 12) & 15]);
        byteBuffer.put(f77121c[(c >> 8) & 15]);
        byteBuffer.put(f77121c[(c >> 4) & 15]);
        byteBuffer.put(f77121c[c & 15]);
    }
}
