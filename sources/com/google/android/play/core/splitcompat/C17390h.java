package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.h */
final class C17390h implements C17392j {

    /* renamed from: a */
    private final /* synthetic */ Set f48923a;

    /* renamed from: b */
    private final /* synthetic */ C17400r f48924b;

    /* renamed from: c */
    private final /* synthetic */ C17389g f48925c;

    C17390h(C17389g gVar, Set set, C17400r rVar) {
        this.f48925c = gVar;
        this.f48923a = set;
        this.f48924b = rVar;
    }

    /* renamed from: a */
    public final void mo33708a(ZipFile zipFile, Set<C17394l> set) throws IOException {
        Set set2 = this.f48923a;
        C17389g gVar = this.f48925c;
        C17400r rVar = this.f48924b;
        HashSet hashSet = new HashSet();
        gVar.mo33710a(rVar, set, new C17393k(hashSet, rVar, zipFile));
        set2.addAll(hashSet);
    }
}
