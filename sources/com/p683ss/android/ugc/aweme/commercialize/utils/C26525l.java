package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2629a.C52555ag;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.l */
public final class C26525l {

    /* renamed from: a */
    public static final C26525l f69855a = new C26525l();

    /* renamed from: b */
    private static final Set<Integer> f69856b = C52555ag.m112063a(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(10), Integer.valueOf(6), Integer.valueOf(11), Integer.valueOf(7));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.l$a */
    public interface C26526a {

        /* renamed from: a */
        public static final C26527a f69857a = C26527a.f69859b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.l$a$a */
        public static final class C26527a {

            /* renamed from: a */
            static final int f69858a = 1;

            /* renamed from: b */
            static final /* synthetic */ C26527a f69859b = new C26527a();

            private C26527a() {
            }
        }
    }

    private C26525l() {
    }

    /* renamed from: c */
    public static final boolean m64174c(Aweme aweme) {
        if (m64171a(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final int m64176e(Aweme aweme) {
        CardStruct a = m64171a(aweme);
        if (a != null) {
            return a.getShowDuration();
        }
        return -1;
    }

    /* renamed from: a */
    public static final CardStruct m64171a(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Map cardInfos = awemeRawAd.getCardInfos();
                if (cardInfos != null) {
                    return (CardStruct) cardInfos.get("3");
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final CardStruct m64173b(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Map cardInfos = awemeRawAd.getCardInfos();
                if (cardInfos != null) {
                    return (CardStruct) cardInfos.get("4");
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final long m64178g(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (m64177f(aweme)) {
            return 240;
        }
        return 200;
    }

    /* renamed from: d */
    public static final boolean m64175d(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        boolean z;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (awemeRawAd != null && awemeRawAd.getAnimationType() == 2) {
            String webUrl = awemeRawAd.getWebUrl();
            if (webUrl != null) {
                if (webUrl.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final void m64179h(Aweme aweme) {
        if (aweme != null) {
            CardStruct b = m64173b(aweme);
            if (b != null && b.getCardType() == 1001) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    Map cardInfos = awemeRawAd.getCardInfos();
                    if (cardInfos != null) {
                        cardInfos.remove("4");
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static final boolean m64177f(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        C52711k.m112240b(aweme, "aweme");
        CardStruct s = C26503d.m64076s(aweme);
        if (s == null) {
            return false;
        }
        if (s.getCardStyle() == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean contains = f69856b.contains(Integer.valueOf(s.getCardType()));
        if (s.getCardStyle() == 2 && s.getDynamicType() == C26527a.f69858a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (s.getCardType() != 4 || s.getCardStyle() == 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((!z || !contains) && !z2 && !z3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m64170a(CardStruct cardStruct, View view) {
        Integer num;
        C52711k.m112240b(view, "container");
        if (cardStruct != null) {
            num = Integer.valueOf(cardStruct.getCardType());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return C23728o.m58241a(278.0d);
        }
        if (num != null && num.intValue() == 9) {
            return C23728o.m58241a(342.0d);
        }
        if (num != null && num.intValue() == 8) {
            return C23728o.m58241a(295.0d);
        }
        return view.getHeight();
    }

    /* renamed from: a */
    public static final void m64172a(Context context, Aweme aweme, ViewGroup viewGroup) {
        int i;
        if (context != null && aweme != null && viewGroup != null) {
            if (!C22453b.m55505a().f60473k || (C26512f.m64070m(aweme) && !C26512f.m64119U(aweme))) {
                i = 0;
            } else {
                C22453b a = C22453b.m55505a();
                C52711k.m112236a((Object) a, "AdaptationManager.getInstance()");
                i = -a.mo46745b();
            }
            int a2 = i + C23729p.m58247a(context, (int) R.dimen.bk);
            C52711k.m112236a((Object) C22453b.m55505a(), "AdaptationManager.getInstance()");
            if (C22453b.m55510c()) {
                a2 += C22453b.f60461a;
            }
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (C26512f.m64115Q(aweme)) {
                    marginLayoutParams.bottomMargin = a2 + C23729p.m58247a(context, (int) R.dimen.yh);
                } else {
                    marginLayoutParams.bottomMargin = a2;
                }
                if (aweme.isHotSearchAweme() || aweme.isHotVideoAweme() || aweme.isMixAweme()) {
                    marginLayoutParams.bottomMargin += C32464b.m75163a(context, 32.0f);
                }
                viewGroup.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
