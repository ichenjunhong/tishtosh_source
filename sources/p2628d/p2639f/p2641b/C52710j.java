package p2628d.p2639f.p2641b;

import p2628d.p2648k.C52759b;
import p2628d.p2648k.C52762e;

/* renamed from: d.f.b.j */
public class C52710j extends C52702c implements C52709i, C52762e {
    private final int arity;

    /* access modifiers changed from: protected */
    public C52759b computeReflected() {
        return this;
    }

    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    public C52762e getReflected() {
        return (C52762e) super.getReflected();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C52759b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder("function ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public C52710j(int i) {
        this.arity = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C52710j) {
            C52710j jVar = (C52710j) obj;
            if (getOwner() != null ? getOwner().equals(jVar.getOwner()) : jVar.getOwner() == null) {
                if (!getName().equals(jVar.getName()) || !getSignature().equals(jVar.getSignature()) || !C52711k.m112239a(getBoundReceiver(), jVar.getBoundReceiver())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof C52762e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public C52710j(int i, Object obj) {
        super(obj);
        this.arity = i;
    }
}
