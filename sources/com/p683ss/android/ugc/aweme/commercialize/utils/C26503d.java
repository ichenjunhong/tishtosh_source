package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.commerce.C25507c;
import com.p683ss.android.ugc.aweme.commerce.C25514f;
import com.p683ss.android.ugc.aweme.commerce.model.C25516b;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47934o;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.d */
public class C26503d {

    /* renamed from: a */
    static final /* synthetic */ boolean f69813a = (!C26503d.class.desiredAssertionStatus());

    /* renamed from: a */
    public static boolean m64058a(String str) {
        return false;
    }

    /* renamed from: a */
    public static C25514f m64054a(User user) {
        if (user == null) {
            return null;
        }
        C25507c commerceInfo = user.getCommerceInfo();
        if (commerceInfo == null) {
            return null;
        }
        return commerceInfo.getSmartPhone();
    }

    /* renamed from: c */
    public static final boolean m64060c(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m64061d(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final AwemeRawAd m64068k(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return aweme.getAwemeRawAd();
        }
        return null;
    }

    /* renamed from: l */
    public static final AwemeSplashInfo m64069l(Aweme aweme) {
        AwemeRawAd k = m64068k(aweme);
        if (k == null) {
            return null;
        }
        return k.getSplashInfo();
    }

    /* renamed from: o */
    public static final boolean m64072o(Aweme aweme) {
        AwemeSplashInfo l = m64069l(aweme);
        if (l == null) {
            return false;
        }
        return l.isShown();
    }

    /* renamed from: r */
    public static final float m64075r(Aweme aweme) {
        AwemeSplashInfo l = m64069l(aweme);
        if (l == null) {
            return 0.0f;
        }
        return l.getSplashShowTime();
    }

    /* renamed from: y */
    public static final boolean m64082y(Aweme aweme) {
        if (m64076s(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public static final CardStruct m64049A(Aweme aweme) {
        AwemeRawAd k = m64068k(aweme);
        if (k == null) {
            return null;
        }
        Map cardInfos = k.getCardInfos();
        if (cardInfos == null) {
            return null;
        }
        return (CardStruct) cardInfos.get("4");
    }

    /* renamed from: B */
    public static final boolean m64050B(Aweme aweme) {
        if (!m64061d(aweme) || !aweme.getAwemeRawAd().isContextTrackSent()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static final boolean m64051C(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAdType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m64062e(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || !m64057a(aweme) || aweme.getAwemeRawAd().getAdAvatarLinkTagStyle() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m64063f(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static final boolean m64064g(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m64065h(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final boolean m64066i(Aweme aweme) {
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getAdSource() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m64067j(Aweme aweme) {
        if (!m64064g(aweme) || aweme.getAwemeRawAd().getDisableFollowToClick() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final boolean m64070m(Aweme aweme) {
        AwemeSplashInfo l = m64069l(aweme);
        if (l != null && !TextUtils.isEmpty(l.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m64071n(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C26138s a = C26428bm.m63902a(aweme);
        if (a != null && a.feedShowType == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m64073p(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return aweme.getAwemeRawAd().isShowAdAfterInteraction();
    }

    /* renamed from: q */
    public static final int m64074q(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return 0;
        }
        return aweme.getAwemeRawAd().getInteractionSeconds();
    }

    /* renamed from: s */
    public static final CardStruct m64076s(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDefaultCardInfo();
    }

    /* renamed from: t */
    public static final String m64077t(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getDownloadUrl();
    }

    /* renamed from: w */
    public static final boolean m64080w(Aweme aweme) {
        if (aweme != null && aweme.isAd() && !m64064g(aweme)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static final boolean m64081x(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAnimationType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static final boolean m64083z(Aweme aweme) {
        if (aweme == null || (!m64081x(aweme) && !m64082y(aweme) && !C47934o.m103707a(aweme) && m64049A(aweme) == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m64053E(Aweme aweme) {
        if (aweme == null || !aweme.isAppAd()) {
            return false;
        }
        if (!f69813a && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getLightWebUrl())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m64059b(Aweme aweme) {
        if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        }
        C25516b activityPendant = aweme.getActivityPendant();
        UrlModel image = activityPendant.getImage();
        if (image == null || C9376b.m18558a((Collection<T>) image.getUrlList())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static final String m64078u(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return C23723j.m58217a().getString(R.color.ss);
        }
        String learnMoreBgColor = aweme.getAwemeRawAd().getLearnMoreBgColor();
        if (TextUtils.isEmpty(learnMoreBgColor)) {
            return C23723j.m58217a().getString(R.color.ss);
        }
        return learnMoreBgColor;
    }

    /* renamed from: v */
    public static final boolean m64079v(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        if (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static final Boolean m64052D(Aweme aweme) {
        if (aweme == null) {
            return Boolean.valueOf(false);
        }
        if (!aweme.isAd()) {
            return Boolean.valueOf(false);
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.isEmpty(awemeRawAd.getAuthorUrl())) {
            return Boolean.valueOf(false);
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return Boolean.valueOf(false);
        }
        Uri parse = Uri.parse(openUrl);
        if (parse.getScheme() == null) {
            return Boolean.valueOf(false);
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if ((C23057c.f61423a.equals(lowerCase) || C23057c.f61425c.equals(lowerCase)) && !C36949e.m83168d(parse.toString())) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(C25945k.m62914e().mo53195a(openUrl));
    }

    /* renamed from: a */
    public static final boolean m64057a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return true;
        }
        return author.isAdFake();
    }

    /* renamed from: a */
    private static Aweme m64055a(List<Aweme> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (Aweme) list.get(i);
    }

    /* renamed from: a */
    public static final String m64056a(Aweme aweme, List<Aweme> list, int i) {
        Aweme aweme2;
        if (aweme == null || !aweme.isAd() || C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        if (System.currentTimeMillis() % 2 == 0) {
            aweme2 = m64055a(list, i - 1);
        } else {
            aweme2 = m64055a(list, i + 1);
        }
        if (aweme2 == null || !TextUtils.isEmpty(aweme2.getShareUrl())) {
            return null;
        }
        return aweme2.getShareUrl();
    }
}
