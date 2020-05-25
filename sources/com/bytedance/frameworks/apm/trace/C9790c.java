package com.bytedance.frameworks.apm.trace;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.p488k.C9075b;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.bytedance.frameworks.apm.trace.c */
public final class C9790c {

    /* renamed from: com.bytedance.frameworks.apm.trace.c$a */
    public interface C9792a {
        /* renamed from: a */
        void mo17629a(List<C9789b> list, int i);

        /* renamed from: a */
        boolean mo17630a(long j, int i);
    }

    /* renamed from: com.bytedance.frameworks.apm.trace.c$b */
    public static final class C9793b {

        /* renamed from: a */
        C9789b f26648a;

        /* renamed from: b */
        C9793b f26649b;

        /* renamed from: c */
        LinkedList<C9793b> f26650c = new LinkedList<>();

        /* renamed from: a */
        public final int mo17636a() {
            if (this.f26648a == null) {
                return 0;
            }
            return this.f26648a.f26646c;
        }

        /* renamed from: a */
        public final void mo17637a(C9793b bVar) {
            this.f26650c.addFirst(bVar);
        }

        C9793b(C9789b bVar, C9793b bVar2) {
            this.f26648a = bVar;
            this.f26649b = bVar2;
        }
    }

    /* renamed from: a */
    private static boolean m19597a(long j) {
        return ((j >> 63) & 1) == 1;
    }

    /* renamed from: b */
    private static long m19598b(long j) {
        return j & 8796093022207L;
    }

    /* renamed from: c */
    private static int m19599c(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19596a(long[] r18, java.util.LinkedList<com.bytedance.frameworks.apm.trace.C9789b> r19, boolean r20, long r21) {
        /*
            r0 = r18
            r1 = r19
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000e:
            r8 = 2
            r9 = 1
            if (r5 >= r3) goto L_0x0158
            r10 = r0[r5]
            r12 = 0
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x0152
            boolean r14 = m19597a(r10)
            r15 = 1048574(0xffffe, float:1.469365E-39)
            if (r14 == 0) goto L_0x002a
            int r14 = m19599c(r10)
            if (r15 != r14) goto L_0x002a
            r6 = 1
        L_0x002a:
            if (r6 != 0) goto L_0x0047
            java.lang.String r8 = "TraceDataUtils"
            java.lang.String r12 = "never begin! pass this method[%s]"
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r10 = m19599c(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r4] = r10
            com.bytedance.apm.k.b$a r10 = com.bytedance.apm.p488k.C9075b.f24804a
            if (r10 == 0) goto L_0x0152
            com.bytedance.apm.k.b$a r10 = com.bytedance.apm.p488k.C9075b.f24804a
            r10.mo16443a(r8, r12, r9)
            goto L_0x0152
        L_0x0047:
            boolean r14 = m19597a(r10)
            if (r14 == 0) goto L_0x0064
            int r8 = m19599c(r10)
            long r12 = (long) r8
            r14 = 1048574(0xffffe, double:5.180644E-318)
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x005a
            r7 = 0
        L_0x005a:
            int r7 = r7 + r9
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r2.push(r8)
            goto L_0x0152
        L_0x0064:
            int r14 = m19599c(r10)
            boolean r16 = r2.isEmpty()
            if (r16 != 0) goto L_0x013c
            java.lang.Object r16 = r2.pop()
            java.lang.Long r16 = (java.lang.Long) r16
            long r16 = r16.longValue()
            int r7 = r7 + -1
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            r12.push(r13)
        L_0x0086:
            int r13 = m19599c(r16)
            if (r13 == r14) goto L_0x00c9
            boolean r16 = r2.isEmpty()
            if (r16 != 0) goto L_0x00c9
            boolean r16 = com.bytedance.apm.C8976c.m17751g()
            if (r16 == 0) goto L_0x00af
            java.lang.String r15 = "TraceDataUtils"
            java.lang.String r9 = "pop inMethodId[%s] to continue match ouMethodId[%s]"
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r4] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r16 = 1
            r0[r16] = r13
            com.bytedance.apm.p488k.C9075b.m17974b(r15, r9, r0)
        L_0x00af:
            java.lang.Object r0 = r2.pop()
            java.lang.Long r0 = (java.lang.Long) r0
            long r16 = r0.longValue()
            int r7 = r7 + -1
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r12.push(r0)
            r0 = r18
            r9 = 1
            r15 = 1048574(0xffffe, float:1.469365E-39)
            goto L_0x0086
        L_0x00c9:
            if (r13 == r14) goto L_0x00f5
            r0 = 1048574(0xffffe, float:1.469365E-39)
            if (r13 != r0) goto L_0x00f5
            boolean r0 = com.bytedance.apm.C8976c.m17751g()
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "TraceDataUtils"
            java.lang.String r9 = "inMethodId[%s] != outMethodId[%s] throw this outMethodId!"
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r8[r4] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r11 = 1
            r8[r11] = r10
            com.bytedance.apm.p488k.C9075b.m17973a(r0, r9, r8)
        L_0x00ec:
            r2.addAll(r12)
            int r0 = r2.size()
            int r7 = r7 + r0
            goto L_0x0152
        L_0x00f5:
            long r8 = m19598b(r10)
        L_0x00f9:
            int r0 = r12.size()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r0 = r12.pop()
            java.lang.Long r0 = (java.lang.Long) r0
            long r10 = r0.longValue()
            long r10 = m19598b(r10)
            long r10 = r8 - r10
            r15 = 0
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
            boolean r0 = com.bytedance.apm.C8976c.m17751g()
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "TraceDataUtils"
            java.lang.String r3 = "[structuredDataToStack] trace during invalid:%d"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r5[r4] = r6
            com.bytedance.apm.p488k.C9075b.m17973a(r0, r3, r5)
        L_0x012b:
            r2.clear()
            r19.clear()
            return
        L_0x0132:
            com.bytedance.frameworks.apm.trace.b r0 = new com.bytedance.frameworks.apm.trace.b
            int r10 = (int) r10
            r0.<init>(r14, r10, r7)
            m19590a(r1, r0)
            goto L_0x00f9
        L_0x013c:
            boolean r0 = com.bytedance.apm.C8976c.m17751g()
            if (r0 == 0) goto L_0x0152
            java.lang.String r0 = "TraceDataUtils"
            java.lang.String r8 = "[structuredDataToStack] method[%s] not found in! "
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            r9[r4] = r10
            com.bytedance.apm.p488k.C9075b.m17974b(r0, r8, r9)
        L_0x0152:
            int r5 = r5 + 1
            r0 = r18
            goto L_0x000e
        L_0x0158:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01d6
            java.lang.Object r0 = r2.pop()
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            int r0 = m19599c(r5)
            boolean r3 = m19597a(r5)
            long r5 = m19598b(r5)
            long r9 = com.bytedance.frameworks.apm.trace.MethodCollector.f26606g
            long r5 = r5 + r9
            boolean r7 = com.bytedance.apm.C8976c.m17751g()
            if (r7 == 0) goto L_0x01ac
            java.lang.String r7 = "TraceDataUtils"
            java.lang.String r9 = "[structuredDataToStack] has never out method[%s], isIn:%s, inTime:%s, endTime:%s,rawData size:%s"
            r10 = 5
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10[r4] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r12 = 1
            r10[r12] = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r10[r8] = r11
            r11 = 3
            java.lang.Long r12 = java.lang.Long.valueOf(r21)
            r10[r11] = r12
            r11 = 4
            int r12 = r2.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r10[r11] = r12
            com.bytedance.apm.p488k.C9075b.m17974b(r7, r9, r10)
        L_0x01ac:
            if (r3 != 0) goto L_0x01c5
            boolean r3 = com.bytedance.apm.C8976c.m17751g()
            if (r3 == 0) goto L_0x0158
            java.lang.String r3 = "TraceDataUtils"
            java.lang.String r5 = "[structuredDataToStack] why has out Method[%s]? is wrong! "
            r7 = 1
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r4] = r0
            com.bytedance.apm.p488k.C9075b.m17973a(r3, r5, r6)
            goto L_0x0158
        L_0x01c5:
            r7 = 1
            com.bytedance.frameworks.apm.trace.b r3 = new com.bytedance.frameworks.apm.trace.b
            long r5 = r21 - r5
            int r5 = (int) r5
            int r6 = r2.size()
            r3.<init>(r0, r5, r6)
            m19590a(r1, r3)
            goto L_0x0158
        L_0x01d6:
            com.bytedance.frameworks.apm.trace.c$b r0 = new com.bytedance.frameworks.apm.trace.c$b
            r2 = 0
            r0.<init>(r2, r2)
            m19591a(r1, r0)
            r19.clear()
            m19594a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.apm.trace.C9790c.m19596a(long[], java.util.LinkedList, boolean, long):void");
    }

    /* renamed from: a */
    private static int m19590a(LinkedList<C9789b> linkedList, C9789b bVar) {
        C9789b bVar2;
        int i;
        if (!linkedList.isEmpty()) {
            bVar2 = (C9789b) linkedList.peek();
        } else {
            bVar2 = null;
        }
        if (bVar2 == null || bVar2.f26644a != bVar.f26644a || bVar2.f26646c != bVar.f26646c || bVar.f26646c == 0) {
            linkedList.push(bVar);
            return bVar.f26645b;
        }
        if (bVar.f26645b == 5000) {
            i = bVar2.f26645b;
        } else {
            i = bVar.f26645b;
        }
        bVar.f26645b = i;
        bVar2.mo17631a((long) bVar.f26645b);
        return bVar2.f26645b;
    }

    /* renamed from: a */
    private static int m19591a(LinkedList<C9789b> linkedList, C9793b bVar) {
        ListIterator listIterator = linkedList.listIterator(0);
        C9793b bVar2 = null;
        int i = 0;
        while (listIterator.hasNext()) {
            C9793b bVar3 = new C9793b((C9789b) listIterator.next(), bVar2);
            i++;
            if (bVar2 != null || bVar3.mo17636a() == 0) {
                int a = bVar3.mo17636a();
                if (bVar2 == null || a == 0) {
                    bVar.mo17637a(bVar3);
                } else if (bVar2.mo17636a() >= a) {
                    while (bVar2.mo17636a() > a) {
                        bVar2 = bVar2.f26649b;
                    }
                    if (bVar2.f26649b != null) {
                        bVar3.f26649b = bVar2.f26649b;
                        bVar2.f26649b.mo17637a(bVar3);
                    }
                } else if (bVar2.mo17636a() < a) {
                    bVar2.mo17637a(bVar3);
                }
                bVar2 = bVar3;
            } else {
                if (C8976c.m17751g()) {
                    C9075b.m17973a("TraceDataUtils", "[stackToTree] begin error! why the first node'depth is not 0!", new Object[0]);
                }
                return 0;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static String m19593a(List<C9789b> list, long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = (long) (((float) j) * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (C9789b bVar : list) {
            if (((long) bVar.f26645b) >= j2) {
                linkedList.add(bVar);
            }
        }
        Collections.sort(linkedList, new Comparator<C9789b>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                C9789b bVar = (C9789b) obj;
                C9789b bVar2 = (C9789b) obj2;
                return Integer.compare((bVar2.f26646c + 1) * bVar2.f26645b, (bVar.f26646c + 1) * bVar.f26645b);
            }
        });
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add((C9789b) list.get(0));
        } else if (linkedList.size() > 1 && ((C9789b) linkedList.peek()).f26644a == 1048574) {
            linkedList.removeFirst();
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            C9789b bVar2 = (C9789b) it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bVar2.f26644a);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m19594a(C9793b bVar, LinkedList<C9789b> linkedList) {
        for (int i = 0; i < bVar.f26650c.size(); i++) {
            C9793b bVar2 = (C9793b) bVar.f26650c.get(i);
            if (bVar2 != null) {
                linkedList.add(bVar2.f26648a);
                if (!bVar2.f26650c.isEmpty()) {
                    m19594a(bVar2, linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    public static long m19592a(LinkedList<C9789b> linkedList, StringBuilder sb, StringBuilder sb2) {
        Iterator it = linkedList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C9789b bVar = (C9789b) it.next();
            sb.append(bVar.toString());
            sb.append(10);
            if (j < ((long) bVar.f26645b)) {
                j = (long) bVar.f26645b;
            }
        }
        return j;
    }

    /* renamed from: a */
    public static void m19595a(List<C9789b> list, int i, C9792a aVar) {
        int size = list.size();
        int i2 = 1;
        while (size > 30) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (aVar.mo17630a((long) ((C9789b) listIterator.previous()).f26645b, i2)) {
                    listIterator.remove();
                    size--;
                    if (size <= 30) {
                        return;
                    }
                }
            }
            size = list.size();
            i2++;
            if (60 < i2) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > 30) {
            aVar.mo17629a(list, size2);
        }
    }
}
