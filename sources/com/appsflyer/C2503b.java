package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.appsflyer.b */
final class C2503b {

    /* renamed from: ॱ */
    private IntentFilter f7773 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.b$a */
    static final class C2504a {

        /* renamed from: ˏ */
        static final C2503b f7774 = new C2503b();
    }

    /* renamed from: com.appsflyer.b$c */
    static final class C2505c {

        /* renamed from: ˎ */
        public final String f7775;

        /* renamed from: ˏ */
        public final float f7776;

        C2505c() {
        }

        C2505c(float f, String str) {
            this.f7776 = f;
            this.f7775 = str;
        }
    }

    C2503b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final C2505c mo6992(Context context) {
        boolean z;
        String str;
        String str2 = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, this.f7773);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra("status", -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra != 4) {
                        switch (intExtra) {
                            case 1:
                                str = "ac";
                                break;
                            case 2:
                                str = "usb";
                                break;
                            default:
                                str = "other";
                                break;
                        }
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                str2 = str;
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C2505c(f, str2);
    }
}
