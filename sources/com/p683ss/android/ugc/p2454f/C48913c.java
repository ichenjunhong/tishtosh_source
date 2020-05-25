package com.p683ss.android.ugc.p2454f;

import com.p683ss.android.p1192ml.C19500e;
import com.p683ss.android.ugc.p2454f.C48918e.C48919a;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.f.c */
public final class C48913c implements C48919a {

    /* renamed from: a */
    private volatile double f123063a = -1.0d;

    /* renamed from: b */
    private C48914a f123064b;

    /* renamed from: com.ss.android.ugc.f.c$a */
    public interface C48914a {
        /* renamed from: a */
        Map<String, Object> mo76389a();
    }

    /* renamed from: com.ss.android.ugc.f.c$b */
    public static class C48915b extends Exception {

        /* renamed from: a */
        private int f123065a;

        /* renamed from: b */
        private String f123066b;

        public final int getCode() {
            return this.f123065a;
        }

        public final String getMsg() {
            return this.f123066b;
        }

        public C48915b(int i, String str) {
            this.f123065a = i;
            this.f123066b = str;
        }
    }

    public C48913c(C48914a aVar) {
        this.f123064b = aVar;
    }

    /* renamed from: a */
    public final double mo77253a(Queue<C48920f> queue, C48920f[] fVarArr) {
        return this.f123063a;
    }

    /* renamed from: b */
    public final double mo77254b(Queue<C48920f> queue, C48920f[] fVarArr) throws C48915b {
        String str;
        int i;
        C19500e eVar = C48916d.m105711a().f123067a;
        if (eVar == null || !eVar.mo40665b() || !eVar.mo40670f()) {
            this.f123063a = -1.0d;
            if (eVar == null) {
                i = 0;
                str = "component is null";
            } else if (!eVar.mo40665b()) {
                i = 1;
                str = "component is not enable";
            } else {
                i = 3;
                str = "component is not initialized ready";
            }
            throw new C48915b(i, str);
        }
        queue.toArray(fVarArr);
        HashMap hashMap = new HashMap();
        int min = Math.min(fVarArr.length, queue.size());
        int i2 = min - 1;
        for (int i3 = i2; i3 >= 0; i3--) {
            int i4 = min - i3;
            StringBuilder sb = new StringBuilder("f");
            sb.append(i4);
            hashMap.put(sb.toString(), Float.valueOf((float) fVarArr[i3].f123082c));
            StringBuilder sb2 = new StringBuilder("s");
            sb2.append(i4);
            hashMap.put(sb2.toString(), Float.valueOf(((float) fVarArr[i3].f123081b) / 8000.0f));
            StringBuilder sb3 = new StringBuilder("i");
            sb3.append(i4);
            hashMap.put(sb3.toString(), Float.valueOf(((float) fVarArr[i2].f123084e) - ((float) fVarArr[i3].f123084e)));
        }
        hashMap.putAll(this.f123064b.mo76389a());
        this.f123063a = (double) eVar.f53850c.mo40657a(hashMap, eVar.mo40667c(), eVar.mo40668d(), eVar.mo40669e());
        if (this.f123063a != -1.0d) {
            return this.f123063a;
        }
        if (!eVar.f53850c.mo40661b()) {
            throw new C48915b(4, "evaluator is not initialized");
        }
        throw new C48915b(5, "evaluator calculate error");
    }
}
