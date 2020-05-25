package com.bytedance.sysoptimizer;

public class StackLeakItem {
    private int leakCount;
    private String soBuildId;
    private long soEndAddr;
    private String soPath;
    private long soStartAddr;
    private long startRoutine;
    private long startRoutineOffset = (this.startRoutine - this.soStartAddr);

    public String getBuildId() {
        return this.soBuildId;
    }

    public int getLeakCount() {
        return this.leakCount;
    }

    public long getOffset() {
        return this.startRoutineOffset;
    }

    public String getSoName() {
        String str = "UNKNOWN";
        if (this.soPath == null) {
            return str;
        }
        int lastIndexOf = this.soPath.lastIndexOf(47);
        if (lastIndexOf < 0 || lastIndexOf >= this.soPath.length() - 1) {
            return str;
        }
        return this.soPath.substring(lastIndexOf + 1);
    }

    public String getLeakItem() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.leakCount);
        sb.append("] stacks leaked: ");
        sb.append(Long.toHexString(this.startRoutineOffset));
        sb.append(" ");
        sb.append(Long.toHexString(this.soStartAddr));
        sb.append("-");
        sb.append(Long.toHexString(this.soEndAddr));
        sb.append(" r-xp ");
        sb.append(getSoName());
        sb.append(" (");
        sb.append(this.soBuildId);
        sb.append(")");
        return sb.toString();
    }

    public StackLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        this.leakCount = i;
        this.startRoutine = j;
        this.soStartAddr = j2;
        this.soEndAddr = j3;
        this.soPath = str;
        this.soBuildId = str2;
    }
}
