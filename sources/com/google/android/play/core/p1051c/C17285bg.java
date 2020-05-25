package com.google.android.play.core.p1051c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.play.core.p1056f.C17374l;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.google.android.play.core.c.bg */
final class C17285bg extends C17281bc {

    /* renamed from: b */
    private final /* synthetic */ C17281bc f48762b;

    /* renamed from: c */
    private final /* synthetic */ C17283be f48763c;

    C17285bg(C17283be beVar, C17374l lVar, C17281bc bcVar) {
        this.f48763c = beVar;
        this.f48762b = bcVar;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo33509a() {
        C17283be beVar = this.f48763c;
        C17281bc bcVar = this.f48762b;
        if (beVar.f48760k == null && !beVar.f48754e) {
            beVar.f48751b.mo33685a("Initiate binding to the service.", new Object[0]);
            beVar.f48753d.add(bcVar);
            beVar.f48759j = new C17289bk(beVar, 0);
            boolean z = true;
            beVar.f48754e = true;
            Context context = beVar.f48750a;
            Intent intent = beVar.f48755f;
            ServiceConnection serviceConnection = beVar.f48759j;
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                z = context.bindService(intent, serviceConnection, 1);
            }
            if (!z) {
                beVar.f48751b.mo33685a("Failed to bind to the service.", new Object[0]);
                beVar.f48754e = false;
                for (C17281bc bcVar2 : beVar.f48753d) {
                    C17374l<?> lVar = bcVar2.f48747a;
                    if (lVar != null) {
                        lVar.mo33666a((Exception) new C17278b());
                    }
                }
                beVar.f48753d.clear();
            }
        } else if (beVar.f48754e) {
            beVar.f48751b.mo33685a("Waiting to bind to the service.", new Object[0]);
            beVar.f48753d.add(bcVar);
        } else {
            bcVar.run();
        }
    }
}
