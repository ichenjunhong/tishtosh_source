package com.p683ss.android.ugc.aweme.p1445bp.p1448c;

import java.io.File;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.c.a */
public final class C23884a extends IllegalStateException {
    public static final C23885a Companion = new C23885a(null);

    /* renamed from: com.ss.android.ugc.aweme.bp.c.a$a */
    public static final class C23885a {
        private C23885a() {
        }

        public /* synthetic */ C23885a(C52707g gVar) {
            this();
        }
    }

    public C23884a(File file) {
        C52711k.m112240b(file, "file");
        StringBuilder sb = new StringBuilder("该 file 使用的路径不符合「工具线磁盘使用规范」, filePath = ");
        sb.append(file.getPath());
        sb.append(", exist = ");
        sb.append(file.exists());
        sb.append("。如果是新增的路径，需要使用规范的路径，如果是历史逻辑的路径，可能需要加白名单。出现这个错误请先咨询 @wangyong.1996");
        super(sb.toString());
    }
}
