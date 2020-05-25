package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.p059b.C1648a;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f5494a;

    /* renamed from: b */
    public C1538e f5495b;

    /* renamed from: c */
    public Set<String> f5496c;

    /* renamed from: d */
    public int f5497d;

    /* renamed from: e */
    public Executor f5498e;

    /* renamed from: f */
    public C1648a f5499f;

    /* renamed from: g */
    public C1659k f5500g;

    /* renamed from: h */
    private C1530a f5501h;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C1530a {

        /* renamed from: a */
        public List<String> f5502a;

        /* renamed from: b */
        public List<Uri> f5503b;

        /* renamed from: c */
        public Network f5504c;
    }

    public WorkerParameters(UUID uuid, C1538e eVar, Collection<String> collection, C1530a aVar, int i, Executor executor, C1648a aVar2, C1659k kVar) {
        this.f5494a = uuid;
        this.f5495b = eVar;
        this.f5496c = new HashSet(collection);
        this.f5501h = aVar;
        this.f5497d = i;
        this.f5498e = executor;
        this.f5499f = aVar2;
        this.f5500g = kVar;
    }
}
