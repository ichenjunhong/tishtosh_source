package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.C0209x;
import com.bytedance.android.live.core.rxutils.C4067n;
import com.bytedance.android.livesdk.message.model.C8004p;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2178a;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

public final class CommonGuideViewModel extends C0209x {

    /* renamed from: a */
    public final C8396f f22828a = new C8396f();

    /* renamed from: b */
    C1690c f22829b;

    /* renamed from: c */
    private final C1689b f22830c = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$a */
    public static final class C8391a implements C8398h {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$b */
    public static final class C8392b implements C8398h {

        /* renamed from: a */
        public final String f22832a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f22832a, (java.lang.Object) ((com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8392b) r2).f22832a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8392b
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$b r2 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8392b) r2
                java.lang.String r0 = r1.f22832a
                java.lang.String r2 = r2.f22832a
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8392b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f22832a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonGuideActionHandleSchema(schema=");
            sb.append(this.f22832a);
            sb.append(")");
            return sb.toString();
        }

        public C8392b(String str) {
            this.f22832a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$c */
    public static final class C8393c implements C8398h {

        /* renamed from: a */
        public final C8004p f22833a;

        public C8393c(C8004p pVar) {
            this.f22833a = pVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$d */
    public static final class C8394d implements C8399i {

        /* renamed from: a */
        public final String f22834a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f22834a, (java.lang.Object) ((com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8394d) r2).f22834a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8394d
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$d r2 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8394d) r2
                java.lang.String r0 = r1.f22834a
                java.lang.String r2 = r2.f22834a
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8394d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f22834a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonGuideStateHandleSchema(schema=");
            sb.append(this.f22834a);
            sb.append(")");
            return sb.toString();
        }

        public C8394d(String str) {
            this.f22834a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$e */
    public static final class C8395e implements C8399i {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$f */
    public static final class C8396f {

        /* renamed from: a */
        public C8399i f22835a = new C8395e();

        /* renamed from: b */
        private final C2178a<C8399i> f22836b;

        /* renamed from: a */
        public final C2201v<C8399i> mo14605a() {
            return this.f22836b;
        }

        public C8396f() {
            C2178a<C8399i> a = C2178a.m6524a(this.f22835a);
            C52711k.m112236a((Object) a, "BehaviorSubject.createDefault(state)");
            this.f22836b = a;
        }

        /* renamed from: a */
        private final void m16604a(C8399i iVar) {
            this.f22835a = iVar;
            this.f22836b.onNext(iVar);
        }

        /* renamed from: a */
        public final void mo14606a(C8398h hVar) {
            C52711k.m112240b(hVar, "action");
            if (hVar instanceof C8393c) {
                m16604a((C8399i) new C8397g(((C8393c) hVar).f22833a));
            } else if (hVar instanceof C8392b) {
                m16604a((C8399i) new C8394d(((C8392b) hVar).f22832a));
            } else {
                if (hVar instanceof C8391a) {
                    m16604a((C8399i) new C8395e());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$g */
    public static final class C8397g implements C8399i {

        /* renamed from: a */
        public final C8004p f22837a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f22837a, (java.lang.Object) ((com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8397g) r2).f22837a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8397g
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$g r2 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8397g) r2
                com.bytedance.android.livesdk.message.model.p r0 = r1.f22837a
                com.bytedance.android.livesdk.message.model.p r2 = r2.f22837a
                boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8397g.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C8004p pVar = this.f22837a;
            if (pVar != null) {
                return pVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonGuideStateShow(message=");
            sb.append(this.f22837a);
            sb.append(")");
            return sb.toString();
        }

        public C8397g(C8004p pVar) {
            this.f22837a = pVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$h */
    public interface C8398h {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$i */
    public interface C8399i {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$j */
    static final class C8400j<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ CommonGuideViewModel f22838a;

        C8400j(CommonGuideViewModel commonGuideViewModel) {
            this.f22838a = commonGuideViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f22838a.f22828a.mo14606a((C8398h) new C8391a());
        }
    }

    public final void onCleared() {
        super.onCleared();
        if (!this.f22830c.isDisposed()) {
            this.f22830c.dispose();
        }
        C1690c cVar = this.f22829b;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
    }

    public CommonGuideViewModel() {
        this.f22830c.mo6181a(C4067n.m10192a(this.f22828a.mo14605a()).mo6545f((C1710e<? super T>) new C1710e<C52847n<? extends C8399i, ? extends C8399i>>(this) {

            /* renamed from: a */
            final /* synthetic */ CommonGuideViewModel f22831a;

            {
                this.f22831a = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                long j;
                C52847n nVar = (C52847n) obj;
                C8399i iVar = (C8399i) nVar.component1();
                C8399i iVar2 = (C8399i) nVar.component2();
                CommonGuideViewModel commonGuideViewModel = this.f22831a;
                if (iVar2 instanceof C8397g) {
                    C8004p pVar = ((C8397g) iVar2).f22837a;
                    if (pVar != null) {
                        j = pVar.f21890h;
                    } else {
                        j = 10000;
                    }
                    commonGuideViewModel.f22829b = C2201v.m6592a(j, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8400j<Object>(commonGuideViewModel));
                    return;
                }
                if (iVar2 instanceof C8395e) {
                    C1690c cVar = commonGuideViewModel.f22829b;
                    if (cVar != null && !cVar.isDisposed()) {
                        cVar.dispose();
                    }
                }
            }
        }));
    }
}
