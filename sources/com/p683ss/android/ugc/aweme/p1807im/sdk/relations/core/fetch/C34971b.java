package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch;

import android.support.p030v4.content.C0726c;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse.ServerTimeExtra;
import com.p683ss.android.ugc.aweme.common.net.C26923f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImRelationFetchSettings;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.RelationFetchFrequencyConfig;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34980b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34981c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.RelationFetchResponse;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.ImApi;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b */
public final class C34971b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89985a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34971b.class), "freqConfig", "getFreqConfig()Lcom/ss/android/ugc/aweme/im/sdk/abtest/RelationFetchFrequencyConfig;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34971b.class), "fetchLock", "getFetchLock()Ljava/util/concurrent/locks/ReentrantLock;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34971b.class), "waitForNetworkTaskList", "getWaitForNetworkTaskList()Ljava/util/List;"))};

    /* renamed from: b */
    static volatile boolean f89986b;

    /* renamed from: c */
    static volatile boolean f89987c;

    /* renamed from: d */
    public static final C34971b f89988d;

    /* renamed from: e */
    private static final C52668f f89989e = C52732g.m112285a(C34975d.f89997a);

    /* renamed from: f */
    private static final C52668f f89990f = C52732g.m112285a(C34972a.f89992a);

    /* renamed from: g */
    private static final C52668f f89991g = C52732g.m112285a(C34976e.f89998a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b$a */
    static final class C34972a extends C52712l implements C52670a<ReentrantLock> {

        /* renamed from: a */
        public static final C34972a f89992a = new C34972a();

        C34972a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ReentrantLock();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b$b */
    static final class C34973b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C34970a f89993a;

        /* renamed from: b */
        final /* synthetic */ boolean f89994b;

        C34973b(C34970a aVar, boolean z) {
            this.f89993a = aVar;
            this.f89994b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x011f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r14 = this;
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89988d
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a.a r1 = r14.f89993a
                boolean r2 = r14.f89994b
                boolean r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79727a()
                r4 = 1
                r5 = 0
                r6 = 0
                if (r3 != 0) goto L_0x0029
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "checkByFetchSceneSync ["
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "] limit by not login"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
            L_0x0026:
                r0 = 0
                goto L_0x010a
            L_0x0029:
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a.a r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a.COLDUP_FULL
                if (r1 != r3) goto L_0x0078
                if (r2 == 0) goto L_0x0078
                boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89986b
                if (r2 == 0) goto L_0x004d
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89987c = r4
                java.lang.String r2 = "waitForLastFetchDone start"
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r2)
                java.util.concurrent.locks.ReentrantLock r2 = r0.mo73069b()
                r2.lock()
                java.util.concurrent.locks.ReentrantLock r0 = r0.mo73069b()
                r0.unlock()
                java.lang.String r0 = "waitForLastFetchDone end"
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
            L_0x004d:
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78305i()
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r2 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r0.mo73412d(r6)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "checkByFetchSceneSync ["
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "] allow by forceClear"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
            L_0x0075:
                r0 = 1
                goto L_0x010a
            L_0x0078:
                boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89986b
                if (r2 == 0) goto L_0x0093
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "checkByFetchSceneSync ["
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "] limit by fetching"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
                goto L_0x0026
            L_0x0093:
                com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r3 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                long r2 = r2.mo73380F()
                int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r8 > 0) goto L_0x00bb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "checkByFetchSceneSync ["
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "] allow by last fetched max time"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
                goto L_0x0075
            L_0x00bb:
                com.ss.android.ugc.aweme.im.sdk.i.c.b r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                java.lang.String r3 = "IMUserDao.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                boolean r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78306j()
                if (r2 == 0) goto L_0x00e1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "checkByFetchSceneSync ["
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r1 = "] allow by DB empty"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
                goto L_0x0075
            L_0x00e1:
                boolean r0 = r0.mo73068a(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "checkByFetchSceneSync ["
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = "] "
                r2.append(r1)
                if (r0 == 0) goto L_0x00f9
                java.lang.String r1 = "allow"
                goto L_0x00fb
            L_0x00f9:
                java.lang.String r1 = "limit"
            L_0x00fb:
                r2.append(r1)
                java.lang.String r1 = " by time"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r1)
            L_0x010a:
                if (r0 == 0) goto L_0x011b
                boolean r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79110c()
                if (r1 != 0) goto L_0x011b
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89988d
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a.a r1 = r14.f89993a
                r0.mo73070b(r1)
                goto L_0x025b
            L_0x011b:
                if (r0 != 0) goto L_0x011f
                goto L_0x025b
            L_0x011f:
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89988d
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a.a r1 = r14.f89993a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "doRelationFetchSync ["
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r3 = "] start"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r2)
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89986b = r4
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89987c = r5
                java.util.concurrent.locks.ReentrantLock r2 = r0.mo73069b()
                r2.lock()
                com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r3 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                long r2 = r2.mo73380F()
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.a.a r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.p1886a.C34970a.COLDUP_FULL
                if (r1 != r4) goto L_0x0168
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78305i()
                com.ss.android.ugc.aweme.im.sdk.utils.t r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r3 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r2.mo73412d(r6)
                r2 = r6
            L_0x0168:
                int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x016e
                r12 = r6
                goto L_0x016f
            L_0x016e:
                r12 = r2
            L_0x016f:
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = r0
                r9 = r1
                com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.model.c r2 = r8.mo73066a(r9, r10, r12)
                com.ss.android.ugc.aweme.im.sdk.i.c.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78292a()
                java.lang.String r4 = "IMUserDao.inst()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                int r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1841i.p1844c.C34387b.m78308l()
                if (r3 > 0) goto L_0x01c6
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r8 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
                r4.mo73412d(r6)
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r6 = "error"
                r7 = 4
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r4.put(r6, r7)
                java.lang.String r6 = "error_stack"
                java.lang.String r7 = r2.toString()
                r4.put(r6, r7)
                java.lang.String r6 = "spotlight_relation_load_error_new"
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79731b(r6, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r6 = "monitorDBEmptyError: errorStack="
                r4.<init>(r6)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r4)
                goto L_0x01da
            L_0x01c6:
                long r8 = r2.f90006c
                int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x01da
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r6 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                long r6 = r2.f90006c
                r4.mo73412d(r6)
            L_0x01da:
                if (r3 <= 0) goto L_0x0234
                boolean r4 = r2.f90005b
                if (r4 != 0) goto L_0x01e4
                int r4 = r2.f90009f
                if (r4 <= 0) goto L_0x0234
            L_0x01e4:
                long r6 = java.lang.System.currentTimeMillis()
                int[] r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34977c.f90000b
                int r8 = r1.ordinal()
                r4 = r4[r8]
                switch(r4) {
                    case 1: goto L_0x0228;
                    case 2: goto L_0x021b;
                    case 3: goto L_0x020e;
                    case 4: goto L_0x0201;
                    case 5: goto L_0x01f4;
                    default: goto L_0x01f3;
                }
            L_0x01f3:
                goto L_0x0234
            L_0x01f4:
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r8 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
                r4.mo73429i(r6)
                goto L_0x0234
            L_0x0201:
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r8 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
                r4.mo73426h(r6)
                goto L_0x0234
            L_0x020e:
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r8 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
                r4.mo73423g(r6)
                goto L_0x0234
            L_0x021b:
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r8 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
                r4.mo73419f(r6)
                goto L_0x0234
            L_0x0228:
                com.ss.android.ugc.aweme.im.sdk.utils.t r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79102a()
                java.lang.String r8 = "repo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r8)
                r4.mo73414e(r6)
            L_0x0234:
                r0.mo73067a(r2)
                java.util.concurrent.locks.ReentrantLock r0 = r0.mo73069b()
                r0.unlock()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.f89986b = r5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "doRelationFetchSync ["
                r0.<init>(r4)
                r0.append(r1)
                java.lang.String r1 = "] end: dbSize="
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.m79105a(r0)
                boolean r5 = r2.f90005b
            L_0x025b:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.C34971b.C34973b.call():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b$c */
    static final class C34974c<TTaskResult, TContinuationResult> implements C0011g<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34970a f89995a;

        /* renamed from: b */
        final /* synthetic */ C52671b f89996b;

        C34974c(C34970a aVar, C52671b bVar) {
            this.f89995a = aVar;
            this.f89996b = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo34e() != null) {
                StringBuilder sb = new StringBuilder("fetchRelationAsync [");
                sb.append(this.f89995a);
                sb.append("]: result=");
                sb.append((Boolean) iVar.mo34e());
                C34971b.m79105a(sb.toString());
                C52671b bVar = this.f89996b;
                if (bVar != null) {
                    Object e = iVar.mo34e();
                    C52711k.m112236a(e, "it.result");
                    bVar.invoke(e);
                }
            } else if (iVar.mo35f() != null) {
                StringBuilder sb2 = new StringBuilder("fetchRelationAsync [");
                sb2.append(this.f89995a);
                sb2.append("]: error=");
                sb2.append(iVar.mo35f().getMessage());
                C34971b.m79105a(sb2.toString());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b$d */
    static final class C34975d extends C52712l implements C52670a<RelationFetchFrequencyConfig> {

        /* renamed from: a */
        public static final C34975d f89997a = new C34975d();

        C34975d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ImRelationFetchSettings.INSTANCE.getRelationFetchFreqConfig();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.fetch.b$e */
    static final class C34976e extends C52712l implements C52670a<List<C34970a>> {

        /* renamed from: a */
        public static final C34976e f89998a = new C34976e();

        C34976e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    private C34971b() {
    }

    /* renamed from: d */
    private final RelationFetchFrequencyConfig m79111d() {
        return (RelationFetchFrequencyConfig) f89989e.getValue();
    }

    /* renamed from: e */
    private final List<C34970a> m79112e() {
        return (List) f89991g.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ReentrantLock mo73069b() {
        return (ReentrantLock) f89990f.getValue();
    }

    /* renamed from: a */
    static C35284t m79102a() {
        return C35284t.m79782a();
    }

    /* renamed from: c */
    public static boolean m79110c() {
        return C34978d.m79118a(C11010c.m22280a());
    }

    static {
        C34971b bVar = new C34971b();
        f89988d = bVar;
        C47718bf.m103290c(bVar);
    }

    /* renamed from: a */
    private static void m79106a(Throwable th) {
        C32458a.m75148a(th);
    }

    /* renamed from: a */
    public static void m79105a(String str) {
        StringBuilder sb = new StringBuilder("RelationFetchManager ");
        sb.append(str);
        C32458a.m75144a(sb.toString());
    }

    /* renamed from: c */
    private final long m79109c(C34970a aVar) {
        switch (C34977c.f89999a[aVar.ordinal()]) {
            case 1:
                C35284t a = m79102a();
                C52711k.m112236a((Object) a, "repo");
                return a.mo73381G();
            case 2:
                C35284t a2 = m79102a();
                C52711k.m112236a((Object) a2, "repo");
                return a2.mo73382H();
            case 3:
                C35284t a3 = m79102a();
                C52711k.m112236a((Object) a3, "repo");
                return a3.mo73383I();
            case 4:
                C35284t a4 = m79102a();
                C52711k.m112236a((Object) a4, "repo");
                return a4.mo73384J();
            case 5:
                C35284t a5 = m79102a();
                C52711k.m112236a((Object) a5, "repo");
                return a5.mo73385K();
            default:
                return Long.MAX_VALUE;
        }
    }

    /* renamed from: a */
    public final boolean mo73068a(C34970a aVar) {
        boolean z;
        long c = m79109c(aVar);
        long frequencyByFetchScene = m79111d().getFrequencyByFetchScene(aVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - c >= 1000 * frequencyByFetchScene) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("checkFrequencyByFetchScene [");
        sb.append(aVar);
        sb.append("] ");
        sb.append(z);
        sb.append(": [");
        sb.append(currentTimeMillis);
        sb.append(", ");
        sb.append(c);
        sb.append(", ");
        sb.append(frequencyByFetchScene);
        sb.append("] ");
        m79105a(sb.toString());
        return z;
    }

    /* renamed from: b */
    public final void mo73070b(C34970a aVar) {
        StringBuilder sb = new StringBuilder("enqueueFetchTaskByNetwork: ");
        sb.append(aVar);
        m79105a(sb.toString());
        synchronized (m79112e()) {
            if (!f89988d.m79112e().contains(aVar) && !f89988d.m79112e().contains(C34970a.COLDUP_FULL)) {
                if (aVar == C34970a.COLDUP_FULL) {
                    f89988d.m79112e().clear();
                    f89988d.m79112e().add(aVar);
                } else {
                    f89988d.m79112e().add(aVar);
                }
            }
        }
    }

    @C53771m
    public final void onEvent(C26923f fVar) {
        C34971b bVar;
        T t = null;
        if (m79110c()) {
            bVar = this;
        } else {
            bVar = null;
        }
        C34971b bVar2 = bVar;
        if (bVar2 != null) {
            C52727e eVar = new C52727e();
            synchronized (bVar2.m79112e()) {
                StringBuilder sb = new StringBuilder("bookNextFetchTask task=");
                sb.append(f89988d.m79112e());
                m79105a(sb.toString());
                if (!f89988d.m79112e().isEmpty()) {
                    if (f89988d.m79112e().contains(C34970a.COLDUP_FULL)) {
                        t = C34970a.COLDUP_FULL;
                    } else if (f89988d.m79112e().contains(C34970a.COLDUP_DIFF)) {
                        t = C34970a.COLDUP_DIFF;
                    } else {
                        t = (C34970a) f89988d.m79112e().get(0);
                    }
                }
                eVar.element = t;
                f89988d.m79112e().clear();
            }
            C34970a aVar = (C34970a) eVar.element;
            if (aVar != null) {
                m79104a(f89988d, aVar, false, null, 6, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo73067a(C34981c cVar) {
        boolean z;
        C35284t a = m79102a();
        C52711k.m112236a((Object) a, "repo");
        List L = a.mo73386L();
        StringBuilder sb = new StringBuilder("checkFetchResult start, localPageList=");
        sb.append(L.size());
        m79105a(sb.toString());
        if (cVar.f90005b) {
            ListIterator listIterator = L.listIterator();
            while (listIterator.hasNext()) {
                C34980b bVar = (C34980b) listIterator.next();
                listIterator.remove();
                if (bVar.f90002a <= 0 || bVar.f90002a <= bVar.f90003b) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!mo73066a(C34970a.MISSING_PAGE, bVar.f90002a, bVar.f90003b).f90005b) {
                        break;
                    }
                }
            }
        } else if (cVar.f90007d > cVar.f90013j) {
            L.add(new C34980b(cVar.f90007d, cVar.f90013j));
        }
        C35284t a2 = m79102a();
        C52711k.m112236a((Object) a2, "repo");
        a2.mo73397a(L);
        C52711k.m112236a((Object) C34387b.m78292a(), "IMUserDao.inst()");
        int l = C34387b.m78308l();
        StringBuilder sb2 = new StringBuilder("checkFetchResult end, localPageList=");
        sb2.append(L.size());
        sb2.append(", dbSize=");
        sb2.append(l);
        m79105a(sb2.toString());
    }

    /* renamed from: a */
    private final boolean m79107a(C34970a aVar, List<IMUser> list) {
        Integer num;
        boolean z;
        StringBuilder sb = new StringBuilder("doRealDBUpdate [");
        sb.append(aVar);
        sb.append("] start: result=");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(' ');
        m79105a(sb.toString());
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        int i = 0;
        while (i < 2 && !f89987c) {
            try {
                for (IMUser iMUser : list) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iMUser.getUid());
                    sb2.append(" shareStatus:");
                    sb2.append(iMUser.getShareStatus());
                    C32458a.m75150b("RelationFetchManager", sb2.toString());
                }
                C34387b.m78292a().mo72391a(list);
                return true;
            } catch (Throwable th) {
                StringBuilder sb3 = new StringBuilder("fetchScene=");
                sb3.append(aVar);
                sb3.append(", retryTimes= ");
                sb3.append(i);
                sb3.append(", error=");
                String message = th.getMessage();
                if (message == null) {
                    message = "null stack message";
                }
                sb3.append(message);
                String sb4 = sb3.toString();
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", Integer.valueOf(3));
                linkedHashMap.put("error_stack", sb4);
                C35265e.m79731b("spotlight_relation_load_error_new", linkedHashMap);
                StringBuilder sb5 = new StringBuilder("monitorDBUpdateError: errorStack=");
                sb5.append(sb4);
                m79105a(sb5.toString());
                m79106a(th);
                i++;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m79103a(C34970a aVar, boolean z, C52671b<? super Boolean, C52860x> bVar) {
        StringBuilder sb = new StringBuilder("fetchRelationAsync [");
        sb.append(aVar);
        sb.append("] start: forceClear=");
        sb.append(z);
        m79105a(sb.toString());
        C0013i.m16a((Callable<TResult>) new C34973b<TResult>(aVar, z)).mo20a((C0011g<TResult, TContinuationResult>) new C34974c<TResult,TContinuationResult>(aVar, bVar), C0013i.f25b);
    }

    /* renamed from: b */
    private final RelationFetchResponse m79108b(C34970a aVar, long j, long j2) {
        C34970a aVar2;
        C34970a aVar3;
        int i;
        int i2;
        boolean z;
        int i3;
        C34970a aVar4 = aVar;
        StringBuilder sb = new StringBuilder("doRealNetworkRequest [");
        sb.append(aVar4);
        sb.append("] [");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append("] start");
        m79105a(sb.toString());
        if (aVar4 == C34970a.LOADER_DIFF) {
            aVar2 = C34970a.COLDUP_DIFF;
        } else {
            aVar2 = aVar4;
        }
        int i4 = 0;
        while (i4 < 2 && !f89987c) {
            try {
                ImApi a = C35286u.m79865a();
                String value = aVar2.getValue();
                if (C0726c.m2090a(C11010c.m22280a(), "android.permission.READ_CONTACTS") != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    if (g.isUidContactPermisioned()) {
                        i3 = 1;
                        i = 2;
                        aVar3 = aVar2;
                        i2 = i4;
                        return (RelationFetchResponse) a.getSpotlightRelation(100, value, 1, j, j2, i3).get();
                    }
                }
                i3 = 0;
                i = 2;
                aVar3 = aVar2;
                i2 = i4;
                try {
                    return (RelationFetchResponse) a.getSpotlightRelation(100, value, 1, j, j2, i3).get();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar3 = aVar2;
                i2 = i4;
                i = 2;
                StringBuilder sb2 = new StringBuilder("fetchScene=");
                sb2.append(aVar4);
                sb2.append(", retryTimes= ");
                sb2.append(i2);
                sb2.append(", error=");
                String message = th.getMessage();
                if (message == null) {
                    message = "null stack message";
                }
                sb2.append(message);
                String sb3 = sb2.toString();
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", Integer.valueOf(i));
                linkedHashMap.put("error_stack", sb3);
                C35265e.m79731b("spotlight_relation_load_error_new", linkedHashMap);
                StringBuilder sb4 = new StringBuilder("monitorNetworkRequestError: errorStack=");
                sb4.append(sb3);
                m79105a(sb4.toString());
                m79106a(th);
                i4 = i2 + 1;
                aVar2 = aVar3;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C34981c mo73066a(C34970a aVar, long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C34970a aVar2 = aVar;
        long j3 = j;
        long j4 = j2;
        StringBuilder sb = new StringBuilder("doRealFetchAndDBUpdate [");
        sb.append(aVar2);
        sb.append("] [");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append("] start");
        m79105a(sb.toString());
        C34981c cVar = new C34981c(aVar, j, j2);
        int i = 1;
        long j5 = j3;
        boolean z5 = true;
        while (z5 && !f89987c && C35265e.m79727a()) {
            RelationFetchResponse b = m79108b(aVar, j5, j2);
            if (b != null) {
                if (b.getHasMore() == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                j5 = b.getMinTime();
                ServerTimeExtra serverTimeExtra = b.extra;
                if (serverTimeExtra != null) {
                    String str = serverTimeExtra.logid;
                    if (str != null) {
                        cVar.mo73106a().add(str);
                    }
                }
                if (!z2) {
                    C35284t.m79782a().mo73403b(b.getHotSoonNotice());
                }
                Collection followings = b.getFollowings();
                if (followings == null || followings.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    cVar.f90008e += b.getFollowings().size();
                    if (m79107a(aVar2, b.getFollowings())) {
                        cVar.f90009f = cVar.f90008e;
                        cVar.f90010g += i;
                        z4 = z2;
                        cVar.f90006c = Math.max(cVar.f90006c, b.getMaxTime());
                        cVar.f90007d = b.getMinTime();
                        if (cVar.f90010g > 200) {
                            Map linkedHashMap = new LinkedHashMap();
                            z = true;
                            linkedHashMap.put("error", Integer.valueOf(1));
                            linkedHashMap.put("error_stack", cVar.toString());
                            C35265e.m79731b("spotlight_relation_load_error_new", linkedHashMap);
                            StringBuilder sb2 = new StringBuilder("monitorTooManyLoadError: errorStack=");
                            sb2.append(cVar);
                            m79105a(sb2.toString());
                        } else {
                            z5 = z4;
                            i = 1;
                        }
                    } else {
                        z4 = z2;
                        z = true;
                    }
                } else {
                    z = true;
                    z4 = z2;
                }
                z5 = z4;
                break;
            }
            break;
        }
        z = true;
        if (z5 || cVar.f90008e != cVar.f90009f) {
            z = false;
        }
        cVar.f90005b = z;
        StringBuilder sb3 = new StringBuilder("doRealFetchAndDBUpdate [");
        sb3.append(aVar2);
        sb3.append("] [");
        sb3.append(j3);
        sb3.append(", ");
        sb3.append(j4);
        sb3.append("] end: result=");
        sb3.append(cVar);
        m79105a(sb3.toString());
        return cVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m79104a(C34971b bVar, C34970a aVar, boolean z, C52671b bVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bVar.m79103a(aVar, z, null);
    }
}
