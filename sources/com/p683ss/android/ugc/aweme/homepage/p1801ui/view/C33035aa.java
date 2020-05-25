package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.feed.api.C30152j;
import com.p683ss.android.ugc.aweme.feed.experiment.C30225e;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30327ar;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.aa */
final /* synthetic */ class C33035aa implements C1710e {

    /* renamed from: a */
    private final MainTabStrip f85826a;

    C33035aa(MainTabStrip mainTabStrip) {
        this.f85826a = mainTabStrip;
    }

    public final void accept(Object obj) {
        CircleImageView circleImageView;
        CircleImageView circleImageView2;
        CircleImageView circleImageView3;
        CircleImageView circleImageView4;
        MainTabStrip mainTabStrip = this.f85826a;
        C30152j jVar = (C30152j) obj;
        if (!mainTabStrip.f85802z || !mainTabStrip.f85763A || mainTabStrip.f85777a.getCurrentItemCompat() != 1 || jVar.getCode() != 0 || jVar.getFollowingInterestUsers() == null || jVar.getFollowingInterestUsers().isEmpty()) {
            mainTabStrip.f85801y = false;
            return;
        }
        mainTabStrip.f85801y = true;
        List followingInterestUsers = jVar.getFollowingInterestUsers();
        mainTabStrip.f85764B = "";
        CircleImageView circleImageView5 = null;
        if (C30225e.m70971c() == 1) {
            if (!followingInterestUsers.isEmpty()) {
                circleImageView3 = MainTabStrip.m75955a(mainTabStrip.f85783g, (C30151i) followingInterestUsers.get(0));
                mainTabStrip.f85764B = ((C30151i) followingInterestUsers.get(0)).getUser().getUid();
            } else {
                mainTabStrip.f85783g.setVisibility(8);
                circleImageView3 = null;
            }
            if (followingInterestUsers.size() >= 2) {
                circleImageView4 = MainTabStrip.m75955a(mainTabStrip.f85784h, (C30151i) followingInterestUsers.get(1));
            } else {
                mainTabStrip.f85784h.setVisibility(8);
                circleImageView4 = null;
            }
            if (followingInterestUsers.size() >= 3) {
                circleImageView5 = MainTabStrip.m75955a(mainTabStrip.f85785i, (C30151i) followingInterestUsers.get(2));
            } else {
                mainTabStrip.f85785i.setVisibility(8);
            }
            mainTabStrip.f85780d.setVisibility(8);
            mainTabStrip.f85782f.setVisibility(0);
            MainTabStrip.m75958a(circleImageView3, circleImageView4, circleImageView5);
            mainTabStrip.post(new C33080t(mainTabStrip));
        } else {
            if (!followingInterestUsers.isEmpty()) {
                circleImageView = MainTabStrip.m75955a(mainTabStrip.f85787k, (C30151i) followingInterestUsers.get(0));
                mainTabStrip.f85764B = ((C30151i) followingInterestUsers.get(0)).getUser().getUid();
            } else {
                mainTabStrip.f85787k.setVisibility(8);
                circleImageView = null;
            }
            if (followingInterestUsers.size() >= 2) {
                circleImageView2 = MainTabStrip.m75955a(mainTabStrip.f85788l, (C30151i) followingInterestUsers.get(1));
            } else {
                mainTabStrip.f85788l.setVisibility(8);
                circleImageView2 = null;
            }
            if (followingInterestUsers.size() >= 3) {
                circleImageView5 = MainTabStrip.m75955a(mainTabStrip.f85789m, (C30151i) followingInterestUsers.get(2));
            } else {
                mainTabStrip.f85789m.setVisibility(8);
            }
            mainTabStrip.f85800x = new C33030a(mainTabStrip.getContext(), followingInterestUsers, jVar.getVideoNum());
            mainTabStrip.f85800x.getContentView().setOnClickListener(new C33081u(mainTabStrip));
            mainTabStrip.f85800x.setOnDismissListener(new C33082v(mainTabStrip, circleImageView, circleImageView2, circleImageView5));
            mainTabStrip.f85800x.mo69996a(mainTabStrip.f85780d);
        }
        C26890h.m65011a("homepage_follow_notice", C23089d.m56640a().mo47829a("notice_type", "head").mo47829a("action_type", "show").mo47829a("to_user_id", mainTabStrip.f85764B).f61491a);
        C47718bf.m103288a(new C30327ar(String.valueOf(jVar.getFirstVid())));
    }
}
