package com.bytedance.liko.memoryexplorer.report.model;

public class UploadData {
    public long d_s_t = System.currentTimeMillis();
    public String event_type = "memory_object_monitor";
    public int log_id = 464;
    public String log_type = "memory_object_monitor";
    public ExplorerAnalysisResult memory_object = new ExplorerAnalysisResult();
    public int network_type = 4;
    public String session_id = "O8988909";
    public long sid = System.currentTimeMillis();
    public long timestamp = System.currentTimeMillis();
}
