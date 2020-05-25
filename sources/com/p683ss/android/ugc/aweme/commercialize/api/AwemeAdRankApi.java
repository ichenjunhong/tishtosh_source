package com.p683ss.android.ugc.aweme.commercialize.api;

import com.bytedance.retrofit2.p831b.C12724z;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.model.C26123g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26127i;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi */
public final class AwemeAdRankApi {

    /* renamed from: a */
    public static final AwemeAdRankApi f67852a = new AwemeAdRankApi();

    /* renamed from: b */
    private static final RealApi f67853b;

    /* renamed from: c */
    private static final C17971f f67854c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/ad/rank/")
        C0013i<C26127i> requestAwemeAdRank(@C12724z(mo23894a = "cached_aweme_list") String str, @C12724z(mo23894a = "last_ad_show_interval") long j, @C12724z(mo23894a = "action_mask") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$a */
    public interface C25634a {
        /* renamed from: a */
        void mo52787a(String str);

        /* renamed from: a */
        void mo52788a(String str, Exception exc, String str2);

        /* renamed from: a */
        void mo52789a(List<C26123g> list, String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$b */
    static final class C25635b<TTaskResult, TContinuationResult> implements C0011g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C25634a f67855a;

        C25635b(C25634a aVar) {
            this.f67855a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (iVar.mo31c()) {
                C25634a aVar = this.f67855a;
                if (aVar != null) {
                    aVar.mo52787a("request canceled");
                }
            } else {
                List<C26123g> list = null;
                if (iVar.mo33d()) {
                    C25634a aVar2 = this.f67855a;
                    if (aVar2 != null) {
                        String message = iVar.mo35f().getMessage();
                        if (message == null) {
                            message = "";
                        }
                        aVar2.mo52788a(message, iVar.mo35f(), null);
                    }
                } else {
                    C26127i iVar2 = (C26127i) iVar.mo34e();
                    if (iVar2.f68982a == 204) {
                        C25634a aVar3 = this.f67855a;
                        if (aVar3 != null) {
                            String str = iVar2.f68983b;
                            if (str == null) {
                                str = "204: no change";
                            }
                            aVar3.mo52787a(str);
                        }
                    } else {
                        List<C26123g> list2 = iVar2.f68984c;
                        if (list2 != null) {
                            list = C52575l.m112128b((Iterable<? extends T>) list2);
                        }
                        if (list != null) {
                            C29981aa a = C29981aa.m70153a();
                            C52711k.m112236a((Object) iVar2, "response");
                            a.mo60162a(iVar2.getRequestId(), iVar2.f68985d);
                            for (C26123g repackAweme : list) {
                                Aweme repackAweme2 = repackAweme.getRepackAweme();
                                if (repackAweme2 != null) {
                                    repackAweme2.setRequestId(iVar2.getRequestId());
                                }
                            }
                            C25634a aVar4 = this.f67855a;
                            if (aVar4 != null) {
                                aVar4.mo52789a(list, iVar2.getRequestId());
                            }
                        } else {
                            C25634a aVar5 = this.f67855a;
                            if (aVar5 != null) {
                                Exception illegalArgumentException = new IllegalArgumentException("empty rank list");
                                C52711k.m112236a((Object) iVar2, "response");
                                aVar5.mo52788a("empty rank list", illegalArgumentException, iVar2.getRequestId());
                            }
                        }
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    private AwemeAdRankApi() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    static {
        /*
            com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi r0 = new com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi
            r0.<init>()
            f67852a = r0
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.createIRetrofitFactorybyMonsterPlugin()
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r0
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = com.p683ss.android.p1140c.C18845b.f52040e
            com.bytedance.ies.ugc.aweme.network.f r0 = r0.create(r2)
            if (r0 == 0) goto L_0x0021
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi> r2 = com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.RealApi.class
            java.lang.Object r0 = r0.mo19930a(r2)
            com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi r0 = (com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.RealApi) r0
            goto L_0x0022
        L_0x0021:
            r0 = r1
        L_0x0022:
            f67853b = r0
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.p683ss.android.ugc.aweme.utils.GsonHolder.createGsonProviderbyMonsterPlugin()
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = (com.p683ss.android.ugc.aweme.utils.GsonProvider) r0
            if (r0 == 0) goto L_0x0030
            com.google.gson.f r1 = r0.getGson()
        L_0x0030:
            f67854c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r11 == null) goto L_0x0066;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52785a(java.util.List<? extends com.p683ss.android.ugc.aweme.feed.model.Aweme> r11, long r12, com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.C25634a r14) {
        /*
            r10 = this;
            java.lang.String r0 = "cachedAwemeList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p2628d.p2629a.C52575l.m112104a(r11, r1)
            r0.<init>(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r11 = r11.iterator()
        L_0x0018:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r11.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.aweme.commercialize.model.g r9 = new com.ss.android.ugc.aweme.commercialize.model.g
            java.lang.String r3 = r1.getAid()
            boolean r4 = r1.isAd()
            boolean r2 = r1.isAd()
            if (r2 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0049
            java.lang.Long r1 = r1.getCreativeId()
            if (r1 == 0) goto L_0x0049
            long r1 = r1.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x004d
        L_0x0049:
            r1 = 0
            goto L_0x004d
        L_0x004b:
            java.lang.String r1 = ""
        L_0x004d:
            r5 = r1
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r9)
            goto L_0x0018
        L_0x005a:
            java.util.List r0 = (java.util.List) r0
            com.google.gson.f r11 = f67854c
            if (r11 == 0) goto L_0x0066
            java.lang.String r11 = r11.mo34889b(r0)
            if (r11 != 0) goto L_0x0068
        L_0x0066:
            java.lang.String r11 = ""
        L_0x0068:
            com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$RealApi r0 = f67853b     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x0087
            int r1 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67753e     // Catch:{ Exception -> 0x0088 }
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67752d     // Catch:{ Exception -> 0x0088 }
            java.lang.String r2 = "lastAdType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)     // Catch:{ Exception -> 0x0088 }
            r1 = -1
            a.i r11 = r0.requestAwemeAdRank(r11, r12, r1)     // Catch:{ Exception -> 0x0088 }
            if (r11 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$b r12 = new com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$b     // Catch:{ Exception -> 0x0088 }
            r12.<init>(r14)     // Catch:{ Exception -> 0x0088 }
            a.g r12 = (p001a.C0011g) r12     // Catch:{ Exception -> 0x0088 }
            r11.mo19a(r12)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0088
        L_0x0087:
            return
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi.mo52785a(java.util.List, long, com.ss.android.ugc.aweme.commercialize.api.AwemeAdRankApi$a):void");
    }
}
