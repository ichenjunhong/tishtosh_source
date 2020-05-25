package org.eclipse.mat.snapshot.model;

import java.io.Serializable;
import org.eclipse.mat.internal.Messages;
import org.eclipse.mat.util.MessageUtil;

public abstract class GCRootInfo implements Serializable {
    private static final String[] TYPE_STRING = {MessageUtil.format(Messages.GCRootInfo_Unkown, new Object[0]), MessageUtil.format(Messages.GCRootInfo_SystemClass, new Object[0]), MessageUtil.format(Messages.GCRootInfo_JNILocal, new Object[0]), MessageUtil.format(Messages.GCRootInfo_JNIGlobal, new Object[0]), MessageUtil.format(Messages.GCRootInfo_ThreadBlock, new Object[0]), MessageUtil.format(Messages.GCRootInfo_BusyMonitor, new Object[0]), MessageUtil.format(Messages.GCRootInfo_JavaLocal, new Object[0]), MessageUtil.format(Messages.GCRootInfo_NativeStack, new Object[0]), MessageUtil.format(Messages.GCRootInfo_Thread, new Object[0]), MessageUtil.format(Messages.GCRootInfo_Finalizable, new Object[0]), MessageUtil.format(Messages.GCRootInfo_Unfinalized, new Object[0]), MessageUtil.format(Messages.GCRootInfo_Unreachable, new Object[0])};
    private static final long serialVersionUID = 2;
    private long contextAddress;
    protected int contextId;
    private long objectAddress;
    protected int objectId;
    private int type;

    public interface Type {
    }

    public long getContextAddress() {
        return this.contextAddress;
    }

    public int getContextId() {
        return this.contextId;
    }

    public long getObjectAddress() {
        return this.objectAddress;
    }

    public int getObjectId() {
        return this.objectId;
    }

    public int getType() {
        return this.type;
    }

    public static String getTypeAsString(int i) {
        for (int i2 = 0; i2 < TYPE_STRING.length; i2++) {
            if (((1 << i2) & i) != 0) {
                return TYPE_STRING[i2];
            }
        }
        return null;
    }

    public static String getTypeSetAsString(GCRootInfo[] gCRootInfoArr) {
        int i = 0;
        for (GCRootInfo type2 : gCRootInfoArr) {
            i |= type2.getType();
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i2 = 0; i2 < TYPE_STRING.length; i2++) {
            int i3 = 1 << i2;
            if ((i3 & i) != 0) {
                if (!z) {
                    sb.append(", ");
                } else if (i3 == i) {
                    return TYPE_STRING[i2];
                } else {
                    z = false;
                }
                sb.append(TYPE_STRING[i2]);
            }
        }
        return sb.toString();
    }

    public GCRootInfo(long j, long j2, int i) {
        this.objectAddress = j;
        this.contextAddress = j2;
        this.type = i;
    }
}
