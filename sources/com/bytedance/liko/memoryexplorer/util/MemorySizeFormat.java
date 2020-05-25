package com.bytedance.liko.memoryexplorer.util;

import com.C2240a;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.snapshot.model.IObject;

public class MemorySizeFormat {
    private MemorySizeFormat() {
    }

    public static String formatMB(long j) {
        return C2240a.m6772a("%.2f MB", new Object[]{Float.valueOf((((float) j) / 1024.0f) / 1024.0f)});
    }

    public static String format(long j) {
        float f = (float) j;
        if (f >= 1048576.0f) {
            return formatMB(j);
        }
        float f2 = f / 1024.0f;
        return C2240a.m6772a("%d bytes, %.2f KB, %.2f MB ", new Object[]{Long.valueOf(j), Float.valueOf(f2), Float.valueOf(f2 / 1024.0f)});
    }

    public static String format(ISnapshot iSnapshot, int i) {
        IObject iObject;
        try {
            iObject = iSnapshot.getObject(i);
            try {
                return C2240a.m6772a("%s has leaked! Retained Heap Size: %s, Object : 0x%s", new Object[]{iObject.getClazz().getName(), format(iObject.getRetainedHeapSize()), Long.toHexString(iSnapshot.mapIdToAddress(i))});
            } catch (SnapshotException unused) {
                StringBuilder sb = new StringBuilder("instance id : ");
                sb.append(iObject);
                return sb.toString();
            }
        } catch (SnapshotException unused2) {
            iObject = null;
            StringBuilder sb2 = new StringBuilder("instance id : ");
            sb2.append(iObject);
            return sb2.toString();
        }
    }
}
