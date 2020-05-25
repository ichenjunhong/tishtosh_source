package org.eclipse.mat.parser.internal;

import org.eclipse.mat.snapshot.model.IStackFrame;

class StackFrameImpl implements IStackFrame {
    private int[] localObjectIds;
    private String text;

    public String getText() {
        return this.text;
    }

    public int[] getLocalObjectsIds() {
        if (this.localObjectIds == null) {
            return new int[0];
        }
        return this.localObjectIds;
    }

    public StackFrameImpl(String str, int[] iArr) {
        this.text = str;
        this.localObjectIds = iArr;
    }
}
