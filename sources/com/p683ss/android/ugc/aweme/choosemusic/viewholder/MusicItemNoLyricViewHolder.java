package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1981c.C37597b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.utils.C47902fv;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemNoLyricViewHolder */
public class MusicItemNoLyricViewHolder extends C1352v {

    /* renamed from: a */
    public MusicModel f66221a;

    /* renamed from: b */
    public int f66222b;

    /* renamed from: c */
    public boolean f66223c;

    /* renamed from: d */
    public boolean f66224d;

    /* renamed from: e */
    private Context f66225e;
    SmartImageView mIvMusicCover;
    public ImageView mIvMusicMark;
    ImageView mIvMusicMask2;
    ImageView mOriginalTag;
    TextView mTvMusicDuration;
    TextView mTvMusicName;
    TextView mTvMusicSinger;
    TextView mTvNotSupportLyric;

    public MusicItemNoLyricViewHolder(View view) {
        super(view);
        this.f66225e = view.getContext();
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    private static void m60820a(SmartImageView smartImageView, MusicModel musicModel) {
        smartImageView.post(new C25023c(musicModel, smartImageView));
    }

    /* renamed from: a */
    public void mo51006a(String str, boolean z) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(this.f66221a.getName())) {
            this.mTvMusicName.setText(this.f66221a.getName());
            z = true;
        }
        if (!z) {
            this.mTvMusicName.setTextColor(this.f66225e.getResources().getColor(R.color.a2t));
            TextView textView = this.mTvMusicName;
            if (!TextUtils.isEmpty(this.f66221a.getName())) {
                str3 = this.f66221a.getName();
            } else {
                str3 = "";
            }
            textView.setText(str3);
        }
        if (TextUtils.isEmpty(this.f66221a.getName()) || !this.f66221a.isOriginal()) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        C37597b.f95893c.mo77114a(this.mTvMusicName, this.f66221a.getMusic(), true);
        TextView textView2 = this.mTvMusicSinger;
        if (TextUtils.isEmpty(this.f66221a.getSinger())) {
            str2 = this.f66225e.getString(R.string.f76);
        } else {
            str2 = this.f66221a.getSinger();
        }
        textView2.setText(str2);
        m60820a(this.mIvMusicCover, this.f66221a);
        if (this.f66221a.getMusicType() == MusicType.LOCAL) {
            this.mTvMusicDuration.setText(this.f66221a.getLocalMusicDuration());
        } else {
            this.mTvMusicDuration.setText(C47902fv.m103621a(this.f66221a.getDuration()));
        }
        if (this.f66224d) {
            this.mTvMusicName.setTextColor(Color.parseColor("#73ffffff"));
            this.mTvMusicSinger.setTextColor(Color.parseColor("#40ffffff"));
            this.mTvMusicDuration.setTextColor(Color.parseColor("#40ffffff"));
            this.mIvMusicMask2.setVisibility(0);
            this.mTvNotSupportLyric.setTextColor(Color.parseColor("#40ffffff"));
        }
    }
}
