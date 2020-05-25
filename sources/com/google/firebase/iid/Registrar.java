package com.google.firebase.iid;

import com.google.firebase.C17855b;
import com.google.firebase.components.C17863a;
import com.google.firebase.components.C17868d;
import com.google.firebase.components.C17869e;
import com.google.firebase.iid.p1075a.C17889a;
import com.google.firebase.p1072a.C17848d;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements C17868d {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    static class C17887a implements C17889a {

        /* renamed from: a */
        private final FirebaseInstanceId f49713a;

        public C17887a(FirebaseInstanceId firebaseInstanceId) {
            this.f49713a = firebaseInstanceId;
        }
    }

    public final List<C17863a<?>> getComponents() {
        return Arrays.asList(new C17863a[]{C17863a.m43802a(FirebaseInstanceId.class).mo34697a(C17869e.m43817a(C17855b.class)).mo34697a(C17869e.m43817a(C17848d.class)).mo34696a(C17934r.f49805a).mo34695a(1).mo34698a(), C17863a.m43802a(C17889a.class).mo34697a(C17869e.m43817a(FirebaseInstanceId.class)).mo34696a(C17935s.f49806a).mo34698a()});
    }
}
