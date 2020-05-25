package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.C17971f;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p1394ax.p1395a.C23327a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.b */
public final class C42077b implements C42357g {

    /* renamed from: a */
    private final Aweme f106492a;

    /* renamed from: b */
    private final String f106493b;

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.adj;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.f9;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "admin";
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
        return R.drawable.d2y;
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

    public C42077b(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        this.f106492a = aweme;
        this.f106493b = str;
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        C18922i iVar = new C18922i("https://mint.bytedance.net/mobile/home");
        iVar.mo38778a("type", this.f106493b);
        iVar.mo38778a("ids", new C17971f().mo34889b(new C23327a(this.f106492a.getAid())));
        iVar.mo38778a("user_id", curUserId);
        iVar.mo38778a("region", C35837h.m80980e());
        iVar.mo38776a("appId", (int) C23018b.f61359a);
        Intent intent = new Intent(C42149b.m92512a(context), CrossPlatformActivity.class);
        intent.setData(Uri.parse(iVar.mo38774a()));
        context.startActivity(intent);
    }
}
