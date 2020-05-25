package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25654b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26426bk;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.c */
public class C26217c implements C26228k {

    /* renamed from: a */
    public static volatile boolean f69223a;

    /* renamed from: b */
    public static C26220e f69224b;

    /* renamed from: c */
    public static String f69225c;

    /* renamed from: m */
    private static volatile C26217c f69226m;

    /* renamed from: d */
    public boolean f69227d;

    /* renamed from: e */
    public boolean f69228e = true;

    /* renamed from: f */
    public boolean f69229f = true;

    /* renamed from: g */
    public String f69230g;

    /* renamed from: h */
    public boolean f69231h = true;

    /* renamed from: i */
    public boolean f69232i;

    /* renamed from: j */
    public boolean f69233j;

    /* renamed from: k */
    public boolean f69234k = true;

    /* renamed from: l */
    public boolean f69235l;

    /* renamed from: n */
    private String f69236n;

    /* renamed from: o */
    private boolean f69237o;

    /* renamed from: c */
    public final void mo53865c() {
        this.f69236n = null;
    }

    /* renamed from: d */
    public final String mo53866d() {
        return this.f69236n;
    }

    /* renamed from: g */
    public final boolean mo53867g() {
        return this.f69237o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53862a(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = m63506f()
            r1 = 0
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r10 = "原生开屏不展示 理由：青少年模式"
            r9.mo54162a(r10)
            return r1
        L_0x000f:
            boolean r0 = m63505e()
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r10 = "原生开屏不展示 理由：服务端下发字段过滤掉原生开屏"
            r9.mo54162a(r10)
            return r1
        L_0x001d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = m63504d(r9)
            if (r0 != 0) goto L_0x002b
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r10 = "原生开屏不展示 理由：根据awesomeAdId获取aweme为空"
            r9.mo54162a(r10)
            return r1
        L_0x002b:
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64121W(r0)
            if (r2 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.commercialize.utils.bz r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "原生开屏不展示 理由：该aweme已过期"
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r2.mo54162a(r9)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "5"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25654b.f67878a
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            java.lang.String r9 = "5"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            return r1
        L_0x0060:
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r3 = 0
            boolean r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.m71650a(r2, r0, r3)
            if (r2 != 0) goto L_0x008d
            com.ss.android.ugc.aweme.commercialize.utils.bz r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "原生开屏不展示 理由：该aweme无效"
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r2.mo54162a(r9)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63255B(r9, r0)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            return r1
        L_0x008d:
            com.ss.android.ugc.aweme.app.AwemeAppData r2 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
            boolean r2 = r2.f61129g
            if (r2 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：从通知打开"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "2"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "2"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x00ba:
            boolean r2 = r8.f69232i
            r4 = 1
            if (r2 != 0) goto L_0x0107
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            if (r2 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo r2 = r2.getSplashInfo()
            if (r2 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r0.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo r2 = r2.getSplashInfo()
            boolean r2 = r2.isDisableHotStartShow()
            if (r2 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r2 == 0) goto L_0x0107
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：热启动禁止启动原生开屏"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "7"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "7"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x0107:
            boolean r2 = r8.f69232i
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.f69233j
            if (r2 != 0) goto L_0x0134
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：不是从launcher打开"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "2"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "2"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x0134:
            boolean r2 = com.p683ss.android.ugc.aweme.main.C36552cc.m82444a()
            if (r2 == 0) goto L_0x0163
            boolean r2 = f69223a
            if (r2 != 0) goto L_0x0163
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：landing 到 follow 页，冷启动需要屏蔽掉原生开屏"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "9"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "9"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x0163:
            boolean r2 = r8.f69228e
            if (r2 != 0) goto L_0x018c
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：main activity not on feed"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "2"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "2"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x018c:
            boolean r2 = r8.f69232i
            if (r2 != 0) goto L_0x01c1
            boolean r2 = r8.f69235l
            if (r2 != 0) goto L_0x01c1
            com.ss.android.ugc.aweme.app.AwemeAppData r2 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
            boolean r2 = r2.f61135m
            if (r2 != 0) goto L_0x01c1
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：main activity not on top"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "2"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "2"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x01c1:
            boolean r2 = r8.f69229f
            if (r2 != 0) goto L_0x01e8
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：currentAwemeEnableTopView"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "6"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25654b.f67878a
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "6"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x01e8:
            com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64069l(r0)
            if (r2 != 0) goto L_0x0204
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：该aweme信息为空"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63255B(r9, r0)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            return r1
        L_0x0204:
            boolean r5 = r2.isInvalidAd()
            if (r5 == 0) goto L_0x022d
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：该aweme信息无效"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "4"
            java.lang.String r3 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25654b.f67878a
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "4"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x022d:
            com.ss.android.ugc.aweme.feed.model.Video r5 = r0.getVideo()
            if (r5 != 0) goto L_0x023c
            com.ss.android.ugc.aweme.app.AwemeApplication r5 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63255B(r5, r0)
        L_0x023a:
            r5 = 0
            goto L_0x0275
        L_0x023c:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r5.getPlayAddr()
            if (r5 == 0) goto L_0x026d
            java.util.List r5 = r5.getUrlList()
            boolean r5 = com.bytedance.common.utility.p522b.C9376b.m18558a(r5)
            if (r5 == 0) goto L_0x024d
            goto L_0x026d
        L_0x024d:
            java.lang.String r5 = r0.getAid()
            java.lang.String r5 = r8.mo53856a(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x026b
            com.ss.android.ugc.aweme.app.AwemeApplication r5 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r6 = "1"
            java.lang.String r7 = com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25654b.f67878a
            org.json.JSONObject r6 = r8.mo53857a(r6, r7)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r5, r0, r6)
            goto L_0x023a
        L_0x026b:
            r5 = 1
            goto L_0x0275
        L_0x026d:
            com.ss.android.ugc.aweme.app.AwemeApplication r5 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63255B(r5, r0)
            goto L_0x023a
        L_0x0275:
            if (r5 != 0) goto L_0x0286
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：该视频未预加载完成"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            return r1
        L_0x0286:
            int r2 = r2.getHotShowType()
            if (r2 != r4) goto L_0x02b5
            boolean r2 = r8.f69227d
            if (r2 == 0) goto L_0x02b5
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            java.lang.String r2 = "2"
            java.lang.String r3 = r8.m63507h()
            org.json.JSONObject r2 = r8.mo53857a(r2, r3)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63319b(r9, r0, r2)
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r2 = "原生开屏不展示 理由：该视频不符合展示场景，只要有评论、分享、dislike蒙层等都不出广告"
            r9.mo54162a(r2)
            com.ss.android.ugc.aweme.app.AwemeApplication r9 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r9, r0, r1, r10)
            java.lang.String r9 = "2"
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r1, r0, r9)
            return r1
        L_0x02b5:
            com.ss.android.ugc.aweme.app.AwemeApplication r1 = com.p683ss.android.ugc.aweme.app.AwemeApplication.m56199a()
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63289a(r1, r0, r4, r10)
            if (r10 == 0) goto L_0x02c2
            r8.f69230g = r9
            r8.f69236n = r9
        L_0x02c2:
            com.p683ss.android.ugc.aweme.commercialize.splash.C26227j.m63541a(r4, r0, r3)
            com.ss.android.ugc.aweme.commercialize.utils.bz r9 = com.p683ss.android.ugc.aweme.commercialize.utils.C26447bz.f69708a
            java.lang.String r10 = "原生开屏数据准备就绪"
            r9.mo54162a(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.C26217c.mo53862a(java.lang.String, boolean):boolean");
    }

    /* renamed from: f */
    public static boolean m63506f() {
        return TimeLockRuler.isTeenModeON();
    }

    private C26217c() {
    }

    /* renamed from: e */
    public static boolean m63505e() {
        if (f69224b != null) {
            return f69224b.mo53874d();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo53864b() {
        boolean z = !TextUtils.isEmpty(this.f69230g);
        if (!C26224g.f69256a) {
            C26224g.f69256a = z;
        }
        this.f69230g = null;
    }

    /* renamed from: h */
    private String m63507h() {
        if (AwemeAppData.m47851a().f61133k) {
            return "1";
        }
        if (AwemeAppData.m47851a().f61134l) {
            return "2";
        }
        if (!this.f69228e || (!this.f69232i && !this.f69235l && !AwemeAppData.m47851a().f61135m)) {
            return "3";
        }
        if (this.f69227d) {
            return "4";
        }
        if (!this.f69233j) {
            return "5";
        }
        return C25654b.f67878a;
    }

    /* renamed from: a */
    public static C26217c m63502a() {
        if (f69226m == null) {
            synchronized (C26217c.class) {
                if (f69226m == null) {
                    AwemeApplication a = AwemeApplication.m56199a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStorageDirectory().getPath());
                    sb.append("/Android/data/");
                    sb.append(a.getPackageName());
                    sb.append("/awemeSplashCache/");
                    f69225c = sb.toString();
                    f69224b = new C26220e(f69225c);
                    f69226m = new C26217c();
                }
            }
        }
        return f69226m;
    }

    /* renamed from: a */
    public final void mo53860a(boolean z) {
        this.f69237o = true;
    }

    /* renamed from: c */
    public static Aweme m63503c(String str) {
        return f69224b.mo53869a(str);
    }

    /* renamed from: d */
    private static Aweme m63504d(String str) {
        return f69224b.mo53871b(str);
    }

    /* renamed from: a */
    public final void mo53859a(Intent intent) {
        if (intent == null) {
            this.f69233j = false;
        } else {
            this.f69233j = C26426bk.m63900a(intent);
        }
    }

    /* renamed from: a */
    public final String mo53856a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f69225c);
        sb.append(str);
        String sb2 = sb.toString();
        if (new File(sb2).exists()) {
            return sb2;
        }
        return null;
    }

    /* renamed from: b */
    public final Long mo53863b(String str) {
        if (str == null) {
            return null;
        }
        Aweme d = m63504d(str);
        if (C26512f.m64070m(d) && d.getAwemeRawAd().getSplashInfo().isDisableHotStartShow()) {
            return d.getAwemeRawAd().getAdId();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r17v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo53855a(java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> r17, android.content.Context r18) throws java.lang.Exception {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.util.Iterator r2 = r17.iterator()
            r3 = 0
            r4 = 0
        L_0x000a:
            boolean r5 = r2.hasNext()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0058
            java.lang.Object r5 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r5
            java.lang.String r8 = "download_video_count"
            java.lang.String r9 = "raw ad download_video_count"
            org.json.JSONObject r9 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r1, r5, r9)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r1, r8, r5, r9)
            if (r4 == 0) goto L_0x0037
            com.bytedance.ies.abmock.b r10 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.abtest.AwemeSplashPreloadExperiment> r11 = com.p683ss.android.ugc.aweme.commercialize.abtest.AwemeSplashPreloadExperiment.class
            r12 = 1
            java.lang.String r13 = "awesome_splash_preload_optimize"
            r14 = 31744(0x7c00, float:4.4483E-41)
            r15 = 0
            int r8 = r10.mo18168a(r11, r12, r13, r14, r15)
            if (r8 != 0) goto L_0x003e
        L_0x0037:
            boolean r8 = r0.mo53861a(r1, r5)
            if (r8 == 0) goto L_0x003e
            r4 = 1
        L_0x003e:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64010a(r5, r7, r7, r3)
            com.ss.android.ugc.aweme.miniapp_api.model.e r6 = r5.getMicroAppInfo()
            if (r6 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.lego.a$f r6 = com.p683ss.android.ugc.aweme.lego.C35857a.m81001b()
            com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadManager$1 r7 = new com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadManager$1
            r7.<init>(r0, r5)
            com.ss.android.ugc.aweme.lego.a$f r5 = r6.mo74526a(r7)
            r5.mo74527a()
            goto L_0x000a
        L_0x0058:
            com.ss.android.ugc.aweme.commercialize.feed.d.a r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62925p()
            r2 = r17
            r1.mo53224a(r2)
            com.ss.android.ugc.aweme.commercialize.splash.e r1 = f69224b
            if (r1 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.commercialize.splash.e r1 = f69224b
            java.util.Iterator r2 = r17.iterator()
        L_0x006b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0098
            java.lang.Object r4 = r2.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4
            if (r4 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r5 = r4.getStatus()
            r5.setPrivateStatus(r3)
            r5.setAllowComment(r6)
            r5.setAllowShare(r6)
        L_0x0086:
            java.lang.String r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64120V(r4)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x006b
            java.util.Map r8 = r1.mo53870a()
            r8.put(r5, r4)
            goto L_0x006b
        L_0x0098:
            r1.mo53873c()
        L_0x009b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.splash.C26217c.mo53855a(java.util.List, android.content.Context):java.lang.Object");
    }

    /* renamed from: a */
    public final JSONObject mo53857a(String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_show_fail_type", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("ad_show_fail_type2_reason", str2);
            }
            String str4 = "awemelaunch";
            if (this.f69234k) {
                str3 = "1";
            } else {
                str3 = "2";
            }
            jSONObject2.put(str4, str3);
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo53858a(Context context, List<Aweme> list) {
        if (m63506f()) {
            for (Aweme l : list) {
                C26088l.m63372l(context, l, "teenage_mode");
            }
        } else if (m63505e()) {
            for (Aweme l2 : list) {
                C26088l.m63372l(context, l2, "low_device");
            }
        } else if (!C9376b.m18558a((Collection<T>) list)) {
            C0013i.m16a((Callable<TResult>) new C26219d<TResult>(this, list, context));
        }
    }

    /* renamed from: a */
    public boolean mo53861a(final Context context, final Aweme aweme) {
        VideoUrlModel videoUrlModel;
        C26447bz bzVar = C26447bz.f69708a;
        StringBuilder sb = new StringBuilder("开始预加载原生开屏数据 Aweme =");
        sb.append(aweme.getAid());
        bzVar.mo54162a(sb.toString());
        if (C26512f.m64121W(aweme)) {
            C26447bz.f69708a.mo54162a("过期数据，取消下载");
            C26088l.m63372l(context, aweme, "past_data");
            return false;
        }
        AwemeSplashInfo l = C26512f.m64069l(aweme);
        if (l == null) {
            C26447bz.f69708a.mo54162a("awemeSplashInfo为null，取消下载");
            C26088l.m63372l(context, aweme, "splash_info_null");
            return false;
        }
        int preloadType = l.getPreloadType();
        if (!C23718g.m58207b().mo49153d()) {
            C26447bz.f69708a.mo54162a("无网络，取消下载");
            C26088l.m63372l(context, aweme, "no_network");
            return false;
        } else if (C23718g.m58207b().mo49152c() || preloadType != 1) {
            C262181 r0 = new IDownloadListener() {
                public final void onProgress(DownloadInfo downloadInfo) {
                }

                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                    C26447bz.f69708a.mo54162a("原生开屏资源下载首次成功");
                }

                public final void onPause(DownloadInfo downloadInfo) {
                    C26447bz.f69708a.mo54162a("原生开屏资源下载暂停");
                }

                public final void onCanceled(DownloadInfo downloadInfo) {
                    Context context = context;
                    Aweme aweme = aweme;
                    C26088l.m63322b(context, "download_video_cancel", aweme, C26088l.m63373m(context, aweme, "raw ad download cancel"));
                    C26447bz.f69708a.mo54162a("原生开屏资源下载取消");
                }

                public final void onFirstStart(DownloadInfo downloadInfo) {
                    Context context = context;
                    Aweme aweme = aweme;
                    C26088l.m63322b(context, "download_video_start_first_sdk", aweme, C26088l.m63373m(context, aweme, "raw ad download video first start sdk"));
                    C26447bz.f69708a.mo54162a("原生开屏资源下载首次开始");
                }

                public final void onPrepare(DownloadInfo downloadInfo) {
                    Context context = context;
                    Aweme aweme = aweme;
                    C26088l.m63322b(context, "download_video_prepare", aweme, C26088l.m63373m(context, aweme, "raw ad download video prepare"));
                    C26447bz.f69708a.mo54162a("原生开屏资源下载准备");
                }

                public final void onStart(DownloadInfo downloadInfo) {
                    Context context = context;
                    Aweme aweme = aweme;
                    C26088l.m63322b(context, "download_video_start_sdk", aweme, C26088l.m63373m(context, aweme, "raw ad download video start sdk"));
                    C26447bz.f69708a.mo54162a("原生开屏资源下载开始");
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    Context context = context;
                    Aweme aweme = aweme;
                    C26088l.m63322b(context, "download_video_succeed", aweme, C26088l.m63373m(context, aweme, "raw ad download_video_succeed"));
                    C26227j.m63542a(true, aweme, (String) null, Integer.valueOf(-1));
                    C26447bz.f69708a.mo54162a("原生开屏资源下载成功");
                }

                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                    C26447bz.f69708a.mo54162a("原生开屏资源下载重试");
                }

                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                    C26447bz.f69708a.mo54162a("原生开屏资源下载延迟重试");
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    int i;
                    String str;
                    C26447bz.f69708a.mo54162a("原生开屏资源下载失败");
                    if (baseException == null) {
                        i = 0;
                    } else {
                        i = baseException.getErrorCode();
                    }
                    if (baseException == null) {
                        str = "";
                    } else {
                        str = baseException.getErrorMessage();
                    }
                    Context context = context;
                    Aweme aweme = aweme;
                    HashMap hashMap = new HashMap();
                    hashMap.put("failed_code", String.valueOf(i));
                    hashMap.put("failed_msg", str);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ad_extra_data", new C17971f().mo34889b(hashMap));
                    C26088l.m63322b(context, "download_video_failed", aweme, C26088l.m63264a(context, aweme, "raw ad download_video_failed", false, (Map<String, String>) hashMap2));
                    if (i == 1034) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C26217c.f69225c);
                        sb.append(aweme.getAid());
                        File file = new File(sb.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    C26227j.m63542a(false, aweme, str, Integer.valueOf(i));
                }
            };
            Video video = aweme.getVideo();
            if (video == null) {
                C26447bz.f69708a.mo54162a("取消下载 理由：video_null");
                C26088l.m63372l(context, aweme, "video_null");
                return false;
            }
            if (C32816h.m75716b().getAwesomeSplashForceUseH264().booleanValue()) {
                videoUrlModel = video.getPlayAddrH264();
            } else {
                videoUrlModel = video.getPlayAddr();
            }
            if (videoUrlModel == null) {
                C26447bz.f69708a.mo54162a("取消下载 理由：video_url_model_null");
                C26088l.m63372l(context, aweme, "video_url_model_null");
                return false;
            }
            videoUrlModel.setSourceId(aweme.getAid());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f69225c);
            sb2.append(videoUrlModel.getSourceId());
            if (new File(sb2.toString()).exists()) {
                C26447bz.f69708a.mo54162a("取消下载 理由：视频已预加载，不进行下载");
                C26088l.m63372l(context, aweme, "video_exists");
                return false;
            }
            List urlList = videoUrlModel.getUrlList();
            if (C9376b.m18558a((Collection<T>) urlList)) {
                C26447bz.f69708a.mo54162a("取消下载 理由：video_url_list_null");
                C26088l.m63372l(context, aweme, "video_url_list_null");
                return false;
            }
            String str = (String) urlList.get(0);
            if (TextUtils.isEmpty(str)) {
                C26447bz.f69708a.mo54162a("取消下载 理由：video_url_first_null");
                C26088l.m63372l(context, aweme, "video_url_first_null");
                return false;
            }
            ArrayList arrayList = new ArrayList(urlList);
            arrayList.remove(str);
            int a = C19884b.m48597a(str, f69225c);
            if (Downloader.getInstance(context).isDownloading(a)) {
                C26088l.m63372l(context, aweme, "is_downloading");
                C26447bz.f69708a.mo54162a("取消下载 理由：视频正在下载，不进行下载");
                return false;
            }
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(a);
            int i = 100;
            if (downloadInfo != null) {
                i = downloadInfo.getStatus();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("download_status", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_extra_data", new C17971f().mo34889b(hashMap));
            C26088l.m63322b(context, "download_video_start", aweme, C26088l.m63264a(context, aweme, "raw ad download video start", false, (Map<String, String>) hashMap2));
            Downloader.with(context).url(str).backUpUrls(arrayList).savePath(f69225c).md5(videoUrlModel.getFileHash()).name(aweme.getAid()).showNotification(false).mainThreadListener(r0).download();
            return true;
        } else {
            C26447bz.f69708a.mo54162a("非wifi，取消下载");
            C26088l.m63372l(context, aweme, "wifi_only");
            return false;
        }
    }
}
