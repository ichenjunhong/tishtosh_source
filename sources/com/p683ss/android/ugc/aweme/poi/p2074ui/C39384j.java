package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.uikit.base.C11079a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31769a;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.forward.p1775c.C32385a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32403c;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e.C38974a;
import com.p683ss.android.ugc.aweme.poi.model.C39105ak;
import com.p683ss.android.ugc.aweme.poi.model.C39136t;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.j */
public class C39384j<M extends C39140x> extends C31769a<M, C39387k> {

    /* renamed from: o */
    protected C39386a f100739o;

    /* renamed from: p */
    private String f100740p = "poi_page";

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.j$a */
    public interface C39386a {
        /* renamed from: C */
        C38974a mo80011C();

        /* renamed from: D */
        C31846h mo80012D();

        /* renamed from: a */
        boolean mo80023a(PoiDetail poiDetail);

        /* renamed from: f */
        boolean mo80027f();

        /* renamed from: g */
        String mo80028g();

        /* renamed from: i */
        int mo80030i();

        /* renamed from: j */
        C11079a mo80031j();

        /* renamed from: k */
        void mo80032k();

        /* renamed from: p */
        void mo80039p();

        /* renamed from: q */
        void mo80040q();

        /* renamed from: v */
        String mo80351v();

        /* renamed from: w */
        int mo63442w();

        /* renamed from: x */
        String mo63443x();
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return "poi_page";
    }

    /* renamed from: j */
    public final String mo51789j() {
        return this.f100740p;
    }

    /* renamed from: q */
    public final Fragment mo64727q() {
        return this.f100739o.mo80031j();
    }

    /* renamed from: u */
    public C39136t mo80092u() {
        return ((C39140x) this.f70700f).mo79785c();
    }

    /* renamed from: e */
    public final String mo64715e() {
        if (this.f100739o != null) {
            return ((AbsPoiAwemeFeedFragment) this.f100739o.mo80031j()).mo63443x();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo77307s() {
        C39105ak b = ((C39140x) this.f70700f).mo79783b();
        if (b == null || b.getException() != null || !mo80091t()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo80091t() {
        C39136t c = ((C39140x) this.f70700f).mo79785c();
        if (c == null || !c.isValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo44838b() {
        if (this.f70700f != null && this.f70701g != null && ((C39387k) this.f70701g).isViewValid()) {
            if (this.f100739o != null) {
                if (mo77307s()) {
                    this.f100739o.mo80032k();
                }
                if (mo64727q().getActivity() != null) {
                    mo80088a(mo64727q().getActivity());
                }
            }
            int i = ((C39140x) this.f70700f).mListQueryType;
            boolean z = false;
            if (i != 1) {
                switch (i) {
                    case 4:
                    case 5:
                        C39387k kVar = (C39387k) this.f70701g;
                        List items = ((C39140x) this.f70700f).getItems();
                        if (((C39140x) this.f70700f).isHasMore() && !((C39140x) this.f70700f).isNewDataEmpty()) {
                            z = true;
                        }
                        kVar.mo64883b(items, z);
                        break;
                }
            } else if (!((C39140x) this.f70700f).isDataEmpty()) {
                if (this.f100739o != null) {
                    this.f100739o.mo80040q();
                    List items2 = ((C39140x) this.f70700f).getItems();
                    if (!C9376b.m18558a((Collection<T>) items2)) {
                        C37859b bVar = (C37859b) items2.get(0);
                        if (bVar instanceof PoiDetail) {
                            PoiDetail poiDetail = (PoiDetail) bVar;
                            this.f100739o.mo80023a(poiDetail);
                            ((C39387k) this.f70701g).mo80353a(poiDetail);
                        }
                    }
                }
                ((C39387k) this.f70701g).mo64876a(((C39140x) this.f70700f).getItems(), ((C39140x) this.f70700f).isHasMore());
            } else if (((C39140x) this.f70700f).isHasMore()) {
                ((C39387k) this.f70701g).mo64861a(1);
            } else {
                ((C39387k) this.f70701g).mo64861a(3);
            }
        }
    }

    public C39384j(C39386a aVar) {
        if (aVar != null) {
            this.f100739o = aVar;
            return;
        }
        throw new IllegalArgumentException("PoiAwemeFeedPresenter should be attached to any Fragment");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80088a(Activity activity) {
        if (((C39140x) this.f70700f).getData() != null) {
            C39105ak b = ((C39140x) this.f70700f).mo79783b();
            if (b != null && b.getException() != null) {
                C22971a.m56493a((Context) activity, (Throwable) b.getException());
            }
        }
    }

    @C53771m
    public void onEvent(C32385a aVar) {
        String str;
        if (aVar != null && aVar.f84279d == 1) {
            if (aVar.f84280e == hashCode()) {
                C32403c e = C23794bh.m58391e();
                String str2 = "poi_page";
                Aweme aweme = aVar.f84278c;
                String str3 = "list";
                if (this.f82972l) {
                    str = "click_repost_button";
                } else {
                    str = "click_comment";
                }
                e.mo65594a(str2, aweme, str3, str, true);
            }
            if (this.f82969i != null) {
                this.f82969i.mo51249j();
            }
        }
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        if (this.f70700f != null && this.f70701g != null && ((C39387k) this.f70701g).isViewValid()) {
            ((C39387k) this.f70701g).mo64877a(false);
            int i = ((C39140x) this.f70700f).mListQueryType;
            if (i != 1) {
                switch (i) {
                    case 4:
                        ((C39387k) this.f70701g).mo64885b(1);
                        return;
                    case 5:
                        ((C39387k) this.f70701g).mo64885b(5);
                        break;
                }
                return;
            }
            ((C39387k) this.f70701g).mo64861a(1);
        }
    }

    /* renamed from: a */
    public final void mo64703a(View view, Aweme aweme) {
        super.mo64703a(view, aweme);
        C23794bh.m58392f().mo64991a(aweme, "poi_page", "list");
    }

    /* renamed from: a */
    public final void mo64658a(Context context, Aweme aweme) {
        if (this.f82964b != null) {
            this.f82964b.mo52904a(new C30332aw(41, aweme), mo60874g(true));
        }
    }

    /* renamed from: a */
    public final void mo80349a(final RelativeLayout relativeLayout, final View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(300);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                relativeLayout.removeView(view);
                Keva repo = Keva.getRepo("poi_repo");
                if (repo != null) {
                    repo.storeLong("collect_display_latest_time", System.currentTimeMillis());
                }
            }
        });
        animatorSet.start();
    }

    /* renamed from: b */
    public final void mo64667b(View view, View view2, Aweme aweme) {
        if (aweme != null) {
            ((C39387k) this.f70701g).mo64878a(true, aweme);
            if (this.f82964b != null) {
                this.f82964b.mo52906b(new C30332aw(24, aweme), "click_video_tag", "video_cart_tag", this.f100740p);
                C23794bh.m58392f().mo65007d(aweme, "poi_page");
            }
        }
    }

    /* renamed from: a */
    public final void mo64708a(Aweme aweme, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            C41302w a = C41302w.m91042a();
            FragmentActivity activity = mo64727q().getActivity();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(aweme.getAuthorUid());
            a.mo83858a((Activity) activity, C41311y.m91065a(sb.toString()).mo83870a("enter_from", "poi_page").mo83870a("sec_user_id", str2).mo83871a());
            C23794bh.m58392f().mo65002b(aweme, "click_comment_head", str);
        }
    }

    /* renamed from: a */
    public final void mo64660a(View view, View view2, Aweme aweme, User user) {
        if (C31781d.m73924c().mo64697a(aweme, user, mo64728r(), mo60874g(true))) {
            if (C31753a.m73740a(user)) {
                C23794bh.m58392f().mo65004c(aweme);
                return;
            }
            C23794bh.m58392f().mo65002b(aweme, "click_head", C23198ae.m56848a(user));
        }
    }

    /* renamed from: b */
    public final void mo64668b(View view, View view2, Aweme aweme, User user) {
        if (C31781d.m73924c().mo64701b(aweme, user, mo64728r(), mo60874g(true))) {
            C23794bh.m58392f().mo65002b(aweme, "click_name", C23198ae.m56848a(user));
        }
    }
}
