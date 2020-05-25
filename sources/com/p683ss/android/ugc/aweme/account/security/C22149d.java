package com.p683ss.android.ugc.aweme.account.security;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.widget.C1115o;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.security.SafeInfoNoticeApi.C22145a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.security.d */
public final class C22149d extends PopupWindow {

    /* renamed from: h */
    public static final C22150a f59720h = new C22150a(null);

    /* renamed from: a */
    public LinearLayout f59721a;

    /* renamed from: b */
    public DmtTextView f59722b;

    /* renamed from: c */
    public int f59723c;

    /* renamed from: d */
    public String f59724d;

    /* renamed from: e */
    public List<C22147b> f59725e;

    /* renamed from: f */
    public final Context f59726f;

    /* renamed from: g */
    public final View f59727g;

    /* renamed from: i */
    private AutoRTLImageView f59728i;

    /* renamed from: j */
    private boolean f59729j = true;

    /* renamed from: k */
    private String f59730k;

    /* renamed from: l */
    private String f59731l;

    /* renamed from: m */
    private String f59732m;

    /* renamed from: n */
    private SpannableStringBuilder f59733n;

    /* renamed from: o */
    private Boolean f59734o;

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$a */
    public static final class C22150a {
        private C22150a() {
        }

        /* renamed from: a */
        public final boolean mo46229a() {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                if (!g2.isChildrenMode() && Keva.getRepo("account_security_keva_name").getBoolean(m54946a("safe_info_need_show_"), false)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ C22150a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m54946a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            sb.append(g.getCurUserId());
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$b */
    static final class C22151b<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        public static final C22151b f59735a = new C22151b();

        C22151b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$c */
    static final class C22152c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C22152c f59736a = new C22152c();

        C22152c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C17840a.m43754b(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$d */
    static final class C22153d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22149d f59737a;

        C22153d(C22149d dVar) {
            this.f59737a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59737a.mo46227a(this.f59737a.f59724d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$e */
    static final class C22154e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22149d f59738a;

        C22154e(C22149d dVar) {
            this.f59738a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Keva.getRepo("account_security_keva_name").storeBoolean(C22150a.m54946a("safe_info_need_show_"), false);
            this.f59738a.mo46228b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$f */
    static final class C22155f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22149d f59739a;

        C22155f(C22149d dVar) {
            this.f59739a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22149d dVar = this.f59739a;
            List<C22147b> list = this.f59739a.f59725e;
            if (list == null) {
                C52711k.m112234a();
            }
            dVar.mo46227a(((C22147b) list.get(0)).f59718b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$g */
    static final class C22156g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22149d f59740a;

        C22156g(C22149d dVar) {
            this.f59740a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59740a.mo46227a(this.f59740a.f59724d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$h */
    public static final class C22157h implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C22149d f59741a;

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f59741a.f59722b.getViewTreeObserver();
            C52711k.m112236a((Object) viewTreeObserver, "contentTV.viewTreeObserver");
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            if (this.f59741a.f59722b.getLineCount() > 3) {
                LayoutParams layoutParams = this.f59741a.f59721a.getLayoutParams();
                layoutParams.height = (int) C9432q.m18687b(this.f59741a.f59726f, 84.0f);
                this.f59741a.f59721a.setLayoutParams(layoutParams);
                this.f59741a.f59722b.getLayoutParams().height = (int) C9432q.m18687b(this.f59741a.f59726f, 68.0f);
                C1115o.m3257a((TextView) this.f59741a.f59722b, 2, 13, 1, 2);
                this.f59741a.getContentView().measure(0, 0);
                this.f59741a.f59723c = 0;
                this.f59741a.mo46228b();
                this.f59741a.mo46226a();
            }
        }

        C22157h(C22149d dVar) {
            this.f59741a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$i */
    public static final class C22158i extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C22149d f59742a;

        /* renamed from: b */
        final /* synthetic */ C22147b f59743b;

        public final void onClick(View view) {
            C52711k.m112240b(view, "textView");
            List<C22147b> list = this.f59742a.f59725e;
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.size() != 1) {
                this.f59742a.mo46227a(this.f59743b.f59718b);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C0726c.m2098c(this.f59742a.f59726f, R.color.c));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        C22158i(C22149d dVar, C22147b bVar) {
            this.f59742a = dVar;
            this.f59743b = bVar;
        }
    }

    /* renamed from: b */
    public final void mo46228b() {
        try {
            dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo46226a() {
        if (!isShowing()) {
            if (this.f59723c == 0) {
                int[] iArr = new int[2];
                this.f59727g.getLocationOnScreen(iArr);
                getContentView().measure(0, 0);
                int i = iArr[1];
                View contentView = getContentView();
                C52711k.m112236a((Object) contentView, "contentView");
                this.f59723c = i - contentView.getMeasuredHeight();
            }
            showAtLocation(this.f59727g, 0, 0, this.f59723c);
            if (this.f59729j) {
                this.f59729j = false;
                C26890h.m65011a("security_alert_notify", new C23089d().mo47829a("aid", String.valueOf(C11010c.m22289j())).mo47829a("notice_id", this.f59732m).mo47829a("notice_type", this.f59730k).mo47829a("notice_model", this.f59731l).f61491a);
            }
        }
    }

    /* renamed from: c */
    private final void m54942c() {
        if (this.f59733n != null) {
            if (TextUtils.equals(this.f59731l, "can_not_cancel")) {
                this.f59728i.setImageResource(R.drawable.do2);
                this.f59728i.setOnClickListener(new C22153d(this));
            } else {
                this.f59728i.setImageResource(R.drawable.d1z);
                this.f59728i.setOnClickListener(new C22154e(this));
            }
            if (this.f59725e != null) {
                List<C22147b> list = this.f59725e;
                if (list == null) {
                    C52711k.m112234a();
                }
                if (!list.isEmpty()) {
                    List<C22147b> list2 = this.f59725e;
                    if (list2 == null) {
                        C52711k.m112234a();
                    }
                    for (C22147b bVar : list2) {
                        String str = bVar.f59717a;
                        if (str != null) {
                            int b = C52830p.m112446b((CharSequence) String.valueOf(this.f59733n), str, 0, false, 6, (Object) null);
                            if (b != -1) {
                                SpannableStringBuilder spannableStringBuilder = this.f59733n;
                                if (spannableStringBuilder == null) {
                                    C52711k.m112234a();
                                }
                                if (b < spannableStringBuilder.length()) {
                                    int length = str.length() + b;
                                    SpannableStringBuilder spannableStringBuilder2 = this.f59733n;
                                    if (spannableStringBuilder2 == null) {
                                        C52711k.m112234a();
                                    }
                                    if (length <= spannableStringBuilder2.length()) {
                                        C22158i iVar = new C22158i(this, bVar);
                                        SpannableStringBuilder spannableStringBuilder3 = this.f59733n;
                                        if (spannableStringBuilder3 == null) {
                                            C52711k.m112234a();
                                        }
                                        spannableStringBuilder3.setSpan(iVar, b, str.length() + b, 33);
                                    }
                                }
                            }
                        }
                    }
                    this.f59722b.setText(this.f59733n);
                    this.f59722b.setMovementMethod(LinkMovementMethod.getInstance());
                    this.f59722b.setHighlightColor(this.f59726f.getResources().getColor(17170445));
                    List<C22147b> list3 = this.f59725e;
                    if (list3 == null) {
                        C52711k.m112234a();
                    }
                    if (list3.size() == 1) {
                        this.f59722b.setOnClickListener(new C22155f(this));
                    }
                    this.f59722b.getViewTreeObserver().addOnGlobalLayoutListener(new C22157h(this));
                }
            }
            this.f59722b.setText(this.f59733n);
            this.f59722b.setOnClickListener(new C22156g(this));
            this.f59722b.getViewTreeObserver().addOnGlobalLayoutListener(new C22157h(this));
        }
    }

    /* renamed from: a */
    public final void mo46227a(String str) {
        if (this.f59732m != null) {
            SafeInfoNoticeApi a = C22145a.m54941a();
            String str2 = this.f59732m;
            if (str2 == null) {
                C52711k.m112234a();
            }
            String str3 = this.f59730k;
            if (str3 == null) {
                str3 = "";
            }
            a.safeInfoConfirm(str2, str3).mo6152a((C1710e<? super T>) C22151b.f59735a, (C1710e<? super Throwable>) C22152c.f59736a);
            Keva.getRepo("account_security_keva_name").storeBoolean(C22150a.m54946a("safe_info_need_show_"), false);
            mo46228b();
            this.f59729j = true;
        }
        Activity g = C11016e.m22312g();
        if (C52830p.m112407a(this.f59730k, "unbind_email", false, 2, null)) {
            SmartRouter.buildRoute((Context) g, str).withParam("do_not_use_old_style", true).open();
            return;
        }
        if (!(g == null || str == null)) {
            Context context = g;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&notice_id=");
            sb.append(this.f59732m);
            Intent a2 = C27148b.m65482a(context, sb.toString());
            C52711k.m112236a((Object) a2, "CrossPlatformUtil\n      …eme&notice_id=$noticeId\")");
            a2.setClass(context, CrossPlatformActivity.class);
            a2.putExtra("hide_nav_bar", true);
            g.startActivity(a2);
        }
    }

    public C22149d(Context context, View view) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, "anchorView");
        super(context);
        this.f59726f = context;
        this.f59727g = view;
        setContentView(LayoutInflater.from(this.f59726f).inflate(R.layout.bo7, null));
        View findViewById = getContentView().findViewById(R.id.b8m);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.layout_notice)");
        this.f59721a = (LinearLayout) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.f3o);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.tv_notice_content)");
        this.f59722b = (DmtTextView) findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.efb);
        C52711k.m112236a((Object) findViewById3, "contentView.findViewById(R.id.iv_notice_handle)");
        this.f59728i = (AutoRTLImageView) findViewById3;
        C22146a aVar = (C22146a) new C17971f().mo34884a(Keva.getRepo("account_security_keva_name").getString(C22150a.m54946a("safe_info_"), ""), C22146a.class);
        if (aVar != null) {
            this.f59731l = aVar.f59715f;
            this.f59730k = aVar.f59714e;
            this.f59732m = aVar.f59710a;
            this.f59733n = new SpannableStringBuilder(aVar.f59711b);
            this.f59724d = aVar.f59716g;
            this.f59725e = aVar.f59712c;
            this.f59734o = Boolean.valueOf(aVar.f59713d);
        }
        m54942c();
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
    }
}
