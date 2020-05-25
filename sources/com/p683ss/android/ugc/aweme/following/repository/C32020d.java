package com.p683ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a.C11683a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11689c;
import com.bytedance.jedi.p725a.p739i.C11682a.C11692d;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.p1432be.C23775a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.following.repository.d */
public final class C32020d extends C11698b implements C23775a {

    /* renamed from: a */
    private final C32039g f83600a = new C32039g();

    /* renamed from: b */
    private final C32042j f83601b = new C32042j();

    /* renamed from: c */
    private final C11536c<String, User> f83602c = C47588a.m103036c().mo94908a();

    /* renamed from: com.ss.android.ugc.aweme.following.repository.d$a */
    public static final class C32021a extends C52712l implements C52671b<C11689c<C32019c, List<? extends User>, C52860x, List<? extends User>>, C52860x> {
        public C32021a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11689c) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11689c<C32019c, List<User>, C52860x, List<User>> cVar) {
            C52711k.m112240b(cVar, "$this$keySyncTo");
            cVar.mo22474a((C52682m<? super K, ? super V, ? extends K1>) new C52682m<C32019c, List<? extends User>, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C32021a f83603a;

                {
                    this.f83603a = r1;
                }

                public final C52860x invoke(C32019c cVar, List<? extends User> list) {
                    if (C52711k.m112239a((Object) C32019c.class, (Object) C52860x.class)) {
                        if (cVar != null) {
                            return (C52860x) cVar;
                        }
                        throw new C52857u("null cannot be cast to non-null type kotlin.Unit");
                    } else if (C52711k.m112239a((Object) C52860x.class, (Object) C52860x.class)) {
                        return C52860x.f131107a;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.mo22475a((C52686q<? super K, ? super V, ? super V1, ? extends V1>) new C52686q<C32019c, List<? extends User>, List<? extends User>, List<? extends User>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32021a f83604a;

                {
                    this.f83604a = r1;
                }

                public final List<User> invoke(C32019c cVar, List<? extends User> list, List<? extends User> list2) {
                    boolean z;
                    if (cVar.f83592c == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (list2 == null) {
                            list2 = C52575l.m112097a();
                        }
                        Collection collection = list2;
                        if (list == null) {
                            list = C52575l.m112097a();
                        }
                        if (list != null) {
                            return C52575l.m112133c(collection, list);
                        }
                        throw new RuntimeException();
                    } else if (list == null) {
                        return null;
                    } else {
                        if (list != null) {
                            return list;
                        }
                        throw new RuntimeException();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.repository.d$b */
    public static final class C32024b extends C52712l implements C52671b<C11692d<? extends Object, User, ? extends Object, List<? extends User>>, C52860x> {
        public C32024b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11692d) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11692d<? extends Object, User, ? extends Object, List<User>> dVar) {
            C52711k.m112240b(dVar, "$this$predicatedSyncTo");
            dVar.mo22476a(C320251.INSTANCE);
            dVar.mo22477b(new C52682m<User, List<? extends User>, List<? extends User>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32024b f83605a;

                {
                    this.f83605a = r1;
                }

                /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.aweme.profile.model.User, code=java.lang.Object, for r5v0, types: [java.lang.Object, com.ss.android.ugc.aweme.profile.model.User] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.util.List<com.p683ss.android.ugc.aweme.profile.model.User> invoke(java.lang.Object r5, java.util.List<? extends com.p683ss.android.ugc.aweme.profile.model.User> r6) {
                    /*
                        r4 = this;
                        java.lang.String r0 = "curV"
                        p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r1 = 10
                        int r1 = p2628d.p2629a.C52575l.m112104a(r6, r1)
                        r0.<init>(r1)
                        java.util.Collection r0 = (java.util.Collection) r0
                        java.util.Iterator r6 = r6.iterator()
                    L_0x0018:
                        boolean r1 = r6.hasNext()
                        if (r1 == 0) goto L_0x0045
                        java.lang.Object r1 = r6.next()
                        r2 = r5
                        com.ss.android.ugc.aweme.profile.model.User r2 = (com.p683ss.android.ugc.aweme.profile.model.User) r2
                        r3 = r1
                        com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3
                        java.lang.String r3 = r3.getUid()
                        java.lang.String r2 = r2.getUid()
                        boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r2)
                        if (r2 == 0) goto L_0x0041
                        boolean r2 = r5 instanceof java.lang.Object
                        if (r2 != 0) goto L_0x003c
                        r2 = 0
                        goto L_0x003d
                    L_0x003c:
                        r2 = r5
                    L_0x003d:
                        if (r2 != 0) goto L_0x0040
                        goto L_0x0041
                    L_0x0040:
                        r1 = r2
                    L_0x0041:
                        r0.add(r1)
                        goto L_0x0018
                    L_0x0045:
                        java.util.List r0 = (java.util.List) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.repository.C32020d.C32024b.C320262.invoke(java.lang.Object, java.util.List):java.util.List");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.repository.d$c */
    public static final class C32027c extends C52712l implements C52671b<C11683a<? extends Object, List<? extends User>, String, User>, C52860x> {
        public C32027c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C11683a) obj);
            return C52860x.f131107a;
        }

        public final void invoke(C11683a<? extends Object, List<User>, String, User> aVar) {
            C52711k.m112240b(aVar, "$receiver");
            aVar.mo22473a(new C52671b<List<? extends User>, List<? extends C52847n<? extends String, ? extends User>>>(this) {

                /* renamed from: a */
                final /* synthetic */ C32027c f83606a;

                {
                    this.f83606a = r1;
                }

                public final List<C52847n<String, User>> invoke(List<? extends User> list) {
                    C52711k.m112240b(list, "it");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (User user : iterable) {
                        arrayList.add(C52856t.m112465a(user.getUid(), user));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    public C32020d() {
        mo22482a((C11587b<K, V, ?, ?>) this.f83600a, (C11544e<K1, V1>) this.f83601b, (C52671b<? super C11689c<K, V, K1, List<V1>>, C52860x>) new C32021a<Object,C52860x>());
        mo22481a((C11544e<K, V>) this.f83601b, this.f83602c, (C52671b<? super C11683a<K, List<V>, K1, V1>, C52860x>) new C32027c<Object,C52860x>());
        mo22480a(this.f83602c, (C11544e<K1, V1>) this.f83601b, (C52671b<? super C11692d<K, V, K1, List<V1>>, C52860x>) new C32024b<Object,C52860x>());
    }

    /* renamed from: a */
    public final C2201v<C31995c> mo65211a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        String str3 = str;
        C52711k.m112240b(str3, "userId");
        String str4 = str2;
        C52711k.m112240b(str4, "secUserId");
        C32039g gVar = this.f83600a;
        C32019c cVar = r1;
        C32019c cVar2 = new C32019c(str3, str4, j, i, i2, i3, i4, i5, i6, 0, UnReadVideoExperiment.LIKE_USER_LIST, null);
        return gVar.mo22318c(cVar);
    }
}
