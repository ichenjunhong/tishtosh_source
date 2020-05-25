package com.p683ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.api.C30150h;
import com.p683ss.android.ugc.aweme.feed.api.FollowFeedApi.C30141a;
import com.p683ss.android.ugc.aweme.feed.p1724i.C30406b;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel */
public final class FollowingFeedListModel extends C26875a<Aweme, C30150h> {
    private final List<String> blueDotList;
    public int footerNextCursor;
    public String footerUid = "";
    public boolean hasMoreFooter;
    public boolean hasMoreHeader;
    public int headerNextCursor;
    public String headerUid = "";
    public final List<String> uidList;

    public final boolean checkParams(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        return true;
    }

    public final boolean isHasMore() {
        return this.hasMoreFooter;
    }

    public final List<Aweme> getItems() {
        C30150h hVar = (C30150h) this.mData;
        if (hVar != null) {
            return hVar.getAwemeList();
        }
        return null;
    }

    public final void loadMoreList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (this.hasMoreFooter) {
            loadList(this.footerNextCursor, this.footerUid, 2);
        }
    }

    public final void refreshList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        String str = objArr[1];
        if (!(str instanceof String)) {
            str = null;
        }
        String str2 = str;
        if (str2 != null) {
            loadList(0, str2, 1);
        }
    }

    public final void loadLatestList(Object... objArr) {
        C52711k.m112240b(objArr, "params");
        if (!this.hasMoreHeader) {
            Message obtainMessage = this.mHandler.obtainMessage(0);
            obtainMessage.obj = new C30406b();
            this.mHandler.sendMessage(obtainMessage);
            return;
        }
        loadList(this.headerNextCursor, this.headerUid, 3);
    }

    public FollowingFeedListModel(List<String> list, List<String> list2) {
        C52711k.m112240b(list, "uidList");
        C52711k.m112240b(list2, "blueDotList");
        this.uidList = list;
        this.blueDotList = list2;
    }

    private final void loadList(int i, String str, int i2) {
        int i3;
        boolean z;
        if (i2 != 3) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        Iterator it = this.uidList.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                String str2 = str;
                i4 = -1;
                break;
            } else if (C52830p.m112406a((String) it.next(), str, true)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= this.blueDotList.size() || !C52830p.m112406a((String) this.blueDotList.get(i4), "true", true)) {
            z = false;
        } else {
            z = true;
        }
        C2201v a = C30141a.m70743a().getFollowingInterestFeed(i, 8, str, i3, 2, z).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        FollowingFeedListModel$loadList$1 followingFeedListModel$loadList$1 = new FollowingFeedListModel$loadList$1(this, i2, str, z, i);
        a.mo6505a((C1710e<? super T>) followingFeedListModel$loadList$1, (C1710e<? super Throwable>) new FollowingFeedListModel$loadList$2<Object>(this));
    }
}
