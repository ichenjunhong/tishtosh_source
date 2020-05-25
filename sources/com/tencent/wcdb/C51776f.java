package com.tencent.wcdb;

/* renamed from: com.tencent.wcdb.f */
public final class C51776f extends IndexOutOfBoundsException {
    public C51776f(String str) {
        super(str);
    }

    public C51776f(int i, int i2) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" requested, with a size of ");
        sb.append(i2);
        super(sb.toString());
    }
}
