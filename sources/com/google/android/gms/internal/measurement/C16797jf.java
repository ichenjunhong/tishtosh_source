package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jf */
final class C16797jf extends C16796je<FieldDescriptorType, Object> {
    C16797jf(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo32314a() {
        if (!this.f47188a) {
            for (int i = 0; i < mo32315b(); i++) {
                Entry b = mo32316b(i);
                if (((C16728gw) b.getKey()).mo32215d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : mo32317c()) {
                if (((C16728gw) entry.getKey()).mo32215d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo32314a();
    }
}
