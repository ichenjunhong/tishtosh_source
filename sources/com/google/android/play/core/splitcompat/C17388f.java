package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.f */
final class C17388f implements C17392j {

    /* renamed from: a */
    final /* synthetic */ Set f48917a;

    /* renamed from: b */
    final /* synthetic */ AtomicBoolean f48918b;

    /* renamed from: c */
    private final /* synthetic */ C17400r f48919c;

    /* renamed from: d */
    private final /* synthetic */ C17389g f48920d;

    C17388f(C17389g gVar, C17400r rVar, Set set, AtomicBoolean atomicBoolean) {
        this.f48920d = gVar;
        this.f48919c = rVar;
        this.f48917a = set;
        this.f48918b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo33708a(ZipFile zipFile, Set<C17394l> set) throws IOException {
        this.f48920d.mo33710a(this.f48919c, set, new C17391i(this));
    }
}
