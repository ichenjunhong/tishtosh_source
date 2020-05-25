package com.p683ss.android.ugc.aweme.emoji.p1688g;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29357b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29476f;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.emoji.g.d */
final /* synthetic */ class C29373d implements C0011g {

    /* renamed from: a */
    private final C29368b f76944a;

    C29373d(C29368b bVar) {
        this.f76944a = bVar;
    }

    public final Object then(C0013i iVar) {
        C29368b bVar = this.f76944a;
        C29357b bVar2 = (iVar == null || !iVar.mo26b()) ? null : (C29357b) iVar.mo34e();
        C29371b bVar3 = new C29371b();
        if (bVar2 != null) {
            bVar3.f76940e = bVar2.status_msg;
            bVar3.f76938c = bVar2.status_code == 0 && !C9376b.m18558a((Collection<T>) bVar2.f76898a);
            if (bVar3.f76938c) {
                List<C29366a> c = bVar.mo59394c();
                c.removeAll(bVar2.f76898a);
                C29476f.m69557a(C29368b.m69246d(), c);
                bVar3.f76939d = c;
                bVar.f76933a = c;
            }
        }
        return bVar3;
    }
}
