package com.p683ss.android.vesdk;

import com.bef.effectsdk.C2592c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.vesdk.VEConfigItem */
public class VEConfigItem {
    public static int RESOURCEFINDER_TYPE_ASSERT = 1;
    public static int RESOURCEFINDER_TYPE_FILE;
    private C2592c finder;
    private int finderType;

    /* renamed from: id */
    private int f126712id;
    private ArrayList<Integer> intArgs = new ArrayList<>();
    private boolean open = true;

    public int getId() {
        return this.f126712id;
    }

    public boolean isOpen() {
        return this.open;
    }

    public String toString() {
        String str = "";
        Iterator it = this.intArgs.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(intValue);
            sb.append(" ");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("id: ");
        sb2.append(this.f126712id);
        sb2.append(" open: true");
        sb2.append(str);
        return sb2.toString();
    }

    public void setId(int i) {
        this.f126712id = i;
    }

    public void setOpen(boolean z) {
        this.open = z;
    }

    public VEConfigItem(int i, boolean z, ArrayList<Integer> arrayList) {
        this.f126712id = i;
        this.open = z;
        if (arrayList != null) {
            this.intArgs = arrayList;
        }
    }

    public VEConfigItem(int i, boolean z, int i2, C2592c cVar) throws C50751p {
        if (cVar != null) {
            this.f126712id = i;
            this.open = z;
            this.finderType = i2;
            this.finder = cVar;
            return;
        }
        throw new C50751p(-1, "VEConfigItem finder is null");
    }
}
