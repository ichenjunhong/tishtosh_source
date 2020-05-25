package com.p683ss.android.ugc.aweme.newfollow.p1995b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeDetailActivity;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;

/* renamed from: com.ss.android.ugc.aweme.newfollow.b.b */
public final class C37852b {

    /* renamed from: com.ss.android.ugc.aweme.newfollow.b.b$a */
    public interface C37853a {
        /* renamed from: a */
        void mo77296a();
    }

    /* renamed from: a */
    private static boolean m84504a(Aweme aweme, String str) {
        if (aweme.getAuthor() == null || aweme.getAuthor().getFollowStatus() != 0 || !"homepage_follow".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m84505b(View view, View view2, Aweme aweme, String str) {
        return C37849a.m84496a(view, view2, aweme, str);
    }

    /* renamed from: a */
    public static boolean m84501a(View view, View view2, Aweme aweme, String str) {
        String str2;
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null || aweme.getMusic() == null) {
            return false;
        }
        if (!MusicService.createIMusicServicebyMonsterPlugin().checkValidMusic(aweme.getMusic().convertToMusicModel(), view.getContext(), true)) {
            C26890h.m65011a("enter_music_detail_failed", new C23089d().mo47829a("group_id", "").mo47829a("author_id", "").mo47829a("music_id", aweme.getMusic().getMid()).mo47829a("enter_from", "video_at").f61491a);
            return false;
        }
        Context context = view.getContext();
        C41302w a = C41302w.m91042a();
        Activity activity = (Activity) context;
        StringBuilder sb = new StringBuilder("aweme://music/detail/");
        sb.append(aweme.getMusic().getMid());
        C41311y a2 = C41311y.m91065a(sb.toString()).mo83870a("process_id", str);
        String str3 = "aweme_id";
        if (!TextUtils.isEmpty(aweme.getAid())) {
            str2 = aweme.getAid();
        } else {
            str2 = "";
        }
        a.mo83858a(activity, a2.mo83870a(str3, str2).mo83871a());
        return true;
    }

    /* renamed from: b */
    public static boolean m84506b(Aweme aweme, User user, Activity activity, String str) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        }
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(user.getUid());
        C41311y a = C41311y.m91065a(sb.toString());
        a.mo83870a("enter_from", str);
        a.mo83870a("sec_user_id", user.getSecUid());
        if (m84504a(aweme, str)) {
            a.mo83870a("extra_previous_page_position", "content_card_button");
        } else {
            a.mo83870a("extra_previous_page_position", "main_head");
        }
        String str2 = "";
        if (aweme != null && !TextUtils.isEmpty(aweme.getRequestId())) {
            str2 = aweme.getRequestId();
        } else if (!TextUtils.isEmpty(user.getRequestId())) {
            str2 = user.getRequestId();
        }
        a.mo83870a("enter_from_request_id", str2);
        if (C26503d.m64061d(aweme) && TextUtils.equals(str, "general_search")) {
            a.mo83870a("source_aid", aweme.getAid());
        }
        C41302w.m91042a().mo83858a(activity, a.mo83871a());
        return true;
    }

    /* renamed from: a */
    public static boolean m84503a(Aweme aweme, User user, Activity activity, String str) {
        String str2;
        if (aweme == null) {
            return false;
        }
        if (C31753a.m73740a(user)) {
            if (TextUtils.equals(str, "challenge")) {
                str2 = "challenge";
            } else if (TextUtils.equals(str, "general_search")) {
                str2 = "general_search";
            } else {
                str2 = "homepage_follow";
            }
            C36006a aVar = new C36006a(activity, user);
            aVar.mo74739b(str2);
            aVar.mo74740c("video_head");
            C36173w.m81665a().getLiveWatcherUtils().mo70097a(aVar);
            return true;
        } else if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(user.getUid());
            C41311y a = C41311y.m91065a(sb.toString());
            a.mo83870a("enter_from", str);
            a.mo83870a("sec_user_id", user.getSecUid());
            a.mo83870a("enter_from_request_id", aweme.getRequestId());
            if (m84504a(aweme, str)) {
                a.mo83870a("extra_previous_page_position", "content_card_button");
            } else {
                a.mo83870a("extra_previous_page_position", "main_head");
            }
            if (C26503d.m64061d(aweme) && TextUtils.equals(str, "general_search")) {
                a.mo83870a("source_aid", aweme.getAid());
            }
            C41302w.m91042a().mo83858a(activity, a.mo83871a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m84502a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme, String str) {
        if (view == null || view2 == null || textExtraStruct == null) {
            return false;
        }
        if (textExtraStruct.getType() == 1) {
            C26403au.m63863a(textExtraStruct);
            ChallengeDetailActivity.m60063a(view.getContext(), aweme.getAid(), textExtraStruct.getHashTagName(), str, 0, true);
        } else {
            C41302w a = C41302w.m91042a();
            Activity activity = (Activity) view2.getContext();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", textExtraStruct.getSecUid()).mo83870a("profile_from", "video_at").mo83870a("video_id", aweme.getAid()).mo83868a("profile_enterprise_type", aweme.getEnterpriseType()).mo83871a());
        }
        return true;
    }
}
