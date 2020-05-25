package com.bytedance.android.livesdk.gift.panel;

import android.os.Bundle;
import android.support.p043v7.p051e.C1208c.C1210a;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.C7654y;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.android.livesdk.gift.model.p379a.C7499j;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.panel.ag */
public final class C7533ag extends C1210a {

    /* renamed from: a */
    private final List<C7491b> f20691a;

    /* renamed from: b */
    private final List<C7491b> f20692b;

    /* renamed from: c */
    private final boolean f20693c;

    /* renamed from: a */
    public final int mo159a() {
        return this.f20691a.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f20692b.size();
    }

    /* renamed from: a */
    private static boolean m15531a(ImageModel imageModel, ImageModel imageModel2) {
        if (imageModel == imageModel2) {
            return true;
        }
        if (imageModel == null || imageModel2 == null || !imageModel.getUri().equals(imageModel2.getUri())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        if (((C7491b) this.f20691a.get(i)).mo13919p() == ((C7491b) this.f20692b.get(i2)).mo13919p()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m15532a(C7491b bVar, C7491b bVar2) {
        if (!TextUtils.equals(bVar.mo13913j(), bVar2.mo13913j()) || !TextUtils.equals(bVar.mo13915l(), bVar2.mo13915l()) || !m15531a(bVar.mo13918o(), bVar2.mo13918o()) || !m15531a(bVar.mo13917n(), bVar2.mo13917n())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        C7491b bVar = (C7491b) this.f20691a.get(i);
        C7491b bVar2 = (C7491b) this.f20692b.get(i2);
        if ((bVar instanceof C7499j) && (bVar2 instanceof C7499j)) {
            return false;
        }
        if (!(bVar instanceof C7497h) || !(bVar2 instanceof C7497h)) {
            if ((bVar instanceof C7490a) && (bVar2 instanceof C7490a) && ((C7490a) bVar).mo13904a() != ((C7490a) bVar2).mo13904a()) {
                return false;
            }
        } else if (((Prop) ((C7497h) bVar).f20516d).count != ((Prop) ((C7497h) bVar2).f20516d).count) {
            return false;
        }
        return m15532a(bVar, bVar2);
    }

    /* renamed from: a */
    public final Object mo160a(int i, int i2) {
        long j;
        C7491b bVar = (C7491b) this.f20691a.get(i);
        C7491b bVar2 = (C7491b) this.f20692b.get(i2);
        if (!m15532a(bVar, bVar2)) {
            return super.mo160a(i, i2);
        }
        if ((bVar instanceof C7499j) && (bVar2 instanceof C7499j)) {
            Bundle bundle = new Bundle();
            if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                j = C7654y.m15668a().mo14018b();
            } else {
                j = 0;
            }
            bundle.putString("key_task_gift_count", String.valueOf(j));
            return bundle;
        } else if (!(bVar instanceof C7497h) || !(bVar2 instanceof C7497h)) {
            return super.mo160a(i, i2);
        } else {
            C7497h hVar = (C7497h) bVar;
            C7497h hVar2 = (C7497h) bVar2;
            Bundle bundle2 = new Bundle();
            if (((Prop) hVar.f20516d).count != ((Prop) hVar2.f20516d).count) {
                bundle2.putString("key_prop_count", String.valueOf(((Prop) hVar2.f20516d).count));
                bundle2.putBoolean("key_prop_show_item_combo", this.f20693c);
            }
            return bundle2;
        }
    }

    public C7533ag(List<C7491b> list, List<C7491b> list2, boolean z) {
        this.f20691a = list;
        this.f20692b = list2;
        this.f20693c = z;
    }
}
