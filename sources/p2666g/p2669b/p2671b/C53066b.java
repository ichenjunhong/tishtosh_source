package p2666g.p2669b.p2671b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.C53500ac;
import okhttp3.C53678w;
import okio.Buffer;
import okio.BufferedSink;
import p2666g.C53095e;

/* renamed from: g.b.b.b */
final class C53066b<T extends Message<T, ?>> implements C53095e<T, C53500ac> {

    /* renamed from: a */
    private static final C53678w f131561a = C53678w.m114225a("application/x-protobuf");

    /* renamed from: b */
    private final ProtoAdapter<T> f131562b;

    C53066b(ProtoAdapter<T> protoAdapter) {
        this.f131562b = protoAdapter;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo110590a(Object obj) throws IOException {
        Message message = (Message) obj;
        Buffer buffer = new Buffer();
        this.f131562b.encode((BufferedSink) buffer, message);
        return C53500ac.create(f131561a, buffer.snapshot());
    }
}
