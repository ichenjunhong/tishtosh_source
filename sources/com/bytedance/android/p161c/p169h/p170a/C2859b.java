package com.bytedance.android.p161c.p169h.p170a;

import android.os.Handler;
import com.bytedance.android.p161c.p168g.C2854a;
import com.bytedance.android.p161c.p168g.C2855b;
import com.bytedance.android.p161c.p168g.C2856c;
import com.bytedance.android.p161c.p169h.C2873h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.c.h.a.b */
public final class C2859b {

    /* renamed from: a */
    public List<C2856c<Long, Long, C2858a>> f8513a = new ArrayList();

    /* renamed from: b */
    public File f8514b;

    /* renamed from: com.bytedance.android.c.h.a.b$a */
    public class C2860a implements C2873h {

        /* renamed from: b */
        private int f8516b;

        /* renamed from: a */
        public final void mo7490a() {
            int i = this.f8516b - 1;
            this.f8516b = i;
            if (i == 0) {
                try {
                    new File(C2859b.this.f8514b, "flush.txt").createNewFile();
                } catch (IOException unused) {
                }
            }
        }

        public C2860a(int i) {
            this.f8516b = i;
        }
    }

    /* renamed from: a */
    private void m8160a(C2854a aVar, List<C2855b<Long, File>> list, Handler handler) {
        long j;
        List<Long> list2 = aVar.f8491e;
        C2858a aVar2 = null;
        long j2 = 0;
        int i = 0;
        for (C2855b bVar : list) {
            long longValue = ((Long) bVar.f8499a).longValue();
            long j3 = longValue - j2;
            long j4 = 0;
            while (true) {
                if (j2 >= longValue) {
                    break;
                }
                if (longValue > ((Long) list2.get(i)).longValue()) {
                    i++;
                    j = ((Long) list2.get(i)).longValue();
                } else {
                    j = longValue;
                }
                long j5 = j - j2;
                C2858a aVar3 = r11;
                C2858a aVar4 = new C2858a((File) bVar.f8500b, j4, j5, j3, handler);
                if (aVar2 != null) {
                    aVar2.f8509a = aVar3;
                }
                this.f8513a.add(new C2856c(Long.valueOf(j2), Long.valueOf(j), aVar3));
                j4 += j5;
                if (i >= list2.size()) {
                    aVar2 = aVar3;
                    j2 = j;
                    break;
                }
                aVar2 = aVar3;
                j2 = j;
            }
        }
    }

    public C2859b(C2854a aVar, List<C2855b<Long, File>> list, Handler handler, File file) {
        this.f8514b = file;
        m8160a(aVar, list, handler);
    }

    /* renamed from: a */
    public final void mo7489a(byte[] bArr, int i, int i2, long j) throws IOException {
        int i3 = 0;
        while (i3 < this.f8513a.size()) {
            C2856c cVar = (C2856c) this.f8513a.get(i3);
            long longValue = ((Long) cVar.f8501a).longValue();
            long longValue2 = ((Long) cVar.f8502b).longValue();
            if (j < longValue || j >= longValue2) {
                i3++;
            } else {
                ((C2858a) cVar.f8503c).mo7488a(bArr, 0, i2);
                return;
            }
        }
    }
}
