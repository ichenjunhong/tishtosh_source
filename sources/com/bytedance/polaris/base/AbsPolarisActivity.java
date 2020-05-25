package com.bytedance.polaris.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9415i;
import com.bytedance.polaris.p821a.C12563i;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;

public class AbsPolarisActivity extends AppCompatActivity implements C12580b {

    /* renamed from: a */
    static final LinkedList<Activity> f32995a = new LinkedList<>();

    /* renamed from: d */
    private static int f32996d = R.anim.b2;

    /* renamed from: e */
    private static int f32997e = R.anim.b3;

    /* renamed from: f */
    private static int f32998f = R.anim.b4;

    /* renamed from: g */
    private static int f32999g = R.anim.b5;

    /* renamed from: h */
    private static int f33000h = R.anim.b6;

    /* renamed from: i */
    private static int f33001i = 0;

    /* renamed from: b */
    protected boolean f33002b;

    /* renamed from: c */
    public int f33003c = PreloadTask.BYTE_UNIT_NUMBER;

    /* renamed from: j */
    private boolean f33004j;

    /* renamed from: k */
    private long f33005k;

    /* renamed from: l */
    private boolean f33006l;

    /* renamed from: m */
    private Handler f33007m = new Handler(new Callback() {
        public final boolean handleMessage(Message message) {
            String str;
            if (message.what != 1024) {
                return false;
            }
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                StringBuilder sb = new StringBuilder("Start Activity Really: ");
                if (intent.getComponent() == null) {
                    str = "";
                } else {
                    str = intent.getComponent().getShortClassName();
                }
                sb.append(str);
                AbsPolarisActivity.this.startActivity(intent);
            }
            return true;
        }
    });

    /* renamed from: p_ */
    public final boolean mo23639p_() {
        return this.f33006l;
    }

    public void onPause() {
        super.onPause();
        this.f33006l = false;
        C12563i.m25225g();
    }

    public void onStart() {
        super.onStart();
        f33001i++;
    }

    public void finish() {
        int i;
        super.finish();
        if (this.f33003c == 1024) {
            i = f32997e;
        } else {
            i = f32999g;
        }
        overridePendingTransition(f33000h, i);
    }

    public boolean isDestroyed() {
        if (VERSION.SDK_INT < 17) {
            return this.f33002b;
        }
        try {
            return super.isDestroyed();
        } catch (Throwable unused) {
            return this.f33002b;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f33002b = true;
        synchronized (this) {
            f32995a.remove(this);
        }
    }

    public void onResume() {
        super.onResume();
        this.f33006l = true;
        C12563i.m25225g();
        if (this.f33004j) {
            this.f33004j = true ^ this.f33004j;
        }
    }

    public void onStop() {
        super.onStop();
        boolean z = false;
        this.f33006l = false;
        f33001i--;
        if (f33001i == 0) {
            z = true;
        }
        this.f33004j = z;
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            Intent intent = null;
            try {
                if (isTaskRoot()) {
                    intent = C18920g.m46046a((Context) this, getPackageName());
                }
                super.onBackPressed();
                if (intent != null) {
                    startActivity(intent);
                }
            } catch (IllegalStateException unused) {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f33003c == 1024) {
            i = f32996d;
        } else {
            i = f32998f;
        }
        overridePendingTransition(i, f33000h);
        this.f33005k = System.currentTimeMillis();
        synchronized (this) {
            f32995a.remove(this);
            f32995a.add(this);
        }
    }

    public void startActivity(Intent intent) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f33005k < 300) {
            Message message = new Message();
            message.what = PreloadTask.BYTE_UNIT_NUMBER;
            message.obj = intent;
            long j = 300 - (currentTimeMillis - this.f33005k);
            StringBuilder sb = new StringBuilder("Start Activity Delay: ");
            sb.append(j);
            sb.append(", ");
            if (intent.getComponent() == null) {
                str = "";
            } else {
                str = intent.getComponent().getShortClassName();
            }
            sb.append(str);
            this.f33007m.sendMessageDelayed(message, j);
            return;
        }
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(intent, i);
        } catch (Exception e) {
            C9415i.m18634a((Throwable) e);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((i >> 8) & NormalGiftView.ALPHA_255) == 0) {
            C12563i.m25225g();
        }
    }
}
