package com.bytedance.android.livesdk.p392l;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.l.c */
public final class C7736c {

    /* renamed from: a */
    private ConcurrentHashMap<Integer, C7734a> f21266a;

    /* renamed from: b */
    private ConcurrentHashMap<Integer, Integer> f21267b;

    /* renamed from: c */
    private ConcurrentHashMap<Integer, Integer> f21268c;

    /* renamed from: d */
    private int[][] f21269d;

    /* renamed from: e */
    private Handler f21270e;

    /* renamed from: f */
    private C7734a f21271f;

    /* renamed from: g */
    private Thread f21272g;

    /* renamed from: com.bytedance.android.livesdk.l.c$1 */
    class C77371 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7734a f21273a;

        /* renamed from: b */
        final /* synthetic */ Thread f21274b;

        public final void run() {
            this.f21273a.start();
            this.f21274b.notify();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.l.c$a */
    protected static class C7738a {

        /* renamed from: a */
        public static C7736c f21275a = new C7736c(null);
    }

    /* renamed from: a */
    public static C7736c m15763a() {
        return C7738a.f21275a;
    }

    private C7736c() {
        this.f21266a = new ConcurrentHashMap<>();
        this.f21267b = new ConcurrentHashMap<>();
        this.f21268c = new ConcurrentHashMap<>();
        this.f21270e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo14083b() {
        if (this.f21271f == null) {
            this.f21271f = m15767e();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m15765c();
        } else if (this.f21272g == null) {
            m15766d();
        }
    }

    /* renamed from: c */
    private void m15765c() {
        if (this.f21271f != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            for (C7734a aVar = this.f21271f; aVar != null; aVar = aVar.mNextTask) {
                boolean z = true;
                Iterator it = aVar.preTasks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) it.next();
                    if (num.intValue() != aVar.getTaskId() && !((C7734a) this.f21266a.get(num)).isFinished()) {
                        z = false;
                        break;
                    }
                }
                if (z && aVar.isIDLE()) {
                    aVar.start();
                }
            }
        }
    }

    /* renamed from: d */
    private void m15766d() {
        if (this.f21271f != null && Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.f21272g = Thread.currentThread();
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            String str = "";
            String str2 = "";
            for (C7734a aVar = this.f21271f; aVar != null; aVar = aVar.mNextTask) {
                long currentTimeMillis2 = System.currentTimeMillis();
                aVar.start();
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                arrayList.add(aVar.getClass().getCanonicalName());
                hashMap.put(aVar.getClass().getCanonicalName(), Long.valueOf(currentTimeMillis3));
            }
            C7735b.m15762a(System.currentTimeMillis() - currentTimeMillis, arrayList, false, hashMap, str, str2);
            this.f21272g = null;
        }
    }

    /* renamed from: e */
    private C7734a m15767e() {
        this.f21269d = (int[][]) Array.newInstance(int.class, new int[]{this.f21267b.size(), this.f21267b.size()});
        int[] iArr = new int[this.f21267b.size()];
        for (Entry entry : this.f21267b.entrySet()) {
            List<Integer> preTasks = ((C7734a) this.f21266a.get(entry.getKey())).getPreTasks();
            if (preTasks != null) {
                for (Integer num : preTasks) {
                    if (num != entry.getKey()) {
                        this.f21269d[((Integer) this.f21267b.get(num)).intValue()][((Integer) this.f21267b.get(entry.getKey())).intValue()] = 1;
                    }
                }
            }
        }
        Stack stack = new Stack();
        int size = this.f21267b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = 0;
        }
        while (i < size) {
            if (iArr[i] != 0 || m15764a(i, iArr, stack)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(((C7734a) this.f21266a.get(Integer.valueOf(i))).getClass().getCanonicalName());
                sb.append("在环上，重新review task依赖");
                throw new RuntimeException(sb.toString());
            }
        }
        int i3 = -1;
        C7734a aVar = null;
        while (!stack.empty()) {
            int intValue = ((Integer) this.f21268c.get(stack.pop())).intValue();
            if (this.f21266a.containsKey(Integer.valueOf(i3))) {
                ((C7734a) this.f21266a.get(Integer.valueOf(i3))).mNextTask = (C7734a) this.f21266a.get(Integer.valueOf(intValue));
            } else {
                aVar = (C7734a) this.f21266a.get(Integer.valueOf(intValue));
            }
            i3 = intValue;
        }
        return aVar;
    }

    /* synthetic */ C7736c(C77371 r1) {
        this();
    }

    /* renamed from: a */
    public final void mo14082a(int i, C7734a aVar) {
        if (!this.f21266a.containsKey(Integer.valueOf(i))) {
            this.f21266a.put(Integer.valueOf(i), aVar);
            int size = this.f21267b.size();
            this.f21267b.put(Integer.valueOf(i), Integer.valueOf(size));
            this.f21268c.put(Integer.valueOf(size), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private boolean m15764a(int i, int[] iArr, Stack stack) {
        iArr[i] = -1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (this.f21269d[i][i2] == 1) {
                if (iArr[i2] < 0) {
                    return false;
                }
                if (iArr[i2] != 1 && !m15764a(i2, iArr, stack)) {
                    return false;
                }
            }
        }
        iArr[i] = 1;
        stack.push(Integer.valueOf(i));
        return true;
    }
}
