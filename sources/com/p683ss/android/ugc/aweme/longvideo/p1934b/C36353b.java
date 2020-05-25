package com.p683ss.android.ugc.aweme.longvideo.p1934b;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.C36367d;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36360e.C36361a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.b */
public final class C36353b {

    /* renamed from: a */
    public static final C36354a f93061a = new C36354a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a */
    public static final class C36354a {

        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a$a */
        public static final class C36355a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Context f93062a;

            /* renamed from: b */
            final /* synthetic */ Aweme f93063b;

            /* renamed from: c */
            final /* synthetic */ String f93064c;

            /* renamed from: d */
            final /* synthetic */ int f93065d;

            public final void onClick(View view) {
                C52711k.m112240b(view, "widget");
                if (!C32800a.m75679a(view)) {
                    C36367d.m82058a(this.f93062a, this.f93063b, this.f93064c, this.f93065d);
                    if (this.f93063b.isAd()) {
                        Context a = C11010c.m22280a();
                        Aweme aweme = this.f93063b;
                        C26088l.m63322b(a, "click_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad label click"));
                    }
                }
            }

            public C36355a(Context context, Aweme aweme, String str, int i) {
                this.f93062a = context;
                this.f93063b = aweme;
                this.f93064c = str;
                this.f93065d = i;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a$b */
        public static final class C36356b extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Context f93066a;

            /* renamed from: b */
            final /* synthetic */ Aweme f93067b;

            /* renamed from: c */
            final /* synthetic */ String f93068c;

            /* renamed from: d */
            final /* synthetic */ int f93069d;

            public final void onClick(View view) {
                C52711k.m112240b(view, "widget");
                if (!C32800a.m75679a(view)) {
                    C36367d.m82058a(this.f93066a, this.f93067b, this.f93068c, this.f93069d);
                }
            }

            public C36356b(Context context, Aweme aweme, String str, int i) {
                this.f93066a = context;
                this.f93067b = aweme;
                this.f93068c = str;
                this.f93069d = i;
            }
        }

        private C36354a() {
        }

        public /* synthetic */ C36354a(C52707g gVar) {
            this();
        }

        /* renamed from: d */
        private static Video m82040d(Aweme aweme) {
            return C36385k.f93161b.mo75308a(aweme);
        }

        /* renamed from: a */
        public static String m82039a(Aweme aweme) {
            if (aweme != null) {
                String aid = aweme.getAid();
                if (aid != null) {
                    return aid;
                }
            }
            return "";
        }

        /* renamed from: b */
        public final boolean mo75269b(Aweme aweme) {
            if (m82040d(aweme) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final String mo75270c(Aweme aweme) {
            int i;
            C36361a aVar = C36360e.f93074a;
            Video d = m82040d(aweme);
            if (d != null) {
                i = d.getDuration() / 1000;
            } else {
                i = 0;
            }
            return aVar.mo75274a(i);
        }
    }

    /* renamed from: a */
    public static final boolean m82038a(Aweme aweme) {
        return f93061a.mo75269b(aweme);
    }
}
