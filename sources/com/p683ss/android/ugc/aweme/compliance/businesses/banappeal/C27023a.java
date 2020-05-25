package com.p683ss.android.ugc.aweme.compliance.businesses.banappeal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.business.api.model.AppealStatusResponse;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1602b.C27020a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.a */
public final class C27023a implements C27020a {

    /* renamed from: d */
    public static final C27024a f71327d = new C27024a(null);

    /* renamed from: a */
    public Dialog f71328a;

    /* renamed from: b */
    public final Activity f71329b;

    /* renamed from: c */
    public AppealStatusResponse f71330c;

    /* renamed from: e */
    private boolean f71331e;

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.a$a */
    public static final class C27024a {
        private C27024a() {
        }

        public /* synthetic */ C27024a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.a$b */
    static final class C27025b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27023a f71332a;

        /* renamed from: b */
        final /* synthetic */ String f71333b;

        C27025b(C27023a aVar, String str) {
            this.f71332a = aVar;
            this.f71333b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f71332a.mo55252a("click_appeal");
            SmartRouter.buildRoute((Context) this.f71332a.f71329b, "//webview").withParam(Uri.parse(this.f71333b)).open(17);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.a$c */
    static final class C27026c implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C27023a f71334a;

        C27026c(C27023a aVar) {
            this.f71334a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            View view;
            if (this.f71334a.f71328a != null) {
                Dialog dialog = this.f71334a.f71328a;
                View view2 = null;
                if (dialog != null) {
                    view = dialog.findViewById(R.id.pw);
                } else {
                    view = null;
                }
                Dialog dialog2 = this.f71334a.f71328a;
                if (dialog2 != null) {
                    view2 = dialog2.findViewById(R.id.pr);
                }
                if (!(view == null || view2 == null)) {
                    int right = view2.getRight();
                    int right2 = view.getRight();
                    if (right2 < right) {
                        int i = right - right2;
                        if (i > 0) {
                            if (view.getPaddingLeft() > i) {
                                view.setPadding(view.getPaddingLeft() - i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                                return;
                            }
                            view.setPadding(0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.banappeal.a$d */
    static final class C27027d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27023a f71335a;

        /* renamed from: b */
        final /* synthetic */ boolean f71336b;

        C27027d(C27023a aVar, boolean z) {
            this.f71335a = aVar;
            this.f71336b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f71336b) {
                this.f71335a.mo55252a("cancel_appeal");
            }
            dialogInterface.dismiss();
            C20854a.m53162b().logout("user_banned", "user_banned");
        }
    }

    /* renamed from: d */
    private final int m65241d() {
        if (this.f71330c.getAppealType() == 12) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo55225a() {
        return this.f71331e;
    }

    /* renamed from: c */
    public final boolean mo55227c() {
        Dialog dialog = this.f71328a;
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo55226b() {
        int appealType = this.f71330c.getAppealType();
        int status = this.f71330c.getStatus();
        if (status == 5) {
            if (this.f71330c.getBanTime() > 31536000) {
                status = 6;
            } else if (this.f71330c.getBanType() == 4) {
                status = 8;
            } else if (this.f71330c.getBanType() == 1 && this.f71330c.getBanTime() <= 31536000) {
                status = 7;
            }
            this.f71330c = AppealStatusResponse.copy$default(this.f71330c, status, 0, 0, 0, null, null, null, 126, null);
        }
        if (appealType == 12) {
            switch (status) {
                case 0:
                case 1:
                case 3:
                case 4:
                    m65239a(this.f71330c.getPopTitle(), this.f71330c.getPopContent(), this.f71330c.getAppealUrl());
                    return;
                case 6:
                    m65239a(null, this.f71329b.getString(R.string.g5), null);
                    return;
                case 7:
                case 8:
                    m65239a(null, this.f71329b.getString(R.string.gk), null);
                    break;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/falcon/main/gradient_appeal/?hide_nav_bar=1&appeal_type=6&object_id=");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        sb.append(g.getCurUserId());
        String sb2 = sb.toString();
        switch (status) {
            case 0:
                m65239a(this.f71329b.getString(R.string.k3), this.f71329b.getString(R.string.k2), null);
                return;
            case 1:
                m65239a(this.f71329b.getString(R.string.k4), this.f71329b.getString(R.string.k1), sb2);
                return;
            case 3:
                m65239a(this.f71329b.getString(R.string.k0), this.f71329b.getString(R.string.jz), null);
                return;
            case 4:
                m65239a(this.f71329b.getString(R.string.jy), this.f71329b.getString(R.string.jx), null);
                return;
            case 6:
                m65239a(null, this.f71329b.getString(R.string.g5), null);
                return;
            case 7:
            case 8:
                m65239a(null, this.f71329b.getString(R.string.gk), null);
                break;
        }
    }

    /* renamed from: a */
    public final void mo55224a(boolean z) {
        this.f71331e = true;
    }

    /* renamed from: b */
    private final void m65240b(String str) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        C26890h.m65011a("pop_appeal", C23089d.m56640a().mo47829a("appeal_type", str).mo47826a("ban_appeal_type", m65241d()).mo47829a("user_id", g.getCurUserId()).f61491a);
    }

    /* renamed from: a */
    public final void mo55252a(String str) {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        C26890h.m65011a(str, C23089d.m56640a().mo47826a("ban_appeal_type", m65241d()).mo47829a("user_id", g.getCurUserId()).f61491a);
    }

    public C27023a(Activity activity, AppealStatusResponse appealStatusResponse) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(appealStatusResponse, "appealInfo");
        this.f71329b = activity;
        this.f71330c = appealStatusResponse;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m65239a(String str, String str2, String str3) {
        this.f71331e = false;
        if (!TextUtils.isEmpty(str2) && !mo55227c()) {
            boolean z = !TextUtils.isEmpty(str3);
            C10643a a = new C10643a(this.f71329b).mo18902b(str2).mo18886a((int) R.string.apf, (OnClickListener) new C27027d(this, z));
            if (str != null) {
                a.mo18892a(str);
            }
            if (z) {
                a.mo18900b((int) R.string.jw, (OnClickListener) new C27025b(this, str3));
            }
            this.f71328a = a.mo18897a().mo18883c();
            Dialog dialog = this.f71328a;
            if (dialog != null) {
                dialog.setCancelable(false);
            }
            Dialog dialog2 = this.f71328a;
            if (dialog2 != null) {
                dialog2.setOnShowListener(new C27026c(this));
            }
            try {
                Dialog dialog3 = this.f71328a;
                if (dialog3 != null) {
                    dialog3.show();
                }
                switch (this.f71330c.getStatus()) {
                    case 0:
                        mo55252a("pop_appeal_restored");
                        return;
                    case 1:
                        m65240b("0");
                        return;
                    case 3:
                        mo55252a("pop_appeal_failed");
                        return;
                    case 4:
                        mo55252a("pop_appeal_expired");
                        return;
                    case 6:
                        m65240b("1");
                        return;
                    case 7:
                        m65240b("2");
                        return;
                    case 8:
                        m65240b("3");
                        break;
                }
            } catch (Exception unused) {
            }
        }
    }
}
