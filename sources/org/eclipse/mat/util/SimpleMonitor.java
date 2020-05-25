package org.eclipse.mat.util;

import org.eclipse.mat.util.IProgressListener.Severity;

public class SimpleMonitor {
    int currentMonitor;
    IProgressListener delegate;
    int[] percentages;
    String task;

    public class Listener implements IProgressListener {
        long counter;
        boolean isSmaller;
        int majorUnits;
        int unitsReported;
        long workDone;
        long workPerUnit;

        public long getWorkDone() {
            return this.workDone;
        }

        public boolean isCanceled() {
            return SimpleMonitor.this.delegate.isCanceled();
        }

        public void done() {
            if (this.majorUnits - this.unitsReported > 0) {
                SimpleMonitor.this.delegate.worked(this.majorUnits - this.unitsReported);
            }
        }

        public boolean isProbablyCanceled() {
            long j = this.counter;
            this.counter = 1 + j;
            if (j % 5000 == 0) {
                return isCanceled();
            }
            return false;
        }

        public void setCanceled(boolean z) {
            SimpleMonitor.this.delegate.setCanceled(z);
        }

        public void subTask(String str) {
            SimpleMonitor.this.delegate.subTask(str);
        }

        public void worked(int i) {
            totalWorkDone(this.workDone + ((long) i));
        }

        public void totalWorkDone(long j) {
            long j2;
            if (this.workDone != j && this.workPerUnit != 0) {
                this.workDone = j;
                if (this.isSmaller) {
                    j2 = j * this.workPerUnit;
                } else {
                    j2 = j / this.workPerUnit;
                }
                int i = ((int) j2) - this.unitsReported;
                if (i > 0) {
                    SimpleMonitor.this.delegate.worked(i);
                    this.unitsReported += i;
                }
            }
        }

        public Listener(int i) {
            this.majorUnits = i;
        }

        public void beginTask(String str, int i) {
            boolean z;
            long j;
            if (str != null) {
                SimpleMonitor.this.delegate.subTask(str);
            }
            if (i != 0) {
                if (i < this.majorUnits) {
                    z = true;
                } else {
                    z = false;
                }
                this.isSmaller = z;
                if (this.isSmaller) {
                    j = (long) (this.majorUnits / i);
                } else {
                    j = (long) (i / this.majorUnits);
                }
                this.workPerUnit = j;
                this.unitsReported = 0;
            }
        }

        public void sendUserMessage(Severity severity, String str, Throwable th) {
            SimpleMonitor.this.delegate.sendUserMessage(severity, str, th);
        }
    }

    public IProgressListener nextMonitor() {
        if (this.currentMonitor == 0) {
            int i = 0;
            for (int i2 : this.percentages) {
                i += i2;
            }
            this.delegate.beginTask(this.task, i);
        }
        int[] iArr = this.percentages;
        int i3 = this.currentMonitor;
        this.currentMonitor = i3 + 1;
        return new Listener(iArr[i3]);
    }

    public SimpleMonitor(String str, IProgressListener iProgressListener, int[] iArr) {
        this.task = str;
        this.delegate = iProgressListener;
        this.percentages = iArr;
    }
}
