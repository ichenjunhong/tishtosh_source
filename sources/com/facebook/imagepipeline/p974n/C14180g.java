package com.facebook.imagepipeline.p974n;

import android.util.Pair;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p964d.C13969f;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p975o.C14229b.C14231b;
import com.facebook.p914c.p915a.C13619c;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.n.g */
public final class C14180g extends C14116ag<Pair<C13619c, C14231b>, C13715a<C14042c>> {

    /* renamed from: c */
    private final C13969f f37014c;

    /* renamed from: a */
    public final /* synthetic */ Closeable mo26357a(Closeable closeable) {
        return C13715a.m27751b((C13715a) closeable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo26358a(C14140an anVar) {
        return Pair.create(this.f37014c.mo26145a(anVar.mo26384a(), anVar.mo26388d()), anVar.mo26389e());
    }

    public C14180g(C13969f fVar, C14139am amVar) {
        super(amVar);
        this.f37014c = fVar;
    }
}
