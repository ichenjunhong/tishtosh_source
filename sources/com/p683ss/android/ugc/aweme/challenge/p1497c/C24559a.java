package com.p683ss.android.ugc.aweme.challenge.p1497c;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p683ss.android.ugc.aweme.challenge.model.MixCardStruct;
import com.p683ss.android.ugc.aweme.challenge.model.RoomStructV2;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24632af;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.c.a */
public final class C24559a extends C26875a<Aweme, ChallengeAwemeList> {

    /* renamed from: a */
    public static HashMap<String, String> f65017a = new HashMap<>();

    /* renamed from: b */
    public String f65018b = "challenge_video";

    /* renamed from: c */
    private String f65019c;

    /* renamed from: d */
    private int f65020d;

    /* renamed from: e */
    private List<Aweme> f65021e;

    /* renamed from: a */
    public final List<Aweme> mo50330a() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeAwemeList) this.mData).items;
    }

    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!C9376b.m18558a((Collection<T>) this.f65021e)) {
            arrayList.addAll(this.f65021e);
        }
        List a = mo50330a();
        if (!C9376b.m18558a((Collection<T>) a)) {
            arrayList.addAll(a);
        }
        return arrayList;
    }

    public final boolean isDataEmpty() {
        if ((this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) && C9376b.m18558a((Collection<T>) getItems())) {
            return true;
        }
        return false;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean deleteItem(Object obj) {
        return C31190f.m72832a(getItems(), (Aweme) obj, this.mNotifyListeners);
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new ChallengeAwemeList();
        }
        ((ChallengeAwemeList) this.mData).hasMore = 1;
        ((ChallengeAwemeList) this.mData).items = list;
    }

    /* renamed from: a */
    public final void mo50331a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f65018b = str;
        }
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((ChallengeAwemeList) this.mData).cursor;
        }
        m59976a(str, j, 20, objArr[2].intValue(), objArr[3].booleanValue(), this.f65019c);
    }

    public final void refreshList(Object... objArr) {
        m59976a((String) objArr[1], 0, 20, objArr[2].intValue(), objArr[3].booleanValue(), null);
    }

    /* renamed from: a */
    public final void mo50332a(List<Aweme> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            if (this.f65021e == null) {
                this.f65021e = new ArrayList();
            }
            this.f65021e.clear();
            this.f65021e.addAll(list);
        }
    }

    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        List<Aweme> list;
        boolean z2;
        Aweme aweme;
        String str;
        boolean z3;
        ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) obj;
        if (challengeAwemeList != null && this.mListQueryType == 1) {
            if (challengeAwemeList.logPb == null) {
                this.f65019c = "";
            } else {
                this.f65019c = challengeAwemeList.logPb.getImprId();
            }
        }
        C29981aa.m70153a().mo60162a(challengeAwemeList.getRequestId(), challengeAwemeList.logPb);
        C52711k.m112240b(challengeAwemeList, "challengeAwemeList");
        Collection collection = challengeAwemeList.mixList;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = challengeAwemeList.items;
        } else {
            List<MixCardStruct> list2 = challengeAwemeList.mixList;
            C52711k.m112236a((Object) list2, "challengeAwemeList.mixList");
            Iterable iterable = list2;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                MixCardStruct mixCardStruct = (MixCardStruct) next;
                if (!C24632af.m60127a().enableLiveChallenge() ? mixCardStruct.getType() != 1 : !(mixCardStruct.getType() == 1 || mixCardStruct.getType() == 2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    arrayList.add(next);
                }
            }
            Iterable<MixCardStruct> iterable2 = (List) arrayList;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (MixCardStruct mixCardStruct2 : iterable2) {
                if (mixCardStruct2.isLive()) {
                    aweme = new Aweme();
                    RoomStructV2 roomInfo = mixCardStruct2.getRoomInfo();
                    if (roomInfo != null) {
                        str = roomInfo.getRawdata();
                    } else {
                        str = null;
                    }
                    aweme.setNewLiveRoomDataStr(str);
                } else {
                    aweme = mixCardStruct2.getAweme();
                    if (aweme == null) {
                        C52711k.m112234a();
                    }
                }
                arrayList2.add(aweme);
            }
            list = C52575l.m112139e((Collection<? extends T>) (List) arrayList2);
        }
        challengeAwemeList.items = list;
        if (challengeAwemeList == null || (C9376b.m18558a((Collection<T>) list) && !challengeAwemeList.isHasMore())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mIsNewDataEmpty = z2;
        if (!this.mIsNewDataEmpty) {
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) list.get(i));
                    updateAweme.setIsTop(((Aweme) list.get(i)).getIsTop());
                    if (updateAweme.getAid() != null) {
                        f65017a.put(updateAweme.getAid(), this.f65019c);
                    }
                    IRequestIdService a = C23325e.m57379a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(updateAweme.getAid());
                    sb.append(this.f65020d + 3000);
                    a.setRequestIdAndIndex(sb.toString(), challengeAwemeList.getRequestId(), i);
                    list.set(i, updateAweme);
                }
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = challengeAwemeList;
            } else if (i2 == 4) {
                if (list != null) {
                    if (C9376b.m18558a((Collection<T>) ((ChallengeAwemeList) this.mData).items)) {
                        ((ChallengeAwemeList) this.mData).items = list;
                    } else {
                        C24575k.m59988a(((ChallengeAwemeList) this.mData).items, list, C24561b.f65029a);
                    }
                }
                ((ChallengeAwemeList) this.mData).cursor = challengeAwemeList.cursor;
                ((ChallengeAwemeList) this.mData).hasMore = challengeAwemeList.hasMore & ((ChallengeAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData != null) {
                ((ChallengeAwemeList) this.mData).hasMore = 0;
            }
        }
    }

    /* renamed from: a */
    private void m59976a(String str, long j, int i, int i2, boolean z, String str2) {
        final int i3 = i2;
        this.f65020d = i3;
        C23566n a = C23566n.m57766a();
        C9381g gVar = this.mHandler;
        final String str3 = str;
        final long j2 = j;
        final boolean z2 = z;
        final String str4 = str2;
        C245601 r0 = new Callable(20) {
            public final Object call() throws Exception {
                return ChallengeApi.m59965a(str3, j2, 20, i3, z2, C24559a.this.f65018b, str4);
            }
        };
        a.mo48750a(gVar, r0, 0);
    }
}
