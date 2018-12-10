package com.github.netty.protocol.rtsp;

import com.github.netty.core.AbstractChannelHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;

/**
     R:
     OPTIONS rtsp://192.168.1.152:554/cgi-bin/rtspStream/1 RTSP/1.0
     CSeq: 2
     User-Agent: LIVE555 Streaming Media v2012.01.13

     A:
     RTSP/1.0 200 OK
     CSeq: 2
     Date: Mon, Sep 24 2012 06:41:15 GMT
     Public: OPTIONS, DESCRIBE, SETUP, TEARDOWN, PLAY, PAUSE, GET_PARAMETER, SET_PARAMETER

     R:
     DESCRIBE rtsp://192.168.1.152:554/cgi-bin/rtspStream/1 RTSP/1.0
     CSeq: 3
     User-Agent: LIVE555 Streaming Media v2012.01.13
     Accept: application/sdp

     A:
     RTSP/1.0 200 OK
     CSeq: 3
     Date: Mon, Sep 24 2012 06:41:16 GMT
     Content-Base: rtsp://192.168.1.152:554/cgi-bin/rtspStream/1/
     Content-Type: application/sdp
     Content-Length: 409

     v=0
     o=- 1348468876053786 1 IN IP4 192.168.1.152
     s=Everfocus Media Server
     t=0 0
     c=IN IP4 0.0.0.0
     a=tool:Everfocus Streaming Media Apr 10 2012 v1.0.1
     a=type:broadcase
     a=control:*
     m=video 0 RTP/AVP 96
     a=framerate:25
     a=control:track1
     a=rtpmap:96 H264/90000
     a=fmtp:96 packetization-mode=1; profile-level-id=420020; sprop-parameter-sets=Z0IAIJWoFAHmQA==,aM48gA==
     m=audio 0 RTP/AVP 0
     a=control:track2

     R:
     SETUP rtsp://192.168.1.152:554/cgi-bin/rtspStream/1/track1 RTSP/1.0
     CSeq: 4
     User-Agent: LIVE555 Streaming Media v2012.01.13
     Transport: RTP/AVP;unicast;client_port=3370-3371

     A:
     RTSP/1.0 200 OK
     CSeq: 4
     Date: Mon, Sep 24 2012 06:41:16 GMT
     Transport: RTP/AVP;unicast;destination=192.168.1.153;source=192.168.1.152;client_port=3370-3371;server_port=6970-6971
     Session: 123009;timeout=120

     R:
     PLAY rtsp://192.168.1.152:554/cgi-bin/rtspStream/1/ RTSP/1.0
     CSeq: 5
     User-Agent: LIVE555 Streaming Media v2012.01.13
     Session: 123009
     Range: npt=0.000-

     A：
     RTP stream data ......

 * Created by acer01 on 2018/12/5/005.
 */
@ChannelHandler.Sharable
public class RtspServerChannelHandler extends AbstractChannelHandler<HttpRequest,Object> {
    @Override
    protected void onMessageReceived(ChannelHandlerContext ctx, HttpRequest msg) throws Exception {

    }

}
