package com.p683ss.android.ugc.aweme.user;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.C24514cb;
import com.p683ss.android.ugc.aweme.account.p1302o.C22087a.C22088a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.user.C47538a.C47539a;
import com.p683ss.android.ugc.aweme.user.p2384e.C47576c;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.user.d */
public final class C47557d {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f119985a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47557d.class), "gson", "getGson()Lcom/google/gson/Gson;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47557d.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47557d.class), "defaultNullUser", "getDefaultNullUser()Lcom/ss/android/ugc/aweme/profile/model/User;"))};

    /* renamed from: b */
    public static final C47557d f119986b = new C47557d();

    /* renamed from: c */
    private static final Object f119987c = new Object();

    /* renamed from: d */
    private static final C52668f f119988d = C52732g.m112285a(C47569e.f120018a);

    /* renamed from: e */
    private static final C52668f f119989e = C52732g.m112285a(C47570f.f120019a);

    /* renamed from: f */
    private static final C52668f f119990f = C52732g.m112285a(C47568d.f120017a);

    /* renamed from: g */
    private static final List<C47561c> f119991g = new ArrayList();

    /* renamed from: h */
    private static String f119992h = "";

    /* renamed from: i */
    private static String f119993i = "";

    /* renamed from: com.ss.android.ugc.aweme.user.d$a */
    public static final class C47558a {

        /* renamed from: g */
        public static final C47559a f119994g = new C47559a(null);
        @C17952c(mo34828a = "uid")

        /* renamed from: a */
        public final String f119995a;
        @C17952c(mo34828a = "session_key")

        /* renamed from: b */
        public final String f119996b;
        @C17952c(mo34828a = "name")

        /* renamed from: c */
        public final String f119997c;
        @C17952c(mo34828a = "user_verified")

        /* renamed from: d */
        public final boolean f119998d;
        @C17952c(mo34828a = "country_code")

        /* renamed from: e */
        public String f119999e;
        @C17952c(mo34828a = "sec_uid")

        /* renamed from: f */
        public String f120000f;

        /* renamed from: com.ss.android.ugc.aweme.user.d$a$a */
        public static final class C47559a {
            private C47559a() {
            }

            public /* synthetic */ C47559a(C52707g gVar) {
                this();
            }

            /* renamed from: a */
            public static C47558a m103011a(long j, String str, String str2, boolean z, String str3, String str4) {
                String valueOf;
                C52711k.m112240b(str, "session");
                C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
                C52711k.m112240b(str3, "countryCode");
                C52711k.m112240b(str4, "secUid");
                if (j == 0) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(j);
                }
                C47558a aVar = new C47558a(valueOf, str, str2, z, str3, str4);
                return aVar;
            }
        }

        /* renamed from: a */
        public static final C47558a m103010a(long j, String str, String str2, boolean z, String str3, String str4) {
            return C47559a.m103011a(j, str, str2, z, str3, str4);
        }

        public C47558a(String str, String str2, String str3, boolean z, String str4, String str5) {
            C52711k.m112240b(str, "uid");
            C52711k.m112240b(str2, "session");
            C52711k.m112240b(str3, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(str4, "countryCode");
            C52711k.m112240b(str5, "secUid");
            this.f119995a = str;
            this.f119996b = str2;
            this.f119997c = str3;
            this.f119998d = z;
            this.f119999e = str4;
            this.f120000f = str5;
        }

        public /* synthetic */ C47558a(String str, String str2, String str3, boolean z, String str4, String str5, int i, C52707g gVar) {
            this(str, "", "", false, "", "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$b */
    public static final class C47560b<T> {

        /* renamed from: a */
        public boolean f120001a;

        /* renamed from: b */
        public final String f120002b;

        /* renamed from: c */
        public final String f120003c;

        /* renamed from: d */
        private final Class<? extends T> f120004d;

        /* renamed from: e */
        private final String f120005e;

        /* renamed from: f */
        private ArrayList<T> f120006f = new ArrayList<>(1);

        /* renamed from: g */
        private T f120007g;

        /* renamed from: h */
        private final C52670a<T> f120008h;

        /* renamed from: d */
        private final T m103013d() {
            boolean z;
            T t;
            String string = C47557d.f119986b.mo94868c().getString(this.f120005e, "");
            CharSequence charSequence = string;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                t = C47557d.f119986b.mo94866b().mo34885a(string, (Type) this.f120004d);
            } catch (C18091u unused) {
                t = null;
            }
            return t;
        }

        /* renamed from: a */
        public final T mo94876a() {
            if (this.f120001a) {
                return this.f120007g;
            }
            this.f120007g = m103013d();
            if (this.f120007g == null) {
                mo94877a(this.f120008h.invoke());
                mo94878b();
            }
            this.f120001a = true;
            return this.f120007g;
        }

        /* renamed from: b */
        public final void mo94878b() {
            for (Object next : this.f120006f) {
                Editor edit = C47557d.f119986b.mo94868c().edit();
                if (next == null) {
                    edit.remove(this.f120005e);
                } else {
                    edit.putString(this.f120005e, C47557d.f119986b.mo94866b().mo34889b(next));
                }
                edit.commit();
            }
            this.f120006f.clear();
        }

        /* renamed from: c */
        public final void mo94879c() {
            for (Object next : this.f120006f) {
                Editor edit = C47557d.f119986b.mo94868c().edit();
                if (next == null) {
                    edit.remove(this.f120005e);
                } else {
                    edit.putString(this.f120005e, C47557d.f119986b.mo94866b().mo34889b(next));
                }
                edit.apply();
            }
            this.f120006f.clear();
        }

        /* renamed from: b */
        private final void m103012b(T t) {
            this.f120006f.clear();
            this.f120006f.add(t);
        }

        /* renamed from: a */
        public final void mo94877a(T t) {
            if (this.f120007g != t) {
                this.f120007g = t;
                m103012b(t);
                this.f120001a = true;
            }
        }

        public C47560b(String str, String str2, T t, C52670a<? extends T> aVar) {
            C52711k.m112240b(str, "uid");
            C52711k.m112240b(str2, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(t, "dataInitValue");
            C52711k.m112240b(aVar, "upgrade");
            this.f120002b = str;
            this.f120003c = str2;
            this.f120008h = aVar;
            this.f120004d = t.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f120002b);
            sb.append('_');
            sb.append(this.f120003c);
            this.f120005e = sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$c */
    public static final class C47561c {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f120009a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47561c.class), "awemeUser", "getAwemeUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47561c.class), "accountUser", "getAccountUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47561c.class), "significantUser", "getSignificantUser()Lcom/ss/android/ugc/aweme/user/UserStore$PartialUserSyncTask;"))};

        /* renamed from: b */
        public final String f120010b;

        /* renamed from: c */
        private final C52668f f120011c = C52732g.m112285a(new C47564b(this));

        /* renamed from: d */
        private final C52668f f120012d = C52732g.m112285a(new C47562a(this));

        /* renamed from: e */
        private final C52668f f120013e = C52732g.m112285a(new C47566c(this));

        /* renamed from: com.ss.android.ugc.aweme.user.d$c$a */
        static final class C47562a extends C52712l implements C52670a<C47560b<C47558a>> {

            /* renamed from: a */
            final /* synthetic */ C47561c f120014a;

            C47562a(C47561c cVar) {
                this.f120014a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C47558a aVar = new C47558a(this.f120014a.f120010b, null, null, false, null, null, 62, null);
                return new C47560b(this.f120014a.f120010b, "account_user_info", aVar, new C52670a<C47558a>(this.f120014a) {
                    public final String getName() {
                        return "accountUserUpgrade";
                    }

                    public final C52761d getOwner() {
                        return C52728w.m112245a(C47561c.class);
                    }

                    public final String getSignature() {
                        return "accountUserUpgrade()Lcom/ss/android/ugc/aweme/user/UserStore$AccountUser;";
                    }

                    public final /* synthetic */ Object invoke() {
                        return C47576c.m103030b(((C47561c) this.receiver).f120010b);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.d$c$b */
        static final class C47564b extends C52712l implements C52670a<C47560b<User>> {

            /* renamed from: a */
            final /* synthetic */ C47561c f120015a;

            C47564b(C47561c cVar) {
                this.f120015a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                String str = this.f120015a.f120010b;
                User user = new User();
                user.setUid(str);
                user.setAllowStatus(1);
                return new C47560b(this.f120015a.f120010b, "aweme_user_info", user, new C52670a<User>(this.f120015a) {
                    public final String getName() {
                        return "awemeUserUpgrade";
                    }

                    public final C52761d getOwner() {
                        return C52728w.m112245a(C47561c.class);
                    }

                    public final String getSignature() {
                        return "awemeUserUpgrade()Lcom/ss/android/ugc/aweme/profile/model/User;";
                    }

                    public final /* synthetic */ Object invoke() {
                        return ((C47561c) this.receiver).mo94885f();
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.d$c$c */
        static final class C47566c extends C52712l implements C52670a<C47560b<C47538a>> {

            /* renamed from: a */
            final /* synthetic */ C47561c f120016a;

            C47566c(C47561c cVar) {
                this.f120016a = cVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C47538a aVar = new C47538a(this.f120016a.f120010b, null, null, null, null, 30, null);
                return new C47560b(this.f120016a.f120010b, "significant_user_info", aVar, new C52670a<C47538a>(this.f120016a) {
                    public final String getName() {
                        return "significantUserInfoUpgrade";
                    }

                    public final C52761d getOwner() {
                        return C52728w.m112245a(C47561c.class);
                    }

                    public final String getSignature() {
                        return "significantUserInfoUpgrade()Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;";
                    }

                    public final /* synthetic */ Object invoke() {
                        User f = ((C47561c) this.receiver).mo94885f();
                        if (f != null) {
                            return C47539a.m102966a(f);
                        }
                        return null;
                    }
                });
            }
        }

        /* renamed from: a */
        public final C47560b<User> mo94880a() {
            return (C47560b) this.f120011c.getValue();
        }

        /* renamed from: b */
        public final C47560b<C47558a> mo94881b() {
            return (C47560b) this.f120012d.getValue();
        }

        /* renamed from: c */
        public final C47560b<C47538a> mo94882c() {
            return (C47560b) this.f120013e.getValue();
        }

        /* renamed from: d */
        public final void mo94883d() {
            mo94880a().mo94879c();
            mo94881b().mo94879c();
            mo94882c().mo94879c();
        }

        /* renamed from: f */
        public final User mo94885f() {
            Object obj;
            User j = C47557d.f119986b.mo94875j();
            if (j != null) {
                obj = j.getUid();
            } else {
                obj = null;
            }
            if (C52711k.m112239a(obj, (Object) this.f120010b)) {
                return j;
            }
            return null;
        }

        /* renamed from: e */
        public final void mo94884e() {
            mo94880a().mo94877a(null);
            mo94880a().mo94878b();
            mo94881b().mo94877a(null);
            mo94881b().mo94878b();
            mo94882c().mo94877a(null);
            mo94882c().mo94878b();
        }

        public C47561c(String str) {
            C52711k.m112240b(str, "uid");
            this.f120010b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$d */
    static final class C47568d extends C52712l implements C52670a<User> {

        /* renamed from: a */
        public static final C47568d f120017a = new C47568d();

        C47568d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            User user = new User();
            user.setAllowStatus(1);
            return user;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$e */
    static final class C47569e extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C47569e f120018a = new C47569e();

        C47569e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17971f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$f */
    static final class C47570f extends C52712l implements C52670a<SharedPreferences> {

        /* renamed from: a */
        public static final C47570f f120019a = new C47570f();

        C47570f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C35807d.m80935a(C24514cb.m59923b(), "aweme_user", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.d$g */
    static final class C47571g extends C52712l implements C52671b<C47561c, Boolean> {

        /* renamed from: a */
        final /* synthetic */ List f120020a;

        C47571g(List list) {
            this.f120020a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C47561c cVar = (C47561c) obj;
            C52711k.m112240b(cVar, "it");
            return Boolean.valueOf(!this.f120020a.contains(cVar.f120010b));
        }
    }

    private C47557d() {
    }

    /* renamed from: a */
    public static Object m102989a() {
        return f119987c;
    }

    /* renamed from: b */
    public final C17971f mo94866b() {
        return (C17971f) f119988d.getValue();
    }

    /* renamed from: c */
    public final SharedPreferences mo94868c() {
        return (SharedPreferences) f119989e.getValue();
    }

    /* renamed from: e */
    public final boolean mo94873e() {
        if (!m102993f(m102992f())) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static void m102995i() {
        synchronized (f119987c) {
            for (C47561c d : f119986b.mo94871d()) {
                d.mo94883d();
            }
            f119986b.mo94868c().edit().putString("current_foreground_uid", m102992f()).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m102996k() {
        /*
            r5 = this;
            android.app.Application r0 = com.p683ss.android.ugc.aweme.C24514cb.m59923b()
            java.lang.String r1 = "com.ss.spipe_setting"
            r2 = 0
            android.content.SharedPreferences r0 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0, r1, r2)
            java.lang.String r1 = "user_id"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x001c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x001c:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.mo94875j()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r0 = "0"
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.C47557d.m102996k():java.lang.String");
    }

    /* renamed from: j */
    public final User mo94875j() {
        String string = mo94868c().getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) mo94866b().mo34884a(string, User.class);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: h */
    public static List<String> m102994h() {
        boolean z;
        List<String> list;
        synchronized (f119987c) {
            String string = f119986b.mo94868c().getString("logged_in_uid_list", "");
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list = C52575l.m112097a();
            } else {
                list = C52830p.m112452b((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
            }
        }
        return list;
    }

    /* renamed from: d */
    public final List<C47561c> mo94871d() {
        Object obj;
        List<String> h = m102994h();
        for (String str : h) {
            Iterator it = f119991g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) ((C47561c) obj).f120010b, (Object) str)) {
                    break;
                }
            }
            if (obj == null) {
                f119991g.add(new C47561c(str));
            }
        }
        m102991a(f119991g, new C47571g(h));
        return f119991g;
    }

    /* renamed from: g */
    public final synchronized String mo94874g() {
        boolean z;
        String str;
        boolean z2 = false;
        if (f119993i.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = f119993i;
        } else {
            String string = mo94868c().getString("latest_logged_in_uid_list", "");
            if (string == null) {
                C52711k.m112234a();
            }
            if (string.length() > 0) {
                z2 = true;
            }
            if (z2) {
                str = mo94868c().getString("latest_logged_in_uid_list", "0");
                if (str == null) {
                    C52711k.m112234a();
                }
            } else {
                str = mo94868c().getString("last_uid", "");
                if (str == null) {
                    C52711k.m112234a();
                }
            }
        }
        f119993i = str;
        return str;
    }

    /* renamed from: f */
    public static String m102992f() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        synchronized (f119987c) {
            boolean z3 = false;
            if (f119992h.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = f119992h;
            } else {
                String string = f119986b.mo94868c().getString("current_foreground_uid", "");
                if (string == null) {
                    C52711k.m112234a();
                }
                if (string.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    str = f119986b.mo94868c().getString("current_foreground_uid", "0");
                    if (str == null) {
                        C52711k.m112234a();
                    }
                } else if (!m102993f(f119986b.m102996k())) {
                    str = f119986b.m102996k();
                } else {
                    User j = f119986b.mo94875j();
                    if (j != null) {
                        str2 = j.getUid();
                    } else {
                        str2 = null;
                    }
                    CharSequence charSequence = str2;
                    if (charSequence == null || charSequence.length() == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        str = "0";
                    } else {
                        if (j == null) {
                            C52711k.m112234a();
                        }
                        str = j.getUid();
                    }
                    C52711k.m112236a((Object) str, "if (user?.uid.isNullOrEm… NULL_UID else user!!.uid");
                }
            }
            f119992h = str;
        }
        return str;
    }

    /* renamed from: f */
    public static boolean m102993f(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C52711k.m112239a((Object) str, (Object) "0")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo94867b(String str) {
        C52711k.m112240b(str, "value");
        if (!C52711k.m112239a((Object) f119993i, (Object) str)) {
            f119993i = str;
            mo94868c().edit().putString("latest_logged_in_uid_list", str).apply();
        }
    }

    /* renamed from: a */
    public static void m102990a(String str) {
        boolean z;
        String str2;
        C52711k.m112240b(str, "value");
        synchronized (f119987c) {
            if (!C52711k.m112239a((Object) f119992h, (Object) str)) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = "0";
                } else {
                    str2 = str;
                }
                f119992h = str2;
                C22088a.m54865a(str);
                f119986b.mo94868c().edit().putString("current_foreground_uid", f119992h).commit();
            }
        }
    }

    /* renamed from: a */
    public final User mo94863a(boolean z) {
        User user;
        Object obj;
        User user2;
        String f = m102992f();
        synchronized (m102989a()) {
            Iterator it = f119986b.mo94871d().iterator();
            while (true) {
                user = null;
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
                        user2 = (User) cVar.mo94880a().mo94876a();
                    } else {
                        user2 = (User) cVar.mo94880a().mo94876a();
                    }
                } else if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(C47558a.class))) {
                    user2 = (User) cVar.mo94881b().mo94876a();
                } else if (C52711k.m112239a((Object) a, (Object) C52728w.m112245a(C47538a.class))) {
                    user2 = (User) cVar.mo94882c().mo94876a();
                }
                user = user2;
            }
        }
        if (user == null) {
            return (User) f119990f.getValue();
        }
        return user;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        return r3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.user.C47557d.C47558a mo94869c(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "uid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.Object r0 = m102989a()
            monitor-enter(r0)
            com.ss.android.ugc.aweme.user.d r1 = f119986b     // Catch:{ all -> 0x0097 }
            java.util.List r1 = r1.mo94871d()     // Catch:{ all -> 0x0097 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0097 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0097 }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0097 }
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0097 }
            r4 = r2
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r4     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = r4.f120010b     // Catch:{ all -> 0x0097 }
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r6)     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0016
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            com.ss.android.ugc.aweme.user.d$c r2 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r2     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0034
            monitor-exit(r0)
            return r3
        L_0x0034:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r6 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r6 = p2628d.p2639f.p2641b.C52728w.m112245a(r6)     // Catch:{ all -> 0x0097 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94880a()     // Catch:{ all -> 0x0097 }
            boolean r6 = r6.f120001a     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94880a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x005a:
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94880a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0066:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94881b()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x007e:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x0097 }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94882c()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r0)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.C47557d.mo94869c(java.lang.String):com.ss.android.ugc.aweme.user.d$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        return r3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.user.C47538a mo94870d(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "uid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.Object r0 = m102989a()
            monitor-enter(r0)
            com.ss.android.ugc.aweme.user.d r1 = f119986b     // Catch:{ all -> 0x0097 }
            java.util.List r1 = r1.mo94871d()     // Catch:{ all -> 0x0097 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0097 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0097 }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0097 }
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0097 }
            r4 = r2
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r4     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = r4.f120010b     // Catch:{ all -> 0x0097 }
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r6)     // Catch:{ all -> 0x0097 }
            if (r4 == 0) goto L_0x0016
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            com.ss.android.ugc.aweme.user.d$c r2 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r2     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0034
            monitor-exit(r0)
            return r3
        L_0x0034:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r6 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r6 = p2628d.p2639f.p2641b.C52728w.m112245a(r6)     // Catch:{ all -> 0x0097 }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94880a()     // Catch:{ all -> 0x0097 }
            boolean r6 = r6.f120001a     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94880a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p683ss.android.ugc.aweme.user.C47538a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x005a:
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94880a()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p683ss.android.ugc.aweme.user.C47538a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0066:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r1 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x0097 }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94881b()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p683ss.android.ugc.aweme.user.C47538a) r3     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x007e:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x0097 }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.user.d$b r6 = r2.mo94882c()     // Catch:{ all -> 0x0097 }
            java.lang.Object r6 = r6.mo94876a()     // Catch:{ all -> 0x0097 }
            r3 = r6
            com.ss.android.ugc.aweme.user.a r3 = (com.p683ss.android.ugc.aweme.user.C47538a) r3     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r0)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.C47557d.mo94870d(java.lang.String):com.ss.android.ugc.aweme.user.a");
    }

    /* renamed from: e */
    public final void mo94872e(String str) {
        Object obj;
        C52711k.m112240b(str, "uid");
        if (C52711k.m112239a((Object) str, (Object) m102992f())) {
            m102990a("0");
        }
        synchronized (f119987c) {
            Iterator it = f119986b.mo94871d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) ((C47561c) obj).f120010b, (Object) str)) {
                    break;
                }
            }
            C47561c cVar = (C47561c) obj;
            if (cVar != null) {
                cVar.mo94884e();
            }
            Collection d = f119986b.mo94871d();
            if (d != null) {
                C52731z.m112266b(d).remove(cVar);
                Editor edit = f119986b.mo94868c().edit();
                String str2 = "logged_in_uid_list";
                Iterable h = m102994h();
                Collection arrayList = new ArrayList();
                for (Object next : h) {
                    if (!C52711k.m112239a((Object) (String) next, (Object) str)) {
                        arrayList.add(next);
                    }
                }
                edit.putString(str2, C52575l.m112120a((List) arrayList, ",", null, null, 0, null, null, 62, null)).apply();
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94864a(com.p683ss.android.ugc.aweme.profile.model.User r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "u"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r2 = p2628d.p2639f.p2641b.C52728w.m112245a(r2)
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r2 == 0) goto L_0x001e
            java.lang.String r1 = r18.getUid()
            goto L_0x0044
        L_0x001e:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r2 = p2628d.p2639f.p2641b.C52728w.m112245a(r2)
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r2 == 0) goto L_0x0030
            r1 = r0
            com.ss.android.ugc.aweme.user.d$a r1 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r1
            java.lang.String r1 = r1.f119995a
            goto L_0x0044
        L_0x0030:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r2 = p2628d.p2639f.p2641b.C52728w.m112245a(r2)
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x0042
            r1 = r0
            com.ss.android.ugc.aweme.user.a r1 = (com.p683ss.android.ugc.aweme.user.C47538a) r1
            java.lang.String r1 = r1.f119947a
            goto L_0x0044
        L_0x0042:
            java.lang.String r1 = "0"
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.Object r2 = m102989a()
            monitor-enter(r2)
            com.ss.android.ugc.aweme.user.d r3 = f119986b     // Catch:{ all -> 0x021c }
            java.util.List r3 = r3.mo94871d()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x021c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021c }
        L_0x0058:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021c }
            r5 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f120010b     // Catch:{ all -> 0x021c }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0058
            goto L_0x0070
        L_0x006f:
            r4 = r5
        L_0x0070:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r3 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            java.lang.Object r3 = r3.mo94876a()     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r3 = com.p683ss.android.ugc.aweme.user.C47538a.C47539a.m102966a(r3)     // Catch:{ all -> 0x021c }
            r1.mo94877a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00a5:
            d.u r0 = new d.u     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x00ad:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94881b()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x021c }
            r1.mo94877a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00c4:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.a r3 = (com.p683ss.android.ugc.aweme.user.C47538a) r3     // Catch:{ all -> 0x021c }
            r1.mo94877a(r3)     // Catch:{ all -> 0x021c }
        L_0x00da:
            r4.mo94883d()     // Catch:{ all -> 0x021c }
        L_0x00dd:
            if (r4 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.user.d r1 = f119986b     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r4 = p2628d.p2639f.p2641b.C52728w.m112245a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00f8
            java.lang.String r3 = r18.getUid()     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x00f8:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r4 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r4 = p2628d.p2639f.p2641b.C52728w.m112245a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x010a
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f119995a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x010a:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r4 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r4 = p2628d.p2639f.p2641b.C52728w.m112245a(r4)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x011c
            r3 = r0
            com.ss.android.ugc.aweme.user.a r3 = (com.p683ss.android.ugc.aweme.user.C47538a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f119947a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x011c:
            java.lang.String r3 = "0"
        L_0x011e:
            if (r3 != 0) goto L_0x0122
            goto L_0x021a
        L_0x0122:
            boolean r4 = m102993f(r3)     // Catch:{ all -> 0x021c }
            if (r4 != 0) goto L_0x021a
            java.util.List r4 = m102994h()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x021c }
            boolean r6 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x021c }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x021c }
            if (r6 != 0) goto L_0x0153
        L_0x013b:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x021c }
        L_0x013f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x021c }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013f
            r4 = 1
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            if (r4 != 0) goto L_0x021a
            android.content.SharedPreferences r4 = r1.mo94868c()     // Catch:{ all -> 0x021c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x021c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            r6.<init>()     // Catch:{ all -> 0x021c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x021c }
            java.util.List r7 = m102994h()     // Catch:{ all -> 0x021c }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x021c }
            r6.addAll(r7)     // Catch:{ all -> 0x021c }
            r6.add(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r7 = "logged_in_uid_list"
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x021c }
            java.lang.String r6 = ","
            r9 = r6
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x021c }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r6 = p2628d.p2629a.C52575l.m112120a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x021c }
            r4.putString(r7, r6)     // Catch:{ all -> 0x021c }
            r4.apply()     // Catch:{ all -> 0x021c }
            java.util.List r1 = r1.mo94871d()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x021c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x021c }
        L_0x0198:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x01ae
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f120010b     // Catch:{ all -> 0x021c }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0198
            goto L_0x01af
        L_0x01ae:
            r4 = r5
        L_0x01af:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x021a
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x01ec
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r0 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            java.lang.Object r1 = r1.mo94876a()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x01e4
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p683ss.android.ugc.aweme.profile.model.User) r1     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r1 = com.p683ss.android.ugc.aweme.user.C47538a.C47539a.m102966a(r1)     // Catch:{ all -> 0x021c }
            r0.mo94877a(r1)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x01e4:
            d.u r0 = new d.u     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x01ec:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x0202
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94881b()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$a r0 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r0     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x0202:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0217
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r0 = (com.p683ss.android.ugc.aweme.user.C47538a) r0     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
        L_0x0217:
            r4.mo94883d()     // Catch:{ all -> 0x021c }
        L_0x021a:
            monitor-exit(r2)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.C47557d.mo94864a(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94865a(com.p683ss.android.ugc.aweme.user.C47538a r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "u"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r2 = p2628d.p2639f.p2641b.C52728w.m112245a(r2)
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r2 == 0) goto L_0x0021
            r1 = r0
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p683ss.android.ugc.aweme.profile.model.User) r1
            java.lang.String r1 = r1.getUid()
            goto L_0x0044
        L_0x0021:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r2 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r2 = p2628d.p2639f.p2641b.C52728w.m112245a(r2)
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r2 == 0) goto L_0x0033
            r1 = r0
            com.ss.android.ugc.aweme.user.d$a r1 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r1
            java.lang.String r1 = r1.f119995a
            goto L_0x0044
        L_0x0033:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r2 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r2 = p2628d.p2639f.p2641b.C52728w.m112245a(r2)
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r2)
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r0.f119947a
            goto L_0x0044
        L_0x0042:
            java.lang.String r1 = "0"
        L_0x0044:
            if (r1 != 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.Object r2 = m102989a()
            monitor-enter(r2)
            com.ss.android.ugc.aweme.user.d r3 = f119986b     // Catch:{ all -> 0x021c }
            java.util.List r3 = r3.mo94871d()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x021c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x021c }
        L_0x0058:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021c }
            r5 = 0
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f120010b     // Catch:{ all -> 0x021c }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r1)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0058
            goto L_0x0070
        L_0x006f:
            r4 = r5
        L_0x0070:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00dd
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            r1.mo94877a(r3)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r3 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            java.lang.Object r3 = r3.mo94876a()     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r3 = com.p683ss.android.ugc.aweme.user.C47538a.C47539a.m102966a(r3)     // Catch:{ all -> 0x021c }
            r1.mo94877a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00a8:
            d.u r0 = new d.u     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x00b0:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94881b()     // Catch:{ all -> 0x021c }
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x021c }
            r1.mo94877a(r3)     // Catch:{ all -> 0x021c }
            goto L_0x00da
        L_0x00c7:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
        L_0x00da:
            r4.mo94883d()     // Catch:{ all -> 0x021c }
        L_0x00dd:
            if (r4 != 0) goto L_0x021a
            com.ss.android.ugc.aweme.user.d r1 = f119986b     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r4 = p2628d.p2639f.p2641b.C52728w.m112245a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00fb
            r3 = r0
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.p683ss.android.ugc.aweme.profile.model.User) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.getUid()     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x00fb:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r4 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r4 = p2628d.p2639f.p2641b.C52728w.m112245a(r4)     // Catch:{ all -> 0x021c }
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x010d
            r3 = r0
            com.ss.android.ugc.aweme.user.d$a r3 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r3     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r3.f119995a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x010d:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r4 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r4 = p2628d.p2639f.p2641b.C52728w.m112245a(r4)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r4)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x011c
            java.lang.String r3 = r0.f119947a     // Catch:{ all -> 0x021c }
            goto L_0x011e
        L_0x011c:
            java.lang.String r3 = "0"
        L_0x011e:
            if (r3 != 0) goto L_0x0122
            goto L_0x021a
        L_0x0122:
            boolean r4 = m102993f(r3)     // Catch:{ all -> 0x021c }
            if (r4 != 0) goto L_0x021a
            java.util.List r4 = m102994h()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ all -> 0x021c }
            boolean r6 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ all -> 0x021c }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x021c }
            if (r6 != 0) goto L_0x0153
        L_0x013b:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x021c }
        L_0x013f:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x021c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x021c }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x013f
            r4 = 1
            goto L_0x0154
        L_0x0153:
            r4 = 0
        L_0x0154:
            if (r4 != 0) goto L_0x021a
            android.content.SharedPreferences r4 = r1.mo94868c()     // Catch:{ all -> 0x021c }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x021c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            r6.<init>()     // Catch:{ all -> 0x021c }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x021c }
            java.util.List r7 = m102994h()     // Catch:{ all -> 0x021c }
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x021c }
            r6.addAll(r7)     // Catch:{ all -> 0x021c }
            r6.add(r3)     // Catch:{ all -> 0x021c }
            java.lang.String r7 = "logged_in_uid_list"
            r8 = r6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x021c }
            java.lang.String r6 = ","
            r9 = r6
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x021c }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 62
            r16 = 0
            java.lang.String r6 = p2628d.p2629a.C52575l.m112120a(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x021c }
            r4.putString(r7, r6)     // Catch:{ all -> 0x021c }
            r4.apply()     // Catch:{ all -> 0x021c }
            java.util.List r1 = r1.mo94871d()     // Catch:{ all -> 0x021c }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x021c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x021c }
        L_0x0198:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x01ae
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x021c }
            r6 = r4
            com.ss.android.ugc.aweme.user.d$c r6 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r6     // Catch:{ all -> 0x021c }
            java.lang.String r6 = r6.f120010b     // Catch:{ all -> 0x021c }
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r3)     // Catch:{ all -> 0x021c }
            if (r6 == 0) goto L_0x0198
            goto L_0x01af
        L_0x01ae:
            r4 = r5
        L_0x01af:
            com.ss.android.ugc.aweme.user.d$c r4 = (com.p683ss.android.ugc.aweme.user.C47557d.C47561c) r4     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x021a
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r1 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r1 = p2628d.p2639f.p2641b.C52728w.m112245a(r1)     // Catch:{ all -> 0x021c }
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.p683ss.android.ugc.aweme.profile.model.User.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x01ee
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.p683ss.android.ugc.aweme.profile.model.User) r0     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r0 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94880a()     // Catch:{ all -> 0x021c }
            java.lang.Object r1 = r1.mo94876a()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.p683ss.android.ugc.aweme.profile.model.User) r1     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.a r1 = com.p683ss.android.ugc.aweme.user.C47538a.C47539a.m102966a(r1)     // Catch:{ all -> 0x021c }
            r0.mo94877a(r1)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x01e6:
            d.u r0 = new d.u     // Catch:{ all -> 0x021c }
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User"
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            throw r0     // Catch:{ all -> 0x021c }
        L_0x01ee:
            java.lang.Class<com.ss.android.ugc.aweme.user.d$a> r3 = com.p683ss.android.ugc.aweme.user.C47557d.C47558a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r3 == 0) goto L_0x0204
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94881b()     // Catch:{ all -> 0x021c }
            com.ss.android.ugc.aweme.user.d$a r0 = (com.p683ss.android.ugc.aweme.user.C47557d.C47558a) r0     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x0204:
            java.lang.Class<com.ss.android.ugc.aweme.user.a> r3 = com.p683ss.android.ugc.aweme.user.C47538a.class
            d.k.c r3 = p2628d.p2639f.p2641b.C52728w.m112245a(r3)     // Catch:{ all -> 0x021c }
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0217
            com.ss.android.ugc.aweme.user.d$b r1 = r4.mo94882c()     // Catch:{ all -> 0x021c }
            r1.mo94877a(r0)     // Catch:{ all -> 0x021c }
        L_0x0217:
            r4.mo94883d()     // Catch:{ all -> 0x021c }
        L_0x021a:
            monitor-exit(r2)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.user.C47557d.mo94865a(com.ss.android.ugc.aweme.user.a):void");
    }

    /* renamed from: a */
    private static <E> boolean m102991a(List<E> list, C52671b<? super E, Boolean> bVar) {
        if (VERSION.SDK_INT >= 24) {
            return list.removeIf(new C47573e(bVar));
        }
        boolean z = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) bVar.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
