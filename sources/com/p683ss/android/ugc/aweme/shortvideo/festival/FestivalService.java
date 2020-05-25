package com.p683ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.port.p2082in.IFestivalService;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.FestivalService */
public class FestivalService implements IFestivalService {
    public String getWaterPicDir() {
        return C43826n.m96253a().mo89349d();
    }

    public static IFestivalService createIFestivalServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFestivalService.class);
        if (a != null) {
            return (IFestivalService) a;
        }
        return new FestivalService();
    }

    public void setTextForChallengeDesc(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView, boolean z) {
        String str2;
        int i;
        if (!TextUtils.isEmpty(str)) {
            int a = (int) (((float) C9432q.m18670a(textView.getContext())) - C9432q.m18687b(textView.getContext(), 32.0f));
            SpannableString spannableString = new SpannableString(str);
            if (textView2 == null) {
                str2 = "";
            } else {
                str2 = textView2.getText().toString();
            }
            C43823k kVar = new C43823k(textView.getPaint(), a, z, str2);
            SpannableString a2 = kVar.mo50296a(spannableString);
            boolean z2 = kVar.f110977b;
            textView.setText(a2);
            if (z) {
                int i2 = 8;
                if (z2) {
                    if (!z2 || TextUtils.isEmpty(str)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView2.setVisibility(i);
                    if (z2 && !TextUtils.isEmpty(str)) {
                        i2 = 0;
                    }
                    imageView.setVisibility(i2);
                    C43813b bVar = new C43813b(textView, spannableString, imageView, textView2, viewGroup, a2);
                    textView.post(bVar);
                    return;
                }
                imageView.setVisibility(8);
                textView2.setVisibility(8);
            }
        }
    }
}
