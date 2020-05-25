package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16741e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.gl */
final class C16716gl implements C16838kp {

    /* renamed from: a */
    private final C16709gj f46989a;

    C16716gl(C16709gj gjVar) {
        this.f46989a = (C16709gj) C16743hf.m40316a(gjVar, "output");
    }

    /* renamed from: a */
    public final int mo32144a() {
        return C16741e.f47099j;
    }

    /* renamed from: a */
    public final void mo32148a(int i, int i2) throws IOException {
        this.f46989a.mo32143e(i, i2);
    }

    /* renamed from: a */
    public final void mo32149a(int i, long j) throws IOException {
        this.f46989a.mo32115a(i, j);
    }

    /* renamed from: b */
    public final void mo32161b(int i, long j) throws IOException {
        this.f46989a.mo32138c(i, j);
    }

    /* renamed from: a */
    public final void mo32147a(int i, float f) throws IOException {
        this.f46989a.mo32113a(i, f);
    }

    /* renamed from: a */
    public final void mo32146a(int i, double d) throws IOException {
        this.f46989a.mo32112a(i, d);
    }

    /* renamed from: b */
    public final void mo32160b(int i, int i2) throws IOException {
        this.f46989a.mo32130b(i, i2);
    }

    /* renamed from: c */
    public final void mo32167c(int i, long j) throws IOException {
        this.f46989a.mo32115a(i, j);
    }

    /* renamed from: c */
    public final void mo32166c(int i, int i2) throws IOException {
        this.f46989a.mo32130b(i, i2);
    }

    /* renamed from: d */
    public final void mo32170d(int i, long j) throws IOException {
        this.f46989a.mo32138c(i, j);
    }

    /* renamed from: d */
    public final void mo32169d(int i, int i2) throws IOException {
        this.f46989a.mo32143e(i, i2);
    }

    /* renamed from: a */
    public final void mo32158a(int i, boolean z) throws IOException {
        this.f46989a.mo32120a(i, z);
    }

    /* renamed from: a */
    public final void mo32154a(int i, String str) throws IOException {
        this.f46989a.mo32119a(i, str);
    }

    /* renamed from: a */
    public final void mo32150a(int i, C16691fs fsVar) throws IOException {
        this.f46989a.mo32116a(i, fsVar);
    }

    /* renamed from: e */
    public final void mo32172e(int i, int i2) throws IOException {
        this.f46989a.mo32137c(i, i2);
    }

    /* renamed from: f */
    public final void mo32175f(int i, int i2) throws IOException {
        this.f46989a.mo32142d(i, i2);
    }

    /* renamed from: e */
    public final void mo32173e(int i, long j) throws IOException {
        this.f46989a.mo32131b(i, j);
    }

    /* renamed from: a */
    public final void mo32153a(int i, Object obj, C16793jb jbVar) throws IOException {
        this.f46989a.mo32118a(i, (C16775ik) obj, jbVar);
    }

    /* renamed from: b */
    public final void mo32162b(int i, Object obj, C16793jb jbVar) throws IOException {
        C16709gj gjVar = this.f46989a;
        C16775ik ikVar = (C16775ik) obj;
        gjVar.mo32114a(i, 3);
        jbVar.mo32300a(ikVar, (C16838kp) gjVar.f46972a);
        gjVar.mo32114a(i, 4);
    }

    /* renamed from: a */
    public final void mo32145a(int i) throws IOException {
        this.f46989a.mo32114a(i, 3);
    }

    /* renamed from: b */
    public final void mo32159b(int i) throws IOException {
        this.f46989a.mo32114a(i, 4);
    }

    /* renamed from: a */
    public final void mo32152a(int i, Object obj) throws IOException {
        if (obj instanceof C16691fs) {
            this.f46989a.mo32132b(i, (C16691fs) obj);
        } else {
            this.f46989a.mo32133b(i, (C16775ik) obj);
        }
    }

    /* renamed from: a */
    public final void mo32157a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40024f(((Integer) list.get(i4)).intValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32111a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32130b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo32165b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32141d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32143e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo32168c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40020d(((Long) list.get(i4)).longValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32121a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32115a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo32171d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40023e(((Long) list.get(i4)).longValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32121a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32115a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo32174e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32139c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32138c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo32176f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32110a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32113a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo32177g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32109a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32112a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo32178h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40035i(((Integer) list.get(i4)).intValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32111a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32130b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo32179i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32127a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32120a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo32155a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C16757ht) {
            C16757ht htVar = (C16757ht) list;
            while (i2 < list.size()) {
                Object b = htVar.mo32260b(i2);
                if (b instanceof String) {
                    this.f46989a.mo32119a(i, (String) b);
                } else {
                    this.f46989a.mo32116a(i, (C16691fs) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32119a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo32163b(int i, List<C16691fs> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f46989a.mo32116a(i, (C16691fs) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo32180j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40028g(((Integer) list.get(i4)).intValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32129b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32137c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo32181k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32141d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32143e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo32182l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32139c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32138c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo32183m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40032h(((Integer) list.get(i4)).intValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32136c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32142d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo32184n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f46989a.mo32114a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C16709gj.m40027f(((Long) list.get(i4)).longValue());
            }
            this.f46989a.mo32129b(i3);
            while (i2 < list.size()) {
                this.f46989a.mo32134b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f46989a.mo32131b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo32156a(int i, List<?> list, C16793jb jbVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo32153a(i, list.get(i2), jbVar);
        }
    }

    /* renamed from: b */
    public final void mo32164b(int i, List<?> list, C16793jb jbVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo32162b(i, list.get(i2), jbVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo32151a(int i, C16768id<K, V> idVar, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f46989a.mo32114a(i, 2);
            this.f46989a.mo32129b(C16767ic.m40373a(idVar, entry.getKey(), entry.getValue()));
            C16767ic.m40374a(this.f46989a, idVar, entry.getKey(), entry.getValue());
        }
    }
}
