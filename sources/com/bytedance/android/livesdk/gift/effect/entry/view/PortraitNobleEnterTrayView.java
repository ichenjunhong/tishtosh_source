package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p310f.C5235t;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7396c;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class PortraitNobleEnterTrayView extends ConstraintLayout {

    /* renamed from: j */
    private static final String f20236j = "PortraitNobleEnterTrayView";

    /* renamed from: l */
    private static final int f20237l = C3922z.m9899a(14.0f);

    /* renamed from: h */
    HSImageView f20238h;

    /* renamed from: i */
    TextView f20239i;

    /* renamed from: k */
    private HSImageView f20240k;

    public PortraitNobleEnterTrayView(Context context) {
        this(context, null);
    }

    public void setBackgroundImageModel(ImageModel imageModel) {
        C5213c.m11820a(this.f20240k, imageModel);
    }

    /* renamed from: b */
    private static Spannable m15279b(C7396c cVar) {
        String str;
        C8851g gVar = cVar.f20206v;
        String str2 = gVar.f24156b;
        if (gVar.f24155a != null) {
            str = C7676b.m15696a().mo14036a(gVar.f24155a);
        } else {
            str = null;
        }
        if (str == null && str2 == null) {
            return new SpannableString("");
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        return C5115z.m11758a(str2, gVar);
    }

    /* renamed from: a */
    public final void mo13673a(C7396c cVar) {
        NobleLevelInfo nobleLevelInfo = cVar.f20203s;
        if (nobleLevelInfo != null) {
            this.f20239i.setText(m15279b(cVar));
            C5213c.m11812a(nobleLevelInfo.getNobleIconWithBack()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7413f<Object>(this, cVar), C7414g.f20298a);
            C5235t.m11853a(cVar.f20204t, this, C4206c.m10426a(getContext()), null);
        }
    }

    public PortraitNobleEnterTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PortraitNobleEnterTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.aof, this);
        this.f20238h = (HSImageView) findViewById(R.id.j2);
        this.f20239i = (TextView) findViewById(R.id.a4o);
        this.f20240k = (HSImageView) findViewById(R.id.j0);
    }
}
