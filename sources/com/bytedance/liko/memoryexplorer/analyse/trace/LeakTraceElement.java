package com.bytedance.liko.memoryexplorer.analyse.trace;

import com.C2240a;
import com.bytedance.liko.memoryexplorer.util.MemorySizeFormat;
import com.taobao.android.dexposed.ClassUtils;
import java.io.Serializable;
import java.util.Locale;

public final class LeakTraceElement implements Serializable {
    private static final long serialVersionUID = -1439235519530611998L;
    public String address = "";
    public final String className;
    public final String extra;
    public final Holder holder;
    public final String referenceName;
    public long retainedHeapSize;
    public final Type type;

    public enum Holder {
        OBJECT,
        CLASS,
        THREAD,
        ARRAY
    }

    public enum Type {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL
    }

    public final String toString() {
        return format(true, false);
    }

    /* access modifiers changed from: 0000 */
    public final String format(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        if (this.holder == Holder.ARRAY || this.holder == Holder.THREAD) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.holder.name().toLowerCase(Locale.US));
            sb2.append(" ");
            sb.append(sb2.toString());
        }
        sb.append(this.className);
        if (this.referenceName != null) {
            if (z) {
                if (z2) {
                    sb.insert(0, this.referenceName);
                    sb.insert(this.referenceName.length(), " -> ");
                } else {
                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                    sb.append(this.referenceName);
                }
            }
        } else if (this.address == null || this.address.length() <= 1) {
            sb.append(" instance");
        } else {
            sb.append(C2240a.m6772a(" (%s) instance (%s)", new Object[]{this.address, MemorySizeFormat.formatMB(this.retainedHeapSize)}));
        }
        if (this.extra != null) {
            StringBuilder sb3 = new StringBuilder(" ");
            sb3.append(this.extra);
            sb.append(sb3.toString());
        }
        return sb.toString();
    }

    LeakTraceElement(String str, Type type2, Holder holder2, String str2, String str3) {
        this.referenceName = str;
        this.type = type2;
        this.holder = holder2;
        this.className = str2;
        this.extra = str3;
    }
}
