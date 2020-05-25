package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.support.annotation.Keep;
import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.crash.p555n.C9713t;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.sysoptimizer.ArtOptimizer;
import com.bytedance.sysoptimizer.DvmOptimizer;
import com.bytedance.sysoptimizer.Optimizer;
import com.bytedance.sysoptimizer.StackLeakChecker;
import com.bytedance.sysoptimizer.StackLeakChecker.StackLeakListener;
import com.bytedance.sysoptimizer.StackLeakItem;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask */
public class DvmLinearAllocOptTask implements LegoTask {

    @SettingsKey
    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask$StackLeakCheckerParamSettings */
    public interface StackLeakCheckerParamSettings {
        @C10179b
        public static final StackLeakCheckerParams VALUE = null;
    }

    @Keep
    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask$StackLeakCheckerParams */
    public static class StackLeakCheckerParams {
        @C17952c(mo34828a = "all_proc_opt_suspend")
        public boolean all_proc_opt_suspend;
        @C17952c(mo34828a = "auto_fix")
        public boolean auto_fix;
        @C17952c(mo34828a = "check_interval_mins")
        public int check_interval_mins = 100;
        @C17952c(mo34828a = "enable_checker")
        public boolean enable_checker;
        @C17952c(mo34828a = "report_threshold")
        public int report_threshold = 100;
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        StackLeakCheckerParams stackLeakCheckerParams;
        boolean z = true;
        try {
            stackLeakCheckerParams = (StackLeakCheckerParams) C10193n.m20607a().mo18202a(StackLeakCheckerParamSettings.class, "enable_stack_leak_checker", C10181b.m20511a().mo18175c().getEnableStackLeakChecker(), "com.ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask$StackLeakCheckerParams", StackLeakCheckerParams.class);
            try {
                z = true ^ C32816h.m75716b().getDisableDvmLinearAllocOpt().booleanValue();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            stackLeakCheckerParams = null;
        }
        C32458a.m75144a("DvmLinearAllocOptTask");
        if (z) {
            DvmOptimizer.optDvmLinearAllocBuffer(context);
        }
        if ((stackLeakCheckerParams != null && stackLeakCheckerParams.all_proc_opt_suspend) || C18920g.m46048a(context)) {
            ArtOptimizer.optSuspendTimeout(context);
        }
        if (stackLeakCheckerParams != null && stackLeakCheckerParams.enable_checker) {
            StackLeakChecker.registerStackLeakListener(new StackLeakListener() {
                public final void onLeakReport(ArrayList<StackLeakItem> arrayList) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        StackLeakItem stackLeakItem = (StackLeakItem) it.next();
                        Throwable th = new Throwable(stackLeakItem.getLeakItem());
                        th.setStackTrace(new StackTraceElement[]{new StackTraceElement("StackLeakSoName", stackLeakItem.getSoName(), stackLeakItem.getSoName(), stackLeakItem.getLeakCount())});
                        DvmLinearAllocOptTask.reportEvent(th, "stack_leak_info", "stackleak", "stackleak", "stackleak", "StackLeakChecker Thread");
                    }
                }
            });
            StackLeakChecker.setInterval(stackLeakCheckerParams.report_threshold, ((long) (stackLeakCheckerParams.check_interval_mins * 6)) * 10000000);
            StackLeakChecker.enableChecker(context, stackLeakCheckerParams.auto_fix);
        }
        int size = Optimizer.getLoadLibraryError().size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                reportEvent((Throwable) Optimizer.getLoadLibraryError().get(i), "load_so_exception", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "load_sysoptimizer_failed", "DvmLinearAllocOptTask Thread");
            }
        }
    }

    public static void reportEvent(Throwable th, String str, String str2, String str3, String str4, String str5) {
        C9585b a = C9585b.m19045a(th.getStackTrace()[th.getStackTrace().length - 1], C9713t.m19436a(th.getStackTrace()), str2, str5, false, str3, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(th.toString());
        a.mo17391a(str, (List<String>) arrayList);
        a.mo17390a(str4, "true");
        C9672d.m19295a(a);
    }
}
