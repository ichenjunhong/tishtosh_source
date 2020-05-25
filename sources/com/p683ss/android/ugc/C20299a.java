package com.p683ss.android.ugc;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.C39833e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C42205l;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h;
import com.p683ss.android.ugc.aweme.utils.C47933n;
import com.ss.android.ugc.trill.R;
import java.io.File;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.a */
public final class C20299a extends C42359h implements C42205l {

    /* renamed from: d */
    public final C39833e f55784d;

    /* renamed from: g */
    private C52670a<C52860x> f55785g;

    /* renamed from: h */
    private ImageView f55786h;

    /* renamed from: i */
    private SmartImageView f55787i;

    /* renamed from: j */
    private final User f55788j;

    /* renamed from: k */
    private final Activity f55789k;

    /* renamed from: com.ss.android.ugc.a$a */
    static final class C20300a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20299a f55790a;

        C20300a(C20299a aVar) {
            this.f55790a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f55790a.mo42942b()) {
                this.f55790a.f55784d.mo80917b();
            } else {
                this.f55790a.f55784d.mo80916a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.a$b */
    static final class C20301b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C20299a f55791a;

        C20301b(C20299a aVar) {
            this.f55791a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f55791a.f55784d.mo80918c();
        }
    }

    /* renamed from: a */
    public final void mo42938a() {
        if (!this.f55789k.isFinishing()) {
            show();
        }
    }

    public final void dismiss() {
        super.dismiss();
        C52670a<C52860x> aVar = this.f55785g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public final boolean mo42942b() {
        UrlModel avatarVideoUri = this.f55788j.getAvatarVideoUri();
        if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo42940a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f55785g = aVar;
    }

    /* renamed from: a */
    public final void mo42939a(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "urlModel");
        C12208t a = C12203q.m24645a((Object) C23608p.m57874a(urlModel));
        SmartImageView smartImageView = this.f55787i;
        if (smartImageView == null) {
            C52711k.m112237a("avatar");
        }
        a.mo23116a((C12197k) smartImageView).mo23118a("AvatarEditableShareDialog").mo23121a();
    }

    /* renamed from: a */
    public final void mo42941a(String str) {
        C52711k.m112240b(str, "filePath");
        try {
            Uri fromFile = Uri.fromFile(new File(str));
            C52711k.m112236a((Object) fromFile, "Uri.fromFile(File(filePath))");
            if (mo42942b()) {
                C12208t a = C12203q.f32142a.load(fromFile).mo23127c(true).mo23119a(true);
                SmartImageView smartImageView = this.f55787i;
                if (smartImageView == null) {
                    C52711k.m112237a("avatar");
                }
                a.mo23116a((C12197k) smartImageView).mo23118a("AvatarEditableShareDialog").mo23121a();
            }
        } catch (Exception unused) {
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.eqx);
        if (findViewById == null) {
            C52711k.m112234a();
        }
        this.f55786h = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.eqw);
        if (findViewById2 == null) {
            C52711k.m112234a();
        }
        this.f55787i = (SmartImageView) findViewById2;
        if (C20854a.m53167g().isMe(this.f55788j.getUid())) {
            ImageView imageView = this.f55786h;
            if (imageView == null) {
                C52711k.m112237a("edit");
            }
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f55786h;
            if (imageView2 == null) {
                C52711k.m112237a("edit");
            }
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = this.f55786h;
        if (imageView3 == null) {
            C52711k.m112237a("edit");
        }
        imageView3.setOnClickListener(new C20300a(this));
        SmartImageView smartImageView = this.f55787i;
        if (smartImageView == null) {
            C52711k.m112237a("avatar");
        }
        smartImageView.setOnClickListener(new C20301b(this));
        if (mo42942b()) {
            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(this.f55788j.getAvatarVideoUri())).mo23127c(true).mo23119a(true);
            SmartImageView smartImageView2 = this.f55787i;
            if (smartImageView2 == null) {
                C52711k.m112237a("avatar");
            }
            a.mo23116a((C12197k) smartImageView2).mo23118a("AvatarEditableShareDialog").mo23121a();
            return;
        }
        C12208t a2 = C12203q.m24645a((Object) C23608p.m57874a(C47933n.m103706a(this.f55788j)));
        SmartImageView smartImageView3 = this.f55787i;
        if (smartImageView3 == null) {
            C52711k.m112237a("avatar");
        }
        a2.mo23116a((C12197k) smartImageView3).mo23118a("AvatarEditableShareDialog").mo23121a();
    }

    private C20299a(User user, Activity activity, C39833e eVar, C42348d dVar, int i) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(eVar, "controller");
        C52711k.m112240b(dVar, "config");
        super(activity, i, dVar);
        this.f55788j = user;
        this.f55789k = activity;
        this.f55784d = eVar;
    }

    public /* synthetic */ C20299a(User user, Activity activity, C39833e eVar, C42348d dVar, int i, int i2, C52707g gVar) {
        this(user, activity, eVar, dVar, R.style.to);
    }
}
