package com.bytedance.jirafast.p749b;

import java.io.Serializable;

/* renamed from: com.bytedance.jirafast.b.e */
public final class C12001e implements Serializable {
    public String content;
    public String name;
    public int type;

    public final String getContent() {
        return this.content;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public static C12001e obtainImg(String str) {
        C12001e eVar = new C12001e();
        eVar.setContent(str);
        eVar.setName("img");
        eVar.setType(2);
        return eVar;
    }

    public static C12001e obtainTxt(String str, String str2) {
        C12001e eVar = new C12001e();
        eVar.setContent(str);
        eVar.setName(str2);
        eVar.setType(1);
        return eVar;
    }

    public static C12001e obtainTxtFile(String str, String str2) {
        C12001e eVar = new C12001e();
        eVar.setContent(str);
        eVar.setName(str2);
        eVar.setType(3);
        return eVar;
    }

    public static C12001e obtain(String str, String str2, int i) {
        C12001e eVar = new C12001e();
        eVar.setContent(str2);
        eVar.setName(str);
        eVar.setType(i);
        return eVar;
    }
}
