

function select1() {
    alert('hellllloooooo my friend')

}
function sipInit() {
    SIPml.init(
        function (e) {
            var stack = new SIPml.Stack({
                realm: '192.168.1.130', impi: '1060', impu: 'sip:1060@192.168.1.130', password: 'password',websocket_proxy_url: 'wss://asterisk.indev:8089/ws',ice_servers: '[]',
                events_listener: {
                    events: 'started', listener: function (e) {
                        var callSession = stack.newSession('call-audio', {
                            audio_remote: document.getElementById('audio-remote')
                        });
                        callSession.call('alice');
                    }
                }
            });
            stack.start();
        }
    );
}
