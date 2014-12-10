play-web-sockets
================

Example using Web Sockets in Play! Framework 2.

You can test the app running at [http://www.websocket.org/echo.html](http://www.websocket.org/echo.html)

### String messages
Use the url **ws://localhost:9000/messages** to send and receive String messages.

### Json messages
Use the url **ws://localhost:9000/users** to send and receive Json messages with restricted format.

The server expect a json with the format:

```json
{
  "name": "some-name"
}
```

If the format is correct, the server will response something like this:

```json
{
  "id": 23,
  "name": "some-name"
}
```

Otherwise the connection will be closed.