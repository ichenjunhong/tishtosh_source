package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.setting.AllowLongVideoThreshold;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.aa */
public final class C47660aa {

    /* renamed from: a */
    public static final C47660aa f120138a = new C47660aa();

    private C47660aa() {
    }

    /* renamed from: a */
    public static boolean m103162a(boolean z) {
        String str;
        Keva repo = Keva.getRepo("repo_cur_video_page_i18n");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        if (!repo.getBoolean(str, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m103161a(Activity activity, View view, boolean z) {
        String str;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(view, "anchorView");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        Keva.getRepo("repo_cur_video_page_i18n").storeBoolean(str, true);
        C10661a aVar = new C10661a(activity);
        String string = activity.getString(R.string.gry, new Object[]{Long.valueOf(AllowLongVideoThreshold.INSTANCE.videoThreshold() / 60000)});
        C52711k.m112236a((Object) string, "activity.getString(R.str…reshold() / (60 * 1000L))");
        C10660a a = aVar.mo19012a(string).mo19010a(5000).mo19016b(true).mo19014a();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        a.mo18998a(view, 48, (C9432q.m18670a((Context) activity) - iArr[0]) - a.mo19003d(), iArr[1] - a.mo19002c(), (float) a.mo19003d());
    }
}
