package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15675e;
import java.io.IOException;
import java.util.Arrays;

final class baw extends bau<bav, bav> {
    baw() {
    }

    /* renamed from: a */
    private static void m35120a(Object obj, bav bav) {
        ((axz) obj).zzfza = bav;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo29969d(Object obj) {
        ((axz) obj).zzfza.mo29975c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ int mo29971f(Object obj) {
        return ((bav) obj).mo29976d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ int mo29970e(Object obj) {
        bav bav = (bav) obj;
        int i = bav.f41735d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < bav.f41732a; i3++) {
            i2 += (axf.m34450e(1) << 1) + axf.m34458g(2, bav.f41733b[i3] >>> 3) + axf.m34442c(3, (awo) bav.f41734c[i3]);
        }
        bav.f41735d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo29968c(Object obj, Object obj2) {
        bav bav = (bav) obj;
        bav bav2 = (bav) obj2;
        if (bav2.equals(bav.m35112a())) {
            return bav;
        }
        int i = bav.f41732a + bav2.f41732a;
        int[] copyOf = Arrays.copyOf(bav.f41733b, i);
        System.arraycopy(bav2.f41733b, 0, copyOf, bav.f41732a, bav2.f41732a);
        Object[] copyOf2 = Arrays.copyOf(bav.f41734c, i);
        System.arraycopy(bav2.f41734c, 0, copyOf2, bav.f41732a, bav2.f41732a);
        return new bav(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo29965b(Object obj, bbq bbq) throws IOException {
        bav bav = (bav) obj;
        if (bbq.mo29739a() == C15675e.f41619k) {
            for (int i = bav.f41732a - 1; i >= 0; i--) {
                bbq.mo29747a(bav.f41733b[i] >>> 3, bav.f41734c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < bav.f41732a; i2++) {
            bbq.mo29747a(bav.f41733b[i2] >>> 3, bav.f41734c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29960a(Object obj, bbq bbq) throws IOException {
        ((bav) obj).mo29973a(bbq);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo29966b(Object obj, Object obj2) {
        m35120a(obj, (bav) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo29967c(Object obj) {
        bav bav = ((axz) obj).zzfza;
        if (bav != bav.m35112a()) {
            return bav;
        }
        bav b = bav.m35114b();
        m35120a(obj, b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo29963b(Object obj) {
        return ((axz) obj).zzfza;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29961a(Object obj, Object obj2) {
        m35120a(obj, (bav) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo29955a(Object obj) {
        bav bav = (bav) obj;
        bav.mo29975c();
        return bav;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo29954a() {
        return bav.m35114b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29959a(Object obj, int i, Object obj2) {
        ((bav) obj).mo29972a((i << 3) | 3, (Object) (bav) obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29958a(Object obj, int i, awo awo) {
        ((bav) obj).mo29972a((i << 3) | 2, (Object) awo);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo29964b(Object obj, int i, long j) {
        ((bav) obj).mo29972a((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29956a(Object obj, int i, int i2) {
        ((bav) obj).mo29972a((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo29957a(Object obj, int i, long j) {
        ((bav) obj).mo29972a(i << 3, (Object) Long.valueOf(j));
    }
}
