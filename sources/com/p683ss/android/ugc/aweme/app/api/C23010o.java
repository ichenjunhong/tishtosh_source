package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.C53678w;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: com.ss.android.ugc.aweme.app.api.o */
final class C23010o<T extends Message<T, ?>> implements C12744f<T, TypedOutput> {

    /* renamed from: a */
    private static final C53678w f61353a = C53678w.m114225a("application/x-protobuf");

    /* renamed from: b */
    private final ProtoAdapter<T> f61354b;

    C23010o(ProtoAdapter<T> protoAdapter) {
        this.f61354b = protoAdapter;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9557a(Object obj) throws IOException {
        Message message = (Message) obj;
        Buffer buffer = new Buffer();
        this.f61354b.encode((BufferedSink) buffer, message);
        return new TypedByteArray(f61353a.f133165a, buffer.readByteArray(), new String[0]);
    }
}
