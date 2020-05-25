package com.p683ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12187e.C12189a;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditActivity;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.C48217o;
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

/* renamed from: com.ss.android.ugc.aweme.base.component.h */
public final class C23506h extends C48217o {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f62597a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23506h.class), "ivAvatar", "getIvAvatar()Lcom/bytedance/lighten/loader/SmartImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23506h.class), "ivCancel", "getIvCancel()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23506h.class), "tvUsername", "getTvUsername()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23506h.class), "btnUpdate", "getBtnUpdate()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23506h.class), "dialogDate", "getDialogDate()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: b */
    public final User f62598b;

    /* renamed from: c */
    public final int f62599c;

    /* renamed from: d */
    private final C52668f f62600d = C52732g.m112285a(new C23512f(this));

    /* renamed from: e */
    private final C52668f f62601e = C52732g.m112285a(new C23513g(this));

    /* renamed from: f */
    private final C52668f f62602f = C52732g.m112285a(new C23514h(this));

    /* renamed from: g */
    private final C52668f f62603g = C52732g.m112285a(new C23510d(this));

    /* renamed from: j */
    private final C52668f f62604j = C52732g.m112285a(new C23511e(this));

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$a */
    static final class C23507a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23506h f62605a;

        /* renamed from: b */
        final /* synthetic */ TextView f62606b;

        C23507a(C23506h hVar, TextView textView) {
            this.f62605a = hVar;
            this.f62606b = textView;
        }

        public final void run() {
            float a = C9432q.m18669a(this.f62605a.getContext(), 12.0f);
            float a2 = C9432q.m18669a(this.f62605a.getContext(), 1.0f);
            int width = (this.f62606b.getWidth() - this.f62606b.getPaddingLeft()) - this.f62606b.getPaddingRight();
            float measureText = this.f62606b.getPaint().measureText(this.f62606b.getText().toString());
            float textSize = this.f62606b.getTextSize();
            while (measureText > ((float) width) && textSize > a) {
                this.f62606b.setTextSize(0, textSize - a2);
                textSize = this.f62606b.getTextSize();
                measureText = this.f62606b.getPaint().measureText(this.f62606b.getText().toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$b */
    static final class C23508b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23506h f62607a;

        C23508b(C23506h hVar) {
            this.f62607a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62607a.dismiss();
            C26890h.m65011a("close_modify_username", C23089d.m56640a().mo47829a("enter_from", "modify_username_notify").mo47829a("click_method", "button").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$c */
    static final class C23509c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C23506h f62608a;

        C23509c(C23506h hVar) {
            this.f62608a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f62608a.dismiss();
            Context context = this.f62608a.getContext();
            C52711k.m112236a((Object) context, "context");
            ProfileEditActivity.m89261a(C42149b.m92512a(context), C47661ab.m103163a().mo94969a("need_focus_id_input", 2).f120139a);
            C26890h.m65011a("click_modify_username", C23089d.m56640a().mo47829a("enter_from", "modify_username_notify").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$d */
    static final class C23510d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C23506h f62609a;

        C23510d(C23506h hVar) {
            this.f62609a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f62609a.findViewById(R.id.e0j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$e */
    static final class C23511e extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C23506h f62610a;

        C23511e(C23506h hVar) {
            this.f62610a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f62610a.findViewById(R.id.f1t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$f */
    static final class C23512f extends C52712l implements C52670a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ C23506h f62611a;

        C23512f(C23506h hVar) {
            this.f62611a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SmartImageView) this.f62611a.findViewById(R.id.ee8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$g */
    static final class C23513g extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C23506h f62612a;

        C23513g(C23506h hVar) {
            this.f62612a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f62612a.findViewById(R.id.ee_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.h$h */
    static final class C23514h extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C23506h f62613a;

        C23514h(C23506h hVar) {
            this.f62613a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f62613a.findViewById(R.id.f1v);
        }
    }

    /* renamed from: a */
    private final DmtTextView m57661a() {
        return (DmtTextView) this.f62603g.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        UrlModel urlModel;
        super.onCreate(bundle);
        setContentView(R.layout.bk2);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        User user = this.f62598b;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23115a(new C12189a().mo23105a(true).mo23106a()).mo23116a((C12197k) (SmartImageView) this.f62600d.getValue()).mo23121a();
        DmtTextView dmtTextView = (DmtTextView) this.f62602f.getValue();
        StringBuilder sb = new StringBuilder("@");
        sb.append(C47915gg.m103656e(user));
        dmtTextView.setText(sb.toString());
        ((ImageView) this.f62601e.getValue()).setOnClickListener(new C23508b(this));
        TextView a = m57661a();
        a.post(new C23507a(this, a));
        m57661a().setOnClickListener(new C23509c(this));
        if (this.f62599c == 1) {
            ((DmtTextView) this.f62604j.getValue()).setText(getContext().getString(R.string.fs1));
        }
    }

    public C23506h(Context context, User user, int i) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a1p, true, false, false);
        this.f62598b = user;
        this.f62599c = i;
    }
}
