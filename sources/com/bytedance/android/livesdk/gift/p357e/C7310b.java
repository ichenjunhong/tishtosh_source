package com.bytedance.android.livesdk.gift.p357e;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7493d;
import com.bytedance.android.livesdk.gift.p356d.C7232c;
import com.bytedance.android.livesdk.gift.p357e.C7305a.C7307a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.e.b */
public final class C7310b extends C7305a {
    /* renamed from: a */
    public final void mo13553a(List<C7491b> list) {
        int i;
        int size = (((list.size() - 1) / 8) + 1) * 8;
        C7491b[] bVarArr = new C7491b[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bVarArr[i3] = new C7493d();
        }
        for (C7491b bVar : list) {
            int i4 = i2 / 8;
            int i5 = i2 % 8;
            if (i5 < 4) {
                i = (i5 * 2) + (i4 * 8);
            } else {
                i = ((i5 - 4) * 2) + 1 + (i4 * 8);
            }
            i2++;
            if (i < size) {
                bVarArr[i] = bVar;
            }
        }
        super.mo13553a(Arrays.asList(bVarArr));
    }

    /* renamed from: a */
    public final C7232c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7232c a = super.onCreateViewHolder(viewGroup, i);
        WindowManager windowManager = (WindowManager) this.f19894a.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        a.itemView.setLayoutParams(new LayoutParams(point.x / 4, (int) C9432q.m18687b(this.f19894a, 104.0f)));
        return a;
    }

    public C7310b(Context context, Room room, C7307a aVar, boolean z) {
        super(context, room, aVar, true);
    }
}
