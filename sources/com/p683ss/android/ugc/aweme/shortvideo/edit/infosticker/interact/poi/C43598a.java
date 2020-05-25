package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43560c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a */
public final class C43598a extends C43560c {

    /* renamed from: a */
    public String f110332a;

    /* renamed from: b */
    private PoiStruct f110333b;

    /* renamed from: d */
    public final InteractStickerStruct mo88731d() {
        return null;
    }

    /* renamed from: g */
    public final int mo88734g() {
        return R.string.alf;
    }

    /* renamed from: c */
    public final boolean mo88730c() {
        if (this.f110333b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo88732e() {
        super.mo88732e();
        this.f110333b = null;
    }

    /* renamed from: b */
    private static String m95772b() {
        StringBuilder sb = new StringBuilder("pi_start");
        sb.append(UUID.randomUUID().toString());
        sb.append("pi_end");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo88817a(PoiStruct poiStruct) {
        m95771a(poiStruct, true, false);
    }

    /* renamed from: a */
    public final InteractStickerBaseView mo88721a(Context context) {
        PoiStickerView poiStickerView = new PoiStickerView(context);
        poiStickerView.setLayoutParams(new LayoutParams(-1, -1));
        return poiStickerView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88818b(InteractStickerStruct interactStickerStruct) {
        super.mo88746a(interactStickerStruct);
        this.f110234k.setVisibility(0);
    }

    /* renamed from: a */
    public final boolean mo88728a(InteractStickerBaseView interactStickerBaseView) {
        if (!(interactStickerBaseView instanceof PoiStickerView)) {
            return false;
        }
        boolean a = super.mo88728a(interactStickerBaseView);
        this.f110333b = null;
        return a;
    }

    /* renamed from: a */
    public final InteractStickerStruct mo88816a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || videoPublishEditModel.infoStickerModel == null || videoPublishEditModel.infoStickerModel.stickers == null || videoPublishEditModel.infoStickerModel.stickers.isEmpty()) {
            return null;
        }
        List<StickerItemModel> list = videoPublishEditModel.infoStickerModel.stickers;
        InteractStickerStruct a = super.mo88741a(1);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_sticker_id", this.f110332a);
        a.setAttr(C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(hashMap));
        a.setPoiStruct(this.f110333b);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            } else if (((StickerItemModel) list.get(i)).viewHash == this.f110234k.hashCode()) {
                a.setIndex(((StickerItemModel) list.get(i)).layerWeight);
                break;
            } else {
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo88746a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f110333b = interactStickerStruct.getPoiStruct();
            m95771a(this.f110333b, false, true);
            this.f110332a = (String) ((HashMap) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34885a(interactStickerStruct.getAttr(), new C17956a<HashMap<String, String>>() {
            }.f49843c)).get("poi_sticker_id");
        }
        if (this.f110234k != null) {
            this.f110234k.postDelayed(new C43600b(this, interactStickerStruct), 300);
        }
    }

    /* renamed from: a */
    public final void mo88726a(String str) {
        if (!C9431p.m18664a(str)) {
            if (str.contains("pi_start") && str.contains("pi_end")) {
                super.mo88726a(str.replaceAll("pi_start(.*?)pi_end", m95772b()));
            } else if (str.endsWith(File.separator)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(m95772b());
                super.mo88726a(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m95772b());
                super.mo88726a(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo88723a(Context context, C46723c cVar, FrameLayout frameLayout) {
        super.mo88723a(context, cVar, frameLayout);
    }

    /* renamed from: a */
    private void m95771a(PoiStruct poiStruct, boolean z, boolean z2) {
        this.f110333b = poiStruct;
        if (!TextUtils.isEmpty(poiStruct.getPoiName())) {
            mo88727a(z2);
            if (this.f110234k instanceof PoiStickerView) {
                ((PoiStickerView) this.f110234k).setPoiContentTxt(poiStruct.getPoiName());
            }
            if (z) {
                this.f110234k.setVisibility(0);
            }
        }
    }
}
