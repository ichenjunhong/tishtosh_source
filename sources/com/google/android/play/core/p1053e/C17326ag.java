package com.google.android.play.core.p1053e;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.p1051c.C17254ad;
import com.google.android.play.core.p1051c.C17255ae;
import com.google.android.play.core.p1051c.C17281bc;
import com.google.android.play.core.p1056f.C17374l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.e.ag */
final class C17326ag extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ Collection f48809b;

    /* renamed from: c */
    private final /* synthetic */ Collection f48810c;

    /* renamed from: d */
    private final /* synthetic */ C17374l f48811d;

    /* renamed from: e */
    private final /* synthetic */ C17325af f48812e;

    C17326ag(C17325af afVar, C17374l lVar, Collection collection, Collection collection2, C17374l lVar2) {
        this.f48812e = afVar;
        this.f48809b = collection;
        this.f48810c = collection2;
        this.f48811d = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo33509a() {
        Collection<String> collection = this.f48809b;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        arrayList.addAll(C17325af.m42420a(this.f48810c));
        try {
            ((C17254ad) this.f48812e.f48807b.f48760k).mo33530a(this.f48812e.f48808d, (List<Bundle>) arrayList, C17325af.m42418a(), (C17255ae) new C17347l(this.f48812e, this.f48811d));
        } catch (RemoteException e) {
            C17325af.f48805a.mo33686a((Throwable) e, "startInstall(%s,%s)", this.f48809b, this.f48810c);
            this.f48811d.mo33666a((Exception) new RuntimeException(e));
        }
    }
}
