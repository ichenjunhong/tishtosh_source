package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView_ViewBinding */
public class MusicDragView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MusicDragView f109182a;

    /* renamed from: b */
    private View f109183b;

    public void unbind() {
        MusicDragView musicDragView = this.f109182a;
        if (musicDragView != null) {
            this.f109182a = null;
            musicDragView.mKTVView = null;
            musicDragView.mTextViewTimeStart = null;
            musicDragView.mTextViewTotalTime = null;
            musicDragView.cutMusicLayout = null;
            musicDragView.slideContainer = null;
            this.f109183b.setOnClickListener(null);
            this.f109183b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MusicDragView_ViewBinding(final MusicDragView musicDragView, View view) {
        this.f109182a = musicDragView;
        musicDragView.mKTVView = (KTVView) Utils.findRequiredViewAsType(view, R.id.b69, "field 'mKTVView'", KTVView.class);
        musicDragView.mTextViewTimeStart = (TextView) Utils.findRequiredViewAsType(view, R.id.dga, "field 'mTextViewTimeStart'", TextView.class);
        musicDragView.mTextViewTotalTime = (TextView) Utils.findRequiredViewAsType(view, R.id.d9w, "field 'mTextViewTotalTime'", TextView.class);
        musicDragView.cutMusicLayout = (DmtCutMusicLayout) Utils.findRequiredViewAsType(view, R.id.a31, "field 'cutMusicLayout'", DmtCutMusicLayout.class);
        musicDragView.slideContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.cp7, "field 'slideContainer'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.azt, "method 'next'");
        this.f109183b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                musicDragView.next();
            }
        });
        musicDragView.mTimeString = view.getContext().getResources().getString(R.string.e1k);
    }
}
