package com.bytedance.liko.memoryexplorer.assemble;

import com.bytedance.liko.memoryexplorer.HprofDumper;
import com.bytedance.liko.memoryexplorer.util.FileUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HtmlAssembler implements IAssembler<String> {
    protected static DateFormat TIME_FORMATTER;
    private BufferedWriter mAssembleWriter;
    private volatile boolean mIsHeaderWrote;

    public HtmlAssembler() {
        TIME_FORMATTER = new SimpleDateFormat(HprofDumper.sDate);
    }

    public void onFinish() {
        onAssemble("</body></html>");
        FileUtils.closeQuietly(this.mAssembleWriter);
    }

    public void onStart() {
        try {
            this.mAssembleWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(generateReportFile()), "UTF-8"));
        } catch (IOException unused) {
        }
        writeHtmlHeadersIfNeed();
    }

    private static String getCssStyle() {
        String str = "";
        InputStream inputStream = null;
        try {
            InputStream resourceAsStream = HtmlAssembler.class.getClassLoader().getResourceAsStream("report.css");
            try {
                String read = FileUtils.read(resourceAsStream);
                FileUtils.closeQuietly(resourceAsStream);
                return read;
            } catch (IOException unused) {
                inputStream = resourceAsStream;
                FileUtils.closeQuietly(inputStream);
                return str;
            } catch (Throwable th) {
                th = th;
                inputStream = resourceAsStream;
                FileUtils.closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            FileUtils.closeQuietly(inputStream);
            return str;
        } catch (Throwable th2) {
            th = th2;
            FileUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public File generateReportFile() throws IOException {
        File reportDir = FileUtils.getReportDir();
        StringBuilder sb = new StringBuilder("memory-explorer-report-");
        sb.append(TIME_FORMATTER.format(new Date()));
        sb.append(".html");
        File file = new File(reportDir, sb.toString());
        if (file.exists()) {
            file.delete();
        } else {
            file.createNewFile();
        }
        return file;
    }

    /* access modifiers changed from: protected */
    public void writeHtmlHeadersIfNeed() {
        if (!this.mIsHeaderWrote) {
            this.mIsHeaderWrote = true;
            onAssemble("<!DOCTYPE html>");
            onAssemble("<html>");
            onAssemble("<head>");
            StringBuilder sb = new StringBuilder("    ");
            sb.append(getCssStyle());
            onAssemble(sb.toString());
            onAssemble("    <meta charset=\"utf-8\">");
            onAssemble("    <title>Hprof Analysis Report</title>");
            onAssemble("</head>");
            onAssemble("<body>");
        }
    }

    public void onAssemble(String str) {
        if (this.mAssembleWriter != null) {
            try {
                this.mAssembleWriter.write(str);
                this.mAssembleWriter.write("\n");
            } catch (IOException unused) {
            }
        }
    }
}
