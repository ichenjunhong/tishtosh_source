package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22925ae;
import com.p683ss.android.ugc.aweme.app.C22925ae.C22926a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30531a;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct;
import com.p683ss.android.ugc.aweme.share.AwemeACLStruct.ACLCommonStruct;
import com.p683ss.android.ugc.aweme.share.C41994c;
import com.p683ss.android.ugc.aweme.share.C42233t;
import com.p683ss.android.ugc.aweme.share.C42233t.C42234a;
import com.p683ss.android.ugc.aweme.share.C42233t.C42235b;
import com.p683ss.android.ugc.aweme.share.C42233t.C42236c;
import com.p683ss.android.ugc.aweme.share.C42233t.C42237d;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42315c;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42261d;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42265f;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42277l;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42279m;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42281n;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42293t;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42295u;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42309a;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.utils.C47717be;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.p2394c.C48008f;
import com.p683ss.android.ugc.trill.share.C50417b;
import com.p683ss.android.ugc.trill.share.base.C50418a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.k */
public final class C42098k implements C42357g {

    /* renamed from: f */
    public static final C42099a f106534f = new C42099a(null);

    /* renamed from: a */
    public final C30447d f106535a = new C42106e(this);

    /* renamed from: b */
    public final Activity f106536b;

    /* renamed from: c */
    public final Aweme f106537c;

    /* renamed from: d */
    public final String f106538d;

    /* renamed from: e */
    public final String f106539e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$a */
    public static final class C42099a {
        private C42099a() {
        }

        public /* synthetic */ C42099a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$b */
    static final class C42100b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42098k f106540a;

        /* renamed from: b */
        final /* synthetic */ int f106541b;

        /* renamed from: c */
        final /* synthetic */ boolean f106542c;

        C42100b(C42098k kVar, int i, boolean z) {
            this.f106540a = kVar;
            this.f106541b = i;
            this.f106542c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C23551l.f62672a.mo48719a(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C42100b f106543a;

                {
                    this.f106543a = r1;
                }

                public final void run() {
                    C42098k.m92287a(this.f106543a.f106540a, this.f106543a.f106540a.f106537c, this.f106543a.f106540a.f106536b, this.f106543a.f106541b, this.f106543a.f106540a.f106538d, this.f106543a.f106540a.f106535a, this.f106543a.f106542c, false, 64, null);
                }
            }, 500);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$c */
    static final class C42102c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C42102c f106544a = new C42102c();

        C42102c() {
        }

        public final /* synthetic */ Object call() {
            if (C35837h.m80982g()) {
                C23543g h = C23542f.m57723h();
                if (h.mo48699a("japan_share_download_dot", -1) != 1) {
                    h.mo48707b("japan_share_download_dot", 1);
                }
            }
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$d */
    static final class C42103d<TTaskResult, TContinuationResult> implements C0011g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C42098k f106545a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f106546b;

        /* renamed from: c */
        final /* synthetic */ boolean f106547c;

        C42103d(C42098k kVar, SharePackage sharePackage, boolean z) {
            this.f106545a = kVar;
            this.f106546b = sharePackage;
            this.f106547c = z;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (C47957v.m103770a(iVar)) {
                final int i = this.f106546b.f106900i.getInt("page_type");
                C42069am.m92160a(this.f106545a.f106536b, (C52670a<C52860x>) new C52670a<C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42103d f106548a;

                    {
                        this.f106548a = r1;
                    }

                    public final /* synthetic */ Object invoke() {
                        C23551l.f62672a.mo48719a(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C421041 f106550a;

                            {
                                this.f106550a = r1;
                            }

                            public final void run() {
                                C42098k.m92287a(this.f106550a.f106548a.f106545a, this.f106550a.f106548a.f106545a.f106537c, this.f106550a.f106548a.f106545a.f106536b, i, this.f106550a.f106548a.f106545a.f106538d, this.f106550a.f106548a.f106545a.f106535a, this.f106550a.f106548a.f106547c, false, 64, null);
                            }
                        }, 500);
                        return C52860x.f131107a;
                    }
                });
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$e */
    static final class C42106e implements C30447d {

        /* renamed from: a */
        final /* synthetic */ C42098k f106551a;

        C42106e(C42098k kVar) {
            this.f106551a = kVar;
        }

        /* renamed from: g */
        public final String mo60874g(boolean z) {
            return this.f106551a.f106538d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$f */
    public static final class C42107f implements C42235b {

        /* renamed from: a */
        final /* synthetic */ Dialog f106552a;

        /* renamed from: b */
        final /* synthetic */ C42098k f106553b;

        /* renamed from: c */
        final /* synthetic */ Aweme f106554c;

        /* renamed from: d */
        final /* synthetic */ Context f106555d;

        /* renamed from: e */
        final /* synthetic */ int f106556e;

        /* renamed from: f */
        final /* synthetic */ String f106557f;

        /* renamed from: g */
        final /* synthetic */ C30447d f106558g;

        /* renamed from: h */
        final /* synthetic */ boolean f106559h;

        /* renamed from: i */
        final /* synthetic */ boolean f106560i;

        /* renamed from: j */
        final /* synthetic */ String f106561j;

        /* renamed from: k */
        final /* synthetic */ C42233t f106562k;

        /* renamed from: b */
        public final void mo86128b() {
            C42112m.m92308a(this.f106552a);
            C42234a.m92670a(this.f106554c.getAid(), this.f106554c.getAuthorUid(), this.f106561j, this.f106553b.f106539e, "cancel");
        }

        /* renamed from: a */
        public final void mo86127a() {
            C42112m.m92308a(this.f106552a);
            this.f106553b.mo86123a(this.f106554c, this.f106555d, this.f106556e, this.f106557f, this.f106558g, this.f106559h, this.f106560i);
            C42234a.m92670a(this.f106554c.getAid(), this.f106554c.getAuthorUid(), this.f106561j, this.f106553b.f106539e, "download");
        }

        C42107f(Dialog dialog, C42098k kVar, Aweme aweme, Context context, int i, String str, C30447d dVar, boolean z, boolean z2, String str2, C42233t tVar) {
            this.f106552a = dialog;
            this.f106553b = kVar;
            this.f106554c = aweme;
            this.f106555d = context;
            this.f106556e = i;
            this.f106557f = str;
            this.f106558g = dVar;
            this.f106559h = z;
            this.f106560i = z2;
            this.f106561j = str2;
            this.f106562k = tVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$g */
    public static final class C42108g extends C30531a {

        /* renamed from: a */
        final /* synthetic */ C42098k f106563a;

        /* renamed from: b */
        final /* synthetic */ boolean f106564b;

        /* renamed from: c */
        final /* synthetic */ boolean f106565c;

        /* renamed from: d */
        final /* synthetic */ Aweme f106566d;

        /* renamed from: e */
        final /* synthetic */ String f106567e;

        /* renamed from: f */
        final /* synthetic */ Context f106568f;

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$g$a */
        public static final class C42109a implements C42309a {

            /* renamed from: a */
            final /* synthetic */ Activity f106569a;

            /* renamed from: a */
            public final Activity mo60818a() {
                return this.f106569a;
            }

            C42109a(Activity activity) {
                this.f106569a = activity;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.a.k$g$b */
        public static final class C42110b extends C42315c {

            /* renamed from: a */
            final /* synthetic */ C42109a f106570a;

            C42110b(C42109a aVar, C42307b bVar) {
                this.f106570a = aVar;
                super(bVar);
            }

            /* renamed from: a */
            public final boolean mo49947a(C42318f fVar, Context context) {
                C52711k.m112240b(fVar, C42311c.f106865i);
                C52711k.m112240b(context, "context");
                if (!(fVar instanceof C42325k) || !new C42265f().mo86141a(context)) {
                    return this.f106874d.mo49947a(fVar, context);
                }
                return new C42265f().mo49947a(fVar, context);
            }
        }

        /* renamed from: b */
        public final void mo62729b() {
            super.mo62729b();
            if (this.f106565c) {
                C26890h.m65011a("download_without_logo_status", new C23089d().mo47829a("download_result", "fail").mo47829a("group_id", this.f106566d.getAid()).mo47829a("author_id", C23198ae.m56846a(this.f106566d)).mo47829a("enter_from", this.f106567e).f61491a);
            }
        }

        /* renamed from: a */
        public final void mo62728a(String str) {
            String str2;
            if (!this.f106564b) {
                String str3 = "download";
                boolean exists = new File(str).exists();
                if (C50417b.m108724a(C11010c.m22280a())) {
                    C23131p.m57779a("aweme_share_monitor", C23088c.m56631a().mo47824a("filePath", str).mo47824a("share_platform", str3).mo47824a("fileLength", String.valueOf(new File(str).length())).mo47824a("fileExist", String.valueOf(exists)).mo47825b());
                }
            }
            if (this.f106565c) {
                String str4 = "download_without_logo_status";
                C23089d dVar = new C23089d();
                String str5 = "download_result";
                if (TextUtils.isEmpty(str)) {
                    str2 = "fail";
                } else {
                    str2 = "success";
                }
                C26890h.m65011a(str4, dVar.mo47829a(str5, str2).mo47829a("group_id", this.f106566d.getAid()).mo47829a("author_id", C23198ae.m56846a(this.f106566d)).mo47829a("enter_from", this.f106567e).f61491a);
            }
            if (!TextUtils.isEmpty(str)) {
                String a = C48008f.m103863a(this.f106568f);
                C52711k.m112236a((Object) a, "VideoDownloadPathUtil.ge…ideoDownloadPath(context)");
                String path = new File(a, new File(str).getName()).getPath();
                C48016e.m103948c(str, path);
                Context context = this.f106568f;
                C52711k.m112236a((Object) path, "destination");
                boolean z = true;
                if (!TextUtils.isEmpty(path)) {
                    File file = new File(path);
                    C10691a.m21534a(context, (int) R.string.fbr, 1).mo19066a();
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(Uri.fromFile(file));
                    C11010c.m22280a().sendBroadcast(intent);
                }
                if (!this.f106564b) {
                    Aweme aweme = this.f106566d;
                    C52711k.m112240b(aweme, "aweme");
                    boolean b = C47950q.m103753b(aweme);
                    boolean z2 = !C47950q.m103758g(aweme);
                    if (!b || !z2) {
                        z = false;
                    }
                    if (z) {
                        Activity a2 = C42149b.m92512a(this.f106568f);
                        if (!a2.isFinishing()) {
                            Aweme aweme2 = this.f106566d;
                            C52711k.m112240b(path, LeakCanaryFileProvider.f132050j);
                            C52711k.m112240b(aweme2, "aweme");
                            DownloadedVideoSharePackage downloadedVideoSharePackage = new DownloadedVideoSharePackage(new C42326a().mo86236a("aweme"));
                            downloadedVideoSharePackage.f106677a = path;
                            downloadedVideoSharePackage.f106678b = aweme2;
                            C42109a aVar = new C42109a(a2);
                            C42309a aVar2 = aVar;
                            C42350b a3 = new C42350b().mo86258a((C42307b) new C42110b(aVar, new C42261d(aVar2))).mo86258a((C42307b) new C42281n(aVar2)).mo86258a((C42307b) new C42301x()).mo86258a((C42307b) new C42303y(new C42301x().mo86131a())).mo86258a((C42307b) new C42295u()).mo86258a((C42307b) new C42279m()).mo86258a((C42307b) new C42277l());
                            String string = this.f106568f.getString(R.string.bd4);
                            C52711k.m112236a((Object) string, "context.getString(R.string.i18n_share_system)");
                            try {
                                C41922a.m91868a().scoopShareDialogWithImModule(a2, a3.mo86258a((C42307b) new C42293t(string)).mo86257a((int) R.string.di8).mo86268b((int) R.string.wf).mo86270b(false).mo86259a((SharePackage) downloadedVideoSharePackage).mo86266a(), R.style.to).show();
                            } catch (Exception unused) {
                            }
                        } else {
                            return;
                        }
                    }
                }
                if (mo62730c()) {
                    C48121w.m104249M().mo95291x();
                }
            }
        }

        C42108g(C42098k kVar, boolean z, boolean z2, Aweme aweme, String str, Context context, Context context2) {
            this.f106563a = kVar;
            this.f106564b = z;
            this.f106565c = z2;
            this.f106566d = aweme;
            this.f106567e = str;
            this.f106568f = context;
            super(context2);
        }
    }

    /* renamed from: a */
    public final int mo49948a() {
        return R.drawable.an7;
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.d_i;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "save";
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return R.drawable.dxh;
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        boolean z;
        boolean z2;
        boolean z3;
        if ((!this.f106537c.isPreventDownload() || C42234a.m92671a(this.f106537c)) && this.f106537c.getDownloadStatus() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || !C35837h.m80982g()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (C23542f.m57723h().mo48699a("japan_share_download_dot", -1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        boolean z;
        if ((!this.f106537c.isPreventDownload() || C42234a.m92671a(this.f106537c)) && this.f106537c.getDownloadStatus() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
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

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0163 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0164  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49950a(android.content.Context r8, com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage r9) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "sharePackage"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "share_repo"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r1 = "user_download_action"
            r2 = 1
            r0.storeBoolean(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f106537c
            java.lang.String r1 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.app.bf r1 = r1.getIsPrivateAvailable()
            java.lang.String r3 = "SharePrefCache.inst().isPrivateAvailable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.Object r1 = r1.mo47782d()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47950q.m103755d(r0)
            r4 = 0
            if (r3 != 0) goto L_0x0045
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47950q.m103754c(r0)
            if (r3 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = 0
            goto L_0x0046
        L_0x0045:
            r3 = 1
        L_0x0046:
            com.ss.android.ugc.aweme.profile.model.User r5 = r0.getAuthor()
            if (r5 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r6 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r5 = r5.getCurUserId()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r6 = "aweme.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            java.lang.String r0 = r0.getUid()
            boolean r0 = com.bytedance.common.utility.C9431p.m18665a(r5, r0)
            if (r0 == 0) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            java.lang.String r5 = "isPrivateAvailable"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0080
            if (r3 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            r0 = 1
            goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f106537c
            com.ss.android.ugc.aweme.base.share.ShareInfo r3 = r1.getShareInfo()
            if (r3 != 0) goto L_0x00aa
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r2 = com.p683ss.android.ugc.aweme.share.AwemeACLStruct.m91858a()
            r3 = 2132546922(0x7f1c156a, float:2.0747076E38)
            java.lang.String r5 = r8.getString(r3)
            java.lang.String r6 = "context.getString(R.string.network_ungeliable)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r2.setToastMsg(r5)
            java.lang.String r2 = r7.f106538d
            com.p683ss.android.ugc.aweme.share.C41994c.m91964a(r2, r1)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r8, r3)
            r8.mo19066a()
            goto L_0x0161
        L_0x00aa:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = r1.getStatus()
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r3.isDelete()
            if (r3 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r2 = com.p683ss.android.ugc.aweme.share.AwemeACLStruct.m91858a()
            r3 = 2132551834(0x7f1c289a, float:2.0757038E38)
            java.lang.String r5 = r8.getString(r3)
            java.lang.String r6 = "context.getString(R.string.video_deleted)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r2.setToastMsg(r5)
            java.lang.String r2 = r7.f106538d
            com.p683ss.android.ugc.aweme.share.C41994c.m91964a(r2, r1)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r8, r3)
            r8.mo19066a()
            goto L_0x0161
        L_0x00d7:
            com.ss.android.ugc.aweme.commercialize.utils.bi r3 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62923n()
            boolean r3 = r3.mo54138a(r1)
            if (r3 != 0) goto L_0x0142
            com.ss.android.ugc.aweme.commercialize.utils.bi r3 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62923n()
            boolean r3 = r3.mo54139b(r1)
            if (r3 == 0) goto L_0x00ec
            goto L_0x0142
        L_0x00ec:
            boolean r3 = r1.isPreventDownload()
            if (r3 == 0) goto L_0x0120
            boolean r3 = com.p683ss.android.ugc.aweme.share.C42233t.C42234a.m92671a(r1)
            if (r3 != 0) goto L_0x0120
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r2 = com.p683ss.android.ugc.aweme.share.AwemeACLStruct.m91858a()
            r3 = 2132542522(0x7f1c043a, float:2.0738151E38)
            java.lang.String r5 = r8.getString(r3)
            java.lang.String r6 = "context.getString(R.stri…ot_save_due_to_copyright)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r2.setToastMsg(r5)
            java.lang.String r2 = r7.f106538d
            com.p683ss.android.ugc.aweme.share.C41994c.m91964a(r2, r1)
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r1 = r1.getString(r3)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r8, r1)
            r8.mo19066a()
            goto L_0x0161
        L_0x0120:
            java.lang.String r3 = r7.f106538d
            com.p683ss.android.ugc.aweme.share.C41994c.m91967b(r3)
            boolean r8 = com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a.m71490a(r8, r1)
            if (r8 != 0) goto L_0x012c
            goto L_0x0161
        L_0x012c:
            int r8 = r1.getDownloadStatus()
            if (r8 == 0) goto L_0x0140
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r8 = com.p683ss.android.ugc.aweme.share.AwemeACLStruct.m91858a()
            r2 = 3
            r8.setShowType(r2)
            java.lang.String r8 = r7.f106538d
            com.p683ss.android.ugc.aweme.share.C41994c.m91964a(r8, r1)
            goto L_0x0161
        L_0x0140:
            r4 = 1
            goto L_0x0161
        L_0x0142:
            com.ss.android.ugc.aweme.share.AwemeACLStruct$ACLCommonStruct r2 = com.p683ss.android.ugc.aweme.share.AwemeACLStruct.m91858a()
            r3 = 2132541683(0x7f1c00f3, float:2.073645E38)
            java.lang.String r5 = r8.getString(r3)
            java.lang.String r6 = "context.getString(R.string.ad_not_support)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r2.setToastMsg(r5)
            java.lang.String r2 = r7.f106538d
            com.p683ss.android.ugc.aweme.share.C41994c.m91964a(r2, r1)
            com.bytedance.ies.dmt.ui.d.a r8 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r8, r3)
            r8.mo19066a()
        L_0x0161:
            if (r4 != 0) goto L_0x0164
            return
        L_0x0164:
            if (r0 == 0) goto L_0x017b
            android.os.Bundle r8 = r9.f106900i
            java.lang.String r9 = "page_type"
            int r8 = r8.getInt(r9)
            android.app.Activity r9 = r7.f106536b
            com.ss.android.ugc.aweme.share.improve.a.k$b r1 = new com.ss.android.ugc.aweme.share.improve.a.k$b
            r1.<init>(r7, r8, r0)
            d.f.a.a r1 = (p2628d.p2639f.p2640a.C52670a) r1
            com.p683ss.android.ugc.aweme.share.improve.p2160a.C42069am.m92160a(r9, r1)
            return
        L_0x017b:
            com.ss.android.ugc.aweme.share.improve.a.k$c r8 = com.p683ss.android.ugc.aweme.share.improve.p2160a.C42098k.C42102c.f106544a
            java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
            a.i r8 = p001a.C0013i.m16a(r8)
            com.ss.android.ugc.aweme.share.improve.a.k$d r1 = new com.ss.android.ugc.aweme.share.improve.a.k$d
            r1.<init>(r7, r9, r0)
            a.g r1 = (p001a.C0011g) r1
            java.util.concurrent.Executor r9 = p001a.C0013i.f25b
            r8.mo20a(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.p2160a.C42098k.mo49950a(android.content.Context, com.ss.android.ugc.aweme.sharer.ui.SharePackage):void");
    }

    public C42098k(Activity activity, Aweme aweme, String str, String str2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(str2, "downloadMethod");
        this.f106536b = activity;
        this.f106537c = aweme;
        this.f106538d = str;
        this.f106539e = str2;
    }

    /* renamed from: a */
    public final void mo86123a(Aweme aweme, Context context, int i, String str, C30447d dVar, boolean z, boolean z2) {
        String str2;
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "eventType");
        if (this.f106535a != null) {
            str2 = this.f106535a.mo60874g(true);
        } else {
            str2 = str;
        }
        C50418a aVar = new C50418a(context, false, i, "download");
        aVar.f126411E = str2;
        aVar.f126412F = this.f106539e;
        C42108g gVar = new C42108g(this, z, z2, aweme, str2, context, context);
        aVar.f126435k = gVar;
        aVar.mo98331a(aweme);
        C41994c.m91964a(str, aweme);
    }

    /* renamed from: a */
    static /* synthetic */ void m92287a(C42098k kVar, Aweme aweme, Context context, int i, String str, C30447d dVar, boolean z, boolean z2, int i2, Object obj) {
        String str2;
        Dialog c;
        C42098k kVar2 = kVar;
        Aweme aweme2 = aweme;
        Context context2 = context;
        String str3 = str;
        C47717be.m103287a();
        if (!C42111l.m92307a(context)) {
            C10691a.m21542b(context2, (int) R.string.cg1).mo19066a();
            C22925ae.m56374a(C22926a.NETWORK, aweme2);
        } else if (C31190f.m72831a(aweme) || aweme.getStatus() == null || !aweme.getStatus().isPrivate()) {
            if (!(!C35837h.m80977b() || aweme2 == null || aweme.getAuthor() == null)) {
                IAccountUserService g = C20854a.m53167g();
                User author = aweme.getAuthor();
                C52711k.m112236a((Object) author, "aweme.author");
                if (!g.isMe(author.getUid())) {
                    User author2 = aweme.getAuthor();
                    C52711k.m112236a((Object) author2, "aweme.author");
                    if (author2.isPreventDownload()) {
                        ACLCommonStruct a = AwemeACLStruct.m91858a();
                        String string = context2.getString(R.string.aq7);
                        C52711k.m112236a((Object) string, "context.getString(R.stri…disallow_download_videos)");
                        a.setToastMsg(string);
                        C41994c.m91964a(str3, aweme2);
                        C10691a.m21542b(context2, (int) R.string.aq7).mo19066a();
                        C22925ae.m56374a(C22926a.PREVENT_DOWNLOAD, aweme2);
                        return;
                    }
                }
            }
            if (C42234a.m92671a(aweme)) {
                C42233t tVar = new C42233t();
                if (kVar2.f106535a != null) {
                    str2 = kVar2.f106535a.mo60874g(true);
                } else {
                    str2 = str3;
                }
                Activity activity = kVar2.f106536b;
                if (activity == null) {
                    c = null;
                } else {
                    C10643a aVar = new C10643a(activity);
                    aVar.mo18902b(activity.getString(R.string.hvl)).mo18886a((int) R.string.ast, (OnClickListener) new C42236c(tVar)).mo18900b((int) R.string.g_h, (OnClickListener) new C42237d(tVar));
                    c = aVar.mo18897a().mo18883c();
                    c.setCanceledOnTouchOutside(false);
                    c.setCancelable(false);
                }
                Dialog dialog = c;
                if (dialog != null) {
                    C42107f fVar = new C42107f(dialog, kVar, aweme, context, i, str, dVar, z, false, str2, tVar);
                    tVar.f106769a = fVar;
                    dialog.show();
                }
            } else {
                kVar.mo86123a(aweme, context, i, str, dVar, z, false);
            }
        } else {
            ACLCommonStruct a2 = AwemeACLStruct.m91858a();
            String string2 = context2.getString(R.string.faw);
            C52711k.m112236a((Object) string2, "context.getString(R.stri…lete_and_download_failed)");
            a2.setToastMsg(string2);
            C41994c.m91964a(str3, aweme2);
            C10691a.m21542b(context2, (int) R.string.faw).mo19066a();
            C22925ae.m56374a(C22926a.PRIVATE, aweme2);
        }
    }
}
