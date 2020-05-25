package com.p683ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.p683ss.android.ugc.aweme.feed.api.C30150h;
import com.p683ss.android.ugc.aweme.feed.helper.C30386j;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31864a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel$loadList$1 */
final class FollowingFeedListModel$loadList$1<T> implements C1710e<C30150h> {
    final /* synthetic */ int $cursor;
    final /* synthetic */ boolean $isBlueUser;
    final /* synthetic */ int $refreshType;
    final /* synthetic */ String $uid;
    final /* synthetic */ FollowingFeedListModel this$0;

    FollowingFeedListModel$loadList$1(FollowingFeedListModel followingFeedListModel, int i, String str, boolean z, int i2) {
        this.this$0 = followingFeedListModel;
        this.$refreshType = i;
        this.$uid = str;
        this.$isBlueUser = z;
        this.$cursor = i2;
    }

    public final void accept(C30150h hVar) {
        boolean z = true;
        if (hVar.getCode() != 0) {
            Message obtainMessage = this.this$0.mHandler.obtainMessage(0);
            obtainMessage.obj = new RuntimeException(hVar.getMsg());
            this.this$0.mHandler.sendMessage(obtainMessage);
            this.this$0.mIsNewDataEmpty = true;
            return;
        }
        int i = -1;
        if (this.$refreshType == 1) {
            Iterator it = this.this$0.uidList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C52830p.m112406a((String) it.next(), this.$uid, true)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            this.this$0.hasMoreHeader = true;
            if (i == 0) {
                this.this$0.hasMoreHeader = false;
            } else {
                this.this$0.headerUid = (String) this.this$0.uidList.get(i - 1);
                this.this$0.headerNextCursor = 0;
            }
            this.this$0.hasMoreFooter = true;
            if (hVar.getHasMore()) {
                this.this$0.footerUid = this.$uid;
                this.this$0.footerNextCursor = hVar.getNextCursor();
            } else if (i == this.this$0.uidList.size() - 1) {
                this.this$0.hasMoreFooter = false;
            } else {
                this.this$0.footerUid = (String) this.this$0.uidList.get(i + 1);
                this.this$0.footerNextCursor = 0;
            }
            Map a = C30386j.m71306a();
            String str = this.$uid;
            String str2 = ((Aweme) hVar.getAwemeList().get(0)).aid;
            C52711k.m112236a((Object) str2, "it.awemeList[0].aid");
            a.put(str, str2);
            if (!hVar.getHasMore()) {
                Map b = C30386j.m71307b();
                String str3 = this.$uid;
                String str4 = ((Aweme) hVar.getAwemeList().get(hVar.getAwemeList().size() - 1)).aid;
                C52711k.m112236a((Object) str4, "it.awemeList[it.awemeList.size - 1].aid");
                b.put(str3, str4);
            }
            if (this.$isBlueUser) {
                C47718bf.m103288a(new C31864a(this.$uid));
            }
        } else if (this.$refreshType == 3) {
            if (hVar.getHasMore()) {
                this.this$0.headerUid = this.$uid;
                this.this$0.headerNextCursor = hVar.getNextCursor();
            } else {
                Iterator it2 = this.this$0.uidList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (C52830p.m112406a((String) it2.next(), this.$uid, true)) {
                        i = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i == 0) {
                    this.this$0.hasMoreHeader = false;
                } else {
                    this.this$0.headerUid = (String) this.this$0.uidList.get(i - 1);
                    this.this$0.headerNextCursor = 0;
                }
            }
            if (this.$cursor == 0) {
                Map b2 = C30386j.m71307b();
                String str5 = this.$uid;
                String str6 = ((Aweme) hVar.getAwemeList().get(hVar.getAwemeList().size() - 1)).aid;
                C52711k.m112236a((Object) str6, "it.awemeList[it.awemeList.size - 1].aid");
                b2.put(str5, str6);
            }
            if (!hVar.getHasMore()) {
                Map a2 = C30386j.m71306a();
                String str7 = this.$uid;
                String str8 = ((Aweme) hVar.getAwemeList().get(0)).aid;
                C52711k.m112236a((Object) str8, "it.awemeList[0].aid");
                a2.put(str7, str8);
            }
        } else {
            if (hVar.getHasMore()) {
                this.this$0.footerUid = this.$uid;
                this.this$0.footerNextCursor = hVar.getNextCursor();
            } else {
                Iterator it3 = this.this$0.uidList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (C52830p.m112406a((String) it3.next(), this.$uid, true)) {
                        i = i4;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i == this.this$0.uidList.size() - 1) {
                    this.this$0.hasMoreFooter = false;
                } else {
                    this.this$0.footerUid = (String) this.this$0.uidList.get(i + 1);
                    this.this$0.footerNextCursor = 0;
                }
            }
            if (this.$cursor == 0) {
                Map a3 = C30386j.m71306a();
                String str9 = this.$uid;
                String str10 = ((Aweme) hVar.getAwemeList().get(0)).aid;
                C52711k.m112236a((Object) str10, "it.awemeList[0].aid");
                a3.put(str9, str10);
            }
            if (!hVar.getHasMore()) {
                Map b3 = C30386j.m71307b();
                String str11 = this.$uid;
                String str12 = ((Aweme) hVar.getAwemeList().get(hVar.getAwemeList().size() - 1)).aid;
                C52711k.m112236a((Object) str12, "it.awemeList[it.awemeList.size - 1].aid");
                b3.put(str11, str12);
            }
        }
        FollowingFeedListModel followingFeedListModel = this.this$0;
        Collection awemeList = hVar.getAwemeList();
        if (awemeList != null && !awemeList.isEmpty()) {
            z = false;
        }
        followingFeedListModel.mIsNewDataEmpty = z;
        Message obtainMessage2 = this.this$0.mHandler.obtainMessage(0);
        obtainMessage2.obj = hVar;
        this.this$0.mHandler.sendMessage(obtainMessage2);
    }
}
