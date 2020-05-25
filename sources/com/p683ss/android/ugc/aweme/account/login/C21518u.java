package com.p683ss.android.ugc.aweme.account.login;

import com.google.gson.C17971f;
import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C24046bs;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52777b;
import p2628d.p2649l.C52785g;
import p2628d.p2649l.C52786h;
import p2628d.p2649l.C52794m.C52798d;
import p2628d.p2649l.C52799n;

/* renamed from: com.ss.android.ugc.aweme.account.login.u */
public final class C21518u {

    /* renamed from: a */
    static boolean f58349a = false;

    /* renamed from: b */
    public static List<BaseLoginMethod> f58350b = new ArrayList();

    /* renamed from: c */
    static volatile boolean f58351c;

    /* renamed from: d */
    public static final C21518u f58352d = new C21518u();

    /* renamed from: com.ss.android.ugc.aweme.account.login.u$a */
    static final class C21519a extends C52712l implements C52671b<BaseLoginMethod, C52860x> {

        /* renamed from: a */
        final /* synthetic */ List f58353a;

        C21519a(List list) {
            this.f58353a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo45719a((BaseLoginMethod) obj);
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo45719a(BaseLoginMethod baseLoginMethod) {
            C52711k.m112240b(baseLoginMethod, "newMethod");
            if (C21518u.m54174a(baseLoginMethod) || baseLoginMethod.getLoginMethodName() == LoginMethodName.PHONE_ONE_KEY) {
                this.f58353a.add(baseLoginMethod);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.u$b */
    static final class C21520b<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C21520b f58354a = new C21520b();

        /* renamed from: com.ss.android.ugc.aweme.account.login.u$b$a */
        public static final class C21521a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C52594a.m112153a(((BaseLoginMethod) t2).getExpires(), ((BaseLoginMethod) t).getExpires());
            }
        }

        C21520b() {
        }

        public final /* synthetic */ Object call() {
            C52785g gVar;
            C21518u uVar = C21518u.f58352d;
            C52785g k = C52575l.m112148k(C21518u.f58350b);
            Comparator aVar = new C21521a();
            C52711k.m112240b(k, "$this$sortedWith");
            C52711k.m112240b(aVar, "comparator");
            C52785g dVar = new C52798d(k, aVar);
            C52711k.m112240b(dVar, "$this$take");
            if (dVar instanceof C52777b) {
                gVar = ((C52777b) dVar).mo110350a(5);
            } else {
                gVar = new C52799n(dVar, 5);
            }
            C21518u.f58350b = C52786h.m112354h(gVar);
            ((C22042y) C24046bs.m58875a(C23826bi.m58460b(), C22042y.class)).mo46100a(new C17971f().mo34889b(C21518u.f58350b));
            C21518u uVar2 = C21518u.f58352d;
            if (C21518u.f58349a) {
                Iterator it = C21518u.f58350b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.u$c */
    static final class C21522c<V> implements Callable<List<? extends BaseLoginMethod>> {

        /* renamed from: a */
        public static final C21522c f58355a = new C21522c();

        C21522c() {
        }

        public final /* synthetic */ Object call() {
            return C21518u.f58350b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.u$d */
    static final class C21523d<V> implements Callable<List<? extends BaseLoginMethod>> {

        /* renamed from: a */
        public static final C21523d f58356a = new C21523d();

        C21523d() {
        }

        public final /* synthetic */ Object call() {
            C21518u uVar = C21518u.f58352d;
            if (C21518u.f58351c) {
                return C21518u.f58350b;
            }
            C21518u uVar2 = C21518u.f58352d;
            List arrayList = new ArrayList();
            C21519a aVar = new C21519a(arrayList);
            C17971f fVar = new C17971f();
            C18082l a = new C18087q().mo35029a(((C22042y) C24046bs.m58875a(C23826bi.m58460b(), C22042y.class)).mo46102b("[]"));
            if (a != null) {
                for (C18082l lVar : (C17980i) a) {
                    C52711k.m112236a((Object) lVar, "it");
                    C18082l b = lVar.mo35009m().mo35022b("loginMethodName");
                    C52711k.m112236a((Object) b, "it.asJsonObject[\"loginMethodName\"]");
                    String c = b.mo34905c();
                    if (C52711k.m112239a((Object) c, (Object) LoginMethodName.EMAIL_PASS.name()) || C52711k.m112239a((Object) c, (Object) LoginMethodName.USER_NAME_PASS.name())) {
                        Object a2 = fVar.mo34881a(lVar, AccountPassLoginMethod.class);
                        C52711k.m112236a(a2, "gson.fromJson(it, Accoun…sLoginMethod::class.java)");
                        aVar.mo45719a((BaseLoginMethod) a2);
                    } else if (C52711k.m112239a((Object) c, (Object) LoginMethodName.PHONE_NUMBER_PASS.name()) || C52711k.m112239a((Object) c, (Object) LoginMethodName.PHONE_SMS.name()) || C52711k.m112239a((Object) c, (Object) LoginMethodName.PHONE_ONE_KEY.name())) {
                        Object a3 = fVar.mo34881a(lVar, PhoneLoginMethod.class);
                        C52711k.m112236a(a3, "gson.fromJson(it, PhoneLoginMethod::class.java)");
                        aVar.mo45719a((BaseLoginMethod) a3);
                    } else if (C52711k.m112239a((Object) c, (Object) LoginMethodName.THIRD_PARTY.name())) {
                        Object a4 = fVar.mo34881a(lVar, TPLoginMethod.class);
                        C52711k.m112236a(a4, "gson.fromJson(it, TPLoginMethod::class.java)");
                        aVar.mo45719a((BaseLoginMethod) a4);
                    } else if (C52711k.m112239a((Object) c, (Object) LoginMethodName.DEFAULT.name())) {
                        Object a5 = fVar.mo34881a(lVar, BaseLoginMethod.class);
                        C52711k.m112236a(a5, "gson.fromJson(it, BaseLoginMethod::class.java)");
                        aVar.mo45719a((BaseLoginMethod) a5);
                    }
                }
                C21518u.f58350b = arrayList;
                C21518u.f58352d.mo45718c();
                C21518u uVar3 = C21518u.f58352d;
                C21518u.f58351c = true;
                return C21518u.f58350b;
            }
            throw new C52857u("null cannot be cast to non-null type com.google.gson.JsonArray");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.u$e */
    static final class C21524e extends C52712l implements C52671b<BaseLoginMethod, Boolean> {

        /* renamed from: a */
        final /* synthetic */ BaseLoginMethod f58357a;

        C21524e(BaseLoginMethod baseLoginMethod) {
            this.f58357a = baseLoginMethod;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
            C52711k.m112240b(baseLoginMethod, "it");
            return Boolean.valueOf(C52711k.m112239a((Object) baseLoginMethod.getUid(), (Object) this.f58357a.getUid()));
        }
    }

    private C21518u() {
    }

    /* renamed from: e */
    private static void m54178e() {
        C0013i.m16a((Callable<TResult>) C21520b.f58354a);
    }

    /* renamed from: a */
    public static final C0013i<List<BaseLoginMethod>> m54169a() {
        if (f58351c) {
            C0013i<List<BaseLoginMethod>> a = C0013i.m16a((Callable<TResult>) C21522c.f58355a);
            C52711k.m112236a((Object) a, "Task.callInBackground(Ca…@Callable loginMethods })");
            return a;
        }
        C0013i<List<BaseLoginMethod>> a2 = C0013i.m16a((Callable<TResult>) C21523d.f58356a);
        C52711k.m112236a((Object) a2, "Task.callInBackground(Ca…ethods\n                })");
        return a2;
    }

    /* renamed from: d */
    private static boolean m54177d() {
        return ((C22042y) C24046bs.m58875a(C23826bi.m58460b(), C22042y.class)).mo46103b(true);
    }

    /* renamed from: c */
    public final void mo45718c() {
        boolean z;
        boolean z2;
        Iterable iterable = f58350b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((BaseLoginMethod) it.next()).isExpired()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            Iterable iterable2 = f58350b;
            Collection arrayList = new ArrayList();
            for (Object next : iterable2) {
                BaseLoginMethod baseLoginMethod = (BaseLoginMethod) next;
                if (!baseLoginMethod.isExpired() || baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            f58350b = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
            m54178e();
        }
    }

    /* renamed from: b */
    public static final BaseLoginMethod m54175b() {
        Object obj;
        LoginMethodName loginMethodName;
        boolean z;
        BaseLoginMethod baseLoginMethod;
        BaseLoginMethod baseLoginMethod2;
        if (!m54177d()) {
            BaseLoginMethod baseLoginMethod3 = new BaseLoginMethod(null, null, null, null, 15, null);
            return baseLoginMethod3;
        }
        f58352d.mo45718c();
        if (f58349a) {
            Iterator it = f58350b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = f58350b.iterator();
        Object obj2 = null;
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                Comparable expires = ((BaseLoginMethod) obj).getExpires();
                do {
                    Object next = it2.next();
                    Comparable expires2 = ((BaseLoginMethod) next).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        obj = next;
                        expires = expires2;
                    }
                } while (it2.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod4 = (BaseLoginMethod) obj;
        if (baseLoginMethod4 != null) {
            loginMethodName = baseLoginMethod4.getLoginMethodName();
        } else {
            loginMethodName = null;
        }
        if (loginMethodName == LoginMethodName.PHONE_ONE_KEY) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            obj = null;
        }
        BaseLoginMethod baseLoginMethod5 = (BaseLoginMethod) obj;
        if (baseLoginMethod5 != null) {
            baseLoginMethod = new BaseLoginMethod(baseLoginMethod5.getUid(), LoginMethodName.DEFAULT, baseLoginMethod5.getCommonUserInfo(), baseLoginMethod5.getExpires());
        } else {
            baseLoginMethod = null;
        }
        if (baseLoginMethod != null) {
            return baseLoginMethod;
        }
        Iterator it3 = f58350b.iterator();
        if (it3.hasNext()) {
            obj2 = it3.next();
            if (it3.hasNext()) {
                Comparable expires3 = ((BaseLoginMethod) obj2).getExpires();
                do {
                    Object next2 = it3.next();
                    Comparable expires4 = ((BaseLoginMethod) next2).getExpires();
                    if (expires3.compareTo(expires4) < 0) {
                        obj2 = next2;
                        expires3 = expires4;
                    }
                } while (it3.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod6 = (BaseLoginMethod) obj2;
        if (baseLoginMethod6 == null) {
            baseLoginMethod2 = new BaseLoginMethod(null, null, null, null, 15, null);
        } else {
            baseLoginMethod2 = baseLoginMethod6;
        }
        return baseLoginMethod2;
    }

    /* renamed from: b */
    public static final void m54176b(BaseLoginMethod baseLoginMethod) {
        C52711k.m112240b(baseLoginMethod, "baseLoginMethod");
        C52575l.m112110a((List) f58350b, (C52671b) new C21524e(baseLoginMethod));
        f58350b.add(baseLoginMethod);
        m54178e();
    }

    /* renamed from: a */
    public static boolean m54174a(BaseLoginMethod baseLoginMethod) {
        if (!(baseLoginMethod instanceof PhoneLoginMethod)) {
            baseLoginMethod = null;
        }
        PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
        if (phoneLoginMethod != null && phoneLoginMethod.getPhoneNumber().getNationalNumber() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m54173a(User user) {
        C52711k.m112240b(user, "user");
        Iterable iterable = f58350b;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (C52711k.m112239a((Object) ((BaseLoginMethod) next).getUid(), (Object) user.getUid())) {
                arrayList.add(next);
            }
        }
        for (BaseLoginMethod updateUserInfo : (List) arrayList) {
            updateUserInfo.updateUserInfo(user);
        }
        m54178e();
    }

    /* renamed from: a */
    public static final BaseLoginMethod m54170a(LoginMethodName loginMethodName) {
        Object obj;
        BaseLoginMethod baseLoginMethod;
        boolean z;
        C52711k.m112240b(loginMethodName, "methodName");
        if (!m54177d()) {
            BaseLoginMethod baseLoginMethod2 = new BaseLoginMethod(null, null, null, null, 15, null);
            return baseLoginMethod2;
        }
        f58352d.mo45718c();
        Iterable iterable = f58350b;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((BaseLoginMethod) next).getLoginMethodName() != loginMethodName) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterator it = ((List) arrayList).iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                Comparable expires = ((BaseLoginMethod) obj).getExpires();
                do {
                    Object next2 = it.next();
                    Comparable expires2 = ((BaseLoginMethod) next2).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        obj = next2;
                        expires = expires2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod3 = (BaseLoginMethod) obj;
        if (baseLoginMethod3 == null) {
            baseLoginMethod = new BaseLoginMethod(null, null, null, null, 15, null);
        } else {
            baseLoginMethod = baseLoginMethod3;
        }
        return baseLoginMethod;
    }
}
