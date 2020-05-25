package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.LongSparseArray;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p526f.C9407a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.settings.EnablePreloadOptSettings;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask */
public class PreloadResCleanerTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        if (C10193n.m20607a().mo18204a(EnablePreloadOptSettings.class, "enable_preload_opt", C10181b.m20511a().mo18175c().getEnablePreloadOpt(), false)) {
            if (VERSION.SDK_INT >= 24) {
                preloadResCleaner(context);
                return;
            }
            if (VERSION.SDK_INT >= 23) {
                preloadResCleanerForM(context);
            }
        }
    }

    private void preloadResCleanerForM(Context context) {
        try {
            Resources resources = context.getApplicationContext().getResources();
            Object a = C9407a.m18598a((Object) resources, "sPreloadedDrawables");
            if (a instanceof LongSparseArray[]) {
                for (LongSparseArray a2 : (LongSparseArray[]) a) {
                    C9376b.m18557a((Object) a2);
                }
            } else {
                C9376b.m18557a((Object) (LongSparseArray) a);
            }
            C9376b.m18557a(C9407a.m18598a((Object) resources, "sPreloadedColorDrawables"));
            C9376b.m18557a(C9407a.m18598a((Object) resources, "sPreloadedColorStateLists"));
            C9376b.m18557a(C9407a.m18598a((Object) resources, "mDrawableCache"));
            C9376b.m18557a(C9407a.m18598a((Object) resources, "mColorDrawableCache"));
            C9376b.m18557a(C9407a.m18598a((Object) resources, "mColorStateListCache"));
        } catch (Exception unused) {
        }
    }

    private void preloadResCleaner(Context context) {
        try {
            Object a = C9407a.m18598a((Object) context.getApplicationContext().getResources(), "mResourcesImpl");
            if (a != null) {
                Object a2 = C9407a.m18598a(a, "sPreloadedDrawables");
                if (a2 instanceof LongSparseArray[]) {
                    for (LongSparseArray a3 : (LongSparseArray[]) a2) {
                        C9376b.m18557a((Object) a3);
                    }
                } else {
                    C9376b.m18557a((Object) (LongSparseArray) a2);
                }
                C9376b.m18557a(C9407a.m18598a(a, "sPreloadedColorDrawables"));
                C9376b.m18557a(C9407a.m18598a(a, "sPreloadedComplexColors"));
                Object a4 = C9407a.m18598a(a, "mDrawableCache");
                if (a4 != null) {
                    C9376b.m18557a(C9407a.m18598a(a4, "mNullThemedEntries"));
                    C9376b.m18557a(C9407a.m18598a(a4, "mThemedEntries"));
                    C9376b.m18557a(C9407a.m18598a(a4, "mUnthemedEntries"));
                }
                C9376b.m18557a(C9407a.m18598a(a, "mDrawableCache"));
                C9376b.m18557a(C9407a.m18598a(a, "mColorDrawableCache"));
                C9376b.m18557a(C9407a.m18598a(a, "mColorStateListCache"));
            }
        } catch (Exception unused) {
        }
    }
}
