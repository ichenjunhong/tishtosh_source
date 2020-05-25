package com.p683ss.android.ugc.aweme.livewallpaper.p1927b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.app.download.C23079b;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23515d.C23520a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity.C23419a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36203a;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36205c;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.c */
public final class C36193c extends C36188a {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo74943f() {
        mo74948c(this.f92660h);
        C36212f.m81744b(0, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo74944g() {
        mo74934a();
        C18842a.m45934b(new Runnable() {
            public final void run() {
                if (C36193c.this.f92654b != null && !C36193c.this.f92654b.isFinishing()) {
                    C36193c.this.mo74937b();
                    C10691a.m21542b((Context) C36193c.this.f92654b, (int) R.string.at3).mo19066a();
                }
            }
        });
    }

    /* renamed from: h */
    public final void mo74949h() {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                C36193c.this.mo74937b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo74942e() {
        if (this.f92654b == null || this.f92654b.isFinishing()) {
            return "";
        }
        return this.f92654b.getString(R.string.c06);
    }

    /* renamed from: i */
    private void m81695i() {
        if (C36212f.m81741a((Context) this.f92654b, this.f92654b.getPackageName())) {
            C36205c.m81710a().mo74959a("video_share", new C36203a(this.f92653a.getAid()));
            return;
        }
        if (this.f92654b instanceof AmeSSActivity) {
            ((AmeSSActivity) this.f92654b).setOnActivityResultListener(new C23419a() {
                /* renamed from: a */
                public final void mo48560a(int i, int i2, Intent intent) {
                    if (i == 100 && C36212f.m81741a((Context) C36193c.this.f92654b, C36193c.this.f92654b.getPackageName())) {
                        C10691a.m21533a(C11010c.m22280a(), (int) R.string.ddt).mo19066a();
                        C36212f.m81738a(C36193c.this.f92653a.getAid(), "paper_set", true);
                        C36212f.m81734a(0, "");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo74941d() {
        this.f92657e = C36212f.m81733a();
        this.f92658f = C9395d.m18571a(this.f92653a.getVideo().getPlayAddrH264().getUri());
        StringBuilder sb = new StringBuilder();
        sb.append(this.f92657e);
        sb.append(this.f92658f);
        sb.append(".mp4");
        this.f92660h = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f92657e);
        sb2.append("temp/");
        this.f92659g = sb2.toString();
        if (!C48016e.m103944b(this.f92659g)) {
            C48016e.m103935a(this.f92659g, false);
        }
    }

    public C36193c(Activity activity) {
        super(activity);
        this.f92654b = activity;
    }

    /* renamed from: b */
    public final void mo74938b(String str) {
        if (str != null) {
            this.f92659g = str;
            if (str.length() == 0) {
                StringBuilder sb = new StringBuilder("LiveWallPaperHelper download file size == 0: ");
                sb.append(this.f92656d);
                C32458a.m75148a((Throwable) new Exception(sb.toString()));
                mo74944g();
                C36212f.m81744b(1, "file size == 0");
                return;
            }
            String trim = str.trim();
            String substring = trim.substring(trim.lastIndexOf("/") + 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f92657e);
            sb2.append(substring);
            this.f92660h = sb2.toString();
            C48016e.m103948c(str, this.f92660h);
            mo74934a();
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    C36193c.this.mo74937b();
                    C36193c.this.mo74948c(C36193c.this.f92660h);
                }
            });
            C36212f.m81744b(0, "");
        }
    }

    /* renamed from: c */
    public final void mo74947c(final Aweme aweme) {
        if (aweme == null || C36212f.m81740a(this.f92654b, aweme.getAid())) {
            return;
        }
        if (this.f92654b == null || this.f92654b.isFinishing() || C36202d.m81708a(this.f92654b)) {
            Video video = aweme.getVideo();
            if (video != null) {
                UrlModel cover = video.getCover();
                if (cover != null) {
                    mo74936a(mo74942e());
                    C23515d.m57667a(cover, (C23520a) new C23520a() {
                        /* renamed from: a */
                        public final void mo48679a(C13745c<C13715a<C14042c>> cVar) {
                            C36193c cVar2 = C36193c.this;
                            Aweme aweme = aweme;
                            if (aweme == null || aweme.getVideo() == null) {
                                cVar2.mo74949h();
                                C36212f.m81744b(1, "aweme is empty");
                                return;
                            }
                            UrlModel cover = aweme.getVideo().getCover();
                            if (cover == null) {
                                cVar2.mo74949h();
                                C36212f.m81744b(1, "cover is empty");
                                return;
                            }
                            C0013i.m16a((Callable<TResult>) new Callable<Boolean>(cover, aweme) {

                                /* renamed from: a */
                                final /* synthetic */ UrlModel f92674a;

                                /* renamed from: b */
                                final /* synthetic */ Aweme f92675b;

                                public final /* synthetic */ Object call() throws Exception {
                                    List<String> urlList = this.f92674a.getUrlList();
                                    if (C9376b.m18558a((Collection<T>) urlList)) {
                                        C36193c.this.mo74949h();
                                        C36212f.m81744b(1, "urlList is empty");
                                    } else {
                                        for (String str : urlList) {
                                            if (str != null) {
                                                String a = C23515d.m57665a(str);
                                                if (C48016e.m103944b(a)) {
                                                    int lastIndexOf = a.lastIndexOf("/") + 1;
                                                    if (lastIndexOf >= 0 && lastIndexOf < a.length()) {
                                                        String substring = a.substring(lastIndexOf);
                                                        if (!TextUtils.isEmpty(substring)) {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(C36212f.m81733a());
                                                            sb.append(substring);
                                                            String sb2 = sb.toString();
                                                            if (C48016e.m103944b(sb2) || C48016e.m103948c(a, sb2)) {
                                                                C18842a.m45934b(new Runnable(sb2, this.f92675b) {

                                                                    /* renamed from: a */
                                                                    final /* synthetic */ String f92678a;

                                                                    /* renamed from: b */
                                                                    final /* synthetic */ Aweme f92679b;

                                                                    public final void run() {
                                                                        C36205c.m81710a().f92687d.setThumbnailPath(this.f92678a);
                                                                        C36193c.this.mo74935a(this.f92679b);
                                                                    }

                                                                    {
                                                                        this.f92678a = r2;
                                                                        this.f92679b = r3;
                                                                    }
                                                                });
                                                                return Boolean.valueOf(true);
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    return Boolean.valueOf(false);
                                }

                                {
                                    this.f92674a = r2;
                                    this.f92675b = r3;
                                }
                            }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Boolean, Object>() {
                                public final Object then(C0013i<Boolean> iVar) throws Exception {
                                    if (iVar == null || !((Boolean) iVar.mo34e()).booleanValue()) {
                                        C36193c.this.mo74949h();
                                        C36212f.m81744b(1, "copy video thumbnail fail");
                                    }
                                    return null;
                                }
                            });
                        }

                        /* renamed from: a */
                        public final void mo48680a(Exception exc) {
                            if (C36193c.this.f92654b != null && !C36193c.this.f92654b.isFinishing()) {
                                C10691a.m21542b((Context) C36193c.this.f92654b, (int) R.string.at3).mo19066a();
                                C36193c.this.mo74937b();
                                StringBuilder sb = new StringBuilder("request image fail ");
                                sb.append(exc.getMessage());
                                C36212f.m81744b(1, sb.toString());
                            }
                        }
                    });
                } else {
                    return;
                }
            }
            return;
        }
        C10691a.m21545b((Context) this.f92654b, this.f92654b.getString(R.string.db6)).mo19066a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo74939b(Aweme aweme) {
        String str;
        Video video = aweme.getVideo();
        if (video == null) {
            return false;
        }
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH264 == null) {
            return false;
        }
        List urlList = playAddrH264.getUrlList();
        if (C9376b.m18558a((Collection<T>) urlList)) {
            return false;
        }
        if (urlList.size() > 2) {
            str = (String) urlList.get(2);
        } else {
            str = (String) urlList.get(0);
        }
        this.f92656d = C23079b.m56620a(aweme, LinkSelector.m46790a().mo39174a(str));
        if (!TextUtils.isEmpty(this.f92656d)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo74948c(String str) {
        int i;
        if (this.f92654b != null && !this.f92654b.isFinishing() && C48016e.m103944b(str) && this.f92653a != null) {
            Video video = this.f92653a.getVideo();
            int i2 = 0;
            if (video != null) {
                i2 = video.getWidth();
                i = video.getHeight();
            } else {
                i = 0;
            }
            C36205c.m81710a().f92687d.setId(this.f92653a.getAid());
            C36205c.m81710a().f92687d.setVideoPath(str);
            C36205c.m81710a().f92687d.setWidth(i2);
            C36205c.m81710a().f92687d.setHeight(i);
            C36205c.m81710a().f92687d.setSource("video_share");
            m81695i();
            C36205c.m81710a().mo74960b();
            C36205c.m81710a().mo74956a(this.f92654b);
        }
    }
}
