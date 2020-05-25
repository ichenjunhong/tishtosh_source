package com.bytedance.liko.leakdetector.strategy.p776fd;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.liko.leakdetector.C12279a;
import com.bytedance.liko.p771a.C12265a;
import com.bytedance.liko.p771a.C12266b;
import com.bytedance.liko.p771a.C12268d;
import com.bytedance.liko.p772b.C12269a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector */
public final class FdLeakDetector {
    public static final FdLeakDetector INSTANCE = new FdLeakDetector();
    private static Handler handler;
    private static final HandlerThread handlerThread = new HandlerThread("FdLeakThread");
    private static volatile boolean hasInstalled;

    /* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector$a */
    public static final class C12289a extends Handler {

        /* renamed from: a */
        final /* synthetic */ FdLeakDetector f32411a;

        public final void handleMessage(Message message) {
            FdLeakDetector.INSTANCE.dumpFdAndReport();
            sendEmptyMessageDelayed(0, C12265a.m24743d());
        }

        C12289a(FdLeakDetector fdLeakDetector, Looper looper) {
            this.f32411a = fdLeakDetector;
            super(looper);
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector$b */
    public static final class C12290b<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f32412a;

        public C12290b(Map map) {
            this.f32412a = map;
        }

        public final int compare(T t, T t2) {
            int i;
            Integer num = (Integer) this.f32412a.get((String) t2);
            int i2 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Comparable valueOf = Integer.valueOf(i);
            Integer num2 = (Integer) this.f32412a.get((String) t);
            if (num2 != null) {
                i2 = num2.intValue();
            }
            return C52594a.m112153a(valueOf, Integer.valueOf(i2));
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector$c */
    public static final class C12291c<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Map f32413a;

        public C12291c(Map map) {
            this.f32413a = map;
        }

        public final int compare(T t, T t2) {
            int i;
            Integer num = (Integer) this.f32413a.get(FdLeakDetector.INSTANCE.getTag((String) t2));
            int i2 = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Comparable valueOf = Integer.valueOf(i);
            Integer num2 = (Integer) this.f32413a.get(FdLeakDetector.INSTANCE.getTag((String) t));
            if (num2 != null) {
                i2 = num2.intValue();
            }
            return C52594a.m112153a(valueOf, Integer.valueOf(i2));
        }
    }

    private FdLeakDetector() {
    }

    public final void dumpFdAndReport() {
        if (C12265a.m24739a()) {
            List a = C12269a.m24750a();
            StringBuilder sb = new StringBuilder("found ");
            sb.append(a.size());
            sb.append(" fd");
            C12279a.m24757a(sb.toString());
            parse(a);
        }
    }

    public final void install() {
        if (!hasInstalled) {
            handlerThread.start();
            Handler aVar = new C12289a(this, handlerThread.getLooper());
            handler = aVar;
            aVar.sendEmptyMessageDelayed(0, C12265a.m24743d());
            hasInstalled = true;
        }
    }

    public final String getTag(String str) {
        C52711k.m112240b(str, "fd");
        CharSequence charSequence = str;
        if (C52830p.m112456b(charSequence, (CharSequence) ":", false, 2, (Object) null)) {
            return (String) C52830p.m112452b(charSequence, new String[]{":"}, false, 0, 6, (Object) null).get(0);
        } else if (!C52830p.m112456b(charSequence, (CharSequence) "/", false, 2, (Object) null)) {
            return str;
        } else {
            String substring = str.substring(0, C52830p.m112446b(charSequence, "/", 0, false, 6, (Object) null));
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005e, code lost:
        if (r6 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void parse(java.util.List<java.lang.String> r10) {
        /*
            r9 = this;
            int r0 = r10.size()
            int r1 = com.bytedance.liko.p771a.C12265a.m24740b()
            if (r0 >= r1) goto L_0x0015
            int r0 = r10.size()
            int r1 = com.bytedance.liko.p771a.C12265a.m24742c()
            if (r0 >= r1) goto L_0x0015
            return
        L_0x0015:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Set r2 = (java.util.Set) r2
            r3 = r10
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0088
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.add(r4)
            com.bytedance.liko.leakdetector.strategy.fd.FdLeakDetector r5 = INSTANCE
            java.lang.String r5 = r5.getTag(r4)
            java.lang.Object r6 = r0.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = 1
            if (r6 == 0) goto L_0x0060
            r8 = r6
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r8 = r8 + r7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r5, r8)
            if (r6 != 0) goto L_0x0067
        L_0x0060:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r0.put(r5, r6)
        L_0x0067:
            java.lang.Object r5 = r1.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0080
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.put(r4, r6)
            if (r5 != 0) goto L_0x0031
        L_0x0080:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r1.put(r4, r5)
            goto L_0x0031
        L_0x0088:
            java.util.Set r3 = r1.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x009b
            r3 = 0
            r4 = r3
            goto L_0x00ce
        L_0x009b:
            java.lang.Object r4 = r3.next()
            boolean r5 = r3.hasNext()
            if (r5 != 0) goto L_0x00a6
            goto L_0x00ce
        L_0x00a6:
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L_0x00b3:
            java.lang.Object r6 = r3.next()
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 >= r7) goto L_0x00c8
            r4 = r6
            r5 = r7
        L_0x00c8:
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto L_0x00b3
        L_0x00ce:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x00e6
            java.lang.Object r3 = r4.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r5 = com.bytedance.liko.p771a.C12265a.m24742c()
            if (r3 < r5) goto L_0x00e6
            r9.parseSingle(r2, r1, r4)
            return
        L_0x00e6:
            int r3 = r10.size()
            int r4 = com.bytedance.liko.p771a.C12265a.m24740b()
            if (r3 < r4) goto L_0x00f3
            r9.parseTotal(r10, r2, r1, r0)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.strategy.p776fd.FdLeakDetector.parse(java.util.List):void");
    }

    private final void report(List<String> list, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("FdLeakWarning: ");
        sb.append(str);
        sb.append(10);
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder("at ");
        sb2.append(getClass().getName());
        sb2.append(".INSTANCE (FdLeakDetector.java:0)\n");
        stringBuffer.append(sb2.toString());
        for (String str2 : list) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(10);
            stringBuffer.append(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder("start report \n");
        sb4.append(stringBuffer);
        C12279a.m24757a(sb4.toString());
        C12266b bVar = C12268d.f32378a;
        if (bVar != null) {
            bVar.mo23186a(stringBuffer.toString());
        } else {
            C12279a.m24757a("reporter is null");
        }
    }

    private final void parseSingle(Set<String> set, Map<String, Integer> map, Entry<String, Integer> entry) {
        Iterable<String> a = C52575l.m112122a((Iterable<? extends T>) C52575l.m112138e((Iterable<? extends T>) set), (Comparator<? super T>) new C12290b<Object>(map));
        Collection arrayList = new ArrayList(C52575l.m112104a(a, 10));
        for (String str : a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            sb.append((Integer) map.get(str));
            sb.append(')');
            arrayList.add(sb.toString());
        }
        List list = (List) arrayList;
        StringBuilder sb2 = new StringBuilder("found more than ");
        sb2.append(C12265a.m24742c());
        sb2.append(" fd(");
        sb2.append(((Number) entry.getValue()).intValue());
        sb2.append(") by single count with max fd:");
        sb2.append((String) entry.getKey());
        report(list, sb2.toString());
    }

    private final void parseTotal(List<String> list, Set<String> set, Map<String, Integer> map, Map<String, Integer> map2) {
        Object obj;
        Iterable<String> a = C52575l.m112122a((Iterable<? extends T>) C52575l.m112138e((Iterable<? extends T>) set), (Comparator<? super T>) new C12291c<Object>(map2));
        Collection arrayList = new ArrayList(C52575l.m112104a(a, 10));
        for (String str : a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('(');
            sb.append((Integer) map.get(str));
            sb.append(')');
            arrayList.add(sb.toString());
        }
        List list2 = (List) arrayList;
        StringBuilder sb2 = new StringBuilder("found more than ");
        sb2.append(C12265a.m24740b());
        sb2.append(" fd(");
        sb2.append(list.size());
        sb2.append(") by total count with max fd:");
        Iterator it = map2.entrySet().iterator();
        String str2 = null;
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Entry) obj).getValue()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((Entry) next).getValue()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        Entry entry = (Entry) obj;
        if (entry != null) {
            str2 = (String) entry.getKey();
        }
        sb2.append(str2);
        report(list2, sb2.toString());
    }
}
