package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;

public final class bhr {

    /* renamed from: a */
    private static final HashMap<C15722a, Pair<String, CodecCapabilities>> f42437a = new HashMap<>();

    /* renamed from: com.google.android.gms.internal.ads.bhr$a */
    static final class C15722a {

        /* renamed from: a */
        public final String f42438a;

        /* renamed from: b */
        public final boolean f42439b;

        public C15722a(String str, boolean z) {
            this.f42438a = str;
            this.f42439b = z;
        }

        public final int hashCode() {
            return (((this.f42438a == null ? 0 : this.f42438a.hashCode()) + 31) * 31) + (this.f42439b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C15722a.class) {
                return false;
            }
            C15722a aVar = (C15722a) obj;
            return TextUtils.equals(this.f42438a, aVar.f42438a) && this.f42439b == aVar.f42439b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized android.util.Pair<java.lang.String, android.media.MediaCodecInfo.CodecCapabilities> m35728a(java.lang.String r4, boolean r5) throws com.google.android.gms.internal.ads.bht {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.bhr> r0 = com.google.android.gms.internal.ads.bhr.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bhr$a r1 = new com.google.android.gms.internal.ads.bhr$a     // Catch:{ all -> 0x0043 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0043 }
            java.util.HashMap<com.google.android.gms.internal.ads.bhr$a, android.util.Pair<java.lang.String, android.media.MediaCodecInfo$CodecCapabilities>> r4 = f42437a     // Catch:{ all -> 0x0043 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x001a
            java.util.HashMap<com.google.android.gms.internal.ads.bhr$a, android.util.Pair<java.lang.String, android.media.MediaCodecInfo$CodecCapabilities>> r4 = f42437a     // Catch:{ all -> 0x0043 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0043 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r4
        L_0x001a:
            int r4 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ all -> 0x0043 }
            r2 = 0
            r3 = 21
            if (r4 < r3) goto L_0x0027
            com.google.android.gms.internal.ads.bhx r4 = new com.google.android.gms.internal.ads.bhx     // Catch:{ all -> 0x0043 }
            r4.<init>(r5)     // Catch:{ all -> 0x0043 }
            goto L_0x002c
        L_0x0027:
            com.google.android.gms.internal.ads.bhw r4 = new com.google.android.gms.internal.ads.bhw     // Catch:{ all -> 0x0043 }
            r4.<init>()     // Catch:{ all -> 0x0043 }
        L_0x002c:
            android.util.Pair r4 = m35727a(r1, r4)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0041
            if (r4 != 0) goto L_0x0041
            int r5 = com.google.android.gms.internal.ads.blp.f42854a     // Catch:{ all -> 0x0043 }
            if (r5 < r3) goto L_0x0041
            com.google.android.gms.internal.ads.bhw r4 = new com.google.android.gms.internal.ads.bhw     // Catch:{ all -> 0x0043 }
            r4.<init>()     // Catch:{ all -> 0x0043 }
            android.util.Pair r4 = m35727a(r1, r4)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)
            return r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bhr.m35728a(java.lang.String, boolean):android.util.Pair");
    }

    /* renamed from: a */
    private static Pair<String, CodecCapabilities> m35727a(C15722a aVar, bhu bhu) throws bht {
        C15722a aVar2 = aVar;
        bhu bhu2 = bhu;
        try {
            String str = aVar2.f42438a;
            int a = bhu.mo30211a();
            boolean b = bhu.mo30214b();
            boolean z = false;
            int i = 0;
            while (i < a) {
                MediaCodecInfo a2 = bhu2.mo30212a(i);
                String name = a2.getName();
                if (!a2.isEncoder() && name.startsWith("OMX.") && (b || !name.endsWith(".secure"))) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int i2 = 0;
                    while (i2 < supportedTypes.length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str2);
                            boolean a3 = bhu2.mo30213a(aVar2.f42438a, capabilitiesForType);
                            if (!b) {
                                f42437a.put(aVar2.f42439b ? new C15722a(str, z) : aVar2, Pair.create(name, capabilitiesForType));
                                if (a3) {
                                    f42437a.put(aVar2.f42439b ? aVar2 : new C15722a(str, true), Pair.create(String.valueOf(name).concat(".secure"), capabilitiesForType));
                                }
                            } else {
                                f42437a.put(aVar2.f42439b == a3 ? aVar2 : new C15722a(str, a3), Pair.create(name, capabilitiesForType));
                            }
                            if (f42437a.containsKey(aVar2)) {
                                return (Pair) f42437a.get(aVar2);
                            }
                        }
                        i2++;
                        z = false;
                    }
                    continue;
                }
                i++;
                z = false;
            }
            return null;
        } catch (Exception e) {
            throw new bht(e);
        }
    }
}
