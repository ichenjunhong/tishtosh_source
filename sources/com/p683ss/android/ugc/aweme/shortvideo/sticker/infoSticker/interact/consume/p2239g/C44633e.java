package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44601b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.C44602c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44627g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e */
public final class C44633e {

    /* renamed from: a */
    public final VoteDetailApi f112911a;

    /* renamed from: b */
    public final C1689b f112912b = new C1689b();

    /* renamed from: c */
    public C44601b f112913c = new C44601b(0, false);

    /* renamed from: d */
    public final C26877c<User> f112914d;

    /* renamed from: e */
    public C44627g f112915e;

    /* renamed from: f */
    public int f112916f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e$a */
    public static final class C44634a implements C1674ab<VoteDetailResponse> {

        /* renamed from: a */
        final /* synthetic */ C44633e f112917a;

        public final void onComplete() {
        }

        public C44634a(C44633e eVar) {
            this.f112917a = eVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f112917a.f112914d.mo47028c(new Exception(th));
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
            this.f112917a.f112912b.mo6181a(cVar);
            this.f112917a.f112914d.mo47031e();
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r13) {
            /*
                r12 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse r13 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse) r13
                java.lang.String r0 = "t"
                p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e r0 = r12.f112917a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b
                int r2 = r13.getOffset()
                boolean r3 = r13.getHasMore()
                r1.<init>(r2, r3)
                r0.mo90587a(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e r0 = r12.f112917a
                java.util.List r1 = r13.getUsers()
                int r2 = r0.f112916f
                r3 = 0
                if (r2 != 0) goto L_0x0033
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r0 = r0.f112915e
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r0 = r0.mo90582b()
                if (r0 == 0) goto L_0x0031
                java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f112830a
                goto L_0x003f
            L_0x0031:
                r0 = r3
                goto L_0x003f
            L_0x0033:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.g r0 = r0.f112915e
                if (r0 == 0) goto L_0x0031
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.c r0 = r0.mo90582b()
                if (r0 == 0) goto L_0x0031
                java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f112832c
            L_0x003f:
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
                r4 = 1
                if (r2 != 0) goto L_0x00c4
                r2 = r1
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
                if (r5 == 0) goto L_0x0054
                goto L_0x00c4
            L_0x0054:
                if (r1 == 0) goto L_0x00ad
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Collection r5 = (java.util.Collection) r5
                java.util.Iterator r1 = r1.iterator()
            L_0x0063:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x00aa
                java.lang.Object r6 = r1.next()
                r7 = r6
                com.ss.android.ugc.aweme.profile.model.User r7 = (com.p683ss.android.ugc.aweme.profile.model.User) r7
                if (r0 == 0) goto L_0x009e
                r8 = r0
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x0079:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0099
                java.lang.Object r9 = r8.next()
                r10 = r9
                com.ss.android.ugc.aweme.profile.model.User r10 = (com.p683ss.android.ugc.aweme.profile.model.User) r10
                java.lang.String r11 = r7.getUid()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                java.lang.String r10 = r10.getUid()
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                boolean r10 = android.text.TextUtils.equals(r11, r10)
                if (r10 == 0) goto L_0x0079
                goto L_0x009a
            L_0x0099:
                r9 = r3
            L_0x009a:
                r7 = r9
                com.ss.android.ugc.aweme.profile.model.User r7 = (com.p683ss.android.ugc.aweme.profile.model.User) r7
                goto L_0x009f
            L_0x009e:
                r7 = r3
            L_0x009f:
                if (r7 == 0) goto L_0x00a3
                r7 = 1
                goto L_0x00a4
            L_0x00a3:
                r7 = 0
            L_0x00a4:
                if (r7 == 0) goto L_0x0063
                r5.add(r6)
                goto L_0x0063
            L_0x00aa:
                java.util.List r5 = (java.util.List) r5
                goto L_0x00b1
            L_0x00ad:
                java.util.List r5 = p2628d.p2629a.C52575l.m112097a()
            L_0x00b1:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
                if (r1 != 0) goto L_0x00c1
                r0.removeAll(r5)
            L_0x00c1:
                r1 = r0
                java.util.List r1 = (java.util.List) r1
            L_0x00c4:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e r0 = r12.f112917a
                com.ss.android.ugc.aweme.common.f.c<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.f112914d
                boolean r13 = r13.getHasMore()
                r0.mo47026b(r1, r13)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e r13 = r12.f112917a
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Collection r1 = (java.util.Collection) r1
                r0.<init>(r1)
                java.util.List r0 = (java.util.List) r0
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e r1 = r12.f112917a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.b r1 = r1.f112913c
                r13.mo90588a(r0, r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g.C44633e.C44634a.onNext(java.lang.Object):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.e$b */
    public static final class C44635b implements C1674ab<VoteDetailResponse> {

        /* renamed from: a */
        final /* synthetic */ C44633e f112918a;

        public final void onComplete() {
        }

        C44635b(C44633e eVar) {
            this.f112918a = eVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f112918a.f112914d.mo47025b(new Exception(th));
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
            this.f112918a.f112912b.mo6181a(cVar);
            this.f112918a.f112914d.mo47017R_();
        }

        public final /* synthetic */ void onNext(Object obj) {
            VoteDetailResponse voteDetailResponse = (VoteDetailResponse) obj;
            C52711k.m112240b(voteDetailResponse, "t");
            this.f112918a.mo90587a(new C44601b(voteDetailResponse.getOffset(), voteDetailResponse.getHasMore()));
            if (C9376b.m18558a((Collection<T>) voteDetailResponse.getUsers())) {
                this.f112918a.f112914d.aJ_();
                return;
            }
            this.f112918a.f112914d.mo47018a(voteDetailResponse.getUsers(), voteDetailResponse.getHasMore());
            this.f112918a.mo90588a(new ArrayList(voteDetailResponse.getUsers()), this.f112918a.f112913c, false);
        }
    }

    /* renamed from: a */
    public final void mo90587a(C44601b bVar) {
        C52711k.m112240b(bVar, "<set-?>");
        this.f112913c = bVar;
    }

    /* renamed from: a */
    public final void mo90586a(long j, long j2) {
        this.f112911a.getVoteDetail(j, j2, 0).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C44635b<Object>(this));
    }

    public C44633e(C26877c<User> cVar, C44627g gVar, int i) {
        C52711k.m112240b(cVar, "view");
        this.f112914d = cVar;
        this.f112915e = gVar;
        this.f112916f = i;
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(VoteDetailApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…oteDetailApi::class.java)");
        this.f112911a = (VoteDetailApi) create;
    }

    /* renamed from: a */
    public final void mo90588a(List<User> list, C44601b bVar, boolean z) {
        C44602c cVar;
        C44602c cVar2;
        C44602c cVar3 = null;
        if (z) {
            Collection collection = list;
            if (!C9376b.m18558a(collection)) {
                C44627g gVar = this.f112915e;
                if (gVar != null) {
                    cVar3 = gVar.mo90582b();
                }
                if (cVar3 == null) {
                    cVar2 = new C44602c(null, null, null, null, 15, null);
                } else {
                    cVar2 = cVar3;
                }
                if (this.f112916f == 0) {
                    if (cVar2.f112830a == null) {
                        cVar2.f112830a = new ArrayList();
                    }
                    List<User> list2 = cVar2.f112830a;
                    if (list2 != null) {
                        list2.addAll(collection);
                    }
                    cVar2.mo90549a(bVar);
                } else {
                    if (cVar2.f112832c == null) {
                        cVar2.f112832c = new ArrayList();
                    }
                    List<User> list3 = cVar2.f112832c;
                    if (list3 != null) {
                        list3.addAll(collection);
                    }
                    cVar2.mo90550b(bVar);
                }
                C44627g gVar2 = this.f112915e;
                if (gVar2 != null) {
                    gVar2.mo90581a(cVar2);
                }
            }
        } else if (!C9376b.m18558a((Collection<T>) list)) {
            C44627g gVar3 = this.f112915e;
            if (gVar3 != null) {
                cVar3 = gVar3.mo90582b();
            }
            if (cVar3 == null) {
                cVar = new C44602c(null, null, null, null, 15, null);
            } else {
                cVar = cVar3;
            }
            if (this.f112916f == 0) {
                cVar.f112830a = list;
                cVar.mo90549a(bVar);
            } else {
                cVar.f112832c = list;
                cVar.mo90550b(bVar);
            }
            C44627g gVar4 = this.f112915e;
            if (gVar4 != null) {
                gVar4.mo90581a(cVar);
            }
        }
    }
}
