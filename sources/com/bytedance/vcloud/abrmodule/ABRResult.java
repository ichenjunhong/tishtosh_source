package com.bytedance.vcloud.abrmodule;

import java.util.ArrayList;
import java.util.List;

public class ABRResult {
    private List<ABRResultElement> elements = new ArrayList();

    public int size() {
        return this.elements.size();
    }

    public void add(ABRResultElement aBRResultElement) {
        this.elements.add(aBRResultElement);
    }

    public ABRResultElement get(int i) {
        return (ABRResultElement) this.elements.get(i);
    }
}
