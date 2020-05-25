package com.p683ss.android.ugc.aweme.recommend.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.PrivacyReminderWidget */
public final class PrivacyReminderWidget extends Widget {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f104541g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PrivacyReminderWidget.class), "mPrivacyReminderIv", "getMPrivacyReminderIv()Landroid/widget/ImageView;"))};

    /* renamed from: h */
    private final C52668f f104542h = C52732g.m112285a(new C41146b(this));

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.PrivacyReminderWidget$a */
    static final class C41145a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyReminderWidget f104543a;

        C41145a(PrivacyReminderWidget privacyReminderWidget) {
            this.f104543a = privacyReminderWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            C52711k.m112236a((Object) privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
            String str = (String) privacyReminderH5Url.mo47782d();
            if (str != null) {
                Intent intent = new Intent(this.f104543a.mo83670a(), CrossPlatformActivity.class);
                intent.putExtra("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.setData(Uri.parse(str));
                this.f104543a.mo83670a().startActivity(intent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.PrivacyReminderWidget$b */
    static final class C41146b extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ PrivacyReminderWidget f104544a;

        C41146b(PrivacyReminderWidget privacyReminderWidget) {
            this.f104544a = privacyReminderWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f104544a.mo25053b().findViewById(R.id.c4y);
        }
    }

    /* renamed from: e */
    public final int mo25056e() {
        return R.layout.byw;
    }

    /* renamed from: a */
    public final Context mo83670a() {
        Context context = mo25053b().getContext();
        C52711k.m112236a((Object) context, "container.context");
        return context;
    }

    /* renamed from: g */
    public final void mo25057g() {
        super.mo25057g();
        ((ImageView) this.f104542h.getValue()).setOnClickListener(new C41145a(this));
    }
}
