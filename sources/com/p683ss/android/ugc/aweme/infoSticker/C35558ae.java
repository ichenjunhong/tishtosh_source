package com.p683ss.android.ugc.aweme.infoSticker;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.ae */
public final class C35558ae {

    /* renamed from: a */
    public ProviderEffect f91393a;

    /* renamed from: b */
    public int f91394b;

    /* renamed from: c */
    public int f91395c;

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f91393a.equals(((C35558ae) obj).f91393a);
    }

    /* renamed from: a */
    public static List<C35558ae> m80353a(List<ProviderEffect> list) {
        int i;
        if (C9376b.m18558a((Collection<T>) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ProviderEffect providerEffect : list) {
            if (m80354a(providerEffect)) {
                i = 1;
            } else {
                i = 3;
            }
            arrayList.add(new C35558ae(providerEffect, i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m80354a(ProviderEffect providerEffect) {
        if (providerEffect != null && TextUtils.isEmpty(providerEffect.getPath())) {
            StringBuilder sb = new StringBuilder();
            sb.append(C39629l.m88233b().getFilesDir());
            sb.append(File.separator);
            sb.append("effect");
            sb.append(File.separator);
            sb.append(providerEffect.getId());
            sb.append(".gif");
            providerEffect.setPath(sb.toString());
        }
        if (providerEffect == null || !C50200d.m108346a(providerEffect.getPath())) {
            return false;
        }
        return true;
    }

    private C35558ae(ProviderEffect providerEffect, int i) {
        this.f91393a = providerEffect;
        this.f91394b = i;
    }
}
