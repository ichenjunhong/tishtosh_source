package com.bytedance.liko.memoryexplorer.report.model;

import java.util.ArrayList;
import java.util.List;

public class ExplorerAnalysisResult {
    public List<ResultLeakNode> activity_node = new ArrayList();
    public List<ResultLeakNode> bitmap_node = new ArrayList();
    public List<ResultLeakNode> instance_count_node = new ArrayList();
    public List<ResultLeakNode> object_node = new ArrayList();
    public String type = "memory_explorer";

    public static class InstanceTraces {
        public List<InstanceTraces> instanceTraces = new ArrayList();
        public int instance_count;
        public String object_class;
        public double retained_heap_size;
    }

    public static class ObjectRefs {
        public List<ObjectRefs> object_refs = new ArrayList();
        public String ref_class;
        public double retained_heap_size;
    }

    public static class ResultBigObjectNode extends ResultLeakNode {
        public List<ObjectRefs> object_refs = new ArrayList();
    }

    public static class ResultBitmapNode extends ResultLeakNode {
        public int height;
        public String url;
        public int width;
    }

    public static class ResultClassNode extends ResultLeakNode {
        public int instance_count;
        public List<InstanceTraces> instance_traces = new ArrayList();
    }

    public static class ResultLeakNode {
        public String object_class;
        public String object_trace;
        public double retained_heap_size;
    }
}
