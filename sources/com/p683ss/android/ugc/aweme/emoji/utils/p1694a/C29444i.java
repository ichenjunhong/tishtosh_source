package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.i */
final class C29444i implements C29456s {

    /* renamed from: a */
    private final char[] f77094a;

    /* renamed from: b */
    private final List<C29445a> f77095b;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.i$a */
    static final class C29445a implements Comparable<C29445a> {

        /* renamed from: a */
        public final char f77096a;

        /* renamed from: b */
        public final byte f77097b;

        public final int hashCode() {
            return this.f77096a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("0x");
            sb.append(Integer.toHexString(this.f77096a & 65535));
            sb.append("->0x");
            sb.append(Integer.toHexString(this.f77097b & 255));
            return sb.toString();
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.f77096a - ((C29445a) obj).f77096a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C29445a)) {
                return false;
            }
            C29445a aVar = (C29445a) obj;
            if (this.f77096a == aVar.f77096a && this.f77097b == aVar.f77097b) {
                return true;
            }
            return false;
        }

        C29445a(byte b, char c) {
            this.f77097b = b;
            this.f77096a = c;
        }
    }

    /* renamed from: a */
    public final String mo59514a(byte[] bArr) throws IOException {
        char c;
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (b >= 0) {
                c = (char) b;
            } else {
                c = this.f77094a[b + 128];
            }
            cArr[i] = c;
        }
        return new String(cArr);
    }

    C29444i(char[] cArr) {
        this.f77094a = (char[]) cArr.clone();
        ArrayList arrayList = new ArrayList(this.f77094a.length);
        byte b = Byte.MAX_VALUE;
        for (char aVar : this.f77094a) {
            b = (byte) (b + 1);
            arrayList.add(new C29445a(b, aVar));
        }
        Collections.sort(arrayList);
        this.f77095b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private C29445a m69446a(char c) {
        int size = this.f77095b.size();
        int i = 0;
        while (size > i) {
            int i2 = ((size - i) / 2) + i;
            C29445a aVar = (C29445a) this.f77095b.get(i2);
            if (aVar.f77096a == c) {
                return aVar;
            }
            if (aVar.f77096a < c) {
                i = i2 + 1;
            } else {
                size = i2;
            }
        }
        if (i >= this.f77095b.size()) {
            return null;
        }
        C29445a aVar2 = (C29445a) this.f77095b.get(i);
        if (aVar2.f77096a != c) {
            return null;
        }
        return aVar2;
    }

    /* renamed from: a */
    public final boolean mo59515a(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i);
            if ((charAt < 0 || charAt >= 128) && m69446a(charAt) == null) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer mo59516b(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.length()
            r1 = 6
            int r0 = r0 + r1
            int r2 = r8.length()
            r3 = 1
            int r2 = r2 + r3
            int r2 = r2 / 2
            int r0 = r0 + r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2 = 0
            r4 = r0
            r0 = 0
        L_0x0016:
            int r5 = r8.length()
            if (r0 >= r5) goto L_0x0051
            char r5 = r8.charAt(r0)
            int r6 = r4.remaining()
            if (r6 >= r1) goto L_0x002f
            int r6 = r4.position()
            int r6 = r6 + r1
            java.nio.ByteBuffer r4 = com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29457t.m69485a(r4, r6)
        L_0x002f:
            if (r5 < 0) goto L_0x003b
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L_0x003b
            byte r6 = (byte) r5
            r4.put(r6)
        L_0x0039:
            r6 = 1
            goto L_0x0049
        L_0x003b:
            com.ss.android.ugc.aweme.emoji.utils.a.i$a r6 = r7.m69446a(r5)
            if (r6 != 0) goto L_0x0043
            r6 = 0
            goto L_0x0049
        L_0x0043:
            byte r6 = r6.f77097b
            r4.put(r6)
            goto L_0x0039
        L_0x0049:
            if (r6 != 0) goto L_0x004e
            com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29457t.m69486a(r4, r5)
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0016
        L_0x0051:
            int r8 = r4.position()
            r4.limit(r8)
            r4.rewind()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.emoji.utils.p1694a.C29444i.mo59516b(java.lang.String):java.nio.ByteBuffer");
    }
}
