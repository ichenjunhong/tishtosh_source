package p2666g.p2669b.p2671b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import okhttp3.C53506ae;
import p2666g.C53095e;

/* renamed from: g.b.b.c */
final class C53067c<T extends Message<T, ?>> implements C53095e<C53506ae, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f131563a;

    C53067c(ProtoAdapter<T> protoAdapter) {
        this.f131563a = protoAdapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo110590a(C53506ae aeVar) throws IOException {
        try {
            return (Message) this.f131563a.decode(aeVar.source());
        } finally {
            aeVar.close();
        }
    }
}
