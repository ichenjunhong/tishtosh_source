package com.google.android.play.core.p1053e;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.e.ac */
final class C17322ac implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C17340f f48797a;

    /* renamed from: b */
    private final /* synthetic */ C17323ad f48798b;

    C17322ac(C17323ad adVar, C17340f fVar) {
        this.f48798b = adVar;
        this.f48797a = fVar;
    }

    public final void run() {
        C17321ab abVar = this.f48798b.f48799a;
        List<String> list = this.f48797a.f48846a;
        List a = C17323ad.m42408a(this.f48797a.f48847b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList(list));
        }
        if (!a.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList(a));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        abVar.mo33609a(C17342g.m42463a(bundle));
    }
}
