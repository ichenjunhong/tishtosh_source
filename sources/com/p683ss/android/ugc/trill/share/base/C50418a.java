package com.p683ss.android.ugc.trill.share.base;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.aweme.storage.C2553c;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.linkselector.LinkSelector;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C22925ae;
import com.p683ss.android.ugc.aweme.app.C22925ae.C22926a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.download.C23079b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23087b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.experiment.DownloadMaskExperiment;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30471a;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30478c.C30479a;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30532b;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p683ss.android.ugc.aweme.share.C41967ak;
import com.p683ss.android.ugc.aweme.share.C41967ak.C41968a.C41970b;
import com.p683ss.android.ugc.aweme.share.C42043i;
import com.p683ss.android.ugc.aweme.share.C42231s;
import com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.libra.LongVideoDownloadOptimize;
import com.p683ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment;
import com.p683ss.android.ugc.aweme.share.p2159h.C42036b;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43819g;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43820h;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43821i;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43824l;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43826n;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45469z;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45540a;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45540a.C45544a;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.local.C48047a;
import com.p683ss.android.ugc.aweme.video.p2394c.C48004b;
import com.p683ss.android.ugc.aweme.watermark.C48250l;
import com.p683ss.android.ugc.aweme.watermark.C48258r;
import com.p683ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.p683ss.android.ugc.trill.share.base.C50441j.C50442a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.trill.share.base.a */
public final class C50418a {

    /* renamed from: C */
    public static boolean f126407C;

    /* renamed from: A */
    public boolean f126408A;

    /* renamed from: B */
    public boolean f126409B;

    /* renamed from: D */
    public C17432q<IWaterMarkService> f126410D;

    /* renamed from: E */
    public String f126411E;

    /* renamed from: F */
    public String f126412F;

    /* renamed from: G */
    long f126413G;

    /* renamed from: H */
    String f126414H;

    /* renamed from: I */
    String f126415I;

    /* renamed from: J */
    JSONObject f126416J;

    /* renamed from: K */
    public boolean f126417K;

    /* renamed from: L */
    C48258r f126418L;

    /* renamed from: M */
    private final String f126419M;

    /* renamed from: N */
    private final String f126420N;

    /* renamed from: O */
    private String f126421O;

    /* renamed from: P */
    private int f126422P;

    /* renamed from: Q */
    private Handler f126423Q;

    /* renamed from: R */
    private Runnable f126424R;

    /* renamed from: a */
    public final String f126425a;

    /* renamed from: b */
    public String f126426b;

    /* renamed from: c */
    public String f126427c;

    /* renamed from: d */
    public int f126428d;

    /* renamed from: e */
    public int f126429e;

    /* renamed from: f */
    public C45540a f126430f;

    /* renamed from: g */
    public String f126431g;

    /* renamed from: h */
    public String f126432h;

    /* renamed from: i */
    C52847n<Integer, String> f126433i;

    /* renamed from: j */
    protected Context f126434j;

    /* renamed from: k */
    public C30532b f126435k;

    /* renamed from: l */
    public String f126436l;

    /* renamed from: m */
    public UrlModel f126437m;

    /* renamed from: n */
    public boolean f126438n;

    /* renamed from: o */
    C26851b f126439o;

    /* renamed from: p */
    public int f126440p;

    /* renamed from: q */
    public Aweme f126441q;

    /* renamed from: r */
    public C43820h f126442r;

    /* renamed from: s */
    public long f126443s;

    /* renamed from: t */
    public long f126444t;

    /* renamed from: u */
    public C50441j f126445u;

    /* renamed from: v */
    C48250l f126446v;

    /* renamed from: w */
    public C48047a f126447w;

    /* renamed from: x */
    public C50431c f126448x;

    /* renamed from: y */
    public C50430b f126449y;

    /* renamed from: z */
    public boolean f126450z;

    /* renamed from: com.ss.android.ugc.trill.share.base.a$a */
    public static class C50429a {

        /* renamed from: a */
        public UrlModel f126464a;

        /* renamed from: b */
        public String f126465b;

        /* renamed from: c */
        public boolean f126466c;

        /* renamed from: d */
        public String f126467d;

        /* renamed from: a */
        public final void mo98347a(Aweme aweme, boolean z, boolean z2) {
            this.f126466c = z;
            if (z || C30530a.m71495c(aweme) || z2) {
                this.f126464a = aweme.getVideo().getPlayAddrH264();
                if (this.f126464a != null) {
                    String e = C47915gg.m103656e(aweme.getAuthor());
                    if (z2) {
                        this.f126466c = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f126464a.getUri());
                        sb.append(e);
                        sb.append("tag_no_water");
                        this.f126465b = C9395d.m18571a(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f126464a.getUri());
                        sb2.append(e);
                        this.f126465b = C9395d.m18571a(sb2.toString());
                    }
                }
            } else {
                if (TextUtils.equals(this.f126467d.toLowerCase(), "snapchat".toLowerCase())) {
                    this.f126464a = C42036b.m92001a(aweme);
                    if (this.f126464a != null) {
                        this.f126465b = C9395d.m18571a(this.f126464a.getUri());
                    }
                }
                if (this.f126464a == null) {
                    if (!MTEndWatermarkExperiment.m92638a() || !aweme.getVideo().hasEndWaterMark()) {
                        this.f126464a = aweme.getVideo().getDownloadAddr();
                        this.f126465b = C9395d.m18571a(aweme.getVideo().getDownloadAddr().getUri());
                    } else {
                        this.f126464a = aweme.getVideo().getSuffixLogoDownloadAddr();
                        this.f126465b = C9395d.m18571a(aweme.getVideo().getSuffixLogoDownloadAddr().getUri());
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.a$b */
    public class C50430b {

        /* renamed from: a */
        int f126468a;

        /* renamed from: b */
        public long f126469b;

        /* renamed from: c */
        int f126470c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C50430b mo98348a(boolean z) {
            this.f126468a = z ? 1 : 0;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C50430b mo98351b(boolean z) {
            this.f126470c = z ? 1 : 0;
            return this;
        }

        public C50430b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Void mo98349a(String str, long j, long j2) throws Exception {
            String d = C47723bk.m103316d(str);
            String str2 = str;
            long length = new File(str).length();
            mo98350a(j, length, 0, "", false);
            boolean equals = TextUtils.equals(d, "20");
            String str3 = "aweme_download_error_rate";
            C23088c cVar = new C23088c();
            String str4 = "Download_Rate";
            long j3 = 0;
            if (j2 != 0) {
                j3 = length / j2;
            }
            C23131p.m57776a(str3, 0, cVar.mo47823a(str4, Long.valueOf(j3)).mo47823a("Download_duration", Long.valueOf(j2)).mo47823a("file_size", Long.valueOf(length)).mo47824a("errorDesc", "success").mo47822a("errorCode", Integer.valueOf(-1)).mo47824a("url", C50418a.this.f126436l).mo47819a("isMp4", Boolean.valueOf(equals)).mo47825b());
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo98350a(long j, long j2, int i, String str, boolean z) {
            C23089d a = new C23089d().mo47827a("end_download", System.currentTimeMillis()).mo47827a("package_size", j2).mo47827a("duration", j - this.f126469b).mo47826a("is_self_video", this.f126470c).mo47829a("aweme_id", C50418a.this.f126441q.getAid()).mo47829a("download_url", C50418a.this.f126436l).mo47826a("is_server_watermark", this.f126468a);
            if (j2 == -1) {
                a.mo47826a("error_code", i).mo47826a("retry_failed", z ? 1 : 0).mo47829a("error_message", str);
            }
            C26890h.m65011a("download_end", a.f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.a$c */
    public class C50431c extends AbsDownloadListener {

        /* renamed from: b */
        private C50430b f126473b;

        /* renamed from: c */
        private WeakReference<Context> f126474c = new WeakReference<>(C50418a.this.f126434j);

        public final void onCanceled(DownloadInfo downloadInfo) {
            C50418a.this.f126408A = false;
            C50418a.this.f126447w.mo95321b(C50418a.this.f126434j);
            if (C50418a.this.f126450z) {
                C48016e.m103947c(C50418a.this.f126427c);
                C50418a.this.mo98338f();
                C50418a.this.f126450z = false;
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
            if (this.f126474c.get() != null) {
                C50418a.this.f126429e = C50418a.this.f126442r.mo89342a(C43824l.VIDEO_DOWNLOAD_TYPE, curBytes);
                C50418a.this.mo98339g();
            }
        }

        public final void onStart(DownloadInfo downloadInfo) {
            C50418a.this.f126408A = true;
            C50430b bVar = this.f126473b;
            bVar.f126469b = System.currentTimeMillis();
            C26890h.m65011a("download_start", new C23089d().mo47827a("start_download", bVar.f126469b).mo47826a("is_self_video", bVar.f126470c).mo47826a("is_server_watermark", bVar.f126468a).mo47829a("aweme_id", C50418a.this.f126441q.getAid()).mo47829a("download_url", C50418a.this.f126436l).f61491a);
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            int i;
            C50418a.this.f126408A = false;
            C50418a.this.f126447w.mo95321b(C50418a.this.f126434j);
            if (C50418a.this.f126450z) {
                C48016e.m103947c(C50418a.this.f126427c);
                C50418a.this.mo98338f();
                C50418a.this.f126450z = false;
                return;
            }
            C50418a aVar = C50418a.this;
            String aid = C50418a.this.f126441q.getAid();
            int awemeType = C50418a.this.f126441q.getAwemeType();
            C30479a a = new C30479a().mo60897a(aid);
            a.f79635b = 1;
            C30479a b = a.mo60899b(awemeType);
            b.mo60901c(((Integer) aVar.f126433i.getFirst()).intValue());
            aVar.f126439o.mo44934a_(b.mo60898a());
            String targetFilePath = downloadInfo.getTargetFilePath();
            if (targetFilePath != null) {
                C50418a.this.f126426b = targetFilePath;
                if (targetFilePath.length() != 0) {
                    File file = new File(targetFilePath);
                    if (this.f126473b.f126469b != 0) {
                        C50418a.this.f126443s = System.currentTimeMillis() - this.f126473b.f126469b;
                        C50418a.this.f126444t = file.length() / C50418a.this.f126443s;
                        C31300c.m73020d().mo64182a("download_success");
                        C50430b bVar = this.f126473b;
                        long currentTimeMillis = System.currentTimeMillis();
                        C50435e eVar = new C50435e(bVar, targetFilePath, currentTimeMillis, currentTimeMillis - bVar.f126469b);
                        C0013i.m16a((Callable<TResult>) eVar);
                        if (!C50418a.this.f126417K && !C50418a.this.f126438n) {
                            String str = targetFilePath;
                            i = -1;
                            C41967ak.m91935a(str, file.length(), Long.valueOf(C50418a.this.f126443s), C50418a.this.f126436l, false, Integer.valueOf(-1), "success", Boolean.valueOf(C42231s.m92666a(C50418a.this.f126441q, C50418a.this.f126432h)), C50418a.this.f126437m, C41967ak.m91937a(C50418a.this.f126441q));
                            C41967ak.m91936a(C50418a.this.f126441q.getAid(), C50418a.this.f126411E, C50418a.this.f126432h, "short", C41967ak.m91934a(C50418a.this.f126437m), 0);
                            C50418a aVar2 = C50418a.this;
                            C26890h.onEvent(MobClick.obtain().setEventName(aVar2.f126414H).setLabelName(aVar2.f126415I).setValue(String.valueOf(System.currentTimeMillis() - aVar2.f126413G)).setJsonObject(aVar2.f126416J));
                            if (file.length() < 2000 || !C32816h.m75716b().getSupportFilterErrorFile().booleanValue()) {
                                C50418a.this.mo98334b();
                            } else {
                                C50418a.this.mo98338f();
                                if (C50418a.this.f126436l.startsWith("http://")) {
                                    C50418a.this.f126436l = C50418a.this.f126436l.replace("http://", "https://");
                                    if (C50418a.this.f126448x == null) {
                                        C50418a.this.f126448x = new C50431c(C50418a.this.f126449y);
                                    }
                                    C50418a.this.f126447w.mo95320a((AbsDownloadListener) C50418a.this.f126448x);
                                    C50418a.this.f126436l = C23079b.m56620a(C50418a.this.f126441q, C50418a.this.f126436l);
                                    C48047a aVar3 = C50418a.this.f126447w;
                                    Context context = (Context) this.f126474c.get();
                                    String aid2 = C50418a.this.f126441q.getAid();
                                    String str2 = C50418a.this.f126436l;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(C50418a.this.f126431g);
                                    sb.append(".mp4");
                                    aVar3.mo95319a(context, aid2, str2, sb.toString(), C50418a.this.f126425a);
                                    return;
                                }
                                C50418a.this.f126428d = 3;
                                onFailed(null, new BaseException(i, "下载被劫持"));
                                return;
                            }
                        }
                    }
                    i = -1;
                    C50418a aVar22 = C50418a.this;
                    C26890h.onEvent(MobClick.obtain().setEventName(aVar22.f126414H).setLabelName(aVar22.f126415I).setValue(String.valueOf(System.currentTimeMillis() - aVar22.f126413G)).setJsonObject(aVar22.f126416J));
                    if (file.length() < 2000) {
                    }
                    C50418a.this.mo98334b();
                }
            }
        }

        public C50431c(C50430b bVar) {
            this.f126473b = bVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            boolean z;
            C50418a.this.f126408A = false;
            C50418a.this.f126447w.mo95321b(C50418a.this.f126434j);
            if (baseException == null) {
                C50418a.this.mo98335c();
            } else if (this.f126474c.get() != null) {
                if (C50418a.this.f126450z) {
                    C48016e.m103947c(C50418a.this.f126427c);
                    C50418a.this.mo98338f();
                    C50418a.this.f126450z = false;
                    return;
                }
                Aweme aweme = C50418a.this.f126441q;
                String str = C50418a.this.f126436l;
                StringBuilder sb = new StringBuilder("DownloaderError:");
                if (baseException != null) {
                    sb.append("error_code:");
                    sb.append(baseException.getErrorCode());
                    sb.append(",");
                    sb.append("error_message:");
                    sb.append(baseException.getMessage());
                }
                if (aweme != null) {
                    sb.append(",");
                    sb.append("aweme_id:");
                    sb.append(aweme.getAid());
                }
                C22925ae.m56376a(sb.toString(), str);
                int errorCode = baseException.getErrorCode();
                Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f126473b.f126469b);
                String str2 = C50418a.this.f126436l;
                if (C50418a.this.f126417K || C50418a.this.f126438n) {
                    z = true;
                } else {
                    z = false;
                }
                C41967ak.m91935a(null, -1, valueOf, str2, z, Integer.valueOf(errorCode), baseException.getErrorMessage(), Boolean.valueOf(C42231s.m92666a(C50418a.this.f126441q, C50418a.this.f126432h)), C50418a.this.f126437m, C41967ak.m91937a(C50418a.this.f126441q));
                if (C50418a.this.f126428d < 3) {
                    this.f126473b.mo98350a(System.currentTimeMillis(), -1, errorCode, baseException.getErrorMessage(), false);
                    C50418a.this.f126428d++;
                    if (C50418a.this.f126437m != null && !C9376b.m18558a((Collection<T>) C50418a.this.f126437m.getUrlList())) {
                        C50418a.this.f126436l = LinkSelector.m46790a().mo39174a((String) C50418a.this.f126437m.getUrlList().get(C50418a.this.f126428d % C50418a.this.f126437m.getUrlList().size()));
                    }
                    C50418a.this.f126436l = C48004b.m103853a(C50418a.this.f126436l);
                    if (C50418a.this.f126448x == null) {
                        C50418a.this.f126448x = new C50431c(C50418a.this.f126449y);
                    }
                    C50418a.this.f126447w.mo95320a((AbsDownloadListener) C50418a.this.f126448x);
                    C50418a.this.f126436l = C23079b.m56620a(C50418a.this.f126441q, C50418a.this.f126436l);
                    C48047a aVar = C50418a.this.f126447w;
                    Context context = (Context) this.f126474c.get();
                    String aid = C50418a.this.f126441q.getAid();
                    String str3 = C50418a.this.f126436l;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C50418a.this.f126431g);
                    sb2.append(".mp4");
                    aVar.mo95319a(context, aid, str3, sb2.toString(), C50418a.this.f126425a);
                    return;
                }
                C50418a.this.mo98335c();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(baseException.getErrorMessage());
                sb3.append("    ***  重试次数 *** :");
                sb3.append(C50418a.this.f126428d);
                String sb4 = sb3.toString();
                if (C50436f.m108755a(C11010c.m22280a())) {
                    C23131p.m57776a("aweme_download_error_rate", 1, C23088c.m56631a().mo47822a("errorCode", Integer.valueOf(errorCode)).mo47824a("errorDes", sb4).mo47825b());
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(errorCode);
                String sb6 = sb5.toString();
                if (errorCode > 0 && C41967ak.m91937a(C50418a.this.f126441q)) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(sb6);
                    sb7.append("P");
                    sb6 = sb7.toString();
                }
                C31300c.m73020d().mo64183a("download_error", sb6);
                C23087b.m56630a("aweme_movie_download_log", "", sb4, C50418a.this.f126436l);
                this.f126473b.mo98350a(System.currentTimeMillis(), -1, errorCode, baseException.getErrorMessage(), true);
            }
        }
    }

    /* renamed from: b */
    public final void mo98334b() {
        m108733j();
    }

    /* renamed from: f */
    public final void mo98338f() {
        C48016e.m103947c(this.f126426b);
    }

    /* renamed from: j */
    private void m108733j() {
        C0013i.m18a((Callable<TResult>) new C50434d<TResult>(this), (Executor) C24076h.m58902c());
    }

    /* renamed from: g */
    public final void mo98339g() {
        if (this.f126429e >= 100) {
            this.f126429e = 100;
        } else if (this.f126429e < 0) {
            this.f126429e = 0;
        }
        C18842a.m45934b(this.f126424R);
    }

    /* renamed from: i */
    private boolean m108732i() {
        if (!C48016e.m103957g()) {
            C10691a.m21542b(this.f126434j, (int) R.string.da8).mo19066a();
            return false;
        } else if (C48016e.m103958h() >= 20971520) {
            return true;
        } else {
            C10691a.m21542b(this.f126434j, (int) R.string.da9).mo19066a();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo98330a() {
        if (this.f126434j instanceof Activity) {
            if (!((Activity) this.f126434j).isFinishing()) {
                if (VERSION.SDK_INT >= 17 && ((Activity) this.f126434j).isDestroyed()) {
                    return;
                }
            } else {
                return;
            }
        }
        if (this.f126430f != null && this.f126430f.isShowing()) {
            this.f126430f.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo98335c() {
        this.f126408A = false;
        this.f126409B = false;
        if (this.f126423Q.hasMessages(1)) {
            this.f126423Q.removeMessages(1);
        }
        if (this.f126450z) {
            C48016e.m103947c(this.f126427c);
            mo98338f();
        }
        C18842a.m45934b(new Runnable() {
            public final void run() {
                C50418a.this.mo98338f();
                C50418a.m108728a(false);
                if (C50418a.this.f126435k != null) {
                    C50418a.this.f126435k.mo62729b();
                }
                if (C50418a.this.f126434j != null) {
                    C50418a.this.mo98330a();
                    if (C50418a.this.f126440p == -113) {
                        C10691a.m21542b(C50418a.this.f126434j, (int) R.string.dhp).mo19066a();
                        return;
                    }
                    C10691a.m21542b(C50418a.this.f126434j, (int) R.string.d_q).mo19066a();
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo98336d() {
        this.f126408A = false;
        this.f126409B = false;
        if (this.f126423Q.hasMessages(1)) {
            this.f126423Q.removeMessages(1);
        }
        if (this.f126450z) {
            C48016e.m103947c(this.f126427c);
            mo98338f();
            this.f126450z = false;
            return;
        }
        mo98338f();
        C18842a.m45934b(new Runnable() {
            public final void run() {
                C50418a.this.mo98330a();
                C50418a.m108728a(false);
                if (C50418a.this.f126434j != null && C50418a.this.f126435k != null) {
                    C50418a.this.f126435k.mo62728a(C50418a.this.f126427c);
                }
            }
        });
    }

    /* renamed from: e */
    public final boolean mo98337e() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f126420N);
        sb.append(this.f126431g);
        sb.append("_mute.mp4");
        this.f126421O = sb.toString();
        C0013i a = C42231s.m92665a(this.f126427c, this.f126421O);
        try {
            a.mo36g();
            C48016e.m103947c(this.f126427c);
            if (((Integer) a.mo34e()).intValue() != 0) {
                String str = this.f126427c;
                Long valueOf = Long.valueOf(this.f126443s);
                String str2 = this.f126436l;
                if (!this.f126417K) {
                    if (!this.f126438n) {
                        z = false;
                        C41970b bVar = new C41970b(str, valueOf, (Integer) a.mo34e(), str2, z);
                        C0013i.m16a((Callable<TResult>) bVar);
                        C48016e.m103947c(this.f126421O);
                        return false;
                    }
                }
                z = true;
                C41970b bVar2 = new C41970b(str, valueOf, (Integer) a.mo34e(), str2, z);
                C0013i.m16a((Callable<TResult>) bVar2);
                C48016e.m103947c(this.f126421O);
                return false;
            }
            this.f126427c = this.f126421O;
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Void mo98340h() throws Exception {
        m108727a("download_time", "add_watermark");
        if (this.f126434j == null) {
            return null;
        }
        C48016e.m103935a(this.f126419M, false);
        if (this.f126417K || this.f126438n) {
            C50442a aVar = new C50442a(this.f126441q, this.f126431g);
            aVar.f126491f = this.f126417K;
            boolean z = this.f126438n;
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("ins_special");
            } else {
                sb.append("topleft");
            }
            if (!C43819g.m96248b() && z && MTEndWatermarkExperiment.m92638a()) {
                sb.append(",ins_ending");
            }
            aVar.f126489d = sb.toString();
            aVar.f126487b = 1;
            this.f126445u = new C50441j(aVar);
            C50441j jVar = this.f126445u;
            jVar.f126485a.f126486a = System.currentTimeMillis();
            C26890h.m65011a("client_watermark_start", new C23089d().mo47827a("start_watermark", jVar.f126485a.f126486a).mo47829a("watermark_id", jVar.f126485a.f126488c).mo47826a("watermark_sdk", jVar.f126485a.f126487b).mo47829a("watermark_type", jVar.f126485a.f126489d).mo47826a("is_self_video", jVar.f126485a.f126490e).f61491a);
            C31300c.m73020d().mo64182a("water_mark_start");
            this.f126408A = false;
            this.f126409B = true;
            C48250l lVar = this.f126446v;
            lVar.f121428n = this.f126443s;
            lVar.f121427m = this.f126444t;
            if (!this.f126438n || !MTEndWatermarkExperiment.m92638a()) {
                this.f126422P = 1;
            } else {
                this.f126422P = 2;
            }
            C41967ak.m91936a(this.f126441q.getAid(), this.f126411E, this.f126432h, "short", null, this.f126422P);
            ((IWaterMarkService) this.f126410D.get()).waterMark(this.f126446v);
        } else {
            C48016e.m103948c(this.f126426b, this.f126427c);
            if (!C42231s.m92666a(this.f126441q, this.f126432h) || mo98337e()) {
                mo98336d();
            } else {
                mo98335c();
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m108728a(boolean z) {
        C41922a.m91868a().isShareDownloading(z);
    }

    /* renamed from: b */
    private static C4221a m108729b(Context context) {
        return new C4221a(context);
    }

    /* renamed from: a */
    public static int m108725a(Context context) {
        if (C25282a.m61494a().isInLongVideoPage(C42149b.m92512a(context))) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private static boolean m108731b(Aweme aweme) {
        if (aweme == null || !C23794bh.m58393g().mo75755b(aweme) || aweme.getVideoControl() == null || aweme.getVideoControl().preventDownloadType != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo98331a(Aweme aweme) {
        mo98332a(aweme, false);
    }

    /* renamed from: a */
    private void m108727a(String str, String str2) {
        this.f126413G = System.currentTimeMillis();
        this.f126414H = str;
        this.f126415I = str2;
        this.f126416J = null;
    }

    private C50418a(Context context, boolean z) {
        this.f126410D = new C17432q<IWaterMarkService>() {

            /* renamed from: a */
            IWaterMarkService f126451a;

            public final /* synthetic */ Object get() {
                if (this.f126451a == null) {
                    this.f126451a = WaterMarkServiceImpl.createIWaterMarkServicebyMonsterPlugin();
                }
                return this.f126451a;
            }
        };
        this.f126411E = "";
        this.f126412F = "download_to_share";
        this.f126423Q = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                ValueAnimator valueAnimator;
                ObjectAnimator objectAnimator;
                ObjectAnimator objectAnimator2;
                if (1 == message.what && C50418a.this.f126430f != null && C50418a.this.f126430f.isShowing()) {
                    C50418a.this.f126430f.f115075c = new C45544a() {
                        /* renamed from: a */
                        public final void mo91826a() {
                            String str;
                            C50418a.this.f126450z = true;
                            C50418a.f126407C = true;
                            if (C50418a.this.f126408A) {
                                C50418a.this.f126447w.mo95317a(C50418a.this.f126434j);
                                C31300c.m73020d().mo64182a("download_cancel");
                            } else {
                                if (C50418a.this.f126409B) {
                                    ((IWaterMarkService) C50418a.this.f126410D.get()).cancelWaterMark();
                                }
                                C31300c.m73020d().mo64182a("water_mark_cancel");
                            }
                            C50418a.this.mo98335c();
                            String str2 = "download_cancel";
                            C23089d a = new C23089d().mo47829a("enter_from", C50418a.this.f126411E);
                            String str3 = "group_id";
                            if (C50418a.this.f126441q == null) {
                                str = "";
                            } else {
                                str = C50418a.this.f126441q.getAid();
                            }
                            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
                        }
                    };
                    C45540a aVar = C50418a.this.f126430f;
                    int b = (int) C9432q.m18687b(C50418a.this.f126434j, 180.0f);
                    if (aVar.f115074b) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        aVar.f115078f = aVar.findViewById(R.id.cfc);
                        ObjectAnimator objectAnimator3 = null;
                        if (aVar.f115078f != null) {
                            valueAnimator = ValueAnimator.ofInt(new int[]{aVar.f115078f.getWidth(), b});
                            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    C45540a.this.f115078f.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    C45540a.this.f115078f.requestLayout();
                                }
                            });
                            valueAnimator.setInterpolator(new LinearInterpolator());
                            valueAnimator.setDuration(200);
                            valueAnimator.setTarget(aVar.f115078f);
                        } else {
                            valueAnimator = null;
                        }
                        aVar.f115077e = (ImageView) aVar.findViewById(R.id.q8);
                        if (aVar.f115077e != null) {
                            objectAnimator = ObjectAnimator.ofFloat(aVar.f115077e, "alpha", new float[]{0.0f, 1.0f});
                            objectAnimator.setDuration(200);
                        } else {
                            objectAnimator = null;
                        }
                        aVar.f115076d = (TextView) aVar.findViewById(R.id.bld);
                        if (aVar.f115076d != null) {
                            objectAnimator3 = ObjectAnimator.ofFloat(aVar.f115076d, "alpha", new float[]{1.0f, 0.0f});
                            objectAnimator3.setDuration(100);
                            objectAnimator3.addListener(new AnimatorListener() {
                                public final void onAnimationCancel(Animator animator) {
                                }

                                public final void onAnimationRepeat(Animator animator) {
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    C45540a.this.f115076d.setText(R.string.ato);
                                }
                            });
                            objectAnimator2 = ObjectAnimator.ofFloat(aVar.f115076d, "alpha", new float[]{0.0f, 1.0f});
                            objectAnimator2.setDuration(100);
                        } else {
                            objectAnimator2 = null;
                        }
                        animatorSet.play(valueAnimator).with(objectAnimator);
                        animatorSet.play(objectAnimator).before(objectAnimator3);
                        animatorSet.play(objectAnimator3).before(objectAnimator2);
                        animatorSet.start();
                    }
                    C50418a.this.f126430f.mo91815a(true, 0.0f, C50418a.this.f126434j);
                }
            }
        };
        this.f126413G = -1;
        this.f126424R = new Runnable() {
            public final void run() {
                if (C50418a.this.f126430f != null && C50418a.this.f126430f.isShowing()) {
                    C50418a.this.f126430f.mo91814a(C50418a.this.f126429e);
                }
            }
        };
        this.f126418L = new C48258r() {
            /* renamed from: a */
            public final void mo95758a(int i) {
                if (C50418a.this.f126434j != null) {
                    C50418a.this.f126429e = C50418a.this.f126442r.mo89342a(C43824l.VIDEO_WATER_TYPE, i);
                    C50418a.this.mo98339g();
                }
            }

            /* renamed from: a */
            public final void mo95759a(String str) {
                C50418a.this.f126409B = false;
                if (C50418a.this.f126450z) {
                    C50418a.this.f126450z = false;
                    return;
                }
                if (C50418a.this.f126445u != null) {
                    C50418a.this.f126445u.mo98356a(1);
                }
                C31300c.m73020d().mo64182a("water_mark_success");
                if (!C42231s.m92666a(C50418a.this.f126441q, C50418a.this.f126432h) || C50418a.this.mo98337e()) {
                    C50418a.this.mo98336d();
                } else {
                    C50418a.this.mo98335c();
                }
            }

            /* renamed from: b */
            public final void mo95760b(int i) {
                C50418a.this.f126409B = false;
                C50418a.this.f126440p = i;
                if (C50418a.this.f126445u != null) {
                    C50418a.this.f126445u.mo98356a(0);
                }
                C31300c.m73020d().mo64182a("water_mark_error");
                String str = C50418a.this.f126426b;
                String str2 = C50418a.this.f126427c;
                Aweme aweme = C50418a.this.f126441q;
                StringBuilder sb = new StringBuilder("WaterMark:");
                sb.append("inputPath:");
                sb.append(str);
                sb.append(",");
                sb.append("outputPath:");
                sb.append(str2);
                if (aweme != null) {
                    sb.append(",");
                    sb.append("aweme_id:");
                    sb.append(aweme.getAid());
                }
                C22925ae.m56375a(sb.toString());
                if (C50418a.this.f126450z) {
                    C48016e.m103947c(C50418a.this.f126427c);
                    C50418a.this.mo98338f();
                    C50418a.this.f126450z = false;
                    return;
                }
                C50418a.this.mo98335c();
            }
        };
        this.f126434j = context;
        this.f126438n = z;
        this.f126447w = new C48047a();
        this.f126425a = C45469z.m99086b(context);
        this.f126419M = C45469z.m99092c(context);
        this.f126420N = C45469z.m99095d(context);
        this.f126439o = new C26851b();
        this.f126439o.mo54799a(new C30471a());
    }

    /* renamed from: a */
    public final void mo98332a(Aweme aweme, boolean z) {
        m108726a(aweme, null, z);
    }

    /* renamed from: a */
    public final void mo98333a(boolean z, Aweme aweme) {
        if (this.f126417K || this.f126438n) {
            this.f126446v = new C48250l();
            this.f126446v.mo95740a(this.f126426b).mo95742b(this.f126427c).mo95738a(C41922a.m91868a().getAVUserImpl(this.f126441q.getAuthor()), this.f126441q.getVideo()).mo95741a(this.f126417K).mo95743b(this.f126438n).mo95745c(false).mo95744c(C43826n.m96253a().mo89349d()).mo95739a(this.f126418L).mo95747d(true).mo95746d(this.f126436l);
        }
        if (z) {
            C2553c.m7469a("share");
            C48016e.m103935a(this.f126425a, false);
            m108727a("download_time", "download");
            C23131p.m57779a("ug_save_video_start", new JSONObject());
            this.f126436l = C48004b.m103853a(this.f126436l);
            this.f126449y = new C50430b().mo98351b(C30530a.m71491a(aweme)).mo98348a(aweme.getVideo().isHasWaterMark());
            this.f126408A = true;
            if (this.f126448x == null) {
                this.f126448x = new C50431c(this.f126449y);
            }
            this.f126447w.mo95320a((AbsDownloadListener) this.f126448x);
            this.f126436l = C23079b.m56620a(aweme, this.f126436l);
            C48047a aVar = this.f126447w;
            Context context = this.f126434j;
            String aid = aweme.getAid();
            String str = this.f126436l;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f126431g);
            sb.append(".mp4");
            aVar.mo95319a(context, aid, str, sb.toString(), this.f126425a);
            C31300c.m73020d().mo64182a("download_start");
            if (this.f126430f != null && this.f126430f.isShowing()) {
                this.f126430f.f115075c = new C45544a() {
                    /* renamed from: a */
                    public final void mo91826a() {
                        String str;
                        C50418a.this.f126450z = true;
                        C31300c.m73020d().mo64182a("download_cancel");
                        C50418a.this.f126447w.mo95317a(C50418a.this.f126434j);
                        C50418a.this.mo98330a();
                        String str2 = "download_cancel";
                        C23089d a = new C23089d().mo47829a("enter_from", "share_event").mo47826a("is_long_item", C50418a.m108725a(C50418a.this.f126434j));
                        String str3 = "group_id";
                        if (C50418a.this.f126441q == null) {
                            str = "";
                        } else {
                            str = C50418a.this.f126441q.getAid();
                        }
                        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("download_method", C50418a.this.f126412F).f61491a);
                    }
                };
                this.f126430f.mo91815a(true, 1.0f, this.f126434j);
            }
            if (this.f126417K || this.f126438n) {
                C0013i.m18a((Callable<TResult>) new C50433c<TResult>(this), (Executor) C24076h.m58902c());
            }
        } else {
            this.f126442r = new C43821i(false, true);
            mo98334b();
        }
    }

    /* renamed from: a */
    private void m108726a(Aweme aweme, String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        if (z || C30530a.m71494b(aweme)) {
            if (z) {
                if (!C30530a.m71493b(this.f126434j, aweme)) {
                    C22925ae.m56374a(C22926a.AUDITING, aweme);
                    return;
                }
            } else if (!C30530a.m71490a(this.f126434j, aweme)) {
                C22925ae.m56374a(C22926a.AUDITING, aweme);
                return;
            }
            if (aweme == null || aweme.getVideo() == null || aweme.getAuthor() == null) {
                C22925ae.m56374a(C22926a.AWEME, aweme);
            } else if (!m108732i()) {
                C22925ae.m56374a(C22926a.SDCARD, aweme);
            } else if (!C50437g.m108756a(this.f126434j)) {
                C10691a.m21543b(this.f126434j, (int) R.string.cg1, 1).mo19066a();
                C22925ae.m56374a(C22926a.NETWORK, aweme);
            } else if (m108731b(aweme) || LongVideoDownloadOptimize.m92637a()) {
                m108730b(aweme, null, z);
            } else {
                this.f126441q = aweme;
                if (!this.f126438n || !C30530a.m71492a(aweme, true)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f126438n = z2;
                if (this.f126438n || C30530a.m71492a(aweme, false)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f126417K = z3;
                if (C43819g.m96248b()) {
                    this.f126417K = true;
                }
                C50429a aVar = new C50429a();
                aVar.f126467d = this.f126432h;
                aVar.mo98347a(aweme, this.f126417K, z);
                this.f126417K = aVar.f126466c;
                this.f126431g = aVar.f126465b;
                this.f126437m = aVar.f126464a;
                if (this.f126437m == null || C9376b.m18558a((Collection<T>) this.f126437m.getUrlList())) {
                    C22925ae.m56374a(C22926a.DOWNLOAD_URL, aweme);
                    return;
                }
                if (this.f126437m != null && !C9376b.m18558a((Collection<T>) this.f126437m.getUrlList())) {
                    this.f126436l = LinkSelector.m46790a().mo39174a((String) this.f126437m.getUrlList().get(0));
                    if (C47935p.m103711d(this.f126441q)) {
                        this.f126436l = LinkSelector.m46790a().mo39174a((String) this.f126437m.getUrlList().get(this.f126437m.getUrlList().size() - 1));
                        if (this.f126436l.contains("ratio")) {
                            this.f126436l = this.f126436l.replaceAll("(ratio=[^&]*)", "ratio=default");
                        } else {
                            Builder buildUpon = Uri.parse(this.f126436l).buildUpon();
                            buildUpon.appendQueryParameter("ratio", "default");
                            this.f126436l = buildUpon.toString();
                        }
                    }
                }
                C42043i.m92008a(this.f126441q, this.f126411E, this.f126412F);
                if (!this.f126438n) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f126420N);
                    sb.append(this.f126431g);
                    sb.append(".mp4");
                    this.f126427c = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f126420N);
                    sb2.append(this.f126431g);
                    sb2.append("_ins.mp4");
                    this.f126427c = sb2.toString();
                }
                if (C48016e.m103944b(this.f126427c)) {
                    mo98336d();
                    return;
                }
                if (this.f126430f == null) {
                    int i = 3;
                    if (C10181b.m20511a().mo18172a(DownloadMaskExperiment.class, false, "downloading_no_mask", 31744, false)) {
                        i = R.style.gy;
                    }
                    this.f126430f = C45540a.m99198a(this.f126434j, this.f126434j.getResources().getString(R.string.d_p), null, i);
                    String str3 = "download_process_popup_show";
                    C23089d a = new C23089d().mo47829a("enter_from", this.f126411E).mo47826a("is_long_item", m108725a(this.f126434j));
                    String str4 = "group_id";
                    if (this.f126441q == null) {
                        str2 = "";
                    } else {
                        str2 = this.f126441q.getAid();
                    }
                    C26890h.m65011a(str3, a.mo47829a(str4, str2).mo47829a("download_method", this.f126412F).f61491a);
                }
                this.f126430f.mo91814a(0);
                m108728a(true);
                if (this.f126435k != null) {
                    this.f126435k.mo62727a();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f126425a);
                sb3.append(this.f126431g);
                sb3.append(".mp4");
                String sb4 = sb3.toString();
                this.f126426b = sb4;
                if (!C48016e.m103944b(sb4) || f126407C) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!this.f126417K || z) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                this.f126442r = new C43821i(z4, z5);
                if (this.f126417K || this.f126438n) {
                    this.f126446v = new C48250l();
                    this.f126446v.mo95740a(this.f126426b).mo95742b(this.f126427c).mo95738a(C41922a.m91868a().getAVUserImpl(this.f126441q.getAuthor()), this.f126441q.getVideo()).mo95741a(this.f126417K).mo95743b(this.f126438n).mo95745c(false).mo95744c(C43826n.m96253a().mo89349d()).mo95739a(this.f126418L).mo95747d(true).mo95746d(this.f126436l);
                }
                if (z4) {
                    C2553c.m7469a("share");
                    C48016e.m103935a(this.f126425a, false);
                    m108727a("download_time", "download");
                    C23131p.m57779a("ug_save_video_start", new JSONObject());
                    this.f126436l = C48004b.m103853a(this.f126436l);
                    this.f126449y = new C50430b().mo98351b(C30530a.m71491a(aweme)).mo98348a(aweme.getVideo().isHasWaterMark());
                    this.f126408A = true;
                    if (this.f126448x == null) {
                        this.f126448x = new C50431c(this.f126449y);
                    }
                    this.f126447w.mo95320a((AbsDownloadListener) this.f126448x);
                    this.f126436l = C23079b.m56620a(aweme, this.f126436l);
                    C48047a aVar2 = this.f126447w;
                    Context context = this.f126434j;
                    String aid = aweme.getAid();
                    String str5 = this.f126436l;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.f126431g);
                    sb5.append(".mp4");
                    aVar2.mo95319a(context, aid, str5, sb5.toString(), this.f126425a);
                    C31300c.m73020d().mo64182a("download_start");
                    if (this.f126417K || this.f126438n) {
                        C0013i.m18a((Callable<TResult>) new C50432b<TResult>(this), (Executor) C24076h.m58902c());
                    }
                } else {
                    this.f126442r = new C43821i(false, true);
                    mo98334b();
                }
                this.f126423Q.sendEmptyMessageDelayed(1, 30000);
            }
        } else {
            C10691a.m21545b(this.f126434j, this.f126434j.getString(R.string.b5r)).mo19066a();
            C22925ae.m56374a(C22926a.AUDITING, aweme);
        }
    }

    /* renamed from: b */
    private void m108730b(final Aweme aweme, String str, boolean z) {
        boolean z2;
        boolean z3;
        final boolean z4;
        boolean z5;
        double d;
        String str2;
        String str3;
        this.f126441q = aweme;
        if (!this.f126438n || !C30530a.m71492a(aweme, true)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f126438n = z2;
        if (this.f126438n || C30530a.m71492a(aweme, false)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f126417K = z3;
        if (C43819g.m96248b()) {
            this.f126417K = true;
        }
        C50429a aVar = new C50429a();
        aVar.f126467d = this.f126432h;
        aVar.mo98347a(aweme, this.f126417K, z);
        this.f126417K = aVar.f126466c;
        this.f126431g = aVar.f126465b;
        this.f126437m = aVar.f126464a;
        if (this.f126437m == null || C9376b.m18558a((Collection<T>) this.f126437m.getUrlList())) {
            C22925ae.m56374a(C22926a.DOWNLOAD_URL, aweme);
            return;
        }
        if (this.f126437m != null && !C9376b.m18558a((Collection<T>) this.f126437m.getUrlList())) {
            this.f126436l = LinkSelector.m46790a().mo39174a((String) this.f126437m.getUrlList().get(0));
            if (C47935p.m103711d(this.f126441q)) {
                this.f126436l = LinkSelector.m46790a().mo39174a((String) this.f126437m.getUrlList().get(this.f126437m.getUrlList().size() - 1));
                if (this.f126436l.contains("ratio")) {
                    this.f126436l = this.f126436l.replaceAll("(ratio=[^&]*)", "ratio=default");
                } else {
                    Builder buildUpon = Uri.parse(this.f126436l).buildUpon();
                    buildUpon.appendQueryParameter("ratio", "default");
                    this.f126436l = buildUpon.toString();
                }
            }
        }
        if (!this.f126438n) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f126420N);
            sb.append(this.f126431g);
            sb.append(".mp4");
            this.f126427c = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f126420N);
            sb2.append(this.f126431g);
            sb2.append("_ins.mp4");
            this.f126427c = sb2.toString();
        }
        C42043i.m92008a(this.f126441q, this.f126411E, this.f126412F);
        if (C48016e.m103944b(this.f126427c)) {
            mo98336d();
            return;
        }
        if (this.f126430f == null) {
            int i = 3;
            if (C10181b.m20511a().mo18172a(DownloadMaskExperiment.class, false, "downloading_no_mask", 31744, false)) {
                i = R.style.gy;
            }
            this.f126430f = C45540a.m99198a(this.f126434j, this.f126434j.getResources().getString(R.string.d_p), str, i);
            String str4 = "download_process_popup_show";
            C23089d a = new C23089d().mo47829a("enter_from", this.f126411E).mo47826a("is_long_item", m108725a(this.f126434j));
            String str5 = "group_id";
            if (this.f126441q == null) {
                str3 = "";
            } else {
                str3 = this.f126441q.getAid();
            }
            C26890h.m65011a(str4, a.mo47829a(str5, str3).mo47829a("download_method", this.f126412F).f61491a);
        }
        this.f126430f.mo91814a(0);
        m108728a(true);
        if (this.f126435k != null) {
            this.f126435k.mo62727a();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f126425a);
        sb3.append(this.f126431g);
        sb3.append(".mp4");
        String sb4 = sb3.toString();
        this.f126426b = sb4;
        if (!C48016e.m103944b(sb4) || f126407C) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!this.f126417K || z) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.f126442r = new C43821i(z4, z5);
        String str6 = "";
        if (this.f126437m != null) {
            double size = (double) this.f126437m.getSize();
            Double.isNaN(size);
            d = (size / 1024.0d) / 1024.0d;
            if (d > ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                str6 = C2240a.m6772a("%.2f", new Object[]{Double.valueOf(d)});
                this.f126430f.setMessage(this.f126434j.getString(R.string.g_l, new Object[]{str6}));
            } else {
                this.f126430f.setMessage(this.f126434j.getString(R.string.atl));
            }
        } else {
            d = 0.0d;
        }
        if (C23718g.m58207b().mo49152c() || d <= 5.0d) {
            mo98333a(z4, aweme);
            return;
        }
        C4221a b = m108729b(this.f126434j);
        DmtTextView dmtTextView = new DmtTextView(this.f126434j);
        dmtTextView.setMaxLines(2);
        dmtTextView.setTypeface(dmtTextView.getTypeface(), 1);
        dmtTextView.setTextColor(this.f126434j.getResources().getColor(R.color.a6b));
        dmtTextView.setText(R.string.g_i);
        dmtTextView.setTextSize(2, 17.0f);
        int b2 = (int) C9432q.m18687b(this.f126434j, 24.0f);
        dmtTextView.setPadding(b2, b2, b2, 0);
        b.mo9688a((View) dmtTextView);
        b.mo9695b((CharSequence) this.f126434j.getString(R.string.g_m, new Object[]{str6}));
        b.mo9691a(false);
        b.mo9685a((int) R.string.g_j, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                String str2 = "download_warning_popup_continue";
                C23089d a = new C23089d().mo47829a("enter_from", C50418a.this.f126411E).mo47826a("is_long_item", C50418a.m108725a(C50418a.this.f126434j));
                String str3 = "group_id";
                if (C50418a.this.f126441q == null) {
                    str = "";
                } else {
                    str = C50418a.this.f126441q.getAid();
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("download_method", C50418a.this.f126412F).f61491a);
                C50418a.this.mo98333a(z4, aweme);
            }
        });
        b.mo9694b(R.string.g_h, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                String str2 = "download_warning_popup_cancel";
                C23089d a = new C23089d().mo47829a("enter_from", C50418a.this.f126411E).mo47826a("is_long_item", C50418a.m108725a(C50418a.this.f126434j));
                String str3 = "group_id";
                if (C50418a.this.f126441q == null) {
                    str = "";
                } else {
                    str = C50418a.this.f126441q.getAid();
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("download_method", C50418a.this.f126412F).f61491a);
                C50418a.this.mo98330a();
            }
        });
        String str7 = "download_warning_popup_cancel";
        C23089d a2 = new C23089d().mo47829a("enter_from", this.f126411E).mo47826a("is_long_item", m108725a(this.f126434j));
        String str8 = "group_id";
        if (this.f126441q == null) {
            str2 = "";
        } else {
            str2 = this.f126441q.getAid();
        }
        C26890h.m65011a(str7, a2.mo47829a(str8, str2).mo47829a("download_method", this.f126412F).f61491a);
        b.mo9692a().show();
    }

    public C50418a(Context context, boolean z, int i, String str) {
        String str2;
        int i2;
        this(context, z);
        this.f126432h = str;
        String str3 = "";
        switch (i) {
            case 0:
                i2 = 0;
                str2 = "homepage_hot";
                break;
            case 1:
                i2 = 1;
                str2 = "homepage_follow";
                break;
            case 2:
                i2 = 2;
                str2 = "homepage_fresh";
                break;
            case 1000:
            case 2000:
                i2 = 3;
                str2 = "personal_homepage";
                break;
            case 1001:
            case 2001:
                i2 = 4;
                str2 = "personal_collection";
                break;
            case 3002:
                i2 = 5;
                str2 = "challenge_hot";
                break;
            case 3003:
                i2 = 9;
                str2 = "challenge";
                break;
            case 4000:
                i2 = 6;
                str2 = "music_hot";
                break;
            case 4001:
                i2 = 8;
                str2 = "music_new";
                break;
            case 5000:
                i2 = 7;
                str2 = "found";
                break;
            case 8000:
                i2 = 20;
                str2 = "window_follow";
                break;
            default:
                str2 = str3;
                i2 = -1;
                break;
        }
        this.f126433i = new C52847n<>(Integer.valueOf(i2), str2);
    }
}
