package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.C0643c;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.LiveDetailActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31765e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37844e;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x */
public class C38007x extends C37844e {

    /* renamed from: aT */
    public boolean f96761aT = true;

    /* renamed from: aU */
    public LiveRoomStruct f96762aU;

    /* renamed from: aV */
    public String f96763aV = "";

    /* renamed from: aW */
    public boolean f96764aW;

    /* renamed from: aX */
    public final View f96765aX;

    /* renamed from: aY */
    private final RemoteImageView f96766aY;

    /* renamed from: aZ */
    private final View f96767aZ;

    /* renamed from: ba */
    private final TextView f96768ba;

    /* renamed from: bb */
    private final View f96769bb;

    /* renamed from: bc */
    private final TextView f96770bc;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x$a */
    static final class C38008a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38007x f96771a;

        C38008a(C38007x xVar) {
            this.f96771a = xVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96771a.mo77433d(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x$b */
    static final class C38009b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38007x f96772a;

        C38009b(C38007x xVar) {
            this.f96772a = xVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96772a.f83052g.mo64661a((View) this.f96772a.f83061p, this.f96772a.itemView, this.f96772a.mo77429af().owner);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x$c */
    static final class C38010c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38007x f96773a;

        C38010c(C38007x xVar) {
            this.f96773a = xVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C31758e eVar = this.f96773a.f83052g;
            if (eVar != null) {
                eVar.mo64661a((View) this.f96773a.f83056k, this.f96773a.itemView, this.f96773a.mo77429af().owner);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x$d */
    static final class C38011d<T> implements C1710e<C36083b> {

        /* renamed from: a */
        final /* synthetic */ C38007x f96774a;

        C38011d(C38007x xVar) {
            this.f96774a = xVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C36083b bVar = (C36083b) obj;
            if (TextUtils.equals(this.f96774a.mo77429af().owner.getUid(), String.valueOf(bVar.f92446a))) {
                if (bVar.f92447b == 0) {
                    this.f96774a.mo77429af().status = 4;
                    this.f96774a.f83051f.mo63565b();
                    this.f96774a.mo77478a(Integer.valueOf(4));
                    RemoteImageView remoteImageView = this.f96774a.f83056k;
                    User user = this.f96774a.mo77429af().owner;
                    C52711k.m112236a((Object) user, "mRoom.owner");
                    C23515d.m57670a(remoteImageView, user.getAvatarThumb(), this.f96774a.f83002J, this.f96774a.f83002J);
                    return;
                }
                this.f96774a.mo77429af().status = 2;
                this.f96774a.mo77429af().f79734id = bVar.f92447b;
                this.f96774a.mo77429af().owner.roomId = bVar.f92447b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x$e */
    static final class C38012e implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C38007x f96775a;

        C38012e(C38007x xVar) {
            this.f96775a = xVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f96775a.mo77431ah();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.x$f */
    static final class C38013f implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C38007x f96776a;

        C38013f(C38007x xVar) {
            this.f96776a = xVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f96776a.mo77476a(this.f96776a.mo77429af());
        }
    }

    /* renamed from: E */
    public final void mo64740E() {
        mo64736A();
    }

    /* renamed from: G */
    public final void mo64742G() {
    }

    /* renamed from: H */
    public final void mo64743H() {
    }

    /* renamed from: J */
    public final void mo64745J() {
        mo77431ah();
    }

    /* renamed from: L */
    public final void mo64747L() {
        mo64736A();
    }

    /* renamed from: S */
    public final void mo64834S() {
        mo77430ag();
    }

    /* renamed from: V */
    public final void mo64837V() {
        mo77431ah();
    }

    /* renamed from: a */
    public void mo77476a(LiveRoomStruct liveRoomStruct) {
        C52711k.m112240b(liveRoomStruct, "room");
    }

    /* renamed from: ag */
    public void mo77430ag() {
    }

    /* renamed from: ah */
    public void mo77431ah() {
    }

    /* renamed from: b */
    public final boolean mo64769b() {
        return true;
    }

    /* renamed from: F */
    public final void mo64741F() {
        mo64837V();
        mo64737B();
    }

    /* renamed from: B */
    public final void mo64737B() {
        if (this.f83051f != null) {
            this.f83051f.mo63567d();
        }
    }

    /* renamed from: af */
    public final LiveRoomStruct mo77429af() {
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        return liveRoomStruct;
    }

    /* renamed from: k */
    public final void mo64793k() {
        View view = this.f83009Q;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: o */
    public final void mo64797o() {
        C23729p.m58257a((View) this.f83008P, 8);
    }

    /* renamed from: e */
    public void mo64778e() {
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct != null) {
            mo64760a(this.f96765aX, 0, 0);
        }
    }

    /* renamed from: A */
    public final void mo64736A() {
        if (this.f83051f != null) {
            LiveRoomStruct liveRoomStruct = this.f96762aU;
            if (liveRoomStruct == null) {
                C52711k.m112237a("mRoom");
            }
            User user = liveRoomStruct.owner;
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            user.roomId = liveRoomStruct2.f79734id;
            this.f83051f.mo63566c();
        }
    }

    /* renamed from: g */
    public void mo64784g() {
        mo64789i();
        mo64808x();
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        mo77478a(Integer.valueOf(liveRoomStruct.status));
        LiveRoomStruct liveRoomStruct2 = this.f96762aU;
        if (liveRoomStruct2 == null) {
            C52711k.m112237a("mRoom");
        }
        m84995b(Integer.valueOf(liveRoomStruct2.user_count));
        mo64803s();
        mo64805u();
        mo64793k();
        mo64810z();
    }

    /* renamed from: j */
    public final void mo64791j() {
        if (this.f83010R != null) {
            LiveRoomStruct liveRoomStruct = this.f96762aU;
            if (liveRoomStruct == null) {
                C52711k.m112237a("mRoom");
            }
            if (C31753a.m73742b(liveRoomStruct.owner)) {
                ImageView imageView = this.f83010R;
                C52711k.m112236a((Object) imageView, "mIvExtraBtn");
                imageView.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f83010R;
            C52711k.m112236a((Object) imageView2, "mIvExtraBtn");
            imageView2.setVisibility(0);
        }
    }

    /* renamed from: v */
    public final List<String> mo64806v() {
        ArrayList arrayList = new ArrayList();
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (!C31753a.m73742b(liveRoomStruct.owner)) {
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            if (C47915gg.m103663l(liveRoomStruct2.owner)) {
                arrayList.add(mo64749N().getString(R.string.f9m));
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public final void mo64807w() {
        List v = mo64806v();
        if (this.f83052g != null) {
            C31758e eVar = this.f83052g;
            LiveRoomStruct liveRoomStruct = this.f96762aU;
            if (liveRoomStruct == null) {
                C52711k.m112237a("mRoom");
            }
            eVar.mo64666a(liveRoomStruct.owner, v, (OnShowListener) new C38012e(this), (OnDismissListener) new C38013f(this));
        }
    }

    /* renamed from: x */
    public void mo64808x() {
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct.roomCover != null) {
            RemoteImageView remoteImageView = this.f83053h;
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            UrlModel urlModel = liveRoomStruct2.roomCover;
            RemoteImageView remoteImageView2 = this.f83053h;
            C52711k.m112236a((Object) remoteImageView2, "mCoverView");
            int width = remoteImageView2.getWidth();
            RemoteImageView remoteImageView3 = this.f83053h;
            C52711k.m112236a((Object) remoteImageView3, "mCoverView");
            C23515d.m57670a(remoteImageView, urlModel, width, remoteImageView3.getHeight());
        }
    }

    /* renamed from: z */
    public final void mo64810z() {
        if (VERSION.SDK_INT >= 21) {
            View view = this.f96765aX;
            Context N = mo64749N();
            C52711k.m112236a((Object) N, "context");
            view.setOutlineProvider(new C47856en(N.getResources().getDimensionPixelOffset(R.dimen.i6)));
            this.f96765aX.setClipToOutline(true);
        }
    }

    /* renamed from: s */
    public final void mo64803s() {
        this.f83067v.setMaxSize(NormalGiftView.MASK_TRANSLATE_VALUE);
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (!TextUtils.isEmpty(liveRoomStruct.title)) {
            MentionTextView mentionTextView = this.f83067v;
            C52711k.m112236a((Object) mentionTextView, "mDescView");
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            mentionTextView.setText(liveRoomStruct2.title);
            MentionTextView mentionTextView2 = this.f83067v;
            C52711k.m112236a((Object) mentionTextView2, "mDescView");
            mentionTextView2.setVisibility(0);
            MentionTextView mentionTextView3 = this.f83067v;
            C52711k.m112236a((Object) mentionTextView3, "mDescView");
            mentionTextView3.setSpanSize(C9432q.m18669a(mo64749N(), 15.0f));
            return;
        }
        MentionTextView mentionTextView4 = this.f83067v;
        C52711k.m112236a((Object) mentionTextView4, "mDescView");
        mentionTextView4.setVisibility(8);
    }

    /* renamed from: u */
    public final void mo64805u() {
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct != null) {
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            if (liveRoomStruct2.owner != null) {
                if (this.f83058m != null) {
                    this.f83058m.setOnClickListener(new C38008a(this));
                }
                if (this.f83061p != null) {
                    this.f83061p.setOnClickListener(new C38009b(this));
                }
                AvatarImageView avatarImageView = this.f83056k;
                if (avatarImageView != null) {
                    avatarImageView.setOnClickListener(new C38010c(this));
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo64789i() {
        mo64791j();
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct.owner != null) {
            View view = this.f83054i;
            C52711k.m112236a((Object) view, "mHeaderLayout");
            boolean z = false;
            view.setVisibility(0);
            if (this.f83051f == null) {
                LiveRoomStruct liveRoomStruct2 = this.f96762aU;
                if (liveRoomStruct2 == null) {
                    C52711k.m112237a("mRoom");
                }
                if (liveRoomStruct2.f79734id > 0) {
                    z = true;
                }
                this.f83051f = new C30828c(z, this.f83058m, this.f83056k, this.f83059n);
            }
            AvatarImageView avatarImageView = this.f83056k;
            C52711k.m112236a((Object) avatarImageView, "mAvatarView");
            avatarImageView.setVisibility(4);
            RemoteImageView remoteImageView = this.f83058m;
            LiveRoomStruct liveRoomStruct3 = this.f96762aU;
            if (liveRoomStruct3 == null) {
                C52711k.m112237a("mRoom");
            }
            User user = liveRoomStruct3.owner;
            C52711k.m112236a((Object) user, "mRoom.owner");
            C23515d.m57670a(remoteImageView, user.getAvatarThumb(), this.f83002J, this.f83002J);
            LiveRoomStruct liveRoomStruct4 = this.f96762aU;
            if (liveRoomStruct4 == null) {
                C52711k.m112237a("mRoom");
            }
            User user2 = liveRoomStruct4.owner;
            C52711k.m112236a((Object) user2, "mRoom.owner");
            if (!TextUtils.isEmpty(user2.getRemarkName())) {
                TextView textView = this.f83061p;
                C52711k.m112236a((Object) textView, "mHeadUserNameView");
                LiveRoomStruct liveRoomStruct5 = this.f96762aU;
                if (liveRoomStruct5 == null) {
                    C52711k.m112237a("mRoom");
                }
                User user3 = liveRoomStruct5.owner;
                C52711k.m112236a((Object) user3, "mRoom.owner");
                textView.setText(user3.getRemarkName());
            } else {
                TextView textView2 = this.f83061p;
                C52711k.m112236a((Object) textView2, "mHeadUserNameView");
                LiveRoomStruct liveRoomStruct6 = this.f96762aU;
                if (liveRoomStruct6 == null) {
                    C52711k.m112237a("mRoom");
                }
                User user4 = liveRoomStruct6.owner;
                C52711k.m112236a((Object) user4, "mRoom.owner");
                textView2.setText(user4.getNickname());
            }
            LiveRoomStruct liveRoomStruct7 = this.f96762aU;
            if (liveRoomStruct7 == null) {
                C52711k.m112237a("mRoom");
            }
            User user5 = liveRoomStruct7.owner;
            LiveRoomStruct liveRoomStruct8 = this.f96762aU;
            if (liveRoomStruct8 == null) {
                C52711k.m112237a("mRoom");
            }
            user5.roomId = liveRoomStruct8.f79734id;
            C30828c cVar = this.f83051f;
            LiveRoomStruct liveRoomStruct9 = this.f96762aU;
            if (liveRoomStruct9 == null) {
                C52711k.m112237a("mRoom");
            }
            cVar.mo63563a(liveRoomStruct9.owner, getClass(), new C38011d(this));
        }
    }

    /* renamed from: M */
    public final void mo64748M() {
        int i;
        int i2;
        if (!C32800a.m75679a(this.f96765aX)) {
            if (!C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false) || !C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
                mo77433d(false);
            } else {
                C31758e eVar = this.f83052g;
                C52711k.m112236a((Object) eVar, "mInteractListener");
                C31213v.m72896a(eVar.mo64670c());
                if (C10181b.m20511a().mo18172a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", 31744, false)) {
                    Context N = mo64749N();
                    LiveRoomStruct liveRoomStruct = this.f96762aU;
                    if (liveRoomStruct == null) {
                        C52711k.m112237a("mRoom");
                    }
                    String valueOf = String.valueOf(liveRoomStruct.f79734id);
                    String c = mo64771c();
                    String ad = mo64846ad();
                    LiveRoomStruct liveRoomStruct2 = this.f96762aU;
                    if (liveRoomStruct2 == null) {
                        C52711k.m112237a("mRoom");
                    }
                    User user = liveRoomStruct2.owner;
                    if (user != null) {
                        i2 = user.getCommerceUserLevel();
                    } else {
                        i2 = 0;
                    }
                    int ab = mo64845ab();
                    String Z = mo64842Z();
                    View view = this.f96765aX;
                    Intent intent = new Intent(N, LiveDetailActivity.class);
                    intent.putExtra("id", valueOf);
                    intent.putExtra("refer", c);
                    intent.putExtra("video_from", ad);
                    intent.putExtra("profile_enterprise_type", i2);
                    intent.putExtra("page_type", ab);
                    if (Z != null) {
                        intent.putExtra("userid", Z);
                    }
                    C0636b.m2094a(N, intent, C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight()).mo2171a());
                } else {
                    Context N2 = mo64749N();
                    LiveRoomStruct liveRoomStruct3 = this.f96762aU;
                    if (liveRoomStruct3 == null) {
                        C52711k.m112237a("mRoom");
                    }
                    String valueOf2 = String.valueOf(liveRoomStruct3.f79734id);
                    String c2 = mo64771c();
                    String ad2 = mo64846ad();
                    LiveRoomStruct liveRoomStruct4 = this.f96762aU;
                    if (liveRoomStruct4 == null) {
                        C52711k.m112237a("mRoom");
                    }
                    User user2 = liveRoomStruct4.owner;
                    if (user2 != null) {
                        i = user2.getCommerceUserLevel();
                    } else {
                        i = 0;
                    }
                    DetailActivity.m66079a(N2, valueOf2, c2, ad2, i, mo64845ab(), mo64842Z(), this.f96765aX);
                }
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        this.f83025ae = true;
        this.f83017Y.mo64960a(this.f83036ap);
        C47718bf.m103290c(this);
    }

    /* renamed from: b */
    private final void m84995b(Integer num) {
        String str;
        TextView textView = this.f96768ba;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: d */
    public final void mo64849d(Aweme aweme) {
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct != null) {
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            mo77476a(liveRoomStruct2);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f83025ae = false;
        mo64837V();
        this.f83017Y.mo64962b(this.f83036ap);
        this.f83018Z.removeCallbacksAndMessages(null);
        mo64737B();
        C47718bf.m103291d(this);
    }

    /* renamed from: a */
    public void mo64756a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.cu2);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a4k);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo64757a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.ba0);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo64757a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a3e);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo64759a(view4, 20.0f, 20.0f, 16.0f, 16.0f);
    }

    @C53771m
    public final void onFollowLiveStatusChange(RoomStatusEvent roomStatusEvent) {
        C52711k.m112240b(roomStatusEvent, "event");
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct != null) {
            long j = roomStatusEvent.f8660a;
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            if (j == liveRoomStruct2.f79734id) {
                if (roomStatusEvent.f8662c) {
                    this.f96764aW = true;
                    mo77478a(Integer.valueOf(4));
                    LiveRoomStruct liveRoomStruct3 = this.f96762aU;
                    if (liveRoomStruct3 == null) {
                        C52711k.m112237a("mRoom");
                    }
                    liveRoomStruct3.status = 4;
                    return;
                }
                this.f96764aW = false;
                mo77478a(Integer.valueOf(2));
                m84995b(Integer.valueOf(roomStatusEvent.f8663d));
            }
        }
    }

    @C53771m
    public final void onUnFollowUser(C31765e eVar) {
        C52711k.m112240b(eVar, "event");
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct != null) {
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            if (liveRoomStruct2.owner != null) {
                CharSequence charSequence = eVar.f82962a;
                LiveRoomStruct liveRoomStruct3 = this.f96762aU;
                if (liveRoomStruct3 == null) {
                    C52711k.m112237a("mRoom");
                }
                User user = liveRoomStruct3.owner;
                C52711k.m112236a((Object) user, "mRoom.owner");
                if (TextUtils.equals(charSequence, user.getUid())) {
                    mo77431ah();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64766b(int i) {
        LiveRoomStruct liveRoomStruct = this.f96762aU;
        if (liveRoomStruct == null) {
            C52711k.m112237a("mRoom");
        }
        if (liveRoomStruct != null) {
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            if (liveRoomStruct2.owner != null) {
                String str = "livesdk_live_show";
                C23089d a = C23089d.m56640a().mo47826a("scene_id", 1008).mo47829a("enter_method", "live_cell").mo47829a("action_type", "click");
                String str2 = "anchor_id";
                LiveRoomStruct liveRoomStruct3 = this.f96762aU;
                if (liveRoomStruct3 == null) {
                    C52711k.m112237a("mRoom");
                }
                User user = liveRoomStruct3.owner;
                C52711k.m112236a((Object) user, "mRoom.owner");
                C23089d a2 = a.mo47829a(str2, user.getUid());
                String str3 = "room_id";
                LiveRoomStruct liveRoomStruct4 = this.f96762aU;
                if (liveRoomStruct4 == null) {
                    C52711k.m112237a("mRoom");
                }
                C23089d a3 = a2.mo47827a(str3, liveRoomStruct4.f79734id);
                String str4 = "enter_from_merge";
                String str5 = "homepage_follow";
                if (TextUtils.equals(this.f96763aV, "extra_follow_type_friend")) {
                    str5 = "homepage_friends";
                }
                C23089d a4 = a3.mo47829a(str4, str5);
                String str6 = "request_id";
                LiveRoomStruct liveRoomStruct5 = this.f96762aU;
                if (liveRoomStruct5 == null) {
                    C52711k.m112237a("mRoom");
                }
                C26890h.m65011a(str, a4.mo47829a(str6, liveRoomStruct5.getRequestId()).f61491a);
            }
        }
        switch (i) {
            case 0:
            case 1:
                mo64836U();
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public final void mo77433d(boolean z) {
        if (this.f83052g != null) {
            LiveRoomStruct liveRoomStruct = this.f96762aU;
            if (liveRoomStruct == null) {
                C52711k.m112237a("mRoom");
            }
            User user = liveRoomStruct.owner;
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            user.roomId = liveRoomStruct2.f79734id;
            LiveRoomStruct liveRoomStruct3 = this.f96762aU;
            if (liveRoomStruct3 == null) {
                C52711k.m112237a("mRoom");
            }
            if (liveRoomStruct3.isFinish()) {
                C31758e eVar = this.f83052g;
                View view = this.f83061p;
                View view2 = this.itemView;
                LiveRoomStruct liveRoomStruct4 = this.f96762aU;
                if (liveRoomStruct4 == null) {
                    C52711k.m112237a("mRoom");
                }
                eVar.mo64661a(view, view2, liveRoomStruct4.owner);
                return;
            }
            String str = "homepage_follow";
            String str2 = "live_cell";
            if (TextUtils.equals(this.f96763aV, "extra_follow_type_friend")) {
                str = "homepage_friends";
            }
            String str3 = str;
            if (z) {
                str2 = "video_head";
            }
            String str4 = str2;
            LiveRoomStruct liveRoomStruct5 = this.f96762aU;
            if (liveRoomStruct5 == null) {
                C52711k.m112237a("mRoom");
            }
            User user2 = liveRoomStruct5.owner;
            C52711k.m112236a((Object) user2, "mRoom.owner");
            LiveRoomStruct liveRoomStruct6 = this.f96762aU;
            if (liveRoomStruct6 == null) {
                C52711k.m112237a("mRoom");
            }
            user2.setRequestId(liveRoomStruct6.getRequestId());
            C31758e eVar2 = this.f83052g;
            View view3 = this.f96765aX;
            View view4 = this.itemView;
            LiveRoomStruct liveRoomStruct7 = this.f96762aU;
            if (liveRoomStruct7 == null) {
                C52711k.m112237a("mRoom");
            }
            eVar2.mo64662a(view3, view4, liveRoomStruct7.owner, str3, str4);
        }
    }

    /* renamed from: a */
    public final void mo77478a(Integer num) {
        if (num != null && num.intValue() == 4) {
            TextView textView = this.f83060o;
            if (textView == null) {
                C52711k.m112234a();
            }
            textView.setText(mo64749N().getString(R.string.b4u));
            return;
        }
        TextView textView2 = this.f83060o;
        if (textView2 == null) {
            C52711k.m112234a();
        }
        textView2.setText(mo64749N().getString(R.string.b4o));
    }

    /* renamed from: a */
    public final void mo77477a(LiveRoomStruct liveRoomStruct, C31758e eVar) {
        C52711k.m112240b(eVar, "interactListener");
        if (liveRoomStruct != null) {
            this.f83052g = eVar;
            this.f96762aU = liveRoomStruct;
            LiveRoomStruct liveRoomStruct2 = this.f96762aU;
            if (liveRoomStruct2 == null) {
                C52711k.m112237a("mRoom");
            }
            User user = liveRoomStruct2.owner;
            LiveRoomStruct liveRoomStruct3 = this.f96762aU;
            if (liveRoomStruct3 == null) {
                C52711k.m112237a("mRoom");
            }
            user.roomId = liveRoomStruct3.f79734id;
            mo64778e();
            mo64784g();
        }
    }

    /* renamed from: a */
    public void mo77475a(int i, float f, int[] iArr) {
        C52711k.m112240b(iArr, "dstSize");
        iArr[0] = i;
        iArr[1] = iArr[0];
    }

    /* renamed from: a */
    public void mo64760a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            mo77475a((int) (((float) C9432q.m18670a(mo64749N())) - (C9432q.m18687b(mo64749N(), 16.0f) * 2.0f)), 0.0f, iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public C38007x(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        C52711k.m112240b(followFeedLayout, "view");
        C52711k.m112240b(bVar, "provider");
        C52711k.m112240b(jVar, "scrollStateManager");
        C52711k.m112240b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        View findViewById = this.itemView.findViewById(R.id.b7p);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.…follow_feed_live_content)");
        this.f96765aX = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.azj);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_cover)");
        this.f96766aY = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.bft);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.ll_live_tag_container)");
        this.f96767aZ = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.dd4);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.tv_online_count)");
        this.f96768ba = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.agy);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.….fl_enter_live_container)");
        this.f96769bb = findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.d9y);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.tv_enter_live)");
        this.f96770bc = (TextView) findViewById6;
    }
}
