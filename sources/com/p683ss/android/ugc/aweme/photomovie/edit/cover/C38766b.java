package com.p683ss.android.ugc.aweme.photomovie.edit.cover;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p030v4.p038f.C0781c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.photo.C38657e;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.b */
public final class C38766b implements C42542c {

    /* renamed from: a */
    public List<String> f98627a;

    /* renamed from: b */
    private C38764a f98628b;

    /* renamed from: a */
    public final int mo78726a() {
        return 7;
    }

    C38766b(List<String> list, C38764a aVar) {
        this.f98627a = list;
        this.f98628b = aVar;
    }

    /* renamed from: a */
    public final void mo78727a(int i, int i2, C42543a aVar) {
        int a = mo78726a();
        for (int i3 = 0; i3 < a; i3++) {
            final int a2 = this.f98628b.mo78725a(this.f98627a.size(), (((float) i3) * 1.0f) / ((float) mo78726a()));
            final int i4 = i;
            final int i5 = i2;
            final C42543a aVar2 = aVar;
            final int i6 = i3;
            C387671 r2 = new Runnable() {
                public final void run() {
                    C50181a.m108296a(C38657e.m85995a(Uri.parse(Uri.fromFile(new File((String) C38766b.this.f98627a.get(a2))).toString())), i4, i5, (C0781c<Bitmap>) new C0781c<Bitmap>() {
                        public final /* synthetic */ void accept(Object obj) {
                            final Bitmap bitmap = (Bitmap) obj;
                            C18842a.m45934b(new Runnable() {
                                public final void run() {
                                    aVar2.mo86764a(i6, bitmap);
                                }
                            });
                        }
                    });
                }
            };
            C18842a.m45932a(r2);
        }
    }
}
