package com.p683ss.android.ugc.aweme.livewallpaper.p1927b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.video.C48016e;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.a */
public abstract class C36188a {

    /* renamed from: a */
    protected Aweme f92653a;

    /* renamed from: b */
    protected Activity f92654b;

    /* renamed from: c */
    protected C45547d f92655c;

    /* renamed from: d */
    protected String f92656d;

    /* renamed from: e */
    protected String f92657e;

    /* renamed from: f */
    protected String f92658f;

    /* renamed from: g */
    protected String f92659g;

    /* renamed from: h */
    protected String f92660h;

    /* renamed from: i */
    public int f92661i;

    /* renamed from: j */
    public int f92662j;

    /* renamed from: k */
    public Runnable f92663k = new Runnable() {
        public final void run() {
            if (C36188a.this.f92655c != null) {
                C45547d dVar = C36188a.this.f92655c;
                int i = 100;
                if (C36188a.this.f92661i < 100) {
                    i = C36188a.this.f92661i;
                }
                dVar.setProgress(i);
            }
        }
    };

    /* renamed from: l */
    private Handler f92664l = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo74938b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo74939b(Aweme aweme);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo74941d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo74942e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo74943f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo74944g();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74934a() {
        C48016e.m103947c(this.f92659g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo74937b() {
        if (this.f92655c != null) {
            try {
                this.f92655c.dismiss();
            } catch (Exception unused) {
            }
            this.f92655c = null;
        }
    }

    /* renamed from: c */
    public final void mo74940c() {
        DownloadTask url = Downloader.with(this.f92654b).url(this.f92656d);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f92658f);
        sb.append(".mp4");
        DownloadTask name = url.name(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f92657e);
        sb2.append("temp");
        name.savePath(sb2.toString()).subThreadListener(new AbsDownloadListener() {
            public final void onSuccessed(DownloadInfo downloadInfo) {
                C36188a.this.mo74938b(downloadInfo.getTargetFilePath());
            }

            public final void onProgress(DownloadInfo downloadInfo) {
                if (C36188a.this.f92654b != null && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
                    C36188a.this.f92661i = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
                    C18842a.m45934b(C36188a.this.f92663k);
                }
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                if (C36188a.this.f92654b != null) {
                    if (C36188a.this.f92662j < 3) {
                        C36188a.this.f92662j++;
                        C36188a.this.mo74940c();
                        return;
                    }
                    C36188a.this.mo74944g();
                    if (baseException != null) {
                        String str = "";
                        if (C36188a.this.f92653a != null && C36188a.this.f92653a.getVideo() != null && !TextUtils.isEmpty(C36188a.this.f92653a.getAid()) && !TextUtils.isEmpty(C36188a.this.f92653a.getVideo().getVideoId())) {
                            StringBuilder sb = new StringBuilder("aid ");
                            sb.append(C36188a.this.f92653a.getAid());
                            sb.append(" vid ");
                            sb.append(C36188a.this.f92653a.getVideo().getVideoId());
                            str = sb.toString();
                        }
                        StringBuilder sb2 = new StringBuilder("download video fail ");
                        sb2.append(str);
                        sb2.append(baseException.getErrorMessage());
                        sb2.append(" error code ");
                        sb2.append(baseException.getErrorCode());
                        C36212f.m81744b(1, sb2.toString());
                    }
                }
            }
        }).download();
    }

    protected C36188a(Activity activity) {
        this.f92654b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74936a(String str) {
        if (this.f92655c == null) {
            this.f92655c = C45547d.m99208b(this.f92654b, str);
            this.f92655c.setIndeterminate(false);
        }
        this.f92655c.setProgress(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74935a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L_0x0005
            goto L_0x006c
        L_0x0005:
            com.ss.android.ugc.aweme.profile.model.User r2 = r5.getAuthor()
            if (r2 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r2 = r2.getCurUserId()
            java.lang.String r3 = r5.getAuthorUid()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 != 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r5.getStatus()
            if (r2 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r5.getStatus()
            int r2 = r2.getPrivateStatus()
            if (r2 != r1) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x0039
            r2 = 1
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            if (r2 == 0) goto L_0x0049
            android.app.Activity r0 = r4.f92654b
            r2 = 2132551833(0x7f1c2899, float:2.0757036E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r2)
            r0.mo19066a()
            goto L_0x006c
        L_0x0049:
            android.app.Activity r2 = r4.f92654b
            boolean r2 = com.p683ss.android.ugc.aweme.livewallpaper.p1927b.C36192b.m81694a(r2)
            if (r2 != 0) goto L_0x0064
            android.app.Activity r0 = r4.f92654b
            android.app.Activity r2 = r4.f92654b
            r3 = 2132548727(0x7f1c1c77, float:2.0750737E38)
            java.lang.String r2 = r2.getString(r3)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r0, r2)
            r0.mo19066a()
            goto L_0x006c
        L_0x0064:
            boolean r2 = r4.mo74939b(r5)
            if (r2 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 == 0) goto L_0x0072
            r4.mo74937b()
            return
        L_0x0072:
            r4.f92653a = r5
            r4.mo74941d()
            java.lang.String r5 = r4.f92660h
            boolean r5 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r5)
            if (r5 == 0) goto L_0x0086
            r4.mo74943f()
            r4.mo74937b()
            return
        L_0x0086:
            java.lang.String r5 = r4.mo74942e()
            r4.mo74936a(r5)
            r4.mo74940c()
            android.os.Handler r5 = r4.f92664l
            com.ss.android.ugc.aweme.livewallpaper.b.a$3 r0 = new com.ss.android.ugc.aweme.livewallpaper.b.a$3
            r0.<init>()
            r1 = 60000(0xea60, double:2.9644E-319)
            r5.postDelayed(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.p1927b.C36188a.mo74935a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
