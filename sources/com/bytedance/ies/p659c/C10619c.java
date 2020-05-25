package com.bytedance.ies.p659c;

/* renamed from: com.bytedance.ies.c.c */
public final class C10619c {
    /* renamed from: a */
    public static C10618b m21408a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        StringBuilder sb2 = new StringBuilder("Required field");
        sb2.append(str);
        sb2.append(" not set:");
        sb2.append(sb);
        throw new C10618b(sb2.toString());
    }
}
