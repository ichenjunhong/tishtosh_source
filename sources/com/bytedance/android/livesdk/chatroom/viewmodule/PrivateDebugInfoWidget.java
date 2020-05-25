package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4189h;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.p521a.C9369a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

public final class PrivateDebugInfoWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    public TextView f17502a;

    /* renamed from: b */
    public TextView f17503b;

    /* renamed from: c */
    public TextView f17504c;

    /* renamed from: d */
    public Room f17505d;

    /* renamed from: e */
    public String f17506e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$a */
    static final class C6390a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivateDebugInfoWidget f17507a;

        C6390a(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f17507a = privateDebugInfoWidget;
        }

        public final void onClick(View view) {
            Room room = this.f17507a.f17505d;
            if (room == null) {
                C52711k.m112237a("room");
            }
            final String privateInfo = room.getPrivateInfo();
            new C8552a(this.f17507a.context, 1).mo15009c((CharSequence) privateInfo).mo15004b(2, (CharSequence) "Copy", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C6390a f17508a;

                {
                    this.f17508a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C9369a.m18549a(this.f17508a.f17507a.context, "", privateInfo);
                }
            }).mo15004b(3, (CharSequence) "Send", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C6390a f17510a;

                {
                    this.f17510a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        String str = "android.intent.extra.TEXT";
                        StringBuilder sb = new StringBuilder();
                        sb.append(privateInfo);
                        sb.append(10);
                        String str2 = this.f17510a.f17507a.f17506e;
                        if (str2 == null) {
                            C52711k.m112237a("streamInfoText");
                        }
                        sb.append(str2);
                        intent.putExtra(str, sb.toString());
                        intent.setType("text/plain");
                        this.f17510a.f17507a.context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }).mo15001b().show();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$b */
    static final class C6393b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivateDebugInfoWidget f17512a;

        C6393b(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f17512a = privateDebugInfoWidget;
        }

        public final void onClick(View view) {
            if (PrivateDebugInfoWidget.m13769a(this.f17512a).getVisibility() == 0) {
                PrivateDebugInfoWidget.m13769a(this.f17512a).setVisibility(8);
                PrivateDebugInfoWidget.m13770b(this.f17512a).setVisibility(8);
                PrivateDebugInfoWidget.m13771c(this.f17512a).setText(R.string.eyz);
                return;
            }
            PrivateDebugInfoWidget.m13769a(this.f17512a).setVisibility(0);
            PrivateDebugInfoWidget.m13770b(this.f17512a).setVisibility(0);
            PrivateDebugInfoWidget.m13771c(this.f17512a).setText(R.string.eyy);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$c */
    static final class C6394c<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C6394c f17513a = new C6394c();

        C6394c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C52711k.m112240b((Long) obj, "it");
            C2952b a = C4116c.m10249a(C4139d.class);
            C52711k.m112236a((Object) a, "ServiceManager.getServic…treamService::class.java)");
            C4189h livePlayController = ((C4139d) a).getLivePlayController();
            C52711k.m112236a((Object) livePlayController, "ServiceManager.getServic….java).livePlayController");
            JSONObject d = livePlayController.mo9625d();
            StringBuilder sb = new StringBuilder("推流SDK版本:");
            sb.append(d.optString("推流SDK版本:"));
            sb.append("\n推流设备机型:");
            sb.append(d.optString("推流设备机型:"));
            sb.append("\n推流系统版本号:");
            sb.append(d.optString("推流系统版本号:"));
            sb.append("\n宽:");
            sb.append(d.optString("width:"));
            sb.append(" 高:");
            sb.append(d.optString("height:"));
            sb.append("\n推流码率:");
            sb.append(d.optString("推流码率:"));
            sb.append("\n推流帧频:");
            sb.append(d.optString("推流帧频:"));
            sb.append("\n渲染帧频:");
            sb.append(d.optString("渲染帧频:"));
            sb.append("\n下载码率:");
            sb.append(d.optString("下载码率:"));
            sb.append("\n卡顿次数:");
            sb.append(d.optString("卡顿次数:"));
            sb.append("\n卡顿时长:");
            sb.append(d.optString("卡顿时长:"));
            sb.append("\n卡顿原因:");
            sb.append(d.optString("卡顿原因:"));
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget$d */
    static final class C6395d<T> implements C1710e<String> {

        /* renamed from: a */
        final /* synthetic */ PrivateDebugInfoWidget f17514a;

        C6395d(PrivateDebugInfoWidget privateDebugInfoWidget) {
            this.f17514a = privateDebugInfoWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            PrivateDebugInfoWidget.m13770b(this.f17514a).setText((String) obj);
        }
    }

    public final int getLayoutId() {
        return R.layout.ash;
    }

    public final void onUnload() {
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m13769a(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f17503b;
        if (textView == null) {
            C52711k.m112237a("remoteInfoView");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m13770b(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f17504c;
        if (textView == null) {
            C52711k.m112237a("streamInfoView");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m13771c(PrivateDebugInfoWidget privateDebugInfoWidget) {
        TextView textView = privateDebugInfoWidget.f17502a;
        if (textView == null) {
            C52711k.m112237a("buttonView");
        }
        return textView;
    }

    public final void onInit(Object[] objArr) {
        this.f17506e = "";
        View findViewById = this.contentView.findViewById(R.id.cb_);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.remote_info)");
        this.f17503b = (TextView) findViewById;
        View findViewById2 = this.contentView.findViewById(R.id.ctl);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.stream_info)");
        this.f17504c = (TextView) findViewById2;
        View findViewById3 = this.contentView.findViewById(R.id.pq);
        C52711k.m112236a((Object) findViewById3, "contentView.findViewById(R.id.button)");
        this.f17502a = (TextView) findViewById3;
        TextView textView = this.f17503b;
        if (textView == null) {
            C52711k.m112237a("remoteInfoView");
        }
        textView.setOnClickListener(new C6390a(this));
        this.contentView.findViewById(R.id.pq).setOnClickListener(new C6393b(this));
    }

    public final void onLoad(Object[] objArr) {
        Object obj = this.dataCenter.get("data_room", new Room());
        C52711k.m112236a(obj, "dataCenter.get(WidgetConstant.DATA_ROOM, Room())");
        this.f17505d = (Room) obj;
        TextView textView = this.f17503b;
        if (textView == null) {
            C52711k.m112237a("remoteInfoView");
        }
        Room room = this.f17505d;
        if (room == null) {
            C52711k.m112237a("room");
        }
        textView.setText(room.getPrivateInfo());
        ((C4002ac) C4585b.m11017a(0, 3, TimeUnit.SECONDS).mo6527b(Long.MAX_VALUE).mo6514a(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C6394c.f17513a).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9405a((C1710e<? super T>) new C6395d<Object>(this));
    }
}
