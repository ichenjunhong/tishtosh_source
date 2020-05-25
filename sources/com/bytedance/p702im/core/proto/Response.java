package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.Response */
public final class Response extends Message<Response, Builder> {
    public static final ProtoAdapter<Response> ADAPTER = new ProtoAdapter_Response();
    public static final Integer DEFAULT_CMD = Integer.valueOf(0);
    public static final Integer DEFAULT_INBOX_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_SEQUENCE_ID = Long.valueOf(0);
    public static final Long DEFAULT_START_TIME_STAMP = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS_CODE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final ResponseBody body;
    public final Integer cmd;
    public final String error_desc;
    public final Map<String, String> headers;
    public final Integer inbox_type;
    public final String log_id;
    public final Long sequence_id;
    public final Long start_time_stamp;
    public final Integer status_code;

    /* renamed from: com.bytedance.im.core.proto.Response$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<Response, Builder> {
        public ResponseBody body;
        public Integer cmd;
        public String error_desc;
        public Map<String, String> headers = Internal.newMutableMap();
        public Integer inbox_type;
        public String log_id;
        public Long sequence_id;
        public Long start_time_stamp;
        public Integer status_code;

        public final Response build() {
            Response response = new Response(this.cmd, this.sequence_id, this.status_code, this.error_desc, this.inbox_type, this.body, this.log_id, this.headers, this.start_time_stamp, super.buildUnknownFields());
            return response;
        }

        public final Builder body(ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public final Builder cmd(Integer num) {
            this.cmd = num;
            return this;
        }

        public final Builder error_desc(String str) {
            this.error_desc = str;
            return this;
        }

        public final Builder inbox_type(Integer num) {
            this.inbox_type = num;
            return this;
        }

        public final Builder log_id(String str) {
            this.log_id = str;
            return this;
        }

        public final Builder sequence_id(Long l) {
            this.sequence_id = l;
            return this;
        }

        public final Builder start_time_stamp(Long l) {
            this.start_time_stamp = l;
            return this;
        }

        public final Builder status_code(Integer num) {
            this.status_code = num;
            return this;
        }

        public final Builder headers(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.headers = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.Response$ProtoAdapter_Response */
    static final class ProtoAdapter_Response extends ProtoAdapter<Response> {
        private final ProtoAdapter<Map<String, String>> headers;

        public ProtoAdapter_Response() {
            super(FieldEncoding.LENGTH_DELIMITED, Response.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.headers = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final Response redact(Response response) {
            Builder newBuilder = response.newBuilder();
            if (newBuilder.body != null) {
                newBuilder.body = (ResponseBody) ResponseBody.ADAPTER.redact(newBuilder.body);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(Response response) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, response.cmd) + ProtoAdapter.INT64.encodedSizeWithTag(2, response.sequence_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, response.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, response.error_desc) + ProtoAdapter.INT32.encodedSizeWithTag(5, response.inbox_type) + ResponseBody.ADAPTER.encodedSizeWithTag(6, response.body) + ProtoAdapter.STRING.encodedSizeWithTag(7, response.log_id) + this.headers.encodedSizeWithTag(8, response.headers) + ProtoAdapter.INT64.encodedSizeWithTag(9, response.start_time_stamp) + response.unknownFields().size();
        }

        public final Response decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.cmd((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.sequence_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.status_code((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.error_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.inbox_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 6:
                            builder.body((ResponseBody) ResponseBody.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.log_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.headers.putAll((Map) this.headers.decode(protoReader));
                            break;
                        case 9:
                            builder.start_time_stamp((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, Response response) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, response.cmd);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, response.sequence_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, response.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, response.error_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, response.inbox_type);
            ResponseBody.ADAPTER.encodeWithTag(protoWriter, 6, response.body);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, response.log_id);
            this.headers.encodeWithTag(protoWriter, 8, response.headers);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, response.start_time_stamp);
            protoWriter.writeBytes(response.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.cmd = this.cmd;
        builder.sequence_id = this.sequence_id;
        builder.status_code = this.status_code;
        builder.error_desc = this.error_desc;
        builder.inbox_type = this.inbox_type;
        builder.body = this.body;
        builder.log_id = this.log_id;
        builder.headers = Internal.copyOf("headers", this.headers);
        builder.start_time_stamp = this.start_time_stamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.error_desc != null) {
            sb.append(", error_desc=");
            sb.append(this.error_desc);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        if (this.log_id != null) {
            sb.append(", log_id=");
            sb.append(this.log_id);
        }
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.start_time_stamp != null) {
            sb.append(", start_time_stamp=");
            sb.append(this.start_time_stamp);
        }
        StringBuilder replace = sb.replace(0, 2, "Response{");
        replace.append('}');
        return replace.toString();
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l2) {
        this(num, l, num2, str, num3, responseBody, str2, map, l2, ByteString.EMPTY);
    }

    public Response(Integer num, Long l, Integer num2, String str, Integer num3, ResponseBody responseBody, String str2, Map<String, String> map, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cmd = num;
        this.sequence_id = l;
        this.status_code = num2;
        this.error_desc = str;
        this.inbox_type = num3;
        this.body = responseBody;
        this.log_id = str2;
        this.headers = Internal.immutableCopyOf("headers", map);
        this.start_time_stamp = l2;
    }
}
