package com.p683ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p683ss.android.socialbase.downloader.downloader.C19882a;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.downloader.C19886c;
import com.p683ss.android.socialbase.downloader.downloader.C19898j;
import com.p683ss.android.socialbase.downloader.downloader.C19898j.C19899a;
import com.p683ss.android.socialbase.downloader.downloader.C19904n;
import com.p683ss.android.socialbase.downloader.downloader.C19905o;
import com.p683ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.socialbase.downloader.p1212b.C19784e;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import com.p683ss.android.socialbase.downloader.p1221j.C19991b;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;
import com.p683ss.android.socialbase.downloader.p1221j.C19996g;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.impls.n */
public class C19974n extends C19882a implements ServiceConnection {

    /* renamed from: f */
    public static final String f54904f = "n";

    /* renamed from: g */
    public static int f54905g;

    /* renamed from: h */
    public static long f54906h;

    /* renamed from: i */
    public Handler f54907i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public boolean f54908j;

    /* renamed from: k */
    public ServiceConnection f54909k;

    /* renamed from: l */
    private C19898j f54910l;

    /* renamed from: m */
    private C19905o f54911m;

    /* renamed from: n */
    private int f54912n = -1;

    /* renamed from: f */
    public final void mo41477f() {
        if (this.f54910l == null) {
            mo41464a(C19884b.m48627x(), this);
        }
    }

    /* renamed from: a */
    public final void mo41466a(C19905o oVar) {
        this.f54911m = oVar;
    }

    public void onBindingDied(ComponentName componentName) {
        this.f54910l = null;
        if (this.f54911m != null) {
            this.f54911m.mo41623h();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f54910l = null;
        this.f54592c = false;
        if (this.f54911m != null) {
            this.f54911m.mo41623h();
        }
    }

    /* renamed from: a */
    public final void mo41462a(int i) {
        if (this.f54910l == null) {
            this.f54912n = i;
            mo41464a(C19884b.m48627x(), this);
            return;
        }
        try {
            this.f54910l.mo41554l(i);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final void mo41474c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            C19886c.m48631a().mo41483a(downloadTask.getDownloadId(), true);
            C19950a q = C19884b.m48620q();
            if (q != null) {
                q.mo41706a(downloadTask);
            }
        }
    }

    /* renamed from: a */
    public final IBinder mo41461a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            String str = "fix_sigbus_downloader_db";
            try {
                if (C19938a.f54784a == null) {
                    C19938a.f54784a = new JSONObject();
                }
                C19938a.f54784a.put(str, 1);
            } catch (JSONException unused) {
            }
        }
        return new C19973m();
    }

    /* renamed from: b */
    public final void mo41471b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder("tryDownload aidlService == null:");
            if (this.f54910l == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (this.f54910l == null) {
                mo41467a(downloadTask);
                mo41464a(C19884b.m48627x(), this);
                return;
            }
            if (this.f54591b.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.f54591b) {
                    if (this.f54591b.get(downloadTask.getDownloadId()) != null) {
                        this.f54591b.remove(downloadTask.getDownloadId());
                    }
                }
            }
            try {
                this.f54910l.mo41526a(C19996g.m49400a(downloadTask));
            } catch (RemoteException unused) {
            }
            synchronized (this.f54591b) {
                SparseArray clone = this.f54591b.clone();
                this.f54591b.clear();
                if (C19884b.m48620q() != null) {
                    for (int i = 0; i < clone.size(); i++) {
                        if (((DownloadTask) clone.get(clone.keyAt(i))) != null) {
                            try {
                                this.f54910l.mo41526a(C19996g.m49400a(downloadTask));
                            } catch (RemoteException unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41464a(Context context, ServiceConnection serviceConnection) {
        try {
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (C19994e.m49347a()) {
                intent.putExtra("fix_downloader_db_sigbus", C19938a.m48933b().mo41660a("fix_sigbus_downloader_db"));
            }
            if (serviceConnection != null) {
                if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                    context.bindService(intent, serviceConnection, 1);
                }
            }
            this.f54909k = serviceConnection;
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                context.startService(intent);
            }
        } catch (Throwable unused) {
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        this.f54910l = C19899a.m48725a(iBinder);
        if (VERSION.SDK_INT < 26 && C19991b.m49327a(UnReadVideoExperiment.LIKE_USER_LIST) && C19994e.m49347a()) {
            try {
                iBinder.linkToDeath(new DeathRecipient() {
                    public final void binderDied() {
                        String str = C19974n.f54904f;
                        StringBuilder sb = new StringBuilder("binderDied: mServiceConnection = ");
                        sb.append(C19974n.this.f54909k);
                        C19819a.m48486b(str, sb.toString());
                        if (C19974n.f54905g < 5 && System.currentTimeMillis() - C19974n.f54906h > 15000) {
                            C19974n.this.f54907i.postDelayed(new Runnable() {
                                public final void run() {
                                    C19974n.this.f54908j = true;
                                    try {
                                        C19974n.this.mo41464a(C19884b.m48627x(), C19974n.this);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }, 1000);
                            C19974n.f54905g++;
                            C19974n.f54906h = System.currentTimeMillis();
                        }
                    }
                }, 0);
            } catch (RemoteException unused) {
            }
            if (this.f54908j) {
                this.f54907i.postDelayed(new Runnable() {
                    public final void run() {
                        C19884b.m48611h().execute(new Runnable() {
                            public final void run() {
                                try {
                                    if (C19884b.m48627x() != null) {
                                        if (!TextUtils.isEmpty(C19784e.f54482a)) {
                                            if (C19884b.m48615l() != null) {
                                                C19904n a = C19971l.m49132a(true);
                                                if (a != null) {
                                                    List<DownloadInfo> d = a.mo41600d(C19784e.f54482a);
                                                    if (d != null && !d.isEmpty()) {
                                                        ArrayList arrayList = new ArrayList();
                                                        for (DownloadInfo downloadInfo : d) {
                                                            if (downloadInfo != null && downloadInfo.isNeedIndependentProcess() && downloadInfo.getRealStatus() == -5) {
                                                                arrayList.add(downloadInfo);
                                                            }
                                                        }
                                                        if (!arrayList.isEmpty()) {
                                                            new StringBuilder("resumeDownloaderProcessTaskForDied: resume size =").append(arrayList.size());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                }, 1000);
                this.f54908j = false;
            }
        }
        if (this.f54911m != null) {
            this.f54911m.mo41622a(iBinder);
        }
        StringBuilder sb = new StringBuilder("onServiceConnected aidlService!=null");
        if (this.f54910l != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" pendingTasks.size:");
        sb.append(this.f54591b.size());
        if (this.f54910l != null) {
            C19886c.m48631a().mo41485b();
            this.f54592c = true;
            this.f54594e = false;
            if (this.f54912n != -1) {
                try {
                    this.f54910l.mo41554l(this.f54912n);
                } catch (RemoteException unused2) {
                }
            }
            synchronized (this.f54591b) {
                if (this.f54910l != null) {
                    SparseArray clone = this.f54591b.clone();
                    this.f54591b.clear();
                    for (int i = 0; i < clone.size(); i++) {
                        DownloadTask downloadTask = (DownloadTask) clone.get(clone.keyAt(i));
                        if (downloadTask != null) {
                            try {
                                this.f54910l.mo41526a(C19996g.m49400a(downloadTask));
                            } catch (RemoteException unused3) {
                            }
                        }
                    }
                }
            }
        }
    }
}
