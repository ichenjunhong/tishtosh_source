package org.eclipse.mat.util;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.eclipse.mat.report.internal.Messages;
import org.eclipse.mat.util.IProgressListener.Severity;

public class ConsoleProgressListener implements IProgressListener {
    private int dotsPrinted;
    private boolean isDone;
    private PrintWriter out;
    private int workAccumulated;
    private int workPerDot;

    public boolean isCanceled() {
        return false;
    }

    public void done() {
        if (!this.isDone) {
            this.out.write("]\n");
            this.out.flush();
            this.isDone = true;
        }
    }

    public ConsoleProgressListener(PrintWriter printWriter) {
        this.out = printWriter;
    }

    public void setCanceled(boolean z) {
        throw new UnsupportedOperationException();
    }

    public ConsoleProgressListener(OutputStream outputStream) {
        this(new PrintWriter(outputStream));
    }

    public void worked(int i) {
        this.workAccumulated += i;
        int i2 = this.workAccumulated / this.workPerDot;
        if (i2 > 0) {
            this.dotsPrinted += i2;
            for (int i3 = 0; i3 < i2; i3++) {
                this.out.write(ClassUtils.PACKAGE_SEPARATOR);
            }
            this.workAccumulated -= i2 * this.workPerDot;
            this.out.flush();
        }
    }

    public void subTask(String str) {
        PrintWriter printWriter = this.out;
        StringBuilder sb = new StringBuilder("\n");
        sb.append(MessageUtil.format(Messages.ConsoleProgressListener_Label_Subtask, new Object[0]));
        sb.append(" ");
        sb.append(MessageUtil.format(str, new Object[0]));
        sb.append("\n[");
        printWriter.write(sb.toString());
        for (int i = 0; i < this.dotsPrinted; i++) {
            this.out.write(ClassUtils.PACKAGE_SEPARATOR);
        }
        this.out.flush();
    }

    public void beginTask(String str, int i) {
        int i2;
        PrintWriter printWriter = this.out;
        StringBuilder sb = new StringBuilder();
        sb.append(MessageUtil.format(Messages.ConsoleProgressListener_Label_Task, new Object[0]));
        sb.append(" ");
        sb.append(MessageUtil.format(str, new Object[0]));
        sb.append("\n");
        printWriter.write(sb.toString());
        this.out.write("[");
        if (i > 80) {
            i2 = i / 80;
        } else {
            i2 = 1;
        }
        this.workPerDot = i2;
        this.workAccumulated = 0;
        this.dotsPrinted = 0;
        this.out.flush();
    }

    public void sendUserMessage(Severity severity, String str, Throwable th) {
        this.out.write("\n");
        switch (severity) {
            case INFO:
                this.out.write("[INFO] ");
                break;
            case WARNING:
                this.out.write("[WARNING] ");
                break;
            case ERROR:
                this.out.write("[ERROR] ");
                break;
            default:
                this.out.write("[UNKNOWN] ");
                break;
        }
        this.out.write(str);
        if (th != null) {
            this.out.write("\n");
            C17840a.m43751a(th, this.out);
        }
        this.out.write("\n[");
        for (int i = 0; i < this.dotsPrinted; i++) {
            this.out.write(ClassUtils.PACKAGE_SEPARATOR);
        }
    }
}
