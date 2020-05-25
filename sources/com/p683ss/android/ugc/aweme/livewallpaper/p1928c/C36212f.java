package com.p683ss.android.ugc.aweme.livewallpaper.p1928c;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.UseLiveWallpaperExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.utils.C47927i;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47801c;
import com.ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.f */
public final class C36212f {

    /* renamed from: a */
    private static boolean f92694a;

    /* renamed from: a */
    public static boolean m81741a(Context context, String str) {
        WallpaperInfo wallpaperInfo;
        try {
            wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
        } catch (Exception unused) {
            wallpaperInfo = null;
        }
        if (wallpaperInfo == null) {
            return false;
        }
        String packageName = wallpaperInfo.getPackageName();
        if (m81748d()) {
            return "com.ss.android.ugc.tiktok.livewallpaper".equals(packageName);
        }
        return packageName.equals(str);
    }

    /* renamed from: a */
    public static boolean m81740a(Activity activity, String str) {
        if (!m81748d() || activity == null || activity.isFinishing()) {
            return false;
        }
        boolean a = C47927i.m103699a(activity, "com.ss.android.ugc.tiktok.livewallpaper");
        if (a && !m81745b(activity)) {
            return false;
        }
        m81736a(activity, a, str);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (com.p683ss.android.ugc.aweme.account.C20854a.m53167g().isMe(r5.getAuthor().getUid()) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (com.p683ss.android.ugc.aweme.account.C20854a.m53167g().isMe(r5.getAuthor().getUid()) != false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m81742a(com.p683ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            boolean r0 = m81747c()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            boolean r0 = m81746b(r5)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            int r0 = r0.getDownloadSetting()
            r3 = 3
            if (r0 == r3) goto L_0x0049
            switch(r0) {
                case 0: goto L_0x0047;
                case 1: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0062
        L_0x002b:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103756e(r5)
            com.ss.android.ugc.aweme.profile.model.User r3 = r5.getAuthor()
            if (r3 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r4 = r5.getAuthor()
            java.lang.String r4 = r4.getUid()
            boolean r3 = r3.isMe(r4)
            if (r3 == 0) goto L_0x0063
        L_0x0047:
            r0 = 1
            goto L_0x0063
        L_0x0049:
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r3 = r5.getAuthor()
            java.lang.String r3 = r3.getUid()
            boolean r0 = r0.isMe(r3)
            if (r0 == 0) goto L_0x0062
            goto L_0x0047
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0091
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72845m(r5)
            if (r0 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            if (r0 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r3 = r5.getAuthor()
            java.lang.String r3 = r3.getUid()
            boolean r0 = r0.isMe(r3)
            if (r0 != 0) goto L_0x0090
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            boolean r5 = r5.isSecret()
            if (r5 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            return r1
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f.m81742a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* renamed from: e */
    private static boolean m81749e() {
        if (!C47801c.m103432a() || VERSION.SDK_INT < 26) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m81733a() {
        File filesDir = C11010c.m22280a().getFilesDir();
        if (filesDir == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir);
        sb.append("/LiveWallpaper/");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m81743b() {
        StringBuilder sb = new StringBuilder();
        sb.append(m81733a());
        sb.append("fallback.mp4");
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m81747c() {
        if (C10181b.m20511a().mo18168a(UseLiveWallpaperExperiment.class, true, "use_live_wallpaper", 31744, 0) == 0 || ((Integer) SharePrefCache.inst().getUseLiveWallpaper().mo47782d()).intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m81748d() {
        boolean z;
        if (C10181b.m20511a().mo18168a(UseLiveWallpaperExperiment.class, true, "use_live_wallpaper", 31744, 0) == 2) {
            z = true;
        } else {
            z = false;
        }
        m81739a(z);
        if (!z || m81749e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m81745b(Activity activity) {
        if (14 > C47927i.m103700b(activity, "com.ss.android.ugc.tiktok.livewallpaper")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m81735a(Activity activity) {
        if (activity != null) {
            try {
                if (!C18920g.m46052b(activity, "com.android.vending")) {
                    SmartRouter.buildRoute((Context) activity, "aweme://webview/").withParam(Uri.parse("https://play.google.com/store/apps/details?id=com.ss.android.ugc.tiktok.livewallpaper")).withParam("hide_nav_bar", true).withParam("hide_status_bar", true).open();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ss.android.ugc.tiktok.livewallpaper"));
                intent.setPackage("com.android.vending");
                intent.addFlags(268435456);
                activity.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m81746b(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return true;
        }
        int width = video.getWidth();
        int height = video.getHeight();
        if (width == 0 || height == 0 || aweme.getAwemeType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m81737a(String str) {
        C26890h.m65011a("wallpaper_plugin_alert", C23089d.m56640a().mo47829a("group_id", str).f61491a);
    }

    /* renamed from: a */
    private static void m81739a(boolean z) {
        if (!f92694a && !z && !C47801c.m103432a()) {
            f92694a = true;
            C23131p.m56692a("livewall_not_use_plugin", "", C23088c.m56631a().mo47824a("message", "not use plugin").mo47825b());
        }
    }

    /* renamed from: a */
    public static void m81734a(int i, String str) {
        C23131p.m57776a("livewall_paper_setting", i, C23088c.m56631a().mo47824a("message", str).mo47825b());
        if (!TextUtils.isEmpty(str)) {
            C23131p.m56692a("type_livewallpaper_setting", "", C23088c.m56631a().mo47824a("message", str).mo47825b());
        }
    }

    /* renamed from: b */
    public static void m81744b(int i, String str) {
        C23131p.m57776a("livewall_paper_download", i, C23088c.m56631a().mo47824a("message", str).mo47825b());
        if (!TextUtils.isEmpty(str)) {
            C23131p.m56692a("type_livewall_paper_download", "", C23088c.m56631a().mo47824a("message", str).mo47825b());
        }
    }

    /* renamed from: a */
    private static void m81736a(final Activity activity, boolean z, String str) {
        int i;
        int i2;
        int i3;
        if (activity != null && !activity.isFinishing()) {
            if (z) {
                i = R.string.f7o;
            } else {
                i = R.string.bsg;
            }
            if (z) {
                i2 = R.string.f7p;
            } else {
                i2 = R.string.bsh;
            }
            if (z) {
                i3 = R.string.f7n;
            } else {
                i3 = R.string.bsf;
            }
            new C10643a(activity).mo18885a(i2).mo18899b(i).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a(i3, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C36212f.m81735a(activity);
                }
            }).mo18897a().mo18882b();
            m81737a(str);
        }
    }

    /* renamed from: a */
    public static void m81738a(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "wall_paper_success";
        } else {
            str3 = "wall_paper_fail";
        }
        C26890h.m65011a(str3, C23089d.m56640a().mo47829a("group_id", str).mo47829a("enter_from", str2).f61491a);
    }
}
