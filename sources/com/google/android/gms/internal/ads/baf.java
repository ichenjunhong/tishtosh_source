package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class baf extends bae<FieldDescriptorType, Object> {
    baf(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo29913a() {
        if (!this.f41704a) {
            for (int i = 0; i < mo29914b(); i++) {
                Entry b = mo29915b(i);
                if (((axs) b.getKey()).mo29810d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo29916c()) {
                if (((axs) entry.getKey()).mo29810d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo29913a();
    }
}
