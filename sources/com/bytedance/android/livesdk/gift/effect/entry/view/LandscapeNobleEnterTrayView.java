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
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7396c;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class LandscapeNobleEnterTrayView extends ConstraintLayout {

    /* renamed from: h */
    static final int f20230h = C3922z.m9899a(20.0f);

    /* renamed from: i */
    private static final String f20231i = "LandscapeNobleEnterTrayView";

    /* renamed from: j */
    private HSImageView f20232j;

    /* renamed from: k */
    private HSImageView f20233k;

    /* renamed from: l */
    private HSImageView f20234l;

    /* renamed from: m */
    private TextView f20235m;

    public LandscapeNobleEnterTrayView(Context context) {
        this(context, null);
    }

    private void setBackgroundImageModel(ImageModel imageModel) {
        C5213c.m11812a(imageModel).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C7411d<Object>(this), C7412e.f20295a);
    }

    /* renamed from: b */
    private static Spannable m15277b(C7396c cVar) {
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
    public final void mo13672a(C7396c cVar) {
        C5213c.m11817a(this.f20232j, cVar.f20187e, R.drawable.c2h, -1, (float) C3922z.m9899a(1.0f), null);
        NobleLevelInfo nobleLevelInfo = cVar.f20203s;
        if (nobleLevelInfo != null) {
            C5213c.m11820a(this.f20233k, nobleLevelInfo.getNobleIcon());
            this.f20235m.setText(m15277b(cVar));
            setBackgroundImageModel(cVar.f20204t);
        }
    }

    public LandscapeNobleEnterTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LandscapeNobleEnterTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.an3, this);
        this.f20232j = (HSImageView) findViewById(R.id.i0);
        this.f20233k = (HSImageView) findViewById(R.id.j2);
        this.f20235m = (TextView) findViewById(R.id.a4o);
        this.f20234l = (HSImageView) findViewById(R.id.j0);
    }
}
