package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.splitcompat.i */
final class C17391i implements C17395m {

    /* renamed from: a */
    private final /* synthetic */ C17388f f48926a;

    C17391i(C17388f fVar) {
        this.f48926a = fVar;
    }

    /* renamed from: a */
    public final void mo33711a(C17394l lVar, File file, boolean z) throws IOException {
        this.f48926a.f48917a.add(file);
        if (!z) {
            this.f48926a.f48918b.set(false);
        }
    }
}
