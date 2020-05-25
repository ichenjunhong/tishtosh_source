package com.bytedance.liko.memoryexplorer.assemble;

import com.C2240a;

abstract class AssemblerProxy<T> implements IAssembler<T> {
    protected final IAssembler mHtmlAssembler;

    /* access modifiers changed from: protected */
    public void writeDivider() {
        writeLine("<DIV style=\"BORDER-TOP: #999999 1px dashed; OVERFLOW: hidden; HEIGHT: 1px\"></DIV>");
    }

    protected AssemblerProxy(IAssembler iAssembler) {
        this.mHtmlAssembler = iAssembler;
    }

    /* access modifiers changed from: protected */
    public void nothingFound(String str) {
        writeLine(C2240a.m6772a("<div><h2  class=\"success\" align=\"center\">%s</h2></div>", new Object[]{str}));
    }

    /* access modifiers changed from: protected */
    public void writeLine(String str) {
        if (this.mHtmlAssembler != null) {
            this.mHtmlAssembler.onAssemble(str);
        }
    }
}
