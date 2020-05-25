package com.bytedance.android.livesdkapi;

import com.bytedance.android.live.base.C2952b;

/* renamed from: com.bytedance.android.livesdkapi.f */
public interface C8737f extends C2952b {

    /* renamed from: com.bytedance.android.livesdkapi.f$a */
    public interface C8738a {
        Object defValue();

        String key();

        boolean supportPersist();

        C8739b type();
    }

    /* renamed from: com.bytedance.android.livesdkapi.f$b */
    public enum C8739b {
        Boolean,
        Integer,
        Long,
        Float,
        String,
        StrSet
    }

    /* renamed from: a */
    void mo15406a(C8738a aVar, int i);

    /* renamed from: a */
    void mo15407a(C8738a aVar, String str);

    /* renamed from: a */
    void mo15408a(C8738a aVar, boolean z);

    /* renamed from: a */
    boolean mo15409a(C8738a aVar);

    /* renamed from: b */
    int mo15410b(C8738a aVar);
}
