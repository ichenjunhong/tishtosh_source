package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet;

import android.content.Context;
import android.graphics.PointF;
import android.support.p030v4.app.FragmentActivity;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9431p;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.comment_sticker.C25466b;
import com.p683ss.android.ugc.aweme.comment_sticker.C25467c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43558a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43560c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43568f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C46723c;
import com.p683ss.android.ugc.gamora.editor.EditCommentStickerState;
import com.p683ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.UUID;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet.a */
public final class C43551a extends C43560c implements C25466b {

    /* renamed from: a */
    public String f110210a;

    /* renamed from: b */
    public boolean f110211b;

    /* renamed from: x */
    private CommentVideoModel f110212x;

    /* renamed from: y */
    private EditCommentStickerViewModel f110213y;

    /* renamed from: f */
    public final int mo88733f() {
        return 4;
    }

    /* renamed from: g */
    public final int mo88734g() {
        return R.string.alg;
    }

    /* renamed from: c */
    public final boolean mo88730c() {
        if (this.f110212x != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo88732e() {
        super.mo88732e();
        this.f110212x = null;
    }

    /* renamed from: h */
    public final boolean mo88735h() {
        if (this.f110234k != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private static String m95635o() {
        StringBuilder sb = new StringBuilder("pi_start");
        sb.append(UUID.randomUUID().toString());
        sb.append("pi_end");
        return sb.toString();
    }

    /* renamed from: p */
    private boolean m95636p() {
        EditViewModel editViewModel = (EditViewModel) C48927d.m105736a((FragmentActivity) this.f110242s).mo96760a(EditViewModel.class);
        if (editViewModel == null) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = editViewModel.f123232e;
        if (videoPublishEditModel == null) {
            return false;
        }
        return videoPublishEditModel.mIsFromDraft;
    }

    /* renamed from: b */
    public final void mo88729b() {
        if (this.f110234k instanceof CommentStickerInteractView) {
            ((CommentStickerInteractView) this.f110234k).mo88707a(this.f110212x, (C25467c) null);
        }
    }

    /* renamed from: i */
    public final boolean mo88736i() {
        return ((EditCommentStickerState) this.f110213y.mo97464a((FragmentActivity) this.f110242s)).getInTimeEditView();
    }

    /* renamed from: d */
    public final InteractStickerStruct mo88731d() {
        if (!mo88730c() || this.f110234k == null) {
            return null;
        }
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(4);
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(m95657b(this.f110234k.getRotateAngle()));
        normalTrackTimeStamp.setScale(Float.valueOf(this.f110234k.getScale()));
        PointF a = mo88740a(this.f110234k.mo88863a(this.f110238o));
        normalTrackTimeStamp.setX(a.x);
        normalTrackTimeStamp.setY(a.y);
        normalTrackTimeStamp.setStartTime((float) this.f110212x.getStartTime());
        normalTrackTimeStamp.setEndTime((float) this.f110212x.getEndTime());
        PointF a2 = mo88740a(new PointF((float) this.f110234k.getContentViewWidth(), (float) this.f110234k.getContentViewHeight()));
        normalTrackTimeStamp.setWidth(a2.x);
        normalTrackTimeStamp.setHeight(a2.y);
        linkedList.add(normalTrackTimeStamp);
        C43568f.m95713a(interactStickerStruct, linkedList);
        HashMap hashMap = new HashMap();
        hashMap.put("comment_sticker_id", "0");
        interactStickerStruct.setAttr(C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34889b(hashMap));
        interactStickerStruct.setIndex(2);
        return interactStickerStruct;
    }

    /* renamed from: a */
    public final boolean mo88728a(InteractStickerBaseView interactStickerBaseView) {
        if (!(interactStickerBaseView instanceof CommentStickerInteractView)) {
            return false;
        }
        boolean a = super.mo88728a(interactStickerBaseView);
        this.f110212x = null;
        return a;
    }

    /* renamed from: a */
    public final InteractStickerBaseView mo88721a(Context context) {
        CommentStickerInteractView commentStickerInteractView = new CommentStickerInteractView(context);
        commentStickerInteractView.setLayoutParams(new LayoutParams(-1, -1));
        commentStickerInteractView.setController(this);
        commentStickerInteractView.setDumpData(this);
        commentStickerInteractView.setLockMode(true);
        return commentStickerInteractView;
    }

    /* renamed from: a */
    public final void mo88722a(long j) {
        if (this.f110234k instanceof CommentStickerInteractView) {
            ((CommentStickerInteractView) this.f110234k).setPlayPosition(j);
            if (this.f110211b) {
                ((CommentStickerInteractView) this.f110234k).mo88712c();
                return;
            }
            CommentStickerInteractView commentStickerInteractView = (CommentStickerInteractView) this.f110234k;
            if (commentStickerInteractView.f110205a.mo52074d()) {
                commentStickerInteractView.post(new C43556e(commentStickerInteractView));
            }
        }
    }

    /* renamed from: a */
    public final void mo88726a(String str) {
        if (!C9431p.m18664a(str)) {
            if (str.contains("pi_start") && str.contains("pi_end")) {
                super.mo88726a(str.replaceAll("pi_start(.*?)pi_end", m95635o()));
            } else if (str.endsWith(File.separator)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(m95635o());
                super.mo88726a(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m95635o());
                super.mo88726a(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo88727a(boolean z) {
        super.mo88727a(z);
        if ((this.f110234k instanceof CommentStickerInteractView) && !m95636p()) {
            ((CommentStickerInteractView) this.f110234k).mo88706a(this.f110231h, this.f110232i);
        }
    }

    /* renamed from: a */
    public final void mo88724a(CommentVideoModel commentVideoModel, boolean z) {
        this.f110212x = commentVideoModel;
        mo88727a(z);
    }

    /* renamed from: a */
    public final void mo88725a(InteractStickerStruct interactStickerStruct, CommentVideoModel commentVideoModel) {
        this.f110212x = commentVideoModel;
        if (!(interactStickerStruct == null || commentVideoModel == null)) {
            mo88724a(commentVideoModel, true);
            this.f110210a = (String) ((HashMap) C39629l.m88232a().mo58595z().getRetrofitFactoryGson().mo34885a(interactStickerStruct.getAttr(), new C17956a<HashMap<String, String>>() {
            }.f49843c)).get("comment_sticker_id");
        }
        ((CommentStickerInteractView) this.f110234k).mo88707a(commentVideoModel, (C25467c) new C43553b(this, interactStickerStruct));
    }

    /* renamed from: a */
    public final void mo88723a(Context context, C46723c cVar, FrameLayout frameLayout) {
        super.mo88723a(context, cVar, frameLayout);
        this.f110213y = (EditCommentStickerViewModel) C48927d.m105736a((FragmentActivity) this.f110242s).mo96760a(EditCommentStickerViewModel.class);
        this.f110211b = false;
    }

    /* renamed from: a */
    public final C0013i<C43558a> mo88720a(String str, int i, int i2, int i3, int i4) {
        if (this.f110234k instanceof CommentStickerInteractView) {
            ((CommentStickerInteractView) this.f110234k).mo88712c();
        }
        return mo88749b(str, i, i2, i3, i4).mo29c(new C43554c(this));
    }
}
