package com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b;

import android.os.Build.VERSION;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48526d;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48530a.C48531a;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48538d.C48540a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.d.a.a.a.b.c */
public final class C48534c extends C48530a {

    /* renamed from: e */
    public C48542e f121984e;

    /* renamed from: com.ss.android.ugc.d.a.a.a.b.c$a */
    public static class C48536a extends C48531a {
        /* renamed from: a */
        public final C48542e mo96023a() {
            C48534c cVar = new C48534c(this.f121978a);
            C48542e a = new C48540a(this.f121978a).mo96022a(this.f121979b).mo96024b(this.f121980c).mo96021a(this.f121981d).mo96023a();
            a.mo96017a(this.f121979b);
            a.mo96018b(this.f121980c);
            a.mo96016a(this.f121981d);
            cVar.f121984e = a;
            return cVar;
        }

        public C48536a(C48526d dVar) {
            super(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.d.a.a.a.b.c$b */
    public static class C48537b {

        /* renamed from: a */
        public Map<String, Object> f121985a = new HashMap();

        /* renamed from: a */
        public final Map<String, Object> mo96028a() {
            try {
                int indexOf = VERSION.RELEASE.indexOf(ClassUtils.PACKAGE_SEPARATOR);
                if (indexOf < 0) {
                    indexOf = VERSION.RELEASE.length();
                }
                m104992f(Integer.valueOf(VERSION.RELEASE.substring(0, indexOf)).intValue());
            } catch (NumberFormatException unused) {
                m104992f(0);
            }
            return this.f121985a;
        }

        /* renamed from: f */
        private C48537b m104992f(int i) {
            this.f121985a.put("os_ver", Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C48537b mo96026a(int i) {
            this.f121985a.put("tcp_rtt", Integer.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C48537b mo96029b(int i) {
            this.f121985a.put("tcp_bandwith", Integer.valueOf(i));
            return this;
        }

        /* renamed from: c */
        public final C48537b mo96031c(int i) {
            this.f121985a.put("http_rtt", Integer.valueOf(i));
            return this;
        }

        /* renamed from: d */
        public final C48537b mo96033d(int i) {
            this.f121985a.put("signal", Integer.valueOf(i));
            return this;
        }

        /* renamed from: e */
        public final C48537b mo96035e(int i) {
            this.f121985a.put("carrier", Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public final C48537b mo96027a(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (list == null) {
                return this;
            }
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            Map<String, Object> map = this.f121985a;
            String str = "internet_speed_0";
            int i4 = i / 8000;
            if (i4 < 0) {
                i4 = 0;
            }
            map.put(str, Integer.valueOf(i4));
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            Map<String, Object> map2 = this.f121985a;
            String str2 = "internet_speed_1";
            int i5 = i2 / 8000;
            if (i5 < 0) {
                i5 = 0;
            }
            map2.put(str2, Integer.valueOf(i5));
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            } else {
                i3 = 0;
            }
            Map<String, Object> map3 = this.f121985a;
            String str3 = "internet_speed_2";
            int i6 = i3 / 8000;
            if (i6 < 0) {
                i6 = 0;
            }
            map3.put(str3, Integer.valueOf(i6));
            return this;
        }

        /* renamed from: b */
        public final C48537b mo96030b(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f121985a;
            String str = "block_cnt_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f121985a;
            String str2 = "block_cnt_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f121985a;
            String str3 = "block_cnt_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }

        /* renamed from: c */
        public final C48537b mo96032c(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f121985a;
            String str = "block_time_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f121985a;
            String str2 = "block_time_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f121985a;
            String str3 = "block_time_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }

        /* renamed from: d */
        public final C48537b mo96034d(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f121985a;
            String str = "video_bitrate_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f121985a;
            String str2 = "video_bitrate_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f121985a;
            String str3 = "video_bitrate_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }

        /* renamed from: e */
        public final C48537b mo96036e(List<Integer> list) {
            int i;
            int i2;
            if (list == null) {
                return this;
            }
            Map<String, Object> map = this.f121985a;
            String str = "play_time_0";
            int i3 = 0;
            if (list.size() > 0) {
                i = ((Integer) list.get(0)).intValue();
            } else {
                i = 0;
            }
            map.put(str, Integer.valueOf(i));
            Map<String, Object> map2 = this.f121985a;
            String str2 = "play_time_1";
            if (list.size() >= 2) {
                i2 = ((Integer) list.get(1)).intValue();
            } else {
                i2 = 0;
            }
            map2.put(str2, Integer.valueOf(i2));
            Map<String, Object> map3 = this.f121985a;
            String str3 = "play_time_2";
            if (list.size() >= 3) {
                i3 = ((Integer) list.get(2)).intValue();
            }
            map3.put(str3, Integer.valueOf(i3));
            return this;
        }
    }

    private C48534c(C48526d dVar) {
        super(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0172  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48528f mo96025a(java.util.List<? extends com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c> r20, java.util.Map<java.lang.String, java.lang.Object> r21) {
        /*
            r19 = this;
            r7 = r21
            com.ss.android.ugc.d.a.a.a.a.f r8 = new com.ss.android.ugc.d.a.a.a.a.f
            r8.<init>()
            r9 = 0
            if (r20 == 0) goto L_0x0179
            boolean r1 = r20.isEmpty()
            if (r1 == 0) goto L_0x0012
            goto L_0x0179
        L_0x0012:
            java.util.List r10 = r19.mo96019c(r20)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.d.a.a.a.b r0 = new com.ss.android.ugc.d.a.a.a.b
            r1 = 5
            java.lang.String r2 = "Intersection bitrate list is empty."
            r0.<init>(r1, r2)
            r8.f121969b = r0
            return r8
        L_0x0027:
            r11 = 1
            com.ss.android.ugc.d.a.a.a.b.b r0 = com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48532b.C48533a.f121983a     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ml.e r0 = r0.f121982a     // Catch:{ Throwable -> 0x0140 }
            if (r0 != 0) goto L_0x0030
        L_0x002e:
            goto L_0x014e
        L_0x0030:
            boolean r1 = r0.mo40665b()     // Catch:{ Throwable -> 0x0140 }
            if (r1 == 0) goto L_0x014e
            boolean r1 = r0.mo40670f()     // Catch:{ Throwable -> 0x0140 }
            if (r1 != 0) goto L_0x003e
            goto L_0x014e
        L_0x003e:
            java.lang.String r1 = "cache_size_list"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ Throwable -> 0x0140 }
            r13 = r1
            java.util.List r13 = (java.util.List) r13     // Catch:{ Throwable -> 0x0140 }
            if (r13 != 0) goto L_0x004a
            goto L_0x002e
        L_0x004a:
            java.lang.String r1 = "internet_speed"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ Throwable -> 0x0140 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x0140 }
            int r14 = r1.intValue()     // Catch:{ Throwable -> 0x0140 }
            if (r14 > 0) goto L_0x0059
            goto L_0x002e
        L_0x0059:
            java.lang.String r1 = "internet_speed_0"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ Throwable -> 0x0140 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x0140 }
            int r15 = r1.intValue()     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r1 = "internet_speed_1"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ Throwable -> 0x0140 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x0140 }
            int r6 = r1.intValue()     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r1 = "internet_speed_2"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ Throwable -> 0x0140 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Throwable -> 0x0140 }
            int r5 = r1.intValue()     // Catch:{ Throwable -> 0x0140 }
            r4 = 0
        L_0x007e:
            int r1 = r10.size()     // Catch:{ Throwable -> 0x0140 }
            if (r4 >= r1) goto L_0x0133
            java.lang.Object r1 = r10.get(r4)     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ugc.d.a.a.a.a.c r1 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c) r1     // Catch:{ Throwable -> 0x0140 }
            int r1 = r1.getBitRate()     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "video_bitrate"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0140 }
            r7.put(r2, r3)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "cache_size"
            int r3 = r13.size()     // Catch:{ Throwable -> 0x0140 }
            int r3 = r3 - r11
            if (r3 < r4) goto L_0x00ab
            java.lang.Object r3 = r13.get(r4)     // Catch:{ Throwable -> 0x0140 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Throwable -> 0x0140 }
            int r3 = r3.intValue()     // Catch:{ Throwable -> 0x0140 }
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x0140 }
            r7.put(r2, r3)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "bitrate_speed"
            float r1 = (float) r1     // Catch:{ Throwable -> 0x0140 }
            float r3 = (float) r14     // Catch:{ Throwable -> 0x0140 }
            r16 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r16
            float r3 = r1 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Throwable -> 0x0140 }
            r7.put(r2, r3)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "bitrate_speed_0"
            float r3 = (float) r15     // Catch:{ Throwable -> 0x0140 }
            float r3 = r3 + r16
            float r3 = r1 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Throwable -> 0x0140 }
            r7.put(r2, r3)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "bitrate_speed_1"
            float r3 = (float) r6     // Catch:{ Throwable -> 0x0140 }
            float r3 = r3 + r16
            float r3 = r1 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Throwable -> 0x0140 }
            r7.put(r2, r3)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "bitrate_speed_2"
            float r3 = (float) r5     // Catch:{ Throwable -> 0x0140 }
            float r3 = r3 + r16
            float r1 = r1 / r3
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ Throwable -> 0x0140 }
            r7.put(r2, r1)     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ml.d r1 = r0.f53850c     // Catch:{ Throwable -> 0x0140 }
            java.util.List r3 = r0.mo40667c()     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ml.process.a r16 = r0.mo40668d()     // Catch:{ Throwable -> 0x0140 }
            java.util.List r17 = r0.mo40669e()     // Catch:{ Throwable -> 0x0140 }
            r18 = 0
            r2 = r21
            r12 = r4
            r4 = r16
            r16 = r5
            r5 = r17
            r17 = r6
            r6 = r18
            java.util.List r1 = r1.mo40659a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0140 }
            if (r1 == 0) goto L_0x012b
            int r2 = r1.size()     // Catch:{ Throwable -> 0x0140 }
            if (r2 <= 0) goto L_0x012b
            java.lang.Object r1 = r1.get(r9)     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x0140 }
            java.lang.String r2 = "true"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch:{ Throwable -> 0x0140 }
            if (r1 == 0) goto L_0x012b
            java.lang.Object r0 = r10.get(r12)     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ugc.d.a.a.a.a.c r0 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c) r0     // Catch:{ Throwable -> 0x0140 }
            goto L_0x013e
        L_0x012b:
            int r4 = r12 + 1
            r5 = r16
            r6 = r17
            goto L_0x007e
        L_0x0133:
            int r0 = r10.size()     // Catch:{ Throwable -> 0x0140 }
            int r0 = r0 - r11
            java.lang.Object r0 = r10.get(r0)     // Catch:{ Throwable -> 0x0140 }
            com.ss.android.ugc.d.a.a.a.a.c r0 = (com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c) r0     // Catch:{ Throwable -> 0x0140 }
        L_0x013e:
            r12 = r0
            goto L_0x014f
        L_0x0140:
            r0 = move-exception
            com.ss.android.ugc.d.a.a.a.b r1 = new com.ss.android.ugc.d.a.a.a.b
            r2 = 9
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r0)
            r8.f121969b = r1
        L_0x014e:
            r12 = 0
        L_0x014f:
            if (r12 != 0) goto L_0x0172
            java.lang.String r0 = "internet_speed"
            java.lang.Object r0 = r7.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r19
            com.ss.android.ugc.d.a.a.a.b.e r2 = r1.f121984e
            com.ss.android.ugc.d.a.a.a.b.d$b r3 = com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48538d.C48541b.m105007a()
            com.ss.android.ugc.d.a.a.a.b.d$b r0 = r3.mo96037a(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f121987a
            com.ss.android.ugc.d.a.a.a.a.f r8 = r2.mo96025a(r10, r0)
            r8.f121970c = r9
            goto L_0x0178
        L_0x0172:
            r1 = r19
            r8.f121968a = r12
            r8.f121970c = r11
        L_0x0178:
            return r8
        L_0x0179:
            r1 = r19
            com.ss.android.ugc.d.a.a.a.b r0 = new com.ss.android.ugc.d.a.a.a.b
            java.lang.String r2 = "bitrate list is empty..."
            r0.<init>(r9, r2)
            r8.f121969b = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2424b.C48534c.mo96025a(java.util.List, java.util.Map):com.ss.android.ugc.d.a.a.a.a.f");
    }
}
