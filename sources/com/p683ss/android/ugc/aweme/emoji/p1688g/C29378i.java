package com.p683ss.android.ugc.aweme.emoji.p1688g;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.emoji.emojichoose.model.C29357b;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29476f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.ss.android.ugc.aweme.emoji.g.i */
final /* synthetic */ class C29378i implements C1711f {

    /* renamed from: a */
    private final C29368b f76958a;

    C29378i(C29368b bVar) {
        this.f76958a = bVar;
    }

    public final Object apply(Object obj) {
        C29368b bVar = this.f76958a;
        C29357b bVar2 = (C29357b) obj;
        C29371b bVar3 = new C29371b();
        if (bVar2 != null) {
            bVar3.f76940e = bVar2.status_msg;
            bVar3.f76941f = bVar2.status_code;
            bVar3.f76938c = bVar2.status_code == 0 && !C9376b.m18558a((Collection<T>) bVar2.f76898a);
            if (bVar3.f76938c) {
                C29366a aVar = (C29366a) bVar2.f76898a.get(0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                arrayList.addAll(bVar.mo59394c());
                C29476f.m69557a(C29368b.m69246d(), (List<? extends T>) arrayList);
                bVar3.f76939d = arrayList;
                bVar.f76933a = arrayList;
            }
        }
        return bVar3;
    }
}
