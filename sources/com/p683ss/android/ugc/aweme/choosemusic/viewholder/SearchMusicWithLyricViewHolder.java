package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24965e;
import com.p683ss.android.ugc.aweme.discover.model.Position;
import com.p683ss.android.ugc.aweme.music.experiment.MusicSearchCardExperiment;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1981c.C37597b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchMusicWithLyricViewHolder */
public class SearchMusicWithLyricViewHolder extends MusicItemViewHolder {
    TextView mTvLyric;

    public SearchMusicWithLyricViewHolder(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51011a(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        SpannableString spannableString;
        String str5;
        if (!TextUtils.isEmpty(this.f66230c.getName())) {
            this.mTvMusicName.setText(this.f66230c.getName());
            z = true;
        }
        if (!z) {
            this.mTvMusicName.setTextColor(this.f66229b.getResources().getColor(R.color.a2t));
            TextView textView = this.mTvMusicName;
            if (!TextUtils.isEmpty(this.f66230c.getName())) {
                str5 = this.f66230c.getName();
            } else {
                str5 = "";
            }
            textView.setText(str5);
        }
        if (TextUtils.isEmpty(this.f66230c.getName()) || !this.f66230c.isOriginal()) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        C37597b.f95893c.mo77114a(this.mTvMusicName, this.f66230c.getMusic(), true);
        TextView textView2 = this.mTvMusicSinger;
        if (TextUtils.isEmpty(this.f66230c.getSinger())) {
            str2 = this.f66229b.getString(R.string.f76);
        } else {
            str2 = this.f66230c.getSinger();
        }
        textView2.setText(str2);
        m60824a(this.mIvMusicCover, this.f66230c);
        if (this.f66230c.getMusicType() == MusicType.LOCAL) {
            str3 = this.f66230c.getLocalMusicDuration();
        } else {
            str3 = C47902fv.m103621a(this.f66230c.getPresenterDuration());
        }
        long userCount = (long) this.f66230c.getUserCount();
        if (userCount < 0) {
            str4 = "0";
        } else if (userCount < 10000) {
            str4 = String.valueOf(userCount);
        } else if (userCount < 1000000) {
            str4 = C24965e.m60743a(userCount, 1000, "K", "1000.0", "1.0M");
        } else if (userCount < 1000000000) {
            str4 = C24965e.m60743a(userCount, 1000000, "M", "1000.0", "1.0B");
        } else {
            str4 = C24965e.m60742a(userCount, 1000000000, "B");
        }
        this.mTvMusicDuration.setText(this.f66229b.getResources().getString(R.string.gt_, new Object[]{str3, str4}));
        int a = C10181b.m20511a().mo18168a(MusicSearchCardExperiment.class, true, "music_card_style", 31744, 0);
        if (a == 0 || a == 2) {
            this.mTvLyric.setVisibility(8);
        } else if (TextUtils.isEmpty(this.f66230c.getLyricShort())) {
            this.mTvLyric.setVisibility(8);
        } else {
            this.mTvLyric.setVisibility(0);
            TextView textView3 = this.mTvLyric;
            Context context = this.f66229b;
            String string = this.f66229b.getResources().getString(R.string.gs1, new Object[]{this.f66230c.getLyricShort()});
            List<Position> lyricShortPosition = this.f66230c.getLyricShortPosition();
            if (string == null) {
                string = "";
            }
            if (context == null || TextUtils.isEmpty(string) || C9376b.m18558a((Collection<T>) lyricShortPosition)) {
                spannableString = new SpannableString(string);
            } else {
                spannableString = new SpannableString(string);
                int color = context.getResources().getColor(R.color.b02);
                for (Position position : lyricShortPosition) {
                    if (position != null) {
                        int begin = position.getBegin() + 3;
                        int end = position.getEnd() + 3;
                        int max = Math.max(0, begin);
                        if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                            spannableString.setSpan(new ForegroundColorSpan(color), max, end, 17);
                        }
                    }
                }
            }
            textView3.setText(spannableString);
        }
    }
}
