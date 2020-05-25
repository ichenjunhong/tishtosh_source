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

/* renamed from: com.ss.ugc.aweme.proto.VideoReplyStructV2 */
public final class VideoReplyStructV2 extends Message<VideoReplyStructV2, Builder> {
    public static final ProtoAdapter<VideoReplyStructV2> ADAPTER = new ProtoAdapter_VideoReplyStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public Long alias_comment_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public Long aweme_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public Long comment_id;

    /* renamed from: com.ss.ugc.aweme.proto.VideoReplyStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VideoReplyStructV2, Builder> {
        public Long alias_comment_id;
        public Long aweme_id;
        public Long comment_id;

        public final VideoReplyStructV2 build() {
            return new VideoReplyStructV2(this.aweme_id, this.comment_id, this.alias_comment_id, super.buildUnknownFields());
        }

        public final Builder alias_comment_id(Long l) {
            this.alias_comment_id = l;
            return this;
        }

        public final Builder aweme_id(Long l) {
            this.aweme_id = l;
            return this;
        }

        public final Builder comment_id(Long l) {
            this.comment_id = l;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VideoReplyStructV2$ProtoAdapter_VideoReplyStructV2 */
    static final class ProtoAdapter_VideoReplyStructV2 extends ProtoAdapter<VideoReplyStructV2> {
        public ProtoAdapter_VideoReplyStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoReplyStructV2.class);
        }

        public final int encodedSize(VideoReplyStructV2 videoReplyStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, videoReplyStructV2.aweme_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, videoReplyStructV2.comment_id) + ProtoAdapter.INT64.encodedSizeWithTag(3, videoReplyStructV2.alias_comment_id) + videoReplyStructV2.unknownFields().size();
        }

        public final VideoReplyStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.aweme_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.comment_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.alias_comment_id((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VideoReplyStructV2 videoReplyStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, videoReplyStructV2.aweme_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, videoReplyStructV2.comment_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, videoReplyStructV2.alias_comment_id);
            protoWriter.writeBytes(videoReplyStructV2.unknownFields());
        }
    }

    public VideoReplyStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.aweme_id = this.aweme_id;
        builder.comment_id = this.comment_id;
        builder.alias_comment_id = this.alias_comment_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.aweme_id != null) {
            i = this.aweme_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.comment_id != null) {
            i2 = this.comment_id.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.alias_comment_id != null) {
            i4 = this.alias_comment_id.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.aweme_id != null) {
            sb.append(", aweme_id=");
            sb.append(this.aweme_id);
        }
        if (this.comment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.comment_id);
        }
        if (this.alias_comment_id != null) {
            sb.append(", alias_comment_id=");
            sb.append(this.alias_comment_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoReplyStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoReplyStructV2)) {
            return false;
        }
        VideoReplyStructV2 videoReplyStructV2 = (VideoReplyStructV2) obj;
        if (!unknownFields().equals(videoReplyStructV2.unknownFields()) || !Internal.equals(this.aweme_id, videoReplyStructV2.aweme_id) || !Internal.equals(this.comment_id, videoReplyStructV2.comment_id) || !Internal.equals(this.alias_comment_id, videoReplyStructV2.alias_comment_id)) {
            return false;
        }
        return true;
    }

    public VideoReplyStructV2(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public VideoReplyStructV2(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.aweme_id = l;
        this.comment_id = l2;
        this.alias_comment_id = l3;
    }
}
