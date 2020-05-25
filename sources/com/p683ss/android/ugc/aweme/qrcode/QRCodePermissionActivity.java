package com.p683ss.android.ugc.aweme.qrcode;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.support.p043v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.ScanQRCodeActivityV2;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity */
public class QRCodePermissionActivity extends AppCompatActivity {

    /* renamed from: c */
    public static long f104129c;

    /* renamed from: a */
    public boolean f104130a;

    /* renamed from: b */
    public int f104131b = -1;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private void m90503b() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getShortVideoPluginService().mo80676a(this, true, new C39598a() {
            public final void onSuccess() {
                if (QRCodePermissionActivity.this.f104131b != -1) {
                    ScanQRCodeActivityV2.m90656a(QRCodePermissionActivity.this, QRCodePermissionActivity.this.f104131b);
                } else {
                    QRCodePermissionActivity qRCodePermissionActivity = QRCodePermissionActivity.this;
                    boolean z = QRCodePermissionActivity.this.f104130a;
                    Intent intent = new Intent(qRCodePermissionActivity, ScanQRCodeActivityV2.class);
                    intent.putExtra("enter_from", z);
                    qRCodePermissionActivity.startActivity(intent);
                }
                QRCodePermissionActivity.this.finish();
            }
        });
    }

    /* renamed from: a */
    private void m90500a() {
        Dialog b = new C10643a(this).mo18899b((int) R.string.cnz).mo18900b((int) R.string.wf, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                QRCodePermissionActivity.this.finish();
            }
        }).mo18886a((int) R.string.ah4, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C47720bh.m103294a(QRCodePermissionActivity.this);
                QRCodePermissionActivity.this.finish();
            }
        }).mo18897a().mo18882b();
        b.setOnDismissListener(new OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                QRCodePermissionActivity.this.finish();
            }
        });
        b.show();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        if (C47946e.m103734a(this) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f104130a = getIntent().getBooleanExtra("enter_from", false);
        this.f104131b = getIntent().getIntExtra("page_from", -1);
        if (z) {
            m90503b();
        } else if (C47946e.m103735a()) {
            C0636b.m1718a(this, new String[]{"android.permission.CAMERA"}, 1);
        } else {
            m90500a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m90501a(Context context, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f104129c >= 1000) {
            f104129c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            context.startActivity(intent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    m90500a();
                    return;
                }
            }
            m90503b();
        }
    }

    /* renamed from: a */
    public static void m90502a(Context context, boolean z, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f104129c >= 1000) {
            f104129c = currentTimeMillis;
            Intent intent = new Intent(context, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            intent.putExtra("page_from", i);
            context.startActivity(intent);
        }
    }
}
