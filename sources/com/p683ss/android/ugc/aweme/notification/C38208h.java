package com.p683ss.android.ugc.aweme.notification;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38097k;
import java.util.Comparator;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.notification.h */
public final class C38208h {

    /* renamed from: a */
    public static final C38208h f97276a = new C38208h();

    /* renamed from: com.ss.android.ugc.aweme.notification.h$a */
    public static final class C38209a {

        /* renamed from: a */
        public static final C38209a f97277a = new C38209a();

        /* renamed from: com.ss.android.ugc.aweme.notification.h$a$a */
        public static final class C38210a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C52594a.m112153a(Integer.valueOf(((C38097k) t).f96924d), Integer.valueOf(((C38097k) t2).f96924d));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.h$a$b */
        public static final class C38211b extends C52712l implements C52671b<C38097k, String> {
            public static final C38211b INSTANCE = new C38211b();

            C38211b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C38097k kVar = (C38097k) obj;
                C52711k.m112240b(kVar, "it");
                return String.valueOf(kVar.f96924d);
            }
        }

        private C38209a() {
        }

        /* renamed from: a */
        public static final void m85379a(String str) {
            C38208h.m85377a("notice_list", str);
        }

        /* renamed from: a */
        public static final void m85378a(int i, boolean z) {
            String str;
            StringBuilder sb = new StringBuilder("Notice session(");
            sb.append(i);
            sb.append(") in IM list is");
            if (z) {
                str = " ";
            } else {
                str = " not ";
            }
            sb.append(str);
            sb.append("deleted.");
            m85379a(sb.toString());
        }
    }

    private C38208h() {
    }

    /* renamed from: a */
    public static final void m85377a(String str, String str2) {
        C32458a.m75141a(4, str, str2);
    }
}
