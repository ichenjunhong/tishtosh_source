package com.p683ss.android.ugc.aweme.notification.newstyle.p2027d;

import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p683ss.android.ugc.aweme.notification.p2012b.C38152b;
import java.util.HashSet;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.d */
public final class C38333d extends C26832a<C38152b> {

    /* renamed from: b */
    public static final C38334a f97559b = new C38334a(null);

    /* renamed from: a */
    public boolean f97560a;

    /* renamed from: c */
    private final HashSet<String> f97561c = new HashSet<>();

    /* renamed from: d */
    private final String f97562d;

    /* renamed from: e */
    private final boolean f97563e;

    /* renamed from: f */
    private final int f97564f;

    /* renamed from: g */
    private final long f97565g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.d$a */
    public static final class C38334a {
        private C38334a() {
        }

        public /* synthetic */ C38334a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.d$b */
    static final class C38335b<TTaskResult, TContinuationResult> implements C0011g<C38152b, Object> {

        /* renamed from: a */
        final /* synthetic */ C38333d f97566a;

        C38335b(C38333d dVar) {
            this.f97566a = dVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo33d()) {
                this.f97566a.handleData((C38152b) iVar.mo34e());
                if (this.f97566a.mNotifyListeners != null) {
                    for (C26874f b : this.f97566a.mNotifyListeners) {
                        b.mo44838b();
                    }
                }
            } else if (this.f97566a.mNotifyListeners != null) {
                for (C26874f c_ : this.f97566a.mNotifyListeners) {
                    c_.mo44840c_(iVar.mo35f());
                }
            }
            return C52860x.f131107a;
        }
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p683ss.android.ugc.aweme.notification.p2012b.C38152b r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0006
            r9.mData = r0
            return
        L_0x0006:
            java.util.List<com.ss.android.ugc.aweme.notification.b.a> r1 = r10.f97165f
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            if (r1 == 0) goto L_0x001e
            r10.f97160a = r3
            goto L_0x00ab
        L_0x001e:
            java.util.List<com.ss.android.ugc.aweme.notification.b.a> r1 = r10.f97165f
            if (r1 == 0) goto L_0x005b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0032:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0053
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.ss.android.ugc.aweme.notification.b.a r7 = (com.p683ss.android.ugc.aweme.notification.p2012b.C38151a) r7
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.f97158a
            if (r7 == 0) goto L_0x0048
            java.lang.String r7 = r7.getUid()
            goto L_0x0049
        L_0x0048:
            r7 = r0
        L_0x0049:
            boolean r7 = r4.add(r7)
            if (r7 == 0) goto L_0x0032
            r5.add(r6)
            goto L_0x0032
        L_0x0053:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r1 = p2628d.p2629a.C52575l.m112139e(r5)
        L_0x005b:
            r10.f97165f = r1
            long r0 = r9.f97565g
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x009f
            java.util.List<com.ss.android.ugc.aweme.notification.b.a> r0 = r10.f97165f
            if (r0 == 0) goto L_0x009f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0079
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0079
            goto L_0x009f
        L_0x0079:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x007e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00a0
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.notification.b.a r4 = (com.p683ss.android.ugc.aweme.notification.p2012b.C38151a) r4
            long r4 = r4.f97159b
            long r6 = r9.f97565g
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0094
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            if (r4 == 0) goto L_0x007e
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x007e
            p2628d.p2629a.C52575l.m112102c()
            goto L_0x007e
        L_0x009f:
            r1 = 0
        L_0x00a0:
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.notification.b.b r0 = (com.p683ss.android.ugc.aweme.notification.p2012b.C38152b) r0
            if (r0 == 0) goto L_0x00a8
            int r3 = r0.f97164e
        L_0x00a8:
            int r3 = r3 + r1
            r10.f97164e = r3
        L_0x00ab:
            r9.mData = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38333d.handleData(com.ss.android.ugc.aweme.notification.b.b):void");
    }

    /* renamed from: a */
    public final void mo78280a(long j, long j2) {
        NoticeApiManager.m85268a(j, j2, 20, this.f97563e, this.f97564f, this.f97562d).mo20a((C0011g<TResult, TContinuationResult>) new C38335b<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    public C38333d(String str, boolean z, int i, long j) {
        C52711k.m112240b(str, "refId");
        this.f97562d = str;
        this.f97563e = z;
        this.f97564f = i;
        this.f97565g = j;
    }
}
