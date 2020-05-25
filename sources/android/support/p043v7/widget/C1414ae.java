package android.support.p043v7.widget;

import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: android.support.v7.widget.ae */
final class C1414ae {

    /* renamed from: a */
    boolean f5095a = true;

    /* renamed from: b */
    int f5096b;

    /* renamed from: c */
    int f5097c;

    /* renamed from: d */
    int f5098d;

    /* renamed from: e */
    int f5099e;

    /* renamed from: f */
    int f5100f;

    /* renamed from: g */
    int f5101g;

    /* renamed from: h */
    boolean f5102h;

    /* renamed from: i */
    boolean f5103i;

    C1414ae() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.f5096b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f5097c);
        sb.append(", mItemDirection=");
        sb.append(this.f5098d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f5099e);
        sb.append(", mStartLine=");
        sb.append(this.f5100f);
        sb.append(", mEndLine=");
        sb.append(this.f5101g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo5487a(C1343o oVar) {
        View b = oVar.mo5096b(this.f5097c);
        this.f5097c += this.f5098d;
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5488a(C1349s sVar) {
        if (this.f5097c < 0 || this.f5097c >= sVar.mo5115a()) {
            return false;
        }
        return true;
    }
}
