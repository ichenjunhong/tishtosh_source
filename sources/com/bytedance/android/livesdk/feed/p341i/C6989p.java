package com.bytedance.android.livesdk.feed.p341i;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C6792a;
import com.bytedance.android.livesdk.feed.feed.C6942c;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8753d;
import com.bytedance.android.livesdkapi.p450h.C8754e;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.i.p */
public final class C6989p extends C3923a<FeedItem> {

    /* renamed from: b */
    RecyclerView f19098b = ((RecyclerView) this.itemView.findViewById(R.id.d4x));

    /* renamed from: c */
    public List<FeedItem> f19099c;

    /* renamed from: d */
    public Context f19100d;

    /* renamed from: e */
    private C6792a f19101e;

    /* renamed from: com.bytedance.android.livesdk.feed.i.p$a */
    class C6991a extends C1322a<C3923a> {
        public final int getItemCount() {
            return C6989p.this.f19099c.size();
        }

        private C6991a() {
        }

        public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
            long j;
            String str;
            String str2;
            C3923a aVar = (C3923a) vVar;
            super.onViewAttachedToWindow(aVar);
            int position = aVar.getPosition();
            if (position >= 0 && position < C6989p.this.f19099c.size() && ((FeedItem) C6989p.this.f19099c.get(position)) != null && (((FeedItem) C6989p.this.f19099c.get(position)).item instanceof Room)) {
                Room room = (Room) ((FeedItem) C6989p.this.f19099c.get(position)).item;
                if (room.getOwner() == null) {
                    j = 0;
                } else {
                    j = room.getOwner().getId();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("log_pb", room.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(j));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("show_type", "stay");
                String str3 = "live_type";
                if (room.isLiveTypeAudio()) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put(str3, str);
                String str4 = "streaming_type";
                if (room.isThirdParty) {
                    str2 = "thirdparty";
                } else {
                    str2 = "general";
                }
                hashMap.put(str4, str2);
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "follow_live");
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "core");
                hashMap.put("event_module", CustomActionPushReceiver.f104061f);
                hashMap.put("action_type", "click");
                C7007b.m14648a("live_show", (Map<String, String>) hashMap);
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C6992b(R.layout.ajx, viewGroup, i);
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C3923a aVar = (C3923a) vVar;
            if (i >= 0 && i < C6989p.this.f19099c.size() && C6989p.this.f19099c.get(i) != null) {
                aVar.mo9280a(C6989p.this.f19099c.get(i), i);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.i.p$b */
    class C6992b extends C3923a<FeedItem> {

        /* renamed from: c */
        private HSImageView f19104c = ((HSImageView) this.itemView.findViewById(R.id.d4v));

        /* renamed from: d */
        private TextView f19105d = ((TextView) this.itemView.findViewById(R.id.d4y));

        /* renamed from: e */
        private View f19106e;

        /* renamed from: f */
        private C8753d f19107f;

        /* renamed from: g */
        private OnAttachStateChangeListener f19108g = new OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
            }
        };

        /* renamed from: c */
        public final void mo9282c() {
            super.mo9282c();
        }

        /* renamed from: d */
        public final void mo9283d() {
            super.mo9283d();
        }

        /* renamed from: a */
        public final /* synthetic */ void mo9280a(Object obj, int i) {
            FeedItem feedItem = (FeedItem) obj;
            if (feedItem != null && (feedItem.item instanceof Room)) {
                User owner = ((Room) feedItem.item).getOwner();
                if (owner != null) {
                    ImageModel avatarThumb = owner.getAvatarThumb();
                    if (avatarThumb != null && !C9414h.m18630a(avatarThumb.getUrls())) {
                        this.f19104c.setImageURI((String) avatarThumb.getUrls().get(0));
                    }
                    this.f19105d.setText(owner.getNickName());
                }
                this.f19104c.setVisibility(8);
                this.f19104c.setVisibility(0);
                this.f19107f = C6856b.m14400c().mo13041c().avatarBorderController();
                if (this.f19107f != null) {
                    this.f19104c.addOnAttachStateChangeListener(this.f19108g);
                }
                this.itemView.setOnClickListener(new C6995r(this, feedItem));
            }
        }

        C6992b(int i, ViewGroup viewGroup, int i2) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ajx, viewGroup, false));
            C8754e liveCircleView = C8830k.m17331e().mo13041c().liveCircleView(viewGroup.getContext());
            if (liveCircleView instanceof View) {
                this.f19106e = (View) liveCircleView;
                this.f19106e.setLayoutParams(this.itemView.findViewById(R.id.d4w).getLayoutParams());
                int b = (int) C9432q.m18687b(viewGroup.getContext(), 3.0f);
                this.f19106e.setPadding(b, b, b, b);
                ((FrameLayout) this.itemView.findViewById(R.id.d4f)).addView(this.f19106e, 0);
                this.itemView.findViewById(R.id.aqv).setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9280a(Object obj, int i) {
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem instanceof C6942c) {
            this.f19099c = ((C6942c) feedItem).f18998a;
            this.f19098b.setAdapter(new C6991a());
        }
    }

    public C6989p(View view, C6792a aVar) {
        super(view);
        this.f19100d = view.getContext();
        this.f19101e = aVar;
        this.f19098b.setLayoutManager(new SSLinearLayoutManager(this.f19100d, 0, false));
        this.f19098b.setOnTouchListener(new C6994q(this));
        this.f19101e.mo12921a(this.f19098b);
    }
}
