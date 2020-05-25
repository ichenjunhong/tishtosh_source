package com.p683ss.android.ugc.aweme;

import android.app.Application;
import android.os.Bundle;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.ugc.aweme.IAccountUserService.C20841a;
import com.p683ss.android.ugc.aweme.account.network.C22077a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.cb */
public class C24514cb {

    /* renamed from: a */
    static C24445bx f64933a;

    /* renamed from: b */
    static C22077a f64934b;

    /* renamed from: c */
    static List<C20841a> f64935c = new LinkedList();

    /* renamed from: a */
    public static C22077a m59920a() {
        return f64934b;
    }

    /* renamed from: b */
    public static Application m59923b() {
        return C20842a.f56783a;
    }

    /* renamed from: a */
    public static void m59922a(C13207b bVar, String str) {
        f64933a.mo50211a(bVar, str);
    }

    /* renamed from: a */
    public static void m59921a(int i, User user, User user2, Bundle bundle) {
        LinkedList<C20841a> linkedList = new LinkedList<>();
        synchronized (C24514cb.class) {
            linkedList.addAll(f64935c);
        }
        for (C20841a a : linkedList) {
            a.mo44389a(i, user, user2, null);
        }
    }
}
