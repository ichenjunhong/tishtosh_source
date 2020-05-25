package android.support.p030v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* renamed from: android.support.v4.app.ag */
public final class C0630ag {

    /* renamed from: a */
    public final String f2293a;

    /* renamed from: b */
    public final CharSequence f2294b;

    /* renamed from: c */
    public final CharSequence[] f2295c;

    /* renamed from: d */
    public final boolean f2296d;

    /* renamed from: e */
    public final Bundle f2297e;

    /* renamed from: f */
    public final Set<String> f2298f;

    /* renamed from: a */
    static RemoteInput[] m1712a(C0630ag[] agVarArr) {
        if (agVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[agVarArr.length];
        for (int i = 0; i < agVarArr.length; i++) {
            C0630ag agVar = agVarArr[i];
            remoteInputArr[i] = new Builder(agVar.f2293a).setLabel(agVar.f2294b).setChoices(agVar.f2295c).setAllowFreeFormInput(agVar.f2296d).addExtras(agVar.f2297e).build();
        }
        return remoteInputArr;
    }
}
