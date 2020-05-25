package com.bytedance.liko.memoryexplorer.analyse.trace;

import com.bytedance.liko.memoryexplorer.util.CollectionsUtil;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public final class LeakTrace implements Serializable {
    private static final long serialVersionUID = -4388262227887058047L;
    public final List<LeakTraceElement> elements;

    public final boolean isEmpty() {
        return CollectionsUtil.isEmpty(this.elements);
    }

    public final String toString() {
        return format(false);
    }

    public final LeakTraceElement getDominateElement() {
        if (this.elements == null || this.elements.size() <= 1) {
            return null;
        }
        return (LeakTraceElement) this.elements.get(this.elements.size() - 2);
    }

    public final LeakTraceElement getLeakedElement() {
        if (this.elements == null || this.elements.size() <= 0) {
            return null;
        }
        return (LeakTraceElement) this.elements.get(this.elements.size() - 1);
    }

    LeakTrace(List<LeakTraceElement> list) {
        this.elements = Collections.unmodifiableList(list);
    }

    public final String format(boolean z) {
        StringBuilder sb = new StringBuilder();
        LeakTraceElement leakedElement = getLeakedElement();
        if (leakedElement != null) {
            sb.append(leakedElement.className);
            sb.append("\n");
        }
        int min = Math.min(30, this.elements.size() - 1) - 1;
        for (int i = min; i >= 0; i--) {
            LeakTraceElement leakTraceElement = (LeakTraceElement) this.elements.get(i);
            if (z) {
                for (int i2 = 0; i2 <= min - i; i2++) {
                    sb.append("   ");
                }
            }
            sb.append(leakTraceElement.format(true, false));
            if (i != 0) {
                sb.append("\n");
            }
        }
        if (!z) {
            sb.append("\n");
        }
        return sb.toString();
    }
}
