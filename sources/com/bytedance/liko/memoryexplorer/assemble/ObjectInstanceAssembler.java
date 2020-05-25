package com.bytedance.liko.memoryexplorer.assemble;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.ObjectInstanceReporter;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.InstanceTraces;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultClassNode;
import com.bytedance.liko.memoryexplorer.util.MemorySizeFormat;
import java.util.List;

public class ObjectInstanceAssembler extends AssemblerProxy<ResultClassNode> {
    protected int mLeakCount;
    private ObjectInstanceReporter mLeakReporter;

    public void onFinish() {
    }

    public void onAssemble(ResultClassNode resultClassNode) {
        if (resultClassNode != null) {
            LeakInfo leakInfo = new LeakInfo(resultClassNode);
            if (this.mLeakReporter != null) {
                this.mLeakReporter.onReport(leakInfo);
            }
            if (this.mHtmlAssembler != null) {
                writeLeakRecord(resultClassNode);
            }
            writeDivider();
        }
    }

    private void writeLeakClassNodeList(List<InstanceTraces> list) {
        if (list != null && list.size() > 0) {
            writeLine("<ul>");
            for (InstanceTraces instanceTraces : list) {
                StringBuilder sb = new StringBuilder("<li>");
                sb.append(instanceTraces.object_class);
                sb.append(" 数量 ");
                sb.append(instanceTraces.instance_count);
                sb.append(" 大小 ");
                sb.append(MemorySizeFormat.formatMB((long) instanceTraces.retained_heap_size));
                sb.append("</li>");
                writeLine(sb.toString());
                writeLeakClassNodeList(instanceTraces.instanceTraces);
            }
            writeLine("</ul>");
        }
    }

    private void writeLeakRecord(ResultClassNode resultClassNode) {
        this.mLeakCount++;
        writeLine("<div class=\"bigobject_class\">");
        writeLine("<pre class=\"bigobject_code\">");
        StringBuilder sb = new StringBuilder("<h2> ");
        sb.append(this.mLeakCount);
        sb.append(". ");
        sb.append(resultClassNode.object_class);
        sb.append(" 占用 ");
        sb.append(MemorySizeFormat.formatMB((long) resultClassNode.retained_heap_size));
        sb.append(" 共有 ");
        sb.append(resultClassNode.instance_count);
        sb.append("个对象</h2>");
        writeLine(sb.toString());
        writeLeakClassNodeList(resultClassNode.instance_traces);
        writeLine("</pre>");
    }

    public ObjectInstanceAssembler(IAssembler iAssembler, ObjectInstanceReporter objectInstanceReporter, String str) {
        super(iAssembler);
        this.mLeakReporter = objectInstanceReporter;
        writeLine("<div class=\"bigobject_h2\" ><h1 align=\"center\">4、数量多的类</h1></div>");
    }
}
