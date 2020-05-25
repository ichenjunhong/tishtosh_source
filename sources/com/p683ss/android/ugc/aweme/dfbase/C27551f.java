package com.p683ss.android.ugc.aweme.dfbase;

import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.p765b.C12150a;
import com.google.android.play.core.p1053e.C17318a;
import com.google.android.play.core.p1056f.C17362a;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27547c;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.dfbase.f */
final /* synthetic */ class C27551f implements C17362a {

    /* renamed from: a */
    private final C27536b f72436a;

    /* renamed from: b */
    private final C27538a f72437b;

    /* renamed from: c */
    private final String f72438c;

    C27551f(C27536b bVar, C27538a aVar, String str) {
        this.f72436a = bVar;
        this.f72437b = aVar;
        this.f72438c = str;
    }

    /* renamed from: a */
    public final void mo23057a(Exception exc) {
        C27536b bVar = this.f72436a;
        C27538a aVar = this.f72437b;
        String str = this.f72438c;
        C27562q b = bVar.mo55975b(aVar.f72397a);
        if (b != null) {
            C12150a aVar2 = new C12150a(str, C12152c.m24596b().mo23049b(), 6);
            if (exc instanceof C17318a) {
                aVar2.f32075g = ((C17318a) exc).getErrorCode();
            }
            aVar2.f32077i = exc;
            C27547c.m66216a(aVar, aVar2);
            C0013i.m16a((Callable<TResult>) new C27556k<TResult>(b, aVar2));
        }
    }
}
