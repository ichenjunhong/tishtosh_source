package android.support.p043v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;

/* renamed from: android.support.v7.app.f */
public class C1166f extends C0649f {
    public Dialog onCreateDialog(Bundle bundle) {
        return new C1164e(getContext(), this.mTheme);
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C1164e) {
            C1164e eVar = (C1164e) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
            }
            eVar.mo3778b(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
