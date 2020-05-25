package com.p683ss.android.ugc.aweme.account.p1278k;

import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.k.c */
public final /* synthetic */ class C21011c implements C0011g {

    /* renamed from: a */
    private final long f57135a;

    /* renamed from: b */
    private final User f57136b;

    public C21011c(long j, User user) {
        this.f57135a = j;
        this.f57136b = user;
    }

    public final Object then(C0013i iVar) {
        Object obj;
        long j = this.f57135a;
        User user = this.f57136b;
        String d = C23826bi.m58463d();
        C52711k.m112240b(d, "userId");
        List arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : C21518u.f58350b) {
            if (C52711k.m112239a((Object) baseLoginMethod.getUid(), (Object) d)) {
                arrayList.add(baseLoginMethod);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Comparable expires = ((BaseLoginMethod) obj).getExpires();
                do {
                    Object next = it.next();
                    Comparable expires2 = ((BaseLoginMethod) next).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        obj = next;
                        expires = expires2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) obj;
        if (baseLoginMethod2 != null) {
            baseLoginMethod2.setExpires(new Date(j + 2592000000L));
        }
        C21518u.m54173a(user);
        return (List) iVar.mo34e();
    }
}
