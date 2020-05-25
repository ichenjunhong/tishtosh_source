package android.support.p019b;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.b.s */
public final class C0312s {

    /* renamed from: a */
    public final Map<String, Object> f770a = new HashMap();

    /* renamed from: b */
    public View f771b;

    /* renamed from: c */
    final ArrayList<C0296m> f772c = new ArrayList<>();

    public final int hashCode() {
        return (this.f771b.hashCode() * 31) + this.f770a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f771b);
        sb3.append("\n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str : this.f770a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str);
            sb7.append(": ");
            sb7.append(this.f770a.get(str));
            sb7.append("\n");
            sb6 = sb7.toString();
        }
        return sb6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0312s) {
            C0312s sVar = (C0312s) obj;
            if (this.f771b == sVar.f771b && this.f770a.equals(sVar.f770a)) {
                return true;
            }
        }
        return false;
    }
}
