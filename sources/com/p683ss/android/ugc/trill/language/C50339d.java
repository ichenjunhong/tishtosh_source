package com.p683ss.android.ugc.trill.language;

import android.arch.lifecycle.C0199s;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.d */
final /* synthetic */ class C50339d implements C0199s {

    /* renamed from: a */
    private final C50337c f126237a;

    C50339d(C50337c cVar) {
        this.f126237a = cVar;
    }

    public final void onChanged(Object obj) {
        C50337c cVar = this.f126237a;
        cVar.f126232a = (ArrayList) obj;
        cVar.notifyDataSetChanged();
    }
}
