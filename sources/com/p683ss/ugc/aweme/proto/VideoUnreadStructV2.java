package com.p683ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.VideoUnreadStructV2 */
public final class VideoUnreadStructV2 extends Message<VideoUnreadStructV2, Builder> {
    public static final ProtoAdapter<VideoUnreadStructV2> ADAPTER = new ProtoAdapter_VideoUnreadStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long latest_unread_video_created_time;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer unread_count;

    /* renamed from: com.ss.ugc.aweme.proto.VideoUnreadStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VideoUnreadStructV2, Builder> {
        public Long latest_unread_video_created_time;
        public Integer unread_count;

        public final VideoUnreadStructV2 build() {
            return new VideoUnreadStructV2(this.unread_count, this.latest_unread_video_created_time, super.buildUnknownFields());
        }

        public final Builder latest_unread_video_created_time(Long l) {
            this.latest_unread_video_created_time = l;
            return this;
        }

        public final Builder unread_count(Integer num) {
            this.unread_count = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoUnreadStructV2$ProtoAdapter_VideoUnreadStructV2 */
    static final class ProtoAdapter_VideoUnreadStructV2 extends ProtoAdapter<VideoUnreadStructV2> {
        public ProtoAdapter_VideoUnreadStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoUnreadStructV2.class);
        }

        public final int encodedSize(VideoUnreadStructV2 videoUnreadStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, videoUnreadStructV2.unread_count) + ProtoAdapter.INT64.encodedSizeWithTag(2, videoUnreadStructV2.latest_unread_video_created_time) + videoUnreadStructV2.unknownFields().size();
        }

        public final VideoUnreadStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.unread_count((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.latest_unread_video_created_time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, VideoUnreadStructV2 videoUnreadStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, videoUnreadStructV2.unread_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, videoUnreadStructV2.latest_unread_video_created_time);
            protoWriter.writeBytes(videoUnreadStructV2.unknownFields());
        }
    }

    public VideoUnreadStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.unread_count = this.unread_count;
        builder.latest_unread_video_created_time = this.latest_unread_video_created_time;
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
        if (this.unread_count != null) {
            i = this.unread_count.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.latest_unread_video_created_time != null) {
            i3 = this.latest_unread_video_created_time.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.unread_count != null) {
            sb.append(", unread_count=");
            sb.append(this.unread_count);
        }
        if (this.latest_unread_video_created_time != null) {
            sb.append(", latest_unread_video_created_time=");
            sb.append(this.latest_unread_video_created_time);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoUnreadStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoUnreadStructV2)) {
            return false;
        }
        VideoUnreadStructV2 videoUnreadStructV2 = (VideoUnreadStructV2) obj;
        if (!unknownFields().equals(videoUnreadStructV2.unknownFields()) || !Internal.equals(this.unread_count, videoUnreadStructV2.unread_count) || !Internal.equals(this.latest_unread_video_created_time, videoUnreadStructV2.latest_unread_video_created_time)) {
            return false;
        }
        return true;
    }

    public VideoUnreadStructV2(Integer num, Long l) {
        this(num, l, ByteString.EMPTY);
    }

    public VideoUnreadStructV2(Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unread_count = num;
        this.latest_unread_video_created_time = l;
    }
}
