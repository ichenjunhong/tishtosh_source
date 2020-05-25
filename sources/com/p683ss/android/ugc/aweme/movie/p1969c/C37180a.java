package com.p683ss.android.ugc.aweme.movie.p1969c;

import android.text.TextUtils;
import android.view.View.OnClickListener;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.movie.experiment.MovieDetailExperiment;
import com.p683ss.android.ugc.aweme.movie.view.FeedMvTagView;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C43895j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.movie.c.a */
public final class C37180a {

    /* renamed from: e */
    public static final C37181a f94910e = new C37181a(null);

    /* renamed from: a */
    public FeedMvTagView f94911a;

    /* renamed from: b */
    public Aweme f94912b;

    /* renamed from: c */
    public String f94913c;

    /* renamed from: d */
    public JSONObject f94914d;

    /* renamed from: com.ss.android.ugc.aweme.movie.c.a$a */
    public static final class C37181a {
        private C37181a() {
        }

        public /* synthetic */ C37181a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m83421a(Aweme aweme) {
            String str;
            C52711k.m112240b(aweme, "aweme");
            if (aweme.getUploadMiscInfoStruct() != null) {
                C43895j uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct != null) {
                    str = uploadMiscInfoStruct.mvThemeId;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && C10181b.m20511a().mo18172a(MovieDetailExperiment.class, true, "mv_theme_mode_switch", 31744, true)) {
                    int i = aweme.getUploadMiscInfoStruct().mvType;
                    int mvPlan = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().getMvPlan();
                    if (i != 1 || mvPlan >= 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.c.a$b */
    static final class C37182b<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C37180a f94915a;

        /* renamed from: b */
        final /* synthetic */ String f94916b;

        /* renamed from: c */
        final /* synthetic */ LogPbBean f94917c;

        /* renamed from: d */
        final /* synthetic */ Aweme f94918d;

        C37182b(C37180a aVar, String str, LogPbBean logPbBean, Aweme aweme) {
            this.f94915a = aVar;
            this.f94916b = str;
            this.f94917c = logPbBean;
            this.f94918d = aweme;
        }

        public final /* synthetic */ Object call() {
            C26890h.m65012a(this.f94916b, new C26898j().mo54849a("log_pb", C29981aa.m70153a().mo60160a(this.f94917c)).mo54849a("author_id", this.f94918d.getAuthorUid()).mo54849a("group_id", this.f94918d.getAid()).mo54849a("enter_from", this.f94915a.f94913c).mo54849a("mv_id", this.f94918d.getUploadMiscInfoStruct().mvThemeId).mo54849a("anchor_type", "mv_page").mo54850a());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.c.a$c */
    public static final class C37183c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37180a f94919a;

        /* renamed from: b */
        final /* synthetic */ Aweme f94920b;

        public C37183c(C37180a aVar, Aweme aweme) {
            this.f94919a = aVar;
            this.f94920b = aweme;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
            if (r2 == null) goto L_0x0053;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r5)
                com.ss.android.ugc.aweme.movie.c.a r5 = r4.f94919a
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f94920b
                com.ss.android.ugc.aweme.shortvideo.j r0 = r0.getUploadMiscInfoStruct()
                if (r0 == 0) goto L_0x0010
                java.lang.String r0 = r0.mvThemeId
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0073
                com.ss.android.ugc.aweme.movie.view.FeedMvTagView r1 = r5.f94911a
                if (r1 == 0) goto L_0x0073
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f94912b
                if (r2 == 0) goto L_0x0027
                java.lang.String r3 = "anchor_entrance_click"
                r5.mo76503a(r2, r3)
            L_0x0027:
                android.content.Context r1 = r1.getContext()
                java.lang.String r2 = "//movie/detail"
                com.bytedance.router.SmartRoute r1 = com.bytedance.router.SmartRouter.buildRoute(r1, r2)
                java.lang.String r2 = "mv_id"
                if (r0 != 0) goto L_0x0037
                java.lang.String r0 = ""
            L_0x0037:
                com.bytedance.router.SmartRoute r0 = r1.withParam(r2, r0)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = r5.f94913c
                if (r2 != 0) goto L_0x0043
                java.lang.String r2 = ""
            L_0x0043:
                com.bytedance.router.SmartRoute r0 = r0.withParam(r1, r2)
                java.lang.String r1 = "group_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f94912b
                if (r2 == 0) goto L_0x0053
                java.lang.String r2 = r2.getAid()
                if (r2 != 0) goto L_0x0055
            L_0x0053:
                java.lang.String r2 = ""
            L_0x0055:
                com.bytedance.router.SmartRoute r0 = r0.withParam(r1, r2)
                java.lang.String r1 = "type"
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.f94912b
                if (r5 == 0) goto L_0x0068
                com.ss.android.ugc.aweme.shortvideo.j r5 = r5.getUploadMiscInfoStruct()
                if (r5 == 0) goto L_0x0068
                int r5 = r5.mvType
                goto L_0x0069
            L_0x0068:
                r5 = 0
            L_0x0069:
                com.bytedance.router.SmartRoute r5 = r0.withParam(r1, r5)
                r0 = 10086(0x2766, float:1.4133E-41)
                r5.open(r0)
                return
            L_0x0073:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.movie.p1969c.C37180a.C37183c.onClick(android.view.View):void");
        }
    }

    public C37180a(FeedMvTagView feedMvTagView) {
        this.f94911a = feedMvTagView;
    }

    /* renamed from: a */
    public final void mo76503a(Aweme aweme, String str) {
        String str2;
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventName");
        if (this.f94914d == null) {
            str2 = "";
        } else {
            JSONObject jSONObject = this.f94914d;
            if (jSONObject != null) {
                str2 = jSONObject.optString("request_id");
            } else {
                str2 = null;
            }
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str2);
        C0013i.m18a((Callable<TResult>) new C37182b<TResult>(this, str, logPbBean, aweme), (Executor) C26890h.m65003a());
    }
}
