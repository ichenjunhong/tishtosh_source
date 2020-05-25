package com.bytedance.liko.memoryexplorer.assemble;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.BigObjectReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ObjectRefs;
import com.bytedance.liko.memoryexplorer.util.Logger;
import com.bytedance.liko.memoryexplorer.util.MemorySizeFormat;
import java.util.List;

public class BigObjectAssembler extends AssemblerProxy<LeakInfo> {
    private int mLeakCount;
    private BigObjectReporter mLeakReporter;

    public void onFinish() {
        if (this.mLeakCount == 0) {
            Logger.m24776i("\n=================== NO MEMORY LEAK ================\n", new Object[0]);
            nothingFound("No Memory leak!");
        }
    }

    public void onAssemble(LeakInfo leakInfo) {
        if (this.mLeakReporter != null) {
            this.mLeakReporter.onReport(leakInfo);
        }
        if (leakInfo.leakTrace != null && !leakInfo.leakTrace.isEmpty() && leakInfo.leakTrace.getLeakedElement() != null) {
            if (this.mHtmlAssembler != null) {
                writeLeakRecord(leakInfo);
            }
            writeDivider();
        }
    }

    private void writeLeakRecord(LeakInfo leakInfo) {
        this.mLeakCount++;
        writeLine("<div class=\"bigobject_class\">");
        writeLine("<pre class=\"bigobject_code\">");
        StringBuilder sb = new StringBuilder("<h2> ");
        sb.append(this.mLeakCount);
        sb.append(". ");
        sb.append(leakInfo.leakTrace.getLeakedElement());
        sb.append("</h2>");
        writeLine(sb.toString());
        writeLine(" <h3> ---------大对象引用链路---------：</h3>");
        writeLine(leakInfo.leakTrace.format(true));
        writeLine(" <h3 > ---------大对象内部引用---------：</h3>");
        writeObjectRefs(leakInfo.bigObjectNode.object_refs);
        writeLine("</pre>");
    }

    private void writeObjectRefs(List<ObjectRefs> list) {
        if (list != null && list.size() > 0) {
            writeLine("<ul>");
            for (ObjectRefs objectRefs : list) {
                StringBuilder sb = new StringBuilder("<li>");
                sb.append(objectRefs.ref_class);
                sb.append(" 大小 ");
                sb.append(MemorySizeFormat.formatMB((long) objectRefs.retained_heap_size));
                sb.append("</li>");
                writeLine(sb.toString());
                writeObjectRefs(objectRefs.object_refs);
            }
            writeLine("</ul>");
        }
    }

    public BigObjectAssembler(IAssembler iAssembler, BigObjectReporter bigObjectReporter, String str) {
        super(iAssembler);
        this.mLeakReporter = bigObjectReporter;
        writeLine("<div class=\"bigobject_h2\" ><h1 align=\"center\">3、大对象</h1></div>");
    }
}
