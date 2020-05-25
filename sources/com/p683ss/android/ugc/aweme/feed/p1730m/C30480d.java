package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26424bi;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C30436k;
import com.p683ss.android.ugc.aweme.feed.C30689t;
import com.p683ss.android.ugc.aweme.feed.cache.C30162a;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedRecommendLiveDisplayTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.main.story.C36731g;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.poi.model.C39098ad;
import com.p683ss.android.ugc.aweme.poi.model.C39108an;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.m.d */
public class C30480d extends C26875a<Aweme, FeedItemList> {

    /* renamed from: m */
    private static boolean f79644m;

    /* renamed from: a */
    public boolean f79645a;

    /* renamed from: b */
    public FeedItemList f79646b;

    /* renamed from: c */
    public int f79647c;

    /* renamed from: d */
    public long f79648d;

    /* renamed from: e */
    public C30689t f79649e = this;

    /* renamed from: f */
    public boolean f79650f;

    /* renamed from: g */
    private int f79651g;

    /* renamed from: h */
    private int f79652h;

    /* renamed from: i */
    private String f79653i;

    /* renamed from: j */
    private List<C39108an> f79654j;

    /* renamed from: k */
    private List<C39098ad> f79655k;

    /* renamed from: l */
    private boolean f79656l;

    /* renamed from: a */
    public boolean mo60905a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo60903a(int i, Lock lock) throws Exception {
        FeedItemList e = C30163b.m70778e();
        if (e == null || C9376b.m18558a((Collection<T>) e.getItems())) {
            return null;
        }
        C30436k.m71368a(e.getItems(), e.getRequestId(), i);
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = e;
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_feed_cache", true);
        obtainMessage.setData(bundle);
        if (lock != null) {
            try {
                lock.tryLock(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            }
        }
        this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void handleData(FeedItemList feedItemList) {
        boolean z;
        int i = 0;
        this.mIsNewDataEmpty = feedItemList == null || C9376b.m18558a((Collection<T>) feedItemList.getItems());
        if (m71431c(this.f79646b) || m71431c(feedItemList) || !feedItemList.isForceAppend()) {
            this.f79646b = feedItemList;
        } else {
            this.f79646b.setNetworkInfoKey(feedItemList.getNetworkInfoKey());
        }
        FeedItemList feedItemList2 = (FeedItemList) this.mData;
        int i2 = this.f79651g;
        int i3 = this.mListQueryType;
        if (i2 == 0) {
            if (feedItemList == null || !feedItemList.isForceAppend()) {
                z = false;
            } else {
                feedItemList.resetForceAppend();
                z = true;
            }
            if (!m71431c(feedItemList2) && !m71431c(feedItemList) && z) {
                i3 = 4;
            }
        }
        this.mListQueryType = i3;
        if (!this.mIsNewDataEmpty) {
            if (this.f79645a && this.mListQueryType == 2 && feedItemList.isRefreshClear() && !isDataEmpty()) {
                ((FeedItemList) this.mData).getItems().clear();
            }
            C23794bh.m58386a().getPluginUtilsAllService();
            String str = "";
            if (this.mListQueryType != 1) {
                Iterator it = feedItemList.getItems().iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Aweme aweme = (Aweme) it.next();
                    if (!TextUtils.equals(aweme.getAid(), str) && !isDataEmpty() && C31190f.m72829a(((FeedItemList) this.mData).getItems(), aweme) >= 0) {
                        Aweme aweme2 = (Aweme) ((FeedItemList) this.mData).getItems().get(C31190f.m72833b(((FeedItemList) this.mData).getItems(), aweme));
                        if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                            if (aweme.isAd()) {
                                C25945k.m62911b().mo53119a(C11010c.m22280a(), aweme, aweme2.isAd() ? 1 : 2);
                            }
                            if (m71428a(aweme)) {
                                if (C26503d.m64080w(aweme)) {
                                    C25945k.m62911b().mo53122a(C11010c.m22280a(), aweme, C25945k.m62918i().mo53857a("8", (String) null));
                                }
                                C26890h.m65011a("vv_failed", C23089d.m56640a().mo47826a("failed_reason", aweme2.isAd() ? 1 : 2).mo47829a("group_id", aweme2.getAid()).f61491a);
                            }
                        }
                        if (m71428a(aweme)) {
                            it.remove();
                            arrayList.add(aweme.getAid());
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    int i4 = this.f79651g;
                    if (i4 == 0) {
                        C26890h.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_hot").setValue(String.valueOf(arrayList.size())));
                        String requestId = feedItemList.getRequestId();
                        if (!C9376b.m18558a((Collection<T>) arrayList)) {
                            C23131p.m56692a("service_monitor", "aweme_delete_duplicated_items", C23088c.m56631a().mo47824a("request_id", requestId).mo47824a("user_id", C20854a.m53167g().getCurUserId()).mo47822a("list_count", Integer.valueOf(arrayList.size())).mo47824a("item_ids_str", m71423a((List<String>) arrayList, ",")).mo47824a("page_type", "homepage_hot").mo47825b());
                        }
                    } else if (i4 == 2) {
                        C26890h.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_fresh").setValue(String.valueOf(arrayList.size())));
                    }
                }
            }
            if (!(feedItemList.extra == null || feedItemList.extra.fatalItemIds == null || feedItemList.extra.fatalItemIds.isEmpty())) {
                for (String a : feedItemList.extra.fatalItemIds) {
                    m71426a(a);
                }
            }
            m71430b(feedItemList);
            int i5 = this.mListQueryType;
            if (i5 != 4) {
                switch (i5) {
                    case 1:
                        this.mData = feedItemList;
                        this.f79654j = new ArrayList();
                        if (!C9376b.m18558a((Collection<T>) feedItemList.poiRankCardStructs)) {
                            for (C39108an add : feedItemList.poiRankCardStructs) {
                                this.f79654j.add(add);
                            }
                        }
                        this.f79655k = feedItemList.poiOpCardStructs;
                        break;
                    case 2:
                        feedItemList.getItems().addAll(getItems());
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                        break;
                }
            } else if (this.mData == null) {
                StringBuilder sb = new StringBuilder("data error:");
                sb.append(Log.getStackTraceString(new Throwable()));
                C32458a.m75141a(6, "FeedFetchModel", sb.toString());
                this.mData = feedItemList;
            } else {
                ((FeedItemList) this.mData).getItems().addAll(feedItemList.getItems());
                ((FeedItemList) this.mData).hasMore &= feedItemList.hasMore;
            }
            ((FeedItemList) this.mData).cursor = feedItemList.cursor;
            if (((FeedItemList) this.mData).maxCursor != 0) {
                ((FeedItemList) this.mData).maxCursor = Math.min(((FeedItemList) this.mData).maxCursor, feedItemList.maxCursor);
            }
            if (((FeedItemList) this.mData).minCursor != 0) {
                ((FeedItemList) this.mData).minCursor = Math.max(((FeedItemList) this.mData).minCursor, feedItemList.minCursor);
            }
            for (int i6 = 0; i6 < ((FeedItemList) this.mData).getItems().size(); i6++) {
                ((Aweme) ((FeedItemList) this.mData).getItems().get(i6)).setAwemePosition(i6);
            }
            List items = feedItemList.getItems();
            try {
                i = C32816h.m75716b().getStatisticsBackupPct().intValue();
            } catch (C10174a e) {
                C32458a.m75148a((Throwable) e);
            }
            StringBuilder sb2 = new StringBuilder("FeedFetchModel start to check statisticsInfo, delay:");
            sb2.append(i);
            C32458a.m75141a(4, "FeedBackupHelper", sb2.toString());
            C0013i.m12a((long) i).mo20a((C0011g<TResult, TContinuationResult>) new C30485h<TResult,TContinuationResult>(items), (Executor) C0013i.f24a);
        } else {
            if (this.mListQueryType == 1) {
                this.mData = null;
            }
            if (!(this.mData == null || this.mListQueryType == 2)) {
                ((FeedItemList) this.mData).hasMore = 0;
            }
        }
        m71432d(feedItemList);
    }

    /* renamed from: a */
    private static boolean m71428a(Aweme aweme) {
        if (!aweme.isAd()) {
            return true;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    public C30480d() {
        this.f79650f = true;
    }

    /* renamed from: b */
    private static void m71429b() {
        C47718bf.m103288a(new C36731g());
    }

    public List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public C30480d(int i) {
        this(i, 0);
    }

    /* renamed from: c */
    private static boolean m71431c(FeedItemList feedItemList) {
        if (feedItemList == null || feedItemList.getItems() == null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean deleteItem(Object obj) {
        return C31190f.m72832a(getItems(), (Aweme) obj, this.mNotifyListeners);
    }

    public void setItems(List<Aweme> list) {
        if (this.mData != null) {
            ((FeedItemList) this.mData).items = list;
        }
    }

    /* renamed from: a */
    private static Integer m71421a(Object[] objArr) {
        if (objArr.length < 4 || !(objArr[3] instanceof Integer)) {
            return null;
        }
        return objArr[3];
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 3 && objArr.length != 4 && objArr.length != 5 && objArr.length != 6 && objArr.length != 7)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m71432d(FeedItemList feedItemList) {
        boolean z;
        if (feedItemList != null) {
            List items = feedItemList.getItems();
            if (items != null && !items.isEmpty()) {
                ListIterator listIterator = items.listIterator();
                try {
                    z = C32816h.m75716b().getDiscardRefreshTopDsp().booleanValue();
                } catch (C10174a unused) {
                    z = true;
                }
                C26424bi n = C25945k.m62923n();
                int i = 0;
                while (listIterator.hasNext()) {
                    Aweme aweme = (Aweme) listIterator.next();
                    if (aweme == null) {
                        listIterator.remove();
                    } else {
                        if (n.mo54138a(aweme) || n.mo54139b(aweme)) {
                            if (this.mListQueryType != 1 || i >= 3 || !C26469cc.m63997a(aweme, 3)) {
                                n.mo54137a(aweme, C0013i.f24a, null, false);
                            } else if (z) {
                                listIterator.remove();
                            } else {
                                n.mo54137a(aweme, null, null, true);
                                if (C26469cc.m63999a(aweme, false)) {
                                    listIterator.remove();
                                }
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        if (!this.f79656l || !m71427a(message)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (this.f79651g == 0 && (message.obj instanceof FeedItemList) && ((FeedItemList) message.obj).status_code == 13315) {
                resetLoadingStatus(message);
                if (this.mNotifyListeners != null) {
                    for (C26874f c_ : this.mNotifyListeners) {
                        c_.mo44840c_(new C23459a(13315));
                    }
                }
            } else {
                if (message != null && message.what == 0) {
                    this.f79656l = true;
                }
                if (!m71427a(message)) {
                    this.f79650f = true;
                }
                if (m71427a(message)) {
                    C22574a.m55738f().f60704e = true;
                }
                super.handleMsg(message);
            }
        }
    }

    public void loadLatestList(Object... objArr) {
        long j;
        Object[] objArr2 = objArr;
        this.f79651g = ((Integer) objArr2[1]).intValue();
        this.f79652h = ((Integer) objArr2[2]).intValue();
        if (objArr2.length < 5 || !(objArr2[4] instanceof String)) {
            this.f79653i = "";
        } else {
            this.f79653i = (String) objArr2[4];
        }
        int i = this.f79651g;
        if (C9376b.m18558a((Collection<T>) getItems())) {
            j = 0;
        } else {
            j = -1;
        }
        m71424a(i, j, ((FeedItemList) this.mData).minCursor, this.mCount, m71421a(objArr), null, this.f79652h, this.f79653i, null, null, null);
        m71429b();
    }

    /* renamed from: b */
    private static void m71430b(FeedItemList feedItemList) {
        if (feedItemList != null && !C9376b.m18558a((Collection<T>) feedItemList.getItems())) {
            Iterator it = feedItemList.getItems().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (aweme != null && aweme.isLive()) {
                    if (C10181b.m20511a().mo18168a(FeedRecommendLiveDisplayTypeExperiment.class, true, "full_recommend_live_display_type", 31744, 1) == 0) {
                        it.remove();
                    } else {
                        LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
                        if (newLiveRoomData == null || newLiveRoomData.owner == null || TextUtils.isEmpty(newLiveRoomData.owner.getUid()) || TextUtils.isEmpty(newLiveRoomData.owner.getSecUid())) {
                            it.remove();
                        } else {
                            User user = newLiveRoomData.owner;
                            User user2 = new User();
                            user2.setUid(user.getUid());
                            user2.setSecUid(user.getSecUid());
                            user2.setNickname(user.getNickname());
                            user2.setShortId(user.getShortId());
                            user2.setUniqueId(user.getUniqueId());
                            user2.setSignature(user.getSignature());
                            user2.setAvatarThumb(user.getAvatarThumb());
                            user2.setAvatarLarger(user.getAvatarLarger());
                            user2.setAvatarMedium(user.getAvatarMedium());
                            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                            roomFeedCellStruct.room = newLiveRoomData;
                            aweme.setRoomFeedCellStruct(roomFeedCellStruct);
                            aweme.setAuthor(user2);
                        }
                    }
                }
            }
        }
    }

    public void loadMoreList(Object... objArr) {
        long j;
        Object[] objArr2 = objArr;
        if (this.mData != null) {
            this.f79648d = ((FeedItemList) this.mData).cursor;
        }
        this.f79651g = ((Integer) objArr2[1]).intValue();
        this.f79652h = ((Integer) objArr2[2]).intValue();
        if (objArr2.length < 5 || !(objArr2[4] instanceof String)) {
            this.f79653i = "";
        } else {
            this.f79653i = (String) objArr2[4];
        }
        StringBuilder sb = new StringBuilder("loadMoreList call,type:");
        sb.append(this.f79651g);
        sb.append(",pullType:");
        sb.append(this.f79652h);
        sb.append(",countryCode:");
        sb.append(this.f79653i);
        C32458a.m75141a(4, "FeedFetchModel", sb.toString());
        int i = this.f79651g;
        if (C9376b.m18558a((Collection<T>) getItems())) {
            j = 0;
        } else {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        m71424a(i, j, -1, this.mCount, m71421a(objArr), null, this.f79652h, this.f79653i, null, null, null);
    }

    public void refreshList(Object... objArr) {
        String str;
        String str2;
        Lock lock;
        String str3;
        Object[] objArr2 = objArr;
        this.f79648d = 0;
        this.f79651g = ((Integer) objArr2[1]).intValue();
        this.f79652h = ((Integer) objArr2[2]).intValue();
        if (this.f79651g == 0) {
            this.f79650f = false;
        }
        if (objArr2.length < 5 || !(objArr2[4] instanceof String)) {
            this.f79653i = "";
        } else {
            this.f79653i = (String) objArr2[4];
        }
        Boolean valueOf = Boolean.valueOf(false);
        if (objArr2.length >= 4 && (objArr2[3] instanceof Boolean)) {
            valueOf = (Boolean) objArr2[3];
        }
        if (valueOf.booleanValue()) {
            C23566n.m57766a().mo48750a(this.mHandler, new C30482e(this), 0);
        } else {
            if (objArr2.length < 6 || !(objArr2[4] instanceof String)) {
                str = null;
            } else {
                str = (String) objArr2[4];
            }
            if (!TextUtils.isEmpty(str) || objArr2.length < 6 || !(objArr2[5] instanceof String)) {
                str2 = null;
            } else {
                str2 = (String) objArr2[5];
            }
            if (objArr2.length < 7 || !(objArr2[6] instanceof Lock)) {
                lock = null;
            } else {
                lock = (Lock) objArr2[6];
            }
            int i = this.f79651g;
            int i2 = this.mCount;
            Integer a = m71421a(objArr);
            if (objArr2.length < 4 || !(objArr2[3] instanceof String)) {
                str3 = null;
            } else {
                str3 = (String) objArr2[3];
            }
            m71424a(i, 0, 0, i2, a, str3, this.f79652h, this.f79653i, str, str2, lock);
        }
        if (this.f79651g != 11) {
            m71429b();
        }
    }

    /* renamed from: a */
    private void m71426a(String str) {
        if (this.mData != null && ((FeedItemList) this.mData).getItems() != null && !((FeedItemList) this.mData).getItems().isEmpty()) {
            Iterator it = ((FeedItemList) this.mData).getItems().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (!TextUtils.isEmpty(aweme.getAid()) && aweme.getAid().equals(str)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m71427a(Message message) {
        if (message == null || message.getData() == null || !message.getData().getBoolean("is_from_feed_cache")) {
            return false;
        }
        return true;
    }

    public C30480d(int i, int i2) {
        this.f79650f = true;
        this.mCount = i;
        this.f79647c = 0;
    }

    /* renamed from: a */
    private static String m71423a(List<String> list, String str) {
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

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9 A[Catch:{ Throwable -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca A[Catch:{ Throwable -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m71422a(java.util.List r13, p001a.C0013i r14) throws java.lang.Exception {
        /*
            java.lang.String r14 = "awemeList"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r14)
            java.lang.String r14 = "FeedBackupHelper"
            java.lang.String r0 = "FeedBackupHelper start to checkStatisticsInfo!"
            r1 = 4
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r1, r14, r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = ","
            r2 = -1
            r3 = 1
            r4 = r13
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ Throwable -> 0x00e2 }
            int r4 = r4.size()     // Catch:{ Throwable -> 0x00e2 }
            r5 = 0
            r6 = 0
            r7 = -1
        L_0x0020:
            if (r6 >= r4) goto L_0x00ee
            java.lang.Object r8 = r13.get(r6)     // Catch:{ Throwable -> 0x00e0 }
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r8     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Throwable -> 0x00e0 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x00e0 }
            if (r9 != 0) goto L_0x00dc
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            if (r9 == 0) goto L_0x00dc
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r10 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r9.getLoseCommentCount()     // Catch:{ Throwable -> 0x00e0 }
            r10 = 2
            r11 = 3
            if (r9 != 0) goto L_0x006b
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r12 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r12)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r9.getLoseCount()     // Catch:{ Throwable -> 0x00e0 }
            if (r9 != r3) goto L_0x006b
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00e0 }
            r14.append(r9)     // Catch:{ Throwable -> 0x00e0 }
            r14.append(r0)     // Catch:{ Throwable -> 0x00e0 }
            if (r7 != r2) goto L_0x0068
            r7 = 1
            goto L_0x00b4
        L_0x0068:
            if (r7 == r3) goto L_0x00b4
            goto L_0x00b3
        L_0x006b:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r12 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r12)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r9.getLoseCommentCount()     // Catch:{ Throwable -> 0x00e0 }
            if (r9 != r3) goto L_0x009a
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r12 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r12)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r9.getLoseCount()     // Catch:{ Throwable -> 0x00e0 }
            if (r9 != 0) goto L_0x009a
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00e0 }
            r14.append(r9)     // Catch:{ Throwable -> 0x00e0 }
            r14.append(r0)     // Catch:{ Throwable -> 0x00e0 }
            if (r7 != r2) goto L_0x0097
            r7 = 2
            goto L_0x00b4
        L_0x0097:
            if (r7 == r10) goto L_0x00b4
            goto L_0x00b3
        L_0x009a:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r10 = "aweme.statistics"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)     // Catch:{ Throwable -> 0x00e0 }
            int r9 = r9.getLoseCount()     // Catch:{ Throwable -> 0x00e0 }
            if (r9 != r3) goto L_0x00b4
            java.lang.String r9 = r8.getAid()     // Catch:{ Throwable -> 0x00e0 }
            r14.append(r9)     // Catch:{ Throwable -> 0x00e0 }
            r14.append(r0)     // Catch:{ Throwable -> 0x00e0 }
        L_0x00b3:
            r7 = 3
        L_0x00b4:
            java.lang.String r8 = r8.getAid()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r9 = "aweme.aid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)     // Catch:{ Throwable -> 0x00e0 }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r9 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()     // Catch:{ Throwable -> 0x00e0 }
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r9 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r9     // Catch:{ Throwable -> 0x00e0 }
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r9.getAwemeById(r8)     // Catch:{ Throwable -> 0x00e0 }
            if (r8 != 0) goto L_0x00ca
            goto L_0x00dc
        L_0x00ca:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r9 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            if (r9 == 0) goto L_0x00d3
            r9.setLoseCommentCount(r5)     // Catch:{ Throwable -> 0x00e0 }
        L_0x00d3:
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r8 = r8.getStatistics()     // Catch:{ Throwable -> 0x00e0 }
            if (r8 == 0) goto L_0x00dc
            r8.setLoseCount(r5)     // Catch:{ Throwable -> 0x00e0 }
        L_0x00dc:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x00e0:
            r13 = move-exception
            goto L_0x00e4
        L_0x00e2:
            r13 = move-exception
            r7 = -1
        L_0x00e4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r13)
            java.lang.Exception r0 = (java.lang.Exception) r0
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)
        L_0x00ee:
            if (r7 == r2) goto L_0x0120
            int r13 = r14.length()
            int r13 = r13 - r3
            r14.deleteCharAt(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "aids.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            java.lang.String r14 = "FeedBackupHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FeedBackupHelper start to process:"
            r0.<init>(r2)
            r0.append(r7)
            r2 = 44
            r0.append(r2)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r1, r14, r0)
            com.p683ss.android.ugc.aweme.feed.p1717c.C30161a.m70767a(r13, r7)
            goto L_0x0127
        L_0x0120:
            java.lang.String r13 = "FeedBackupHelper"
            java.lang.String r14 = "FeedBackupHelper process done, no need to process!"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r1, r13, r14)
        L_0x0127:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1730m.C30480d.m71422a(java.util.List, a.i):java.lang.Object");
    }

    /* renamed from: a */
    private void m71425a(int i, String str, int i2, String str2, Lock lock) {
        if (i == 0 && i2 == 0 && C30163b.m70783j() && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && !f79644m) {
            f79644m = true;
            C30162a.m70768a(lock);
            C0013i.m18a((Callable<TResult>) new C30484g<TResult>(this, i, lock), (Executor) C24076h.m58902c());
        }
    }

    /* renamed from: a */
    private void m71424a(int i, long j, long j2, int i2, Integer num, String str, int i3, String str2, String str3, String str4, Lock lock) {
        StringBuilder sb = new StringBuilder("start to fetchList,type:");
        sb.append(i);
        sb.append(",pullType:");
        sb.append(i3);
        sb.append(",aids:");
        sb.append(str3);
        C32458a.m75141a(4, "FeedFetchModel", sb.toString());
        int i4 = i3;
        String str5 = str3;
        m71425a(i, str, i4, str5, lock);
        C30483f fVar = new C30483f(this, i, i4, str5, j, j2, i2, num, str, str2, str4);
        fVar.run();
    }
}
