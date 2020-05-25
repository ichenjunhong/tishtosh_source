package com.bytedance.android.livesdk.chatroom.p309e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.C4472a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6155ep;
import com.bytedance.android.livesdk.chatroom.p325ui.C6227w;
import com.bytedance.android.livesdk.message.C7792f;
import com.bytedance.android.livesdk.message.model.C7793a;
import com.bytedance.android.livesdk.message.model.C7799af;
import com.bytedance.android.livesdk.message.model.C7804aj;
import com.bytedance.android.livesdk.message.model.C7805ak;
import com.bytedance.android.livesdk.message.model.C7808am;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7843bp;
import com.bytedance.android.livesdk.message.model.C7850bs;
import com.bytedance.android.livesdk.message.model.C7856by;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.message.model.C7864ce;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.message.model.C7871cl;
import com.bytedance.android.livesdk.message.model.C7878cr;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.message.model.C8003o;
import com.bytedance.android.livesdk.message.model.C8009t;
import com.bytedance.android.livesdk.message.model.C8016y;
import com.bytedance.android.livesdk.message.model.C8017z;
import com.bytedance.android.livesdk.message.model.LotteryEventMessage;
import com.bytedance.android.livesdk.widget.C8534c;
import com.bytedance.common.utility.C9432q;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.y */
public final class C5113y {
    /* renamed from: a */
    public static int m11748a(int i) {
        return C3922z.m9915e().getResources().getColor(i);
    }

    /* renamed from: a */
    public static C5084b m11752a(C7859c cVar) {
        switch (cVar.getMessageType()) {
            case CHAT:
                return new C5088d((C8001m) cVar);
            case GIFT:
                return new C5099l((C7810ao) cVar);
            case FREE_CELL_GIFT_MESSAGE:
                return new C5099l(C7804aj.m15865a((C7804aj) cVar));
            case GAME_GIFT_MESSAGE:
                return new C5099l(C7805ak.m15866a((C7805ak) cVar));
            case DOODLE_GIFT:
                return new C5095i((C8017z) cVar);
            case GIFT_GROUP:
                return new C5097k((C7808am) cVar);
            case DIGG:
                return new C5094h((C8016y) cVar);
            case MEMBER:
                return new C5104p((C7835bj) cVar);
            case ROOM:
                return new C5110v((C7864ce) cVar);
            case SOCIAL:
                return new C5112x((C7871cl) cVar);
            case CONTROL:
                return new C5092f((C8009t) cVar);
            case SCREEN:
                return new C5111w((C7869cj) cVar);
            case ROOM_RICH_CHAT_MESSAGE:
                return new C5109u((C7862cc) cVar);
            case LUCKY_BOX:
                if (C4472a.f12233a.booleanValue() && (cVar instanceof C7856by)) {
                    return new C5102n((C7856by) cVar);
                }
                if (C4472a.f12233a.booleanValue() && (cVar instanceof C7833bh)) {
                    return new C5102n(C7856by.m15881a((C7833bh) cVar));
                }
                if (cVar instanceof C7833bh) {
                    return new C5103o((C7833bh) cVar);
                }
                return null;
            case LOTTERY_EVENT:
                return new C5101m((LotteryEventMessage) cVar);
            case COMMENT_IMAGE:
                return new C5089e((C8003o) cVar);
            case FANS_CLUB:
                return new C5096j((C7799af) cVar);
            case GOODS_ORDER:
                return new C5082aa((C7878cr) cVar);
            case ASSET_MESSAGE:
                return new C5087c((C7793a) cVar);
            case PORTAL_MESSAGE:
                return new C5106r((C7843bp) cVar);
            case PROMOTION_CARD_MESSAGE:
                C7850bs bsVar = (C7850bs) cVar;
                if ("buy_card".equals(bsVar.f21690a)) {
                    return new C5107s(bsVar);
                }
                if ("enter_by_card".equals(bsVar.f21690a)) {
                    return new C5108t(bsVar);
                }
                break;
        }
        return new C5093g(cVar);
    }

    /* renamed from: a */
    public static Spannable m11751a(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(m11748a(i)), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: a */
    public static Spannable m11749a(Spannable spannable, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || spannable == null || spannable.length() == 0) {
            return spannable;
        }
        int b = (int) C9432q.m18687b(C3922z.m9915e(), 16.0f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C3922z.m9915e().getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, b, b);
        spannable.setSpan(new C8534c(bitmapDrawable), spannable.length() - 1, spannable.length(), 33);
        return spannable;
    }

    /* renamed from: b */
    public static Spannable m11753b(User user, String str, String str2, int i, int i2, boolean z) {
        if (user == null || TextUtils.isEmpty(C7792f.m15860a(user)) || TextUtils.isEmpty(C7792f.m15860a(user)) || TextUtils.isEmpty(str2)) {
            return C5115z.f13664a;
        }
        String a = C7792f.m15860a(user);
        C6155ep epVar = new C6155ep(user, m11748a(i), false);
        C6227w wVar = new C6227w(user, m11748a(i2));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(epVar, 0, a.length() + 1, 33);
        spannableString.setSpan(wVar, a.length() + 1, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: a */
    public static Spannable m11750a(User user, String str, String str2, int i, int i2, boolean z) {
        if (user == null || TextUtils.isEmpty(C7792f.m15860a(user)) || TextUtils.isEmpty(C7792f.m15860a(user)) || TextUtils.isEmpty(str2)) {
            return C5115z.f13664a;
        }
        String a = C7792f.m15860a(user);
        C6155ep epVar = new C6155ep(user, m11748a(i), false);
        C6227w wVar = new C6227w(user, m11748a(i2));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(str);
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(epVar, 0, a.length(), 33);
        spannableString.setSpan(wVar, a.length(), spannableString.length(), 18);
        return spannableString;
    }
}
