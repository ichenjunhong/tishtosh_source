package com.p683ss.android.ugc.aweme.newfollow.p1999f;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31763c;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31769a;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32753b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.ContactsActivity;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p1995b.C37852b.C37853a;
import com.p683ss.android.ugc.aweme.newfollow.p1996c.C37855b;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37915b;
import com.p683ss.android.ugc.aweme.newfollow.p2003vh.C37997r;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.newfollow.f.b */
public class C37865b extends C31769a<C31877a, C37997r> implements C37855b {

    /* renamed from: o */
    public C37915b f96395o;

    /* renamed from: p */
    public boolean f96396p;

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Fragment mo64727q() {
        return this.f96395o;
    }

    /* renamed from: j */
    public final String mo51789j() {
        return this.f96395o.mo63441v();
    }

    /* renamed from: t */
    public final C31877a mo54803n() {
        return (C31877a) this.f70700f;
    }

    /* renamed from: s */
    public final void mo77307s() {
        if (this.f96396p) {
            this.f96396p = false;
            ((C31877a) this.f70700f).f83270d = false;
            C47718bf.m103288a(new C30319aj("DISCOVER"));
        }
    }

    /* renamed from: a */
    public final void mo77298a() {
        C37915b bVar = this.f96395o;
        C37879b.m84595d();
        if (bVar != null) {
            FragmentActivity activity = bVar.getActivity();
            if (activity != null) {
                if (C47673an.m103185b(activity)) {
                    bVar.startActivityForResult(ContactsActivity.m75414a(activity, null, false), 1);
                } else {
                    C10691a.m21548c((Context) activity, (int) R.string.hd).mo19066a();
                    C47673an.m103184a(activity, new C32753b(activity, bVar, null) {

                        /* renamed from: a */
                        final /* synthetic */ Activity f96366a;

                        /* renamed from: b */
                        final /* synthetic */ Fragment f96367b;

                        /* renamed from: c */
                        final /* synthetic */ C37853a f96368c;

                        /* renamed from: b */
                        public final void mo60073b() {
                        }

                        /* renamed from: a */
                        public final void mo60072a() {
                            this.f96367b.startActivityForResult(ContactsActivity.m75414a(this.f96366a, null, true), 1);
                            if (this.f96368c != null) {
                                this.f96368c.mo77296a();
                            }
                        }

                        {
                            this.f96366a = r1;
                            this.f96367b = r2;
                            this.f96368c = r3;
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        boolean z;
        super.mo44838b();
        if (this.f70700f != null && this.f70701g != null && ((C37997r) this.f70701g).isViewValid()) {
            mo77307s();
            boolean z2 = false;
            ((C37997r) this.f70701g).mo64877a(false);
            int i = ((C31877a) this.f70700f).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    C37997r rVar = (C37997r) this.f70701g;
                    List items = ((C31877a) this.f70700f).getItems();
                    if (((C31877a) this.f70700f).isHasMore() && !((C31877a) this.f70700f).isNewDataEmpty()) {
                        z2 = true;
                    }
                    rVar.mo64883b(items, z2);
                }
                return;
            }
            C47718bf.m103288a(new C31763c(0));
            if (((C31877a) this.f70700f).isDataEmpty()) {
                ((C37997r) this.f70701g).mo64861a(3);
                ((C37997r) this.f70701g).mo77461d(false);
                return;
            }
            ((C37997r) this.f70701g).f96744q = ((C31877a) this.f70700f).f83276j;
            ((C37997r) this.f70701g).mo64876a(((C31877a) this.f70700f).getItems(), ((C31877a) this.f70700f).isHasMore());
            C37997r rVar2 = (C37997r) this.f70701g;
            C31877a aVar = (C31877a) this.f70700f;
            if (aVar.mData == null || ((FollowFeedList) aVar.mData).getUpPhoneNotice() != 1) {
                z = false;
            } else {
                z = true;
            }
            rVar2.mo77461d(z);
            C37997r rVar3 = (C37997r) this.f70701g;
            C31877a aVar2 = (C31877a) this.f70700f;
            if (aVar2.mData != null && ((FollowFeedList) aVar2.mData).getIsRecommend() == 1) {
                z2 = true;
            }
            rVar3.f96749z = z2;
        }
    }

    public C37865b(C37915b bVar) {
        this.f96395o = bVar;
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return this.f96395o.mo63441v();
    }

    /* renamed from: b */
    public final void mo64669b(Aweme aweme) {
        boolean z;
        String str;
        if (aweme.getAuthor().getFollowStatus() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        C37879b.m84581a(str, mo60874g(true), aweme);
    }

    @C53771m
    public void onHideUploadRecoverEvent(C43890d dVar) {
        boolean z = dVar.f111146a;
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(C37866c.f96397a);
        if (this.f70701g != null && ((C37997r) this.f70701g).isViewValid()) {
            ((C37997r) this.f70701g).mo77462e(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r2 = false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.common.p1594f.C26875a mo64671c(com.p683ss.android.ugc.aweme.feed.model.Aweme r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.follow.presenter.a r0 = r6.mo54803n()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r0.mData
            r2 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 == 0) goto L_0x001a
            goto L_0x0045
        L_0x001a:
            java.lang.Object r1 = r0.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            java.util.Iterator r1 = r1.iterator()
        L_0x0026:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r3 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed) r3
            int r4 = r3.getFeedType()
            r5 = 65280(0xff00, float:9.1477E-41)
            if (r4 == r5) goto L_0x0044
            int r3 = r3.getFeedType()
            r4 = 65298(0xff12, float:9.1502E-41)
            if (r3 != r4) goto L_0x0026
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r2 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r1 = new com.ss.android.ugc.aweme.follow.presenter.FollowFeed
            r1.<init>(r7)
            java.lang.Object r7 = r0.mData
            if (r7 != 0) goto L_0x0057
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r7 = new com.ss.android.ugc.aweme.follow.presenter.FollowFeedList
            r7.<init>()
            r0.mData = r7
        L_0x0057:
            java.lang.Object r7 = r0.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r7 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r7
            java.util.List r7 = r7.getItems()
            boolean r7 = com.bytedance.common.utility.p522b.C9376b.m18558a(r7)
            if (r7 == 0) goto L_0x0074
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r1)
            java.lang.Object r1 = r0.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            r1.setItems(r7)
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.newfollow.p1999f.C37865b.mo64671c(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.common.f.a");
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        mo77307s();
        Throwable a = C22971a.m56490a((Throwable) exc);
        if (a instanceof C23459a) {
            C26890h.m65011a("homepage_follow_monitor", C23089d.m56640a().mo47829a("error_type", "follow_feed_error").mo47826a("error_code", ((C23459a) a).getErrorCode()).f61491a);
        } else {
            C26890h.m65011a("homepage_follow_monitor", C23089d.m56640a().mo47829a("error_type", "follow_feed_error").mo47826a("error_code", 4).f61491a);
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (this.f70701g != null && ((C37997r) this.f70701g).isViewValid() && !TextUtils.isEmpty(followStatus.userId)) {
            C37837a aVar = (C37837a) ((C37997r) this.f70701g).f83139f;
            if (!C9376b.m18558a((Collection<T>) aVar.mo50673a())) {
                for (C37859b bVar : aVar.mo50673a()) {
                    FollowFeed followFeed = (FollowFeed) bVar;
                    if (followFeed.getFeedType() == 65281 && !C9376b.m18558a((Collection<T>) followFeed.getUser())) {
                        for (User user : followFeed.getUser()) {
                            if (TextUtils.equals(user.getUid(), followStatus.userId) && user.getFollowStatus() != followStatus.followStatus) {
                                user.setFollowStatus(followStatus.followStatus);
                                user.setWatchStatus(followStatus.watchStatus);
                                List user2 = followFeed.getUser();
                                if (aVar.f96345R != null && !C9376b.m18558a((Collection<T>) aVar.f70670n) && aVar.f70670n.contains(aVar.f96343P)) {
                                    int indexOf = aVar.f70670n.indexOf(aVar.f96343P);
                                    aVar.f96345R.mo77423a(user2, aVar.f96343P.getRequestId());
                                    aVar.notifyItemChanged(indexOf);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
