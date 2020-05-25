package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p683ss.android.ugc.asve.p1239c.C20346b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45489a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.C45509c;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.C45511e;
import com.p683ss.android.ugc.aweme.utils.C47900ft;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53200af;
import kotlinx.coroutines.C53207am;
import kotlinx.coroutines.C53225av;
import kotlinx.coroutines.C53263bl;
import kotlinx.coroutines.C53299e;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2631c.C52599a;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52633c;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52614b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a */
public final class C45516a extends Fragment {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114990a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45516a.class), "mCategoryProvider", "getMCategoryProvider()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/IVideoCategoryProvider;"))};

    /* renamed from: g */
    public static final C45519b f114991g = new C45519b(null);

    /* renamed from: b */
    public VideoCategoryParam f114992b;

    /* renamed from: c */
    AVETParameter f114993c;

    /* renamed from: d */
    public AtomicBoolean f114994d = new AtomicBoolean(true);

    /* renamed from: e */
    public C45532d f114995e;

    /* renamed from: f */
    StatusLoadingDialog f114996f;

    /* renamed from: h */
    private final C52668f f114997h = C52732g.m112306a(new C45511e());

    /* renamed from: i */
    private RecyclerView f114998i;

    /* renamed from: j */
    private final C53263bl f114999j = C53270bq.m113187a(null, 1, null);

    /* renamed from: k */
    private final CoroutineExceptionHandler f115000k = new C45517a(CoroutineExceptionHandler.f131765b, this);

    /* renamed from: l */
    private final C53199ae f115001l = C53200af.m113027a(C20346b.m50242a().plus(this.f114999j).plus(this.f115000k));

    /* renamed from: m */
    private HashMap f115002m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$a */
    public static final class C45517a extends C52599a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ C45516a f115003a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$a$a */
        static final class C45518a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ C45517a f115004a;

            C45518a(C45517a aVar) {
                this.f115004a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f115004a.f115003a.mo91789b();
                return C52860x.f131107a;
            }
        }

        public C45517a(C52633c cVar, C45516a aVar) {
            this.f115003a = aVar;
            super(cVar);
        }

        public final void handleException(C52628e eVar, Throwable th) {
            C52711k.m112240b(eVar, "context");
            C52711k.m112240b(th, "exception");
            C47900ft.m103619a(0, new C45518a(this));
            C32458a.m75148a(th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$b */
    public static final class C45519b {
        private C45519b() {
        }

        public /* synthetic */ C45519b(C52707g gVar) {
            this();
        }
    }

    @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {120, 122, 122, 122}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c */
    static final class C45520c extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f115005a;

        /* renamed from: b */
        Object f115006b;

        /* renamed from: c */
        Object f115007c;

        /* renamed from: d */
        Object f115008d;

        /* renamed from: e */
        Object f115009e;

        /* renamed from: f */
        boolean f115010f;

        /* renamed from: g */
        int f115011g;

        /* renamed from: h */
        final /* synthetic */ C45516a f115012h;

        /* renamed from: i */
        private C53199ae f115013i;

        @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {120, 120}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1$isDefaultPresent$1")
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$a */
        static final class C45521a extends C52624k implements C52682m<C53199ae, C52625c<? super Boolean>, Object> {

            /* renamed from: a */
            Object f115014a;

            /* renamed from: b */
            Object f115015b;

            /* renamed from: c */
            int f115016c;

            /* renamed from: d */
            final /* synthetic */ C45520c f115017d;

            /* renamed from: e */
            final /* synthetic */ C53207am f115018e;

            /* renamed from: f */
            private C53199ae f115019f;

            C45521a(C45520c cVar, C53207am amVar, C52625c cVar2) {
                this.f115017d = cVar;
                this.f115018e = amVar;
                super(2, cVar2);
            }

            public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                C52711k.m112240b(cVar, "completion");
                C45521a aVar = new C45521a(this.f115017d, this.f115018e, cVar);
                aVar.f115019f = (C53199ae) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C45521a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[PHI: r6 
              PHI: (r6v1 java.lang.Object) = (r6v0 java.lang.Object), (r6v4 java.lang.Object) binds: [B:1:0x0006, B:9:0x0049] A[DONT_GENERATE, DONT_INLINE], RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p2628d.p2631c.p2632a.C52601b.m112157a()
                    int r1 = r5.f115016c
                    switch(r1) {
                        case 0: goto L_0x001a;
                        case 1: goto L_0x0011;
                        case 2: goto L_0x004c;
                        default: goto L_0x0009;
                    }
                L_0x0009:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x0011:
                    java.lang.Object r1 = r5.f115015b
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r1 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45516a) r1
                    java.lang.Object r2 = r5.f115014a
                    kotlinx.coroutines.ae r2 = (kotlinx.coroutines.C53199ae) r2
                    goto L_0x0030
                L_0x001a:
                    kotlinx.coroutines.ae r2 = r5.f115019f
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c r6 = r5.f115017d
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r1 = r6.f115012h
                    kotlinx.coroutines.am r6 = r5.f115018e
                    r5.f115014a = r2
                    r5.f115015b = r1
                    r3 = 1
                    r5.f115016c = r3
                    java.lang.Object r6 = r6.mo110779a(r5)
                    if (r6 != r0) goto L_0x0030
                    return r0
                L_0x0030:
                    java.util.List r6 = (java.util.List) r6
                    r5.f115014a = r2
                    r2 = 2
                    r5.f115016c = r2
                    kotlinx.coroutines.z r2 = kotlinx.coroutines.C53225av.m113075c()
                    d.c.e r2 = (p2628d.p2631c.C52628e) r2
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$d r3 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$d
                    r4 = 0
                    r3.<init>(r1, r6, r4)
                    d.f.a.m r3 = (p2628d.p2639f.p2640a.C52682m) r3
                    java.lang.Object r6 = kotlinx.coroutines.C53299e.m113284a(r2, r3, r5)
                    if (r6 != r0) goto L_0x004c
                    return r0
                L_0x004c:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45516a.C45520c.C45521a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {118}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1$longVideoCategory$1")
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$b */
        static final class C45522b extends C52624k implements C52682m<C53199ae, C52625c<? super List<? extends VideoCategoryParam>>, Object> {

            /* renamed from: a */
            Object f115020a;

            /* renamed from: b */
            int f115021b;

            /* renamed from: c */
            final /* synthetic */ C45520c f115022c;

            /* renamed from: d */
            private C53199ae f115023d;

            C45522b(C45520c cVar, C52625c cVar2) {
                this.f115022c = cVar;
                super(2, cVar2);
            }

            public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                C52711k.m112240b(cVar, "completion");
                C45522b bVar = new C45522b(this.f115022c, cVar);
                bVar.f115023d = (C53199ae) obj;
                return bVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C45522b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
            }

            public final Object invokeSuspend(Object obj) {
                Object a = C52601b.m112157a();
                switch (this.f115021b) {
                    case 0:
                        C53199ae aeVar = this.f115023d;
                        C45516a aVar = this.f115022c.f115012h;
                        this.f115020a = aeVar;
                        this.f115021b = 1;
                        obj = C53299e.m113284a(C53225av.m113075c(), new C45525e(aVar, null), this);
                        if (obj == a) {
                            return a;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {117}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1$recentVideoCategory$1")
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$c */
        static final class C45523c extends C52624k implements C52682m<C53199ae, C52625c<? super List<? extends VideoCategoryParam>>, Object> {

            /* renamed from: a */
            Object f115024a;

            /* renamed from: b */
            int f115025b;

            /* renamed from: c */
            final /* synthetic */ C45520c f115026c;

            /* renamed from: d */
            private C53199ae f115027d;

            C45523c(C45520c cVar, C52625c cVar2) {
                this.f115026c = cVar;
                super(2, cVar2);
            }

            public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
                C52711k.m112240b(cVar, "completion");
                C45523c cVar2 = new C45523c(this.f115026c, cVar);
                cVar2.f115027d = (C53199ae) obj;
                return cVar2;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C45523c) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
            }

            public final Object invokeSuspend(Object obj) {
                Object a = C52601b.m112157a();
                switch (this.f115025b) {
                    case 0:
                        C53199ae aeVar = this.f115027d;
                        C45516a aVar = this.f115026c.f115012h;
                        this.f115024a = aeVar;
                        this.f115025b = 1;
                        obj = C53299e.m113284a(C53225av.m113075c(), new C45526f(aVar, 3, null), this);
                        if (obj == a) {
                            return a;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        C45520c(C45516a aVar, C52625c cVar) {
            this.f115012h = aVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C45520c cVar2 = new C45520c(this.f115012h, cVar);
            cVar2.f115013i = (C53199ae) obj;
            return cVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C45520c) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
            r13 = ((java.lang.Boolean) r13).booleanValue();
            r12.f115012h.f114994d.set(r13);
            r5 = r12.f115012h;
            r12.f115005a = r4;
            r12.f115006b = r3;
            r12.f115007c = r1;
            r12.f115010f = r13;
            r12.f115008d = r5;
            r12.f115011g = 2;
            r6 = r3.mo110779a(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d2, code lost:
            if (r6 != r0) goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d4, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
            r7 = r4;
            r4 = r13;
            r13 = r6;
            r6 = r3;
            r3 = r5;
            r5 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00db, code lost:
            r1 = (java.util.List) r13;
            r12.f115005a = r7;
            r12.f115006b = r6;
            r12.f115007c = r5;
            r12.f115010f = r4;
            r12.f115008d = r3;
            r12.f115009e = r1;
            r12.f115011g = 3;
            r13 = r5.mo110779a(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f1, code lost:
            if (r13 != r0) goto L_0x00f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f3, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
            r13 = (java.util.List) r13;
            r12.f115005a = r7;
            r12.f115006b = r6;
            r12.f115007c = r5;
            r12.f115010f = r4;
            r12.f115011g = 4;
            r13 = kotlinx.coroutines.C53299e.m113284a(kotlinx.coroutines.C53225av.m113075c(), new com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45516a.C45528h(r3, r1, r13, null), r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0112, code lost:
            if (r13 != r0) goto L_0x0115;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0114, code lost:
            return r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p2628d.p2631c.p2632a.C52601b.m112157a()
                int r1 = r12.f115011g
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0050;
                    case 1: goto L_0x0043;
                    case 2: goto L_0x002a;
                    case 3: goto L_0x0012;
                    case 4: goto L_0x0115;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0012:
                java.lang.Object r1 = r12.f115009e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r3 = r12.f115008d
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r3 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45516a) r3
                boolean r4 = r12.f115010f
                java.lang.Object r5 = r12.f115007c
                kotlinx.coroutines.am r5 = (kotlinx.coroutines.C53207am) r5
                java.lang.Object r6 = r12.f115006b
                kotlinx.coroutines.am r6 = (kotlinx.coroutines.C53207am) r6
                java.lang.Object r7 = r12.f115005a
                kotlinx.coroutines.ae r7 = (kotlinx.coroutines.C53199ae) r7
                goto L_0x00f4
            L_0x002a:
                java.lang.Object r1 = r12.f115008d
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r1 = (com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45516a) r1
                boolean r3 = r12.f115010f
                java.lang.Object r4 = r12.f115007c
                kotlinx.coroutines.am r4 = (kotlinx.coroutines.C53207am) r4
                java.lang.Object r5 = r12.f115006b
                kotlinx.coroutines.am r5 = (kotlinx.coroutines.C53207am) r5
                java.lang.Object r6 = r12.f115005a
                kotlinx.coroutines.ae r6 = (kotlinx.coroutines.C53199ae) r6
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                goto L_0x00db
            L_0x0043:
                java.lang.Object r1 = r12.f115007c
                kotlinx.coroutines.am r1 = (kotlinx.coroutines.C53207am) r1
                java.lang.Object r3 = r12.f115006b
                kotlinx.coroutines.am r3 = (kotlinx.coroutines.C53207am) r3
                java.lang.Object r4 = r12.f115005a
                kotlinx.coroutines.ae r4 = (kotlinx.coroutines.C53199ae) r4
                goto L_0x00b2
            L_0x0050:
                kotlinx.coroutines.ae r13 = r12.f115013i
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r1 = r12.f115012h
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog r3 = r1.f114996f
                if (r3 != 0) goto L_0x006e
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog r3 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog
                android.support.v4.app.FragmentActivity r4 = r1.requireActivity()
                java.lang.String r5 = "requireActivity()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                android.app.Activity r4 = (android.app.Activity) r4
                r3.<init>(r4)
                r4 = 0
                r3.setCancelable(r4)
                r1.f114996f = r3
            L_0x006e:
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog r1 = r1.f114996f
                if (r1 == 0) goto L_0x0075
                r1.show()
            L_0x0075:
                r6 = 0
                r7 = 0
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$c r1 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$c
                r1.<init>(r12, r2)
                r8 = r1
                d.f.a.m r8 = (p2628d.p2639f.p2640a.C52682m) r8
                r9 = 3
                r10 = 0
                r5 = r13
                kotlinx.coroutines.am r3 = kotlinx.coroutines.C53301g.m113292b(r5, r6, null, r8, r9, null)
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$b r1 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$b
                r1.<init>(r12, r2)
                r8 = r1
                d.f.a.m r8 = (p2628d.p2639f.p2640a.C52682m) r8
                kotlinx.coroutines.am r1 = kotlinx.coroutines.C53301g.m113292b(r5, r6, null, r8, r9, null)
                kotlinx.coroutines.z r4 = kotlinx.coroutines.C53225av.m113073a()
                d.c.e r4 = (p2628d.p2631c.C52628e) r4
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$a r5 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$c$a
                r5.<init>(r12, r1, r2)
                d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
                r12.f115005a = r13
                r12.f115006b = r3
                r12.f115007c = r1
                r6 = 1
                r12.f115011g = r6
                java.lang.Object r4 = kotlinx.coroutines.C53299e.m113284a(r4, r5, r12)
                if (r4 != r0) goto L_0x00af
                return r0
            L_0x00af:
                r11 = r4
                r4 = r13
                r13 = r11
            L_0x00b2:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r5 = r12.f115012h
                java.util.concurrent.atomic.AtomicBoolean r5 = r5.f114994d
                r5.set(r13)
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r5 = r12.f115012h
                r12.f115005a = r4
                r12.f115006b = r3
                r12.f115007c = r1
                r12.f115010f = r13
                r12.f115008d = r5
                r6 = 2
                r12.f115011g = r6
                java.lang.Object r6 = r3.mo110779a(r12)
                if (r6 != r0) goto L_0x00d5
                return r0
            L_0x00d5:
                r7 = r4
                r4 = r13
                r13 = r6
                r6 = r3
                r3 = r5
                r5 = r1
            L_0x00db:
                r1 = r13
                java.util.List r1 = (java.util.List) r1
                r12.f115005a = r7
                r12.f115006b = r6
                r12.f115007c = r5
                r12.f115010f = r4
                r12.f115008d = r3
                r12.f115009e = r1
                r13 = 3
                r12.f115011g = r13
                java.lang.Object r13 = r5.mo110779a(r12)
                if (r13 != r0) goto L_0x00f4
                return r0
            L_0x00f4:
                java.util.List r13 = (java.util.List) r13
                r12.f115005a = r7
                r12.f115006b = r6
                r12.f115007c = r5
                r12.f115010f = r4
                r4 = 4
                r12.f115011g = r4
                kotlinx.coroutines.z r4 = kotlinx.coroutines.C53225av.m113075c()
                d.c.e r4 = (p2628d.p2631c.C52628e) r4
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$h r5 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$h
                r5.<init>(r3, r1, r13, r2)
                d.f.a.m r5 = (p2628d.p2639f.p2640a.C52682m) r5
                java.lang.Object r13 = kotlinx.coroutines.C53299e.m113284a(r4, r5, r12)
                if (r13 != r0) goto L_0x0115
                return r0
            L_0x0115:
                java.util.List r13 = (java.util.List) r13
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r0 = r12.f115012h
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.d r0 = r0.f114995e
                if (r0 != 0) goto L_0x0122
                java.lang.String r1 = "mAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x0122:
                r0.mo50303a(r13)
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a r13 = r12.f115012h
                r13.mo91789b()
                d.x r13 = p2628d.C52860x.f131107a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui.C45516a.C45520c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$findDefaultCategory$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$d */
    static final class C45524d extends C52624k implements C52682m<C53199ae, C52625c<? super Boolean>, Object> {

        /* renamed from: a */
        int f115028a;

        /* renamed from: b */
        final /* synthetic */ C45516a f115029b;

        /* renamed from: c */
        final /* synthetic */ List f115030c;

        /* renamed from: d */
        private C53199ae f115031d;

        C45524d(C45516a aVar, List list, C52625c cVar) {
            this.f115029b = aVar;
            this.f115030c = list;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C45524d dVar = new C45524d(this.f115029b, this.f115030c, cVar);
            dVar.f115031d = (C53199ae) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C45524d) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.f115028a == 0) {
                Iterator it = this.f115030c.iterator();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    String categoryName = ((VideoCategoryParam) it.next()).getCategoryName();
                    VideoCategoryParam videoCategoryParam = this.f115029b.f114992b;
                    if (videoCategoryParam != null) {
                        str = videoCategoryParam.getCategoryName();
                    } else {
                        str = null;
                    }
                    if (C52614b.m112161a(C52711k.m112239a((Object) categoryName, (Object) str)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    z = true;
                }
                return C52614b.m112161a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$getLongVideoCategoryAsync$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$e */
    static final class C45525e extends C52624k implements C52682m<C53199ae, C52625c<? super List<? extends VideoCategoryParam>>, Object> {

        /* renamed from: a */
        int f115032a;

        /* renamed from: b */
        final /* synthetic */ C45516a f115033b;

        /* renamed from: c */
        private C53199ae f115034c;

        C45525e(C45516a aVar, C52625c cVar) {
            this.f115033b = aVar;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C45525e eVar = new C45525e(this.f115033b, cVar);
            eVar.f115034c = (C53199ae) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C45525e) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f115032a == 0) {
                return this.f115033b.mo91788a().mo91769a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$getRecentCategoryAsync$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$f */
    static final class C45526f extends C52624k implements C52682m<C53199ae, C52625c<? super List<? extends VideoCategoryParam>>, Object> {

        /* renamed from: a */
        int f115035a;

        /* renamed from: b */
        final /* synthetic */ C45516a f115036b;

        /* renamed from: c */
        final /* synthetic */ int f115037c;

        /* renamed from: d */
        private C53199ae f115038d;

        C45526f(C45516a aVar, int i, C52625c cVar) {
            this.f115036b = aVar;
            this.f115037c = i;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C45526f fVar = new C45526f(this.f115036b, this.f115037c, cVar);
            fVar.f115038d = (C53199ae) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C45526f) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f115035a == 0) {
                return this.f115036b.mo91788a().mo91781a(this.f115037c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$g */
    static final class C45527g extends C52712l implements C52682m<Integer, VideoCategoryParam, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C45516a f115039a;

        C45527g(C45516a aVar) {
            this.f115039a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            VideoCategoryParam videoCategoryParam = (VideoCategoryParam) obj2;
            C52711k.m112240b(videoCategoryParam, "category");
            C45516a aVar = this.f115039a;
            Intent intent = new Intent();
            String str = "KEY_VIDEO_CATEGORY_CHOOSE_RESULT";
            if (videoCategoryParam != null) {
                intent.putExtra(str, videoCategoryParam);
                FragmentActivity activity = aVar.getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
                FragmentActivity activity2 = aVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                this.f115039a.mo91788a().mo91782a(videoCategoryParam);
                C45516a aVar2 = this.f115039a;
                String str2 = "click_type";
                C42438az a = C42438az.m93209a().mo86526a("enter_from", "video_post_page");
                String str3 = "shoot_way";
                AVETParameter aVETParameter = aVar2.f114993c;
                if (aVETParameter == null) {
                    C52711k.m112237a("mMobParam");
                }
                C42438az a2 = a.mo86526a(str3, aVETParameter.getShootWay());
                String str4 = "creation_id";
                AVETParameter aVETParameter2 = aVar2.f114993c;
                if (aVETParameter2 == null) {
                    C52711k.m112237a("mMobParam");
                }
                C26890h.m65011a(str2, a2.mo86526a(str4, aVETParameter2.getCreationId()).mo86526a("content_source", "upload").mo86526a("content_type", "video").mo86523a("type", videoCategoryParam.getCategoryIndex()).mo86526a("type_name", videoCategoryParam.getCategoryName()).f107329a);
                return C52860x.f131107a;
            }
            throw new C52857u("null cannot be cast to non-null type android.os.Parcelable");
        }
    }

    @C52618f(mo110254b = "ChooseVideoCategoryFragment.kt", mo110255c = {}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$mergeVideoCategory$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.a$h */
    static final class C45528h extends C52624k implements C52682m<C53199ae, C52625c<? super List<C45490b>>, Object> {

        /* renamed from: a */
        int f115040a;

        /* renamed from: b */
        final /* synthetic */ C45516a f115041b;

        /* renamed from: c */
        final /* synthetic */ List f115042c;

        /* renamed from: d */
        final /* synthetic */ List f115043d;

        /* renamed from: e */
        private C53199ae f115044e;

        C45528h(C45516a aVar, List list, List list2, C52625c cVar) {
            this.f115041b = aVar;
            this.f115042c = list;
            this.f115043d = list2;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C45528h hVar = new C45528h(this.f115041b, this.f115042c, this.f115043d, cVar);
            hVar.f115044e = (C53199ae) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C45528h) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f115040a == 0) {
                List arrayList = new ArrayList();
                if (!this.f115042c.isEmpty()) {
                    arrayList.add(new C45490b(3, 0, null, this.f115041b.getResources().getString(R.string.fve)));
                    int i = 0;
                    for (Object next : this.f115042c) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C52575l.m112100b();
                        }
                        arrayList.add(C45489a.m99118a((VideoCategoryParam) next, 2, C52614b.m112162a(i).intValue(), null));
                        i = i2;
                    }
                }
                if (!this.f115043d.isEmpty()) {
                    String string = this.f115041b.getResources().getString(R.string.ful);
                    C52711k.m112236a((Object) string, "resources.getString(R.string.classify_choose_tips)");
                    arrayList.add(new C45490b(1, 0, null, new C52847n(string, C52614b.m112161a(!this.f115042c.isEmpty()))));
                    int i3 = 0;
                    for (Object next2 : this.f115043d) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            C52575l.m112100b();
                        }
                        arrayList.add(C45489a.m99118a((VideoCategoryParam) next2, 0, C52614b.m112162a(i3).intValue(), null));
                        i3 = i4;
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final C45509c mo91788a() {
        return (C45509c) this.f114997h.getValue();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f114999j.mo110868m();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f115002m != null) {
            this.f115002m.clear();
        }
    }

    /* renamed from: b */
    public final void mo91789b() {
        StatusLoadingDialog statusLoadingDialog = this.f114996f;
        if (statusLoadingDialog != null && statusLoadingDialog.isShowing()) {
            StatusLoadingDialog statusLoadingDialog2 = this.f114996f;
            if (statusLoadingDialog2 != null) {
                statusLoadingDialog2.dismiss();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        VideoCategoryParam videoCategoryParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            videoCategoryParam = (VideoCategoryParam) arguments.getParcelable("KEY_VIDEO_DEFAULT_CATEGORY");
        } else {
            videoCategoryParam = null;
        }
        this.f114992b = videoCategoryParam;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_video_mob_param");
        }
        if (serializable != null) {
            this.f114993c = (AVETParameter) serializable;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 3, 1, false);
            RecyclerView recyclerView = this.f114998i;
            if (recyclerView == null) {
                C52711k.m112237a("mVideoCategoryList");
            }
            recyclerView.setLayoutManager(wrapGridLayoutManager);
            RecyclerView recyclerView2 = this.f114998i;
            if (recyclerView2 == null) {
                C52711k.m112237a("mVideoCategoryList");
            }
            if (recyclerView2.getAdapter() == null) {
                C45529b bVar = new C45529b(3);
                C45532d dVar = new C45532d(bVar, new C45527g(this));
                dVar.mo54798c(false);
                this.f114995e = dVar;
                RecyclerView recyclerView3 = this.f114998i;
                if (recyclerView3 == null) {
                    C52711k.m112237a("mVideoCategoryList");
                }
                C45532d dVar2 = this.f114995e;
                if (dVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                recyclerView3.setAdapter(dVar2);
                recyclerView3.mo4798a((C1331h) bVar);
            } else {
                RecyclerView recyclerView4 = this.f114998i;
                if (recyclerView4 == null) {
                    C52711k.m112237a("mVideoCategoryList");
                }
                C1322a adapter = recyclerView4.getAdapter();
                if (adapter != null) {
                    this.f114995e = (C45532d) adapter;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryAdapter");
                }
            }
            C53301g.m113291a(this.f115001l, C20346b.m50242a(), null, new C45520c(this, null), 2, null);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.bah, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.f6l);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.video_category_list)");
        this.f114998i = (RecyclerView) findViewById;
        return inflate;
    }
}
