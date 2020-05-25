package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2239g;

import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26371ae;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44625e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C44643a;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.g.b */
public final class C44629b extends C44628a {

    /* renamed from: a */
    private final BusinessExtraData f112905a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo90492a(long j, InteractStickerStruct interactStickerStruct) {
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        return C44588c.m97539a(j, interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90493a(int i, float f, float f2, C44625e eVar) {
        String str;
        C52711k.m112240b(eVar, "poiPopListener");
        BusinessExtraData businessExtraData = this.f112905a;
        if (businessExtraData != null) {
            str = businessExtraData.getSchemaUrlOpenFirst();
        } else {
            str = null;
        }
        if (!C36949e.m83168d(str)) {
            eVar.mo90580a(this.f112902d.mo90608a(f, f2));
        }
    }

    /* renamed from: a */
    public final boolean mo90487a(long j, int i, float f, float f2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        NormalTrackTimeStamp normalTrackTimeStamp;
        String str2;
        BusinessExtraData businessExtraData = this.f112905a;
        RectF rectF = null;
        if (businessExtraData != null) {
            charSequence = businessExtraData.getStickerId();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        BusinessExtraData businessExtraData2 = this.f112905a;
        if (businessExtraData2 != null) {
            charSequence2 = businessExtraData2.getSchemaUrlOpenFirst();
        } else {
            charSequence2 = null;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            return false;
        }
        BusinessExtraData businessExtraData3 = this.f112905a;
        if (businessExtraData3 != null) {
            str = businessExtraData3.getStickerId();
        } else {
            str = null;
        }
        if (!C26371ae.m63818a(str)) {
            return super.mo90487a(j, i, f, f2);
        }
        boolean a = super.mo90487a(j, i, f, f2);
        if (a) {
            List a2 = mo90492a(j, this.f112903e);
            if (a2 != null) {
                normalTrackTimeStamp = (NormalTrackTimeStamp) a2.get(0);
            } else {
                normalTrackTimeStamp = null;
            }
            if (normalTrackTimeStamp != null) {
                rectF = mo90583a(normalTrackTimeStamp);
            }
            if (rectF != null) {
                C52711k.m112240b(rectF, "rect");
                if (f < rectF.centerX()) {
                    str2 = "left";
                } else {
                    str2 = "right";
                }
                C26371ae.f69579c = str2;
            }
        }
        return a;
    }

    public C44629b(Context context, C44643a aVar, InteractStickerStruct interactStickerStruct, C46063m mVar, BusinessExtraData businessExtraData) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "view");
        C52711k.m112240b(interactStickerStruct, "stickerStruct");
        super(context, aVar, interactStickerStruct, mVar);
        this.f112905a = businessExtraData;
    }
}
