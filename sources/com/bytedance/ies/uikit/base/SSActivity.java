package com.bytedance.ies.uikit.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.common.utility.C9406f;
import com.bytedance.ies.uikit.p698b.C11069a;
import com.bytedance.ies.uikit.p698b.C11071b;
import com.bytedance.ies.uikit.p698b.C11076e;
import com.ss.android.ugc.trill.R;

public class SSActivity extends AbsActivity implements C9406f {

    /* renamed from: a */
    protected int f29766a;

    /* renamed from: b */
    private boolean f29767b;

    public void overridePendingTransition(int i, int i2) {
    }

    public void onBackPressed() {
        try {
            super.onBackPressed();
        } catch (IllegalStateException unused) {
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        C11071b.m22414a().mo20067a((Context) this);
    }

    /* renamed from: a */
    private C11069a mo45068a() {
        C11069a aVar = new C11069a(this, R.layout.it);
        aVar.mo20058b(17).mo20053a(false).mo20059b(false).mo20055a(C11076e.m22421a(aVar.mo20057b()), C11076e.m22422b(aVar.mo20057b()));
        return aVar;
    }

    public void finish() {
        int i;
        int i2;
        super.finish();
        switch (this.f29766a) {
            case 0:
                i2 = C11080b.f29773a;
                i = C11080b.f29774b;
                break;
            case 1:
                i2 = C11080b.f29781i;
                i = C11080b.f29782j;
                break;
            case 2:
                i2 = C11080b.f29777e;
                i = C11080b.f29778f;
                break;
            case 3:
                i2 = C11080b.f29775c;
                i = C11080b.f29776d;
                break;
            default:
                i2 = C11080b.f29773a;
                i = C11080b.f29774b;
                break;
        }
        mo20096a(i2, i);
    }

    public void onPause() {
        for (C11069a aVar : C11071b.m22414a().f29747a) {
            if (aVar != null && aVar.f29719a == this) {
                aVar.f29724f = true;
            }
        }
        super.onPause();
    }

    public void onStop() {
        super.onStop();
        C11071b a = C11071b.m22414a();
        a.removeMessages(1929);
        int size = a.f29747a.size();
        for (int i = 0; i < size; i++) {
            C11069a aVar = (C11069a) a.f29747a.poll();
            if (aVar != null) {
                if (aVar.f29719a == this) {
                    a.removeMessages(1110, aVar);
                    aVar.dismiss();
                    aVar.f29721c.clearAnimation();
                    aVar.f29719a = null;
                    C11071b a2 = C11071b.m22414a();
                    a2.f29747a.remove(aVar);
                    while (a2.f29747a.contains(aVar)) {
                        a2.f29747a.remove(aVar);
                    }
                } else {
                    a.f29747a.add(aVar);
                }
            }
        }
        if (!a.f29747a.isEmpty()) {
            a.sendEmptyMessage(1929);
        }
        a.f29748b = false;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        this.f29767b = false;
        switch (this.f29766a) {
            case 0:
                i = C11080b.f29775c;
                i2 = C11080b.f29776d;
                break;
            case 1:
                i = C11080b.f29783k;
                i2 = C11080b.f29784l;
                break;
            case 2:
                i = C11080b.f29779g;
                i2 = C11080b.f29780h;
                break;
            case 3:
                i = C11080b.f29773a;
                i2 = C11080b.f29774b;
                break;
            default:
                i = C11080b.f29775c;
                i2 = C11080b.f29776d;
                break;
        }
        mo20096a(i, i2);
    }

    public void showCustomToast(String str) {
        if (isViewValid()) {
            C11069a a = mo45068a();
            a.f29721c = a.mo20052a(-1);
            a.mo20056a(str, -1);
            C11071b.m22414a().mo20068a(a);
        }
    }

    /* renamed from: a */
    public final void mo20096a(int i, int i2) {
        super.overridePendingTransition(i, i2);
    }

    public void showCustomLongToast(int i, String str) {
        if (isViewValid()) {
            mo45068a().mo20060b(str, i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C11071b.m22414a().mo20067a((Context) this);
        super.onActivityResult(i, i2, intent);
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (isViewValid()) {
            C11069a a = mo45068a();
            a.f29723e = (long) i2;
            a.mo20058b(i3).mo20060b(str, i);
        }
    }
}
