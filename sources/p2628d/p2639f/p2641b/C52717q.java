package p2628d.p2639f.p2641b;

import p2628d.p2648k.C52759b;
import p2628d.p2648k.C52767h;

/* renamed from: d.f.b.q */
public abstract class C52717q extends C52702c implements C52767h {
    public C52717q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C52767h getReflected() {
        return (C52767h) super.getReflected();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C52759b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder sb = new StringBuilder("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public C52717q(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C52717q) {
            C52717q qVar = (C52717q) obj;
            if (!getOwner().equals(qVar.getOwner()) || !getName().equals(qVar.getName()) || !getSignature().equals(qVar.getSignature()) || !C52711k.m112239a(getBoundReceiver(), qVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof C52767h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }
}
