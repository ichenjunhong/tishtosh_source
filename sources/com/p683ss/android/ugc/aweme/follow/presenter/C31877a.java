package com.p683ss.android.ugc.aweme.follow.presenter;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27369c;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27379l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.follow.api.C31859a;
import com.p683ss.android.ugc.aweme.follow.api.C31861b.C31862a;
import com.p683ss.android.ugc.aweme.follow.api.IFollowFeedApiV1;
import com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p683ss.android.ugc.aweme.follow.experiment.SmartFeedExperiment;
import com.p683ss.android.ugc.aweme.follow.p1765d.C31873c;
import com.p683ss.android.ugc.aweme.live.p1916a.C36007a;
import com.p683ss.android.ugc.aweme.main.experiment.C36646b;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.a */
public final class C31877a extends C27369c<FollowFeed, FollowFeedList> implements C27379l, Cloneable {

    /* renamed from: m */
    private static HashMap<Long, Aweme> f83267m = new HashMap<>();

    /* renamed from: b */
    public String f83268b = "homepage_follow";

    /* renamed from: c */
    public String f83269c = "extra_follow_type_follow";

    /* renamed from: d */
    public boolean f83270d;

    /* renamed from: e */
    public long f83271e;

    /* renamed from: f */
    public int f83272f;

    /* renamed from: g */
    public int f83273g = -1;

    /* renamed from: h */
    public String f83274h = "";

    /* renamed from: i */
    public List<FollowFeed> f83275i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public boolean f83276j;

    /* renamed from: k */
    public int f83277k = -1;

    /* renamed from: l */
    public int f83278l = -1;

    /* renamed from: a */
    private boolean m74305a(FollowFeed followFeed) {
        if (followFeed == null) {
            return false;
        }
        if ((followFeed.getFeedType() != 65280 && followFeed.getFeedType() != 65298) || this.mData == null || ((FollowFeedList) this.mData).getItems().size() == 0) {
            return false;
        }
        for (FollowFeed followFeed2 : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280 && followFeed2.getFeedType() == 65280) {
                Aweme aweme = followFeed.getAweme();
                Aweme aweme2 = followFeed2.getAweme();
                if (!(aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid()))) {
                    return true;
                }
            } else if (followFeed.getFeedType() == 65298 && followFeed2.getFeedType() == 65298) {
                RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                RoomFeedCellStruct roomStruct2 = followFeed2.getRoomStruct();
                if (!(roomStruct == null || roomStruct2 == null || roomStruct.getNewLiveRoomData().f79734id != roomStruct2.getNewLiveRoomData().f79734id)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<Aweme> mo55861a() {
        return m74301a(getItems());
    }

    public final List<FollowFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C31877a clone() {
        try {
            C31877a aVar = (C31877a) super.clone();
            aVar.mData = ((FollowFeedList) this.mData).clone();
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FollowFeedList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final List<Aweme> mo65078b() {
        if (this.mData == null) {
            return null;
        }
        this.f83273g = -1;
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme());
            } else if (followFeed.getFeedType() == 65297) {
                this.f83273g = arrayList.size();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo65077a(Message message) throws Exception {
        handleData((FollowFeedList) message.obj);
        return null;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C31881d m74299a(Object... objArr) {
        if (objArr.length < 2 || !(objArr[1] instanceof C31881d)) {
            return null;
        }
        return objArr[1];
    }

    public final void setItems(List<FollowFeed> list) {
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C26874f c_ : this.mNotifyListeners) {
                    c_.mo44840c_((Exception) message.obj);
                }
            }
            m74303a(this.f83277k, "", ((Exception) message.obj).getMessage(), 0);
            return;
        }
        C0013i.m18a((Callable<TResult>) new C31879b<TResult>(this, Message.obtain(message)), (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C31880c<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        int i;
        long j2;
        C31881d a = m74299a(objArr);
        if (a != null) {
            int i2 = this.f83272f;
            if (this.mData != null) {
                j = ((FollowFeedList) this.mData).getCursor();
            } else {
                j = 0;
            }
            if (this.mData != null) {
                i = ((FollowFeedList) this.mData).getLevel();
            } else {
                i = 1;
            }
            if (C9376b.m18558a((Collection<T>) getItems())) {
                j2 = 0;
            } else {
                j2 = ((FollowFeedList) this.mData).getMaxCursor();
            }
            m74302a(i2, j, i, j2, -1, a.f83301b, a.f83302c, a.f83303d, a.f83304e, null, null, null, ((FollowFeedList) this.mData).getIsRecommend(), a.f83305f.intValue(), 0);
        }
    }

    public final void refreshList(Object... objArr) {
        String str;
        C31881d a = m74299a(objArr);
        if (a != null) {
            String str2 = a.f83304e;
            if (TextUtils.isEmpty(str2)) {
                str = a.f83308i;
            } else {
                str = str2;
            }
            int i = this.f83272f + 1;
            int i2 = i;
            this.f83272f = i;
            String str3 = a.f83306g;
            int intValue = a.f83305f.intValue();
            int i3 = a.f83309j;
            m74302a(i2, 0, 1, 0, 0, a.f83301b, a.f83302c, a.f83303d, "", str3, str2, str, 0, intValue, i3);
            C36007a.f92285a.mo2503a();
        }
    }

    /* renamed from: a */
    public static List<Aweme> m74301a(List<FollowFeed> list) {
        boolean z;
        if (list == null) {
            return null;
        }
        if (!C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false) || !C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280) {
                Aweme aweme = followFeed.getAweme();
                if (aweme != null && (!aweme.isForwardAweme() || aweme.getForwardItem() != null)) {
                    arrayList.add(aweme);
                }
            } else if (followFeed.getFeedType() == 65298 && z) {
                Aweme a = m74298a(followFeed, followFeed.getRequestId());
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x028b, code lost:
        if (r8.getHeight() != 0) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b5, code lost:
        if (com.p683ss.android.ugc.aweme.flowfeed.utils.C31839b.m74197a(r8) == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02cb, code lost:
        if (com.p683ss.android.ugc.aweme.flowfeed.utils.C31839b.m74197a(r8) == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0265, code lost:
        if (r8.getVideo().getHeight() != 0) goto L_0x028e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList r13) {
        /*
            r12 = this;
            r0 = 0
            r12.f83276j = r0
            r1 = 65280(0xff00, float:9.1477E-41)
            r2 = 1
            if (r13 == 0) goto L_0x009d
            java.util.List r3 = r13.getItems()
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 != 0) goto L_0x009d
            int r3 = r13.getIsRecommend()
            if (r3 != r2) goto L_0x001b
            goto L_0x009d
        L_0x001b:
            java.lang.Object r3 = r12.mData
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.util.List r3 = r3.getItems()
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 == 0) goto L_0x002e
            goto L_0x009b
        L_0x002e:
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.util.List r3 = r3.getItems()
            int r3 = r3.size()
            java.util.List r4 = r13.getItems()
            int r4 = r4.size()
            if (r3 == r4) goto L_0x0047
            r12.f83276j = r2
            goto L_0x009d
        L_0x0047:
            r3 = 0
        L_0x0048:
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            java.util.List r4 = r4.getItems()
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x009d
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            java.util.List r4 = r4.getItems()
            java.lang.Object r4 = r4.get(r3)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r4
            java.util.List r5 = r13.getItems()
            java.lang.Object r5 = r5.get(r3)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r5 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r4.getAweme()
            if (r6 == 0) goto L_0x0098
            int r6 = r4.getFeedType()
            if (r6 != r1) goto L_0x0098
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r5.getAweme()
            if (r6 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAweme()
            java.lang.String r4 = r4.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.getAweme()
            java.lang.String r5 = r5.getAid()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0098
            r12.f83276j = r2
        L_0x0098:
            int r3 = r3 + 1
            goto L_0x0048
        L_0x009b:
            r12.f83276j = r2
        L_0x009d:
            if (r13 == 0) goto L_0x00b4
            boolean r3 = r13.needDeleteCache()
            if (r3 == 0) goto L_0x00b4
            java.lang.String r3 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.f83234a
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103315c(r3)
            java.lang.String r3 = "followfeed_snapshot_delete"
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r4)
        L_0x00b4:
            if (r13 == 0) goto L_0x00c3
            java.util.List r3 = r13.getItems()
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r3 = 0
            goto L_0x00c4
        L_0x00c3:
            r3 = 1
        L_0x00c4:
            r12.mIsNewDataEmpty = r3
            boolean r3 = r12.mIsNewDataEmpty
            r4 = 2
            if (r3 != 0) goto L_0x04fd
            boolean r3 = r12.f83270d
            if (r3 == 0) goto L_0x00e4
            int r3 = r12.mListQueryType
            if (r3 != r4) goto L_0x00e4
            boolean r3 = r12.isDataEmpty()
            if (r3 != 0) goto L_0x00e4
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.util.List r3 = r3.getItems()
            r3.clear()
        L_0x00e4:
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r3 = r12.f83275i
            r3.clear()
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB> r6 = com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB.class
            r7 = 1
            java.lang.String r8 = "follow_detail_full_screen"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            boolean r3 = r5.mo18172a(r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x010a
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment> r6 = com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment.class
            r7 = 1
            java.lang.String r8 = "enable_live_in_follow_feed_full_screen"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            r5.mo18172a(r6, r7, r8, r9, r10)
        L_0x010a:
            r3 = 0
        L_0x010b:
            java.util.List r5 = r13.getItems()
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x015d
            java.util.List r5 = r13.getItems()
            java.lang.Object r5 = r5.get(r3)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r5 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r5
            java.lang.String r6 = r13.getRequestId()
            r5.setRequestId(r6)
            int r6 = r5.getFeedType()
            if (r6 != r1) goto L_0x0132
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r6 = r12.f83275i
            r6.add(r5)
            goto L_0x015a
        L_0x0132:
            int r6 = r5.getFeedType()
            r7 = 65298(0xff12, float:9.1502E-41)
            if (r6 != r7) goto L_0x015a
            java.lang.String r6 = r13.requestId
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = m74298a(r5, r6)
            if (r5 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r6 = new com.ss.android.ugc.aweme.follow.presenter.FollowFeed
            r6.<init>()
            r6.setFeedType(r1)
            r6.setAweme(r5)
            java.util.List r5 = r13.getItems()
            r5.set(r3, r6)
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r5 = r12.f83275i
            r5.add(r6)
        L_0x015a:
            int r3 = r3 + 1
            goto L_0x010b
        L_0x015d:
            java.util.List r3 = r13.getItems()
            int r3 = r3.size()
            r5 = 0
        L_0x0166:
            r6 = 13
            if (r5 >= r3) goto L_0x0209
            java.util.List r7 = r13.getItems()
            java.lang.Object r7 = r7.get(r5)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r7 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r7
            if (r7 == 0) goto L_0x0205
            int r8 = r7.getFeedType()
            if (r8 != r1) goto L_0x0205
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.getAweme()
            boolean r9 = com.p683ss.android.ugc.aweme.follow.p1765d.C31871a.m74288a(r8)
            if (r9 == 0) goto L_0x0205
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r9 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r9 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r9
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r9.updateAweme(r8)
            java.lang.String r9 = r13.getRequestId()
            r8.setRequestId(r9)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r9 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r9 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r8.getAid()
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = r13.getRequestId()
            r9.setRequestIdAndIndex(r10, r11, r5)
            r7.setAweme(r8)
            java.util.List r9 = r13.getItems()
            r9.set(r5, r7)
            int r7 = r8.getAwemeType()
            if (r7 != r6) goto L_0x0205
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r8.getForwardItem()
            if (r6 == 0) goto L_0x0205
            java.lang.String r7 = r8.getAid()
            r6.setRepostFromGroupId(r7)
            java.lang.String r7 = r8.getAuthorUid()
            r6.setRepostFromUserId(r7)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r7 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r7 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.updateAweme(r6)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r7 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r7 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = r6.getAid()
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = r8.toString()
            java.lang.String r8 = r13.getRequestId()
            r7.setRequestIdAndIndex(r6, r8, r5)
        L_0x0205:
            int r5 = r5 + 1
            goto L_0x0166
        L_0x0209:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r5 = r13.getItems()
            java.util.Iterator r5 = r5.iterator()
        L_0x0216:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x031f
            java.lang.Object r7 = r5.next()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r7 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r7
            if (r7 != 0) goto L_0x0228
            r5.remove()
            goto L_0x0216
        L_0x0228:
            int r8 = r7.getFeedType()
            if (r8 != r1) goto L_0x028e
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.getAweme()
            boolean r8 = r8.isForwardAweme()
            if (r8 == 0) goto L_0x0241
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.getAweme()
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r8.getForwardItem()
            goto L_0x0245
        L_0x0241:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.getAweme()
        L_0x0245:
            if (r8 == 0) goto L_0x028e
            boolean r9 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31839b.m74197a(r8)
            if (r9 == 0) goto L_0x0269
            com.ss.android.ugc.aweme.feed.model.Video r9 = r8.getVideo()
            if (r9 == 0) goto L_0x0267
            com.ss.android.ugc.aweme.feed.model.Video r9 = r8.getVideo()
            int r9 = r9.getWidth()
            if (r9 == 0) goto L_0x0267
            com.ss.android.ugc.aweme.feed.model.Video r8 = r8.getVideo()
            int r8 = r8.getHeight()
            if (r8 != 0) goto L_0x028e
        L_0x0267:
            r8 = 1
            goto L_0x028f
        L_0x0269:
            int r9 = r8.getAwemeType()
            if (r9 != r4) goto L_0x028e
            java.util.List r8 = r8.getImageInfos()
            boolean r9 = com.bytedance.common.utility.p522b.C9376b.m18558a(r8)
            if (r9 != 0) goto L_0x028e
            java.lang.Object r8 = r8.get(r0)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r8 = (com.p683ss.android.ugc.aweme.feed.model.ImageInfo) r8
            if (r8 == 0) goto L_0x0267
            int r9 = r8.getWidth()
            if (r9 == 0) goto L_0x0267
            int r8 = r8.getHeight()
            if (r8 != 0) goto L_0x028e
            goto L_0x0267
        L_0x028e:
            r8 = 0
        L_0x028f:
            if (r8 == 0) goto L_0x0295
            r5.remove()
            goto L_0x0216
        L_0x0295:
            int r8 = r7.getFeedType()
            if (r8 != r1) goto L_0x02ce
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.getAweme()
            int r9 = r8.getAwemeType()
            if (r9 != r6) goto L_0x02b9
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r8.getForwardItem()
            if (r8 == 0) goto L_0x02ce
            int r9 = r8.getAwemeType()
            if (r9 == r4) goto L_0x02ce
            boolean r8 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31839b.m74197a(r8)
            if (r8 != 0) goto L_0x02ce
        L_0x02b7:
            r8 = 1
            goto L_0x02cf
        L_0x02b9:
            int r9 = r8.getAwemeType()
            if (r9 == r4) goto L_0x02ce
            int r9 = r8.getAwemeType()
            r10 = 101(0x65, float:1.42E-43)
            if (r9 == r10) goto L_0x02ce
            boolean r8 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31839b.m74197a(r8)
            if (r8 != 0) goto L_0x02ce
            goto L_0x02b7
        L_0x02ce:
            r8 = 0
        L_0x02cf:
            if (r8 == 0) goto L_0x02d6
            r5.remove()
            goto L_0x0216
        L_0x02d6:
            int r8 = r12.mListQueryType
            if (r8 == r2) goto L_0x0216
            boolean r8 = r12.isDataEmpty()
            if (r8 != 0) goto L_0x0216
            boolean r8 = r12.m74305a(r7)
            if (r8 == 0) goto L_0x0216
            r5.remove()
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r7.getAweme()
            if (r8 == 0) goto L_0x02fc
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.getAweme()
            java.lang.String r7 = r7.getAid()
            r3.add(r7)
            goto L_0x0216
        L_0x02fc:
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r8 = r7.getRoomStruct()
            if (r8 == 0) goto L_0x0216
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r8 = r7.getRoomStruct()
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r8 = r8.getNewLiveRoomData()
            if (r8 == 0) goto L_0x0216
            com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct r7 = r7.getRoomStruct()
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r7 = r7.getNewLiveRoomData()
            long r7 = r7.f79734id
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r3.add(r7)
            goto L_0x0216
        L_0x031f:
            java.lang.String r4 = r13.requestId
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r5 != 0) goto L_0x036c
            java.lang.String r5 = "service_monitor"
            java.lang.String r6 = "aweme_delete_duplicated_items"
            com.ss.android.ugc.aweme.app.f.c r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r8 = "request_id"
            com.ss.android.ugc.aweme.app.f.c r4 = r7.mo47824a(r8, r4)
            java.lang.String r7 = "user_id"
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r8 = r8.getCurUserId()
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r7, r8)
            java.lang.String r7 = "list_count"
            int r8 = r3.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47822a(r7, r8)
            java.lang.String r7 = "item_ids_str"
            java.lang.String r8 = ","
            java.lang.String r3 = m74300a(r3, r8)
            com.ss.android.ugc.aweme.app.f.c r3 = r4.mo47824a(r7, r3)
            java.lang.String r4 = "page_type"
            java.lang.String r7 = "homepage_follow"
            com.ss.android.ugc.aweme.app.f.c r3 = r3.mo47824a(r4, r7)
            org.json.JSONObject r3 = r3.mo47825b()
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r5, r6, r3)
        L_0x036c:
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r4 = r13.getRequestId()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r13.getLogPb()
            r3.mo60162a(r4, r5)
            int r3 = r12.mListQueryType
            r4 = 4
            if (r3 == r4) goto L_0x03df
            switch(r3) {
                case 1: goto L_0x03a8;
                case 2: goto L_0x0385;
                default: goto L_0x0383;
            }
        L_0x0383:
            goto L_0x044e
        L_0x0385:
            java.util.List r3 = r13.getItems()
            java.util.List r4 = r12.getItems()
            r3.addAll(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.util.List r4 = r13.getItems()
            r3.setItems(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            com.ss.android.ugc.aweme.follow.a r4 = r13.getLastViewData()
            r3.setLastViewData(r4)
            goto L_0x044e
        L_0x03a8:
            if (r13 == 0) goto L_0x03dc
            java.util.List r3 = r13.getItems()
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 != 0) goto L_0x03dc
            com.ss.android.ugc.aweme.follow.a r3 = r13.getLastViewData()
            java.util.List r4 = r13.getItems()
            int r4 = r4.size()
            boolean r3 = com.p683ss.android.ugc.aweme.follow.C31863b.m74262a(r3, r4)
            if (r3 != 0) goto L_0x03c7
            goto L_0x03dc
        L_0x03c7:
            java.util.List r3 = r13.getItems()
            com.ss.android.ugc.aweme.follow.a r4 = r13.getLastViewData()
            int r4 = r4.f83232a
            com.ss.android.ugc.aweme.follow.a r5 = r13.getLastViewData()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r5 = com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed.createLastWatchHistoryItem(r5)
            r3.add(r4, r5)
        L_0x03dc:
            r12.mData = r13
            goto L_0x044e
        L_0x03df:
            com.ss.android.ugc.aweme.follow.a r3 = r13.getLastViewData()
            java.util.List r4 = r13.getItems()
            int r4 = r4.size()
            boolean r3 = com.p683ss.android.ugc.aweme.follow.C31863b.m74262a(r3, r4)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            com.ss.android.ugc.aweme.follow.a r3 = r3.getLastViewData()
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            java.util.List r4 = r4.getItems()
            int r4 = r4.size()
            boolean r3 = com.p683ss.android.ugc.aweme.follow.C31863b.m74262a(r3, r4)
            if (r3 != 0) goto L_0x0420
            java.util.List r3 = r13.getItems()
            com.ss.android.ugc.aweme.follow.a r4 = r13.getLastViewData()
            int r4 = r4.f83232a
            com.ss.android.ugc.aweme.follow.a r5 = r13.getLastViewData()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r5 = com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed.createLastWatchHistoryItem(r5)
            r3.add(r4, r5)
        L_0x0420:
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            com.ss.android.ugc.aweme.follow.a r4 = r13.getLastViewData()
            r3.setLastViewData(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.util.List r3 = r3.getItems()
            java.util.List r4 = r13.getItems()
            r3.addAll(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            int r4 = r4.getHasMore()
            int r5 = r13.getHasMore()
            r4 = r4 & r5
            r3.setHasMore(r4)
        L_0x044e:
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            long r4 = r13.getCursor()
            r3.setCursor(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            int r4 = r13.getLevel()
            r3.setLevel(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            long r3 = r3.getMaxCursor()
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0489
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            long r7 = r4.getMaxCursor()
            long r9 = r13.getMaxCursor()
            long r7 = java.lang.Math.min(r7, r9)
            r3.setMaxCursor(r7)
        L_0x0489:
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            long r3 = r3.getMinCursor()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x04ac
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            long r4 = r4.getMinCursor()
            long r6 = r13.getMinCursor()
            long r4 = java.lang.Math.max(r4, r6)
            r3.setMinCursor(r4)
        L_0x04ac:
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            int r4 = r13.getIsRecommend()
            r3.setIsRecommend(r4)
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            int r4 = r13.getUpPhoneNotice()
            r3.setUpPhoneNotice(r4)
            r3 = 0
        L_0x04c3:
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            java.util.List r4 = r4.getItems()
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0575
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            java.util.List r4 = r4.getItems()
            java.lang.Object r4 = r4.get(r3)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r4
            int r4 = r4.getFeedType()
            if (r4 != r1) goto L_0x04fa
            java.lang.Object r4 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r4
            java.util.List r4 = r4.getItems()
            java.lang.Object r4 = r4.get(r3)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r4 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.getAweme()
            r4.setAwemePosition(r3)
        L_0x04fa:
            int r3 = r3 + 1
            goto L_0x04c3
        L_0x04fd:
            int r1 = r12.mListQueryType
            if (r1 != r2) goto L_0x055c
            r1 = 0
            if (r13 == 0) goto L_0x055a
            boolean r3 = r13.needUseCache()
            if (r3 == 0) goto L_0x055a
            java.lang.Object r3 = r12.mData
            if (r3 == 0) goto L_0x051c
            java.lang.Object r3 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r3
            java.util.List r3 = r3.getItems()
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 == 0) goto L_0x055c
        L_0x051c:
            com.ss.android.ugc.aweme.follow.a.a r3 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.f83236c
            boolean r3 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.m74260a()
            if (r3 != 0) goto L_0x0525
            goto L_0x0534
        L_0x0525:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.f83235b
            java.lang.String r1 = com.p683ss.android.ugc.aweme.video.C48016e.m103955f(r1)
            java.lang.String r3 = "FileHelper.readFile(cacheFilePath)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.m74258a(r1)
        L_0x0534:
            if (r1 == 0) goto L_0x055c
            r12.mData = r1
            java.util.List r3 = r1.getItems()
            if (r3 == 0) goto L_0x0547
            java.util.List r1 = r1.getItems()
            int r1 = r1.size()
            goto L_0x0548
        L_0x0547:
            r1 = 0
        L_0x0548:
            java.lang.String r3 = "followfeed_snapshot"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "item_cnt"
            com.ss.android.ugc.aweme.app.f.d r1 = r5.mo47826a(r6, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r1)
            goto L_0x055c
        L_0x055a:
            r12.mData = r1
        L_0x055c:
            java.lang.Object r1 = r12.mData
            if (r1 == 0) goto L_0x0575
            int r1 = r12.mListQueryType
            if (r1 == r4) goto L_0x0575
            java.lang.String r1 = r12.f83269c
            java.lang.String r3 = "extra_follow_type_friend"
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L_0x0575
            java.lang.Object r1 = r12.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            r1.setHasMore(r0)
        L_0x0575:
            java.lang.String r1 = r12.f83269c
            java.lang.String r3 = "extra_follow_type_follow"
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x05b0
            int r1 = r12.mListQueryType
            if (r1 != r2) goto L_0x05b0
            if (r13 == 0) goto L_0x05b0
            boolean r1 = r13.needCache()
            if (r1 == 0) goto L_0x05b0
            com.ss.android.ugc.aweme.follow.a.a r1 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.f83236c
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r1)
            if (r13 == 0) goto L_0x05a1
            java.util.List r1 = r13.getItems()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x05a1
            goto L_0x05a2
        L_0x05a1:
            r2 = 0
        L_0x05a2:
            if (r2 == 0) goto L_0x05b0
            com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.m74260a()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.f83235b
            java.lang.String r2 = com.p683ss.android.ugc.aweme.follow.p1762a.C31858a.m74259a(r13)
            com.p683ss.android.ugc.aweme.video.C48016e.m103939a(r1, r2)
        L_0x05b0:
            if (r13 != 0) goto L_0x05b5
            java.lang.String r1 = ""
            goto L_0x05b7
        L_0x05b5:
            java.lang.String r1 = r13.requestId
        L_0x05b7:
            if (r13 == 0) goto L_0x05d6
            java.util.List r2 = r13.getItems()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r2)
            if (r2 == 0) goto L_0x05c4
            goto L_0x05d6
        L_0x05c4:
            int r0 = r13.getFeedType()
            java.lang.String r2 = ""
            java.util.List r13 = r13.getItems()
            int r13 = r13.size()
            r12.m74303a(r0, r1, r2, r13)
            return
        L_0x05d6:
            int r13 = r12.f83277k
            java.lang.String r2 = "empty feed"
            r12.m74303a(r13, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.follow.presenter.C31877a.handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList):void");
    }

    /* renamed from: a */
    private static String m74300a(List<String> list, String str) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return "";
        }
        StringBuilder sb = null;
        for (String str2 : list) {
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Aweme m74298a(FollowFeed followFeed, String str) {
        if (followFeed == null || followFeed.getRoomStruct() == null) {
            return null;
        }
        LiveRoomStruct newLiveRoomData = followFeed.getRoomStruct().getNewLiveRoomData();
        if (!LiveRoomStruct.isValid(newLiveRoomData)) {
            return null;
        }
        RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
        roomStruct.room = newLiveRoomData;
        long j = roomStruct.room.f79734id;
        Aweme aweme = (Aweme) f83267m.get(Long.valueOf(j));
        if (aweme == null) {
            aweme = new Aweme();
            aweme.setAid(String.valueOf(j));
            aweme.setAwemeType(BaseNotice.HASHTAG);
            aweme.setAuthor(roomStruct.room.owner);
        }
        aweme.setRequestId(str);
        aweme.setRoomFeedCellStruct(roomStruct);
        f83267m.put(Long.valueOf(roomStruct.room.f79734id), aweme);
        return aweme;
    }

    /* renamed from: a */
    private void m74303a(int i, String str, String str2, int i2) {
        C23088c a = C23088c.m56631a();
        a.mo47822a("feed_r_type", Integer.valueOf(i)).mo47822a("feed_r_pull_type", Integer.valueOf(this.f83278l)).mo47822a("origin_count", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            a.mo47824a("request_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo47824a("error_desc", str2);
        }
        C23131p.m56692a("aweme_feed_fetch_abnormal_log", "", a.mo47825b());
    }

    /* renamed from: a */
    private void m74302a(int i, long j, int i2, long j2, long j3, int i3, int i4, String str, String str2, String str3, String str4, String str5, int i5, int i6, int i7) {
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo47782d()).booleanValue();
        final int a = C36646b.m82554a();
        final long j4 = j2;
        final long j5 = j3;
        final int i8 = i3;
        final int i9 = i4;
        final String str6 = str;
        final String str7 = str5;
        final int i10 = i5;
        C23566n a2 = C23566n.m57766a();
        final String str8 = str2;
        C318781 r24 = r1;
        C9381g gVar = this.mHandler;
        final int i11 = i;
        final long j6 = j;
        final int i12 = i2;
        final String str9 = str3;
        final String str10 = str4;
        final int i13 = i6;
        final int i14 = i7;
        final int i15 = booleanValue ? 1 : 0;
        C318781 r1 = new Callable(this) {

            /* renamed from: r */
            final /* synthetic */ C31877a f83296r;

            public final Object call() throws Exception {
                int i;
                FollowFeedList followFeedList;
                int i2;
                int i3;
                int i4;
                if (C20854a.m53167g().isUidContactPermisioned()) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (TextUtils.equals(this.f83296r.f83269c, "extra_follow_type_friend")) {
                    long j = j4;
                    long j2 = j5;
                    int i5 = i8;
                    int i6 = i9;
                    long j3 = this.f83296r.f83271e;
                    if (this.f83296r.mData != null) {
                        i4 = ((FollowFeedList) this.f83296r.mData).getFetchRecommend();
                    } else {
                        i4 = 1;
                    }
                    String str = str6;
                    String str2 = str7;
                    int i7 = i;
                    Object obj = C31859a.f83239a.getFriendList(j, j2, 20, i5, i6, j3, i4, str, i15, i10, str2, i7, C47945d.m103733b(), C31873c.m74291b(), Integer.valueOf(C31873c.m74290a(3)), Integer.valueOf(C31873c.m74289a()), Long.valueOf(C31873c.m74293d()), Long.valueOf(C31873c.m74292c())).get();
                    C52711k.m112236a(obj, "api.getFriendList(maxCur…lastLongLinkItemId).get()");
                    followFeedList = (FollowFeedList) obj;
                    this.f83296r.f83277k = 2;
                } else if (TextUtils.equals(this.f83296r.f83268b, "rec_follow")) {
                    Object obj2 = C31859a.f83239a.getRecommendList(20, i8, i9, this.f83296r.f83271e, str6, str8).get();
                    C52711k.m112236a(obj2, "api.getRecommendList(cou…onIds, lastFeedIds).get()");
                    followFeedList = (FollowFeedList) obj2;
                } else if (SmartFeedExperiment.m74297a()) {
                    int i8 = i11;
                    long j4 = j6;
                    int i9 = i12;
                    int i10 = i8;
                    int i11 = i9;
                    long j5 = this.f83296r.f83271e;
                    if (this.f83296r.mData != null) {
                        i3 = ((FollowFeedList) this.f83296r.mData).getFetchRecommend();
                    } else {
                        i3 = 1;
                    }
                    followFeedList = C31862a.m74261a(i8, j4, i9, 20, i10, i11, j5, i3, str6, str8, str9, str10, str7, i15, i10, i, C47945d.m103733b(), a, i13, Integer.valueOf(i14));
                    this.f83296r.f83277k = 1;
                } else {
                    long j6 = j4;
                    long j7 = j5;
                    int i12 = i8;
                    int i13 = i9;
                    long j8 = this.f83296r.f83271e;
                    if (this.f83296r.mData != null) {
                        i2 = ((FollowFeedList) this.f83296r.mData).getFetchRecommend();
                    } else {
                        i2 = 1;
                    }
                    String str3 = str6;
                    String str4 = str8;
                    String str5 = str9;
                    String str6 = str4;
                    String str7 = str10;
                    String str8 = str7;
                    int i14 = i15;
                    int i15 = i10;
                    int b = C47945d.m103733b();
                    int i16 = i15;
                    int i17 = a;
                    int i18 = i13;
                    IFollowFeedApiV1 iFollowFeedApiV1 = C31859a.f83239a;
                    C37940g a = C37940g.m84832a();
                    String str9 = str5;
                    C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
                    String b2 = a.mo77416b();
                    String a2 = C23794bh.m58376B().mo75770a();
                    if (a2 == null) {
                        C52711k.m112234a();
                    }
                    String str10 = str7;
                    String str11 = str8;
                    int i19 = i14;
                    int i20 = i16;
                    String str12 = str6;
                    String str13 = b2;
                    String str14 = str9;
                    int i21 = i;
                    Object obj3 = iFollowFeedApiV1.getFollowFeedList(j6, j7, 20, i12, i13, j8, i2, str3, str12, str13, i19, i20, str14, str10, str11, i21, b, a2, i17, Integer.valueOf(i18), C31873c.m74291b(), Integer.valueOf(C31873c.m74290a(2)), Integer.valueOf(C31873c.m74290a(1)), Integer.valueOf(C31873c.m74289a()), Long.valueOf(C31873c.m74293d()), Long.valueOf(C31873c.m74292c())).get();
                    C52711k.m112236a(obj3, "api.getFollowFeedList(ma…lastLongLinkItemId).get()");
                    followFeedList = (FollowFeedList) obj3;
                    this.f83296r.f83277k = 0;
                }
                this.f83296r.f83278l = i8;
                if (followFeedList != null) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo74803b(followFeedList.getItems());
                    this.f83296r.f83274h = followFeedList.getBlankPanelText();
                }
                return followFeedList;
            }

            {
                this.f83296r = r4;
            }
        };
        a2.mo48750a(gVar, r24, 0);
    }
}
