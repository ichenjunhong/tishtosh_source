package com.p683ss.android.ugc.aweme.notification.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41051a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.C47818dm;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.util.j */
public final class C38443j {

    /* renamed from: a */
    public static Bundle f97842a;

    /* renamed from: b */
    public static int f97843b;

    /* renamed from: c */
    public static int f97844c;

    /* renamed from: d */
    public static WeakReference<NoticeView> f97845d;

    /* renamed from: e */
    public static boolean f97846e;

    /* renamed from: f */
    public static final C38443j f97847f = new C38443j();

    /* renamed from: g */
    private static int f97848g;

    /* renamed from: h */
    private static int f97849h;

    /* renamed from: com.ss.android.ugc.aweme.notification.util.j$a */
    public static final class C38444a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f97850a;

        /* renamed from: b */
        final /* synthetic */ Context f97851b;

        public C38444a(int i, Context context) {
            this.f97850a = i;
            this.f97851b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            try {
                C47818dm.m103459b(this.f97851b);
            } catch (Exception unused) {
                this.f97851b.startActivity(new Intent("android.settings.SETTINGS"));
            }
            C38443j jVar = C38443j.f97847f;
            String str = "push_pre_permission_auth";
            C26890h.m65011a(str, C23089d.m56640a().mo47829a("scene_id", "1001").mo47829a("trigger_method", C38443j.m85760a(this.f97850a)).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.util.j$b */
    public static final class C38445b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f97852a;

        /* renamed from: b */
        final /* synthetic */ Context f97853b;

        public C38445b(int i, Context context) {
            this.f97852a = i;
            this.f97853b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C23859b.m58575b().mo49463a(this.f97853b, "key_cross_push_notification_guide", System.currentTimeMillis());
            long a = C38443j.m85758a(this.f97853b) + 1;
            C23859b.m58575b().mo49463a(this.f97853b, "key_times_push_notification_guide", a);
            C38443j jVar = C38443j.f97847f;
            WeakReference<NoticeView> weakReference = C38443j.f97845d;
            if (weakReference != null) {
                NoticeView noticeView = (NoticeView) weakReference.get();
                if (noticeView != null && noticeView.getVisibility() == 0) {
                    noticeView.setVisibility(8);
                }
            }
            C38443j jVar2 = C38443j.f97847f;
            String str = "push_pre_permission_deny";
            C26890h.m65011a(str, C23089d.m56640a().mo47829a("scene_id", "1001").mo47829a("trigger_method", C38443j.m85760a(this.f97852a)).f61491a);
        }
    }

    private C38443j() {
    }

    /* renamed from: a */
    public static String m85760a(int i) {
        switch (i) {
            case 0:
                return "followers";
            case 1:
                return "likes";
            case 2:
                return "mentions";
            case 3:
                return "comments";
            default:
                return "";
        }
    }

    static {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            pushGuideInfo pushGuideInfo = b.getPushGuideInfo();
            C52711k.m112236a((Object) pushGuideInfo, "SettingsReader.get().pushGuideInfo");
            Integer closeCountLimit = pushGuideInfo.getCloseCountLimit();
            if (closeCountLimit == null) {
                C52711k.m112234a();
            }
            f97843b = closeCountLimit.intValue();
            IESSettingsProxy b2 = C32816h.m75716b();
            C52711k.m112236a((Object) b2, "SettingsReader.get()");
            pushGuideInfo pushGuideInfo2 = b2.getPushGuideInfo();
            C52711k.m112236a((Object) pushGuideInfo2, "SettingsReader.get().pushGuideInfo");
            Integer showupInterval = pushGuideInfo2.getShowupInterval();
            if (showupInterval == null) {
                C52711k.m112234a();
            }
            f97844c = showupInterval.intValue();
        } catch (Exception unused) {
            f97843b = 3;
            f97844c = 15;
        }
    }

    /* renamed from: a */
    public static long m85758a(Context context) {
        return C23859b.m58575b().mo49473c(context, "key_times_push_notification_guide");
    }

    /* renamed from: a */
    public static void m85761a(Bundle bundle, int i) {
        if (bundle == null) {
            f97842a = null;
        }
        if (f97846e && i <= f97848g + f97849h && !C41051a.m90720a(C11010c.m22280a())) {
            f97842a = bundle;
        }
    }

    /* renamed from: a */
    public static View m85759a(Context context, Bundle bundle) {
        View view;
        if (C47918gj.m103682a(context)) {
            view = LayoutInflater.from(context).inflate(R.layout.b3d, null);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.b3c, null);
        }
        LayoutParams layoutParams = new LayoutParams(-1, (int) C9432q.m18687b(context, 162.0f));
        C52711k.m112236a((Object) view, "topView");
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) view.findViewById(R.id.f44);
        TextView textView2 = (TextView) view.findViewById(R.id.f43);
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.efj);
        C52711k.m112236a((Object) textView, "tvName");
        textView.setText(bundle.getString("username"));
        C52711k.m112236a((Object) textView2, "tvContent");
        textView2.setText(bundle.getString(C42311c.f106865i));
        try {
            Serializable serializable = bundle.getSerializable("avatar_thumb");
            if (serializable != null) {
                C23515d.m57669a(remoteImageView, (UrlModel) serializable);
                return view;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m85763a(boolean z, int i, int i2) {
        f97846e = z;
        f97848g = i;
        f97849h = i2;
    }
}
