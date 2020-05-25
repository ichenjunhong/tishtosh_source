package com.p683ss.android.ugc.aweme.notification.newstyle.p2027d;

import android.os.Message;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p2628d.C52857u;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.f */
public final class C38337f extends C26875a<MusNotice, MessageResponse> {

    /* renamed from: a */
    public int f97569a = 36;

    /* renamed from: b */
    public long f97570b;

    /* renamed from: c */
    public long f97571c;

    /* renamed from: d */
    public int f97572d;

    /* renamed from: e */
    private final Map<Integer, List<MusNotice>> f97573e = new LinkedHashMap();

    /* renamed from: f */
    private boolean f97574f;

    /* renamed from: g */
    private long f97575g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.f$a */
    static final class C38338a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C38337f f97576a;

        /* renamed from: b */
        final /* synthetic */ int f97577b;

        /* renamed from: c */
        final /* synthetic */ Integer f97578c;

        C38338a(C38337f fVar, int i, Integer num) {
            this.f97576a = fVar;
            this.f97577b = i;
            this.f97578c = num;
        }

        public final /* synthetic */ Object call() {
            return MusNotificationApiManager.m85266a(this.f97576a.f97570b, this.f97576a.f97571c, 20, this.f97577b, this.f97578c, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.f$b */
    static final class C38339b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ int f97579a;

        /* renamed from: b */
        final /* synthetic */ Integer f97580b;

        C38339b(int i, Integer num) {
            this.f97579a = i;
            this.f97580b = num;
        }

        public final /* synthetic */ Object call() {
            return MusNotificationApiManager.m85266a(0, 0, 20, this.f97579a, this.f97580b, 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.f$c */
    static final class C38340c<T> implements Comparator<MusNotice> {

        /* renamed from: a */
        public static final C38340c f97581a = new C38340c();

        C38340c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            MusNotice musNotice = (MusNotice) obj;
            MusNotice musNotice2 = (MusNotice) obj2;
            C52711k.m112236a((Object) musNotice2, "o2");
            long createTime = musNotice2.getCreateTime();
            C52711k.m112236a((Object) musNotice, "o1");
            long createTime2 = createTime - musNotice.getCreateTime();
            if (createTime2 > 0) {
                return 1;
            }
            if (createTime2 < 0) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.f$d */
    public static final class C38341d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((MusNotice) t).getLowestPosition()), Integer.valueOf(((MusNotice) t2).getLowestPosition()));
        }
    }

    public final boolean isHasMore() {
        return this.f97574f;
    }

    public final List<MusNotice> getItems() {
        return mo78282a(this.f97569a);
    }

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (objArr.length == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m85629a(List<MusNotice> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            C52575l.m112105a(list, C38340c.f97581a);
        }
    }

    /* renamed from: a */
    public final List<MusNotice> mo78282a(int i) {
        List<MusNotice> list = (List) this.f97573e.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<MusNotice> arrayList = new ArrayList<>();
        this.f97573e.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        Integer num = objArr[1];
        if (num != null) {
            int intValue = num.intValue();
            C23566n.m57766a().mo48750a(this.mHandler, new C38338a(this, intValue, objArr[2]), intValue);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        Integer num = objArr[1];
        if (num != null) {
            int intValue = num.intValue();
            C23566n.m57766a().mo48750a(this.mHandler, new C38339b(intValue, objArr[2]), intValue);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.Int");
    }

    /* renamed from: b */
    private final void m85631b(int i) {
        boolean z;
        Object obj;
        boolean z2;
        if (i == 36) {
            List a = mo78282a(i);
            Collection collection = a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List arrayList = new ArrayList();
                Iterator it = C52753d.m112318a(a.size() - 1, 0).iterator();
                while (it.hasNext()) {
                    int a2 = ((C52549aa) it).mo110114a();
                    if (((MusNotice) a.get(a2)).needForceInsert()) {
                        arrayList.add(a.get(a2));
                        a.remove(a2);
                    }
                }
                if (arrayList.size() > 1) {
                    C52575l.m112105a(arrayList, new C38341d());
                }
                Iterator it2 = C52753d.m112320b(0, arrayList.size()).iterator();
                while (it2.hasNext()) {
                    MusNotice musNotice = (MusNotice) arrayList.get(((C52549aa) it2).mo110114a());
                    int min = Math.min(musNotice.getLowestPosition() - 1, a.size());
                    Iterator it3 = C52753d.m112320b(0, min).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        int intValue = ((Number) obj).intValue();
                        if (((MusNotice) a.get(intValue)).getLowestPosition() != 0 || ((MusNotice) a.get(intValue)).getCreateTime() >= musNotice.getCreateTime()) {
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
                    Integer num = (Integer) obj;
                    if (num != null) {
                        min = num.intValue();
                    }
                    a.add(min, musNotice);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message != null) {
            if (message.obj instanceof Exception) {
                Object obj = message.obj;
                if (obj != null) {
                    C17840a.m43754b((Exception) obj);
                    if (this.mNotifyListeners != null) {
                        for (C26874f fVar : this.mNotifyListeners) {
                            Object obj2 = message.obj;
                            if (obj2 != null) {
                                fVar.mo44840c_((Exception) obj2);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                            }
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            } else if (!(message.obj instanceof MessageResponse)) {
                if (this.mNotifyListeners != null) {
                    for (C26874f fVar2 : this.mNotifyListeners) {
                        Object obj3 = message.obj;
                        if (!(obj3 instanceof Exception)) {
                            obj3 = null;
                        }
                        fVar2.mo44840c_((Exception) obj3);
                    }
                }
            } else {
                if (message.what == this.f97569a) {
                    Object obj4 = message.obj;
                    if (obj4 != null) {
                        m85628a((MessageResponse) obj4, message.what, true);
                        if (this.mNotifyListeners != null) {
                            for (C26874f b : this.mNotifyListeners) {
                                b.mo44838b();
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                    }
                } else {
                    Object obj5 = message.obj;
                    if (obj5 != null) {
                        m85628a((MessageResponse) obj5, message.what, false);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m85630a(List<MusNotice> list, LiveMessageResult liveMessageResult) {
        if (!C9376b.m18558a((Collection<T>) liveMessageResult.getLives())) {
            List arrayList = new ArrayList();
            List<LiveNotice> lives = liveMessageResult.getLives();
            if (lives != null) {
                for (LiveNotice liveNotice : lives) {
                    MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, false, NormalGiftView.ALPHA_255, null);
                    musNotice.setType(1001);
                    musNotice.setLiveNotice(liveNotice);
                    musNotice.setCreateTime(9223372036854775805L);
                    arrayList.add(musNotice);
                }
            }
            list.addAll(0, arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r6.getRequestCount() == 0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0077, code lost:
        if (r6 == 0) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0145 A[LOOP:1: B:81:0x013f->B:83:0x0145, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0151  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m85628a(com.p683ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse r19, int r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = 1
            if (r19 != 0) goto L_0x000a
            r0.mIsNewDataEmpty = r3
            return
        L_0x000a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r4 = r19.getItem()
            r5 = 0
            if (r4 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r6 = r4.getNotices()
            r7 = 0
            if (r6 == 0) goto L_0x001d
            java.util.List r6 = r6.getItems()
            goto L_0x001e
        L_0x001d:
            r6 = r7
        L_0x001e:
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x002b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r6 = 0
            goto L_0x002c
        L_0x002b:
            r6 = 1
        L_0x002c:
            if (r6 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r6 = r4.getLiveNotice()
            if (r6 == 0) goto L_0x0038
            java.util.List r7 = r6.getLives()
        L_0x0038:
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x0045
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r6 = 0
            goto L_0x0046
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r6 = r4.getFollowRequestNotice()
            if (r6 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r6 = r4.getFollowRequestNotice()
            if (r6 != 0) goto L_0x0057
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0057:
            int r6 = r6.getRequestCount()
            if (r6 != 0) goto L_0x007a
        L_0x005d:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r6 = r4.getFollowRequestNotice()
            if (r6 == 0) goto L_0x0068
            int r6 = r6.getRequestCount()
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            if (r6 != 0) goto L_0x007a
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r6 = r4.getCheckProfileNotice()
            if (r6 == 0) goto L_0x0076
            int r6 = r6.getCountOfUser()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r6 = 0
            goto L_0x007d
        L_0x007c:
            r6 = 1
        L_0x007d:
            r0.mIsNewDataEmpty = r6
            int r6 = r0.mListQueryType
            if (r6 != r3) goto L_0x0151
            boolean r6 = r0.mIsNewDataEmpty
            if (r6 == 0) goto L_0x0088
            return
        L_0x0088:
            java.util.List r6 = r0.mo78282a(r1)
            if (r4 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r7 = r4.getNotices()
            if (r7 == 0) goto L_0x0099
            long r7 = r7.getLastReadTime()
            goto L_0x009b
        L_0x0099:
            r7 = 0
        L_0x009b:
            r0.f97575g = r7
            r6.clear()
            if (r4 == 0) goto L_0x00ed
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r7 = r4.getNotices()
            if (r7 == 0) goto L_0x00ed
            java.util.List r8 = r18.getItems()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00b2:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c4
            java.lang.Object r9 = r8.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
            long r10 = r0.f97575g
            r9.setLastReadTime(r10)
            goto L_0x00b2
        L_0x00c4:
            if (r21 == 0) goto L_0x00de
            boolean r2 = r7.getHasMore()
            r0.f97574f = r2
            long r8 = r7.getMaxTime()
            r0.f97570b = r8
            long r8 = r7.getMinTime()
            r0.f97571c = r8
            int r2 = r7.getTotal()
            r0.f97572d = r2
        L_0x00de:
            java.util.List r2 = r7.getItems()
            if (r2 == 0) goto L_0x00ed
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r6.addAll(r2)
            java.lang.Boolean.valueOf(r2)
        L_0x00ed:
            if (r4 == 0) goto L_0x00f8
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r2 = r4.getLiveNotice()
            if (r2 == 0) goto L_0x00f8
            m85630a(r6, r2)
        L_0x00f8:
            if (r4 == 0) goto L_0x0139
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r2 = r4.getCheckProfileNotice()
            if (r2 == 0) goto L_0x0139
            int r4 = r2.getCountOfUser()
            if (r4 <= 0) goto L_0x0139
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r4 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 255(0xff, float:3.57E-43)
            r17 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r7 = com.p683ss.android.ugc.aweme.notice.repo.list.bean.C38088c.m85161a(r2)
            r4.setNid(r7)
            r7 = 1002(0x3ea, float:1.404E-42)
            r4.setType(r7)
            r4.setCheckProfileNotice(r2)
            long r7 = r2.getCreateTime()
            r4.setCreateTime(r7)
            int r2 = r6.size()
            int r2 = r2 + r3
            r4.setLowestPosition(r2)
            r6.add(r5, r4)
        L_0x0139:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x013f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02b1
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            long r4 = r0.f97575g
            r3.setLastReadTime(r4)
            goto L_0x013f
        L_0x0151:
            int r6 = r0.mListQueryType
            r7 = 4
            if (r6 != r7) goto L_0x02b1
            boolean r6 = r0.mIsNewDataEmpty
            if (r6 == 0) goto L_0x015f
            if (r21 == 0) goto L_0x015e
            r0.f97574f = r5
        L_0x015e:
            return
        L_0x015f:
            if (r4 == 0) goto L_0x02b1
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r4 = r4.getNotices()
            if (r4 == 0) goto L_0x02b1
            if (r21 == 0) goto L_0x0181
            boolean r2 = r4.getHasMore()
            r0.f97574f = r2
            long r6 = r4.getMaxTime()
            r0.f97570b = r6
            long r6 = r4.getMinTime()
            r0.f97571c = r6
            int r2 = r4.getTotal()
            r0.f97572d = r2
        L_0x0181:
            java.util.List r2 = r18.getItems()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x018b:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x019d
            java.lang.Object r6 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r6
            long r7 = r0.f97575g
            r6.setLastReadTime(r7)
            goto L_0x018b
        L_0x019d:
            java.util.List r2 = r4.getItems()
            if (r2 == 0) goto L_0x02b1
            java.util.List r4 = r0.mo78282a(r1)
            r6 = 36
            if (r1 != r6) goto L_0x0245
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r2 = r2.iterator()
        L_0x01b8:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01fc
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            r9 = r4
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x01d5
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x01f5
        L_0x01d5:
            java.util.Iterator r9 = r9.iterator()
        L_0x01d9:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01f5
            java.lang.Object r10 = r9.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r10 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r10
            java.lang.String r10 = r10.getNid()
            java.lang.String r11 = r8.getNid()
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r11)
            if (r10 == 0) goto L_0x01d9
            r8 = 0
            goto L_0x01f6
        L_0x01f5:
            r8 = 1
        L_0x01f6:
            if (r8 == 0) goto L_0x01b8
            r6.add(r7)
            goto L_0x01b8
        L_0x01fc:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x0204:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x02b1
            java.lang.Object r6 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r6 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r6
            int r7 = r6.getType()
            if (r7 == r3) goto L_0x0222
            int r7 = r6.getType()
            r8 = 2
            if (r7 != r8) goto L_0x021e
            goto L_0x0222
        L_0x021e:
            r4.add(r6)
            goto L_0x0204
        L_0x0222:
            java.util.Iterator r7 = r4.iterator()
        L_0x0226:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x023e
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            int r9 = r6.getType()
            int r8 = r8.getType()
            if (r9 != r8) goto L_0x0226
            r7 = 0
            goto L_0x023f
        L_0x023e:
            r7 = 1
        L_0x023f:
            if (r7 == 0) goto L_0x0204
            r4.add(r6)
            goto L_0x0204
        L_0x0245:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r2 = r2.iterator()
        L_0x0252:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0296
            java.lang.Object r7 = r2.next()
            r8 = r7
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
            r9 = r4
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x026f
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x028f
        L_0x026f:
            java.util.Iterator r9 = r9.iterator()
        L_0x0273:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x028f
            java.lang.Object r10 = r9.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r10 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r10
            java.lang.String r10 = r10.getNid()
            java.lang.String r11 = r8.getNid()
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r10, r11)
            if (r10 == 0) goto L_0x0273
            r8 = 0
            goto L_0x0290
        L_0x028f:
            r8 = 1
        L_0x0290:
            if (r8 == 0) goto L_0x0252
            r6.add(r7)
            goto L_0x0252
        L_0x0296:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L_0x029e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02b1
            java.lang.Object r3 = r2.next()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            r5.add(r3)
            goto L_0x029e
        L_0x02b1:
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r2 = r19.getItem()
            if (r2 == 0) goto L_0x02dc
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r2 = r2.getNotices()
            if (r2 == 0) goto L_0x02dc
            java.util.List r2 = r2.getItems()
            if (r2 == 0) goto L_0x02dc
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x02c9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02dc
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r19.getMLogPbBean()
            r3.logPbBean = r4
            goto L_0x02c9
        L_0x02dc:
            java.util.List r2 = r0.mo78282a(r1)
            m85629a(r2)
            r0.m85631b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notification.newstyle.p2027d.C38337f.m85628a(com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse, int, boolean):void");
    }
}
