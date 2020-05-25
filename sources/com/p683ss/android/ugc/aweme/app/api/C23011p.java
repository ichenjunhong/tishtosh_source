package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.mime.TypedInput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.app.api.p */
public final class C23011p<T extends Message<T, ?>> implements C12744f<TypedInput, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f61355a;

    public C23011p(ProtoAdapter<T> protoAdapter) {
        this.f61355a = protoAdapter;
    }

    /* renamed from: a */
    public final T mo9557a(TypedInput typedInput) throws IOException {
        try {
            T t = (Message) this.f61355a.decode(typedInput.mo9554in());
            return t;
        } finally {
            typedInput.mo9554in().reset();
        }
    }
}
