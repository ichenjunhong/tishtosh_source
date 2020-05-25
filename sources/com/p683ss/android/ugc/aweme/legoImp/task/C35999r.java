package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import com.p683ss.android.jank.SatanInitTask;
import com.p683ss.android.legoimpl.BusinessToolsTask;
import com.p683ss.android.sdk.app.AbTestSdkInitTask;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.legoImpl.task.InitFireBase;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.r */
public final class C35999r {

    /* renamed from: a */
    private static LegoTask f92233a;

    /* renamed from: b */
    private static LegoTask f92234b;

    /* renamed from: c */
    private static LegoTask f92235c;

    /* renamed from: d */
    private static LegoTask f92236d;

    /* renamed from: e */
    private static LegoTask f92237e;

    /* renamed from: f */
    private static LegoTask f92238f;

    /* renamed from: a */
    public static LegoTask m81180a() {
        if (f92236d == null) {
            f92236d = new InitModules();
        }
        return f92236d;
    }

    /* renamed from: b */
    public static LegoTask m81182b() {
        if (f92238f == null) {
            f92238f = new SatanInitTask();
        }
        return f92238f;
    }

    /* renamed from: c */
    public static LegoTask m81183c() {
        if (f92234b == null) {
            f92234b = new FrescoTask();
        }
        return f92234b;
    }

    /* renamed from: d */
    public static LegoTask m81184d() {
        if (f92233a == null) {
            f92233a = new AbTestSdkInitTask();
        }
        return f92233a;
    }

    /* renamed from: e */
    public static LegoTask m81185e() {
        if (f92235c == null) {
            f92235c = new InitFireBase();
        }
        return f92235c;
    }

    /* renamed from: a */
    public static LegoTask m81181a(Application application) {
        if (f92237e == null) {
            f92237e = new BusinessToolsTask(application);
        }
        return f92237e;
    }
}
