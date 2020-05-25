package com.bytedance.liko.memoryexplorer.assemble;

import com.C2240a;
import com.bytedance.liko.memoryexplorer.HprofDumper;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakTrace;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import com.bytedance.liko.memoryexplorer.report.LeakReporter;
import com.bytedance.liko.memoryexplorer.util.Logger;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class LeakAssembler extends AssemblerProxy<LeakTrace> {
    public static final String[] CONTAINS = {"android.arch.lifecycle", "ReportFragment"};
    public static final String[] EXCLUDES = {"android.arch.lifecycle.ReportFragment", "com.test.androidspy.inject.TestActivity"};
    private final List<String> EXCLUDES_LIST;
    protected int mLeakCount;
    private LeakReporter mLeakReporter;

    public void onFinish() {
        if (this.mLeakCount == 0) {
            Logger.m24776i("\n=================== NO MEMORY LEAK ================\n", new Object[0]);
            nothingFound("No Memory leak!");
        }
    }

    private void writeLeakRecord(LeakTrace leakTrace) {
        this.mLeakCount++;
        writeLine("<div class=\"leak_class\">");
        writeLine("<pre class=\"leak_code\">");
        StringBuilder sb = new StringBuilder("<h2> ");
        sb.append(this.mLeakCount);
        sb.append(". ");
        sb.append(leakTrace.getLeakedElement());
        sb.append("</h2>");
        writeLine(sb.toString());
        writeLine(leakTrace.format(true));
        writeLine("</pre>");
    }

    public void onAssemble(LeakTrace leakTrace) {
        if (leakTrace != null && !leakTrace.isEmpty() && leakTrace.getLeakedElement() != null && !this.EXCLUDES_LIST.contains(leakTrace.getLeakedElement().className)) {
            String[] strArr = CONTAINS;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!leakTrace.getLeakedElement().className.contains(strArr[i])) {
                    i++;
                } else {
                    return;
                }
            }
            this.mLeakReporter.onReport(new LeakInfo(leakTrace));
            if (this.mHtmlAssembler != null) {
                writeLeakRecord(leakTrace);
            }
            writeDivider();
        }
    }

    public LeakAssembler(IAssembler iAssembler, LeakReporter leakReporter, String str) {
        boolean z;
        super(iAssembler);
        this.mLeakReporter = leakReporter;
        writeLine(C2240a.m6772a("<div><h1 align=\"center\">线下内存工具MemoryExplorer分析报告 %s</h1></div>", new Object[]{str}));
        if (AndroidOS.MODEL != null && AndroidOS.MODEL.length() > 0) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("HprofDumper.sDate null ");
            if (HprofDumper.sDate == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            printStream.println(sb.toString());
            writeLine(C2240a.m6772a("<div><h6 align=\"center\">(分析时间：%s, %s : Android %s , API %d )</h6></div>", new Object[]{HprofDumper.sDate, AndroidOS.MODEL, AndroidOS.RELEASE, Integer.valueOf(AndroidOS.SDK_INT)}));
        }
        writeLine("<div class=\"bigobject_h2\" ><h1 align=\"center\">1、内存泄露</h1></div>");
        this.EXCLUDES_LIST = Arrays.asList(EXCLUDES);
    }
}
