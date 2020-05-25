package com.bytedance.android.live.broadcast.api.p195b;

import com.bytedance.android.live.broadcast.api.C3037b;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.api.b.e */
public final class C3046e {

    /* renamed from: e */
    private static final List<C3038a> f8919e;

    /* renamed from: a */
    public final List<C3038a> f8920a;

    /* renamed from: b */
    public final List<String> f8921b;

    /* renamed from: c */
    public final C3039b f8922c;

    /* renamed from: d */
    public final List<String> f8923d;

    /* renamed from: com.bytedance.android.live.broadcast.api.b.e$a */
    public static class C3047a {

        /* renamed from: a */
        List<C3038a> f8924a;

        /* renamed from: b */
        List<String> f8925b;

        /* renamed from: c */
        List<String> f8926c;

        /* renamed from: d */
        C3039b f8927d;

        /* renamed from: a */
        public final C3046e mo8290a() {
            return new C3046e(this);
        }

        /* renamed from: a */
        public final C3047a mo8288a(C3039b bVar) {
            this.f8927d = bVar;
            return this;
        }

        /* renamed from: b */
        public final C3047a mo8291b(List<String> list) {
            this.f8926c = list;
            return this;
        }

        /* renamed from: a */
        public final C3047a mo8289a(List<String> list) {
            this.f8925b = list;
            return this;
        }
    }

    static {
        LinkedList linkedList = new LinkedList();
        f8919e = linkedList;
        linkedList.add(new C3038a("beauty", Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)})));
        f8919e.add(new C3038a(C3037b.f8916d, Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)})));
        f8919e.add(new C3038a("effect_gift", Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(3)})));
        f8919e.add(new C3038a("livegame", Collections.singletonList(Integer.valueOf(3))));
        f8919e.add(new C3038a("livemoneygame", Collections.singletonList(Integer.valueOf(3))));
        f8919e.add(new C3038a(C3037b.f8913a, Collections.singletonList(Integer.valueOf(2))));
        f8919e.add(new C3038a(C3037b.f8914b, Collections.singletonList(Integer.valueOf(2))));
        f8919e.add(new C3038a(C3037b.f8915c, Collections.singletonList(Integer.valueOf(2))));
    }

    public C3046e(C3047a aVar) {
        List<String> list;
        List<String> list2;
        List<C3038a> list3;
        this.f8922c = aVar.f8927d;
        if (aVar.f8925b == null) {
            list = Collections.emptyList();
        } else {
            list = aVar.f8925b;
        }
        this.f8921b = list;
        if (aVar.f8926c == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = aVar.f8926c;
        }
        this.f8923d = list2;
        if (aVar.f8924a == null || aVar.f8924a.isEmpty()) {
            list3 = f8919e;
        } else {
            list3 = aVar.f8924a;
        }
        this.f8920a = list3;
    }
}
