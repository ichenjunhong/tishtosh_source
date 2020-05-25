package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30531a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.trill.share.base.C50418a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.y */
public final class C42127y implements C42357g {

    /* renamed from: a */
    public final Aweme f106584a;

    /* renamed from: b */
    public final String f106585b;

    /* renamed from: c */
    private final int f106586c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.y$a */
    public static final class C42128a extends C30531a {

        /* renamed from: a */
        final /* synthetic */ C42127y f106587a;

        /* renamed from: b */
        final /* synthetic */ Context f106588b;

        /* renamed from: b */
        public final void mo62729b() {
            super.mo62729b();
            C26890h.m65011a("download_without_logo_status", new C23089d().mo47829a("download_result", "fail").mo47829a("group_id", this.f106587a.f106584a.getAid()).mo47829a("author_id", C23198ae.m56846a(this.f106587a.f106584a)).mo47829a("enter_from", this.f106587a.f106585b).f61491a);
        }

        /* renamed from: a */
        public final void mo62728a(String str) {
            String str2;
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            String str3 = "download_without_logo_status";
            C23089d dVar = new C23089d();
            String str4 = "download_result";
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                str2 = "fail";
            } else {
                str2 = "success";
            }
            C26890h.m65011a(str3, dVar.mo47829a(str4, str2).mo47829a("group_id", this.f106587a.f106584a.getAid()).mo47829a("author_id", C23198ae.m56846a(this.f106587a.f106584a)).mo47829a("enter_from", this.f106587a.f106585b).f61491a);
            if (!TextUtils.isEmpty(charSequence)) {
                String path = new File(C23967a.m58772a(this.f106588b), new File(str).getName()).getPath();
                C48016e.m103948c(str, path);
                C52711k.m112236a((Object) path, "destination");
                Context context = this.f106588b;
                if (!TextUtils.isEmpty(path)) {
                    File file = new File(path);
                    C10691a.m21534a(context, (int) R.string.fbq, 1).mo19066a();
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(Uri.fromFile(file));
                    C11010c.m22280a().sendBroadcast(intent);
                }
                if (mo62730c()) {
                    C48121w.m104249M().mo95291x();
                }
            }
        }

        C42128a(C42127y yVar, Context context, Context context2) {
            this.f106587a = yVar;
            this.f106588b = context;
            super(context2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.y$b */
    static final class C42129b implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C42127y f106589a;

        /* renamed from: b */
        final /* synthetic */ C50418a f106590b;

        /* renamed from: c */
        final /* synthetic */ Context f106591c;

        C42129b(C42127y yVar, C50418a aVar, Context context) {
            this.f106589a = yVar;
            this.f106590b = aVar;
            this.f106591c = context;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f106590b.mo98332a(this.f106589a.f106584a, true);
                } else {
                    C41922a.m91868a().showNoPermissionDialog(R.string.ci3, R.string.ci2, C42149b.m92512a(this.f106591c));
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.dx7;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d_l;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "save_no_watermark";
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
        return R.drawable.dxl;
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
    public final void mo49950a(Context context, SharePackage sharePackage) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C26890h.m65011a("download_without_logo", new C23089d().mo47829a("action_type", "click").mo47829a("group_id", this.f106584a.getAid()).mo47829a("author_id", C23198ae.m56846a(this.f106584a)).mo47829a("enter_from", this.f106585b).f61491a);
        C50418a aVar = new C50418a(context, false, this.f106586c, "download_no_watermark");
        aVar.f126435k = new C42128a(this, context, context);
        if (C47946e.m103737c(C42149b.m92512a(context)) == 0) {
            aVar.mo98332a(this.f106584a, true);
            return;
        }
        C23361b.m57419a(C42149b.m92512a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C42129b(this, aVar, context));
    }

    public C42127y(Aweme aweme, String str, int i) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        this.f106584a = aweme;
        this.f106585b = str;
        this.f106586c = i;
    }
}
