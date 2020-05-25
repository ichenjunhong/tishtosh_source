package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2369c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.c */
public final class C47251c {

    /* renamed from: a */
    public static File f119320a = new File(m102587b("mvres"));

    /* renamed from: b */
    public static String f119321b = "change_mode";

    /* renamed from: a */
    public static boolean m102583a() {
        if (C39618d.f101152P.mo83104b(C40790a.MvPlan) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m102589b() {
        return AVServiceImpl.createIInternalAVServicebyMonsterPlugin().avSettingsService().showMvThemeRecordMode();
    }

    /* renamed from: c */
    public static String m102590c() {
        StringBuilder sb = new StringBuilder();
        sb.append(C39618d.f101160a.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append("mvtheme");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m102592d() {
        StringBuilder sb = new StringBuilder();
        sb.append(m102580a("cover_tmp"));
        sb.append(File.separator);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(m102591c(".png"));
        return sb3.toString();
    }

    /* renamed from: d */
    public static void m102593d(String str) {
        f119321b = str;
    }

    /* renamed from: a */
    public static String m102580a(String str) {
        String b = m102587b(str);
        if (!new File(b).exists()) {
            new File(b).mkdirs();
        }
        return b;
    }

    /* renamed from: b */
    public static String m102587b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m102590c());
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m102582a(C29059c cVar) {
        if (cVar != null && cVar.mo58741R() != null) {
            ArrayList<String> arrayList = cVar.mo58741R().photoToSave;
            String str = cVar.mo58741R().mvAutoSaveToast;
            if (!C23715d.m58202a((Collection<T>) arrayList) && !TextUtils.isEmpty(str)) {
                C10691a.m21545b((Context) C39618d.f101160a, str).mo19066a();
                C0013i.m16a((Callable<TResult>) new C47252d<TResult>(arrayList)).mo20a(C47253e.f119323a, (Executor) C0013i.f24a);
            }
        }
    }

    /* renamed from: b */
    public static void m102588b(C29059c cVar) {
        if (cVar != null && cVar.mo58741R() != null) {
            C0013i.m16a((Callable<TResult>) new C47254f<TResult>(cVar));
        }
    }

    /* renamed from: a */
    public static void m102581a(Context context) {
        C43804f fVar = C43214dh.m94817a().f109289d;
        if (fVar != null) {
            if (!fVar.f110926c) {
                C10691a.m21548c(context, (int) R.string.gtn).mo19066a();
                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "3").mo47829a("task_id", fVar.f110924a).f61491a);
                return;
            }
            if (!fVar.f110929f) {
                C10691a.m21548c(context, (int) R.string.gtm).mo19066a();
                C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "6").mo47829a("task_id", fVar.f110924a).f61491a);
            }
        }
    }

    /* renamed from: c */
    public static String m102591c(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(time));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m102584a(ShortVideoContext shortVideoContext) {
        if (!m102589b() || shortVideoContext == null || shortVideoContext.mo86365f() || shortVideoContext.mo86366g()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m102585a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f119230a == null || C23715d.m58202a((Collection<T>) mvThemeData.f119230a.getTags())) {
            return false;
        }
        return mvThemeData.f119230a.getTags().contains("NeedServerAlgorithm");
    }

    /* renamed from: a */
    public static boolean m102586a(String str, String str2, int i, int i2, int i3) {
        if (!C48016e.m103944b(str)) {
            return false;
        }
        Bitmap a = C47249a.m102571a(str, i, i2, C47249a.m102576b(str), i3);
        if (a == null) {
            return false;
        }
        return C47249a.m102574a(a, new File(str2), 100, CompressFormat.PNG);
    }
}
