package com.p683ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42255a;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42257b;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42259c;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42261d;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42263e;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42267g;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42273j;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42275k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42277l;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42279m;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42281n;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42283o;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42285p;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42287q;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42289r;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42291s;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42293t;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42295u;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42297v;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42299w;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42305z;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a */
public final class C42044a {

    /* renamed from: a */
    public static final C42045a f106431a = new C42045a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a */
    public static final class C42045a {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a$a$a */
        public static final class C42046a implements C42309a {

            /* renamed from: a */
            final /* synthetic */ Activity f106432a;

            /* renamed from: a */
            public final Activity mo60818a() {
                if (this.f106432a != null) {
                    return this.f106432a;
                }
                return C11016e.m22312g();
            }

            C42046a(Activity activity) {
                this.f106432a = activity;
            }
        }

        private C42045a() {
        }

        public /* synthetic */ C42045a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C42307b m92010a(String str, Activity activity) {
            C42046a aVar = new C42046a(activity);
            if (str != null) {
                switch (str.hashCode()) {
                    case -1837180097:
                        if (str.equals("whatsapp_status")) {
                            return new C42303y(R.drawable.aoo);
                        }
                        break;
                    case -1436108013:
                        if (str.equals("messenger")) {
                            return new C42281n(aVar);
                        }
                        break;
                    case -1374807695:
                        if (str.equals("naver_blog")) {
                            return new C42285p();
                        }
                        break;
                    case -1374788756:
                        if (str.equals("naver_cafe")) {
                            return new C42287q();
                        }
                        break;
                    case -1194195335:
                        if (str.equals("kakao_story")) {
                            return new C42275k();
                        }
                        break;
                    case -916346253:
                        if (str.equals("twitter")) {
                            return new C42295u();
                        }
                        break;
                    case -816556504:
                        if (str.equals("instagram_story")) {
                            return new C42273j();
                        }
                        break;
                    case 3765:
                        if (str.equals("vk")) {
                            return new C42299w();
                        }
                        break;
                    case 97325:
                        if (str.equals("bbm")) {
                            return new C42257b();
                        }
                        break;
                    case 114009:
                        if (str.equals("sms")) {
                            return new C42289r();
                        }
                        break;
                    case 3016245:
                        if (str.equals("band")) {
                            return new C42255a("www.tiktokv.com");
                        }
                        break;
                    case 3321844:
                        if (str.equals("line")) {
                            return new C42279m();
                        }
                        break;
                    case 3357525:
                        if (str.equals("more")) {
                            String string = C42150c.m92517a().getString(R.string.bd4);
                            C52711k.m112236a((Object) string, "chaosContext().getString…string.i18n_share_system)");
                            return new C42293t(string);
                        }
                        break;
                    case 3731178:
                        if (str.equals("zalo")) {
                            return new C42305z();
                        }
                        break;
                    case 28903346:
                        if (str.equals("instagram")) {
                            return new C42271i();
                        }
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            return new C42259c();
                        }
                        break;
                    case 100319648:
                        if (str.equals("imgur")) {
                            return new C42267g();
                        }
                        break;
                    case 112200956:
                        if (str.equals("viber")) {
                            return new C42297v();
                        }
                        break;
                    case 284397090:
                        if (str.equals("snapchat")) {
                            return new C42291s();
                        }
                        break;
                    case 486515695:
                        if (str.equals("kakaotalk")) {
                            return new C42277l();
                        }
                        break;
                    case 497130182:
                        if (str.equals("facebook")) {
                            return new C42261d(aVar);
                        }
                        break;
                    case 628073050:
                        if (str.equals("messenger_lite")) {
                            return new C42283o();
                        }
                        break;
                    case 1620810375:
                        if (str.equals("facebook_lite")) {
                            return new C42263e();
                        }
                        break;
                    case 1934780818:
                        if (str.equals("whatsapp")) {
                            return new C42301x();
                        }
                        break;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final C42307b m92009a(String str, Activity activity) {
        return C42045a.m92010a(str, activity);
    }
}
