package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_notification_newstyle_NoticeCollapsibility */
public final class C32848xd5542823 extends Message<C32848xd5542823, Builder> {
    public static final DefaultValueProtoAdapter<C32848xd5542823> ADAPTER = new C32849x1cadc4b();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 21290371)
    public final Integer cut_off_days;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 265701196)
    public final Integer extra_notice_count;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_notification_newstyle_NoticeCollapsibility$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32848xd5542823, Builder> {
        public Integer cut_off_days;
        public Integer extra_notice_count;

        public final C32848xd5542823 build() {
            return new C32848xd5542823(this.cut_off_days, this.extra_notice_count, super.buildUnknownFields());
        }

        public final Builder cut_off_days(Integer num) {
            this.cut_off_days = num;
            return this;
        }

        public final Builder extra_notice_count(Integer num) {
            this.extra_notice_count = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_notification_newstyle_NoticeCollapsibility$ProtoAdapter_com_ss_android_ugc_aweme_notification_newstyle_NoticeCollapsibility */
    static final class C32849x1cadc4b extends DefaultValueProtoAdapter<C32848xd5542823> {
        public final C32848xd5542823 redact(C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility) {
            return com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility;
        }

        public C32849x1cadc4b() {
            super(FieldEncoding.LENGTH_DELIMITED, C32848xd5542823.class);
        }

        public final C32848xd5542823 decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32848xd5542823) null);
        }

        public final int encodedSize(C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility) {
            return ProtoAdapter.INT32.encodedSizeWithTag(21290371, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.cut_off_days) + ProtoAdapter.INT32.encodedSizeWithTag(265701196, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.extra_notice_count) + com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 21290371, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.cut_off_days);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 265701196, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.extra_notice_count);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.unknownFields());
        }

        public final C32848xd5542823 decode(ProtoReader protoReader, C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility) throws IOException {
            Builder builder;
            C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility2 = (C32848xd5542823) C10617a.m21405a().mo18840a(C32848xd5542823.class, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility);
            if (com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility2 != null) {
                builder = com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 21290371) {
                    builder.cut_off_days((Integer) ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 265701196) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (C10618b e) {
                        if (com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.extra_notice_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }
    }

    public final Integer getCutOffDays() throws C10174a {
        if (this.cut_off_days != null) {
            return this.cut_off_days;
        }
        throw new C10174a();
    }

    public final Integer getExtraNoticeCount() throws C10174a {
        if (this.extra_notice_count != null) {
            return this.extra_notice_count;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cut_off_days = this.cut_off_days;
        builder.extra_notice_count = this.extra_notice_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.cut_off_days != null) {
            i = this.cut_off_days.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.extra_notice_count != null) {
            i3 = this.extra_notice_count.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cut_off_days != null) {
            sb.append(", cut_off_days=");
            sb.append(this.cut_off_days);
        }
        if (this.extra_notice_count != null) {
            sb.append(", extra_notice_count=");
            sb.append(this.extra_notice_count);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_notification_newstyle_NoticeCollapsibility{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32848xd5542823)) {
            return false;
        }
        C32848xd5542823 com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility = (C32848xd5542823) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.unknownFields()) || !Internal.equals(this.cut_off_days, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.cut_off_days) || !Internal.equals(this.extra_notice_count, com_ss_android_ugc_aweme_notification_newstyle_noticecollapsibility.extra_notice_count)) {
            return false;
        }
        return true;
    }

    public C32848xd5542823(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public C32848xd5542823(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cut_off_days = num;
        this.extra_notice_count = num2;
    }
}
