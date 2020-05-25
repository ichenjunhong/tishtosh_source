package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.setting.model.RestrictUserModel;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41615f;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41618i;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42148a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42153d.C42154a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.e */
public final class C42083e implements C41615f, C42357g {

    /* renamed from: a */
    public final C41618i f106505a = new C41618i(new RestrictUserModel(), this);

    /* renamed from: b */
    public final Aweme f106506b;

    /* renamed from: c */
    private final String f106507c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.e$a */
    static final class C42084a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42083e f106508a;

        C42084a(C42083e eVar) {
            this.f106508a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f106508a.f106505a.mo85380a(this.f106508a.f106506b.getAuthorUid());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.a1g;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.t3;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "blacklist";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return C42358a.m93000a(this);
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    /* renamed from: a */
    public final void mo85377a(Exception exc) {
        C22971a.m56493a(C11010c.m22280a(), (Throwable) exc);
    }

    public C42083e(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this.f106506b = aweme;
        this.f106507c = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        if (C42148a.m92511a((C42357g) this, context, this.f106506b, this.f106507c)) {
            String string = context.getResources().getString(R.string.t3);
            C52711k.m112236a((Object) string, "context.resources.getString(R.string.blacklist)");
            String string2 = context.getResources().getString(R.string.t5);
            C52711k.m112236a((Object) string2, "context.resources.getStr…tring.blacklist_user_msg)");
            String string3 = context.getResources().getString(R.string.t3);
            C52711k.m112236a((Object) string3, "context.resources.getString(R.string.blacklist)");
            OnClickListener aVar = new C42084a(this);
            C52711k.m112240b(context, "context");
            C52711k.m112240b(string, "title");
            C52711k.m112240b(string2, "message");
            C52711k.m112240b(string3, "positiveText");
            C52711k.m112240b(aVar, "onClickListener");
            C11105a aVar2 = new C11105a(context);
            aVar2.mo20139a((CharSequence) string).mo20146b((CharSequence) string2).mo20140a((CharSequence) string3, aVar);
            aVar2.mo20145b((int) R.string.wf, (OnClickListener) C42154a.f106620a);
            aVar2.mo20143a().show();
        }
    }
}
