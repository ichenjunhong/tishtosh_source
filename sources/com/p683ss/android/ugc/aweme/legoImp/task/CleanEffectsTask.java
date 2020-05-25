package com.p683ss.android.ugc.aweme.legoImp.task;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.aweme.storage.C2562f;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.effect.EffectCompatJobService;
import com.p683ss.android.ugc.aweme.effect.EffectJobService;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.main.C36606dx;
import com.p683ss.android.ugc.aweme.optimize.CleanEffectAB;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask */
public class CleanEffectsTask implements LegoTask {
    private static volatile boolean checked;
    private static boolean enableEffectDiskCache = C10181b.m20511a().mo18172a(CleanEffectAB.class, true, "use_effect_clean", 31744, true);
    private static volatile boolean started;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    static final /* synthetic */ Object lambda$startCleanEffect$0$CleanEffectsTask(Context context) throws Exception {
        if (context != null) {
            startCleanJob(context.getApplicationContext());
        }
        return null;
    }

    public void run(Context context) {
        if (enableEffectDiskCache) {
            try {
                AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().draftEffectList();
            } catch (Exception unused) {
            }
        }
    }

    public static void startCleanEffect(Context context) {
        if (enableEffectDiskCache && context != null && !started && C11016e.m22312g() == null) {
            C0013i.m18a((Callable<TResult>) new C35975b<TResult>(context), (Executor) C24076h.m58904e());
        }
    }

    public static boolean effectNeedClean(Context context) {
        checked = true;
        C36606dx dxVar = (C36606dx) C23393g.m57474a(context, C36606dx.class);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - dxVar.mo48510a(0) < 259200000) {
            return false;
        }
        String effectCacheDir = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().effectCacheDir();
        if (TextUtils.isEmpty(effectCacheDir) || new File(effectCacheDir).list() == null || new File(effectCacheDir).list().length == 0) {
            return false;
        }
        File file = new File(effectCacheDir, "journal");
        if (!file.exists() || file.isDirectory()) {
            if (dxVar.mo48519c(true)) {
                return true;
            }
        } else if (currentTimeMillis - file.lastModified() > 259200000) {
            return true;
        }
        dxVar.mo48514b(currentTimeMillis);
        return false;
    }

    public static void startCleanJob(Context context) {
        if (!started && context != null && !checked) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException unused) {
            }
            if (effectNeedClean(context)) {
                started = true;
                if (VERSION.SDK_INT >= 26) {
                    try {
                        if (!EffectCompatJobService.f76222b) {
                            EffectCompatJobService.f76222b = true;
                            Builder builder = new Builder(EffectCompatJobService.f76221a, new ComponentName(context, EffectCompatJobService.class));
                            builder.setMinimumLatency(0);
                            builder.setOverrideDeadline(3000);
                            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
                        }
                    } catch (Exception unused2) {
                    }
                    return;
                }
                Intent intent = new Intent(context, EffectJobService.class);
                if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                    context.startService(intent);
                }
            }
        }
    }

    public static void cleanCache(File file, ArrayList<String> arrayList) {
        if (file != null && file.exists() && file.isDirectory()) {
            if (arrayList.isEmpty()) {
                C2562f.m7499b(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (!file2.isDirectory()) {
                        file2.delete();
                    } else if (!arrayList.contains(file2.getName())) {
                        C2562f.m7499b(file2);
                    }
                }
            }
        }
    }
}
