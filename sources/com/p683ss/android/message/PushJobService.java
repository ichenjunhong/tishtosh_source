package com.p683ss.android.message;

import android.app.Service;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p526f.C9409b;
import com.p683ss.android.pushmanager.p1204a.C19662b;
import com.p683ss.android.pushmanager.setting.C19710b;

/* renamed from: com.ss.android.message.PushJobService */
public class PushJobService extends Service {

    /* renamed from: a */
    private IBinder f53643a;

    /* renamed from: com.ss.android.message.PushJobService$a */
    static class C19407a extends JobService implements C9382a {

        /* renamed from: a */
        public IBinder f53644a = onBind(null);

        /* renamed from: b */
        private C9381g f53645b;

        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        public final void handleMsg(Message message) {
            try {
                if (message.what == 1) {
                    jobFinished((JobParameters) message.obj, false);
                }
            } catch (Throwable unused) {
            }
        }

        public C19407a(Service service) {
            C9409b.m18609a((Object) this).mo17052a("attachBaseContext", (Class<?>[]) new Class[]{Context.class}, service);
            C19662b.m48032a(this);
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            try {
                Intent intent = new Intent(this, NotifyService.class);
                intent.setAction("com.ss.android.message.action.PUSH_SERVICE");
                intent.setPackage(getPackageName());
                startService(intent);
                Intent intent2 = new Intent();
                intent2.setPackage(getPackageName());
                intent2.setClassName(getPackageName(), "com.taobao.accs.ChannelService");
                startService(intent2);
            } catch (Throwable unused) {
            }
            if (this.f53645b == null) {
                this.f53645b = new C9381g(this);
            }
            this.f53645b.sendMessage(Message.obtain(this.f53645b, 1, jobParameters));
            return true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 21) {
            try {
                this.f53643a = new C19407a(this).f53644a;
            } catch (Throwable unused) {
            }
        }
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* renamed from: b */
    static void m47499b(Context context) {
        try {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(1);
        } catch (Throwable unused) {
        }
    }

    public IBinder onBind(Intent intent) {
        if (this.f53643a != null) {
            return this.f53643a;
        }
        return new Binder();
    }

    /* renamed from: a */
    static void m47498a(Context context) {
        try {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.cancel(1);
            Builder builder = new Builder(1, new ComponentName(context.getPackageName(), PushJobService.class.getName()));
            builder.setPeriodic((long) (C19710b.m48173a().mo41109s() * 1000));
            builder.setPersisted(true);
            builder.setRequiredNetworkType(0);
            jobScheduler.schedule(builder.build());
        } catch (Throwable unused) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
