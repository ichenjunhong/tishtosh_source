package com.p683ss.android.newmedia.message;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.message.C19487k;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.client.MessageAppManager;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.pushmanager.thirdparty.PushManager;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.newmedia.message.MessageReceiverService */
public abstract class MessageReceiverService extends IntentService implements C9382a {

    /* renamed from: a */
    private C9381g f53951a;

    /* renamed from: b */
    private Messenger f53952b;

    /* renamed from: a */
    public abstract void mo40811a(Context context, int i, String str, int i2, String str2);

    public void handleMsg(Message message) {
    }

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    public void onCreate() {
        super.onCreate();
        C19700f.m48124a();
    }

    /* renamed from: a */
    private Handler m47868a() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private void m47870b() {
        boolean z;
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (C19710b.m48173a().mo41106p()) {
            if (VERSION.SDK_INT >= 20) {
                z = powerManager.isInteractive();
            } else {
                z = powerManager.isScreenOn();
            }
            if (!z) {
                powerManager.newWakeLock(268435462, "MessageReceiverService").acquire((long) C19710b.m48173a().mo41107q());
            }
        }
    }

    public IBinder onBind(final Intent intent) {
        if (intent != null) {
            C19487k.m47712a().mo40629a(new Runnable() {
                public final void run() {
                    MessageReceiverService.this.onHandleIntent(intent);
                    MessageReceiverService.this.stopSelf();
                }
            });
        }
        if (this.f53952b == null) {
            this.f53951a = new C9381g(this);
            this.f53952b = new Messenger(this.f53951a);
        }
        return this.f53952b.getBinder();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (C19710b.m48173a().mo41094c()) {
                    try {
                        if ("com.ss.android.message".equals(action)) {
                            String handleMySelfPushIntent = MessageAppManager.inst().handleMySelfPushIntent(intent);
                            if (!C9431p.m18664a(handleMySelfPushIntent)) {
                                mo40811a(this, 1, handleMySelfPushIntent, 2, null);
                                m47870b();
                            }
                        } else {
                            if ("com.ss.android.xiaomi.message".equals(action) || "com.ss.android.umeng.message".equals(action) || "com.ss.android.gcm.message".equals(action) || "com.ss.android.hw.message".equals(action) || "com.ss.android.mz.message".equals(action) || "com.ss.android.aliyun.message".equals(action) || "com.ss.android.vivo.message".equals(action) || "com.ss.android.oppo.message".equals(action) || "com.ss.android.adm.message".equals(action) || "com.ss.android.fcm.message".equals(action)) {
                                int intExtra = intent.getIntExtra(CustomActionPushReceiver.f104056a, -1);
                                String stringExtra = intent.getStringExtra(CustomActionPushReceiver.f104057b);
                                int intExtra2 = intent.getIntExtra(CustomActionPushReceiver.f104058c, -1);
                                String stringExtra2 = intent.getStringExtra(CustomActionPushReceiver.f104059d);
                                if (intExtra != 0) {
                                    if (intExtra != 2) {
                                        mo40811a(this, intExtra, stringExtra, intExtra2, stringExtra2);
                                        m47870b();
                                    }
                                }
                                m47869a(this, intExtra, stringExtra, intExtra2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public int onStartCommand(final Intent intent, int i, final int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException unused) {
            if (m47868a() == null) {
                C19487k.m47712a().mo40629a(new Runnable() {
                    public final void run() {
                        try {
                            MessageReceiverService.this.onHandleIntent(intent);
                            MessageReceiverService.this.stopSelf(i2);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            return 2;
        } catch (Throwable unused2) {
            return 2;
        }
    }

    /* renamed from: a */
    private static void m47869a(Context context, int i, String str, int i2) {
        if (context != null && ((i == 0 || i == 2) && i == 0)) {
            try {
                C19710b.m48173a();
                if (!TextUtils.isEmpty(C19710b.m48175m())) {
                    PushManager inst = PushManager.inst();
                    Context applicationContext = context.getApplicationContext();
                    C19710b.m48173a();
                    inst.setAlias(applicationContext, C19710b.m48175m(), i2);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
