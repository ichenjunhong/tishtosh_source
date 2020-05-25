package com.facebook.imagepipeline.p967g;

import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.imagepipeline.p970j.C14047h;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.g.g */
public final class C14034g implements C14032e {

    /* renamed from: a */
    private final C14037b f36692a;

    /* renamed from: com.facebook.imagepipeline.g.g$a */
    static class C14036a implements C14037b {
        private C14036a() {
        }

        /* renamed from: a */
        public final List<Integer> mo26249a() {
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: com.facebook.imagepipeline.g.g$b */
    public interface C14037b {
        /* renamed from: a */
        List<Integer> mo26249a();
    }

    public C14034g() {
        this(new C14036a());
    }

    /* renamed from: b */
    public final C14047h mo26247b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        return C14046g.m28725a(i, z, false);
    }

    private C14034g(C14037b bVar) {
        this.f36692a = (C14037b) C13689i.m27652a(bVar);
    }

    /* renamed from: a */
    public final int mo26246a(int i) {
        List a = this.f36692a.mo26249a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (((Integer) a.get(i2)).intValue() > i) {
                return ((Integer) a.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
