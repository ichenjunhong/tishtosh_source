package com.p683ss.android.ugc.aweme;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.account.C18492b;
import com.p683ss.android.account.p1102b.C18494a;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.sdk.p1207a.C19719c;
import com.p683ss.android.ugc.aweme.account.p1277j.C20994a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a.C22088a;
import com.p683ss.android.ugc.aweme.p2042p.C38563a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.C47538a;
import com.p683ss.android.ugc.aweme.user.C47538a.C47539a;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.user.C47557d;
import com.p683ss.android.ugc.aweme.user.C47557d.C47558a;
import com.p683ss.android.ugc.aweme.user.C47557d.C47560b;
import com.p683ss.android.ugc.aweme.user.C47557d.C47561c;
import com.p683ss.android.ugc.aweme.user.p2381b.C47544c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;

/* renamed from: com.ss.android.ugc.aweme.bx */
public final class C24445bx {

    /* renamed from: a */
    public boolean f64823a;

    public C24445bx() {
        C47549c.m102974a();
        if (C47549c.m102978c()) {
            C0013i.m18a(C24460by.f64838a, (Executor) C38563a.m85889a());
        } else {
            C22087a.m54864b("not login");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m59826a() throws Exception {
        Object obj;
        C47557d dVar = C47557d.f119986b;
        String f = C47557d.m102992f();
        synchronized (C47557d.m102989a()) {
            Iterator it = C47557d.f119986b.mo94871d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) ((C47561c) obj).f120010b, (Object) f)) {
                    break;
                }
            }
            C47561c cVar = (C47561c) obj;
            if (cVar != null) {
                C52760c a = C52728w.m112245a(User.class);
                if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(User.class))) {
                    if (cVar.mo94880a().f120001a) {
                        cVar.mo94880a().mo94876a();
                    } else {
                        cVar.mo94880a().mo94876a();
                    }
                } else if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(C47558a.class))) {
                    cVar.mo94881b().mo94876a();
                } else if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(C47538a.class))) {
                    cVar.mo94882c().mo94876a();
                }
            }
        }
        C22088a.m54865a(C47557d.m102992f());
        return null;
    }

    /* renamed from: a */
    public final void mo50211a(C13207b bVar, String str) {
        String str2;
        String str3;
        Object obj;
        String str4;
        boolean z;
        Object obj2;
        C13207b bVar2 = bVar;
        if (bVar2 == null || bVar2.f34473a == 0) {
            return;
        }
        C20994a.m53359a(bVar);
        this.f64823a = bVar2.f34477e;
        C18492b bVar3 = (C18492b) bVar2;
        C19718b a = C19718b.m48210a();
        Application b = C24514cb.m59923b();
        C19719c[] cVarArr = a.f54289a;
        int length = cVarArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            C18494a aVar = null;
            if (i >= length) {
                break;
            }
            C19719c cVar = cVarArr[i];
            cVar.f54307p = z2;
            if (bVar3 != null && cVar != null) {
                if (cVar.f54305n != null && cVar.f54305n.length != 0) {
                    String[] strArr = cVar.f54305n;
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        C18494a aVar2 = (C18494a) bVar3.f34475c.get(strArr[i2]);
                        if (aVar2 != null) {
                            aVar = aVar2;
                            break;
                        }
                        i2++;
                    }
                } else {
                    aVar = (C18494a) bVar3.f34475c.get(cVar.f54304m);
                }
            }
            if (aVar != null) {
                cVar.f54307p = true;
                cVar.f54311t = aVar.f50956j;
                cVar.f54312u = aVar.f50957k;
                cVar.f54308q = aVar.f50951e;
                cVar.f54309r = aVar.f50952f;
                cVar.f54310s = aVar.f50953g;
                cVar.f54313v = -1;
            }
            i++;
            z2 = false;
        }
        a.mo41122a((Context) b);
        try {
            str2 = bVar2.f34481i.getString("country_code");
        } catch (JSONException unused) {
            str2 = "";
        }
        C47557d.m102990a(String.valueOf(bVar2.f34473a));
        C47557d dVar = C47557d.f119986b;
        C47558a a2 = C47558a.m103010a(bVar3.f34473a, bVar3.f34478f, bVar3.f50921l, bVar3.f50932I, str2, bVar3.f34474b);
        C52711k.m112240b(a2, "u");
        C52760c a3 = C52728w.m112245a(C47558a.class);
        if (C52711k.m112239a((Object) a3, (Object) C52728w.m112245a(User.class))) {
            str3 = ((User) a2).getUid();
        } else if (C52711k.m112239a((Object) a3, (Object) C52728w.m112245a(C47558a.class))) {
            str3 = a2.f119995a;
        } else if (C52711k.m112239a((Object) a3, (Object) C52728w.m112245a(C47538a.class))) {
            str3 = ((C47538a) a2).f119947a;
        } else {
            str3 = "0";
        }
        if (str3 != null) {
            synchronized (C47557d.m102989a()) {
                Iterator it = C47557d.f119986b.mo94871d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C52711k.m112239a((Object) ((C47561c) obj).f120010b, (Object) str3)) {
                        break;
                    }
                }
                C47561c cVar2 = (C47561c) obj;
                if (cVar2 != null) {
                    C52760c a4 = C52728w.m112245a(C47558a.class);
                    if (C52711k.m112239a((Object) a4, (Object) C52728w.m112245a(User.class))) {
                        cVar2.mo94880a().mo94877a((User) a2);
                        C47560b c = cVar2.mo94882c();
                        Object a5 = cVar2.mo94880a().mo94876a();
                        if (a5 != null) {
                            c.mo94877a(C47539a.m102966a((User) a5));
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                        }
                    } else if (C52711k.m112239a((Object) a4, (Object) C52728w.m112245a(C47558a.class))) {
                        cVar2.mo94881b().mo94877a(a2);
                    } else if (C52711k.m112239a((Object) a4, (Object) C52728w.m112245a(C47538a.class))) {
                        cVar2.mo94882c().mo94877a((C47538a) a2);
                    }
                    cVar2.mo94883d();
                }
                if (cVar2 == null) {
                    C47557d dVar2 = C47557d.f119986b;
                    C52760c a6 = C52728w.m112245a(C47558a.class);
                    if (C52711k.m112239a((Object) a6, (Object) C52728w.m112245a(User.class))) {
                        str4 = ((User) a2).getUid();
                    } else if (C52711k.m112239a((Object) a6, (Object) C52728w.m112245a(C47558a.class))) {
                        str4 = a2.f119995a;
                    } else if (C52711k.m112239a((Object) a6, (Object) C52728w.m112245a(C47538a.class))) {
                        str4 = ((C47538a) a2).f119947a;
                    } else {
                        str4 = "0";
                    }
                    if (str4 != null) {
                        if (!C47557d.m102993f(str4)) {
                            Iterable h = C47557d.m102994h();
                            if (!(h instanceof Collection) || !((Collection) h).isEmpty()) {
                                Iterator it2 = h.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (C52711k.m112239a((Object) (String) it2.next(), (Object) str4)) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                                Editor edit = dVar2.mo94868c().edit();
                                List arrayList = new ArrayList();
                                arrayList.addAll(C47557d.m102994h());
                                arrayList.add(str4);
                                edit.putString("logged_in_uid_list", C52575l.m112120a(arrayList, ",", null, null, 0, null, null, 62, null));
                                edit.apply();
                                Iterator it3 = dVar2.mo94871d().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it3.next();
                                    if (C52711k.m112239a((Object) ((C47561c) obj2).f120010b, (Object) str4)) {
                                        break;
                                    }
                                }
                                C47561c cVar3 = (C47561c) obj2;
                                if (cVar3 != null) {
                                    C52760c a7 = C52728w.m112245a(C47558a.class);
                                    if (C52711k.m112239a((Object) a7, (Object) C52728w.m112245a(User.class))) {
                                        cVar3.mo94880a().mo94877a((User) a2);
                                        C47560b c2 = cVar3.mo94882c();
                                        Object a8 = cVar3.mo94880a().mo94876a();
                                        if (a8 != null) {
                                            c2.mo94877a(C47539a.m102966a((User) a8));
                                        } else {
                                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                                        }
                                    } else if (C52711k.m112239a((Object) a7, (Object) C52728w.m112245a(C47558a.class))) {
                                        cVar3.mo94881b().mo94877a(a2);
                                    } else if (C52711k.m112239a((Object) a7, (Object) C52728w.m112245a(C47538a.class))) {
                                        cVar3.mo94882c().mo94877a((C47538a) a2);
                                    }
                                    cVar3.mo94883d();
                                }
                            }
                        }
                    }
                }
            }
        }
        C47557d dVar3 = C47557d.f119986b;
        C52711k.m112240b(bVar3, "u");
        String str5 = bVar3.f50921l;
        C52711k.m112236a((Object) str5, "u.userName");
        String str6 = bVar3.f50923n;
        C52711k.m112236a((Object) str6, "u.avatarUrl");
        C47538a aVar3 = new C47538a(String.valueOf(bVar3.f34473a), "", "", str5, str6);
        dVar3.mo94865a(aVar3);
        C20994a.m53366b("synchronous_check");
        C0013i.m18a((Callable<TResult>) new C24475bz<TResult>(bVar2), (Executor) C38563a.m85889a());
        C47544c.m102972a(bVar3.f50933J);
    }
}
