package com.bytedance.jirafast.p750c;

import android.app.Fragment;
import android.os.Bundle;
import com.bytedance.jirafast.p750c.C12009c.C12010a;

/* renamed from: com.bytedance.jirafast.c.b */
public final class C12008b extends Fragment {

    /* renamed from: a */
    C12010a f31754a;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArray = getArguments().getStringArray("JIRApermissions");
        if (stringArray != null && stringArray.length >= 0) {
            requestPermissions(stringArray, 1);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f31754a != null) {
            this.f31754a.mo22749a(strArr, iArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
