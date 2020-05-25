package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f */
public abstract class C31312f extends C31304a {

    /* renamed from: a */
    public static final C31314b f82067a = new C31314b(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$a */
    public static final class C31313a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((PublishBehaviorModel) t).timeStamp), Long.valueOf(((PublishBehaviorModel) t2).timeStamp));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$b */
    public static final class C31314b {
        private C31314b() {
        }

        public /* synthetic */ C31314b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c */
    public static final class C31315c {

        /* renamed from: a */
        public final boolean f82068a;

        /* renamed from: b */
        public final boolean f82069b;

        /* renamed from: c */
        public final boolean f82070c;

        /* renamed from: d */
        public final long f82071d;

        /* renamed from: e */
        public final long f82072e;

        /* renamed from: f */
        public final C31316a f82073f;

        /* renamed from: g */
        public final List<PublishBehaviorModel> f82074g;

        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a */
        public static abstract class C31316a {

            /* renamed from: a */
            public final String f82075a;

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$a */
            public static final class C31317a extends C31316a {

                /* renamed from: b */
                public static final C31317a f82076b = new C31317a();

                private C31317a() {
                    super("取消", null);
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b */
            public static abstract class C31318b extends C31316a {

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$a */
                public static final class C31319a extends C31318b {

                    /* renamed from: b */
                    public final String f82077b;

                    /* renamed from: c */
                    public final String f82078c;

                    public C31319a(String str, String str2) {
                        C52711k.m112240b(str, "code");
                        C52711k.m112240b(str2, "stage");
                        super(null);
                        this.f82077b = str;
                        this.f82078c = str2;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$b */
                public static final class C31320b extends C31318b {

                    /* renamed from: b */
                    public final String f82079b;

                    public C31320b(String str) {
                        C52711k.m112240b(str, "msg");
                        super(null);
                        this.f82079b = str;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$b$c */
                public static final class C31321c extends C31318b {

                    /* renamed from: b */
                    public final String f82080b;

                    public C31321c(String str) {
                        C52711k.m112240b(str, "stage");
                        super(null);
                        this.f82080b = str;
                    }
                }

                private C31318b() {
                    super("失败", null);
                }

                public /* synthetic */ C31318b(C52707g gVar) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$a$c */
            public static final class C31322c extends C31316a {

                /* renamed from: b */
                public static final C31322c f82081b = new C31322c();

                private C31322c() {
                    super("成功", null);
                }
            }

            private C31316a(String str) {
                this.f82075a = str;
            }

            public /* synthetic */ C31316a(String str, C52707g gVar) {
                this(str);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$b */
        static final class C31323b extends C52712l implements C52671b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C31323b f82082a = new C31323b();

            C31323b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) obj;
                C52711k.m112240b(publishBehaviorModel, "behavior");
                if (!C52711k.m112239a((Object) publishBehaviorModel.stage, (Object) "SN") || publishBehaviorModel.type != BehaviorType.START) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$c */
        static final class C31324c extends C52712l implements C52671b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C31324c f82083a = new C31324c();

            C31324c() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) obj;
                C52711k.m112240b(publishBehaviorModel, "behavior");
                if (!C52711k.m112239a((Object) publishBehaviorModel.stage, (Object) "SN") || publishBehaviorModel.type != BehaviorType.START) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$d */
        static final class C31325d extends C52712l implements C52671b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C31325d f82084a = new C31325d();

            C31325d() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) obj;
                C52711k.m112240b(publishBehaviorModel, "behavior");
                if (!C52711k.m112239a((Object) publishBehaviorModel.stage, (Object) "AK") || publishBehaviorModel.type != BehaviorType.SUCCESS) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c$e */
        static final class C31326e extends C52712l implements C52671b<PublishBehaviorModel, Boolean> {

            /* renamed from: a */
            public static final C31326e f82085a = new C31326e();

            C31326e() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                boolean z;
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) obj;
                C52711k.m112240b(publishBehaviorModel, "behavior");
                if (!C52711k.m112239a((Object) publishBehaviorModel.stage, (Object) "UP") || publishBehaviorModel.type != BehaviorType.SUCCESS) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: a */
        private final C31316a m73052a() {
            Object obj;
            Object obj2;
            boolean z;
            Object obj3;
            C31318b bVar;
            boolean z2;
            boolean z3;
            boolean z4;
            if (this.f82069b) {
                return new C31319a(((PublishBehaviorModel) this.f82074g.get(0)).code, ((PublishBehaviorModel) this.f82074g.get(0)).stage);
            }
            if (!this.f82068a) {
                return C31317a.f82076b;
            }
            Iterator it = this.f82074g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) obj;
                if (!C52711k.m112239a((Object) publishBehaviorModel.stage, (Object) "CA") || publishBehaviorModel.type != BehaviorType.SUCCESS) {
                    z4 = false;
                    continue;
                } else {
                    z4 = true;
                    continue;
                }
                if (z4) {
                    break;
                }
            }
            if (obj != null) {
                return C31322c.f82081b;
            }
            List<PublishBehaviorModel> list = this.f82074g;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((PublishBehaviorModel) obj2).type == BehaviorType.FAILED) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            PublishBehaviorModel publishBehaviorModel2 = (PublishBehaviorModel) obj2;
            if (publishBehaviorModel2 != null) {
                if (!C52711k.m112239a((Object) publishBehaviorModel2.stage, (Object) "UP") || !C52711k.m112239a((Object) publishBehaviorModel2.code, (Object) "-39995")) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    return new C31319a(publishBehaviorModel2.code, publishBehaviorModel2.stage);
                }
                Iterator it2 = this.f82074g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    PublishBehaviorModel publishBehaviorModel3 = (PublishBehaviorModel) obj3;
                    if (!C52711k.m112239a((Object) publishBehaviorModel3.stage, (Object) "SN") || publishBehaviorModel3.type != BehaviorType.FAILED) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                PublishBehaviorModel publishBehaviorModel4 = (PublishBehaviorModel) obj3;
                if (publishBehaviorModel4 == null) {
                    bVar = new C31320b("合成结果不一致");
                } else {
                    bVar = new C31319a(publishBehaviorModel4.code, publishBehaviorModel4.stage);
                }
                return bVar;
            }
            C31321c a = m73051a("SN", C31323b.f82082a);
            if (a != null) {
                return a;
            }
            C31321c a2 = m73051a("AK", C31324c.f82083a);
            if (a2 != null) {
                return a2;
            }
            C31321c a3 = m73051a("UP", C31325d.f82084a);
            if (a3 != null) {
                return a3;
            }
            C31321c a4 = m73051a("CA", C31326e.f82085a);
            if (a4 != null) {
                return a4;
            }
            return new C31320b("UNKNOW");
        }

        /* renamed from: a */
        public final void mo64216a(int i) {
            for (PublishBehaviorModel publishBehaviorModel : this.f82074g) {
                publishBehaviorModel.idIndex = i;
            }
        }

        public C31315c(String str, List<PublishBehaviorModel> list) {
            Object obj;
            boolean z;
            C52711k.m112240b(str, "publishId");
            C52711k.m112240b(list, "source");
            this.f82074g = list;
            Iterator it = this.f82074g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) ((PublishBehaviorModel) obj).stage, (Object) "CP")) {
                    break;
                }
            }
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            this.f82068a = z;
            this.f82069b = C52711k.m112239a((Object) str, (Object) "-1");
            this.f82070c = C52711k.m112239a((Object) str, (Object) "-2");
            this.f82071d = ((PublishBehaviorModel) C52575l.m112137e(this.f82074g)).timeStamp;
            this.f82072e = ((PublishBehaviorModel) C52575l.m112142g(this.f82074g)).timeStamp;
            this.f82073f = m73052a();
        }

        /* renamed from: a */
        private final C31321c m73051a(String str, C52671b<? super PublishBehaviorModel, Boolean> bVar) {
            Object obj;
            boolean z;
            Object obj2;
            boolean z2;
            Iterator it = this.f82074g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Boolean) bVar.invoke((PublishBehaviorModel) obj)).booleanValue()) {
                    break;
                }
            }
            boolean z3 = false;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            Iterator it2 = this.f82074g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) obj2;
                if (!C52711k.m112239a((Object) publishBehaviorModel.stage, (Object) str) || !(publishBehaviorModel.type == BehaviorType.SUCCESS || publishBehaviorModel.type == BehaviorType.FAILED)) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            if (obj2 != null) {
                z3 = true;
            }
            if (!z || z3) {
                return null;
            }
            return new C31321c(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$d */
    public static final class C31327d {

        /* renamed from: a */
        public final List<C31315c> f82086a;

        /* renamed from: b */
        public final List<C31315c> f82087b;

        /* renamed from: c */
        public final List<C31315c> f82088c;

        /* renamed from: d */
        public final List<C31315c> f82089d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f82089d, (java.lang.Object) r3.f82089d) != false) goto L_0x0033;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0033
                boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31327d
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$d r3 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31327d) r3
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r0 = r2.f82086a
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r1 = r3.f82086a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r0 = r2.f82087b
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r1 = r3.f82087b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r0 = r2.f82088c
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r1 = r3.f82088c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0031
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r0 = r2.f82089d
                java.util.List<com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c> r3 = r3.f82089d
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r3 = 0
                return r3
            L_0x0033:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31327d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            List<C31315c> list = this.f82086a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C31315c> list2 = this.f82087b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<C31315c> list3 = this.f82088c;
            int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<C31315c> list4 = this.f82089d;
            if (list4 != null) {
                i = list4.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Publishes(events=");
            sb.append(this.f82086a);
            sb.append(", checkFailed=");
            sb.append(this.f82087b);
            sb.append(", clickPublish=");
            sb.append(this.f82088c);
            sb.append(", unClickPublish=");
            sb.append(this.f82089d);
            sb.append(")");
            return sb.toString();
        }

        public C31327d(List<C31315c> list, List<C31315c> list2, List<C31315c> list3, List<C31315c> list4) {
            C52711k.m112240b(list, "events");
            C52711k.m112240b(list2, "checkFailed");
            C52711k.m112240b(list3, "clickPublish");
            C52711k.m112240b(list4, "unClickPublish");
            this.f82086a = list;
            this.f82087b = list2;
            this.f82088c = list3;
            this.f82089d = list4;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$e */
    static final class C31328e extends C52712l implements C52682m<C31316a, C31316a, Boolean> {

        /* renamed from: a */
        public static final C31328e f82090a = new C31328e();

        C31328e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(m73054a((C31316a) obj, (C31316a) obj2));
        }

        /* renamed from: a */
        public static boolean m73054a(C31316a aVar, C31316a aVar2) {
            C52711k.m112240b(aVar, "$this$isSameTypeClass");
            if (aVar2 == null) {
                return false;
            }
            if (C52711k.m112239a((Object) aVar, (Object) aVar2)) {
                return true;
            }
            return C52711k.m112239a((Object) aVar.f82075a, (Object) aVar2.f82075a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$f */
    public static final class C31329f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Long.valueOf(((C31315c) t).f82071d), Long.valueOf(((C31315c) t2).f82071d));
        }
    }

    /* renamed from: b */
    public final long mo64211b() {
        return TimeUnit.HOURS.toMillis(24);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b A[EDGE_INSN: B:83:0x012b->B:37:0x012b ?: BREAK  
    EDGE_INSN: B:83:0x012b->B:37:0x012b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0194 A[EDGE_INSN: B:86:0x0194->B:59:0x0194 ?: BREAK  
    EDGE_INSN: B:86:0x0194->B:59:0x0194 ?: BREAK  
    EDGE_INSN: B:86:0x0194->B:59:0x0194 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0194 A[EDGE_INSN: B:86:0x0194->B:59:0x0194 ?: BREAK  
    EDGE_INSN: B:86:0x0194->B:59:0x0194 ?: BREAK  , SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31327d mo64214d() {
        /*
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r10.mo64211b()
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.feedback.runtime.behavior.c r2 = com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a.m73024a()
            java.lang.String r3 = "publish"
            java.util.List r0 = r2.mo64184a(r3, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = p2628d.p2629a.C52575l.m112104a(r0, r2)
            r1.<init>(r3)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.runtime.behavior.c r3 = (com.p683ss.android.ugc.aweme.runtime.behavior.C41319c) r3
            java.lang.String r3 = r3.f104782d
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r4 = com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel.class
            java.lang.Object r3 = com.p683ss.android.ugc.aweme.utils.C47760cd.m103384a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel r3 = (com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel) r3
            r1.add(r3)
            goto L_0x0026
        L_0x0040:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r1 = r1.iterator()
        L_0x004f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel r4 = (com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel) r4
            java.lang.String r4 = r4.publishId
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L_0x006c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.put(r4, r5)
        L_0x006c:
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
            goto L_0x004f
        L_0x0072:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.size()
            r1.<init>(r3)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$a r5 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$a
            r5.<init>()
            java.util.Comparator r5 = (java.util.Comparator) r5
            java.util.List r3 = p2628d.p2629a.C52575l.m112122a(r3, r5)
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r5 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c
            r5.<init>(r4, r3)
            r1.add(r5)
            goto L_0x0085
        L_0x00b1:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$f r0 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$f
            r0.<init>()
            java.util.Comparator r0 = (java.util.Comparator) r0
            java.util.List r0 = p2628d.p2629a.C52575l.m112122a(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x00c6:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x00d9
            java.lang.Object r3 = r1.next()
            r5 = r3
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r5 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r5
            boolean r5 = r5.f82069b
            if (r5 == 0) goto L_0x00c6
            goto L_0x00da
        L_0x00d9:
            r3 = r4
        L_0x00da:
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r3 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r3
            if (r3 == 0) goto L_0x0111
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r1 = r3.f82074g
            if (r1 == 0) goto L_0x0111
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = p2628d.p2629a.C52575l.m112104a(r1, r2)
            r3.<init>(r5)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r1 = r1.iterator()
        L_0x00f3:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x010e
            java.lang.Object r5 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel r5 = (com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel) r5
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r6 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c
            java.lang.String r7 = r5.publishId
            java.util.List r5 = p2628d.p2629a.C52575l.m112092a(r5)
            r6.<init>(r7, r5)
            r3.add(r6)
            goto L_0x00f3
        L_0x010e:
            java.util.List r3 = (java.util.List) r3
            goto L_0x0115
        L_0x0111:
            java.util.List r3 = p2628d.p2629a.C52575l.m112097a()
        L_0x0115:
            java.util.Iterator r1 = r0.iterator()
        L_0x0119:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x012b
            java.lang.Object r5 = r1.next()
            r6 = r5
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r6 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r6
            boolean r6 = r6.f82070c
            if (r6 == 0) goto L_0x0119
            r4 = r5
        L_0x012b:
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r4 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r4
            if (r4 == 0) goto L_0x0162
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel> r1 = r4.f82074g
            if (r1 == 0) goto L_0x0162
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = p2628d.p2629a.C52575l.m112104a(r1, r2)
            r4.<init>(r2)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r1 = r1.iterator()
        L_0x0144:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x015f
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel) r2
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r5 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c
            java.lang.String r6 = r2.publishId
            java.util.List r2 = p2628d.p2629a.C52575l.m112092a(r2)
            r5.<init>(r6, r2)
            r4.add(r5)
            goto L_0x0144
        L_0x015f:
            java.util.List r4 = (java.util.List) r4
            goto L_0x0166
        L_0x0162:
            java.util.List r4 = p2628d.p2629a.C52575l.m112097a()
        L_0x0166:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r2 = r0.iterator()
        L_0x0171:
            boolean r5 = r2.hasNext()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0194
            java.lang.Object r5 = r2.next()
            r8 = r5
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r8 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r8
            boolean r9 = r8.f82069b
            if (r9 != 0) goto L_0x018d
            boolean r9 = r8.f82070c
            if (r9 != 0) goto L_0x018d
            boolean r8 = r8.f82068a
            if (r8 == 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r6 = 0
        L_0x018e:
            if (r6 == 0) goto L_0x0171
            r1.add(r5)
            goto L_0x0171
        L_0x0194:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r0 = r0.iterator()
        L_0x01a1:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01c3
            java.lang.Object r5 = r0.next()
            r8 = r5
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$c r8 = (com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.C31315c) r8
            boolean r9 = r8.f82069b
            if (r9 != 0) goto L_0x01bc
            boolean r9 = r8.f82070c
            if (r9 != 0) goto L_0x01bc
            boolean r8 = r8.f82068a
            if (r8 != 0) goto L_0x01bc
            r8 = 1
            goto L_0x01bd
        L_0x01bc:
            r8 = 0
        L_0x01bd:
            if (r8 == 0) goto L_0x01a1
            r2.add(r5)
            goto L_0x01a1
        L_0x01c3:
            java.util.List r2 = (java.util.List) r2
            com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$d r0 = new com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$d
            r0.<init>(r4, r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy.C31312f.mo64214d():com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.f$d");
    }

    /* renamed from: a */
    public final boolean mo64210a(String str) {
        C52711k.m112240b(str, "type");
        if (str.hashCode() == -235365105 && str.equals("publish")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<C31315c> mo64213a(int i, int i2) {
        List list;
        List list2;
        C31327d d = mo64214d();
        List<C31315c> list3 = d.f82087b;
        List<C31315c> list4 = d.f82088c;
        List<C31315c> list5 = d.f82089d;
        List b = C52575l.m112130b(list4, 4);
        if (b.isEmpty()) {
            list = C52575l.m112130b(list5, 4);
        } else {
            list = m73046a(list5, b, 2);
        }
        Collection collection = b;
        if (!collection.isEmpty()) {
            list2 = m73046a(list3, b, 2);
        } else if (!list.isEmpty()) {
            list2 = m73046a(list3, list, 2);
        } else {
            list2 = C52575l.m112130b(list3, 4);
        }
        return C52575l.m112133c(C52575l.m112133c(collection, list), list2);
    }

    /* renamed from: a */
    private final List<C31315c> m73046a(List<C31315c> list, List<C31315c> list2, int i) {
        if (list2.isEmpty() || list.isEmpty()) {
            return C52575l.m112097a();
        }
        return m73045a(list, ((C31315c) C52575l.m112137e(list2)).f82071d, ((C31315c) C52575l.m112142g(list)).f82072e, i);
    }

    /* renamed from: a */
    private static List<C31315c> m73045a(List<C31315c> list, long j, long j2, int i) {
        int i2;
        boolean z;
        boolean z2;
        Iterator it = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (((C31315c) it.next()).f82071d > j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            return C52575l.m112097a();
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            }
            if (((C31315c) listIterator.previous()).f82072e < j2) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        if (i2 == -1) {
            return C52575l.m112097a();
        }
        return list.subList(Math.max(0, i3 - i), Math.min(list.size() - 1, i2 + i) + 1);
    }
}
