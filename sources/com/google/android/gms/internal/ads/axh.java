package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15675e;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class axh implements bbq {

    /* renamed from: a */
    private final axf f41514a;

    axh(axf axf) {
        this.f41514a = (axf) ayb.m34770a(axf, "output");
    }

    /* renamed from: a */
    public final int mo29739a() {
        return C15675e.f41618j;
    }

    /* renamed from: a */
    public final void mo29743a(int i, int i2) throws IOException {
        this.f41514a.mo29738e(i, i2);
    }

    /* renamed from: a */
    public final void mo29744a(int i, long j) throws IOException {
        this.f41514a.mo29709a(i, j);
    }

    /* renamed from: b */
    public final void mo29756b(int i, long j) throws IOException {
        this.f41514a.mo29733c(i, j);
    }

    /* renamed from: a */
    public final void mo29742a(int i, float f) throws IOException {
        this.f41514a.mo29707a(i, f);
    }

    /* renamed from: a */
    public final void mo29741a(int i, double d) throws IOException {
        this.f41514a.mo29706a(i, d);
    }

    /* renamed from: b */
    public final void mo29755b(int i, int i2) throws IOException {
        this.f41514a.mo29724b(i, i2);
    }

    /* renamed from: c */
    public final void mo29762c(int i, long j) throws IOException {
        this.f41514a.mo29709a(i, j);
    }

    /* renamed from: c */
    public final void mo29761c(int i, int i2) throws IOException {
        this.f41514a.mo29724b(i, i2);
    }

    /* renamed from: d */
    public final void mo29765d(int i, long j) throws IOException {
        this.f41514a.mo29733c(i, j);
    }

    /* renamed from: d */
    public final void mo29764d(int i, int i2) throws IOException {
        this.f41514a.mo29738e(i, i2);
    }

    /* renamed from: a */
    public final void mo29753a(int i, boolean z) throws IOException {
        this.f41514a.mo29714a(i, z);
    }

    /* renamed from: a */
    public final void mo29749a(int i, String str) throws IOException {
        this.f41514a.mo29713a(i, str);
    }

    /* renamed from: a */
    public final void mo29745a(int i, awo awo) throws IOException {
        this.f41514a.mo29710a(i, awo);
    }

    /* renamed from: e */
    public final void mo29767e(int i, int i2) throws IOException {
        this.f41514a.mo29732c(i, i2);
    }

    /* renamed from: f */
    public final void mo29770f(int i, int i2) throws IOException {
        this.f41514a.mo29737d(i, i2);
    }

    /* renamed from: e */
    public final void mo29768e(int i, long j) throws IOException {
        this.f41514a.mo29725b(i, j);
    }

    /* renamed from: a */
    public final void mo29748a(int i, Object obj, bab bab) throws IOException {
        this.f41514a.mo29712a(i, (azj) obj, bab);
    }

    /* renamed from: b */
    public final void mo29757b(int i, Object obj, bab bab) throws IOException {
        axf axf = this.f41514a;
        azj azj = (azj) obj;
        axf.mo29708a(i, 3);
        bab.mo29896a(azj, (bbq) axf.f41497a);
        axf.mo29708a(i, 4);
    }

    /* renamed from: a */
    public final void mo29740a(int i) throws IOException {
        this.f41514a.mo29708a(i, 3);
    }

    /* renamed from: b */
    public final void mo29754b(int i) throws IOException {
        this.f41514a.mo29708a(i, 4);
    }

    /* renamed from: a */
    public final void mo29747a(int i, Object obj) throws IOException {
        if (obj instanceof awo) {
            this.f41514a.mo29726b(i, (awo) obj);
        } else {
            this.f41514a.mo29727b(i, (azj) obj);
        }
    }

    /* renamed from: a */
    public final void mo29752a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34453f(((Integer) list.get(i4)).intValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29705a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29724b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo29760b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29736d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29738e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo29763c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34448d(((Long) list.get(i4)).longValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29715a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29709a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo29766d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34452e(((Long) list.get(i4)).longValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29715a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29709a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo29769e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29734c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29733c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo29771f(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29704a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29707a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo29772g(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29703a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29706a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo29773h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34464i(((Integer) list.get(i4)).intValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29705a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29724b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo29774i(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29721a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29714a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo29750a(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof ays) {
            ays ays = (ays) list;
            while (i2 < list.size()) {
                Object b = ays.mo29856b(i2);
                if (b instanceof String) {
                    this.f41514a.mo29713a(i, (String) b);
                } else {
                    this.f41514a.mo29710a(i, (awo) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29713a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo29758b(int i, List<awo> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f41514a.mo29710a(i, (awo) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo29775j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34457g(((Integer) list.get(i4)).intValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29723b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29732c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo29776k(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29736d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29738e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo29777l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29734c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29733c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo29778m(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34461h(((Integer) list.get(i4)).intValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29731c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29737d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo29779n(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f41514a.mo29708a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += axf.m34456f(((Long) list.get(i4)).longValue());
            }
            this.f41514a.mo29723b(i3);
            while (i2 < list.size()) {
                this.f41514a.mo29728b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f41514a.mo29725b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo29751a(int i, List<?> list, bab bab) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo29748a(i, list.get(i2), bab);
        }
    }

    /* renamed from: b */
    public final void mo29759b(int i, List<?> list, bab bab) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo29757b(i, list.get(i2), bab);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo29746a(int i, azc<K, V> azc, Map<K, V> map) throws IOException {
        for (Entry entry : map.entrySet()) {
            this.f41514a.mo29708a(i, 2);
            this.f41514a.mo29723b(azb.m34831a(azc, entry.getKey(), entry.getValue()));
            azb.m34832a(this.f41514a, azc, entry.getKey(), entry.getValue());
        }
    }
}
