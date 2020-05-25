package androidx.work.impl.p053a.p055b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.C2240a;

/* renamed from: androidx.work.impl.a.b.g */
public final class C1568g extends C1561c<Boolean> {
    /* renamed from: a */
    public final IntentFilter mo5950a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo5952b() {
        Intent registerReceiver = this.f5560a.registerReceiver(null, mo5950a());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.valueOf(true);
        }
        String action = registerReceiver.getAction();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c = 1;
        }
        switch (c) {
            case 0:
                return Boolean.valueOf(true);
            case 1:
                return Boolean.valueOf(false);
            default:
                return null;
        }
    }

    public C1568g(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo5951a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C2240a.m6772a("Received %s", new Object[]{intent.getAction()});
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    mo5957a(Boolean.valueOf(true));
                    return;
                case 1:
                    mo5957a(Boolean.valueOf(false));
                    break;
            }
        }
    }
}
