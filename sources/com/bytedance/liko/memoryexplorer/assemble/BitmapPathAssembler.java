package com.bytedance.liko.memoryexplorer.assemble;

import com.C2240a;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.BitmapReporter;
import com.bytedance.liko.memoryexplorer.util.Logger;

public class BitmapPathAssembler extends AssemblerProxy<LeakInfo> {
    private BitmapReporter bitmapReporter;
    private int mLeakCount;

    public void onFinish() {
    }

    private void writeLeakRecord(LeakInfo leakInfo) {
        int i = this.mLeakCount + 1;
        this.mLeakCount = i;
        String a = C2240a.m6772a("Bitmap %d : %d x %d", new Object[]{Integer.valueOf(i), Integer.valueOf(leakInfo.bitmapNode.width), Integer.valueOf(leakInfo.bitmapNode.height)});
        writeLine("<div class=\"bigobject_class\">");
        writeLine("<pre class=\"bigobject_code\">");
        StringBuilder sb = new StringBuilder("<h2> ");
        sb.append(a);
        sb.append("</h2>");
        writeLine(sb.toString());
        writeLine(" <h3> ---------大图片引用链路---------：</h3>");
        writeLine(leakInfo.leakTrace.format(true));
        writeLine("</pre>");
    }

    public void onAssemble(LeakInfo leakInfo) {
        String format = leakInfo.leakTrace.format(false);
        if (!format.contains("android.view.View.mBackground") && !format.contains("com.facebook.imagepipeline.animated") && !format.contains("com.facebook.common") && !format.contains("android.content.res.Resources.sPreloadedDrawables")) {
            if (this.bitmapReporter != null) {
                this.bitmapReporter.onReport(leakInfo);
            }
            if (leakInfo.leakTrace != null && !leakInfo.leakTrace.isEmpty() && leakInfo.leakTrace.getLeakedElement() != null) {
                Logger.m24776i(leakInfo.leakTrace.format(false), new Object[0]);
                if (this.mHtmlAssembler != null) {
                    writeLeakRecord(leakInfo);
                }
                writeDivider();
            }
        }
    }

    public BitmapPathAssembler(MemoryConfig memoryConfig, IAssembler iAssembler, BitmapReporter bitmapReporter2) {
        super(iAssembler);
        this.bitmapReporter = bitmapReporter2;
    }
}
