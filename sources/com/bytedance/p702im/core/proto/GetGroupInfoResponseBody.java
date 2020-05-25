package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.GetGroupInfoResponseBody */
public final class GetGroupInfoResponseBody extends Message<GetGroupInfoResponseBody, Builder> {
    public static final ProtoAdapter<GetGroupInfoResponseBody> ADAPTER = new ProtoAdapter_GetGroupInfoResponseBody();
    private static final long serialVersionUID = 0;
    public final GroupInfo group_info;

    /* renamed from: com.bytedance.im.core.proto.GetGroupInfoResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<GetGroupInfoResponseBody, Builder> {
        public GroupInfo group_info;

        public final GetGroupInfoResponseBody build() {
            return new GetGroupInfoResponseBody(this.group_info, super.buildUnknownFields());
        }

        public final Builder group_info(GroupInfo groupInfo) {
            this.group_info = groupInfo;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.GetGroupInfoResponseBody$ProtoAdapter_GetGroupInfoResponseBody */
    static final class ProtoAdapter_GetGroupInfoResponseBody extends ProtoAdapter<GetGroupInfoResponseBody> {
        public ProtoAdapter_GetGroupInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetGroupInfoResponseBody.class);
        }

        public final int encodedSize(GetGroupInfoResponseBody getGroupInfoResponseBody) {
            return GroupInfo.ADAPTER.encodedSizeWithTag(1, getGroupInfoResponseBody.group_info) + getGroupInfoResponseBody.unknownFields().size();
        }

        public final GetGroupInfoResponseBody redact(GetGroupInfoResponseBody getGroupInfoResponseBody) {
            Builder newBuilder = getGroupInfoResponseBody.newBuilder();
            if (newBuilder.group_info != null) {
                newBuilder.group_info = (GroupInfo) GroupInfo.ADAPTER.redact(newBuilder.group_info);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final GetGroupInfoResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.group_info((GroupInfo) GroupInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetGroupInfoResponseBody getGroupInfoResponseBody) throws IOException {
            GroupInfo.ADAPTER.encodeWithTag(protoWriter, 1, getGroupInfoResponseBody.group_info);
            protoWriter.writeBytes(getGroupInfoResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.group_info = this.group_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.group_info != null) {
            sb.append(", group_info=");
            sb.append(this.group_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetGroupInfoResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public GetGroupInfoResponseBody(GroupInfo groupInfo) {
        this(groupInfo, ByteString.EMPTY);
    }

    public GetGroupInfoResponseBody(GroupInfo groupInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_info = groupInfo;
    }
}
